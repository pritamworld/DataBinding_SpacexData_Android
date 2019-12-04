package com.pritesh.midterm_spacexdata_android.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.pritesh.midterm_spacexdata_android.R;
import com.pritesh.midterm_spacexdata_android.utils.Verifications;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener
{

    private static final String TAG = "LoginActivity";

    EditText etEmail;
    EditText etPassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
    }


    public void init() {
      etEmail = findViewById(R.id.etEmail);
      etPassword = findViewById(R.id.etPassword);
    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.btnLogin){

            if(!Verifications.isValidEmail(etEmail.getText().toString())){

            }else if (!Verifications.isValidPassword(etPassword.getText().toString())){

            }

            startActivity(new Intent(this , LaunchesListActivity.class));

        }
    }


}
