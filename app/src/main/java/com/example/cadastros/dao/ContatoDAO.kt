package com.example.cadastros.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.cadastros.model.Contato

@Dao
interface ContatoDAO {

    @Insert
    fun Inserir(c: Contato)

    @Query("SELECT * FROM Contato")
    fun Lista(): List<Contato>

    @Delete
    fun Deletar(c: Contato)
}