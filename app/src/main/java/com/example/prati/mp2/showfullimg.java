package com.example.prati.mp2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;

import static com.example.prati.mp2.MainActivity.urls;

/**
 * Created by prati on 9/30/2016.
 */

public class showfullimg extends Activity {

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_image);
        int position = getIntent().getExtras().getInt("imgpos");

        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(MainActivity.images[position]);


       imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = getIntent().getExtras().getInt("imgpos");
                String url;

                switch (position) {
                    case 0:
                        url = urls[0];
                        break;
                    case 1:
                        url = urls[1];
                        break;
                    case 2:
                        url = urls[2];
                        break;
                    case 3:
                        url = urls[3];
                        break;
                    case 4:
                        url = urls[4];
                        break;
                    case 5:
                        url = urls[5];
                        break;
                    case 6:
                        url = urls[6];
                        break;
                    case 7:
                        url = urls[7];
                    default:
                        url="http://www.google.com";
                }
                Intent showbrowser = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(showbrowser);

            }




        });
    }


    }



