package com.example.myapplicationkootlin

/*

Author: Ing. Carlos Otero Ramírez

 */
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() , View.OnClickListener {

    private var objeto1 = AlumnoHereda("Ivan", " Vazquez.", 19, "Instituto Tecnológico De Merida.");

    private var button1:Button ?= null;
    private var button2:Button ?= null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.setTitle("Herencia");

        button1 = findViewById(R.id.AM1_id1);
        button1!!.setOnClickListener(this);

        button2 = findViewById(R.id.AM1_id2);
        button2!!.setOnClickListener(this);
    }

    fun dialogoAlerta(view: View?, mensaje: String){
        val builder = AlertDialog.Builder(this);
        builder.setTitle("Mensaje Informativo!");
        builder.setMessage(mensaje);
        builder.show();
    }

    override fun onClick(v: View?){
        when(v?.id) {
            R.id.AM1_id1 ->
                dialogoAlerta(null, objeto1.mostrarInformacion());
            R.id.AM1_id2 ->
                System.exit(0);
        }
    }
}