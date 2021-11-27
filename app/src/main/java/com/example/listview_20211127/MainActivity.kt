package com.example.listview_20211127

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.listview_20211127.adapter.RoomAdapter
import com.example.listview_20211127.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // 방목록을 담기 위한 그릇
    val mRoomList = ArrayList<RoomData>()
    // 변수는 멤버변수로 m 을 붙힌다.
    lateinit var mRoomAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 실제 방 데이터 추가
        mRoomList.add( RoomData(8000,   "서울시 동대문구",     5, "1번 방") )
        mRoomList.add( RoomData(5000,   "서울시 노원구",      1, "2번 방") )
        mRoomList.add( RoomData(6000,   "서울시 은평구",      0, "3번 방") )
        mRoomList.add( RoomData(2000,   "서울시 서대문구",    -5, "4번 방") )
        mRoomList.add( RoomData(7000,   "서울시 강남구",      23, "5번 방") )
        mRoomList.add( RoomData(9000,   "서울시 서초구",      -11, "6번 방") )
        mRoomList.add( RoomData(15300,  "서울시 노원구",      0, "7번 방") )
        mRoomList.add( RoomData(22200,  "서울시 은평구",      13, "8번 방") )
        mRoomList.add( RoomData(57900,  "서울시 동대문구",    -20, "9번 방") )

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mRoomAdapter

        roomListView.setOnItemClickListener { adapterView, view, position, l ->
            val clickedRoom = mRoomList.get(position)

            val myIntent = Intent(this, ViewDetailActivity::class.java)
            myIntent.putExtra("room",clickedRoom)
            startActivity(myIntent)

        }
    }
}