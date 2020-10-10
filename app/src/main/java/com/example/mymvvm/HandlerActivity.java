package com.example.mymvvm;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.mymvvm.databinding.LayoutHandlerBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2020/9/30.
 */

public class HandlerActivity extends AppCompatActivity {

    private List<RecyclerViewItem> list;
    RecyclerViewAdapter recyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();

        LayoutHandlerBinding binding = DataBindingUtil.setContentView(this, R.layout.layout_handler);
        binding.ryListView.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewAdapter = new RecyclerViewAdapter(list);
        binding.ryListView.setAdapter(recyclerViewAdapter);

        binding.setHandler(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 更新
                updateData();
                recyclerViewAdapter.notifyDataSetChanged();
            }
        });

    }

    private void initData() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new RecyclerViewItem(String.valueOf(i)));
        }
    }

    private void updateData() {
        for (int i = 10; i < 30; i++) {
            list.add(new RecyclerViewItem(String.valueOf(i)));
        }
    }
}
