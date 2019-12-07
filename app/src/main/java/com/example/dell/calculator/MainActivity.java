package com.example.dell.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean isOppressed = false;
    private double num1=0;
    private double num2=0;
    char currop;
    private int secind;
    String displaytext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtscreen=(TextView)findViewById(R.id.t1);
        final Button b0=(Button)findViewById(R.id.b0);
        final Button b1=(Button)findViewById(R.id.b1);
        final Button b2=(Button)findViewById(R.id.b2);
        final Button b3=(Button)findViewById(R.id.b3);
        final Button b4=(Button)findViewById(R.id.b4);
        final Button b5=(Button)findViewById(R.id.b5);
        final Button b6=(Button)findViewById(R.id.b6);
        final Button b7=(Button)findViewById(R.id.b7);
        final Button b8=(Button)findViewById(R.id.b8);
        final Button b9=(Button)findViewById(R.id.b9);
        final Button dot=(Button)findViewById(R.id.b);
        final Button addition=(Button)findViewById(R.id.plus);
        final Button multiplication=(Button)findViewById(R.id.multiply);
        final Button subtraction=(Button)findViewById(R.id.minus);
        final Button division=(Button)findViewById(R.id.divide);
        final Button eq=(Button)findViewById(R.id.bise);


        final View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final int id=v.getId();
                switch (id)
                {
                    case R.id.b0:
                        txtscreen.append("0");
                        break;
                    case R.id.b1:
                        txtscreen.append("1");
                        break;
                    case R.id.b2:
                        txtscreen.append("2");
                        break;
                    case R.id.b3:
                        txtscreen.append("3");
                        break;
                    case R.id.b4:
                        txtscreen.append("4");
                        break;
                    case R.id.b5:
                        txtscreen.append("5");
                        break;
                    case R.id.b6:
                        txtscreen.append("6");
                        break;
                    case R.id.b7:
                        txtscreen.append("7");
                        break;
                    case R.id.b8:
                        txtscreen.append("8");
                        break;
                    case R.id.b9:
                        txtscreen.append("9");
                        break;
                    case R.id.b:
                        txtscreen.append(".");
                        break;
                    case R.id.bise:
                        if(isOppressed)
                        {
                            String s=txtscreen.getText().toString();
                            num2=Double.parseDouble(s.substring(secind,s.length()));

                            if(currop=='+')
                            {
                                num2+=num1;
                                txtscreen.setText(String.valueOf(num2));
                            }
                            if(currop=='-')
                            {
                                num1-=num2;
                                txtscreen.setText(String.valueOf(num1));
                            }
                            if(currop=='*')
                            {
                                num2*=num1;
                                txtscreen.setText(String.valueOf(num2));
                            }
                            if(currop=='/')
                            {
                                num1/=num2;
                                txtscreen.setText(String.valueOf(num1));
                            }
                        }
                        break;
                    case R.id.plus:
                        String s=txtscreen.getText().toString();
                        num1=Double.parseDouble(s);
                        int l=s.length();
                        secind=l+1;
                        isOppressed=true;
                        currop='+';
                        txtscreen.append("+");
                        break;
                    case R.id.minus:
                        String s1=txtscreen.getText().toString();
                        num1=Double.parseDouble(s1);
                        int l1=s1.length();
                        secind=l1+1;
                        isOppressed=true;
                        currop='-';
                        txtscreen.append("-");
                        break;
                    case R.id.multiply:
                        String s2=txtscreen.getText().toString();
                        num1=Double.parseDouble(s2);
                        int l2=s2.length();
                        secind=l2+1;
                        isOppressed=true;
                        currop='*';
                        txtscreen.append("*");
                        break;
                    case R.id.divide:
                        String s3=txtscreen.getText().toString();
                        num1=Double.parseDouble(s3);
                        int l3=s3.length();
                        secind=l3+1;
                        isOppressed=true;
                        currop='/';
                        txtscreen.append("/");
                        break;
                }
            }
        };
        b0.setOnClickListener(calculatorListener);
        b1.setOnClickListener(calculatorListener);
        b2.setOnClickListener(calculatorListener);
        b3.setOnClickListener(calculatorListener);
        b4.setOnClickListener(calculatorListener);
        b5.setOnClickListener(calculatorListener);
        b6.setOnClickListener(calculatorListener);
        b7.setOnClickListener(calculatorListener);
        b8.setOnClickListener(calculatorListener);
        b9.setOnClickListener(calculatorListener);
        dot.setOnClickListener(calculatorListener);
        addition.setOnClickListener(calculatorListener);
        multiplication.setOnClickListener(calculatorListener);
        subtraction.setOnClickListener(calculatorListener);
        division.setOnClickListener(calculatorListener);
        eq.setOnClickListener(calculatorListener);

        final Button delete=findViewById(R.id.del);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displaytext=txtscreen.getText().toString();
                int l=displaytext.length();
                if(l>0)
                displaytext=displaytext.substring(0,l-1);
                txtscreen.setText(displaytext);
            }
        });
        final Button clr=findViewById(R.id.clear);
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // displaytext=txtscreen.getText().toString();
                txtscreen.setText("");
            }
        });

//    if(savedInstanceState!=null)
//    {
//        String disp=savedInstanceState.getString("kk");
//        txtscreen.setText(disp);
//    }
    }
//    @Override
//    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
//        outState.putString("kk",displaytext);
//        super.onSaveInstanceState(outState, outPersistentState);
//    }
//
//    @Override
//    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        txtscreen.setText(savedInstanceState.getString("kk"));
//    }
}
