package com.example.demo.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.demo.R;

public class loginactivity extends AppCompatActivity implements View.OnClickListener {


    EditText email,password;
    Button login;
    TextView registerlink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        email=findViewById(R.id.etemail);
        password=findViewById(R.id.etpassword);
        login=findViewById(R.id.btnlogin);
        registerlink=findViewById(R.id.registerlink);

       login.setOnClickListener(this);
        registerlink.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnlogin:
                startActivity(new Intent(loginactivity.this, HomeActivity.class));
                break;
            case R.id.registerlink:
                switchOnRegister();
                break;


        }
    }

    private void switchOnRegister() {
        Intent i=new Intent(loginactivity.this, MainActivity.class);
        startActivity(i);
    }
}