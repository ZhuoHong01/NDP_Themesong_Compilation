package sg.edu.rp.c346.id21018193.ndpthemesongcompilation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnUpdate, btnDelete, btnCancel;
    RadioButton rbtn1, rbtn2, rbtn3, rbtn4, rbtn5;
    TextView tvID, tvTitle, tvSingers, tvYear, tvStars;
    EditText etID, etTitle, etSingers, etYear;
    ArrayList<Song> al;
    ListView lv;
    ArrayAdapter<Song> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnDelete = findViewById(R.id.btnDelete);
        btnCancel = findViewById(R.id.btnCancel);
        rbtn1 = findViewById(R.id.rbtn1);
        rbtn2 = findViewById(R.id.rbtn2);
        rbtn3 = findViewById(R.id.rbtn3);
        rbtn4 = findViewById(R.id.rbtn4);
        rbtn5 = findViewById(R.id.rbtn5);
        tvID = findViewById(R.id.tvID);
        tvSingers = findViewById(R.id.tvSingers);
        tvTitle = findViewById(R.id.tvTitle);
        tvYear = findViewById(R.id.tvYear);
        tvStars = findViewById(R.id.tvStars);
        etID = findViewById(R.id.etID);
        etTitle = findViewById(R.id.etTitle);
        etSingers = findViewById(R.id.etSingers);
        etYear = findViewById(R.id.etYear);
    }
}