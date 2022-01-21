package Quiz;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gema.R;
import com.example.gema.SearchingBook;

public class SelesaiQuizAntariksa extends AppCompatActivity {

    Button btn_end, btn_search_book;
    private int[] stars = {
            R.drawable.star_1,
            R.drawable.star_2,
            R.drawable.star_3,
            R.drawable.star_4,
            R.drawable.star_5
    } ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_quiz_antariksa);

        btn_end = findViewById(R.id.btn_end);
        btn_search_book = findViewById(R.id.btn_search_book);

        SharedPreferences mSettings = getApplicationContext().getSharedPreferences("Settings", Context.MODE_PRIVATE);
        int score = mSettings.getInt("score", 0);
        Button btn_skor = findViewById(R.id.btn_skor);
        btn_skor.setBackgroundResource(stars[score-1]);

        btn_end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EssayAntariksa.class);
                startActivity(intent);
            }

        });
        btn_search_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SearchingBook.class);
                startActivity(intent);
            }

        });
    }
}