package com.example.horoscope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class HoroscopeDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horoscope_detail)

        val horoscopeSign = intent.getStringExtra("horoscope_sign")

        val imageView: ImageView = findViewById(R.id.horoscopeImageView)
        val informationTextView: TextView = findViewById(R.id.informationTextView)

        // Set the image and information based on the horoscope sign
        when (horoscopeSign) {
            "Libra" -> {
                imageView.setImageResource(R.drawable.libra_image)
                informationTextView.text = getString(R.string.libra_information)
            }
            "Scorpio" -> {
                imageView.setImageResource(R.drawable.scorpio_image)
                informationTextView.text = getString(R.string.scorpio_information)
            }
            "Gemini" -> {
                imageView.setImageResource(R.drawable.gemini_image)
                informationTextView.text = getString(R.string.gemini_information)
            }
            "Leo" -> {
                imageView.setImageResource(R.drawable.leo_image)
                informationTextView.text = getString(R.string.leo_information)
            }
            "Cancer" -> {
                imageView.setImageResource(R.drawable.cancer_image)
                informationTextView.text = getString(R.string.cancer_information)
            }
            "Virgo" -> {
                imageView.setImageResource(R.drawable.virgo_image)
                informationTextView.text = getString(R.string.virgo_information)
            }
            "Aries" -> {
                imageView.setImageResource(R.drawable.aries_image)
                informationTextView.text = getString(R.string.aries_information)
            }
            "Taurus" -> {
                imageView.setImageResource(R.drawable.taurus_image)
                informationTextView.text = getString(R.string.taurus_information)
            }
            else -> {
                finish() // Close the activity if the horoscope sign is unknown
                return
            }
        }
    }

    fun onHoroscopeImageClick(view: View) {
        // Handle the click event, if needed
    }

}
