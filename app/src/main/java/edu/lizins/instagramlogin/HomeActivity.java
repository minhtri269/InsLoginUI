package edu.lizins.instagramlogin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Intent home = getIntent();
        String username = home.getStringExtra("username");
        ((TextView) findViewById(R.id.usernameHome)).setText("Welcome : " + username);
    }
}

