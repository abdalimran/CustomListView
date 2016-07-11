package com.github.abdalimran.customlistview;

/*
* ListView custom adapter using ViewHolder pattern.*/

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<Profile> {

    private class ViewHolder {
        TextView name;
        TextView address;
        TextView email;
        ImageView propic;
    }

    private final Context context;
    private ArrayList<Profile> profiles;

    public CustomListAdapter(Context context, ArrayList<Profile> profiles) {
        super(context, R.layout.list_single, profiles);
        this.context = context;
        this.profiles=profiles;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {

        ViewHolder viewHolder;

        if(view==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view= inflater.inflate(R.layout.list_single, null, true);

            viewHolder = new ViewHolder();

            viewHolder.name = (TextView) view.findViewById(R.id.name);
            viewHolder.address = (TextView) view.findViewById(R.id.address);
            viewHolder.email = (TextView) view.findViewById(R.id.email);
            viewHolder.propic = (ImageView) view.findViewById(R.id.propic);

            view.setTag(viewHolder);

        }
        else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.name.setText(profiles.get(position).getName());
        viewHolder.address.setText(profiles.get(position).getAddress());
        viewHolder.email.setText(profiles.get(position).getEmail());
        viewHolder.propic.setImageResource(profiles.get(position).getPropic());

        return view;
    }
}