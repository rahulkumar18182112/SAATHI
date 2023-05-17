package com.example.saathi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class news_addapter extends RecyclerView.Adapter<news_addapter.ViewHolder> {
    Context context;
    ArrayList<news_str> model_news;
  public  news_addapter(Context context,ArrayList<news_str> model_news){
      this.context=context;
      this.model_news=model_news;

    }

    @Override
    public news_addapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.news_design,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull news_addapter.ViewHolder holder, int position) {

      holder.news_img.setImageResource(model_news.get(position).news_img);
    }

    @Override
    public int getItemCount() {
        return model_news.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
      ImageView news_img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            news_img=itemView.findViewById(R.id.news_img);
        }
    }
}
