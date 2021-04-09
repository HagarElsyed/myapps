package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import javax.xml.validation.Validator;

public class MainActivity extends AppCompatActivity {
    private  static  final String TAG ="MainActivity";
    String name;
    Float price;
    TextView texttitle;

    //vars
    private ArrayList<String> mNames=new ArrayList<>();
    private ArrayList<String> mImageUrls=new ArrayList<>();
    private String msg;
    private Object my_recycler_view;
    private boolean items;
    private Object ArrayList;
    private Object data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //set back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        int d = Log.d(TAG,  "oncreate:started.");
        texttitle=findViewById(R.id.dataTitle);
        Intent i = getIntent();

        String title = i.getStringExtra(name);
        texttitle.setText(title);


    }

    private Object data(String hardware) {
        return null;
    }

    private void initImageBitmaps(Context context){
        String msg;
        Log.d(TAG,"initImageBitmaps: preparing bitmaps.");
        mNames.add("server");
        mNames.add("laptop");
        mNames.add("keyboard");
        mNames.add("motherboard");
        mNames.add("software");
        mNames.add("hardware");
        mNames.add("powerbank");
        mNames.add("hard disk");
        mNames.add("mouse");
        mNames.add("usb");
        mNames.add("cables");
        mNames.add("arge");
        mNames.add("flasha");
        mNames.add("routers");

        initRecyclerView(context);
        

    }
    private  void  initRecyclerView(Context context){
        Log.d(TAG, "initRecyclerView.");
        RecyclerView recyclerView=findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(this,mNames,mImageUrls, context);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
