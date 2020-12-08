package com.example.user.newpet.pet_login_re;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.user.newpet.R;
import com.example.user.newpet.pet_login_re.loginActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LogoutActivity extends AppCompatActivity {

    TextView profileTxt;
    FirebaseAuth auth;
    FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        auth = FirebaseAuth.getInstance();
        profileTxt = (TextView)findViewById(R.id.textView2);
        user = auth.getCurrentUser();

        profileTxt.setText(user.getEmail());
    }

    public void signOut (View v)
    {
        auth.signOut();
        finish();
        Intent i = new Intent(this, loginActivity.class);
        startActivity(i);
    }
}
