package com.example.slbus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {
    EditText etname, etnic, etcontact, etemail;
    Button btnNEXT;
    DatabaseReference reff;
    Booking booking;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etname = (EditText)findViewById(R.id.etname);
        etnic = (EditText)findViewById(R.id.etnic);
        etcontact = (EditText)findViewById(R.id.etcontact);
        etemail = (EditText)findViewById(R.id.etemail);
        booking= new Booking();
        reff= FirebaseDatabase.getInstance().getReference().child("Booking");
        btnNEXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                booking.setName(etname.getText().toString().trim());
                booking.setNIC(etnic.getText().toString().trim());
                booking.setContact(etcontact.getText().toString().trim());
                booking.setEmail(etemail.getText().toString().trim());

                reff.push().setValue(booking);
               // Toast.makeText(MainActivity.this, "Firebase Connection Success", Toast.LENGTH_SHORT).show();
            }
        });

    }
}