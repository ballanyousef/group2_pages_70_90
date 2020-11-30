package yb.it.group2_pages_70_90;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity70 extends AppCompatActivity {

    SeekBar skBar1;
    TextView txtResult;
    //option 2 working with button with event
    Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        option 1 for getting reference
//        txtResult= (TextView)    findViewById(R.id.textView1);
//        skBar1=    (SeekBar)     findViewById(R.id.seekBar1);
        //option2
        txtResult=    findViewById(R.id.textView);

        skBar1=        findViewById(R.id.seekBar1);
        skBar1.setOnSeekBarChangeListener(skBar1Listener);


        //option 2 for creating button event
        btn2=findViewById(R.id.button2);

        btn2.setOnClickListener(btn2Listener);

    }

    //option 1 for event in button
    public void btn_do_OnClick(View view) {
        Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();
        txtResult.setText("Hello this the button");
    }

    private View.OnClickListener btn2Listener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            txtResult.setText("Hello this the button2");

        }
    };
    //------------end of button event

    private SeekBar.OnSeekBarChangeListener skBar1Listener=new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

            int x=skBar1.getProgress();
            txtResult.setText(x+"");

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

            Toast.makeText(MainActivity70.this, "1", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            Toast.makeText(MainActivity70.this, "2", Toast.LENGTH_SHORT).show();


        }
    };

    //-------------end od seek bar event
}
