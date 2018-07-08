package com.example.hp.sample_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button ok_btn;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ok_btn =(Button)findViewById(R.id.okbtn);
        editText =(EditText)findViewById(R.id.edt);


        //button click listner
        ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"button clicked",Toast.LENGTH_LONG).show();
            }
        });


    }
}
