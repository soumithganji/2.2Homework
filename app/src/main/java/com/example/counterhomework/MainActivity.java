package com.example.counterhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText EditText;
    private int mCount=0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText = findViewById(R.id.editText);
        mShowCount = findViewById(R.id.textView3);
        if (savedInstanceState != null) {
            boolean isVisible = savedInstanceState.getBoolean("reply_visible");
            if (isVisible) {
                mShowCount.setText(savedInstanceState.getString("reply_text"));
            }
        }
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text",mShowCount.getText().toString());
        }

    public void countUp(View view) {
        mCount++;
        //if (mShowCount != null)
        mShowCount.setText(Integer.toString(mCount));
    }
}
