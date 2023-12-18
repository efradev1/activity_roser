package es.ifp.activity_perfil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class activity_perfil extends AppCompatActivity {

    protected Button button1;
    protected Button button2;
    protected Button button3;

    protected ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        imageView1=(ImageView) findViewById(R.id.imageView1_perfil);

        button1=(Button) findViewById(R.id.button1_perfil);
        button2=(Button) findViewById(R.id.button2_perfil);
        button3=(Button) findViewById(R.id.button3_perfil);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(activity_perfil.this, "Redirigiendo", Toast.LENGTH_SHORT).show();
                Intent pasarPantalla= new Intent(activity_perfil.this, activity_modificar_perfil.class);
                finish();
                startActivity(pasarPantalla);
            }
        });

        /* INICIO OK
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(activity_perfil.this, "Redirigiendo", Toast.LENGTH_SHORT).show();
                Intent pasarPantalla= new Intent(activity_perfil.this, MenuUsuarioActivity.class);
                finish();
                startActivity(pasarPantalla);
            }
        });*/

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(activity_perfil.this, "Redirigiendo", Toast.LENGTH_SHORT).show();
                Intent pasarPantalla= new Intent(activity_perfil.this, activity_mi_espacio.class);
                finish();
                startActivity(pasarPantalla);
            }
        });

    }
}