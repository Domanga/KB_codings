package com.example.recyclerview_0811;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    PersonAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int[] bg_img = {R.drawable.evening_background_image_1, R.drawable.backgorund_2_1,R.drawable.backgorund_3_1,R.drawable.backgorund_4_1, R.drawable.backgorund_5_1 };
        int[] usr_img = {R.drawable.user_image_1, R.drawable.barman_1, R.drawable.businessman_1, R.drawable.people_1, R.drawable.users_1};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new PersonAdapter();
        //Person person = new Person(R.drawable.user_image_1, "홍길동", "010-1544-1577", "hong@google.com", R.drawable.evening_background_image_1, "대구시 동구 신천동");
        Person perArr[] = new Person[10];
        for(int i=0;i<perArr.length;i++) {
            perArr[i] = new Person(usr_img[i%5], "홍길동"+i, "010-1544-1577", "hong@google.com", bg_img[i%5], "대구시 동구 신천동 신천로 12-"+i);
            adapter.addItem(perArr[i]);
        }
        //R.drawable.evening_background_image_1
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnPersonItemClickListener() {
            @Override
            public void onItemClick(PersonAdapter.ViewHolder holder, View view, int position) {
                Person item = adapter.getItem(position);
                Log.d("MainActivity", "이름 : " + item.getName());
                Log.d("MainActivity", "전화 : " + item.getTel());
                Log.d("MainActivity", "이메일 : " + item.getEmail());
                Log.d("MainActivity", "주소 : " + item.getAddr());
            }
        });
    }
}