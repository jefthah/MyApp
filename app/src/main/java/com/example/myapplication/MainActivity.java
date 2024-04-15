package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up the toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Makanan Favorite Saya");

        // Mendapatkan referensi ke elemen-elemen tampilan
        TextView foodNameTextView = findViewById(R.id.foodNameTextView);
        TextView foodOriginTextView = findViewById(R.id.foodOriginTextView);
        TextView foodPriceTextView = findViewById(R.id.foodPriceTextView);
        Button destinationButton = findViewById(R.id.destinationButton);

        // Parsing data makanan
        String foodName = "Wagyu Bakar"; // Ganti dengan data yang sebenarnya
        String foodOrigin = "dari luar"; // Ganti dengan data yang sebenarnya
        String foodPrice = "100k - 200k"; // Ganti dengan data yang sebenarnya

        // Set data makanan ke TextViews
        foodNameTextView.setText("Nama Makanan: " + foodName);
        foodOriginTextView.setText("Asal Makanan: " + foodOrigin);
        foodPriceTextView.setText("Harga Makanan: " + foodPrice);

        // Set up OnClickListener untuk destinationButton
        destinationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Buat objek Destination
                Destination destination = new Destination("Nama Destinasi", "Lokasi", "Deskripsi", R.drawable.swiss);

                // Intent untuk membuka DestinationActivity dan kirim objek Destination
                Intent intent = new Intent(MainActivity.this, DestinationActivity.class);
                intent.putExtra("destination", destination);
                startActivity(intent);
            }
        });
    }

}