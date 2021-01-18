package com.example.guessmynumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var start = 0
    var end = 100
    var centro = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val prompt = String.format(resources.getString(R.string.intro),start,end)
        textView.text = prompt
    }
    fun startGame(v: View) {
        start = 0
        end = 100
        v.isEnabled = false
        centro = (end+start)/2
        risultato.text = String.format(resources.getString(R.string.tentativo),centro)
    }
    fun clickUp(v: View) {
        start = centro
        centro = (end+start)/2
        risultato.text = String.format(resources.getString(R.string.tentativo),centro)
    }
    fun clickDown(v: View) {
        end = centro
        centro = (end+start)/2
        risultato.text = String.format(resources.getString(R.string.tentativo),centro)
    }
    fun clickOk(v: View) {
        risultato.text = resources.getString(R.string.pavone)
        buttonStart.isEnabled = true
    }
}