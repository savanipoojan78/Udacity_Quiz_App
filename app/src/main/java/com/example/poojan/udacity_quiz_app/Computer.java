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


public class Computer extends AppCompatActivity {

    private double score1, score2, score3, score4, score5, totalScore;
    private boolean checked1, checked2, checked3, checked5;
    private String anwser4;
    RadioGroup q1;
    RadioGroup q2;
    RadioGroup q3;
    CheckBox q5a;
    CheckBox q5b;
    CheckBox q5c;
    CheckBox q5d;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        q1=(RadioGroup)findViewById(R.id.radiogroup1);
        q2=(RadioGroup)findViewById(R.id.radiogroup2);
        q3=(RadioGroup)findViewById(R.id.radiogroup3);
        q5a=(CheckBox)findViewById(R.id.qc5A);
        q5b=(CheckBox)findViewById(R.id.qc5B);
        q5c=(CheckBox)findViewById(R.id.qc5C);
        q5d=(CheckBox)findViewById(R.id.qc5D);
        ans=(TextView)findViewById(R.id.qc4);

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
                    score2 = 0;
                    break;
                }
            case R.id.qc2C:
                if (checked2) {
                    score2 = 1;
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
                    score3 = 0;
                    break;
                }
            case R.id.qc3B:
                if (checked3) {
                    score3 = 1;
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

    public void onCheckedQuestion5(View view) {
        checked5 = q5a.isChecked() || q5b.isChecked() || q5c.isChecked() || q5d.isChecked();
    }

    public void clickSubmit(View view) {
        anwser4 = ans.getText().toString();
        if(checked1 && checked2 && checked3 && !anwser4.equals("") && checked5 ) {

            // count question 4
            if(anwser4.toLowerCase().equals("prolog"))
                score4 = 1;
            else
                score4 = 0;

            // count question 5
            score5 = 0;

            if(q5b.isChecked()) {
                score5 += 0.5;
            }
            if(q5c.isChecked()) {
                score5 += 0.5;
            }
            totalScore = score1 + score2 + score3 + score4 + score5;
            String anwser = getString(R.string.your_score_is) + "  " + totalScore;
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
        ans.setText("");
        uncheckCheckBoxes();
    }

    private void uncheckRadioGroup(RadioGroup radioGroup) {
        radioGroup.clearCheck();
    }

    private void uncheckCheckBoxes() {
        q5a.setChecked(false);
        q5b.setChecked(false);
        q5c.setChecked(false);
        q5d.setChecked(false);
        checked5 = false;
    }
}
