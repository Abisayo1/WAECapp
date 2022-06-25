package com.example.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.RecognizerIntent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import com.example.myapplication.databinding.ActivityTextToSpeechBinding
import java.util.*
import android.speech.tts.TextToSpeech
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_text_to_speech.*


class PlayGame : AppCompatActivity() {
        private lateinit var binding: ActivityTextToSpeechBinding
        private val model: BaseViewModel by viewModels()
        var scores = 0


        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityTextToSpeechBinding.inflate(layoutInflater)
            setContentView(binding.root)

            model.initial(textToSpeechEngine, startForResult)
            with(binding) {
                fabVoice.setOnClickListener { model.displaySpeechRecognizer() }

            }

            fabPlay.setOnClickListener {
                val score = findViewById<TextView>(R.id.score)
                if (edtText.text.toString().isEmpty()) {
                    Toast.makeText(this, "answer", Toast.LENGTH_SHORT).show()
                } else {
                    score.text = "$scores, ${edtText.text.toString()},"
                    if ("${edtText.text.toString()}".equals("${binding.question8.text}", ignoreCase = true)) {
                        scores = +1
                        score.text = "$scores"
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
    }
