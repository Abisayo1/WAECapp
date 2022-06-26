package com.example.myapplication

import android.app.Application
import android.content.Context
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.speech.RecognizerIntent
import android.speech.tts.TextToSpeech
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityTextToSpeechBinding
import kotlinx.android.synthetic.main.activity_text_to_speech.*
import java.util.*


class PlayGame : AppCompatActivity() {
        var mMediaPlayer: MediaPlayer? = null
        var counter = (0..4).random()
            private lateinit var binding: ActivityTextToSpeechBinding
        private val model: BaseViewModel by viewModels()
        var scores = 0


        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityTextToSpeechBinding.inflate(layoutInflater)
            setContentView(binding.root)


            val words = arrayOf<String>("Elephant", "Mango", "Television", "Chair", "Choir")
            val transcript = arrayOf<String>(
                "/ˈɛlɪf(ə)nt/",
                "/ˈmaŋɡəʊ/",
                "/ˈtɛlɪvɪʒ(ə)n,tɛlɪˈvɪʒ(ə)n/",
                "/tʃɛː/",
                "/ˈkwʌɪə/"
            )

            playSound()


            binding.question8.text =  words[counter]
            binding.question123.text = transcript[counter]//set the initial message.


            fun onClick() {
                counter = (0..4).random()
                val tx = binding.question8
                val xt = binding.question123
//                if (counter >= words.size) //counter = 0
                tx.text = words[counter] //set the new message.
                xt.text = transcript[counter]
            }


            model.initial(textToSpeechEngine, startForResult)
            with(binding) {
                fabVoice.setOnClickListener { model.displaySpeechRecognizer() }

            }

            edtText.addTextChangedListener(object : TextWatcher {

                override fun afterTextChanged(s: Editable) {}

                override fun beforeTextChanged(s: CharSequence, start: Int,
                                               count: Int, after: Int) {


                }

                override fun onTextChanged(s: CharSequence, start: Int,
                                           before: Int, count: Int) {

                   if (
                       count == 2
                   ) {edtText.text?.clear()
                    Toast.makeText(this@PlayGame, "Do not type, speak to the mic to win this level", Toast.LENGTH_SHORT).show()
                   }
                }
            })


            fabPlay.setOnClickListener {
                val score = binding.score
                if (edtText.text.toString().isEmpty()) {
                    Toast.makeText(this, "Pronounce the word to win points!", Toast.LENGTH_SHORT).show()
                }
                else {
                    if ("${edtText.text.toString()}".equals("${binding.question8.text}", ignoreCase = true)) {
                        scores++
                        Toast.makeText(this, "Well Done!", Toast.LENGTH_SHORT).show()
                        score.text = "$scores"
                        edtText.text?.clear()
                        onClick()

                    } else if("${edtText.text.toString()}" != "${binding.question8.text}") {
                        edtText.text?.clear()
                        Toast.makeText(this, "OOpse!", Toast.LENGTH_SHORT).show()
                        onClick()
                    }
                }
            }



        }

        private val startForResult = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) { result ->
            if (result.resultCode == RESULT_OK) {
                val spokenText: String? =
                    result.data?.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS)
                        .let { text -> text?.get(0) }
                binding.edtText.setText(spokenText)
            }
        }

        private val textToSpeechEngine: TextToSpeech by lazy {
            TextToSpeech(this) {
                if (it == TextToSpeech.SUCCESS) textToSpeechEngine.language = Locale("en-GB")
            }
        }



    // 1. Plays the water sound
    fun playSound() {
        if (mMediaPlayer == null) {
            mMediaPlayer = MediaPlayer.create(this, R.raw.game)
            mMediaPlayer!!.isLooping = true
            mMediaPlayer!!.start()
        } else mMediaPlayer!!.start()
    }

    // 2. Pause playback
    fun pauseSound() {
        if (mMediaPlayer?.isPlaying == true) mMediaPlayer?.pause()
    }

    // 3. Stops playback
    fun stopSound() {
        if (mMediaPlayer != null) {
            mMediaPlayer!!.stop()
            mMediaPlayer!!.release()
            mMediaPlayer = null
        }
    }

    // 4. Destroys the MediaPlayer instance when the app is closed
    override fun onStop() {
        super.onStop()
        if (mMediaPlayer != null) {
            mMediaPlayer!!.release()
            mMediaPlayer = null
        }
    }

    }
