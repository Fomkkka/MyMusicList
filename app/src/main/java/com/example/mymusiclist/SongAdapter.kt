package com.example.mymusiclist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mymusiclist.databinding.ItemSongLayoutBinding

class SongAdapter(val launchFragment: (SongModel)->Unit): RecyclerView.Adapter<SongAdapter.SongViewHolder>() {

    val songList = ArrayList<SongModel>()

    inner class SongViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        private val binding = ItemSongLayoutBinding.bind(itemView)


        fun bindFun(song: SongModel)
        {
            binding.card.setOnClickListener{
                launchFragment(songList[adapterPosition])
            }
            Glide.with(binding.ivItemSong.context).load(song.image).into(binding.ivItemSong)

            binding.tvSong.text=song.name
            binding.tvAuthor.text=song.author.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder
    {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_song_layout,parent, false)
        return SongViewHolder(view)
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int)
    {
        holder.bindFun(songList[position])
    }

    override fun getItemCount(): Int
    {
        return songList.size
    }

    fun addSong(songSet: List<SongModel>)
    {
        songList.addAll(songSet)
        notifyDataSetChanged()
    }
}