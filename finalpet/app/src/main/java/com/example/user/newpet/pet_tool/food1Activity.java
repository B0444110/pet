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

public class food1Activity extends AppCompatActivity {

    int [] IMAGES = {R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5,
            R.drawable.a6, R.drawable.a7, R.drawable.a8, R.drawable.a9, R.drawable.a10};
    String [] NAMES = {"愛犬專用皮膚毛髮保養配方", "邦比寵物特效海藻粉", "FelixDog骨力勁",
            "啾嚕肉泥", "100%天然鮪魚", "天然成幼貓糧", "室內貓化毛配方",
            "葛莉思貓 海洋口味", "Main Course每客思主食罐", "貓腎臟病配方濕糧"};
    String [] DESCRIPTIONS = {"幫助愛犬毛髮柔軟、脫離皮膚搔癢等敏感性問題", "強健毛囊，增強色素提升毛髮亮麗", "使用最易吸收利用的膠原蛋白、製造技術及功效均獲美國專利",
            "選用日本當地人食用等級的食材、將食材磨成泥在包裝成條狀方式", "100%天然新鮮食品富含水分、不添加化學成分 充填物與副食品",
            "添加蔓越莓和藍苺等食材、益生菌、葡萄糖胺、軟骨素", "添加天然纖維化毛配方、有助於腸道消化",
            "消除排泄物中臭味、預防尿結石、富含亞麻仁油酸、適量的ω3及ω6", "添加貓咪必須維生素、礦物質、雞油、橄欖油更易吸收", "低磷支援血管、保障消化系統"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food1);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        ListView listView = (ListView)findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        Menu menu = bottomNav.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            startActivity(new Intent(food1Activity.this, food1Activity.class));
                            break;
                        case R.id.nav_favorites:
                            startActivity(new Intent(food1Activity.this, lifeActivity.class));
                            break;
                        case R.id.nav_search:
                            startActivity(new Intent(food1Activity.this, cleanActivity.class));
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
                startActivity(new Intent(food1Activity.this, MainActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
