package com.example.hw34;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnClick {

    RecyclerView recyclerView;
    private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        names= new ArrayList<>();
        recyclerView = findViewById(R.id.rw_recycler);
        setList();
        recyclerView.setAdapter(new NameAdapter(names,this::onClick));
    }

    private void setList() {
        names.add("Влад");
        names.add("Дима");
        names.add("Артём");
        names.add("Антон");
        names.add("Илья");
        names.add("Алексей");
    }

    @Override
    public void onClick(String name) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        String nameElement=name;
        intent.putExtra("key",nameElement);
        startActivity(intent);
    }
}