package com.github.scarfed.mcoc_companion;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Have a popup for champ add", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        Context context = getApplicationContext();
        CharSequence text;
        int duration = Toast.LENGTH_SHORT;

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            text = "Settings selected";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return true;
        }
        else if (id == R.id.action_roster) {
            text = "Roster selected";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return true;
        }
        else if (id == R.id.action_team) {
            text = "Team selected";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return true;
        }
        else if (id == R.id.action_synergies) {
            text = "Synergies selected";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
