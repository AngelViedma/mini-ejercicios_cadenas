package com.example.mini_ejercicios_cadenas

fun main(){
    val c1="holaaa"
    val c2="holaa"
    print(compararCad(c1,c2))

}

fun compararCad(cad1:String,cad2:String):Int{
    return cad1.compareTo(cad2)
}

