package Quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gema.R;
import com.example.gema.ScreenRating;
import com.example.gema.Searching;

public class ScreenSelesaiQuiz extends AppCompatActivity {

    Button btn_end, btn_search_book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_selesai_quiz);

        btn_end = findViewById(R.id.btn_end);
        btn_search_book = findViewById(R.id.btn_search_book);

        btn_end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ScreenRating.class);
                startActivity(intent);
            }

        });
        btn_search_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Searching.class);
                startActivity(intent);
            }

        });
    }
}