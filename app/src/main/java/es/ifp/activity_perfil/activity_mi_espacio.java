package es.ifp.activity_perfil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class activity_mi_espacio extends AppCompatActivity {

    protected TextView label1;

    protected Button button1;
    protected Button button2;
    protected Button button3;
    protected Button button4;
    protected Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_espacio);

        button1=(Button) findViewById(R.id.button1_espacio);
        button2=(Button) findViewById(R.id.button2_espacio);
        button3=(Button) findViewById(R.id.button3_espacio);
        button4=(Button) findViewById(R.id.button4_espacio);
        button5=(Button) findViewById(R.id.button4_espacio);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(activity_mi_espacio.this, "Redirigiendo", Toast.LENGTH_SHORT).show();
                Intent pasarPantalla= new Intent(activity_mi_espacio.this, activity_perfil.class);
                finish();
                startActivity(pasarPantalla);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(activity_mi_espacio.this, "Redirigiendo", Toast.LENGTH_SHORT).show();
                Intent pasarPantalla= new Intent(activity_mi_espacio.this, activity_mis_vehiculos.class);
                finish();
                startActivity(pasarPantalla);
            }
        });

        /* HISTORIAL DE TRANSACCIONES OK
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(activity_mi_espacio.this, "Redirigiendo", Toast.LENGTH_SHORT).show();
                Intent pasarPantalla= new Intent(activity_mi_espacio.this, MisReservasActivity.class);
                finish();
                startActivity(pasarPantalla);
            }
        });*/

        /* CERRAR SESIÓN
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(activity_mi_espacio.this, "Redirigiendo", Toast.LENGTH_SHORT).show();
                Intent pasarPantalla= new Intent(activity_mi_espacio.this, InicioSesionActivity.class);
                finish();
                startActivity(pasarPantalla);
            }
        });*/

        /* VOLVER (AL MENU PRINICPAL) OK
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(activity_mi_espacio.this, "Redirigiendo", Toast.LENGTH_SHORT).show();
                Intent pasarPantalla= new Intent(activity_mi_espacio.this, MenuUsuarioActivity.class);
                finish();
                startActivity(pasarPantalla);
            }
        });*/




    }
}