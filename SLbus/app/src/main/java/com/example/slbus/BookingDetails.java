package com.example.slbus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class BookingDetails extends AppCompatActivity {
    EditText etname, etnic, etcontact, etemail, etfrom, etto, ettime;
    TextView tvseatshow;
    Button btnNEXT;
    DatabaseReference reff;
    Booking booking;

    String seatno,from,to,time;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_details);

        etname = (EditText) findViewById(R.id.etname);
        etnic = (EditText) findViewById(R.id.etnic);
        etcontact = (EditText) findViewById(R.id.etcontact);
        etemail = (EditText) findViewById(R.id.etemail);
        tvseatshow = findViewById(R.id.tvseatshow);
        etfrom = findViewById(R.id.etfrom);
        etto = findViewById(R.id.etto);
        ettime = findViewById(R.id.ettime);
        Intent intent = getIntent();
        seatno = intent.getStringExtra("seat");
        tvseatshow.setText(seatno);
        from = intent.getStringExtra("from");
        etfrom.setText(from);
        to = intent.getStringExtra("to");
        etto.setText(to);
        time = intent.getStringExtra("time");
        ettime.setText(time);

        booking = new Booking();
        reff = FirebaseDatabase.getInstance().getReference().child("Booking");
        btnNEXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                booking.setName(etname.getText().toString().trim());
                booking.setNIC(etnic.getText().toString().trim());
                booking.setContact(etcontact.getText().toString().trim());
                booking.setEmail(etemail.getText().toString().trim());
                booking.setSeat(tvseatshow.getText().toString().trim());
                booking.setFrom(etfrom.getText().toString().trim());
                booking.setTo(etto.getText().toString().trim());
                booking.setTime(ettime.getText().toString().trim());

                reff.push().setValue(booking);
                // Toast.makeText(MainActivity.this, "Firebase Connection Success", Toast.LENGTH_SHORT).show();
            }
        });

    }


}