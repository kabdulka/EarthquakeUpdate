package kenanabdulkarim.earthquakeupdate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = Earthquake.class.getName();
    private ArrayList<Earthquake> earthquakes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);

        earthquakes.add(new Earthquake("1.3", "Buenos Aires", ""));
        earthquakes.add(new Earthquake("5.6", "Rome", ""));
        earthquakes.add(new Earthquake("7.3", "London", ""));
        earthquakes.add(new Earthquake("3.4", "San Fransisco", ""));
        earthquakes.add(new Earthquake("5.2", "Toronto", ""));
        earthquakes.add(new Earthquake("6.1", "Vancouver", ""));
        earthquakes.add(new Earthquake("2.5", "Tokyo", ""));

        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create an earthquake adapter by passing a list of earthquakes
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        // Set the adapter on the (@link ListView)
        // so the List can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
