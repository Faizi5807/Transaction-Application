package com.example.managetransactions;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

public class ReceiverDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver_details);

        Button nextButton = findViewById(R.id.btn_next_receiver);
        nextButton.setOnClickListener(v -> {
            Intent intent = new Intent(ReceiverDetailsActivity.this, ReviewInformationActivity.class);
            startActivity(intent);
        });
    }
}

