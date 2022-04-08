package com.salihakca2.notebook.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
import java.sql.Blob

@Entity
class Note(
    @ColumnInfo(name = "baslik")
    var baslik: String,
    @ColumnInfo(name = "note")
    var note: String,
    @ColumnInfo(name = "image")
    var image: ByteArray
     ): Serializable
    {

    @PrimaryKey(autoGenerate = true)
    var id = 0


}