package com.abhishek.rautcakes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String TAG="Home page";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);

        Button signup = findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Awesome, you signed up");
                Toast.makeText(signup.getContext(),"You clicked signup ", Toast.LENGTH_SHORT).show();
                Log.i(TAG," clicked signup");
            }
        });
    }

    public void signInClicked(View view) {
        textView.setText("Awesome, you signed in");
        Toast.makeText(this,"You clicked singin ", Toast.LENGTH_SHORT).show();
        Log.i(TAG," clicked signin");
    }
}