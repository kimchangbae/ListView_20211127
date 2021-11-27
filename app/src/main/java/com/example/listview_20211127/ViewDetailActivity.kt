package com.example.listview_20211127

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview_20211127.datas.RoomData
import kotlinx.android.synthetic.main.activity_view_detail.*

class ViewDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_detail)

        val room = intent.getSerializableExtra("room") as RoomData

        txtPrice.text = room.getFormattedPrice()
        txtAddress.text = room.address
        txtDescription.text = room.description
        txtFloor.text = room.getFormattedFloor()
    }
}