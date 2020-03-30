package com.example.cadastros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.cadastros.database.ContatoDatabase
import kotlinx.android.synthetic.main.activity_main.*
import com.example.cadastros.model.Contato

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSalvar.setOnClickListener{
            startActivity(Intent(this, Cadastro::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        CarregarLista()
    }

    private fun CarregarLista() {
        val dao = ContatoDatabase.getInstance(this).contatoDAO()

        val lista: List<Contato> = dao.Lista()

        val adapter = ArrayAdapter<Contato>(this, android.R.layout.simple_list_item_1, lista)
        lstContatos.adapter = adapter
    }
}
