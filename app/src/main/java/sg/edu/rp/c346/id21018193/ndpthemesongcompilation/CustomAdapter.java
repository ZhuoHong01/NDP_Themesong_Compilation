package sg.edu.rp.c346.id21018193.ndpthemesongcompilation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Song> alSong;

    public CustomAdapter(Context context, int resource, ArrayList<Song> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        alSong = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvDate = rowView.findViewById(R.id.textViewSingers);
        TextView tvSingers = rowView.findViewById(R.id.textViewSingers);
        TextView tvStars = rowView.findViewById(R.id.textViewStars);

        // Obtain the Android Version information based on the position
        Song song = alSong.get(position);

        // Set values to the TextView to display the corresponding information
        tvTitle.setText(song.toString());
        tvSingers.setText(song.toString());
        tvStars.setText(song.toString());
        tvDate.setText(song.toString());


        return rowView;
    }
}
