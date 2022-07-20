package sg.edu.rp.c346.id21018193.ndpthemesongcompilation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnInsert, btnShow;
    RadioButton rbtn1, rbtn2, rbtn3, rbtn4, rbtn5;
    TextView tvTitle, tvSingers, tvYear, tvStars;
    EditText etTitle, etSingers, etYear;
    ArrayList<Song> al;
    ArrayAdapter<Song> aa;
    Song data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInsert = findViewById(R.id.btnInsert);
        btnShow = findViewById(R.id.btnShow);
        rbtn1 = findViewById(R.id.rbtn1);
        rbtn2 = findViewById(R.id.rbtn2);
        rbtn3 = findViewById(R.id.rbtn3);
        rbtn4 = findViewById(R.id.rbtn4);
        rbtn5 = findViewById(R.id.rbtn5);
        tvSingers = findViewById(R.id.tvSingers);
        tvTitle = findViewById(R.id.tvTitle);
        tvYear = findViewById(R.id.tvYear);
        tvStars = findViewById(R.id.tvStars);
        etTitle = findViewById(R.id.etTitle);
        etSingers = findViewById(R.id.etSingers);
        etYear = findViewById(R.id.etYear);

        Intent i = getIntent();
        data = (Song) i.getSerializableExtra("data");

        al = new ArrayList<>();
        aa = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, al);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbh = new DBHelper(MainActivity.this);
                data.setTitle(etTitle.getText().toString());
                data.setSingers(etSingers.getText().toString());
                data.setYear(etYear.getText().toString());
                dbh.updateSong(data);
                dbh.close();
            }
        });

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Song target = al.get(1);

                Intent i = new Intent(MainActivity.this,
                        ShowActivity.class);
                i.putExtra("data", target);
                startActivity(i);

            }
        });

    }
}