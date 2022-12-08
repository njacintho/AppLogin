package br.com.cellep.appcellephack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //executando uma ação após determinado tempo
        Handler(Looper.getMainLooper()).postDelayed({

            val mIntent = Intent(this, LoginActivity::class.java)

            startActivity(mIntent) // Intent é usada para abrir uma nova activity

            finish() //remove a tela da pilha

        }, 5000 // tempo em milisegundos

        )
    }
}