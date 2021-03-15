package com.example.datastorage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import java.util.concurrent.Executor;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
         super.onOptionsItemSelected(item);
         switch (item.getItemId()) {
             case R.id.settings:
                 Log.i("Item Selected", "Setting");
                 return true;
             case R.id.help:
                 Log.i("Item Selected", "Help");
                 return true;
             default :
                 return false;
         }
    }

    Button btn1;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


           btn1=(Button)findViewById(R.id.Alert);
        Toast.makeText(this,"MainActivity: on Create()",Toast.LENGTH_SHORT).show();
        btn1.setOnClickListener((v -> {
            Intent intent=new Intent(MainActivity.this,AlertDemo.class);
            startActivity(intent);
        }));

System.out.println("This is our first commit");

        System.out.println("This is our third commit");
System.out.println("fddg");
System.out.println("jjfjgjfgjfgj");

        System.out.println("This is a change in a experimental branch");
        System.out.println("This is an youtube branch");
        System.out.println("This is changed in main branch");


        System.out.println("youtube branch Changed occured");
        System.out.println("This line will bne merged");
        System.out.println("finally saved data sucessfully");
    }
}