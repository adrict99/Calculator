package com.adrict99.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    double mFirst;
    double mSecond;
    String operation;

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
        final TextView liveOperations = findViewById(R.id.liveTextView);
        final EditText operationNumbers = findViewById(R.id.resultEditText);

        operationNumbers.setInputType(InputType.TYPE_NULL);

        btn1.setOnClickListener(v -> {
          operationNumbers.setText(operationNumbers.getText() + "1");
//          liveOperations.setText(operationNumbers.getText());
       });
        btn2.setOnClickListener(v -> {
            operationNumbers.setText(operationNumbers.getText() + "2");
//            setLiveOperations(liveOperations, operationNumbers);
        });
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
        buttonMoreLess.setOnClickListener(v -> {
            try {
                double converter = Double.parseDouble(String.valueOf(operationNumbers.getText())) * -1;
                operationNumbers.setText(String.valueOf(converter));
            } catch (Exception e) {
                Toast.makeText(this, "You must enter some numbers...", Toast.LENGTH_SHORT).show();
                operationNumbers.setText(null);
            }
        });
        btnCE.setOnClickListener(v -> {
            operationNumbers.setText("");
        });
        //TODO: Fix bugs:
        //TODO: Bug 1. Check history method to see how it is working in detail
        //TODO: Bug 2. Implement repetitive functions on methods
        //TODO: Bug 3. Finish liveOperations method implementation
        //TODO: Bug 4. Make prints in the history shorter, there are spaces that must be included with the symbol
        //TODO: Add @onPause at least to store the values in the operationNumbers text and the histories when @onPause tutorial curso 1
        //TODO: Change theme light to dark and viceversa on onClick
        //TODO: Add superscript to 10RaisedToX result
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
                        Double resultPlus = mFirst + mSecond;
                        operationNumbers.setText(resultPlus.toString());
                        historyThree.setText(historyTwo.getText());
                        historyTwo.setText(historyOne.getText());
                        historyOne.setText(mFirst + " " + "+" + " " + mSecond + " = " + resultPlus);
                        break;
                    case "Minus" :
                        mSecond = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                        Double resultMinus = mFirst - mSecond;
                        operationNumbers.setText(resultMinus.toString());
                        historyThree.setText(historyTwo.getText());
                        historyTwo.setText(historyOne.getText());
                        historyOne.setText(mFirst + " " + "-" + " " + mSecond + " = " + resultMinus);
                        break;
                    case "Times" :
                        mSecond = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                        Double resultTimes = mFirst * mSecond;
                        operationNumbers.setText(resultTimes.toString());
                        historyThree.setText(historyTwo.getText());
                        historyTwo.setText(historyOne.getText());
                        historyOne.setText(mFirst + " " + "*" + " " + mSecond + " = " + resultTimes);
                        break;
                    case "Div" :
                        mSecond = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                        Double resultDiv = mFirst / mSecond;
                        operationNumbers.setText(resultDiv.toString());
                        historyThree.setText(historyTwo.getText());
                        historyTwo.setText(historyOne.getText());
                        historyOne.setText(mFirst + " / " + mSecond + " = " + resultDiv);
                        break;
                    case "Percentage" :
                        mSecond = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                        Double resultPercentage = (mFirst / 100) * mSecond;
                        operationNumbers.setText(resultPercentage.toString());
                        historyThree.setText(historyTwo.getText());
                        historyTwo.setText(historyOne.getText());
                        historyOne.setText(mFirst + " % " + mSecond + " = " + resultPercentage);
                        break;
                    case "Raise" :
                        mSecond = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                        double resultRaise = Math.pow(mFirst, mSecond);
                        operationNumbers.setText(String.valueOf(resultRaise));
                        historyThree.setText(historyTwo.getText());
                        historyTwo.setText(historyOne.getText());
                        historyOne.setText(mFirst + " " + " raised to " + " " + mSecond + " = " + resultRaise);
                        break;
                    case "Root" :
                        mSecond = Double.parseDouble(String.valueOf(operationNumbers.getText()));
                        double resultRoot = Math.pow(mFirst, (1/mSecond));
                        operationNumbers.setText(String.valueOf(resultRoot));
                        historyThree.setText(historyTwo.getText());
                        historyTwo.setText(historyOne.getText());
                        historyOne.setText(mFirst + " ⁿ√ₓ " + mSecond + " = " + resultRoot);
                        break;
                    case "OneXof" :
                        double resultOneXof = 1 / mFirst;
                        operationNumbers.setText(String.valueOf(resultOneXof));
                        historyThree.setText(historyTwo.getText());
                        historyTwo.setText(historyOne.getText());
                        historyOne.setText("1/" + mFirst + " = " + resultOneXof);
                        break;
                    case "TenRaisedTo" :
                        double resultTenRaisedTo = Math.pow(10,mFirst);
                        operationNumbers.setText(String.valueOf(resultTenRaisedTo));
                        historyThree.setText(historyTwo.getText());
                        historyTwo.setText(historyOne.getText());
                        historyOne.setText( mFirst + " raised to " + mSecond + " = " + resultTenRaisedTo);
                        break;
                }
            }  catch (Exception e) {
                Toast.makeText(this, "You must enter valid numbers...", Toast.LENGTH_SHORT).show();
                operationNumbers.setText(null);
            }
        });
    }
//    public static void setLiveOperations(TextView liveOperations, EditText operationNumbers){
//        liveOperations.setText(operationNumbers.getText());
//    }
//    public static void setHistoryOperations(TextView historyOne, TextView historyTwo, TextView historyThree, String historyText){
//        historyThree.setText(historyTwo.getText());
//        historyTwo.setText(historyOne.getText());
//        historyOne.setText(historyText);
//    }
}