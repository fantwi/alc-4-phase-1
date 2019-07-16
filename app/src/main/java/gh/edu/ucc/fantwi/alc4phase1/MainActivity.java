package gh.edu.ucc.fantwi.alc4phase1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button aboutAlc_btn = findViewById(R.id.button_aboutAlc);
        aboutAlc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_about_alc = new Intent(MainActivity.this, AboutALCActivity.class);
                startActivity(intent_about_alc);
            }
        });

        Button my_profile_btn = findViewById(R.id.button_myProfile);
        my_profile_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_my_profile = new Intent(MainActivity.this, MyProfileActivity.class);
                startActivity(intent_my_profile);
            }
        });

    }

}
