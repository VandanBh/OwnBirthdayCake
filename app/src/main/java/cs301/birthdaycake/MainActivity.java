package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView cakeView = findViewById(R.id.cakeview);
        String TAG = "Activity";
        Log.i(TAG, "CakeView instantiated in MainActivity");
        CakeController cakeController = new CakeController(cakeView);
        Log.i(TAG, "CakeController instantiated in MainActivity");
    }
    public void goodbye(View button) {
        Log.i("button", "Goodbye");
        finishAffinity();
    }
}
