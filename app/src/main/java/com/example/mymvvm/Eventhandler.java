package com.example.mymvvm;

import android.view.View;
import android.widget.Toast;

/**
 * Created by Administrator on 2020/9/29.
 */

public class Eventhandler {
    public void onClickFriend(View view){
        Toast.makeText(view.getContext(),"onClickFriend",Toast.LENGTH_SHORT).show();
    }
}

