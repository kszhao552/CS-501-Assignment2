package com.example.emailchecker;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Validator validator = new Validator();
    private Button btn;
    private EditText edit;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button_id);
        EditText edit = (EditText) findViewById(R.id.edit_id);
        TextView text = (TextView) findViewById(R.id.text_id);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edit.getText().toString();
                boolean res = validator.validate(email);

                if (res){
                    text.setText(R.string.valid);
                }
                else{
                    text.setText(R.string.invalid);
                }
            }
        });
    }


}