package yb.it.group2_pages_70_90;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class ActivityPage92 extends AppCompatActivity {

    TextView tv1=null;
    HashMap<String,Boolean>cMap=new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page92);

        tv1=findViewById(R.id.textView);

        cMap.put("course1",true);
        cMap.put("course2", true);
        cMap.put("course3", true);
        cMap.put("course4", true);
        cMap.put("course5", true);
        cMap.put("course6", true);
    }



    public void btnClick(View view) {
       final  String[] stAry = cMap.keySet().toArray(new String[0]);//stAry[0]="course1",..

        boolean[] boolAry = new boolean[cMap.size()];

        for (int i = 0; i < stAry.length; i++) {
            boolAry[i] = cMap.get(stAry[i]);
        }


        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("this is a title");
        builder.setMultiChoiceItems(stAry, boolAry, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                cMap.put(stAry[i],b);

            }
        });


        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(ActivityPage92.this, "we ca...", Toast.LENGTH_SHORT).show();

            }
        });


        builder.setPositiveButton(
                "init",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        displayAllCourses();
                    }
                }

        );


        AlertDialog d=builder.create();
        d.show();


    }


    public void displayAllCourses() {
        Toast.makeText(this, "-----", Toast.LENGTH_SHORT).show();
         String[] stAry = cMap.keySet().toArray(new String[0]);

        for (int i = 0; i < stAry.length; i++) {
            tv1.append( "\n"+stAry[i] + ":" + cMap.get(stAry[i]));
        }
    }
}