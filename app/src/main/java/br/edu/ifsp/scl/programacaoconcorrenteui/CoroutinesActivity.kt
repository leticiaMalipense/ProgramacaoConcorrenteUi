package br.edu.ifsp.scl.programacaoconcorrenteui

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_programacao_concorrente.*
import kotlinx.coroutines.*

class CoroutinesActivity : ProgramacaoConcorrenteActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "CoroutinesThread"
    }

    override fun run() {
        GlobalScope.launch(Dispatchers.Main) {
            println("Kotlin Coroutines World!")
            altaIv.setImageResource(R.drawable.android_preto)
            baixaIv.setImageResource(R.drawable.android_verde)
        }

    }

}
