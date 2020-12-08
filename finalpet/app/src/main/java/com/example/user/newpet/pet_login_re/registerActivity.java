package com.example.user.newpet.pet_login_re;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.user.newpet.MainActivity;
import com.example.user.newpet.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class registerActivity extends AppCompatActivity {

    EditText e2, e3;

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e2 = (EditText)findViewById(R.id.register_mail);
        e3 = (EditText)findViewById(R.id.register_password);

        auth = FirebaseAuth.getInstance();


    }

    public void createUser (View v) {
        if (e2.getText().toString().equals("") && e3.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "不允許空白", Toast.LENGTH_SHORT).show();
        }
        else
        {
            String email = e2.getText().toString();
            String password = e3.getText().toString();
            auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(getApplicationContext(), "用戶註冊成功", Toast.LENGTH_SHORT).show();
                        finish();
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "用戶註冊失敗", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }
    }
}
