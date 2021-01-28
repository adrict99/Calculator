package com.adrict99.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.Math;

//TODO: Bug 1. Pseudocode liveOperations function
//TODO: Add @onPause at least to store the values in the operationNumbers text and the histories when @onPause
//TODO: Change theme light to dark and viceversa on onClick
//TODO: Add superscript to 10RaisedToX result

public class MainActivity extends AppCompatActivity {

    double mFirst;
    double mSecond;
    String operation;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonPlus = findViewById(R.id.btnPlus);
        final Button buttonTimes = findViewById(R.id.btnTimes);
        final Button buttonDiv = findViewById(R.id.btnDiv);
        final Button buttonEqual = findViewById(R.id.btnEqual);
        final Button buttonMinus = findViewById(R.id.btnMinus);
        final Button buttonPercentage = findViewById(R.id.btnPerc);
        final Button buttonRaise = findViewById(R.id.btnRaise);
        final Button buttonSquareRoot = findViewById(R.id.btnRoot);
        final Button buttonPi = findViewById(R.id.btnPi);
        final Button buttonOneXof = findViewById(R.id.btnOneOfx);
        final Button buttonTenRaisedTo = findViewById(R.id.btnTenRaisedTo);
        final Button buttonMoreLess = findViewById(R.id.btnMoreLess);
        final Button btn1 = findViewById(R.id.num1);
        final Button btn2 = findViewById(R.id.num2);
        final Button btn3 = findViewById(R.id.num3);
        final Button btn4 = findViewById(R.id.num4);
        final Button btn5 = findViewById(R.id.num5);
        final Button btn6 = findViewById(R.id.num6);
        final Button btn7 = findViewById(R.id.num7);
        final Button btn8 = findViewById(R.id.num8);
        final Button btn9 = findViewById(R.id.num9);
        final Button btn0 = findViewById(R.id.num0);
        final Button btnComma = findViewById(R.id.btnComma);
        final Button btnCE = findViewById(R.id.btnCE);
        final TextView historyOne = findViewById(R.id.historyTextView);
        final TextView historyTwo = findViewById(R.id.history2TextView);
        final TextView historyThree = findViewById(R.id.history3TextView);
//        final TextView liveOperations = findViewById(R.id.liveTextView);
        final EditText operationNumbers = findViewById(R.id.resultEditText);

        operationNumbers.setInputType(InputType.TYPE_NULL);

        btn1.setOnClickListener(v -> operationNumbers.setText(operationNumbers.getText() + "1"));
        btn2.setOnClickListener(v -> operationNumbers.setText(operationNumbers.getText() + "2"));
        btn3.setOnClickListener(v -> operationNumbers.setText(operationNumbers.getText() + "3"));
        btn4.setOnClickListener(v -> operationNumbers.setText(operationNumbers.getText() + "4"));
        btn5.setOnClickListener(v -> operationNumbers.setText(operationNumbers.getText() + "5"));
        btn6.setOnClickListener(v -> operationNumbers.setText(operationNumbers.getText() + "6"));
        btn7.setOnClickListener(v -> operationNumbers.setText(operationNumbers.getText() + "7"));
        btn8.setOnClickListener(v -> operationNumbers.setText(operationNumbers.getText() + "8"));
        btn9.setOnClickListener(v -> operationNumbers.setText(operationNumbers.getText() + "9"));
        btn0.setOnClickListener(v -> operationNumbers.setText(operationNumbers.getText() + "0"));
        btnComma.setOnClickListener(v -> operationNumbers.setText(operationNumbers.getText() + "."));
        buttonPi.setOnClickListener(v -> operationNumbers.setText(operationNumbers.getText() + "3.141592"));
        btnCE.setOnClickListener(v -> operationNumbers.setText(""));
        buttonMoreLess.setOnClickListener(v -> {
            try {
                double converter = Double.parseDouble(String.valueOf(operationNumbers.getText())) * -1;
                operationNumbers.setText(String.valueOf(converter));
            } catch (Exception e) {
                Toast.makeText(MainActivity.this, "You must enter some numbers...", Toast.LENGTH_SHORT).show();
                operationNumbers.setText(null);
            }
        });

        buttonPlus.setOnClickListener(v -> {
            try {
                mFirst = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                operation = "Plus";
                operationNumbers.setText(null);
            }catch (Exception e) {
                Toast.makeText(this, "You must enter some numbers...", Toast.LENGTH_SHORT).show();
                operationNumbers.setText(null);
            }
        });
        buttonMinus.setOnClickListener(v -> {
            try {
                mFirst = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                operation = "Minus";
                operationNumbers.setText(null);
            } catch (Exception e) {
                Toast.makeText(this, "You must enter some numbers...", Toast.LENGTH_SHORT).show();
                operationNumbers.setText(null);
            }
        });
        buttonTimes.setOnClickListener(v -> {
            try {
                mFirst = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                operation = "Times";
                operationNumbers.setText(null);
            } catch (Exception e) {
                Toast.makeText(this, "You must enter some numbers...", Toast.LENGTH_SHORT).show();
                operationNumbers.setText(null);
            }
        });
        buttonDiv.setOnClickListener(v -> {
            try {
                mFirst = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                operation = "Div";
                operationNumbers.setText(null);
            } catch (Exception e) {
                Toast.makeText(this, "You must enter some numbers...", Toast.LENGTH_SHORT).show();
                operationNumbers.setText(null);
            }
        });
        buttonPercentage.setOnClickListener(v -> {
            try {
                mFirst = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                operation = "Percentage";
                operationNumbers.setText(null);
            } catch (Exception e) {
                Toast.makeText(this, "You must enter some numbers...", Toast.LENGTH_SHORT).show();
                operationNumbers.setText(null);
            }
        });
        buttonRaise.setOnClickListener(v -> {
            try {
                mFirst = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                operation = "Raise";
                operationNumbers.setText(null);
            } catch (Exception e) {
                Toast.makeText(this, "You must enter some numbers...", Toast.LENGTH_SHORT).show();
                operationNumbers.setText(null);
            }
        });
        buttonSquareRoot.setOnClickListener(v -> {
            try {
                mFirst = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                operation = "Root";
                operationNumbers.setText(null);
            } catch (Exception e) {
                Toast.makeText(this, "You must enter some numbers...", Toast.LENGTH_SHORT).show();
                operationNumbers.setText(null);
            }
        });
        buttonOneXof.setOnClickListener(v -> {
            try {
                mFirst = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                operation = "OneXof";
                operationNumbers.setText(null);
            } catch (Exception e) {
                Toast.makeText(this, "You must enter some numbers...", Toast.LENGTH_SHORT).show();
                operationNumbers.setText(null);
            }
        });
        buttonTenRaisedTo.setOnClickListener(v -> {
            try {
                mFirst = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                operation = "TenRaisedTo";
                operationNumbers.setText(null);
            } catch (Exception e) {
                Toast.makeText(this, "You must enter some numbers...", Toast.LENGTH_SHORT).show();
                operationNumbers.setText(null);
            }
        });
        buttonEqual.setOnClickListener(v -> {
            try {
                switch (operation){
                    case "Plus" :
                        mSecond = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                        double resultPlus = mFirst + mSecond;
                        String textPlus = mFirst + " + " + mSecond + " = " + resultPlus;
                        OperationsHistory(historyOne, historyTwo, historyThree, textPlus, resultPlus, operationNumbers);
                        break;
                    case "Minus" :
                        mSecond = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                        double resultMinus = mFirst - mSecond;
                        String textMinus = mFirst + " - " + mSecond + " = " + resultMinus;
                        OperationsHistory(historyOne, historyTwo, historyThree, textMinus, resultMinus, operationNumbers);
                        break;
                    case "Times" :
                        mSecond = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                        double resultTimes = mFirst * mSecond;
                        String textTimes = mFirst + " * " + mSecond + " = " + resultTimes;
                        OperationsHistory(historyOne, historyTwo, historyThree, textTimes, resultTimes, operationNumbers);
                        break;
                    case "Div" :
                        mSecond = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                        double resultDiv = mFirst / mSecond;
                        String textDiv = mFirst + " / " + mSecond + " = " + resultDiv;
                        OperationsHistory(historyOne, historyTwo, historyThree, textDiv, resultDiv, operationNumbers);
                        break;
                    case "Percentage" :
                        mSecond = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                        double resultPercentage = (mFirst / 100) * mSecond;
                        String textPercentage = mFirst + " % of " + mSecond + " = " + resultPercentage;
                        OperationsHistory(historyOne, historyTwo, historyThree, textPercentage, resultPercentage, operationNumbers);
                        break;
                    case "Raise" :
                        mSecond = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                        double resultRaise = Math.pow(mFirst, mSecond);
                        String textRaise = mFirst + " " + " raised to " + " " + mSecond + " = " + resultRaise;
                        OperationsHistory(historyOne, historyTwo, historyThree, textRaise, resultRaise, operationNumbers);
                        break;
                    case "Root" :
                        mSecond = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                        double resultRoot = Math.pow(mFirst, (1/mSecond));
                        String textRoot = mFirst + " √ of " + mSecond + " = " + resultRoot;
                        OperationsHistory(historyOne, historyTwo, historyThree, textRoot, resultRoot, operationNumbers);
                        break;
                    case "OneXof" :
                        double resultOneXof = 1 / mFirst;
                        String textOneXof = "1 / " + mFirst + " = " + resultOneXof;
                        OperationsHistory(historyOne, historyTwo, historyThree, textOneXof, resultOneXof, operationNumbers);
                        break;
                    case "TenRaisedTo" :
                        double resultTenRaisedTo = Math.pow(10,mFirst);
                        String textTenRaisedTo = "10 raised to " + mFirst + " = " + resultTenRaisedTo;
                        OperationsHistory(historyOne, historyTwo, historyThree, textTenRaisedTo, resultTenRaisedTo, operationNumbers);
                        break;
                }
            }  catch (Exception e) {
                Toast.makeText(this, "You must enter valid numbers...", Toast.LENGTH_SHORT).show();
                operationNumbers.setText(null);
            }
        });
    }

    public static void OperationsHistory(TextView historyOne, TextView historyTwo, TextView historyThree, String historyText, double result, EditText operationNumbers){
        operationNumbers.setText(String.valueOf(result));
        historyThree.setText(historyTwo.getText());
        historyTwo.setText(historyOne.getText());
        historyOne.setText(historyText);
    }
}