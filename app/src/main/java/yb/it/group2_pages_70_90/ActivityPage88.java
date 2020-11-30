package yb.it.group2_pages_70_90;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class ActivityPage88 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page88);
    }

    public void btnClick(View view) {


        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("hello");
        builder.setMessage("some message..");
        builder.setIcon(R.drawable.ic_launcher_background);

        builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
             //option with ok
            }
        });




        AlertDialog mDialog=builder.create();


    }
}