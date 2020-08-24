package com.example.recyclerview_0811;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> implements OnPersonItemClickListener {
    ArrayList<Person> items = new ArrayList<>();
    OnPersonItemClickListener listener;

    @NonNull
    @Override
    public PersonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.list_layout, parent, false);
        return new ViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.ViewHolder holder, int position) {
        Person item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(Person item) {
        items.add(item);
    }

    public Person getItem(int position) {
        return items.get(position);
    }

    @Override
    public void onItemClick(ViewHolder holder, View view, int position) {
        if (listener != null) {
            listener.onItemClick(holder, view, position);
        }
    }

    public void setOnItemClickListener(OnPersonItemClickListener listener) {
        this.listener = listener;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, tel, email, addr;
        ImageView face, addr_img;

        public ViewHolder(@NonNull View itemView, final OnPersonItemClickListener listener) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            tel = itemView.findViewById(R.id.tel);
            email = itemView.findViewById(R.id.email);
            addr = itemView.findViewById(R.id.addr);

            face = itemView.findViewById(R.id.face);
            addr_img = itemView.findViewById(R.id.addr_img);

            itemView.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if(listener != null) {
                        listener.onItemClick(ViewHolder.this, view, position);
                    }
                }
            }));
        }

        public void setItem(Person item) {
            name.setText(item.getName());
            tel.setText(item.getTel());
            email.setText(item.getEmail());
            addr.setText(item.getAddr());

            face.setImageResource(item.getFace());
            addr_img.setImageResource(item.getAddr_img());
        }
    }
}