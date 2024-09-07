package com.example.managetransactions;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

public class SenderDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender_details);

        Button nextButton = findViewById(R.id.btn_next_sender);
        nextButton.setOnClickListener(v -> {
            Intent intent = new Intent(SenderDetailsActivity.this, ReceiverDetailsActivity.class);
            startActivity(intent);
        });
    }
}

