package com.infocontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class ConfirmacionDatos extends AppCompatActivity {

    private String nombre;
    private String telefono;
    private String email;
    private String descripcion;
    private String fecha;

    private TextView tvNombre;
    private TextView tvTelefono;
    private TextView tvEmail;
    private TextView tvDescripcion;
    private TextView tvFecha;
    private Button btnEditar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_datos);

        tvNombre = findViewById(R.id.tvNombre);
        tvTelefono = findViewById(R.id.tvTel);
        tvEmail = findViewById(R.id.tvEmail);
        tvDescripcion = findViewById(R.id.tvDescripcion);
        tvFecha = findViewById(R.id.tvFecha);
        btnEditar = findViewById(R.id.btnEditar);

        nombre = getIntent().getStringExtra("nombre");
        telefono = getIntent().getStringExtra("tel");
        email = getIntent().getStringExtra("email");
        descripcion = getIntent().getStringExtra("desc");
        fecha = getIntent().getStringExtra("fecha");

        tvNombre.setText(nombre);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
        tvDescripcion.setText(descripcion);
        tvFecha.setText(fecha);


        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }
}