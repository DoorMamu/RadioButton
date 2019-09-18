package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
RadioButton rb1,rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb1=findViewById(R.id.radio_male);
        rb2=findViewById(R.id.radio_female);
        rb1.setOnCheckedChangeListener(this);
        rb2.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId())
        {
            case R.id.radio_male:
                if(compoundButton.isChecked())
                Toast.makeText(this, ""+rb1.getText(), Toast.LENGTH_SHORT).show();
            break;
            case R.id.radio_female:
                if(compoundButton.isChecked())
                    Toast.makeText(this, ""+rb2.getText(), Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
