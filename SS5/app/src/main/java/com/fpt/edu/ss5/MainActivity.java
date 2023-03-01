package com.fpt.edu.ss5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ProductAdapter.IOnClickItem {

    List<Product> listProduct = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initData();

        ProductAdapter adapter = new ProductAdapter(this, listProduct, this);

        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);

        RecyclerView rvProduct = (RecyclerView) findViewById(R.id.rvProduct);
        rvProduct.setLayoutManager(layoutManager);
        rvProduct.setAdapter(adapter);
    }



    private void initData(){
        listProduct.add(new Product("AirSense1","Blazer1","1.499.000",R.drawable.img1));
        listProduct.add(new Product("AirSense2","Blazer2","1.000.000",R.drawable.img2));
        listProduct.add(new Product("AirSense3","Blazer3","2.500.000",R.drawable.img3));
        listProduct.add(new Product("AirSense4","Blazer4","1.609.000",R.drawable.img4));
        listProduct.add(new Product("AirSense5","Blazer5","1.999.000",R.drawable.img5));
        listProduct.add(new Product("AirSense6","Blazer6","1.599.000",R.drawable.img6));
    }

    @Override
    public void onClickItem(int position) {
        Product product = listProduct.get(position);
        Toast.makeText(this,product.getTitle(),Toast.LENGTH_SHORT).show();

    }
}