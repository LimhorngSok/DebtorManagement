package com.example.debtormanagement;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListingAdapter extends RecyclerView.Adapter<ListViewHolder> {
    private Listing[] lists;

    public ListingAdapter(Listing[] lists) {
        this.lists = lists;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater  = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.view_holder_list,parent,false);

        return new ListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Listing list = lists[position];
        holder.bind(list);
    }

    @Override
    public int getItemCount() {
        return lists.length;
    }
}
