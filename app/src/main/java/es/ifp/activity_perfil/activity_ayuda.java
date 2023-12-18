package es.ifp.activity_perfil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class activity_ayuda extends AppCompatActivity {

    protected TextView label1;
    protected TextView label2;
    protected TextView label3;
    protected TextView label4;
    protected TextView label5;
    protected TextView label6;
    protected TextView label7;
    protected TextView label8;
    protected TextView label9;
    protected TextView label10;
    protected Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda);

        button1=(Button) findViewById(R.id.button1_ayuda);

        /* VOLVER
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(activity_ayuda.this, "Redirigiendo", Toast.LENGTH_SHORT).show();
                Intent pasarPantalla= new Intent(activity_ayuda.this, MenuUsuarioActivity.class);
                finish();
                startActivity(pasarPantalla);
            }
        });*/


    }
}