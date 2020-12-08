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

public class cleanActivity extends AppCompatActivity {

    int [] IMAGES = {R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4, R.drawable.c5,
            R.drawable.c6, R.drawable.c7, R.drawable.c8, R.drawable.c9, R.drawable.c10};
    String [] NAMES = {"美國活氧酵素去漬除臭噴劑", "專業充插兩用寵物剪", "犬用神奇除毛梳 S號",
            "寵物電動磨甲器(修甲器)", "澳洲寵物吹水機乾燥吹風機", "寵物精油沐浴乳", "止癢噴劑",
            "耳波酵素清耳液", "麥高臣洗眼水4oz", "除蚤噴劑"};
    String [] DESCRIPTIONS = {"高科技生化技術及天然酵素",
            "纖腰防滑設計、充插兩用、鋒利不卡毛，耐磨不發熱、安全動力、R形鈍角", "換毛期保養期必備、有效除廢毛按壓推出",
            "不再被刮傷、耐用、便利", "風扇減噪設計附5吋伸縮軟管",
            "深層清潔毛髮皮膚、植物精油香味怡人", "日常皮膚清潔、保濕敏弱肌膚適用",
            "天然植物萃取、成分溫和不刺激、能迅速清除耳垢", "30秒有效對抗、不傷害健康細胞",
            "安全性佳、使用方便、效力持久"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clean);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        ListView listView = (ListView)findViewById(R.id.listview);

        cleanActivity.CustomAdapter customAdapter = new cleanActivity.CustomAdapter();
        listView.setAdapter(customAdapter);

        Menu menu = bottomNav.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {

                        case R.id.nav_home:
                            startActivity(new Intent(cleanActivity.this, food1Activity.class));
                            break;
                        case R.id.nav_favorites:
                            startActivity(new Intent(cleanActivity.this, lifeActivity.class));
                            break;
                        case R.id.nav_search:

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

            ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
            TextView textview_name = (TextView) view.findViewById(R.id.textView_name);
            TextView textview_description = (TextView) view.findViewById(R.id.textView_description);

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
                startActivity(new Intent(cleanActivity.this, MainActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
