package com.example.mini_ejercicios_cadenas

fun main(){
    val c1="hola"
    val c2="hola"

    print(comprobarCadena(c1,c2))

}

fun comprobarCadena(c1:String,c2:String):Boolean{
    return c1.equals(c2)
}