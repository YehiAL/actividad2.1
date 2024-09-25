package com.example.a21actividad;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private TextView tvNombre;
    private ImageView ivFoto2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNombre = findViewById(R.id.tvNombre);
        ivFoto2 = findViewById(R.id.ivFoto2);

        String nombre = getIntent().getExtras().getString("nombre");
        int imagen = getIntent().getIntExtra("imagen",0);
        tvNombre.setText(nombre);
        ivFoto2.setImageResource(imagen);
    }
}