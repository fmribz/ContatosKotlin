package com.example.cadastros.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.lang.StringBuilder

@Entity
data class Contato(val nome: String,
                   val email: String,
                   val fone: String,
                   @PrimaryKey(autoGenerate = true)
                   val id: Int = 0) {
    override fun toString(): String {
        val strB: StringBuilder = StringBuilder()
        strB.append("Nome: ")
        strB.append(nome)
        strB.append("\n")
        strB.append("Email: ")
        strB.append(email)
        strB.append("\n")
        strB.append("Fone: ")
        strB.append(fone)
        return strB.toString()
    }
}