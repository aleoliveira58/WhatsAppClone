package com.example.wahtsappclone.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wahtsappclone.Model.StatusModel

import com.example.wahtsappclone.databinding.StatusItemBinding

class AdapterStatus (
    private val statusList: List<StatusModel>
) : RecyclerView.Adapter<AdapterStatus.StatusViewHolder>(){


    class StatusViewHolder(
        val binding: StatusItemBinding
    ): RecyclerView.ViewHolder(binding.root){

        fun bind (
            chats : StatusModel
        ){
            binding.ivFotoStatusWhatsApp.setImageResource(chats.foto)
            binding.txNameStatusWhatsApp.text = chats.name
            binding.txDateStatusWhatsApp.text = chats.date


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusViewHolder {
        val binding = StatusItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return StatusViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StatusViewHolder, position: Int) {
        holder.bind(statusList[position])
    }

    override fun getItemCount() = statusList.size


}