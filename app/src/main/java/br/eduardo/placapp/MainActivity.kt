package br.eduardo.placapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btStart.setOnClickListener {
            val nextScreenIntent = Intent( this, GameActivity::class.java )
            nextScreenIntent.putExtra( "HOME", inputHome.text.toString() );
            nextScreenIntent.putExtra( "AWAY", inputAway.text.toString() );
            nextScreenIntent.putExtra( "START", btStart.text.toString() );
            startActivity( nextScreenIntent )
        }
    }
}
