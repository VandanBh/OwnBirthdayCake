package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity{

    CakeView cakeView;
    CakeController cakeController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        cakeView = findViewById(R.id.cakeview);
        String TAG = "Activity";
        cakeController = new CakeController(cakeView);

        Button blowOutButton = findViewById(R.id.blowOutButton);
        blowOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cakeController.onClick(v);
            }
        });

        Switch candlesSwitch = findViewById(R.id.candlesSwitch);
        candlesSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                cakeController.onCheckedChanged(buttonView, isChecked);
            }
        });

        SeekBar seekBar = findViewById(R.id.candlesSeekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                cakeController.onProgressChanged(seekBar, progress, fromUser);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {            }
        });
    }
    public void goodbye(View button) {
        Log.i("button", "Goodbye");
        finishAffinity();
    }
}
