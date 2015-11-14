package redgemdesignz.jamblastcomics;

import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.MotionEvent;


public class Comics_Scripts extends AppCompatActivity {


    String tem = "Set up action";
    View v;


    View my_view = findViewById(R.id.imageView2);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comics__scripts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "u'lll see more", Snackbar.LENGTH_LONG)
                        .setAction("Action", new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        //TODO Action
                                    }
                                }
                        ).show();
            }
        });

        tem = getIntent().getStringExtra("Chpone");

        v = findViewById(R.id.imageView2);
        v.setBackgroundResource(R.drawable.cp1);

    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onResume(){
        super.onResume();
    }

}
