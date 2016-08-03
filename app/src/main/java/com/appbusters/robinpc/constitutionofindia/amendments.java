package com.appbusters.robinpc.constitutionofindia;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class amendments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amendments);
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

    public void Amendment1(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.firstamendment)).create();
        builder.show();
    }
    public void Amendment2(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.secondamendment)).create();
        builder.show();
    }    public void Amendment3(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.thirdamendment)).create();
        builder.show();
    }    public void Amendment4(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fourthamendment)).create();
        builder.show();
    }    public void Amendment5(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fifthamendment)).create();
        builder.show();
    }    public void Amendment6(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.sixthamendment)).create();
        builder.show();
    }    public void Amendment7(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.seventhamendment)).create();
        builder.show();
    }    public void Amendment8(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.eighthamendment)).create();
        builder.show();
    }    public void Amendment9(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.ninthamendment)).create();
        builder.show();
    }    public void Amendment10(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.tenthamendment)).create();
        builder.show();
    }    public void Amendment11(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.eleventhamendment)).create();
        builder.show();
    }    public void Amendment12(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.twelfthamendment)).create();
        builder.show();
    }    public void Amendment13(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.thirteenthamendment)).create();
        builder.show();
    }    public void Amendment14(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fourteenthamendment)).create();
        builder.show();
    }    public void Amendment15(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fifteenthamendment)).create();
        builder.show();
    }    public void Amendment16(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.sixteenthamendment)).create();
        builder.show();
    }    public void Amendment17(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.seventeenthamendment)).create();
        builder.show();
    }    public void Amendment18(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.eighteenthamendment)).create();
        builder.show();
    }    public void Amendment19(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.nineteenthamendment)).create();
        builder.show();
    }    public void Amendment20(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.twentiethamendment)).create();
        builder.show();
    }    public void Amendment21(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.twentyfirstamendment)).create();
        builder.show();
    }    public void Amendment22(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.twentysecondamendment)).create();
        builder.show();
    }    public void Amendment23(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.twentythirdamendment)).create();
        builder.show();
    }    public void Amendment24(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.twentyfourthamendment)).create();
        builder.show();
    }    public void Amendment25(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.twentyfifthamendment)).create();
        builder.show();
    }    public void Amendment26(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.twentysixthamendment)).create();
        builder.show();
    }    public void Amendment27(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.twentyseventhamendment)).create();
        builder.show();
    }    public void Amendment28(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.twentyeighthamendment)).create();
        builder.show();
    }    public void Amendment29(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.twentyninethamendment)).create();
        builder.show();
    }    public void Amendment30(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.thirteethamendment)).create();
        builder.show();
    }    public void Amendment31(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.thirtyfirstamendment)).create();
        builder.show();
    }    public void Amendment32(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.thirtysecondamendment)).create();
        builder.show();
    }    public void Amendment33(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.thirtythirdamendment)).create();
        builder.show();
    }    public void Amendment34(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.thirtyfourthamendment)).create();
        builder.show();
    }    public void Amendment35(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.thirtyfifthamendment)).create();
        builder.show();
    }    public void Amendment36(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.thirtysixthamendment)).create();
        builder.show();
    }    public void Amendment37(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.thirtyseventhamendment)).create();
        builder.show();
    }    public void Amendment38(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.thirtyeighthamendment)).create();
        builder.show();
    }    public void Amendment39(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.thirtyninthamendment)).create();
        builder.show();
    }    public void Amendment40(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fortiethamendment)).create();
        builder.show();
    }    public void Amendment41(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fourtyfirstamendment)).create();
        builder.show();
    }    public void Amendment42(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fourtysecondamendment)).create();
        builder.show();
    }    public void Amendment43(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fourtythirdamendment)).create();
        builder.show();
    }    public void Amendment44(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fortyfourthamendment)).create();
        builder.show();
    }    public void Amendment45(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fortyfifthamendment)).create();
        builder.show();
    }    public void Amendment46(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fortysixthamendment)).create();
        builder.show();
    }    public void Amendment47(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fortyseventhamendment)).create();
        builder.show();
    }    public void Amendment48(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fortyeighthamendment)).create();
        builder.show();
    }    public void Amendment49(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fourtyninthamendment)).create();
        builder.show();
    }    public void Amendment50(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fiftiethamendment)).create();
        builder.show();
    }    public void Amendment50(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.firstamendment)).create();
        builder.show();
    }    public void Amendment51(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fiftyfirstamendment)).create();
        builder.show();
    }    public void Amendment52(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fiftysecondamendment)).create();
        builder.show();
    }    public void Amendment53(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fiftythirdamendment)).create();
        builder.show();
    }    public void Amendment54(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fiftyfourthamendment)).create();
        builder.show();
    }    public void Amendment55(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fiftyfifthamendment)).create();
        builder.show();
    }    public void Amendment56(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fiftysixthamendment)).create();
        builder.show();
    }    public void Amendment57(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fiftyseventhamendment)).create();
        builder.show();
    }    public void Amendment58(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fiftyeighthamendment)).create();
        builder.show();
    }    public void Amendment59(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.fiftyninthamendment)).create();
        builder.show();
    }    public void Amendment60(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.sixtiethamendment)).create();
        builder.show();
    }    public void Amendment61(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.sixtyfirstamendment)).create();
        builder.show();
    }    public void Amendment62(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.sixtysecondamendment)).create();
        builder.show();
    }    public void Amendment63(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.sixtythirdamendment)).create();
        builder.show();
    }    public void Amendment64(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.sixtyfourthamendment)).create();
        builder.show();
    }    public void Amendment65(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.sixtyfifthamendment)).create();
        builder.show();
    }    public void Amendment66(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.sixtysixthamendment)).create();
        builder.show();
    }  public void Amendment67(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.sixtyseventhamendment)).create();
        builder.show();
    }  public void Amendment68(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.sixtyeighthamendment)).create();
        builder.show();
    }  public void Amendment69(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.sixtyninthamendment)).create();
        builder.show();
    }  public void Amendment70(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.seventiethamendment)).create();
        builder.show();
    }  public void Amendment71(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.seventyfirstamendment)).create();
        builder.show();
    }  public void Amendment72(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.seventysecondamendment)).create();
        builder.show();
    }  public void Amendment73(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.seventythirdamendment)).create();
        builder.show();
    }  public void Amendment74(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.seventyfourthamendment)).create();
        builder.show();
    }  public void Amendment75(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.seventyfifthamendment)).create();
        builder.show();
    }  public void Amendment76(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.seventysixthamendment)).create();
        builder.show();
    }  public void Amendment77(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.seventyseventhamendment)).create();
        builder.show();
    }  public void Amendment78(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.seventyeighthamendment)).create();
        builder.show();
    }  public void Amendment79(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.seventyninthamendment)).create();
        builder.show();
    }  public void Amendment80(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.eightiethamendment)).create();
        builder.show();
    }  public void Amendment81(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.eightyfirstamendment)).create();
        builder.show();
    }  public void Amendment82(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.eightysecondamendment)).create();
        builder.show();
    }  public void Amendment83(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.eightythirdamendment)).create();
        builder.show();
    }  public void Amendment84(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.eightyfourthamendment)).create();
        builder.show();
    }  public void Amendment85(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.eightyfifthamendment)).create();
        builder.show();
    }  public void Amendment86(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.eightysixthamendment)).create();
        builder.show();
    }  public void Amendment87(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.eightyseventhamendment)).create();
        builder.show();
    }  public void Amendment88(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.eightyeighthamendment)).create();
        builder.show();
    }  public void Amendment89(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.eightyninthamendment)).create();
        builder.show();
    }  public void Amendment90(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.ninetiethamendment)).create();
        builder.show();
    }  public void Amendment91(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.ninetyonethamendment)).create();
        builder.show();
    }  public void Amendment92(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.ninetysecondamendment)).create();
        builder.show();
    } public void Amendment93(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.ninetythirdamendment)).create();
        builder.show();
    }  public void Amendment94(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.ninetyfourthamendment)).create();
        builder.show();
    }  public void Amendment95(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.ninetyfifthamendment)).create();
        builder.show();
    }  public void Amendment96(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.ninetysixthamendment)).create();
        builder.show();
    }  public void Amendment97(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.ninetyseventhamendment)).create();
        builder.show();
    }  public void Amendment98(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.ninetyeighthamendment)).create();
        builder.show();
    }  public void Amendment99(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.ninetyninthamendment)).create();
        builder.show();
    }  public void Amendment100(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(this.getString(R.string.hundredthamendment)).create();
        builder.show();
    }
}

