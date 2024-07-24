package com.example.myapplication.Music

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.AlbumMusicItemBinding

class MusicAlbumAdapter(private val items:ArrayList<MusicAlbumData>,private val fragmentActivity: FragmentActivity):RecyclerView.Adapter<MusicAlbumAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: AlbumMusicItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(item: MusicAlbumData){
            binding.ivItemCover.setImageResource(item.musicImgId)
            binding.tvItemTitle.text = item.musicTitle
            binding.tvItemTag1.text = item.musicTag1
            binding.tvItemTag2.text = item.musicTag2

            binding.ivItemHeartEmpty.setOnClickListener{
                binding.ivItemHeartEmpty.visibility = View.GONE
                binding.ivItemHeartSelected.visibility = View.VISIBLE
            }
            binding.ivItemHeartSelected.setOnClickListener {
                binding.ivItemHeartSelected.visibility = View.GONE
                binding.ivItemHeartEmpty.visibility = View.VISIBLE
            }
        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicAlbumAdapter.ViewHolder{
        val binding=AlbumMusicItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }


    override fun getItemCount(): Int {
        return items.size
    }

}