package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar; // Tambahkan import untuk Toolbar

import com.example.myapplication.Destination;

public class DestinationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Destinasi Wisata");


        // Memperoleh referensi tombol kembali
        Button backButton = findViewById(R.id.buttonBack);

        // Menambahkan OnClickListener ke tombol kembali
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Memulai intent untuk kembali ke MainActivity
                Intent intent = new Intent(DestinationActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Menutup activity saat ini (DestinationActivity)
            }
        });

        // Di onCreate() atau di metode lainnya
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("destination")) {
            Destination destination = intent.getParcelableExtra("destination");
            if (destination != null) {
                // Gunakan objek Destination untuk mengatur tampilan
            }
        }
    }
}
