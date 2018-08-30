package com.example.asus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText et;
    private TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.res);
        et = findViewById(R.id.inp);
        t = findViewById(R.id.show);

        final CheckBox t2d = (CheckBox) findViewById(R.id.T2D);
        final CheckBox d2r = (CheckBox) findViewById(R.id.D2R);
        final CheckBox t2s = (CheckBox) findViewById(R.id.T2S);
        final CheckBox t2c = (CheckBox) findViewById(R.id.T2C);
        final CheckBox b2b = (CheckBox) findViewById(R.id.B2B);
        final CheckBox l2m = (CheckBox) findViewById(R.id.L2M);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try{
                    String inp= et.getText().toString();
                    double conv= Double.parseDouble(inp);
                    double result;
                    t.setText("");

                    if (t2d.isChecked()) {
                        result = conv/82;
                        t.append(inp+ " Taka = " + result + " Dollar.\n");
                    }
                    if (d2r.isChecked()) {
                        result = conv*3.1416/180;
                        t.append(inp+ " Degree = " + result + " Radian.\n");
                    }
                    if (t2s.isChecked()) {
                        result = Math.sin(conv*3.1416/180);
                        t.append(inp+ " Theta = " + result + " In Sine ratio.\n");
                    }
                    if (t2c.isChecked()) {
                        result = Math.cos(conv*3.1416/180);
                        t.append(inp+ " Theta = " + result + " In Cosine ratio.\n");
                    }
                    if (b2b.isChecked()) {
                        result =conv*8;
                        t.append(inp+ " Byte = " + result + " Bits.\n");
                    }
                    if (l2m.isChecked()) {
                        result = conv/1000;
                        t.append(inp+ " Litre = " + result + " Metre Qube.\n");
                    }

                }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this,"Please input a number",Toast.LENGTH_LONG).show();
                }


            }
        });


    }
}
