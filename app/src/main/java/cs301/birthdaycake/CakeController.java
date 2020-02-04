package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener{

    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView c){
        cakeView = c;
        cakeModel = cakeView.getCakeModel();
    }

    @Override
    public void onClick(View v) {
        Log.d("Button", "pressed");
        cakeView.invalidate();
        cakeModel.setLit(false);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Log.d("Switch", "flicked");
        cakeView.invalidate();
        cakeModel.setCandlesOn(false);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        Log.d("SeekBar", "Toggled");
        cakeView.invalidate();
        cakeModel.setCandlesShown(progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
