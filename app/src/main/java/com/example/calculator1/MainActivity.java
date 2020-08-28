package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private Button equal;
    private Button clear;
    private TextView info;
    private TextView result;
    private final char Addition='+';
    private final char Subtraction='-';
    private final char Multiplication='*';
    private final char Division='/';
    private final char Equal='0';
    private double val1=Double.NaN;
    private double val2;
    private char Action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "0");

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "2");

            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "4");

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "5");

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "6");

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "7");

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "8");

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "9");

            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                Action=Addition;
                result.setText(String.valueOf(val1 + "+"));
                info.setText(null);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                Action=Subtraction;
                result.setText(String.valueOf(val1 + "-"));
                info.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                Action=Multiplication;
                result.setText(String.valueOf(val1 + "*"));
                info.setText(null);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                Action=Division;
                result.setText(String.valueOf(val1 + "/"));
                info.setText(null);
            }
        });

            equal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    compute();
                    Action=Equal;
                    result.setText(result.getText().toString() + String.valueOf(val2)+ "="+String.valueOf(val1));
                    info.setText(null);
                }
            });

            clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(info.getText().length()>0){
                        CharSequence name= info.getText().toString();
                        info.setText(name.subSequence(0,name.length()-1));
                    }
                    else{
                        val1=Double.NaN;
                        val2=Double.NaN;
                        info.setText(null);
                        result.setText(null);
                    }
                }
            });







    }
        private void setupUIViews(){

            zero=(Button) findViewById(R.id.Button0);
            one=(Button) findViewById(R.id.Button1);
            two=(Button) findViewById(R.id.Button2);
            three=(Button) findViewById(R.id.Button3);
            four=(Button) findViewById(R.id.Button4);
            five=(Button) findViewById(R.id.Button5);
            six=(Button) findViewById(R.id.Button6);
            seven=(Button) findViewById(R.id.Button7);
            eight=(Button) findViewById(R.id.Button8);
            nine =(Button) findViewById(R.id.Button9);
            add=(Button) findViewById(R.id.Add);
            subtract=(Button) findViewById(R.id.Subtract);
            multiply=(Button) findViewById(R.id.Multiply);
            divide=(Button) findViewById(R.id.Divide);
            equal=(Button) findViewById(R.id.Equal);
            clear=(Button) findViewById(R.id.Clear);
            info=(TextView) findViewById(R.id.Control);
            result=(TextView) findViewById(R.id.Result);
        }

            private void compute() {
                if (!Double.isNaN(val1)) {
                    val2=  Double.parseDouble(info.getText().toString());

                    switch(Action){
                        case Addition:
                            val1= val1+val2;
                            break;
                        case Subtraction:
                            val1= val1-val2;
                            break;
                        case Multiplication:
                            val1= val1*val2;
                            break;
                        case Division:
                            val1= val1/val2;
                            break;
                        case Equal:
                                break;
                    }


                }
                else{

                    val1=  Double.parseDouble(info.getText().toString());



                }

            }




    }
