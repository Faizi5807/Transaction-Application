package com.example.managetransactions;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ReviewInformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_information);

        FloatingActionButton fab = findViewById(R.id.fab_edit_sender);
        fab.setOnClickListener(v -> {
            Intent intent = new Intent(ReviewInformationActivity.this, SenderDetailsActivity.class);
            startActivity(intent);
        });

        // You can retrieve sender and receiver data from Intent Extras or ViewModel
    }
}

