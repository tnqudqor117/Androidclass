package com.example.baekbyoungsoo.androidclass;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;



       Button btn = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), R.string.button_clicked_msg,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
   public void OnClickB1(View v) {
        Toast.makeText(getApplicationContext(), R.string.button_clicked_msg,
                Toast.LENGTH_SHORT).show();
    }

}