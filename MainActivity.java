package sg.edu.mad.whack_a_mole;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Whack-A-Mole";
    /* Hint
        - The function setNewMole() uses the Random class to generate a random value ranged from 0 to 2.
        - Feel free to modify the function to suit your program.
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "Finished Pre-Initialisation!");
    }

    @Override
    protected void onStart(){
        super.onStart();
        setNewMole();
        Log.v(TAG, "Starting GUI!");
        final Button button0 = (Button) findViewById(R.id.button0);
        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        TextView scoreTextView = (TextView) findViewById(R.id.scoreTextView);
        final int[] score = {0};
        scoreTextView.setText(score[0] + "");
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView scoreTextView = (TextView) findViewById(R.id.scoreTextView);
                Log.v(TAG, "Button Left Clicked!");
                if (button0.getText().equals("*")) {
                    score[0]++;
                    Log.v(TAG, "Hit, score added!");
                }
                else {
                    score[0]--;
                    Log.v(TAG, "Missed, score deducted!");
                }
                scoreTextView.setText(score[0] + "");
                setNewMole();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView scoreTextView = (TextView) findViewById(R.id.scoreTextView);
                Log.v(TAG, "Button Middle Clicked!");
                if(button1.getText().equals("*")) {
                    score[0]++;
                    Log.v(TAG, "Hit, score added!");
                }
                else {
                    score[0]--;
                    Log.v(TAG, "Missed, score deducted");
                }
                scoreTextView.setText(score[0] + "");
                setNewMole();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView scoreTextView = (TextView) findViewById(R.id.scoreTextView);
                Log.v(TAG, "Button Right Clicked!");
                if(button2.getText().equals("*")) {
                    score[0]++;
                    Log.v(TAG, "Hit, score added!");
                }
                else {
                    score[0]--;
                    Log.v(TAG, "Missed, score deducted");
                }
                scoreTextView.setText(score[0] + "");
                setNewMole();
            }
        });
    }


    public void setNewMole()
    {
        final Button button0 = (Button) findViewById(R.id.button0);
        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        Random ran = new Random();
        int randomLocation = ran.nextInt(3);
        if (randomLocation == 0) {
            button0.setText("*");
            button1.setText("O");
            button2.setText("O");
        }
        else if (randomLocation == 1) {
            button0.setText("O");
            button1.setText("*");
            button2.setText("O");
        }
        else {
            button0.setText("O");
            button1.setText("O");
            button2.setText("*");
        }

    }
}
