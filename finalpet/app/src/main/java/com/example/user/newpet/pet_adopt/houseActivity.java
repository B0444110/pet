package com.example.user.newpet.pet_adopt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.newpet.MainActivity;
import com.example.user.newpet.R;

public class houseActivity extends AppCompatActivity {

    private TextView tvtitle,tvdescription,tvdescription2,tvdescription3,tvdescription4,tvcategory;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house);

        TextView link = (TextView) findViewById(R.id.link);
        link.setMovementMethod(LinkMovementMethod.getInstance());

        tvtitle = (TextView) findViewById(R.id.txttitle);
        tvdescription = (TextView) findViewById(R.id.txtDesc);
        tvdescription2 = (TextView) findViewById(R.id.txtDesc2);
        tvdescription3 = (TextView) findViewById(R.id.txtDesc3);
        tvdescription4 = (TextView) findViewById(R.id.link);
        tvcategory = (TextView) findViewById(R.id.txtCat);
        img = (ImageView) findViewById(R.id.bookthumbnail);

        // Recieve data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Category = intent.getExtras().getString("Category");
        String Description = intent.getExtras().getString("Description");
        String Description2 = intent.getExtras().getString("Description2");
        String Description3 = intent.getExtras().getString("Description3");
        String Description4 = intent.getExtras().getString("Description4");
        int image = intent.getExtras().getInt("Thumbnail") ;

        // Setting values

        tvtitle.setText(Title);
        tvcategory.setText(Category);
        tvdescription.setText(Description);
        tvdescription2.setText(Description2);
        tvdescription3.setText(Description3);
        tvdescription4.setText(Description4);
        img.setImageResource(image);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.home_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                startActivity(new Intent(houseActivity.this, MainActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
