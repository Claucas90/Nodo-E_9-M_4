package com.example.ejercicio9;

// MainActivity
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.ejercicio9.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.b1.setOnClickListener(clickView -> finish());

        binding.img1.setOnClickListener(clickView -> abrirImagen(R.drawable.imagen1, "uff el tocar la bateria te relaja"));
        binding.img2.setOnClickListener(clickView -> abrirImagen(R.drawable.imagen2, "Gran paisaje y futurista por lo demas"));
        binding.img3.setOnClickListener(clickView -> abrirImagen(R.drawable.imagen3, "Una de mis pasiones, la musica"));
        binding.img4.setOnClickListener(clickView -> abrirImagen(R.drawable.imagen4, "otra de mis pasiones la electronica"));
    }

    private void abrirImagen(int imagenSeleccionada, String descripcion) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("imagen", imagenSeleccionada);
        intent.putExtra("descripcion", descripcion);
        startActivity(intent);
    }
}
