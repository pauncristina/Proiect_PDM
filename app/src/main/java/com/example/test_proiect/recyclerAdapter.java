package com.example.test_proiect;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder> {
    private ArrayList<Obiect> objsList;
    private RecyclerViewClickListener listener;

    public recyclerAdapter(ArrayList<Obiect> objsList, RecyclerViewClickListener listener){
        this.objsList = objsList;
        this.listener = listener;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView nameTxt;

        public MyViewHolder(final View view){
            super(view);
            nameTxt = view.findViewById(R.id.textView2);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());
        }
    }

    @NonNull
    @Override
    public recyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter.MyViewHolder holder, int position) {
        String name = objsList.get(position).getObj();
        holder.nameTxt.setText(name);

    }

    @Override
    public int getItemCount() {

        return objsList.size();
    }
    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }
}
