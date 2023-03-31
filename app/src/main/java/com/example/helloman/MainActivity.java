package com.example.helloman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.helloman.Adptor.CategoryAdaptor;
import com.example.helloman.Adptor.PopluarAdaptor;
import com.example.helloman.Domain.CategoryDomain;
import com.example.helloman.Domain.FoodDomain;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter,adapter2;
    private RecyclerView recyclerViewCategoryList,recyclerViewPopularList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategory();
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList=findViewById(R.id.recyclerView1);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);


        ArrayList<CategoryDomain> category=new ArrayList<>();
        category.add(new CategoryDomain("Pizza", "cat_1"));
        category.add(new CategoryDomain("Burger", "cat_2"));
        category.add(new CategoryDomain("Hotdog", "cat_3"));
        category.add(new CategoryDomain("Drink", "cat_4"));
        category.add(new CategoryDomain("Donut", "cat_5"));


        adapter=new CategoryAdaptor(category);
        recyclerViewCategoryList.setAdapter(adapter);

    }
    private void  recyclerViewPopular(){
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularList=findViewById(R.id.recyclerView2);

        ArrayList<FoodDomain> foodList=new ArrayList<>();
        foodList.add(new FoodDomain("Pepperoni pizza","pizza1","slices pepperoni,mozzerella cheese,fresh oregano,ground black pepper,pizza sauce",9.76));
        foodList.add(new FoodDomain("Cheese Burger","burger","beef,Gouda Cheese, Special Sauce, Lettuce, tomato",8.79));
        foodList.add(new FoodDomain("Vegetable pizza","pizza2","olive oil, Vegetable oil, pitted kalamata, cherry tomatoes, fresh oregano, basil",8.5));

        adapter2=new PopluarAdaptor(foodList);
        recyclerViewPopularList.setAdapter(adapter2);
    }
}