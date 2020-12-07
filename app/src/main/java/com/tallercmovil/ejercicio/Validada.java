package com.tallercmovil.ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import com.tallercmovil.ejercicio.model.Alumno;

public class Validada extends AppCompatActivity
{

    EditText etNombreG, etApellidosG, etCuentaG, etFechaG, etCarreraG;
    ImageView ivCarrera;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validada);

        etNombreG = findViewById(R.id.etNombreG);
        etApellidosG = findViewById(R.id.etApellidosG);
        etCuentaG = findViewById(R.id.etCuentaG);
        etFechaG = findViewById(R.id.etFechaG);
        etCarreraG = findViewById(R.id.etCarreraG);
        ivCarrera = findViewById(R.id.ivCarrera);

        Alumno alumno;

        Bundle bundle = getIntent().getExtras();

        if (bundle != null)
        {
           // nombre = bundle.getString("nombre","");
            alumno = (Alumno) bundle.getSerializable("alumno");

            //Toast.makeText(this,"El nombre es "+ nombre,Toast.LENGTH_LONG).show();
            //Toast.makeText(this,"El nombre es "+ alumno.getNombre(),Toast.LENGTH_LONG).show();

            etNombreG.setText(alumno.getNombre());
            etApellidosG.setText(alumno.getApellidos());
            etCuentaG.setText(alumno.getNoCuenta());
            etFechaG.setText(alumno.getFechaNacimiento());
            etCarreraG.setText(alumno.getCarrera());

            if(alumno.getCarrera().equals(getString(R.string.civil)))
            {
                ivCarrera.setImageResource(R.drawable.civil);
            }

            if(alumno.getCarrera().equals(getString(R.string.minas)))
            {
                ivCarrera.setImageResource(R.drawable.minas);
            }

            if(alumno.getCarrera().equals(getString(R.string.electrica)))
            {
                ivCarrera.setImageResource(R.drawable.electrica);
            }

            if(alumno.getCarrera().equals(getString(R.string.compu)))
            {
                ivCarrera.setImageResource(R.drawable.compu);
            }

            if(alumno.getCarrera().equals(getString(R.string.telecom)))
            {
                ivCarrera.setImageResource(R.drawable.telecom);
            }

            if(alumno.getCarrera().equals(getString(R.string.geofisica)))
            {
                ivCarrera.setImageResource(R.drawable.geofisica);
            }

            if(alumno.getCarrera().equals(getString(R.string.geologica)))
            {
                ivCarrera.setImageResource(R.drawable.geologica);
            }

            if(alumno.getCarrera().equals(getString(R.string.industrial)))
            {
                ivCarrera.setImageResource(R.drawable.industrial);
            }

            if(alumno.getCarrera().equals(getString(R.string.mecanica)))
            {
                ivCarrera.setImageResource(R.drawable.mecanica);
            }

            if(alumno.getCarrera().equals(getString(R.string.petrolera)))
            {
                ivCarrera.setImageResource(R.drawable.petrolera);
            }

            if(alumno.getCarrera().equals(getString(R.string.mecatronica)))
            {
                ivCarrera.setImageResource(R.drawable.mecatronica);
            }

            if(alumno.getCarrera().equals(getString(R.string.geomatica)))
            {
                ivCarrera.setImageResource(R.drawable.geomatica);
            }

            if(alumno.getCarrera().equals(getString(R.string.biomedicos)))
            {
                ivCarrera.setImageResource(R.drawable.biomedicos);
            }

            if(alumno.getCarrera().equals(getString(R.string.ambiental)))
            {
                ivCarrera.setImageResource(R.drawable.ambiental);
            }

            if(alumno.getCarrera().equals(getString(R.string.aeroespacial)))
            {
                ivCarrera.setImageResource(R.drawable.espacial);
            }
        }
    }
}