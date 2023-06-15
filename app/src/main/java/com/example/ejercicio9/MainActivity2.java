package com.example.ejercicio9;

// MainActivity2
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private ImageView imgAmpliada;
    private TextView txtDescripcion;
    private Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Ocultar la barra de título y hacer la actividad de pantalla completa
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main2);

        imgAmpliada = findViewById(R.id.imgAmpliada);
        txtDescripcion = findViewById(R.id.txtDescripcion);
        btnVolver = findViewById(R.id.btnVolver);

        // Obtener la información de la imagen y descripción del intent
        int imagen = getIntent().getIntExtra("imagen", 0);
        String descripcion = getIntent().getStringExtra("descripcion");

        // Mostrar la imagen ampliada y descripción en los elementos correspondientes
        imgAmpliada.setImageResource(imagen);
        txtDescripcion.setText(descripcion);

        // Configurar el clic en el botón "Volver" para cerrar la actividad
        btnVolver.setOnClickListener(clickView -> finish());
    }
}
