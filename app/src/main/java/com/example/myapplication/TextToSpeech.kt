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
import androidx.annotation.RequiresApi


class TextToSpeech : AppCompatActivity() {
        private lateinit var binding: ActivityTextToSpeechBinding
        private val model: BaseViewModel by viewModels()

        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityTextToSpeechBinding.inflate(layoutInflater)
            setContentView(binding.root)
            model.initial(textToSpeechEngine, startForResult)
            with(binding) {
                fabVoice.setOnClickListener { model.displaySpeechRecognizer() }
                fabPlay.setOnClickListener {
                    val text = edtText.text?.trim().toString()
                    model.speak(if (text.isNotEmpty()) text else "Text tidak boleh kosong")
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
