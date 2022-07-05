package com.example.wahtsappclone.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wahtsappclone.Model.CallModel

import com.example.wahtsappclone.databinding.CallItemBinding

class AdapterCall( private val callList: List<CallModel>
) : RecyclerView.Adapter<AdapterCall.CallViewHolder>(){


    class CallViewHolder(
        val binding: CallItemBinding
    ): RecyclerView.ViewHolder(binding.root){

        fun bind (
            chats : CallModel
        ){
            binding.ivFotoCallWhatsApp.setImageResource(chats.foto)
            binding.txNameCallWhatsApp.text = chats.nome
            binding.txCallWhatsApp.text = chats.date


        }

    }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallViewHolder {
        val binding = CallItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return CallViewHolder(binding)
    }


    override fun onBindViewHolder(holder: CallViewHolder, position: Int) {
        holder.bind(callList[position])
    }

    override fun getItemCount() = callList.size


}
