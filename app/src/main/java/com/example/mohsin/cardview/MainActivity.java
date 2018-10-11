package com.example.mohsin.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView RV;
RecyclerView.Adapter adapter;
RecyclerView.LayoutManager layoutManager;
ArrayList<LayoutPojo>lay=new ArrayList<LayoutPojo>();
int[]imge ={R.drawable.img1, R.drawable.img10, R.drawable.img2, R.drawable.img3, R.drawable.img4,R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9};
   String[] Name, Age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name= getResources().getStringArray(R.array.dogsname);
        Age=getResources().getStringArray(R.array.dogsage);

        int count=0;
        for (String Namee: Name){
            LayoutPojo layout=new LayoutPojo(imge[count], Name[count],Age[count]);
            count++;
            lay.add(layout);
        }
        RV=(RecyclerView)findViewById(R.id.recycler);
        layoutManager=new LinearLayoutManager(this);
        RV.setLayoutManager(layoutManager);
        RV.setHasFixedSize(true);
        adapter=new LayoutAdapter(lay);
        RV.setAdapter(adapter);
    }
}
