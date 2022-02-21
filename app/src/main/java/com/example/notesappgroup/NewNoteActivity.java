package com.example.notesappgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class NewNoteActivity extends AppCompatActivity {
    private Button btnAdd;
    private EditText etTitle, etDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);
        initViews();
    }
    private void initViews(){
        btnAdd = findViewById(R.id.btn_save);
        etTitle = findViewById(R.id.et_title);
        etDescription = findViewById(R.id.et_description);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewNoteActivity.this, MainActivity.class);
                intent.putExtra("title", etTitle.getText().toString());
                intent.putExtra("description", etDescription.getText().toString());
                startActivity(intent);
            }
        });
    }
}