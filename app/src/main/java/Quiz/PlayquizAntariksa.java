package Quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gema.R;

public class PlayquizAntariksa extends AppCompatActivity {

    Button btn_play_quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playquiz_antariksa);

        btn_play_quiz = findViewById(R.id.btn_play_quiz);

        btn_play_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuizAntariksa.class);
                startActivity(intent);
            }

        });

    }
}