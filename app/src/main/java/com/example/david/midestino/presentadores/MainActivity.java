package com.example.david.midestino.presentadores;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.david.midestino.R;

//1) Nuestra clase main, extiende de App, que extiende de otras clases hasta llegar a la madre de todas los objetos java.lang.object
public class MainActivity extends AppCompatActivity {

    private EditText mCampoNombre;
    private Button mBotonInicio;

    //1) Sobreescribe al metodo de la clase que hereda
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1) La entrada del nomnbre
        mCampoNombre = (EditText)findViewById(R.id.nombreEditText);
        mBotonInicio = (Button)findViewById(R.id.inicioButton);

        //1) Creamos el botón del incio
        mBotonInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Obtenemos el nombre de usuario, busca en google get text from edit text
                String nombre = mCampoNombre.getText().toString();
                //Haz un toast del nombre, cambia el contexto al scope principal
                Toast.makeText(MainActivity.this, nombre, Toast.LENGTH_SHORT).show();
                //Ahora crea un nuevo activity que se llame SecundarioActivity, luego crea un metodo llamado startStory
                startStory(nombre);
            }
        });
    }

    //2) En este metodo crearemos el enlace y pasaremos el nombre
    private void startStory(String nombre) {
        //Creamos una intención
        Intent intent = new Intent(this, SecundarioActivity.class);
        // 2) Luego le pasamos el nombre por parametro, al ser dos scopes distintos, pueden llamarse igual
        intent.putExtra(getString(R.string.key_name), nombre);
        //E iniciamos el nuevo activity con esa intención
        startActivity(intent);
    }

}

