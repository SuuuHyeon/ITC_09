package com.example.itc_football.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.itc_football.R
import com.example.itc_football.databinding.ChatListActivityBinding

class ChatListActivity : AppCompatActivity() {
    private lateinit var binding: ChatListActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ChatListActivityBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)

        binding.bottomNavigation.selectedItemId = binding.bottomNavigation.menu.getItem(1).itemId
        binding.bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_home -> {
                    val intent = Intent(this, ItemListActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.bottom_chat -> {
                    val intent = Intent(this, ChatListActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.bottom_mypage -> {
                    val intent = Intent(this, MyPageActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

    }
}