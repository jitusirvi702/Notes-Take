package com.example.notestake.repository

import androidx.room.Query
import com.example.notestake.database.NoteDatabase
import com.example.notestake.model.Note

class NoteRepository(private val db: NoteDatabase) {
    suspend fun insertNote(note: Note)= db.getNoteDao().insertNote(note)
    suspend fun deleteNote(note: Note)= db.getNoteDao().deleteNote(note)
    suspend fun updateNote(note: Note)= db.getNoteDao().deleteNote(note)

    fun getAllNotes() = db.getNoteDao().getAllNotes()
    fun searchNote(query: String?) = db.getNoteDao().searchNotes(query)
}