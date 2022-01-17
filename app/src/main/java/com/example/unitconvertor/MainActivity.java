package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView outputTextView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        outputTextView=findViewById(R.id.outputTextView);
        editText=findViewById(R.id.editText);

        //one way to add functionality on button click

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Hi this is toast", Toast.LENGTH_SHORT).show();
//                String s=editText.getText().toString();
//                int kg=Integer.parseInt(s);
//                double pound=2.205*kg;
//                outputTextView.setText("Corresponding pound value is"+pound);
//            }
//        });

        //other way to add functionality on button from action menu in UI of button attribute
    }

    public void calculate(View view){
        String s=editText.getText().toString();
        int a=Integer.parseInt(s);
        double pound=2.205*a;
        outputTextView.setText("Corresponding pound value is"+pound);
    }
}