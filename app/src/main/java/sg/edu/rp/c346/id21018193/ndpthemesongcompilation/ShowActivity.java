package sg.edu.rp.c346.id21018193.ndpthemesongcompilation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ShowActivity extends AppCompatActivity {
    Button btnShow;
    ArrayList<Song> al;
    ListView lv;
    ArrayAdapter<Song> aa;
    CustomAdapter ca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        btnShow = findViewById(R.id.btnShow);
        lv = findViewById(R.id.lv);

        al = new ArrayList<>();
        ca = new CustomAdapter(this, R.layout.row, al);

        lv.setAdapter((ListAdapter) ca);


        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long identity) {
                Song data = al.get(position);
                Intent i = new Intent(ShowActivity.this,
                        MainActivity.class);
                i.putExtra("data",  data);
                startActivity(i);

            }
        });
    }
}