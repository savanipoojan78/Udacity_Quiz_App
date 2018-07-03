package com.example.poojan.udacity_quiz_app;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class GK extends AppCompatActivity {

    private double score1, score2, score3, score4, score5, totalScore;
    private boolean checked1, checked2, checked3, checked5,checked4;
    RadioGroup q1;
    RadioGroup q2;
    RadioGroup q3;
    RadioGroup q4;
    RadioGroup q5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gk);
        q1=(RadioGroup)findViewById(R.id.radiogroup1);
        q2=(RadioGroup)findViewById(R.id.radiogroup2);
        q3=(RadioGroup)findViewById(R.id.radiogroup3);
        q4=(RadioGroup)findViewById(R.id.radiogroup4);
        q5=(RadioGroup)findViewById(R.id.radiogroup5);

    }
    public void onCheckedQuestion1(View view) {
        checked1 = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.qc1A:
                if (checked1) {
                    score1 = 0;
                    break;
                }
            case R.id.qc1B:
                if (checked1) {
                    score1 = 1;
                    break;
                }
            case R.id.qc1C:
                if (checked1) {
                    score1 = 0;
                    break;
                }
            case R.id.qc1D:
                if (checked1) {
                    score1 = 0;
                    break;
                }
        }
    }

    public void onCheckedQuestion2(View view) {
        checked2 = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.qc2A:
                if (checked2) {
                    score2 = 0;
                    break;
                }
            case R.id.qc2B:
                if (checked2) {
                    score2 = 1;
                    break;
                }
            case R.id.qc2C:
                if (checked2) {
                    score2 = 0;
                    break;
                }
            case R.id.qc2D:
                if (checked2) {
                    score2 = 0;
                    break;
                }
        }
    }

    public void onCheckedQuestion3(View view) {
        checked3 = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.qc3A:
                if (checked3) {
                    score3 = 1;
                    break;
                }
            case R.id.qc3B:
                if (checked3) {
                    score3 = 0;
                    break;
                }
            case R.id.qc3C:
                if (checked3) {
                    score3 = 0;
                    break;
                }
            case R.id.qc3D:
                if (checked3) {
                    score3 = 0;
                    break;
                }
        }
    }

    public void onCheckedQuestion4(View view) {
        checked4 = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.qGK4A:
                if (checked3) {
                    score4 = 1;
                    break;
                }
            case R.id.qGK4B:
                if (checked3) {
                    score4 = 0;
                    break;
                }
            case R.id.qGK4C:
                if (checked3) {
                    score4 = 0;
                    break;
                }
            case R.id.qGK4D:
                if (checked3) {
                    score4 = 0;
                    break;
                }
        }
    }

    public void onCheckedQuestion5(View view) {
        checked5 = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.qGK5A:
                if (checked3) {
                    score5 = 0;
                    break;
                }
            case R.id.qGK5B:
                if (checked3) {
                    score5 = 0;
                    break;
                }
            case R.id.qGK5C:
                if (checked3) {
                    score5 = 1;
                    break;
                }
            case R.id.qGK5D:
                if (checked3) {
                    score5 = 0;
                    break;
                }
        }
    }



    public void clickSubmit(View view) {

        if(checked1 && checked2 && checked3 && checked4 && checked5 ) {

            totalScore = score1 + score2 + score3 + score4 + score5;
            String anwser = getString(R.string.your_score_is) + "  " + totalScore + " Out of 5.";
            Toast.makeText(getApplicationContext(), anwser, Toast.LENGTH_LONG).show();
        }
        else {
            Context context = getApplicationContext();
            String text = getString(R.string.make_sure_answer_questions);
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

    public void clickReset(View view) {
        uncheckRadioGroup(q1);
        uncheckRadioGroup(q2);
        uncheckRadioGroup(q3);
        uncheckRadioGroup(q4);
        uncheckRadioGroup(q5);

    }

    private void uncheckRadioGroup(RadioGroup radioGroup) {
        radioGroup.clearCheck();
    }


}
