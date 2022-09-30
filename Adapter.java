package com.nogravity.jsonparsing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    User[] data;
    Context context;

    public Adapter(User[] data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        holder.name.setText(data[position].getName());
        holder.Age.setText(data[position].getAge());
        holder.Experties.setText(data[position].getExperties());

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,Age,Experties;
        public ViewHolder(@NonNull View itemView) {

            super(itemView);

            name = itemView.findViewById(R.id.textview1);
            Age = itemView.findViewById(R.id.textview2);
            Experties = itemView.findViewById(R.id.textview3);
        }
    }
}
