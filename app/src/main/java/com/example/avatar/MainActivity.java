package com.example.avatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextTextPersonName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
    }

    public void sendName(View view) {
        Intent intent = new Intent(this, SelectingLocations.class);
        String name = editTextTextPersonName.getText().toString();
        if (name.equals("")){
            System.out.println("Enter name!");
            Toast.makeText(MainActivity.this, R.string.no_user_input, Toast.LENGTH_LONG).show();
        }
        else {
            intent.putExtra("name", name);
            startActivity(intent);
        }

    }
}