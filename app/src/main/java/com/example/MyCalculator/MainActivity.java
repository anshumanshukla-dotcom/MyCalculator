package com.example.MyCalculator;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    TextView t1;
    int num1;
    int num2;
    Button button_add;
    Button button_sub;
    Button button_mul;
    Button button_div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // defining the edit text 1 to e1
        e1 = (EditText) findViewById(R.id.editTextTextPersonName);
        // defining the edit text 2 to e2
        e2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        e1.setHint("Enter the first value...");
        e2.setHint("Enter the second value...");
        button_add = findViewById(R.id.button2);
        button_sub = findViewById(R.id.button3);
        button_mul = findViewById(R.id.button4);
        button_div = findViewById(R.id.button5);
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You've just pressed \"+\" button!", Toast.LENGTH_SHORT).show();
                getNumbers();
                doSum(null);
            }
        });
        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You've just pressed \"-\" button!", Toast.LENGTH_SHORT).show();
                getNumbers();
                doSub(null);
            }
        });
        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You've just pressed \"*\" button!", Toast.LENGTH_SHORT).show();
                getNumbers();
                doMul(null);
            }
        });
        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You've just pressed \"/\" button!", Toast.LENGTH_SHORT).show();
                getNumbers();
                doDiv(null);
            }
        });
    }

    // a public method to get the input numbers
    public boolean getNumbers() {
        // defining the text view to t1
        t1 = (TextView) findViewById(R.id.textView4);
        // taking input from text box 1
        String s1 = e1.getText().toString();
        // taking input from text box 2
        String s2 = e2.getText().toString();
        // condition to check if box is not empty
        if ((s1.equals("") || s2.equals("")) || (s1.equals("") && s2.equals(""))) {
            String result = "Please enter two values!!!";
            t1.setText(result);
            return false;
        } else {
            // converting string to int
            num1 = Integer.parseInt(s1);
            num2 = Integer.parseInt(s2);
        }
        return true;
    }
    // a public method to perform addition
    public void doSum(View v) {
        // get the input numbers
        if (getNumbers()) {
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));
        }
    }
    // a public method to perform subtraction
    public void doSub(View v) {
        // get the input numbers
        if (getNumbers()) {
            int sum = num1 - num2;
            t1.setText(Integer.toString(sum));
        }
    }
    // a public method to perform multiplication
    public void doMul(View v) {
        // get the input numbers
        if (getNumbers()) {
            int sum = num1 * num2;
            t1.setText(Integer.toString(sum));
        }
    }
    // a public method to perform division
    public void doDiv(View v) {
        // get the input numbers
        if (getNumbers()) {
            // displaying the text in text view assigned as t1
            double sum = num1 / (num2 * 1.0);
            t1.setText(Double.toString(sum));
        }
    }
}