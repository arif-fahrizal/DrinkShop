package com.example.myappprojectii;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView, recyclerView1;

    String s1[],s2[],s3[],s4[];
    int images[] = {R.drawable.bubble_tea, R.drawable.coffee, R.drawable.milk_shake, R.drawable.orange_juice, R.drawable.ice_tea};
    int image[] = {R.drawable.bubble, R.drawable.lovecoffee, R.drawable.milkshake, R.drawable.oreangejuice, R.drawable.icetea};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView1 = findViewById(R.id.recyclerView1);

        s1 = getResources().getStringArray(R.array.drink);
        s2 = getResources().getStringArray(R.array.product);
        s3 = getResources().getStringArray(R.array.harga);
        s4 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, s1,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        Adapter adapter = new Adapter(this, s2,s3,s4,image);
        recyclerView1.setAdapter(adapter);
        recyclerView1.setLayoutManager(new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false));
    }
}