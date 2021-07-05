package com.example.weekfive

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weekfive.databinding.ProfileItemBinding


class ProfileAdapter(val names: List<ProfileModel>) : RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>() {

    class ProfileViewHolder(val binding: ProfileItemBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(name: ProfileModel){
            binding.firstName.text = name.firstName
            binding.lastName.text = name.lastName

            if (name.isProfileImage){
                binding.maleProfileImage.setImageResource(R.drawable.ic_male)
            }else {
                binding.maleProfileImage.setImageResource(R.drawable.ic_female)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val binding: ProfileItemBinding = ProfileItemBinding.inflate(LayoutInflater.from(parent.context))
        return  ProfileViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val name = names.get(position)
        holder.bind(name)
    }

    override fun getItemCount(): Int {
        return names.size
    }
}