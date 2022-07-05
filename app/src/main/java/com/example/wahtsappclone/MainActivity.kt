package com.example.wahtsappclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wahtsappclone.Adapter.AdapterMain
import com.example.wahtsappclone.Fragment.CallFragment
import com.example.wahtsappclone.Fragment.CameraFragment
import com.example.wahtsappclone.Fragment.ChatFragment
import com.example.wahtsappclone.Fragment.StatusFragment
import com.example.wahtsappclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        setUpTabs()


    }

    private fun setUpTabs() {
        val adapter = AdapterMain(supportFragmentManager)
        adapter.addFragment(CameraFragment(), "")
        adapter.addFragment(ChatFragment(), "CHAT")
        adapter.addFragment(StatusFragment(), "STATUS")
        adapter.addFragment(CallFragment(), "CALL")
        binding.viewPagerTabs.adapter = adapter
        binding.tabs.setupWithViewPager(binding.viewPagerTabs)
        binding.tabs.getTabAt(0)!!.setIcon(R.drawable.ic_camera_black)

    }


}