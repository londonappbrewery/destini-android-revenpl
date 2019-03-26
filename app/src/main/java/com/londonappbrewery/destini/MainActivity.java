package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView mTextView;
    Button mTopButton;
    Button mBottomButton;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    setT3();
                } else if (mStoryIndex == 2) {
                    setT3();
                } else if (mStoryIndex == 3) {
                    setT6();
                } else {
                    mTextView.setText("Error");
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    setT2();
                } else if (mStoryIndex == 2) {
                    setT4();
                } else if (mStoryIndex == 3) {
                    setT5();
                } else {
                    mTextView.setText("Error");
                }
            }
        });
    }

    private void setT2() {
        mTextView.setText(R.string.T2_Story);
        mTopButton.setText(R.string.T2_Ans1);
        mBottomButton.setText(R.string.T2_Ans2);
        mStoryIndex = 2;
    }

    private void setT3() {
        mTextView.setText(R.string.T3_Story);
        mTopButton.setText(R.string.T3_Ans1);
        mBottomButton.setText(R.string.T3_Ans2);
        mStoryIndex = 3;
    }

    private void setT4() {
        mTextView.setText(R.string.T4_End);
        mTopButton.setVisibility(View.INVISIBLE);
        mBottomButton.setVisibility(View.INVISIBLE);
        mStoryIndex = 4;
    }

    private void setT5() {
        mTextView.setText(R.string.T5_End);
        mTopButton.setVisibility(View.INVISIBLE);
        mBottomButton.setVisibility(View.INVISIBLE);
        mStoryIndex = 5;
    }

    private void setT6() {
        mTextView.setText(R.string.T6_End);
        mTopButton.setVisibility(View.INVISIBLE);
        mBottomButton.setVisibility(View.INVISIBLE);
        mStoryIndex = 6;
    }
}
