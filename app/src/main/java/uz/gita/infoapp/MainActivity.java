package uz.gita.infoapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // set codes and go to Info Activity
        findViewById(R.id.general_information).setOnClickListener(view -> {
            openInfoActivity(0);
        });
        findViewById(R.id.rome).setOnClickListener(view -> {
            openInfoActivity(1);
        });
        findViewById(R.id.milan).setOnClickListener(view -> {
            openInfoActivity(2);
        });
        findViewById(R.id.turin).setOnClickListener(view -> {
            openInfoActivity(3);
        });
        findViewById(R.id.naples).setOnClickListener(view -> {
            openInfoActivity(4);
        });
        findViewById(R.id.bologna).setOnClickListener(view -> {
            openInfoActivity(5);
        });
        findViewById(R.id.florencia).setOnClickListener(view -> {
            openInfoActivity(6);
        });
        findViewById(R.id.vatican).setOnClickListener(view -> {
            openInfoActivity(7);
        });
        findViewById(R.id.pisa).setOnClickListener(view -> {
            openInfoActivity(8);
        });
        findViewById(R.id.venice).setOnClickListener(view -> {
            openInfoActivity(9);
        });
        findViewById(R.id.sicily).setOnClickListener(view -> {
            openInfoActivity(10);
        });
        findViewById(R.id.genoa).setOnClickListener(view -> {
            openInfoActivity(11);
        });
        findViewById(R.id.about_app).setOnClickListener(view -> {
            openInfoActivity(12);
        });

    }

    // static method, go to info activity with code;
    private void openInfoActivity(int code) {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("CODE", code);
        startActivity(intent);
    }
}