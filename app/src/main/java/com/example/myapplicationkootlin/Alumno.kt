package com.example.myapplicationkootlin

open class Alumno {

    private var nombre:String = "";
    private var apellidos:String = "";
    private var edad:Int = 0;
    private var escuela:String = "";

    constructor(nombre:String, apellidos:String, edad:Int, escuela:String){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.escuela = escuela
    }

    fun getNombre():String {
        return nombre;
    }

    fun getApellidos():String {
        return apellidos;
    }

    fun getEdad():Int {
        return edad;
    }

    fun getEscuela():String {
        return escuela;
    }
}