package tw.lan.mylottery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    private TextView lotteryInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lotteryInfo = (TextView)findViewById(R.id.LotteryInfo);
    }

    public void CreateLottery(View v) {
        HashSet<Integer> set = new HashSet<>();
        while (set.size() < 6) {
            set.add((int)(Math.random()*49+1));
        }
        lotteryInfo.setText(set.toString());
    }
}
