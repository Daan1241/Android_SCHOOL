package nl.bluepixelanimations.opdracht2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public int score1;
    public int score2;
    public TextView counter1;
    public TextView counter2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonplus1 = findViewById(R.id.buttonplus1);
        Button buttonplus2 = findViewById(R.id.buttonplus2);
        Button buttonmin1 = findViewById(R.id.buttonmin1);
        Button buttonmin2 = findViewById(R.id.buttonmin2);

        score1 = 0;
        score2 = 0;
        counter1 = findViewById(R.id.countertext1);
        counter2 = findViewById(R.id.countertext2);

        buttonplus1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                score1++;
                counter1.setText(""+score1);
                Log.d("debugLogger", "Score1 = " + score1);
            }
        });

        buttonplus2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                score2++;
                counter2.setText(""+score2);
                Log.d("debugLogger", "Score1 = " + score2);
            }
        });

        buttonmin1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                score1--;
                counter1.setText(""+score1);
                Log.d("debugLogger", "Score1 = " + score1);
            }
        });

        buttonmin2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                score2--;
                counter2.setText(""+score2);
                Log.d("debugLogger", "Score1 = " + score2);
            }
        });




    }


}
