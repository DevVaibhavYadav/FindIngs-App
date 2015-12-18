package com.vaibhav.developer.ad.findings.resaerch;

/**
 * Created by Administrator on 13-05-2015.
 */
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.vaibhav.developer.ad.findings.R;
import com.vaibhav.developer.ad.findings.resaerch.papers.Alogorithm;

public class Research_Main extends ActionBarActivity {
    GridView grid;
    String[] web = {
            "Algorithms and Theory",
            "Artificial Intelligence and Machine Learning",
            "Data Management",
            "Data Mining",
            "Distributed Systems and Parallel Computing",
            "Economics and Electronic Commerce",
            "Education Innovation",
            "General Science",
            "Hardware and Architecture",
            "Human-Computer Interaction and Visualization",
            "Information Retrieval and the Web",
            "Machine Perception",
            "Machine Translation",
            "Mobile Systems",
            "Natural Language Processing",
            "Networking",
            "Security,Cryptography, and Privacy",
            "Software Engineering",
            "Software Systems",
            "Speech Processing"

    } ;
    int[] imageId = {
            R.color.color_alizarin,
            R.color.color_amethyst,
            R.color.color_asbestos,
            R.color.color_belize_hole,
            R.color.color_carrot,
            R.color.color_peter_river,
            R.color.color_concrete,
            R.color.color_green_sea,
            R.color.color_emerald,
            R.color.color_orange,
            R.color.color_midnight_blue,
            R.color.color_pomegranate,
            R.color.color_pumpkin,
            R.color.color_turquoise,
            R.color.color_sun_flower,
            R.color.color_wet_asphalt,
            R.color.color_wisteria,
            R.color.color_silver,
            R.color.color_green_sea,
            R.color.color_nephritis


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.research_main);

        CustomGridViewAdapter adapter = new CustomGridViewAdapter(Research_Main.this, web, imageId);
        grid=(GridView)findViewById(R.id.gridView1);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        Intent i=new Intent(Research_Main.this, Alogorithm.class);
                        startActivity(i);
                        break;
                    case 1:
                        Toast.makeText(Research_Main.this, "You Clicked at 1", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(Research_Main.this, "You Clicked at default", Toast.LENGTH_SHORT).show();
                }
// etc.
            }
        });

    }

}