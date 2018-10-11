package com.example.mohsin.cardview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mohsin on 10/10/2018.
 */

public class LayoutAdapter extends RecyclerView.Adapter<LayoutAdapter.LayoutViewHolder> {
    ArrayList<LayoutPojo> layoutpojo= new ArrayList<LayoutPojo>();
public LayoutAdapter(ArrayList<LayoutPojo>layoutpojo){
    this.layoutpojo=layoutpojo;

}
    @Override
    public LayoutViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

    View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout,parent,false);
    LayoutViewHolder layoutViewHolder= new LayoutViewHolder(view);


        return layoutViewHolder;
    }

    @Override
    public void onBindViewHolder(LayoutViewHolder holder, int position) {
LayoutPojo layoutP= layoutpojo.get(position);
holder.img.setImageResource(layoutP.getImage());
holder.tt.setText(layoutP.getName());
holder.tt1.setText(layoutP.getAge());
    }

    @Override
    public int getItemCount() {
        return layoutpojo.size();
    }
public static class LayoutViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView tt;
        TextView tt1;
        public LayoutViewHolder(View view){

            super(view);
            img=view.findViewById(R.id.dog);
            tt=view.findViewById(R.id.d_name);
            tt1=view.findViewById(R.id.d_age);
        }
}

}
