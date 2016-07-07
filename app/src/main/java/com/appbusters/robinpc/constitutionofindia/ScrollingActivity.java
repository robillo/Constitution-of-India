package com.appbusters.robinpc.constitutionofindia;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void preamble(View view)
    {
        Intent i=new Intent(this,preamble.class);
        startActivity(i);
    }

    public void amendments(View view)
    {
        Intent i=new Intent(this,amendments.class);
        startActivity(i);
    }

    public void parts(View view)
    {
        Intent i=new Intent(this,parts.class);
        startActivity(i);
    }
    public void schedules(View view)
    {
        Intent i=new Intent(this,schedules.class);
        startActivity(i);
    }
}
