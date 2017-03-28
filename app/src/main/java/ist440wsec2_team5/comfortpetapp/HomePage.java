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

    public void gotoApplicationInformation(View view)
    {
       Intent intent =  new Intent(this, ApplicationInformation.class);
        startActivity(intent);
    }

    public void gotoMyCat(View view)
    {
        Intent intent =  new Intent(this, MyCat.class);
        startActivity(intent);
    }
}