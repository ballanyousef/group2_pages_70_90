package yb.it.group2_pages_70_90;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ActivityPage73 extends AppCompatActivity {

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
        sk1.setOnSeekBarChangeListener(sk1Listener);

        sk2=findViewById(R.id.seekBar2);
        sk2.setOnSeekBarChangeListener(sk2Listener);

        sk3=findViewById(R.id.seekBar3);
        sk3.setOnSeekBarChangeListener(sk3Listener);

        x1=1+rnd.nextInt(sk1.getProgress());
        x2=1+rnd.nextInt(sk2.getProgress());
        x3=1+rnd.nextInt(sk3.getProgress());
        udpateView();



    }


//------------------------------------------------------------------------------------
private void udpateView() {
    int r=x1+x2+x3;
    tv1.setText(r+"");
}

//----------------------------------------------------------------------------
    private SeekBar.OnSeekBarChangeListener sk1Listener=new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

            //Toast.makeText(ActivityPage73.this, ""+rnd.nextInt(30), Toast.LENGTH_SHORT).show();


            try {
                x1= 1+rnd.nextInt(sk1.getProgress());
            }catch (Exception e){
                x1=0;
            }

            udpateView();

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
    //----------------------------------------------------------------------------------
    private SeekBar.OnSeekBarChangeListener sk2Listener=new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            try {
                x2=1+rnd.nextInt(sk2.getProgress());
            }catch (Exception e){
                x2=0;
            }
            udpateView();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
    //--------------------------------------------------------------------
    private SeekBar.OnSeekBarChangeListener sk3Listener=new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {



            try {
                x3=1+rnd.nextInt(sk3.getProgress());
            }catch (Exception e){
                x3=0;
            }


            udpateView();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
}