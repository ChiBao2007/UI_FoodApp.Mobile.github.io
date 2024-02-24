package bao.huynh.food_app_huynhphamchibao.model;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import bao.huynh.food_app_huynhphamchibao.R;

public class Detail_Food extends AppCompatActivity {
    private TextView tvQuantity, tvFoodName, tvPrice, tvDescription;
    private AppCompatButton btnMinus, btnPlus, btnOrder;

    private ImageView imgFood;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_food);

        tvFoodName = findViewById(R.id.tvFoodName);
        tvPrice = findViewById(R.id.tvPrice1);
        imgFood = findViewById(R.id.imgFood1);
        tvDescription = findViewById(R.id.tvDescription);

        // Lấy dữ liệu từ Intent
        Intent intent = getIntent();
        Food food = (Food) intent.getSerializableExtra("selectedFood");

        // Hiển thị dữ liệu món ăn trong chi tiết
        imgFood.setImageResource(food.getImage());
        tvFoodName.setText(food.getName());
        tvPrice.setText(food.getPrice());
        tvDescription.setText(food.getDetail());


    }
}