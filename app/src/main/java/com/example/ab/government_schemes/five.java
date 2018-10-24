package com.example.ab.government_schemes;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class five extends AppCompatActivity {

    ListView lv;
    String[] val= new String[]{"Pradhan Mantri Matru Vandana Yojana","Prerna Scheme","Mahila Coir Yojana","One Stop Centre Scheme","Working Women Hostel"};
    int imgs[]={R.drawable.one ,R.drawable.tw, R.drawable.th, R.drawable.f, R.drawable.fi};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        lv= (ListView)findViewById(R.id.lv);
        MyAdapter ad= new MyAdapter(this,val,imgs);
        lv.setAdapter(ad);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                if(i==0){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://vikaspedia.in/social-welfare/women-and-child-development/women-development-1/pradhan-mantri-matru-vandana-yojana"));
                    startActivity(intent);
                }

                if(i==1){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://vikaspedia.in/social-welfare/women-and-child-development/women-development-1/prerna-scheme"));
                    startActivity(intent);
                }

                if(i==2){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://vikaspedia.in/social-welfare/women-and-child-development/women-development-1/mahila-coir-yojana"));
                    startActivity(intent);
                }

                if(i==3){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://vikaspedia.in/social-welfare/women-and-child-development/women-development-1/poorna-shakti-kendras"));
                    startActivity(intent);
                }

                if(i==4){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.newincept.com/working-women-hostel.html"));
                    startActivity(intent);
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String mytit[];
        int[] imgs;

        MyAdapter(Context c,String[] val,int[] imgs){
            super(c,R.layout.row,R.id.text1,val);
            this.context=c;
            this.imgs=imgs;
            this.mytit=val;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row=layoutInflater.inflate(R.layout.row,parent,false);
            ImageView images=row.findViewById(R.id.logo);
            TextView myTitle=row.findViewById(R.id.text1);
            images.setImageResource(imgs[position]);
            myTitle.setText(val[position]);
            return row;
        }
    }

}
