package com.salihakca2.notebook.roomDb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.salihakca2.notebook.model.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteDao
}