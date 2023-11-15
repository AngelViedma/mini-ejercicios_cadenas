package com.example.mini_ejercicios_cadenas

fun main(){
    val cadena="hOlA"
    todoMayus(cadena)
    todoMinus(cadena)
}

fun todoMayus(cad:String){
    println(cad.toUpperCase())
}

fun todoMinus(cad:String){
    println(cad.toLowerCase())
}