package com.example.user.newpet.pet_notic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.user.newpet.MainActivity;
import com.example.user.newpet.R;

public class successActivity extends AppCompatActivity {
    RelativeLayout rellay_dog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

    }

    public void home (View v)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    }

