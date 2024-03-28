package com.example.horoscope

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set click listeners for each horoscope image view
        setHoroscopeClickListener(R.id.libraImageView, "Libra")
        setHoroscopeClickListener(R.id.scorpioImageView, "Scorpio")
        setHoroscopeClickListener(R.id.geminiImageView, "Gemini")
        setHoroscopeClickListener(R.id.leoImageView, "Leo")
        setHoroscopeClickListener(R.id.cancerImageView, "Cancer")
        setHoroscopeClickListener(R.id.virgoImageView, "Virgo")
        setHoroscopeClickListener(R.id.ariesImageView, "Aries")
        setHoroscopeClickListener(R.id.taurusImageView, "Taurus")
    }

    private fun setHoroscopeClickListener(imageViewId: Int, horoscopeSign: String) {
        val imageView: View = findViewById(imageViewId)
        imageView.setOnClickListener {
            startHoroscopeActivity(horoscopeSign)
        }
    }

    private fun startHoroscopeActivity(horoscopeSign: String) {
        val intent = Intent(this@MainActivity, HoroscopeDetailActivity::class.java)
        intent.putExtra("horoscope_sign", horoscopeSign)
        startActivity(intent)
    }
}
