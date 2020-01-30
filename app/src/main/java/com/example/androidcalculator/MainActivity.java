package com.example.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8,
            button9, buttonAdd, buttonSub, buttonDiv, buttonMul, button10, buttonC, buttonEqual;

    EditText calculatorTextField;

    float numValueOne, numValueTwo;

    boolean calcAdd, calcSub, calcMul, calcDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMul = findViewById(R.id.buttonMul);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonC = findViewById(R.id.buttonC);
        calculatorTextField = findViewById(R.id.calculatorTextField);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorTextField.setText(calculatorTextField.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorTextField.setText(calculatorTextField.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorTextField.setText(calculatorTextField.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorTextField.setText(calculatorTextField.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorTextField.setText(calculatorTextField.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorTextField.setText(calculatorTextField.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorTextField.setText(calculatorTextField.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorTextField.setText(calculatorTextField.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorTextField.setText(calculatorTextField.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorTextField.setText(calculatorTextField.getText() + "0");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorTextField.setText(calculatorTextField.getText() + ".");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorTextField.setText("");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculatorTextField == null) {
                    calculatorTextField.setText("");
                } else {
                    numValueOne = Float.parseFloat(calculatorTextField.getText() + "");
                    calcAdd = true;
                    calculatorTextField.setText("");
                }

            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numValueOne = Float.parseFloat(calculatorTextField.getText() + "");
                calcSub = true;
                calculatorTextField.setText("");
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numValueOne = Float.parseFloat(calculatorTextField.getText() + "");
                calcMul = true;
                calculatorTextField.setText("");
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numValueOne = Float.parseFloat(calculatorTextField.getText() + "");
                calcDiv = true;
                calculatorTextField.setText("");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numValueTwo = Float.parseFloat(calculatorTextField.getText() + "");

                if (calcAdd == true) {
                    calculatorTextField.setText(numValueOne + numValueTwo + "");
                    calcAdd = false;
                }
                if (calcSub == true) {
                    calculatorTextField.setText(numValueOne - numValueTwo + "");
                    calcSub = false;
                }
                if (calcMul == true) {
                    calculatorTextField.setText(numValueOne * numValueTwo + "");
                    calcMul = false;
                }
                if (calcDiv == true) {
                    calculatorTextField.setText(numValueOne / numValueTwo + "");
                    calcDiv = false;
                }
            }
        });




    }
}
