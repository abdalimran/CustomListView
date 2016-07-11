package com.github.abdalimran.customlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView list;
    private ArrayList<Profile>profiles;
    private CustomListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profiles = new ArrayList<>();
        addProfiles();

        list=(ListView)findViewById(R.id.list);
        adapter = new CustomListAdapter(this,profiles);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),profiles.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void addProfiles()
    {
        profiles.add(new Profile("Name 1","This is sample address 1.","name1@email.com",R.drawable.img1));
        profiles.add(new Profile("Name 2","This is sample address 2.","name2@email.com",R.drawable.img2));
        profiles.add(new Profile("Name 3","This is sample address 3.","name3@email.com",R.drawable.img3));
        profiles.add(new Profile("Name 4","This is sample address 4.","name4@email.com",R.drawable.img4));
        profiles.add(new Profile("Name 5","This is sample address 5.","name5@email.com",R.drawable.img5));
        profiles.add(new Profile("Name 6","This is sample address 6.","name6@email.com",R.drawable.img6));
        profiles.add(new Profile("Name 7","This is sample address 7.","name7@email.com",R.drawable.img7));
    }
}