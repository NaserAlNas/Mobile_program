package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        EditText editText = findViewById(R.id.txt_message);


        String message = editText.getText().toString();
        //Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
          Intent intent = new Intent( this,MessageActivity.class);
        intent.putExtra( "message",message);
        startActivity(intent);

    }

}