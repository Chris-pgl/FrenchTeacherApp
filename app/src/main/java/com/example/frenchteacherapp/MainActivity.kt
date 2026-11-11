package com.example.frenchteacherapp

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var blackButton: Button
    lateinit var greenButton: Button
    lateinit var purpleButton: Button
    lateinit var redButton: Button
    lateinit var yellowButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        blackButton = findViewById(R.id.blackBtn)
        greenButton = findViewById(R.id.greenBtn)
        purpleButton = findViewById(R.id.purpleBtn)
        redButton = findViewById(R.id.redBtn)
        yellowButton = findViewById(R.id.yellowBtn)

        /* Fatto Grezzamente
        blackButton.setOnClickListener {
            MediaPlayer.create(this, R.raw.black).start()
        }

        greenButton.setOnClickListener {
            MediaPlayer.create(this,R.raw.green).start()
        }

        purpleButton.setOnClickListener {
            MediaPlayer.create(this, R.raw.purple).start()
        }

        redButton.setOnClickListener {
            MediaPlayer.create(this, R.raw.red).start()
        }

        yellowButton.setOnClickListener {
            MediaPlayer.create(this, R.raw.yellow).start()
        }
         */

        //fatto bene
        val buttons = listOf<Button>(
                    blackButton,
                    greenButton,
                    purpleButton,
                    redButton,
                    yellowButton
        )

        for (button in buttons) {
            button.setOnClickListener {
                if (button == blackButton) {
                    MediaPlayer.create(this, R.raw.black).start()
                } else if (button == greenButton) {
                    MediaPlayer.create(this, R.raw.green).start()
                } else if (button == purpleButton) {
                    MediaPlayer.create(this, R.raw.purple).start()
                } else if (button == redButton) {
                    MediaPlayer.create(this, R.raw.red).start()
                } else if (button == yellowButton) {
                    MediaPlayer.create(this, R.raw.yellow).start()
                }
            }
        }



    }



}