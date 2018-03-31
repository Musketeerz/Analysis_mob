package com.example.musketeers.realm;

import android.graphics.Color;
import android.os.Build;
import android.service.autofill.Dataset;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class AnalysisActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);

        //P I E C H A R T

        final PieChart pieChart = (PieChart)findViewById(R.id.chart1
        );
        List<PieEntry> entries = new ArrayList<>();

        entries.add(new PieEntry(18.5f, "Green"));
        entries.add(new PieEntry(26.7f, "Yellow"));
        entries.add(new PieEntry(24.0f, "Red"));
        entries.add(new PieEntry(30.8f, "Blue"));
        PieDataSet set = new PieDataSet(entries, "CONSUMPTION");
        PieData data = new PieData(set);
        //set.setColors((new int[] { Color.rgb(255,255,0),Color.rgb(255,255,123),Color.rgb(255,0,255),Color.rgb(0,255,255) }), this);
        final int[] MY_COLORS = {Color.rgb(192,0,0), Color.rgb(255,0,0), Color.rgb(255,192,0),
                Color.rgb(127,127,127), Color.rgb(146,208,80), Color.rgb(0,176,80), Color.rgb(79,129,189)};


        ArrayList<Integer> colors = new ArrayList<Integer>();

        for(int c: MY_COLORS) colors.add(c);
        set.setColors(colors);

        pieChart.setData(data);
        pieChart.animateY(1000);

        pieChart.invalidate(); // refresh


        //L I N E C H A R T
        final LineChart chart =  findViewById(R.id.chart);

        chart.getDescription().setEnabled(false);

        chart.getAxisLeft().setDrawGridLines(true);
        chart.getAxisRight().setDrawGridLines(false);
        chart.getXAxis().setEnabled(false);


        YAxis left = chart.getAxisLeft();
        left.setEnabled(true);
        YAxis right = chart.getAxisRight();
        right.setEnabled(false);

        ArrayList<Entry> dataset1 = new ArrayList<Entry>();
        dataset1.add(new Entry(1f, 0));
        dataset1.add(new Entry(2f, 1));
        dataset1.add(new Entry(3f, 2));
        dataset1.add(new Entry(4f, 3));
        dataset1.add(new Entry(5f, 4));
        dataset1.add(new Entry(6f, 5));
        dataset1.add(new Entry(7f, 6));

//float[] dataIn = {
//      3f, 4f, 5f, 6f, 7f, 8f, 9f
//};

//values for datainput Dataset2 at your axisone positions
        ArrayList<Entry> dataset2 = new ArrayList<Entry>();
        dataset2.add(new Entry(3f, 0));
        dataset2.add(new Entry(4f, 2));
        dataset2.add(new Entry(5f, 4));
        dataset2.add(new Entry(6f, 5));
        dataset2.add(new Entry(7f, 6));
        dataset2.add(new Entry(8f, 7));
        dataset2.add(new Entry(9f, 8));



       final ArrayList<Entry> dataset3 = new ArrayList<Entry>();
        dataset1.add(new Entry(0f, 0));
        dataset1.add(new Entry(1.72f, 1));
        dataset1.add(new Entry(3.5f, 2));
        dataset1.add(new Entry(7.2f, 3));
        dataset1.add(new Entry(10.3f, 4));




     final   ArrayList<Entry> dataset4 = new ArrayList<Entry>();
        dataset1.add(new Entry(1f, 0));
        dataset1.add(new Entry(2f, 1));
        dataset1.add(new Entry(3f, 2));
        dataset1.add(new Entry(4f, 3));
        dataset1.add(new Entry(5f, 4));
        dataset1.add(new Entry(6f, 9));
        dataset1.add(new Entry(7f, 10));


     final   ArrayList<Entry> dataset5 = new ArrayList<Entry>();
        dataset1.add(new Entry(1f, 0));
        dataset1.add(new Entry(2f, 1));
        dataset1.add(new Entry(3f, 2));
        dataset1.add(new Entry(4f, 3));
        dataset1.add(new Entry(5f, 4));
        dataset1.add(new Entry(6f, 9));


     final   ArrayList<Entry> dataset6 = new ArrayList<Entry>();
        dataset1.add(new Entry(1f, 0));
        dataset1.add(new Entry(2f, 1));
        dataset1.add(new Entry(3f, 2));
        dataset1.add(new Entry(4f, 3));
        dataset1.add(new Entry(5f, 4));
        dataset1.add(new Entry(6f, 9));
        dataset1.add(new Entry(7f, 10));


        final  ArrayList<Entry> dataset7 = new ArrayList<Entry>();
        dataset1.add(new Entry(1f, 0));
        dataset1.add(new Entry(2f, 1));
        dataset1.add(new Entry(3f, 2));
        dataset1.add(new Entry(4f, 3));
        dataset1.add(new Entry(5f, 4));
        dataset1.add(new Entry(6f, 9));
        dataset1.add(new Entry(7f, 10));

      final  ArrayList<Entry> dataset8 = new ArrayList<Entry>();
        dataset1.add(new Entry(1f, 0));
        dataset1.add(new Entry(2f, 1));
        dataset1.add(new Entry(3f, 2));
        dataset1.add(new Entry(4f, 3));
        dataset1.add(new Entry(5f, 4));
        dataset1.add(new Entry(6f, 9));
        dataset1.add(new Entry(7f, 10));

        final ArrayList<Entry> dataset9 = new ArrayList<Entry>();
        dataset1.add(new Entry(1f, 0));
        dataset1.add(new Entry(2f, 1));
        dataset1.add(new Entry(3f, 2));
        dataset1.add(new Entry(4f, 3));
        dataset1.add(new Entry(5f, 4));
        dataset1.add(new Entry(6f, 9));
        dataset1.add(new Entry(7f, 10));

        final  ArrayList<Entry> dataset10 = new ArrayList<Entry>();
        dataset1.add(new Entry(1f, 0));
        dataset1.add(new Entry(2f, 1));
        dataset1.add(new Entry(3f, 2));
        dataset1.add(new Entry(4f, 3));
        dataset1.add(new Entry(5f, 4));
        dataset1.add(new Entry(6f, 9));
        dataset1.add(new Entry(7f, 10));

        final  ArrayList<Entry> dataset11 = new ArrayList<Entry>();
        dataset1.add(new Entry(1f, 0));
        dataset1.add(new Entry(2f, 1));
        dataset1.add(new Entry(3f, 2));
        dataset1.add(new Entry(4f, 3));
        dataset1.add(new Entry(5f, 4));
        dataset1.add(new Entry(6f, 9));
        dataset1.add(new Entry(7f, 10));

        final ArrayList<Entry> dataset12 = new ArrayList<Entry>();
        dataset1.add(new Entry(1f, 0));
        dataset1.add(new Entry(2f, 1));
        dataset1.add(new Entry(3f, 2));
        dataset1.add(new Entry(4f, 3));
        dataset1.add(new Entry(5f, 4));
        dataset1.add(new Entry(6f, 9));
        dataset1.add(new Entry(7f, 10));

        final  ArrayList<Entry> dataset13 = new ArrayList<Entry>();
        dataset1.add(new Entry(1f, 0));
        dataset1.add(new Entry(2f, 1));
        dataset1.add(new Entry(3f, 2));
        dataset1.add(new Entry(4f, 3));
        dataset1.add(new Entry(5f, 4));
        dataset1.add(new Entry(6f, 9));
        dataset1.add(new Entry(7f, 10));

        final ArrayList<Entry> dataset14 = new ArrayList<Entry>();
        dataset1.add(new Entry(1f, 0));
        dataset1.add(new Entry(2f, 1));
        dataset1.add(new Entry(3f, 2));
        dataset1.add(new Entry(4f, 3));
        dataset1.add(new Entry(5f, 4));
        dataset1.add(new Entry(6f, 9));
        dataset1.add(new Entry(7f, 10));

//String[] xAxisOne = new String[] {
//      "0", "1", "2", "3", "4", "5", "6"
//};

///String[] xAxisTwo = new String[] {
///     "0", "2", "4", "5", "6", "8", "9"
///};


// Union from xAxisOne and xAxisTwo
        String[] xAxis = new String[] {"0", "1", "2", "3", "4", "5", "6", "8", "9"};


    final    ArrayList<ILineDataSet> lines = new ArrayList<ILineDataSet> ();

        LineDataSet lDataSet1 = new LineDataSet(dataset1, "DataSet1");
        lDataSet1.setColor(Color.RED);
        lDataSet1.setCircleColor(Color.RED);
        lines.add(lDataSet1);
        lines.add(new LineDataSet(dataset2, "DataSet2"));
       // lines.add(new LineDataSet(dataset3, "DataSet3"));
        //lines.add(new LineDataSet(dataset4, "DataSet4"));



        LineData dataa = new LineData(lines);
        chart.setData(dataa);
        chart.invalidate();

        CardView a = (CardView) findViewById(R.id.card1);

        final TextView title = (TextView)findViewById(R.id.textView2);
        title.setTextColor(Color.rgb(0,0,0));

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title.setText("WATER MOTOR");
                //new ReColor(MainActivity.this).setCardViewColor(L , "#F06292", "BA68C8", 600);
                chart.setVisibility(View.VISIBLE);

                pieChart.setVisibility(View.INVISIBLE);
                // pieChart.animateY(1000);
               // graph.animateXY(900,4000);

            }
        });




        CardView  b = (CardView) findViewById(R.id.card2);
        //final TextView title = (TextView)findViewById(R.id.textView2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title.setText("IRON BOX");
                //new ReColor(MainActivity.this).setCardViewColor(L ,  "BA68C8","9575CD" ,600);
                chart.setVisibility(View.VISIBLE);

                pieChart.setVisibility(View.INVISIBLE);
                // pieChart.animateY(1000);
              //  chart.animateXY(900,4000);


            }
        });


        CardView  c = (CardView) findViewById(R.id.card3);
        //  final TextView title = (TextView)findViewById(R.id.textView2);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title.setText("OUT LAMP");
                //new ReColor(MainActivity.this).setCardViewColor(L ,"9575CD" ,"7986CB",600);
                chart.setVisibility(View.VISIBLE);
                pieChart.setVisibility(View.INVISIBLE);
                // pieChart.animateY(1000);
               // chart.animateXY(900,4000);

            }
        });


        CardView  d = (CardView) findViewById(R.id.card4);
        // final TextView title = (TextView)findViewById(R.id.textView2);

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title.setText("BEDROOM LAMP");
                //  new ReColor(MainActivity.this).setCardViewColor(L ,"7986CB","64B5F6",600);
                chart.setVisibility(View.VISIBLE);
                pieChart.setVisibility(View.INVISIBLE);
                //   pieChart.animateY(1000);
               // chart.animateXY(900,4000);

            }
        });


        CardView  e = (CardView) findViewById(R.id.card5);
        //final TextView title = (TextView)findViewById(R.id.textView2);

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title.setText("FAN");
                // new ReColor(MainActivity.this).setCardViewColor(L ,"64B5F6","4FC3F7",600);
                chart.setVisibility(View.VISIBLE);
                pieChart.setVisibility(View.INVISIBLE);
                // pieChart.animateY(1000);
//                chart.animateXY(900,4000);

            }
        });



        CardView  f = (CardView) findViewById(R.id.card6);
        //final TextView title = (TextView)findViewById(R.id.textView2);

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title.setText("WASHING MACHINE");

                //  new ReColor(MainActivity.this).setCardViewColor(L ,"4FC3F7","4DD0E1",600);
                chart.setVisibility(View.VISIBLE);
                pieChart.setVisibility(View.INVISIBLE);
                // pieChart.animateY(1000);
              //  chart.animateXY(900,4000);

            }
        });



        CardView  g = (CardView) findViewById(R.id.card7);
        //final TextView title = (TextView)findViewById(R.id.textView2);

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title.setText("WATER HEATER");
                //   new ReColor(MainActivity.this).setCardViewColor(L ,"4DD0E1","4DB6AC",600);
                chart.setVisibility(View.VISIBLE);
                // pieChart.setVisibility(View.INVISIBLE);

               // chart.animateXY(900,4000);

            }
        });




    }
}


