package edu.fullerton.ecs.cpsc411.buttoncounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    TextView tv;
    Integer i = 0;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textViewCount);
        tv.setText(i.toString());
        tv.setOnClickListener(this);

        b = findViewById(R.id.buttonIncrement);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tv) {
            i = 0;
        }
        else if (v == b) {
            i++;
        }
        tv.setText(i.toString());
    }
}
