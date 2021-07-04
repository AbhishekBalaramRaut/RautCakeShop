package com.abhishek.rautcakes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String TAG="Home page";
    TextView textView;
    Button signIn, signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);

        signIn = (Button) findViewById(R.id.signIn);
        signUp = (Button) findViewById(R.id.signup);

        signIn.setOnClickListener(this);
        signUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.signIn:
                Log.d(TAG," clicked signin started");
                textView.setText("Awesome, you signed in");
                Toast.makeText(this,"You clicked singin new", Toast.LENGTH_SHORT).show();
                Log.i(TAG," clicked signin");
                break;
            case R.id.signup:
                textView.setText("Awesome, you signed up");
                Toast.makeText(this,"You clicked signup new", Toast.LENGTH_SHORT).show();
                Log.i(TAG," clicked signup");
                break;
        }
    }
}