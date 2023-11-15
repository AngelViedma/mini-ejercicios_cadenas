package com.example.mini_ejercicios_cadenas

fun main(){
    val cadena="Hola juan, Hola pepe"
    remplazarConcurrencia(cadena)
}

fun remplazarConcurrencia(cad:String){
    print(cad.replace("Hola","adios"))
}