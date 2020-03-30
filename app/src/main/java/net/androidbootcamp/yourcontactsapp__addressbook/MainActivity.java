package net.androidbootcamp.yourcontactsapp__addressbook;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instantiate Button classes Katera and Gordino
        Button btnKatera = (Button) findViewById(R.id.btnKatera);
        Button btnGordino = (Button) findViewById(R.id.btnGordino);

        //btnKatera
        btnKatera.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, Katera.class));
            }
        });

        //btnGordino
        btnGordino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, Gordino.class));
            }
        });
    }
}
