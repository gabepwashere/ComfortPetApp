package ist440wsec2_team5.comfortpetapp;

import android.content.Intent;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MyCat extends AppCompatActivity {

    //this is hard coded for testing purposes until we can get the actual
    // battery level from the raspi
    public int catBattery = 10;
    Image imageCatRED;
    Image imageCatREDLight;
    Image imageCatBLUE;
    Image imageCatBLUELight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cat);
    }
    public void gotoWifiSettings(View view) {
        Intent intent = new Intent(this, WifiSettings.class);
        startActivity(intent);
    }
    /* This is a god damn nightmare, this is the if else statement to start getting the
    specific image to show according the battery way up above which needs to be able to
    update based on the actual battery level.
    public void showcatbatteryimage()
    {
        //we need to have the visibility of all 4 images set to
        // invisible until the if statement below can start
        if (catBattery >= 75)
        {
            //imageCatBLUE(View.VISIBLE); <---- this doesnt do shit
        }
        else if (catBattery >=50)
        {
            //the statement to show imageCatBLUELight
        }
        else if (catBattery >=25)
        {
            //the statement to show imageCatREDLight
        }
        else if (catBattery >=0)
        {
            //the statement to show imageCatRED
        }
    }
    */
}
