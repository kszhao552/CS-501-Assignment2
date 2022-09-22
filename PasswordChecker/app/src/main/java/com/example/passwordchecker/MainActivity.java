package com.example.passwordchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.util.Log;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private PasswordChecker passCheck = new PasswordChecker();
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = (Button) findViewById(R.id.button_name);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText firstCheck =
                        (EditText) findViewById(R.id.pass_name);
                EditText secondCheck =
                        (EditText) findViewById(R.id.pass_check_name);

                String pass1 = firstCheck.getText().toString();
                String pass2 = secondCheck.getText().toString();

                TextView resTextView =
                        (TextView) findViewById(R.id.result);
                try {
                    boolean res = passCheck.compare(pass1, pass2);

                    if (res) {
                        resTextView.setText("THANK YOU");
                        resTextView.setBackgroundColor(Color.parseColor("#00FF00"));
                    } else {
                        resTextView.setText("PASSWORDS MUST MATCH");
                        resTextView.setBackgroundColor(Color.parseColor("#FF0000"));
                    }
                } catch (Exception e) {

                }
            }
        }
    );
}


}