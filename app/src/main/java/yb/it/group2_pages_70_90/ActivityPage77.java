package yb.it.group2_pages_70_90;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ActivityPage77 extends AppCompatActivity {

    //note : implements page 73 in another option

    TextView tv1;
    SeekBar sk1;
    SeekBar sk2;
    SeekBar sk3;

    int x1=0;
    int x2=0;
    int x3=0;

    Random rnd=new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page73);


        tv1=(TextView)findViewById(R.id.textView2);

        sk1=(SeekBar)findViewById(R.id.seekBar1);
        sk1.setOnSeekBarChangeListener(listener4All);

        sk2=findViewById(R.id.seekBar2);
        sk2.setOnSeekBarChangeListener(listener4All);

        sk3=findViewById(R.id.seekBar3);
        sk3.setOnSeekBarChangeListener(listener4All);

        x1=1+rnd.nextInt(sk1.getProgress());
        x2=1+rnd.nextInt(sk2.getProgress());
        x3=1+rnd.nextInt(sk3.getProgress());

    }
    private SeekBar.OnSeekBarChangeListener listener4All=new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

            if (seekBar==sk1){
            Toast.makeText(ActivityPage77.this, "Hi--sk1----", Toast.LENGTH_SHORT).show();
            }
             if (seekBar==sk2){
            Toast.makeText(ActivityPage77.this, "Hi--sk2----", Toast.LENGTH_SHORT).show();
            }
             if (seekBar==sk3){
            Toast.makeText(ActivityPage77.this, "Hi--sk3----", Toast.LENGTH_SHORT).show();
            }





        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };



}
