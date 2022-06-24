package com.example.alertdialogboxactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AppCompatButton btnClick,btnMuClick;
    String[] List = new String[4];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();
    }

    private void InitView() {
        btnClick = findViewById(R.id.btnClick);
        btnMuClick = findViewById(R.id.btnMuClick);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog();
            }
        });

        btnMuClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MultipleDialogue();
            }
        });

    }

    private void MultipleDialogue() {



    }

    private void OpenDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Login Alert");
        builder.setMessage("Are you sure you want to continue ?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(MainActivity.this, "Yes button clik", Toast.LENGTH_SHORT).show();

            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(MainActivity.this, "NO button clik", Toast.LENGTH_SHORT).show();


            }
        });

        AlertDialog d = builder.create();
        d.setCancelable(false);
        d.show();

    }
}