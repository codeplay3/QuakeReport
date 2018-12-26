package com.example.abhi9.quakereport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        ArrayList<Earthquake> earthquakes = QueryUtils.extractEarthquakes();


        ListView earthquakeListView = (ListView) findViewById(R.id.list);
        EarthquakeAdapter adapter  = new EarthquakeAdapter(this, earthquakes);
        earthquakeListView.setAdapter(adapter);
    }
}