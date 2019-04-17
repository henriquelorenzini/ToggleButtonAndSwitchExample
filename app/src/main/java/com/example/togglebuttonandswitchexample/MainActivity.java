package com.example.togglebuttonandswitchexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
        ToggleButton toggleButton;
        Switch aSwitch;
        TextView texViewToggle;
        TextView textViewSwitch;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            toggleButton = findViewById(R.id.toggleButton);
            aSwitch = findViewById(R.id.switch1);
            texViewToggle = findViewById(R.id.textViewToggle);
            textViewSwitch = findViewById(R.id.textViewSwitch);
        }

        public void onClick(View view) {
            if (toggleButton.isChecked()) {
                texViewToggle.setText("Toggle True");

            } else {
                texViewToggle.setText("Toggle False");

            }
            if (aSwitch.isChecked()) {
                textViewSwitch.setText("Switch True");

            } else {
                textViewSwitch.setText("Switch False");

            }
        }
    }
}