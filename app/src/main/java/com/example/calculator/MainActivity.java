package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnZero;
    Button doubleZero;
    Button btnDot;
    Button btnEqual;
    Button btnAdd;
    Button btnMinus;
    Button btnMultiply;
    Button btnDivide;
    Button btnClear;
    Button btnBackspace;
    TextView input;
    TextView result;
    String curr;
    String res;
    boolean dot_inserted;
    boolean operator_inserted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        curr = "";
        res = "";
        dot_inserted = false;
        operator_inserted = false;

        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnZero = (Button) findViewById(R.id.btnZero);
        doubleZero = (Button) findViewById(R.id.doubleZero);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnBackspace = (Button) findViewById(R.id.btnBackspace);
        input = (TextView) findViewById(R.id.input);
        result = (TextView) findViewById(R.id.result);


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = input.getText().toString();
                input.setText(curr + "1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = input.getText().toString();
                input.setText(curr + "2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = input.getText().toString();
                input.setText(curr + "3");
            }
        });


        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = input.getText().toString();
                input.setText(curr + "4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = input.getText().toString();
                input.setText(curr + "5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = input.getText().toString();
                input.setText(curr + "6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = input.getText().toString();
                input.setText(curr + "7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = input.getText().toString();
                input.setText(curr + "8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = input.getText().toString();
                input.setText(curr + "9");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = input.getText().toString();
                input.setText(curr + "0");
            }
        });

        doubleZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = input.getText().toString();
                input.setText(curr + "00");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = input.getText().toString();
                input.setText(curr + "1");
            }
        });



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = input.getText().toString();
                dot_inserted = false;

                if (!curr.isEmpty()) {
                    if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                        backspace();
                    }

                    if (operator_inserted == false) {
                        curr = curr + " + ";
                        operator_inserted = true;
                    }
                }
                input.setText(curr);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = input.getText().toString();
                dot_inserted = false;

                if (!curr.isEmpty()) {
                    if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                        backspace();
                    }

                    if (operator_inserted == false) {
                        curr = curr + " - ";
                        operator_inserted = true;
                    }
                }
                input.setText(curr);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = input.getText().toString();
                dot_inserted = false;

                if (!curr.isEmpty()) {
                    if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                        backspace();
                    }

                    if (operator_inserted == false) {
                        curr = curr + " * ";
                        operator_inserted = true;
                    }
                }
                input.setText(curr);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = input.getText().toString();
                dot_inserted = false;

                if (!curr.isEmpty()) {
                    if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                        backspace();
                    }

                    if (operator_inserted == false) {
                        curr = curr + " / ";
                        operator_inserted = true;
                    }
                }
                input.setText(curr);
            }
        });


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");
                result.setText("");
                dot_inserted = false;
                operator_inserted = false;
            }
        });

        btnBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = input.getText().toString();
                backspace();
                input.setText(curr);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = input.getText().toString();
                if (operator_inserted == true && !curr.substring(curr.length() - 1, curr.length()).equals(" ")) {
                    String[] tokens = curr.split(" ");
                    switch (tokens[1].charAt(0)) {
                        case '+':
                            res = Double.toString(Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[2]));
                            break;

                        case '-':
                            res = Double.toString(Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]));
                            break;

                        case '*':
                            res = Double.toString(Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]));
                            break;

                        case '/':
                            res = Double.toString(Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]));
                            break;
                    }
                    result.setText(res);
                }
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = input.getText().toString();
                if (curr.isEmpty()) {
                    curr = "0.";
                    dot_inserted = true;
                }

                if (dot_inserted == false) {
                    curr = curr + ".";
                    dot_inserted = true;
                }

                input.setText(curr);
            }
        });
    }

    public void threeOnClick(View view) {
        curr = input.getText().toString();
        input.setText(curr + "3");
    }

    public void backspace() {
        if (!curr.isEmpty()) {
            if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                dot_inserted = false;
            }

            if (curr.substring(curr.length() - 1, curr.length()).equals(" ")) {
                curr = curr.substring(0, curr.length() - 3);
                operator_inserted = false;
            } else {
                curr = curr.substring(0, curr.length() - 1);
            }
        }
    }
}