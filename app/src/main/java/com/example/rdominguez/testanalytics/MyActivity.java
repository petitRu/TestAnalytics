package com.example.rdominguez.testanalytics;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity {

        Button bt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_my);
        bt1 = (Button)findViewById(R.id.bt1);
        bt1.setOnClickListener(myhandler1);



//        View.OnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                GoogleAnalyticsHelper.trackEvent(getApplicationContext(), GoogleAnalyticsHelper.CategoryType.ACCES_AVIS, "13", "test", 0L);
//            }
//        });
    }

    View.OnClickListener myhandler1 = new View.OnClickListener() {
        public void onClick(View v) {
            Log.d("ANALYTICS","SENDING...");
            GoogleAnalyticsHelper.trackEvent(getApplicationContext(), GoogleAnalyticsHelper.CategoryType.ACCES_AVIS, "13", "test", 0L);
            Log.d("ANALYTICS","SENT");
        }
    };
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }


}
