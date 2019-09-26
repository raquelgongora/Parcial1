package com.example.parcial1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    ClaseAdapter adapter;

    ListView listView;
    SeekBar opacityBar;
    View colorView1;
    TextView textView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        final ClaseAdapter adapter = new ClaseAdapter(ListDataHelper.provideItems());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                colorView1.setBackgroundColor(ContextCompat.getColor(view.getContext(), adapter.getItem(i).getColorIcono()));
                Toast.makeText(getApplicationContext(),
                        adapter.getItem(i).getTitle(),
                        Toast.LENGTH_LONG
                ).show();
            }
        });




        opacityBar = (SeekBar)findViewById(R.id.opacityBar);
        colorView1 = (View) findViewById(R.id.ColorView1);
        textView1 = (TextView) findViewById(R.id.textView1);




        opacityBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

@Override
public void onProgressChanged(SeekBar seekBar, int progress,
        boolean fromUser) {
        //setAlpha (float alpha)
        //alpha between 0 and 1

        colorView1.setAlpha((float)progress/255);
    int value = opacityBar.getProgress();



        }

@Override
public void onStartTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub

        }

@Override
public void onStopTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub


        }});





        }

        }