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

    String[] name=new String[]{"name1","name2","name3","name4","name5","name6"};

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
                int x=seekBar.getProgress();//5

                if(x>0) {

                    Random myRnd = new Random();
                    int y = myRnd.nextInt(x);//0,1,2,3,4


                    //Toast.makeText(ActivityPage77_v2.this, "hi"+name[0], Toast.LENGTH_SHORT).show();
                    Toast.makeText(ActivityPage77_v2.this, "hi" + name[y], Toast.LENGTH_SHORT).show();
                }
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
