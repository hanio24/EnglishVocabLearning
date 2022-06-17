package com.example.zaban2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
class session extends AppCompatActivity {

    RecyclerView recyclerView;


    String s1[], s2[];
    int images[];

    {
        images = new int[]{R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five,
                R.drawable.six, R.drawable.seven, R.drawable.eight, R.drawable.nine, R.drawable.ten,};
    }


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.session);

            recyclerView= findViewById(R.id.recyclerview);


            s1 = getResources().getStringArray(R.array.sessions);
            s2 = getResources().getStringArray(R.array.description);

            MyAdapter myAdapter = new MyAdapter(this, s1,s2,images);

            recyclerView.setAdapter(myAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));







        }
}
