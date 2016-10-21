package com.rolando.practica5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCalcular;
    EditText txtGrados;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalcular = (Button) findViewById(R.id.bntCalcular);
        txtGrados = (EditText) findViewById(R.id.txtGrados);
        txtResultado = (TextView) findViewById(R.id.txtResultado);

        btnCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case R.id.bntCalcular:
            String strGrados = txtGrados.getText().toString().trim();

            if(!strGrados.isEmpty()){
                double gradosC = Double.parseDouble(strGrados);
                double gradosF = (gradosC * 1.8d) + 32d;
                double gradosK = gradosC + 273.15d;
                double gradosR = (gradosC * 1.8d) + 32d + 459.67d;
                txtResultado.setText("Celsius = "+gradosC+ "°C" + "\nFahrenheit = "+gradosF+"°F"+"\nKelvin = "+gradosK+"°K"+"\nRankine = "+gradosR+"°Ra");
                txtResultado.setVisibility(View.VISIBLE);
            }else{
                txtResultado.setText("Ingrese un valor en °C");
                txtResultado.setVisibility(View.VISIBLE);
            }
        }

    }
}
