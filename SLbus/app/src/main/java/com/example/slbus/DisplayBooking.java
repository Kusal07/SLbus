package com.example.slbus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class DisplayBooking extends AppCompatActivity {
    EditText txtname, txtnic, txtcontact, txtemail, txtseatno;
    Button btndisplay;
    DatabaseReference reff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_booking);
        txtname = findViewById(R.id.txtname);
        txtnic = findViewById(R.id.txtnic);
        txtcontact = findViewById(R.id.txtcontact);
        txtemail = findViewById(R.id.txtemail);
        txtseatno = findViewById(R.id.txtseatno);
        btndisplay = findViewById(R.id.btndisplay);

        btndisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reff = FirebaseDatabase.getInstance().getReference().child("Booking");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String name =snapshot.child("Name").getValue().toString();
                        String nic =snapshot.child("NIC").getValue().toString();
                        String contact =snapshot.child("Contact").getValue().toString();
                        String email =snapshot.child("Email").getValue().toString();
                        String seat =snapshot.child("Seat").getValue().toString();
                        txtname.setText(name);
                        txtnic.setText(nic);
                        txtcontact.setText(contact);
                        txtemail.setText(email);
                        txtseatno.setText(seat);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
    }
}