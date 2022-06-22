package com.example.dam2_examen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> planetas = new ArrayList<String>();
    ListView listpnta = null;
    ArrayAdapter adapter = null;
    Button ent1;
    Button ent2;
    Button ent3;
    Button ent4;
    Button ent5;
    Button ent6;
    Button ent7;
    Button ent8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ent1 = (Button) findViewById(R.id.bt1);
        ent2 = (Button) findViewById(R.id.bt2);
        ent3 = (Button) findViewById(R.id.bt3);
        ent4 = (Button) findViewById(R.id.bt4);
        ent5 = (Button) findViewById(R.id.bt5);
        ent6 = (Button) findViewById(R.id.bt6);
        ent7 = (Button) findViewById(R.id.bt7);
        ent8 = (Button) findViewById(R.id.bt8);

        planetas.add("Mercurio");
        planetas.add("Venus");
        planetas.add("Tierra");
        planetas.add("Marte");
        planetas.add("Jupiter");
        planetas.add("Saturno");
        planetas.add("Urano");
        planetas.add("Neptuno");

        listpnta = (ListView) findViewById(R.id.listplaneta);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, planetas);
        listpnta.setAdapter(adapter);

        ent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });

        ent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
            }
        });

        ent3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity4.class);
                startActivity(intent);
            }
        });

        ent4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity5.class);
                startActivity(intent);
            }
        });

        ent5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity6.class);
                startActivity(intent);
            }
        });

        ent6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity7.class);
                startActivity(intent);
            }
        });

        ent7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity8.class);
                startActivity(intent);
            }
        });

        ent8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity9.class);
                startActivity(intent);
            }
        });
    }
}