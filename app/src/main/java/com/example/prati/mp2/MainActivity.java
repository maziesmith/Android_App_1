package com.example.prati.mp2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView grid;
    String[] carnames={"BMW","Chevrolet","Ford","Honda","Volkswagen","Mercedes","Nissan","Toyota"};

    static int[] images={R.drawable.bmw,R.drawable.chevrolet,R.drawable.ford,R.drawable.honda,
            R.drawable.volkswagen,R.drawable.mercedes,R.drawable.nissan,R.drawable.toyota};

    static int[] imagesthumbnails={R.drawable.bmwthumb,R.drawable.chevroletthumb,R.drawable.fordthumb,R.drawable.hondathumb,
            R.drawable.volkswagenthumb,R.drawable.mercedesthumb,R.drawable.nissanthumb,R.drawable.toyotathumb};


   static String[] urls={"http://www.bmwusa.com/","http://www.chevrolet.com/","http://www.ford.com/","http://www.honda.com/",
            "http://www.volkswagen.com/","https://www.mbusa.com/mercedes/index","https://www.nissanusa.com/",
            "http://www.toyota.com/","http://www.google.com"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid= (GridView) findViewById(R.id.gridview);
        AdapterActivity adapter=new AdapterActivity(this,carInfo());
        grid.setAdapter(adapter);
        registerForContextMenu(grid);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent showfullimage=new Intent(getApplicationContext(),showfullimg.class);
                showfullimage.putExtra("imgpos",position);
                startActivity(showfullimage);

            }
        });




    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo ) {
        super.onCreateContextMenu(menu,v,menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.infomenu, menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo contextMenuInfo=(AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
        switch(item.getItemId())
        {
            case R.id.showpic:

                Intent showimg = new Intent(getApplicationContext(),showfullimg.class);
                showimg.putExtra("imgpos",contextMenuInfo.position);
                startActivity(showimg);
                return true;
            case R.id.showbrowser:
                Intent showlink = new Intent(Intent.ACTION_VIEW,Uri.parse(urls[contextMenuInfo.position]));
                startActivity(showlink);
                return true;

            case R.id.showlist:
                Intent showlist = new Intent(getApplicationContext(),Showlist.class);
                showlist.putExtra("pos",contextMenuInfo.position);
                startActivity(showlist);
                return true;

        }

        return super.onContextItemSelected(item);
    }


    private ArrayList<Car> carInfo(){
        ArrayList<Car> Cars=new ArrayList<Car>();
        Cars.add(new Car(carnames[0],imagesthumbnails[0]));
        Cars.add(new Car(carnames[1],imagesthumbnails[1]));
        Cars.add(new Car(carnames[2],imagesthumbnails[2]));
        Cars.add(new Car(carnames[3],imagesthumbnails[3]));
        Cars.add(new Car(carnames[4],imagesthumbnails[4]));
        Cars.add(new Car(carnames[5],imagesthumbnails[5]));
        Cars.add(new Car(carnames[6],imagesthumbnails[6]));
        Cars.add(new Car(carnames[7],imagesthumbnails[7]));


    return Cars;
    }



}
