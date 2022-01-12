package Quiz;

import android.content.Intent;
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

public class Quiz extends AppCompatActivity{

    ImageButton next_quiz;

    private List<QuizModel> questionsList;
    private TextView txtQuestion, txtQuestionNo;
    private RadioGroup radioGroup;
    private RadioButton radio1, radio2, radio3, radio4;
    private ImageView btnNext;

    int totalQuestion;
    int qCounter = 0;

    private QuizModel currentQuestion;

    ColorStateList radioColor;
    boolean answered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        next_quiz = findViewById(R.id.next_quiz);

        next_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ScreenEssay.class);
                startActivity(intent);
            }

        });

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
                        Toast.makeText(Quiz.this, "Please select an option", Toast.LENGTH_LONG).show();
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
            finish();
        }
    }


    private void addQuestions() {
       questionsList.add(new QuizModel("Manakah Benda Langit Berikut Yang Memiliki Ukuran Paling Besar?" +
               "", "Bumi", "Bulan", "Bintang", "Matahari", 4));
       questionsList.add(new QuizModel("Berapakah Jarak Antara Bumi dan matahari?" +
               "","150  juta km", "140  juta km", "130  juta km", "120  juta km", 1));
       questionsList.add(new QuizModel("Dimanakah Tempat Matahari, Bulan, Bintang dan Bumi yang Kita Tempati Itu Berada?" +
               "","Planet", "Luar Angkasa", "Atmosfer", "Langit", 2));
       questionsList.add(new QuizModel("Kenapa bulan bisa bersinar?" +
               "","Bulan memiliki sinarnya sendiri", "Matahari yang menyinari bulan", "Disinari oleh gugus bintang", "Disinari oleh bumi", 3));
       questionsList.add(new QuizModel("Saat kapan kah bintang bersinar?" +
               "","Pagi hari", "Malam hari", "Sore hari", "Siang hari", 2));

    }

}