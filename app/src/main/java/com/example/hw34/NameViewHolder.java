package com.example.hw34;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class NameViewHolder extends RecyclerView.ViewHolder {
        TextView name;
    public NameViewHolder(View itemview) {
        super(itemview);
        name = itemview.findViewById(R.id.tv_item);
    }

    public void bind(String s) {
        name.setText(s);
    }
}
