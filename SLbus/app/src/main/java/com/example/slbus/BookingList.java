package com.example.slbus;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class BookingList extends AppCompatActivity {
    ListView myListView;
    ArrayList<String> myArrayList = new ArrayList<>();
    DatabaseReference mref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_list);

        ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_booking_list, myArrayList);

        myListView = findViewById(R.id.listview1);
        myListView.setAdapter(myArrayAdapter);

        mref = FirebaseDatabase.getInstance().getReference().child("Booking");

        mref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                myArrayList.clear();
                for (DataSnapshot snapshot1 : snapshot.getChildren()){
                    myArrayList.add(snapshot1.getValue().toString());
                }
                myArrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        }

        );
    }
}