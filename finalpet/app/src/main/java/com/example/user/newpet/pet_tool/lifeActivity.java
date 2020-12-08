package com.example.user.newpet.pet_tool;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.user.newpet.MainActivity;
import com.example.user.newpet.R;

public class lifeActivity extends AppCompatActivity {

    int [] IMAGES = {R.drawable.b1, R.drawable.b2, R.drawable.b3, R.drawable.b4, R.drawable.b5,
            R.drawable.b6, R.drawable.b7, R.drawable.b8, R.drawable.b9, R.drawable.b10};
    String [] NAMES = {"狗衣服橘藍雙面保暖背心", "哈比狗狗訓練除臭抗菌尿布墊", "狗狗攝影機",
            "輕量化ㄧ鍵收車寵物三輪推車", "柏爾寵物階梯 三層", "日本愛寵環保除臭豆腐砂", "日本製箱裝抗菌寵物尿布墊",
            "寵物智慧釦", "寵物防走失無線警報搜尋器", "毛孩舒適防舔咬頭套"};
    String [] DESCRIPTIONS = {"鋪棉材質：保暖又透氣、反光條設計：安全更升級",
            "美國評價最好的訓練尿布墊、吸水力超強，狗狗腳腳不沾濕", "趣味遠端互動，把握狗狗每一刻，掌握突發狀況",
            "輕便、一鍵收起、DIY自行組裝、時尚品質保障", "彈力海綿保護寵物關節、柔軟表布滑順舒適、可拆洗布套清潔超容易",
            "不僅是吸收速度快、凝結迅速，更可以直接丟入馬桶", "脫臭功能保持空氣清新、抗菌功能維持環境衛生、強力瞬間吸收",
            "透過智慧釦掌握毛孩健康", "防止心愛寶貝走失、防潑水、智慧搜尋功能", "可愛度飆升造型百分百、可雙面使用隨心情變換花色"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        ListView listView = (ListView)findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        Menu menu = bottomNav.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            startActivity(new Intent(lifeActivity.this, food1Activity.class));
                            break;
                        case R.id.nav_favorites:

                            break;
                        case R.id.nav_search:
                            startActivity(new Intent(lifeActivity.this, cleanActivity.class));
                            break;
                    }

                    return true;
                }
            };
    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customlayout, null);

            ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
            TextView textview_name = (TextView)view.findViewById(R.id.textView_name);
            TextView textview_description = (TextView)view.findViewById(R.id.textView_description);

            imageView.setImageResource(IMAGES[i]);
            textview_name.setText(NAMES[i]);
            textview_description.setText(DESCRIPTIONS[i]);

            return view;
        }
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
                startActivity(new Intent(lifeActivity.this, MainActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
