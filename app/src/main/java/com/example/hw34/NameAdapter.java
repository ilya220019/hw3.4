package com.example.hw34;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NameAdapter extends RecyclerView.Adapter<NameViewHolder> {

    private ArrayList<String> nameList;
    private OnClick onClick;

    public NameAdapter(ArrayList<String> nameList, OnClick onClick) {
        this.nameList = nameList;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NameViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(nameList.get(position));

        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick.onClick(nameList.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }
}
