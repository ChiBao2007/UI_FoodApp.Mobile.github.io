package bao.huynh.food_app_huynhphamchibao.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatButton;

import java.util.ArrayList;

import bao.huynh.food_app_huynhphamchibao.model.Detail_Food;
import bao.huynh.food_app_huynhphamchibao.model.Food;
import bao.huynh.food_app_huynhphamchibao.R;

public class Food_Adapter extends BaseAdapter {
    private Context context;
    ArrayList<Food> data;

    public Food_Adapter(Context context, ArrayList<Food> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_food, null, false);
            viewHolder = new ViewHolder();
            viewHolder.foodNameTextView = convertView.findViewById(R.id.tvFood);
            viewHolder.foodImageView = convertView.findViewById(R.id.imgFood);
            viewHolder.foodPriceTextView = convertView.findViewById(R.id.tvPrice);
            viewHolder.foodButton = convertView.findViewById(R.id.btnOrder);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Food food = data.get(position);
        viewHolder.foodNameTextView.setText(food.getName());
        viewHolder.foodImageView.setImageResource(food.getImage());
        viewHolder.foodPriceTextView.setText(food.getPrice());

        viewHolder.foodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Detail_Food.class);
                intent.putExtra("selectedFood",food);
                context.startActivity(intent);
            }
        });

        return convertView;
    }

    private static class ViewHolder {
        TextView foodNameTextView;
        ImageView foodImageView;
        TextView foodPriceTextView;
        AppCompatButton foodButton;
    }
}