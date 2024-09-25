package com.example.a21actividad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre;
    private ImageView ivHolaInsanos;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.etNombre);
        ivHolaInsanos = findViewById(R.drawable.hola_insanos);
        btn = findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                explicito();
            }
        });
    }

    private void explicito() {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("nombre",etNombre.getText().toString());
        intent.putExtra("imagen",R.drawable.hola_insanos);
        startActivity(intent);
    }
}