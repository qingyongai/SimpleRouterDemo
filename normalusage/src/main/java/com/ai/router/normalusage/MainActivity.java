package com.ai.router.normalusage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    RouterManager mManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mManager = RouterManager.getManager();
    }

    public void one(View view) {
        mManager.openResult(this, "activity/main2");
    }


    public void two(View view) {
        mManager.openResult(this, "activity/main3");
    }

}
