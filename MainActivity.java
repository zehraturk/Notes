package com.example.zehra.notes;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences mPreferences;
    private String sharedPrefFile =
            "com.example.android.hellosharedprefs";
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    //public String dizi[]={" "," "," "," "," "," "," "," ",
      //     " "," "," "," "," "," "," "," "," "," "," "};

    Button buton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listem=(ListView)findViewById(R.id.listView1);

        ArrayAdapter<String> veriAdaptoru=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,ArrayOfStuff.dizi);

        listem.setAdapter(veriAdaptoru);
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }
}

