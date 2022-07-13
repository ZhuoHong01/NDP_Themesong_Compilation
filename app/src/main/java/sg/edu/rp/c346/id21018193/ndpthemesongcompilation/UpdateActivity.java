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

public class UpdateActivity extends AppCompatActivity {
        Button btnUpdate, btnDelete;
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
            btnDelete = findViewById(R.id.btnDelete);
            btnUpdate = findViewById(R.id.btnUpdate);
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

            al = new ArrayList<Song>();
            aa = new ArrayAdapter<Song>(this,
                    android.R.layout.simple_list_item_1, al);


            btnDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    DBHelper dbh = new DBHelper(UpdateActivity.this);
                    dbh.deleteSong(data.getId());

                }
            });

            btnUpdate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    DBHelper dbh = new DBHelper(UpdateActivity.this);
                    data.setTitle(etTitle.getText().toString());
                    data.setSingers(etSingers.getText().toString());
                    data.setYear(etYear.getText().toString());
                    dbh.updateSong(data);
                    dbh.close();
                }
            });


        }
    }
