package com.salihakca2.notebook.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.salihakca2.notebook.AddNoteActivity
import com.salihakca2.notebook.databinding.RecyclerRowBinding
import com.salihakca2.notebook.model.Note

class NoteAdapter(private val noteList: List<Note>): RecyclerView.Adapter<NoteAdapter.NoteHolder>() {
    class NoteHolder(val recyclerRowBinding: RecyclerRowBinding): RecyclerView.ViewHolder(recyclerRowBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteHolder {
        val recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return NoteHolder(recyclerRowBinding)
    }

    override fun onBindViewHolder(holder: NoteHolder, position: Int) {
        holder.recyclerRowBinding.textView.text = noteList[position].baslik
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, AddNoteActivity::class.java)
            intent.putExtra("NotePlace", noteList[position])
            intent.putExtra("info","old")
            holder.itemView.context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return noteList.size
    }
}