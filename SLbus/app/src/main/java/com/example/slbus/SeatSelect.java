package com.example.slbus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SeatSelect extends AppCompatActivity {
    TextView tvseatshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_select);

        tvseatshow = findViewById(R.id.tvseatshow);

    }

    public void one(View view){
        tvseatshow.setText("1");
        Intent intent = new Intent(this, BookingDetails.class);

        String seat = tvseatshow.getText().toString();

        intent.putExtra("seat",seat);
        startActivity(intent);
    }
    public void two(View view){
        tvseatshow.setText("2");
        Intent intent = new Intent(this, BookingDetails.class);

        String seat = tvseatshow.getText().toString();

        intent.putExtra("seat",seat);
        startActivity(intent);
    }
    public void three(View view){
        tvseatshow.setText("3");
        Intent intent = new Intent(this, BookingDetails.class);

        String seat = tvseatshow.getText().toString();

        intent.putExtra("seat",seat);
        startActivity(intent);
    }
    public void four(View view){
        tvseatshow.setText("4");
        Intent intent = new Intent(this, BookingDetails.class);

        String seat = tvseatshow.getText().toString();

        intent.putExtra("seat",seat);
        startActivity(intent);
    }
    public void five(View view){
        tvseatshow.setText("5");
        Intent intent = new Intent(this, BookingDetails.class);

        String seat = tvseatshow.getText().toString();

        intent.putExtra("seat",seat);
        startActivity(intent);
    }
    public void six(View view){
        tvseatshow.setText("6");
        Intent intent = new Intent(this, BookingDetails.class);

        String seat = tvseatshow.getText().toString();

        intent.putExtra("seat",seat);
        startActivity(intent);
    }
    public void seven(View view){
        tvseatshow.setText("7");
        Intent intent = new Intent(this, BookingDetails.class);

        String seat = tvseatshow.getText().toString();

        intent.putExtra("seat",seat);
        startActivity(intent);
    }
    public void eight(View view){
        tvseatshow.setText("8");
        Intent intent = new Intent(this, BookingDetails.class);

        String seat = tvseatshow.getText().toString();

        intent.putExtra("seat",seat);
        startActivity(intent);
    }
    public void nine(View view){
        tvseatshow.setText("9");
        Intent intent = new Intent(this, BookingDetails.class);

        String seat = tvseatshow.getText().toString();

        intent.putExtra("seat",seat);
        startActivity(intent);
    }
    public void ten(View view){
        tvseatshow.setText("10");
        Intent intent = new Intent(this, BookingDetails.class);

        String seat = tvseatshow.getText().toString();

        intent.putExtra("seat",seat);
        startActivity(intent);
    }

}