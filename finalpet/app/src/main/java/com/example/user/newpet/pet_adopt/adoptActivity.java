package com.example.user.newpet.pet_adopt;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.user.newpet.MainActivity;
import com.example.user.newpet.maps.Map5Activity;
import com.example.user.newpet.maps.Maps10Activity;
import com.example.user.newpet.maps.Maps11Activity;
import com.example.user.newpet.maps.Maps2Activity;
import com.example.user.newpet.maps.Maps3Activity;
import com.example.user.newpet.maps.Maps4Activity;
import com.example.user.newpet.maps.Maps6Activity;
import com.example.user.newpet.maps.Maps7Activity;
import com.example.user.newpet.maps.Maps8Activity;
import com.example.user.newpet.maps.Maps9Activity;
import com.example.user.newpet.maps.MapsActivity;
import com.example.user.newpet.R;

public class adoptActivity extends AppCompatActivity {

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopt);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation_html);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        listview=(ListView)findViewById(R.id.listview);
        ArrayAdapter<String> mAdapter=new ArrayAdapter<String>(adoptActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.place));
        listview.setAdapter(mAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    //台北市動物之家
                    Intent myintent = new Intent(view.getContext() ,  Maps2Activity.class);
                    startActivityForResult(myintent,0);
                }
                if (position == 1) {
                    //拼圖喵中途之家
                    Intent myintent = new Intent(view.getContext() , MapsActivity.class);
                    startActivityForResult(myintent,1);}

                //Button nextPageBtn = (Button)findViewById(R.id.button);
                //nextPageBtn.setOnClickListener(new View.OnClickListener() {
                //  @Override
                //   public void onClick(View v) {
                //        Intent intent = new Intent();
                //       intent.setClass(MainActivity.this , MapsActivity.class);
                //      startActivity(intent);
                //  }
                //});

                if (position == 2) {
                    //板橋動物之家
                    Intent myintent = new Intent(view.getContext() , Maps3Activity.class);
                    startActivityForResult(myintent,2);}
                if (position == 3) {
                    //浪浪別哭
                    Intent myintent = new Intent(view.getContext() , Maps4Activity.class);
                    startActivityForResult(myintent,2);}
                if (position == 4) {
                    //中和公立動物之家
                    Intent myintent = new Intent(view.getContext() , Map5Activity.class);
                    startActivityForResult(myintent,2);}
                if (position == 5) {
                    //卓媽媽狗場
                    Intent myintent = new Intent(view.getContext() , Maps6Activity.class);
                    startActivityForResult(myintent,2);}

                if (position == 6) {
                    //五股區公立動物之家
                    Intent myintent = new Intent(view.getContext() , Maps7Activity.class);
                    startActivityForResult(myintent,2);}
                if (position == 7) {
                    //張媽媽流浪動物之家
                    Intent myintent = new Intent(view.getContext() , Maps8Activity.class);
                    startActivityForResult(myintent,2);}
                if (position == 8) {
                    //淡水動物之家
                    Intent myintent = new Intent(view.getContext() , Maps9Activity.class);
                    startActivityForResult(myintent,2);}
                if (position == 9) {
                    //讀貓園中途咖啡簡餐廳
                    Intent myintent = new Intent(view.getContext() , Maps10Activity.class);
                    startActivityForResult(myintent,2);}
                if (position == 10) {
                    //新店動物之家
                    Intent myintent = new Intent(view.getContext() , Maps11Activity.class);
                    startActivityForResult(myintent,2);}
            }



        });

    }



    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.nav_html:
                            startActivity(new Intent(adoptActivity.this, adoptActivity.class));
                            break;

                    }

                    return true;
                }
            };

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
                startActivity(new Intent(adoptActivity.this, MainActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
