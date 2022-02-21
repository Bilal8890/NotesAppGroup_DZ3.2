package com.example.notesappgroup;

import java.io.Serializable;

public class NoteModel implements Serializable {
    private String title;
    private String description;

    public NoteModel(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public NoteModel() {
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
