package com.example.mini_ejercicios_cadenas

fun main(){
   val cadena="Hola juan, hola pedro"
    subcadenas(cadena)
}

fun subcadenas(cad:String){
    print(cad.split(" "))
}