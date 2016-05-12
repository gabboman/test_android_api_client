package com.example.ale.carsharing_university;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Primero borramos el archivo para poder crear el nuevo

        File fichero = new File("pueblos.xml");

        if (fichero.delete()){
            System.out.print("Fichero pueblos borrado");
        }else{
            System.out.print("No se puede borrar el fichero pueblos");
        }
        /*
        //Creación archivo xml pueblos
        try {

            OutputStreamWriter pueblos = new OutputStreamWriter(openFileOutput("pueblos.xml", Context.BIND_AUTO_CREATE));

            StringBuilder pueblo = new StringBuilder();

        //Construimos el XML

            pueblo.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<resources>\n" +
                "    <string-array name=\"pueblos\">\n" +
                "        <item>Los Palacios</item>\n" +
                "        <item>Utrera</item>\n" +
                "    </string-array>\n" +
                "</resources>");

        //Escribimos el resultado a un fichero

            pueblos.write(pueblo.toString());
            pueblos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        setContentView(R.layout.activity_main);
        Button boton = (Button)findViewById(R.id.button);
        Button boton2 = (Button)findViewById(R.id.button2);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Filtro.class);
                startActivity(intent);
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
    public static void invokeMiActivity(Activity activity){
        String actionName = "android.intent.action.MAIN";
        Intent intent = new Intent(actionName);
        activity.startActivity(intent);
    }
}
