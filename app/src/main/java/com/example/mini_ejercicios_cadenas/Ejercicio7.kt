package com.example.mini_ejercicios_cadenas

fun main(){
    val cadena="hola me llamo pepe y tu?"
    extraerCad(cadena)
}

fun extraerCad(cad:String){
    print(cad.substring(5))
}