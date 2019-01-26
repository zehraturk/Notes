package com.example.zehra.notes;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity{
    public static int sayac=0;
    private SharedPreferences mPreferences;
    private String sharedPrefFile =
            "com.example.zehra.hellosharedprefs";
    private EditText baslik_edittext;
    private EditText not_metni_edittext;
    private Button kaydet_butonu;

    // Key for current count
    private final String BASLIK_KEY = "baslik";
    // Key for current color
    private final String NOT_METNI_KEY = "not metni";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        baslik_edittext=(EditText)findViewById(R.id.editText);
        not_metni_edittext=(EditText)findViewById(R.id.editText3);
        kaydet_butonu=(Button)findViewById(R.id.button);
        mPreferences = getSharedPreferences(sharedPrefFile, MODE_PRIVATE);
        Intent intent=getIntent();


    }

    protected void onPause(){
        super.onPause();
        /*SharedPreferences.Editor preferencesEditor = mPreferences.edit();
        preferencesEditor.putString(BASLIK_KEY,baslik_edittext.getText().toString());
        preferencesEditor.putString(NOT_METNI_KEY, not_metni_edittext.getText().toString());
        preferencesEditor.apply();
        sayac++;
        ArrayOfStuff.dizi[sayac]=baslik_edittext.getText().toString();*/
        finish();

    }

    public void kaydet(View view) {

        SharedPreferences.Editor preferencesEditor = mPreferences.edit();
        preferencesEditor.putString(BASLIK_KEY,baslik_edittext.getText().toString());
        preferencesEditor.putString(NOT_METNI_KEY, not_metni_edittext.getText().toString());
        preferencesEditor.apply();
        sayac++;
        ArrayOfStuff.dizi[sayac]=baslik_edittext.getText().toString();


}}
