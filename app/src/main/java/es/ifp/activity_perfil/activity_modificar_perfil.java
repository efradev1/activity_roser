package es.ifp.activity_perfil;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class activity_modificar_perfil extends AppCompatActivity {

    private static final int PICK_IMAGE_REQUEST =1 ;
    protected TextView label1;

    protected EditText editText1;
    protected EditText editText2;
    protected EditText editText3;
    protected EditText editText4;
    protected EditText editText5;
    protected EditText editText6;
    protected EditText editText7;
    protected EditText editText8;

    protected Button button1;
    protected Button button2;
    protected Button button3;

    protected ImageView imageView1;

    private String contenidoEditText1="";
    private String contenidoEditText2="";
    private String contenidoEditText3="";
    private String contenidoEditText4="";
    private String contenidoEditText5="";
    private String contenidoEditText6="";
    private String contenidoEditText7="";
    private String contenidoEditText8="";

    // protected BaseDatosUsuario db;

    private void openGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, PICK_IMAGE_REQUEST);
    }

    private boolean emailCorrecto(String email) {
        String expresionRegularEmail = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        return email.matches(expresionRegularEmail);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_perfil);

        editText1=(EditText) findViewById(R.id.editText1_modPerfil);
        editText2=(EditText) findViewById(R.id.editText2_modPerfil);
        editText3=(EditText) findViewById(R.id.editText3_modPerfil);
        editText4=(EditText) findViewById(R.id.editText4_modPerfil);
        editText5=(EditText) findViewById(R.id.editText5_modPerfil);
        editText6=(EditText) findViewById(R.id.editText6_modPerfil);
        editText7=(EditText) findViewById(R.id.editText7_modPerfil);
        editText8=(EditText) findViewById(R.id.editText8_modPerfil);

        button1=(Button) findViewById(R.id.button1_modPerfil);
        button2=(Button) findViewById(R.id.button2_modPerfil);
        button3=(Button) findViewById(R.id.button3_modPerfil);

        imageView1=(ImageView) findViewById(R.id.imageView1_modPerfil);

        // db= new BaseDatosUsuario(this );

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contenidoEditText1 = editText1.getText().toString();
                contenidoEditText2 = editText2.getText().toString();
                contenidoEditText3 = editText3.getText().toString();
                contenidoEditText4 = editText4.getText().toString();
                contenidoEditText5 = editText5.getText().toString();
                contenidoEditText6 = editText6.getText().toString();
                contenidoEditText7 = editText7.getText().toString();
                contenidoEditText8 = editText8.getText().toString();

                //1.NOMBRE
                if (contenidoEditText1.equals("")) {
                    Toast.makeText(activity_modificar_perfil.this, "Campo obligatorio", Toast.LENGTH_LONG).show();
                    //2.APELLIDOS
                } else if (contenidoEditText2.equals("")) {
                    Toast.makeText(activity_modificar_perfil.this, "Campo obligatorio", Toast.LENGTH_LONG).show();
                    //3.EMAIL
                } else if (contenidoEditText3.equals("")) {
                    Toast.makeText(activity_modificar_perfil.this, "Campo obligatorio", Toast.LENGTH_LONG).show();
                } else if (!emailCorrecto(contenidoEditText3)) {
                    Toast.makeText(activity_modificar_perfil.this, "Email no válido", Toast.LENGTH_LONG).show();
                    //4.TELEFONO
                } else if (contenidoEditText4.equals("")) {
                    Toast.makeText(activity_modificar_perfil.this, "Campo obligatorio", Toast.LENGTH_LONG).show();
                } else if (!TextUtils.isDigitsOnly(contenidoEditText4)) {
                    Toast.makeText(activity_modificar_perfil.this, "El teléfono solo admite números", Toast.LENGTH_SHORT).show();
                } else if (contenidoEditText4.length() != 9) {
                    Toast.makeText(activity_modificar_perfil.this, "Número incorrecto", Toast.LENGTH_SHORT).show();
                    //5.CODIGO POSTAL
                } else if (contenidoEditText5.equals("")) {
                    Toast.makeText(activity_modificar_perfil.this, "Campo obligatorio", Toast.LENGTH_LONG).show();
                } else if (!TextUtils.isDigitsOnly(contenidoEditText5)) {
                    Toast.makeText(activity_modificar_perfil.this, "Código postal solo admite números", Toast.LENGTH_SHORT).show();
                } else if (contenidoEditText5.length() != 5) {
                    Toast.makeText(activity_modificar_perfil.this, "El Código postal debe tener 5 números", Toast.LENGTH_SHORT).show();
                    //6.DIRECCION
                } else if (contenidoEditText6.equals("")) {
                    Toast.makeText(activity_modificar_perfil.this, "Campo obligatorio", Toast.LENGTH_LONG).show();
                    //7.CONTRASEÑA
                } else if (contenidoEditText7.equals("")) {
                    Toast.makeText(activity_modificar_perfil.this, "Campo obligatorio", Toast.LENGTH_LONG).show();
                    //8.REPITA CONTRASEÑA
                } else if (contenidoEditText8.equals("")) {
                    Toast.makeText(activity_modificar_perfil.this, "Campo obligatorio", Toast.LENGTH_LONG).show();
                } else if (!contenidoEditText8.equals(contenidoEditText7)) {
                    Toast.makeText(activity_modificar_perfil.this, "No coinciden", Toast.LENGTH_LONG).show();


                    button3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openGallery();
                        }
                    });


        /* GUARDAR DATOS
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(activity_modificar_perfil.this, "Redirigiendo", Toast.LENGTH_SHORT).show();
                Intent pasarPantalla= new Intent(activity_modificar_perfil.this, activity_perfil.class);
                finish();
                startActivity(pasarPantalla);
            }*/
        });

                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            Toast.makeText(activity_modificar_perfil.this, "Redirigiendo", Toast.LENGTH_SHORT).show();
                            Intent pasarPantalla = new Intent(activity_modificar_perfil.this, activity_perfil.class);
                            finish();
                            startActivity(pasarPantalla);
                        }
                    });



    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null) {
            Uri selectedImageUri = data.getData();

            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), selectedImageUri);
                imageView1.setImageBitmap(bitmap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }*/
    }