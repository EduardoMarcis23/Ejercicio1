package com.tallercmovil.ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputEditText;
import com.tallercmovil.ejercicio.model.Alumno;

import java.util.Calendar;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity
{

    Alumno alumno;
    EditText etNombre, etApellidos, etCuenta, etFecha;
    Spinner sPCarrera;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        desplegarPicker();

        etNombre = findViewById(R.id.etNombre);
        etApellidos = findViewById(R.id.etApellidos);
        etCuenta = findViewById(R.id.etCuenta);
        etFecha = findViewById(R.id.etFecha);
        sPCarrera = findViewById(R.id.sPCarrera);

        String[] carreras = {getString(R.string.civil),
                getString(R.string.minas),
                getString(R.string.electrica),
                getString(R.string.compu),
                getString(R.string.telecom),
                getString(R.string.geofisica),
                getString(R.string.geologica),
                getString(R.string.industrial),
                getString(R.string.mecanica),
                getString(R.string.petrolera),
                getString(R.string.mecatronica),
                getString(R.string.geomatica),
                getString(R.string.biomedicos),
                getString(R.string.ambiental),
                getString(R.string.aeroespacial)};

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item, carreras);

        sPCarrera.setAdapter(adapter);
    }

    public void clic(View view)
    {
        if (datos())
        {
            alumno = new Alumno(etNombre.getText().toString(), etApellidos.getText().toString(),
                    etCuenta.getText().toString(), etFecha.getText().toString(), sPCarrera.getSelectedItem().toString());

            datos();

            Intent intent = new Intent(MainActivity.this, Validada.class);

            Bundle bundle  = new Bundle();

            bundle.putSerializable("alumno",alumno);

            intent.putExtras(bundle);

            startActivity(intent);
        }

    }

    public boolean datos()
    {
        if(etNombre.getText().toString().equals(""))
        {
            etNombre.setError(getString(R.string.campo));
            return false;
        }

        if (etCuenta.getText().toString().length()<9)
        {
            etCuenta.setError(getString(R.string.campo));
            return false;
        }

        if (etApellidos.getText().toString().equals(""))
        {
            etApellidos.setError(getString(R.string.campo));
            return false;
        }

        if (etFecha.getText().toString().equals(""))
        {
            etFecha.setError(getString(R.string.campo));
            return false;
        }

        else
        {
            return true;
        }

    }

    public void desplegarPicker()
    {

        etFecha = findViewById(R.id.etFecha);

        etFecha.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Calendar calendario = Calendar.getInstance();
                int day = calendario.get(Calendar.DAY_OF_MONTH);
                int month = calendario.get(Calendar.MONTH);
                int year = calendario.get(Calendar.YEAR);

                final DatePickerDialog dpd = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener()
                {
                    @Override
                    public void onDateSet(DatePicker datePicker, int mYear, int mMonth, int mDay)
                    {
                        etFecha.setText(mDay+"/"+(mMonth+1)+"/"+mYear);
                    }
                }, day, month, year);

                dpd.show();
            }
        });
    }
}