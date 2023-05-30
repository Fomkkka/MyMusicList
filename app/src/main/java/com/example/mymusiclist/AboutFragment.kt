package com.example.mymusiclist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.mymusiclist.databinding.FragmentAboutBinding



class AboutFragment : Fragment(R.layout.fragment_about) {

    private val args: AboutFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val song = args.songModel
        val binding = FragmentAboutBinding.bind(view)
        binding.tvSongLabel.text = song.name
        binding.tvAboutAuthor.text = song.author.toString()
        binding.tvSongAbout.text = song.about
        Glide.with(binding.ivSongImage.context).load(song.image).into(binding.ivSongImage)

        binding.btnBack.setOnClickListener{findNavController().popBackStack()}
    }

}