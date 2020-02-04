package cs301.birthdaycake;

public class CakeModel {
    boolean lit = true;
    int candlesShown = 2;
    boolean frostingOn = true;
    boolean candlesOn = true;

    public void setLit(boolean l){
        lit = l;
    }
    public void setCandlesOn(boolean c){
        candlesOn = c;
    }
    public void setCandlesShown(int a){
        candlesShown = a;
    }
}
