package com.example.myapplicationkootlin

class AlumnoHereda: Alumno {

    constructor(nombre:String, apellidos:String, edad:Int, escuela:String) : super(nombre, apellidos, edad, escuela);

    fun mostrarInformacion():String {
        return "Nombre: " + getNombre() + "\n" + "Apellidos: " + getApellidos() + "\n" + "Edad: " + getEdad() + "\n" + "Escuela: " + getEscuela();
    }
}