package ru.limtu.myexample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SeriesList work = new SeriesList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickChooseSeries(View view) {
        TextView genre = (TextView) findViewById(R.id.genre);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        String seriesPlan = String.valueOf(spinner.getSelectedItem());
        genre.setText(seriesPlan);

        List<String> genreList = work.getGenre(seriesPlan);
        StringBuilder genreModified = new StringBuilder();

        for (String genres: genreList) {
            genreModified.append(genres).append('\n');
        }
        genre.setText(genreModified);
    }
}
