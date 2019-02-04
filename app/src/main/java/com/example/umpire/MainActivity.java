package com.example.umpire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private BallStrikeCounter counter = new BallStrikeCounter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void updateView(){
        TextView ball_display = findViewById(R.id.balls);
        TextView strike_display = findViewById(R.id.strikes);
        TextView out_display = findViewById(R.id.outs);
        ball_display.setText(String.format(Locale.US, "%d",counter.getNBalls()));
        strike_display.setText(String.format(Locale.US, "%d",counter.getNStrikes()));
        out_display.setText("0");
    }
    public void ButtonClick(View view){
        if (view.getId()==R.id.ballbtn){
            counter.callBall();
        }else if (view.getId()==R.id.strikebtn) {
            counter.callStrike();
        }else if (view.getId()==R.id.reset) {
            counter.reset();
        }
        else{
            throw new RuntimeException("Unknown ID in ButtonClick");
        }
        updateView();
    }
}
