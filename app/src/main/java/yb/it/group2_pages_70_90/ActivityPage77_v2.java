package yb.it.group2_pages_70_90;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ActivityPage77_v2 extends AppCompatActivity {

    //note : implements page 73 in another option

    TextView tv1;
    SeekBar sk1;

    int x1=0;
    Random rnd=new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page73);
        rnd=new Random();

        tv1=(TextView)findViewById(R.id.textView2);

        sk1=(SeekBar)findViewById(R.id.seekBar1);
        sk1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Toast.makeText(ActivityPage77_v2.this, "hi", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

}
