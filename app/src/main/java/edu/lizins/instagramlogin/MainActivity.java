package edu.lizins.instagramlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText userName, passWord;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName= findViewById(R.id.username);
        passWord = findViewById(R.id.password);
        btnLogin = (Button)findViewById(R.id.btn_Login);
    }
    public void onLogin(View view){
        String username = userName.getText().toString();
        String password = passWord.getText().toString();
        if(username.equals("admin") && password.equals("123456")) {
            Toast.makeText(this, "Login Successfully!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show();
        }
    }

}