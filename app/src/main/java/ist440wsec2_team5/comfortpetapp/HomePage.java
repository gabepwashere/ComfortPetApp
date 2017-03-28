package ist440wsec2_team5.comfortpetapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }
    //This ist he command to allow the user to change to
    //the Application Information Page
    public void gotoApplicationInformation(View view)
    {
       Intent intent =  new Intent(this, ApplicationInformation.class);
        startActivity(intent);
    }
    //This is the command to allow the user to
    //change to the MyCat Page by touching the Cat Button
    public void gotoMyCat(View view)
    {
        Intent intent =  new Intent(this, MyCat.class);
        startActivity(intent);
    }
    /*
    To change any additional pages, use this command below,
    change the name as gotowhatever, then for the class, use
    the name of the page you want to go to.class

    public void gotoMyCat(View view)
    {
        Intent intent =  new Intent(this, MyCat.class);
        startActivity(intent);
    }
    */
}
