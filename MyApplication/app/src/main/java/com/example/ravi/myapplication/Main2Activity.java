package com.example.ravi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

b=(Button)findViewById(R.id.text);

b.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent  a=new Intent(Main2Activity.this,MainActivity.class);
        startActivity(a);

    }
});
    }
}
