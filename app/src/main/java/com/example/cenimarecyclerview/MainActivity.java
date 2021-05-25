package com.example.cenimarecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static  final String Tag = "MainActivity";

    private ArrayList<String>mNames = new ArrayList<>();
    private ArrayList<String>mImageUrls = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initImageBitmaps();
    }
    private void initImageBitmaps(){
        mImageUrls.add("https://images-na.ssl-images-amazon.com/images/I/519NBNHX5BL._SY445_.jpg");
        mNames.add("The shawshank redemption");
        mImageUrls.add("https://m.media-amazon.com/images/M/MV5BNGVjNWI4ZGUtNzE0MS00YTJmLWE0ZDctN2ZiYTk2YmI3NTYyXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_.jpg");
        mNames.add("JOKER");
        mImageUrls.add("https://www.reelviews.net/resources/img/posters/thumbs/grave_poster.jpg");
        mNames.add("Grave of the fireflies");
        mImageUrls.add("https://images-na.ssl-images-amazon.com/images/I/71niXI3lxlL._AC_SY679_.jpg");
        mNames.add("Avengers Endgame");
        mImageUrls.add("https://i.redd.it/pkk9guou7ot41.jpg");
        mNames.add("Violet Evergarden");
        mImageUrls.add("https://images-na.ssl-images-amazon.com/images/I/51uKITEiT1L._AC_.jpg");
        mNames.add("Lord of the rings");
        mImageUrls.add("https://movieposters2.com/images/704089-b.jpg");
        mNames.add("Inception");
        intRecyclerView();
    }
    private void intRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.cinema_recycler_view);
        CinemaAdapter adapter = new CinemaAdapter(this, mNames,mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //GridView
        //recyclerView.setLayoutManager (new GridLayoutManager(MainActivity.this, 3));
    }
}