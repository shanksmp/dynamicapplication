package com.adlab.dynamicapps;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundResource(R.drawable.bgimg2);


        EditText e1 = new EditText(this);
        TextView t1= new TextView(this);
        Button b1 = new Button(this);
        TextView t2 = new TextView(this);
        TextView t3,t4,t5,t6;
        EditText e2,e3;
        t3 = new TextView(this);
        t4 = new TextView(this);
        int TextColor = Color.BLACK;
        e2 = new EditText(this);
        e3 = new EditText(this);
        t5= new TextView(this);
        t6=new TextView(this);



        t1.setText("Name");
        t3.setText("USN");
        t4.setText("Dept");

        t1.setTextSize(30.0F);
        t2.setTextSize(30.0F);
        t3.setTextSize(30.0F);
        t4.setTextSize(30.0F);
        t5.setTextSize(30.0F);
        t6.setTextSize(30.0F);

        t1.setTextColor(TextColor);
        t2.setTextColor(TextColor);
        t3.setTextColor(TextColor);
        t4.setTextColor(TextColor);
        t5.setTextColor(TextColor);
        t6.setTextColor(TextColor);

        e1.setTextSize(30.0F);
        e2.setTextSize(30.0F);
        e3.setTextSize(30.0F);

        b1.setText("Submit");

        layout.addView(t1);
        layout.addView(e1);
        layout.addView(t3);
        layout.addView(e2);
        layout.addView(t4);
        layout.addView(e3);
        layout.addView(b1);
        layout.addView(t2);
        layout.addView(t5);
        layout.addView(t6);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        this.addContentView(layout,params);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = e1.getText().toString();
                t2.setText(str1);
                String str2 = e2.getText().toString();
                t5.setText(str2);
                String str3 = e3.getText().toString();
                t6.setText(str3);
            }
        });
    }
}