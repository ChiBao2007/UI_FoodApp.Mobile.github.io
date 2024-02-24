package bao.huynh.food_app_huynhphamchibao;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import java.util.ArrayList;

import bao.huynh.food_app_huynhphamchibao.adapter.Food_Adapter;
import bao.huynh.food_app_huynhphamchibao.model.Detail_Food;
import bao.huynh.food_app_huynhphamchibao.model.Food;

public class Home extends AppCompatActivity {
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        gridView = findViewById(R.id.gridView);
        ArrayList<Food> data = new ArrayList<>();
        data.add(new Food("Cơm gà", R.drawable.comga, "35.000đ", ""));
        data.add(new Food("Bún Chả", R.drawable.buncha, "40.000đ", ""));
        data.add(new Food("Cơm Tấm", R.drawable.comtam, "35.000đ", ""));
        data.add(new Food("Bún Thịt Nướng", R.drawable.bunthitnuong, "30.000đ", ""));
        data.add(new Food("Phở", R.drawable.pho, "45.000đ", ""));
        data.add(new Food("Bánh Mì", R.drawable.banhmi2, "25.000đ", ""));

        Food_Adapter adapter = new Food_Adapter(this, data);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Home.this, Detail_Food.class);
                Food food = data.get(position);
                intent.putExtra("selectedFood", food);
                startActivity(intent);
            }
        });
    }

    public void user(View view) {
        Intent intent = new Intent(Home.this, User.class);
        startActivity(intent);
    }
}