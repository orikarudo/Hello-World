package com.example.helloworld;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView hwText;
    TextView gbwText;
    ImageView world;
    ImageView fireWorld;
    Button gbwButton;
    Button hwButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/
        hwText = (TextView)findViewById(R.id.hwText);
        gbwText = (TextView)findViewById(R.id.gbwText);
        world = (ImageView)findViewById(R.id.clearWorld);
        fireWorld = (ImageView)findViewById(R.id.fireWorld);
        gbwButton = (Button)findViewById(R.id.btnGBW);
        hwButton = (Button)findViewById(R.id.btnHW);
        gbwButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                world.setVisibility(View.INVISIBLE);
                fireWorld.setVisibility(View.VISIBLE);
                hwText.setVisibility(View.INVISIBLE);
                gbwText.setVisibility(View.VISIBLE);
                hwButton.setVisibility(View.VISIBLE);
                gbwButton.setVisibility(View.GONE);
            }
        });
        hwButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                world.setVisibility(View.VISIBLE);
                fireWorld.setVisibility(View.INVISIBLE);
                hwText.setVisibility(View.VISIBLE);
                gbwText.setVisibility(View.INVISIBLE);
                hwButton.setVisibility(View.GONE);
                gbwButton.setVisibility(View.VISIBLE);
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
