package portfolio.nanodegree.android.ntippa.portfolio;


import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar mToolBar;

    String message;

    Button project1_button,project2_button,project3_button,project4_button,project5_button,project6_button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // mToolBar = (Toolbar) findViewById(R.id.appBar);
       // setSupportActionBar(mToolBar);
       // getSupportActionBar().setDisplayShowHomeEnabled(true);


        //registering button click listeners
        project1_button = (Button) findViewById(R.id.project1);
        project1_button.setOnClickListener(this);

        project2_button = (Button) findViewById(R.id.project2);
        project2_button.setOnClickListener(this);

        project3_button = (Button) findViewById(R.id.project3);
        project3_button.setOnClickListener(this);

        project4_button = (Button) findViewById(R.id.project4);
        project4_button.setOnClickListener(this);

        project5_button = (Button) findViewById(R.id.project5);
        project5_button.setOnClickListener(this);

        project6_button = (Button) findViewById(R.id.project6);
        project6_button.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {

        String launch_message = "Launching ";
        if(v == project1_button)
            Toast.makeText(this ,launch_message + getString(R.string.project1) , Toast.LENGTH_SHORT).show();

        if(v == project2_button)
            Toast.makeText(this ,launch_message + getString(R.string.project2) , Toast.LENGTH_SHORT).show();

        if(v == project3_button)
            Toast.makeText(this ,launch_message + getString(R.string.project3) , Toast.LENGTH_SHORT).show();

        if(v == project4_button)
            Toast.makeText(this ,launch_message + getString(R.string.project4) , Toast.LENGTH_SHORT).show();

        if(v == project5_button)
            Toast.makeText(this ,launch_message + getString(R.string.project5) , Toast.LENGTH_SHORT).show();

        if(v == project6_button)
            Toast.makeText(this ,launch_message + getString(R.string.project6) , Toast.LENGTH_SHORT).show();

    }
}
