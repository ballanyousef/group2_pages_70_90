package yb.it.group2_pages_70_90;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Toast;

public class ActivityPage90 extends AppCompatActivity {

    String[] items = { "first item", "second", "thered item", "last item" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page90);
    }

    public void btnClick(View view) {
        //data

        //adapter
        ListAdapter aryListAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, items);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Title");

        //builder.setAdapter(aryListAdapter,null);
        builder.setAdapter(aryListAdapter, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //i= 0,1,2,3
               //use --> items[i]

                Toast.makeText(ActivityPage90.this, ""+items[i], Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(ActivityPage90.this,MainActivity70.class);
                startActivity(intent);
            }
        });


        AlertDialog dialog=builder.create();
        dialog.show();
    }
}