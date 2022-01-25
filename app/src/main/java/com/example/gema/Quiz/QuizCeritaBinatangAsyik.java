package com.example.gema.Quiz;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gema.R;

import java.util.ArrayList;
import java.util.List;

public class QuizCeritaBinatangAsyik extends AppCompatActivity{

    ImageButton next_quiz;

    private List<QuizModel> questionsList;
    private TextView txtQuestion, txtQuestionNo;
    private RadioGroup radioGroup;
    private RadioButton radio1, radio2, radio3, radio4;
    private ImageView btnNext;

    int totalQuestion;
    int qCounter = 0;
    int score = 0;

    private QuizModel currentQuestion;

    ColorStateList radioColor;
    boolean answered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_antariksa);

        next_quiz = findViewById(R.id.next_quiz);

        questionsList = new ArrayList<>();

        txtQuestion = findViewById(R.id.txtQuestion);
        txtQuestionNo  = findViewById(R.id.txtQuestionNo);

        radioGroup  = findViewById(R.id.radioGroup);
        radio1  = findViewById(R.id.radio1);
        radio2  = findViewById(R.id.radio2);
        radio3  = findViewById(R.id.radio3);
        radio4  = findViewById(R.id.radio4);
        btnNext = findViewById(R.id.next_quiz);

        radioColor = radio1.getTextColors();

        addQuestions();
        totalQuestion = questionsList.size();
        showNextQuestion();

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answered == false) {
                    if(radio1.isChecked() || radio2.isChecked() || radio3.isChecked() || radio4.isChecked()) {
                        checkAnswer();
                    } else {
                        Toast.makeText(QuizCeritaBinatangAsyik.this, "Please select an option", Toast.LENGTH_LONG).show();
                    }
                } else {
                    showNextQuestion();
                }
            }
        });
    }

    private void checkAnswer() {
        answered = true;
        RadioButton radioSelected = findViewById(radioGroup.getCheckedRadioButtonId());
        int answerNo = radioGroup.indexOfChild(radioSelected) + 1;
        if(answerNo == currentQuestion.getCorrectAnswer()) {

            score++;

        }
        radio1.setTextColor(Color.RED);
        radio2.setTextColor(Color.RED);
        radio3.setTextColor(Color.RED);
        radio4.setTextColor(Color.RED);
        switch (currentQuestion.getCorrectAnswer()) {
            case 1:
                radio1.setTextColor(Color.BLUE);
                break;
            case 2:
                radio2.setTextColor(Color.BLUE);
                break;
            case 3:
                radio3.setTextColor(Color.BLUE);
                break;
            case 4:
                radio4.setTextColor(Color.BLUE);
                break;
        }

    }

    private void showNextQuestion() {

        radioGroup.clearCheck();
        radio1.setTextColor(radioColor);
        radio2.setTextColor(radioColor);
        radio3.setTextColor(radioColor);
        radio4.setTextColor(radioColor);

        if(qCounter < totalQuestion) {

            currentQuestion = questionsList.get(qCounter);
            txtQuestion.setText(currentQuestion.getQuestion());

            radio1.setText(currentQuestion.getOption1());
            radio2.setText(currentQuestion.getOption2());
            radio3.setText(currentQuestion.getOption3());
            radio4.setText(currentQuestion.getOption4());

            qCounter++;
            txtQuestionNo.setText( qCounter + " dari " + totalQuestion);
            answered = false;

        } else {
            SharedPreferences mSettings = getApplicationContext().getSharedPreferences("Settings", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = mSettings.edit();
            editor.putInt("score", score);
            editor.apply();

            Intent intent = new Intent(getApplicationContext(), SelesaiQuiz.class);
            startActivity(intent);
        }
    }


    private void addQuestions() {
        questionsList.add(new QuizModel("Dalam Cerita Pertama dimakah Monyet Tinggal?" +
                "", "Pohon Jamun", "Pohon Zaitun", "Pohon Jambu", "Pohon Mangga", 1));
        questionsList.add(new QuizModel("Siapa Saja yang Diberitahu Bangau Bahwa Dia Akan Membawa Mereka Pindah?" +
                "","Ikan, Udang dan Kerang", "Cumi-cumi, udang dan kepiting", "Ikan, Katak dan Kepiting", "Ikan, kerang, dan gagak", 3));
        questionsList.add(new QuizModel("Siapa yang Akhirnya Membalas Perbuatan Licik Bangau?" +
                "","Ikan", "Kepiting", "Kerang", "Katak", 2));
        questionsList.add(new QuizModel("Mengapa Petani Tersebut Kecewa Pada Luwak?" +
                "","Luwak mencelakai bayi petani", "Luwak merusak ladang petani", "Luwak bertengkar dengan ular", "Luwak merusak rumah petani", 1));
        questionsList.add(new QuizModel("Dengan siapa Luwak Bertarung?" +
                "","Monyet", "Buaya", "Biawak", "Ular", 4));

    }

}
