package com.example.mymvvm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.mymvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final User user = new User("荣华", "幕后");
        binding.setUser(user);

        binding.setClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btn_jump) {
                    //Toast.makeText(MainActivity.this,"点击跳转",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, HandlerActivity.class));
                } else if (v.getId() == R.id.btn_update) {
                    user.setFirstName("修改后firstName");
                    user.setLastName("修改后LastName");
                }
            }
        });

    }
}