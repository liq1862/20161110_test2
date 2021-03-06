package com.example.user.a20161110_test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,"關於我們");                     // menu.add(Group,ItemId,Order,title)
        menu.add(0,1,1,"設定");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == 0)
        {
            Toast.makeText(MainActivity.this,"按下關於我們",Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId() == 1)
        {
            Toast.makeText(MainActivity.this,"按下設定",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
