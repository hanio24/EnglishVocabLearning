package com.example.zaban2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViweHolder> {

    String data1[], data2[];
    int images[];
    Context context;


    public MyAdapter(Context ct,String s1[], String s2[], int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;

    }


    @NonNull
    @Override
    public MyViweHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
       View view = inflater.inflate(R.layout.row_session,parent,false);

        return new MyViweHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull MyViweHolder holder, int position) {
        holder.txt_session.setText(data1[position]);
        holder.txt_description.setText(data2[position]);
        holder.img_session.setImageResource(images[position]);



    }

    @Override
    public int getItemCount() {
        return data1.length;

    }

    public class MyViweHolder extends RecyclerView.ViewHolder {

        TextView txt_session,txt_description;
        ImageView img_session;


        public MyViweHolder(@NonNull View itemView) {
            super(itemView);
            txt_session = itemView.findViewById(R.id.txt_session);
            txt_description = itemView.findViewById(R.id.txt_description);
            img_session = itemView.findViewById(R.id.img_session);


        }
    }

}
