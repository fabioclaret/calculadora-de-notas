package com.android.modularfabiocalculodemedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nome, nota1, nota2, nota3, nota4;
    Button btnCalcular;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFormulario();

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n1 = Integer.parseInt(nota1.getText().toString());
                int n2 = Integer.parseInt(nota2.getText().toString());
                int n3 = Integer.parseInt(nota3.getText().toString());
                int n4 = Integer.parseInt(nota4.getText().toString());
                double media = (n1 + n2 + n3 + n4)/4;

                String nomeAluno = nome.getText().toString();

                if(media >= 6){
                    resultado.setText(nomeAluno + " voce foi APROVADO com Media Final " + media);
                    resultado.setTextColor(getColor(R.color.aprovado));
                }else{
                    resultado.setText(nomeAluno + " voce foi REPROVADO com Media Final " + media);
                    resultado.setTextColor(getColor(R.color.reprovado));
                }
            }
        });

    }

    private void initFormulario() {
        nome        = findViewById(R.id.editNome);
        nota1       = findViewById(R.id.editNota1);
        nota2       = findViewById(R.id.editNota2);
        nota3       = findViewById(R.id.editNota3);
        nota4       = findViewById(R.id.editNota4);
        btnCalcular = findViewById(R.id.btnCalcular);
        resultado   = findViewById(R.id.textResultado);
    }
}



