package com.example.debtormanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ListingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( this );
        recyclerView.setLayoutManager(layoutManager);

        Listing[] lists = loadLists();
        ListingAdapter adapter = new ListingAdapter(lists);
        recyclerView.setAdapter(adapter);

    }
    private Listing[] loadLists(){
        Listing list1 = new Listing();
        list1.setLocation("Phnom Penh");
        list1.setName("Horng");
        list1.setPhone_number("0123456789");

        Listing list2 = new Listing();
        list2.setLocation("Phnom Penh");
        list2.setName("Ly Horng");
        list2.setPhone_number("013345674");

        return new Listing[]{list1,list2};
    }
}
