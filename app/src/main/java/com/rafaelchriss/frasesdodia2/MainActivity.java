package com.rafaelchriss.frasesdodia2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Atributo
    String[] frases  = {
            "Desenvolver é transformar ideias em soluções incríveis! 🚀",
            "No código, cada erro é uma oportunidade para aprender algo novo. 💡",
            "Desafios são o combustível para a evolução dos desenvolvedores. 🔥",
            "A programação é como arte: criatividade e lógica em perfeita harmonia. 🎨",
            "Construir é mais do que escrever código, é criar impacto no mundo. 🌍"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void gerarFrase(View view){

        TextView texto = findViewById(R.id.textResultado);
        int numeroAleatorio = new Random().nextInt(4);
        String frase = frases[numeroAleatorio];

        texto.setText(frase);
    }

    public void exibirTodas(View view){
        TextView texto = findViewById(R.id.textResultado);

        String textoResultado = "";
        for (String frase : frases ){
            textoResultado = textoResultado + frase + "\n";
        }
        texto.setText(textoResultado);

    }
}