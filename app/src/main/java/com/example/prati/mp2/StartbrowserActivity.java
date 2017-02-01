package com.example.prati.mp2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/**
 * Created by prati on 10/1/2016.
 */

public class StartbrowserActivity extends Activity {

    int temp = getIntent().getExtras().getInt("id");
    //if (extras != null)
    //int temp = extras.getInt("id");
    String url;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        switch (temp) {
            case 0:
                url = "http://www.bmwusa.com/";
                break;
            case 1:
                url = "http://www.cadillac.com/";
                break;
            case 2:
                url = "http://www.ford.com/";
                break;
            case 3:
                url = "http://www.honda.com/";
                break;
            case 4:
                url = "http://www.marutisuzuki.com/";
                break;
            case 5:
                url = "https://www.mbusa.com/mercedes/index";
                break;
            case 6:
                url = "https://www.nissanusa.com/";
                break;
            case 7:
                url = "http://www.toyota.com/";
            default:
                url = "http://www.google.com";
        }
        Intent showbrowser = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(showbrowser);
    }
}
