package br.edu.ifpr.trabalhoquiz.entidades

import java.util.*

data class Usuario(
    var nome: String,
    var pontuacao: Int,
    var partidasJogadas: Int,
    var ultimaPartida: Date
)
