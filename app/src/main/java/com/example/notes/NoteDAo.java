package com.example.notes;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface NoteDAo {
    //Dao means Data access object
    @Query("INSERT INTO notes(contents) VALUES ('New note')")
    void create();
    @Query("SELECT*FROM notes")
    List<Note> getAllNotes();
    @Query("UPDATE notes SET contents= :contents WHERE id= :id")
    void save(String contents, int id);
}
