package com.vaibhav.developer.ad.findings.resaerch;

/**
 * Created by Administrator on 14-05-2015.
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.vaibhav.developer.ad.findings.R;
import com.vaibhav.developer.ad.findings.news.Preferences;
import com.vaibhav.developer.ad.findings.resaerch.papers.A_I;
import com.vaibhav.developer.ad.findings.resaerch.papers.Alogorithm;
import com.vaibhav.developer.ad.findings.resaerch.papers.Crypto;
import com.vaibhav.developer.ad.findings.resaerch.papers.DS_and_PC;
import com.vaibhav.developer.ad.findings.resaerch.papers.D_Managment;
import com.vaibhav.developer.ad.findings.resaerch.papers.Data_Mining;
import com.vaibhav.developer.ad.findings.resaerch.papers.EI;
import com.vaibhav.developer.ad.findings.resaerch.papers.E_and_EC;
import com.vaibhav.developer.ad.findings.resaerch.papers.G_S;
import com.vaibhav.developer.ad.findings.resaerch.papers.H_Computer_Inter;
import com.vaibhav.developer.ad.findings.resaerch.papers.Haed_and_Arch;
import com.vaibhav.developer.ad.findings.resaerch.papers.Info;
import com.vaibhav.developer.ad.findings.resaerch.papers.Machine_Translation;
import com.vaibhav.developer.ad.findings.resaerch.papers.Machine_perception;
import com.vaibhav.developer.ad.findings.resaerch.papers.Mobile_system;
import com.vaibhav.developer.ad.findings.resaerch.papers.N_L_P;
import com.vaibhav.developer.ad.findings.resaerch.papers.Networking;
import com.vaibhav.developer.ad.findings.resaerch.papers.Soft_system;
import com.vaibhav.developer.ad.findings.resaerch.papers.Software_eng;
import com.vaibhav.developer.ad.findings.resaerch.papers.Speech_processing;

import java.util.ArrayList;
import java.util.List;

public class Test_Grid extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        if (Preferences.darkThemeEnabled(this)) {
            setTheme(R.style.AppTheme_Dark);
        }
        getTheme().applyStyle(Preferences.resolveTextSizeResId(this), true);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.research_main);

        GridView gridView = (GridView)findViewById(R.id.gridView1);
        gridView.setAdapter(new MyAdapter(this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // this 'mActivity' parameter is Activity object, you can send the current activity.
                switch (position) {
                    case 0:
                        Intent i=new Intent(Test_Grid.this, Alogorithm.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent j=new Intent(Test_Grid.this, A_I.class);
                        startActivity(j);
                        break;
                    case 2:
                        Intent k=new Intent(Test_Grid.this, D_Managment.class);
                        startActivity(k);
                        break;
                    case 3:
                        Intent a=new Intent(Test_Grid.this, Data_Mining.class);
                        startActivity(a);
                        break;
                    case 4:
                        Intent b=new Intent(Test_Grid.this, DS_and_PC.class);
                        startActivity(b);
                        break;
                    case 5:
                        Intent c=new Intent(Test_Grid.this, E_and_EC.class);
                        startActivity(c);
                        break;
                    case 6:
                        Intent d=new Intent(Test_Grid.this, EI.class);
                        startActivity(d);
                        break;
                    case 7:
                        Intent e=new Intent(Test_Grid.this, G_S.class);
                        startActivity(e);
                        break;
                    case 8:
                        Intent f=new Intent(Test_Grid.this, Haed_and_Arch.class);
                        startActivity(f);
                        break;
                    case 9:
                        Intent g=new Intent(Test_Grid.this, H_Computer_Inter.class);
                        startActivity(g);
                        break;
                    case 10:
                        Intent h=new Intent(Test_Grid.this, Info.class);
                        startActivity(h);
                        break;
                    case 11:
                        Intent l=new Intent(Test_Grid.this, Machine_perception.class);
                        startActivity(l);
                        break;
                    case 12:
                        Intent m=new Intent(Test_Grid.this, Machine_Translation.class);
                        startActivity(m);
                        break;
                    case 13:
                        Intent n=new Intent(Test_Grid.this, Mobile_system.class);
                        startActivity(n);
                        break;
                    case 14:
                        Intent o=new Intent(Test_Grid.this, N_L_P.class);
                        startActivity(o);
                        break;
                    case 15:
                        Intent p=new Intent(Test_Grid.this, Networking.class);
                        startActivity(p);
                        break;
                    case 16:
                        Intent q=new Intent(Test_Grid.this, Crypto.class);
                        startActivity(q);
                        break;
                    case 17:
                        Intent r=new Intent(Test_Grid.this, Software_eng.class);
                        startActivity(r);
                        break;
                    case 18:
                        Intent s=new Intent(Test_Grid.this, Soft_system.class);
                        startActivity(s);
                        break;
                    case 19:
                        Intent u=new Intent(Test_Grid.this, Speech_processing.class);
                        startActivity(u);
                        break;

                }
            }
        });
    }

    private class MyAdapter extends BaseAdapter
    {
        private List<Item> items = new ArrayList<Item>();
        private LayoutInflater inflater;

        public MyAdapter(Context context)
        {
            inflater = LayoutInflater.from(context);

            items.add(new Item("Algorithms and Theory", R.color.color_alizarin));
            items.add(new Item("Artificial Intelligence and Machine Learning", R.color.color_amethyst));
            items.add(new Item("Data Management", R.color.color_asbestos));
            items.add(new Item("Data Mining", R.color.color_belize_hole));
            items.add(new Item("Distributed Systems and Parallel Computing", R.color.color_carrot));
            items.add(new Item("Economics and Electronic Commerce", R.color.color_peter_river));
            items.add(new Item("Education Innovation", R.color.color_concrete));
            items.add(new Item("General Science", R.color.color_green_sea));
            items.add(new Item("Hardware and Architecture", R.color.color_emerald));
            items.add(new Item("Human-Computer Interaction and Visualization", R.color.color_orange));
            items.add(new Item("Information Retrieval and the Web", R.color.color_midnight_blue));
            items.add(new Item("Machine Perception", R.color.color_pomegranate));
            items.add(new Item("Machine Translation", R.color.color_pumpkin));
            items.add(new Item("Mobile Systems", R.color.color_turquoise));
            items.add(new Item("Natural Language Processing", R.color.color_sun_flower));
            items.add(new Item("Networking", R.color.color_wet_asphalt));
            items.add(new Item("Security,Cryptography, and Privacy", R.color.color_wisteria));
            items.add(new Item("Software Engineering", R.color.color_silver));
            items.add(new Item("Software Systems", R.color.color_green_sea));
            items.add(new Item("Speech Processing", R.color.color_nephritis));



        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int i)
        {
            return items.get(i);
        }

        @Override
        public long getItemId(int i)
        {
            return items.get(i).drawableId;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup)
        {
            View v = view;
            ImageView picture;
            TextView name;

            if(v == null)
            {
                v = inflater.inflate(R.layout.research_grid_item, viewGroup, false);
                v.setTag(R.id.item_image, v.findViewById(R.id.item_image));
                v.setTag(R.id.item_text, v.findViewById(R.id.item_text));
            }

            picture = (ImageView)v.getTag(R.id.item_image);
            name = (TextView)v.getTag(R.id.item_text);

            Item item = (Item)getItem(i);

            picture.setImageResource(item.drawableId);
            name.setText(item.name);

            return v;
        }

        private class Item
        {
            final String name;
            final int drawableId;

            Item(String name, int drawableId)
            {
                this.name = name;
                this.drawableId = drawableId;
            }
        }
    }


}
