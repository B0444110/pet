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
import com.example.user.newpet.pet_login_re.registerActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class loginActivity extends AppCompatActivity {

    EditText e2, e3;

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        e2 = (EditText)findViewById(R.id.login_mail);
        e3 = (EditText)findViewById(R.id.login_password);

        auth = FirebaseAuth.getInstance();

    }

    public void register (View v)
    {
        Intent i = new Intent(this, registerActivity.class);
        startActivity(i);
    }
    public void loginUser (View v)
    {
        if (e2.getText().toString().equals("") && e3.getText().toString().equals(""))
        {
            Toast.makeText(getApplicationContext(), "不允許空白", Toast.LENGTH_SHORT).show();
        }
        else
        {
            auth.signInWithEmailAndPassword(e2.getText().toString(), e3.getText().toString())
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful())
                            {
                                Toast.makeText(getApplicationContext(), "用戶已成功登入", Toast.LENGTH_SHORT).show();
                                finish();
                                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(i);
                            }
                            else
                            {
                                Toast.makeText(getApplicationContext(), "用戶登入失敗 ", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }
    }
}
