package com.infocontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

import java.text.DateFormat;

public class MainActivity extends AppCompatActivity {

    private EditText edtNombre;
    private EditText edtTelefono;
    private EditText edtEmail;
    private EditText edtDescripcion;
    private DatePicker dtpFecha;
    private Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNombre = findViewById(R.id.edtNombre);
        edtTelefono = findViewById(R.id.edtTelefono);
        edtEmail = findViewById(R.id.edtEmail);
        edtDescripcion = findViewById(R.id.edtDescripcion);
        dtpFecha = findViewById(R.id.dtpFecha);
        btnSiguiente = findViewById(R.id.btnSiguiente);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = edtNombre.getText().toString();
                String tel = edtTelefono.getText().toString();
                String email = edtEmail.getText().toString();
                String desc = edtDescripcion.getText().toString();
                String fecha = dtpFecha.getDayOfMonth() +"/"+dtpFecha.getMonth()+"/"+dtpFecha.getYear();

                if(nombre.isEmpty() || tel.isEmpty() || email.isEmpty() || desc.isEmpty() || fecha.isEmpty()){
                    Snackbar.make(view, R.string.campos_vacios, Snackbar.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this, ConfirmacionDatos.class);
                    intent.putExtra("nombre", nombre);
                    intent.putExtra("tel", tel);
                    intent.putExtra("email", email);
                    intent.putExtra("desc", desc);
                    intent.putExtra("fecha", fecha);
                    startActivity(intent);
                }
            }
        });

    }


}