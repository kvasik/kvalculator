package com.example.vlad.kvalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView textView;
    private float textSize = 70f;

    Button btn[] = new Button[16];

    String mainStr = "";
    String mainStr2;
    long mainNum;
    long mainNum2;

    char c;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);

        btn[0] = (Button)findViewById(R.id.button0);
        btn[1] = (Button)findViewById(R.id.button1);
        btn[2] = (Button)findViewById(R.id.button2);
        btn[3] = (Button)findViewById(R.id.button3);
        btn[4] = (Button)findViewById(R.id.button4);
        btn[5] = (Button)findViewById(R.id.button5);
        btn[6] = (Button)findViewById(R.id.button6);
        btn[7] = (Button)findViewById(R.id.button7);
        btn[8] = (Button)findViewById(R.id.button8);
        btn[9] = (Button)findViewById(R.id.button9);
        btn[10] = (Button)findViewById(R.id.plus);
        btn[11] = (Button)findViewById(R.id.devide);
        btn[12] = (Button)findViewById(R.id.minus);
        btn[13] = (Button)findViewById(R.id.mult);
        btn[14] = (Button)findViewById(R.id.equals);
        btn[15] = (Button)findViewById(R.id.vstep);

        for(int i = 0; i<16; i++)
            btn[i].setOnClickListener(this);
    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.button0:
                if(mainStr.equals("0"))
                    mainStr = "";
                mainStr += "0";
                break;

            case R.id.button1:
                if(mainStr.equals("0"))
                    mainStr = "";
                mainStr += "1";
                break;

            case R.id.button2:
                if(mainStr.equals("0"))
                    mainStr = "";
                mainStr += "2";
                break;

            case R.id.button3:
                if(mainStr.equals("0"))
                    mainStr = "";
                mainStr += "3";
                break;

            case R.id.button4:
                if(mainStr.equals("0"))
                    mainStr = "";
                mainStr += "4";
                break;

            case R.id.button5:
                if(mainStr.equals("0"))
                    mainStr = "";
                mainStr += "5";
                break;

            case R.id.button6:
                if(mainStr.equals("0"))
                    mainStr = "";
                mainStr += "6";
                break;

            case R.id.button7:
                if(mainStr.equals("0"))
                    mainStr = "";
                mainStr += "7";
                break;

            case R.id.button8:
                if(mainStr.equals("0"))
                    mainStr = "";
                mainStr += "8";
                break;

            case R.id.button9:
                if(mainStr.equals("0"))
                    mainStr = "";
                mainStr += "9";
                break;

            case R.id.equals:
                if(!mainStr.isEmpty())
                    textView.setText(mainStr);

                if(c == '*' && !mainStr2.isEmpty())
                {
                    mainNum2 = Long.parseLong(mainStr);
                    mainNum = Long.parseLong(mainStr2);

                    mainNum *= mainNum2;
                    mainStr = Long.toString(mainNum);
                }
                if(c == '+' && !mainStr2.isEmpty())
                {
                    mainNum2 = Long.parseLong(mainStr);
                    mainNum = Long.parseLong(mainStr2);

                    mainNum += mainNum2;
                    mainStr = Long.toString(mainNum);
                }
                if(c == '-' && !mainStr2.isEmpty())
                {
                    mainNum2 = Long.parseLong(mainStr);
                    mainNum = Long.parseLong(mainStr2);

                    mainNum -= mainNum2;
                    mainStr = Long.toString(mainNum);
                }
                if(c == '/' && !mainStr2.isEmpty())
                {
                    mainNum2 = Long.parseLong(mainStr);
                    mainNum = Long.parseLong(mainStr2);

                    mainNum /= mainNum2;
                    mainStr = Long.toString(mainNum);
                }
                if(c == '^' && !mainStr2.isEmpty())
                {
                    mainNum2 = Long.parseLong(mainStr);
                    mainNum = Long.parseLong(mainStr2);

                    Math.pow(mainNum,mainNum2);
                    mainStr = Long.toString(mainNum);
                }
                c = '=';
                break;

            case R.id.vstep:
                mainStr2 = mainStr;
                mainStr = "";
                c = '^';
                break;

            case R.id.plus:
                mainStr2 = mainStr;
                mainStr = "";
                c = '+';
                break;

            case R.id.mult:
                mainStr2 = mainStr;
                mainStr = "";
                c = '*';
                break;

            case R.id.minus:
                mainStr2 = mainStr;
                mainStr = "";
                c = '-';
                break;

            case R.id.devide:
                mainStr2 = mainStr;
                mainStr = "";
                c = '/';
                break;
        }
        if(mainStr.length()>9) {
            textSize -= mainStr.length();
            textView.setTextSize(textSize);
        }
        textView.setText(mainStr);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 0, 0, "Очистить");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        mainStr = "";
        textView.setText("");
        return super.onOptionsItemSelected(item);
    }
}
