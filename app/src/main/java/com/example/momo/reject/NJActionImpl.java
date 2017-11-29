package com.example.momo.reject;

import android.util.Log;

import com.example.mylibrary.NJAction;

/**
 * Created by momo on 2017/11/29.
 */

public class NJActionImpl implements NJAction{
    @Override
    public void eat() {
//        System.out.print("************NJActionImpl eat!!");
        Log.i("Nj","**************NJActionImpl eat!!***");
    }
}
