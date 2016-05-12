package com.example.ale.carsharing_university;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Registro extends AppCompatActivity {


    EditText nombre;
    String nombreString;

    EditText correo;
    String correoString;

    EditText telefono;
    String telefonoString;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        nombre = (EditText)findViewById(R.id.editText);
        nombreString = nombre.getText().toString();
        Button boton = (Button)findViewById(R.id.button5);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

       // ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.pueblos, android.R.layout.simple_spinner_item);
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spinner.setAdapter(adapter);


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre = (EditText)findViewById(R.id.editText);
                nombreString = nombre.getText().toString();
                getNombre();
                if (getNombre()){
                    Intent intent = new Intent(Registro.this, MensajeConfirmacion.class);
                    startActivity(intent);
                }
            }
        });
    }

    public boolean getNombre(){
        boolean aux = true;
        if (nombreString.isEmpty()){
            Toast.makeText(this, "Nombre no puede ser vacío",
                    Toast.LENGTH_LONG).show();
            aux = false;
        }
        return aux;
    }
}
