package com.example.android.managercontrol;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.android.managercontrol.Item;
import com.example.android.managercontrol.R;


import java.util.List;

public class WorkerAdapter extends RecyclerView.Adapter<WorkerAdapter.ViewHolder>
{
    Context context = null;
    List<Item> list = null;

    public WorkerAdapter(Context context,List<Item> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_doc,parent,false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.id.setText(String.valueOf(list.get(position).getId()));
        holder.name.setText(list.get(position).getDelay());
        holder.job.setText(list.get(position).getIsactive());
        holder.age.setText(String.valueOf(list.get(position).getIsactive()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name, job, age,id;

        public ViewHolder(View itemView) {
            super(itemView);
            id = (TextView) itemView.findViewById(R.id.recycler);
            name= (TextView) itemView.findViewById(R.id.recycler);
            job=(TextView) itemView.findViewById(R.id.recycler);
            age=(TextView) itemView.findViewById(R.id.recycler);
        }
    }
}