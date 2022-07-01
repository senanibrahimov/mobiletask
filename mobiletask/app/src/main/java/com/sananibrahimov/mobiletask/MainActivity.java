package com.sananibrahimov.mobiletask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Spinner spinner;
Spinner il;
Spinner ay;
PieChart pieChart;

ArrayAdapter<String> arrayAdapter,iladapter,ayadapter;
 String array[]={"0000 2222 3333 4444","1111 2222 3333 4444","3333 4444 5555 7777"};
    String ay_arayyi[]={"2022","2019","2017"};
    String il_arrayi[]={"yanvar","iyun","oktyabr"};

    ArrayList<dataclass> dataclasses;

    RecyclerView recyclerView;
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       spinner=findViewById(R.id.spinnerbankcard);
       il=findViewById(R.id.il);
       ay=findViewById(R.id.ay);
       recyclerView=findViewById(R.id.reycelviewid);
       pieChart=findViewById(R.id.pichart);
       textView=findViewById(R.id.expences2);


        setPieChart();
 ay();
 il();
 cards();

 dataclass airlines=new dataclass("Airlines",R.drawable.airlines);
 dataclass rent_a_car_=new dataclass("Rent a car ",R.drawable.rentacar);
        dataclass hotel_and_motels=new dataclass("Hotel And Motels",R.drawable.hotelandmotel);
      dataclass transport=new dataclass("transport",R.drawable.ic_group_104__4_);
      dataclass cars_and_vehicle=new dataclass("Cars and Vehicle",R.drawable.carsandvehicle);
      dataclass goverment=new dataclass("Goverment Services  salamam       ",R.drawable.goverment);


 dataclasses=new ArrayList<>();
 dataclasses.add(airlines);
 dataclasses.add(rent_a_car_);
        dataclasses.add(hotel_and_motels);
        dataclasses.add(transport);
        dataclasses.add(cars_and_vehicle);
        dataclasses.add(goverment);


 recycelviewadapter recycelviewadapter=new recycelviewadapter(dataclasses,MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
 recyclerView.setAdapter(recycelviewadapter);






    }
    public void ay(){
        ayadapter=new ArrayAdapter<String>(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,ay_arayyi);
        ay.setAdapter(ayadapter);
    }
    public void il(){
        iladapter=new ArrayAdapter<String>(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,il_arrayi);
        il.setAdapter(iladapter);
    }
    public void cards(){
        arrayAdapter=new ArrayAdapter<String>(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,array);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    public void setPieChart(){
       pieChart.addPieSlice(new PieModel("leh",23, Color.parseColor("#FAA61A")));
        pieChart.addPieSlice(new PieModel("leh",21, Color.parseColor("#FF3700B3")));
         pieChart.setInnerValueString("salam");


         
    }
    public  void secondactivity(View view){
        Intent intent=new Intent(MainActivity.this,transport.class);

            startActivity(intent);

    }
}