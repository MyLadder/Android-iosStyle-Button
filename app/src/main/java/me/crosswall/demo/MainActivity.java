package me.crosswall.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import me.crosswall.R;
import me.crosswall.library.IOSButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.iosbutton_default).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"default",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.iosbutton_01).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"green",Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.iosbutton_02).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"red",Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.iosbutton_03).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"yellow",Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.iosbutton_04).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"grey",Toast.LENGTH_SHORT).show();
            }
        });

        IOSButton iosButton_05 = (IOSButton) findViewById(R.id.iosbutton_05);
        iosButton_05.setDrawableLeftText("Chat",R.mipmap.ic_chat_icon);
        iosButton_05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "drawable left", Toast.LENGTH_SHORT).show();
            }
        });

        IOSButton iosButton_06 = (IOSButton) findViewById(R.id.iosbutton_06);
        iosButton_06.setDrawableRightText("Follow",R.mipmap.ic_follow_add);
        iosButton_06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"drawable right",Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.iosbutton_07).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"cornerRadius = 18dp",Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.iosbutton_08).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"cornerRadius = 18dp",Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.iosbutton_09).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"use custom style",Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.iosbutton_10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"use custom style",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
