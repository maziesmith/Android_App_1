package com.example.prati.mp2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by prati on 10/1/2016.
 */

public class Showlist extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showlist);
        ListView listViewItems;
        ArrayList<ArrayList<CarDealerInfo>> searchResults= GetSearchResults();



        int position = getIntent().getExtras().getInt("pos");





        listViewItems = (ListView) findViewById(R.id.listview);

        listViewItems.setAdapter(new MyCustomBaseAdapter(this,searchResults.get(position)));



        View header = (View)getLayoutInflater().inflate(R.layout.listviewheader, null);
        listViewItems.addHeaderView(header);





    }


    public ArrayList<ArrayList<CarDealerInfo>> GetSearchResults() {
        ArrayList<ArrayList<CarDealerInfo>> temp = new ArrayList<ArrayList<CarDealerInfo>>();
        ArrayList<CarDealerInfo> BMW = new ArrayList<CarDealerInfo>();
        ArrayList<CarDealerInfo> Chevy = new ArrayList<CarDealerInfo>();
        ArrayList<CarDealerInfo> Ford = new ArrayList<CarDealerInfo>();
        ArrayList<CarDealerInfo> Honda = new ArrayList<CarDealerInfo>();
        ArrayList<CarDealerInfo> Volkswagen = new ArrayList<CarDealerInfo>();
        ArrayList<CarDealerInfo> Mercedes = new ArrayList<CarDealerInfo>();
        ArrayList<CarDealerInfo> Nissan = new ArrayList<CarDealerInfo>();
        ArrayList<CarDealerInfo> Toyota = new ArrayList<CarDealerInfo>();

        BMW.add(new CarDealerInfo("Perillo BMW", "1035 N Clark St., Chicago, IL 60610","(312) 981-0000"));
        BMW.add(new CarDealerInfo("Elmhurst BMW Jaguar","466 West Lake St.Elmhurst, IL 60126","1-844-735-9367"));
        BMW.add(new CarDealerInfo("Fields BMW of Northfield", "700 West Frontage Road Northfield, IL 60093","1-866-462-6098"));
        temp.add(0,BMW);

        Chevy.add(new CarDealerInfo("Kingdom Chevrolet", "6603 S. Western Ave Chicago, IL 60636","1-877-260-2304"));
        Chevy.add(new CarDealerInfo("Rogers Auto Group", "2720 S Michigan Ave Chicago, IL 60616-2819","1-888-880-9693"));
        Chevy.add(new CarDealerInfo("Mike Anderson Chevrolet - Chicago", "5333 W Irving Park Rd Chicago, IL 60641","1-844-570-0814"));
        temp.add(1,Chevy);

        Ford.add(new CarDealerInfo("Metro Ford", "6455 S Western Ave Chicago, IL 60636","1-888-397-0142"));
        Ford.add(new CarDealerInfo("Hawk Ford", "6100 W 95th St Oak Lawn, IL 60453-2784","1-888-801-1370"));
        Ford.add(new CarDealerInfo("Bredemann Ford", "2038 N. Waukegan Rd Glenview, IL 60025-1722","847-998-4000"));
        temp.add(2,Ford);

        Honda.add(new CarDealerInfo("Fletcher Jones Honda", "1100 North Clark Street Chicago, IL 60610","1-866-730-0610"));
        Honda.add(new CarDealerInfo("Honda City", "4950 S Pulaski Rd Chicago, IL 60632-4217","1-888-905-0750"));
        Honda.add(new CarDealerInfo("Grossinger Honda", "6600 N WESTERN AVE CHICAGO, IL 60645","1-866-251-8860"));
        temp.add(3,Honda);

        Volkswagen.add(new CarDealerInfo("Fletcher Jones Volkswagen", "1111 N. Clark Chicago, IL 60610","1-888-460-7170"));
        Volkswagen.add(new CarDealerInfo("The Autobarn City Mazda & Volkswagen", "3255 N Cicero Ave Chicago, IL 60641","773-794-7800"));
        Volkswagen.add(new CarDealerInfo("The Autobarn City Volkswagen", "5330 W. Irving Park Dr Chicago, IL 60641","1-888-851-8194"));
        temp.add(4,Volkswagen);

        Mercedes.add(new CarDealerInfo("Mercedes-Benz Of Chicago", "1520 West North Ave Chicago, IL 60642","1-888-706-7151"));
        Mercedes.add(new CarDealerInfo("Mercedes-Benz of Westmont", "200 East Ogden Avenue Westmont, IL 60559","1-888-819-4049"));
        Mercedes.add(new CarDealerInfo("Autohaus on Edens Inc", "1600 Frontage Rd Northbrook, IL 60062-4129","1-844-388-2510"));
        temp.add(5,Mercedes);

        Nissan.add(new CarDealerInfo("Mid City Nissan", "4444 W Irving Park Rd Chicago, IL 60641-2807","1-877-768-2385"));
        Nissan.add(new CarDealerInfo("Western Avenue Nissan", "7410 S Western Avenue Chicago, IL 60636","1-877-331-9008"));
        Nissan.add(new CarDealerInfo("The Autobarn Nissan of Evanston", "1012 Chicago Avenue Evanston, IL 60202","1-866-251-1-877-786-8919"));
        temp.add(6,Nissan);

        Toyota.add(new CarDealerInfo("Chicago Northside Toyota", "5625 N Broadway Chicago, IL 60660","1-877-705-6049"));
        Toyota.add(new CarDealerInfo("Toyota on Western", "6941 S Western Ave Chicago, IL 60636-3119","1-888-591-5869"));
        Toyota.add(new CarDealerInfo("Grossinger Toyota North", "7225 N CICERO AVE LINCOLNWOOD, IL 60712-1611","1-800-915-2651"));
        temp.add(7,Toyota);


        return temp;
    }
}

