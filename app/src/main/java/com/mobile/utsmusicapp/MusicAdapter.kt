package com.mobile.utsmusicapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter(private val context: Context, private val music: List<Music>, val listener: (Music) -> Unit)
    : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>(){
    class MusicViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imageMusic = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameMusic = view.findViewById<TextView>(R.id.tv_item_name)
        val descMusic = view.findViewById<TextView>(R.id.tv_item_description)


        fun binView(music: Music, listener: (Music) -> Unit){
            imageMusic.setImageResource(music.imageMusic)
            nameMusic.text = music.nameMusic
            descMusic.text = music.descMusic
            itemView.setOnClickListener{
                listener(music)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_music, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.binView(music[position], listener)
    }

    override fun getItemCount(): Int = music.size
}
