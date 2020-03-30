package com.example.cadastros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.cadastros.R
import com.example.cadastros.database.ContatoDatabase
import com.example.cadastros.model.Contato
import kotlinx.android.synthetic.main.activity_cadastro.*

class Cadastro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mainmenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.itemSalvar){
            /*val contato = Contato(edtNome.text.toString(),
                                  edtEmail.text.toString(),
                                  edtFone.text.toString())

            val dao = ContatoDatabase.getInstance(this).contatoDAO()

            dao.Inserir(contato)*/

            Toast.makeText(this, "Contato salvo!", Toast.LENGTH_LONG).show()
            finish()
        }
        if(item.itemId == R.id.itemVoltar){
            Toast.makeText(this, "Voltando para a tela inicial", Toast.LENGTH_SHORT).show()
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}