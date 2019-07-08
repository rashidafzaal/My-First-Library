package com.example.testlibrary;

import android.content.Context;
import android.widget.Toast;

public class TestClass {


    public static void showMyToast(Context c){

        Toast.makeText(c, "This is my Library", Toast.LENGTH_SHORT).show();
    }
}
