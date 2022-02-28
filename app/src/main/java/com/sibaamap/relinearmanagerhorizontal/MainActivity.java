package com.sibaamap.relinearmanagerhorizontal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import book.Book;
import category.Category;
import category.CategoryAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvCategory = findViewById(R.id.rcv_catagory);
        categoryAdapter = new CategoryAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvCategory.setLayoutManager(linearLayoutManager);

        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);

    }

    private List<Category> getListCategory(){
        List<Category> listCategory = new ArrayList<>();

        List<Book> listBook = new ArrayList<>();
        listBook.add(new Book(R.drawable.girl1,"Book 1"));
        listBook.add(new Book(R.drawable.girl2,"Book 2"));
        listBook.add(new Book(R.drawable.girl3,"Book 3"));
        listBook.add(new Book(R.drawable.girl4,"Book 4"));
        List<Book> listBook1 = new ArrayList<>();
        listBook1.add(new Book(R.drawable.onepiece1,"Book 1"));
        listBook1.add(new Book(R.drawable.onepiece2,"Book 2"));
        listBook1.add(new Book(R.drawable.onepiece3,"Book 3"));
        listBook1.add(new Book(R.drawable.onepiece4,"Book 4"));
        List<Book> listBook2 = new ArrayList<>();
        listBook2.add(new Book(R.drawable.wallpaper1,"Book 1"));
        listBook2.add(new Book(R.drawable.wallpaper2,"Book 2"));
        listBook2.add(new Book(R.drawable.wallpaper3,"Book 3"));
        listBook2.add(new Book(R.drawable.wallpaper4,"Book 4"));


        listCategory.add(new Category("Girl Beauty",listBook));
        listCategory.add(new Category("Anime",listBook1));
        listCategory.add(new Category("Wallpaper",listBook2));
        listCategory.add(new Category("Girl Beauty",listBook));


        return listCategory;
    }
}