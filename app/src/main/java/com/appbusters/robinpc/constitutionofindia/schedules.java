package com.appbusters.robinpc.constitutionofindia;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class schedules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedules);
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

    // DIALOG FOR Schedule1
    public void Schedule1(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage(this.getString(R.string.firstschedule))
                .setTitle("Schedule 1").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR Schedule1
    public void Schedule2(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage(this.getString(R.string.secondschedule))
                .setTitle("Schedule 2").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR Schedule1
    public void Schedule3(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage(this.getString(R.string.thirdschedule))
                .setTitle("Schedule 3").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR Schedule1
    public void Schedule4(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage(this.getString(R.string.fourthschedule))
                .setTitle("Schedule 4").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR Schedule1
    public void Schedule5(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage(this.getString(R.string.fifthschedule))
                .setTitle("Schedule 5").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR Schedule1
    public void Schedule6(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage(this.getString(R.string.sixthschedule))
                .setTitle("Schedule 6").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR Schedule1
    public void Schedule7(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage(this.getString(R.string.seventhschedule))
                .setTitle("Schedule 7").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR Schedule1
    public void Schedule8(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage(this.getString(R.string.eighthschedule))
                .setTitle("Schedule 8").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR Schedule1
    public void Schedule9(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage(this.getString(R.string.ninthschedule))
                .setTitle("Schedule 9").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR Schedule1
    public void Schedule10(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage(this.getString(R.string.tenthschedule))
                .setTitle("Schedule 10").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR Schedule1
    public void Schedule11(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage(this.getString(R.string.eleventhschedule))
                .setTitle("Schedule 11").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR Schedule1
    public void Schedule12(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage(this.getString(R.string.twelvethschedule))
                .setTitle("Schedule 12").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
}
