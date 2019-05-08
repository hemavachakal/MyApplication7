package com.example.myapplication7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox And,java,php,python,unity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        And=findViewById(R.id.Androidcheckbox);
        java=findViewById(R.id.javacheckbox);
        php=findViewById(R.id.phpcheckbox);
        python=findViewById(R.id.pythoncheckbox);
        unity=findViewById(R.id.unitycheckbox);

        And.setOnClickListener(this);
        java.setOnClickListener(this);
        php.setOnClickListener(this);
        python.setOnClickListener(this);
        unity.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Androidcheckbox:
                if(And.isChecked())
                    Toast.makeText(this, "Android", Toast.LENGTH_SHORT).show();
                    break;

            case R.id.javacheckbox:
                if(java.isChecked())
                    Toast.makeText(this, "java", Toast.LENGTH_SHORT).show();
                break;

            case R.id.phpcheckbox:
                if(php.isChecked())
                    Toast.makeText(this, "php", Toast.LENGTH_SHORT).show();
                break;

            case R.id.pythoncheckbox:
                if(python.isChecked())
                    Toast.makeText(this, "python", Toast.LENGTH_SHORT).show();
                break;

            case R.id.unitycheckbox:
                if(unity.isChecked())
                    Toast.makeText(this, "unity", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
