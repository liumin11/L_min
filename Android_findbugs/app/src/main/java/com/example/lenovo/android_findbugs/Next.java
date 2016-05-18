package com.example.lenovo.android_findbugs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 2016/5/18.
 */
public class Next extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next1);
        Button but2 =(Button)findViewById(R.id.back);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent =new Intent(Next.this,MainActivity.class);
                startActivity(Intent);
            }
        });
    }
}
