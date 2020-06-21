package com.example.debtormanagement;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListViewHolder extends RecyclerView.ViewHolder {

    private TextView name;
    private TextView phone_number;
    private TextView address;

    public ListViewHolder(@NonNull View itemView) {
        super(itemView);
    }
    public void bind(Listing list){
        name.setText(list.getName());
        phone_number.setText(list.getPhone_number());
        address.setText(list.getLocation());
    }
}
