package com.doge.testdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toastButton (View view){
        EditText editText = (EditText)findViewById(R.id.edit_text);
        String string = editText.getText().toString();
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_LONG).show();
    }
    public void imageViewButton (View view){
        Intent intent = new Intent(MainActivity.this,imageViewActivity.class);
        startActivity(intent);
    }
    public void alertDialogButton (View view){
        
    }
}
