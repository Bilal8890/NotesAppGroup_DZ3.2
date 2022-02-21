package com.example.notesappgroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton btnAdd;
    private NoteAdapter adapter;
    private RecyclerView rvNote;
    private NoteModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvNote = findViewById(R.id.rvNote);
        adapter = new NoteAdapter();
        initViews();
        initRv();
    }

    private void initRv() {
        rvNote.setAdapter(adapter);
        String title = getIntent().getStringExtra("title");
        String des = getIntent().getStringExtra("description");
        model = new NoteModel(title, des);
        adapter.setList(this, model);

    }

    private void initViews() {
        btnAdd = findViewById(R.id.btn_add_note);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NewNoteActivity.class);
                startActivity(intent);
            }
        });


    }
}