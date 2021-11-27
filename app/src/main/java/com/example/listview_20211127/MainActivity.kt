package com.example.listview_20211127

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview_20211127.data.RoomData

class MainActivity : AppCompatActivity() {

    val mRoomList: ArrayList<RoomData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add( RoomData(8000,   "서울시 동대문구",     5, "1번 방") )
        mRoomList.add( RoomData(5000,   "서울시 노원구",      1, "2번 방") )
        mRoomList.add( RoomData(6000,   "서울시 은평구",      3, "3번 방") )
        mRoomList.add( RoomData(2000,   "서울시 서대문구",    -5, "4번 방") )
        mRoomList.add( RoomData(7000,   "서울시 강남구",      23, "5번 방") )
        mRoomList.add( RoomData(9000,   "서울시 서초구",      11, "6번 방") )
        mRoomList.add( RoomData(10000,  "서울시 노원구",      1, "7번 방") )
        mRoomList.add( RoomData(20000,  "서울시 은평구",      13, "8번 방") )
        mRoomList.add( RoomData(50000,  "서울시 동대문구",    20, "9번 방") )

    }
}