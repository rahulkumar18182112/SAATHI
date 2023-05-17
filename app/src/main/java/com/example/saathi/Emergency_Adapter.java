package com.example.saathi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Emergency_Adapter extends RecyclerView.Adapter<Emergency_Adapter.ViewHolder> {
    Context context;
    ArrayList<emergency_str> model_emergency;
    public Emergency_Adapter(Context context, ArrayList<emergency_str> model_emergency){
        this.context=context;
        this.model_emergency=model_emergency;

    }
    @Override
    public Emergency_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.emergency_design,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Emergency_Adapter.ViewHolder holder, int position) {

        holder.emergency_icons.setImageResource(model_emergency.get(position).emergency_icons);
    }

    @Override
    public int getItemCount() {
        return model_emergency.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{
        ImageView emergency_icons;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            emergency_icons=itemView.findViewById(R.id.emergency_icons);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
           int position=getAdapterPosition();
            switch(position){
                case 0:
                    Toast.makeText(context, "Opening profile", Toast.LENGTH_SHORT).show();
                  Intent police=new Intent(Intent.ACTION_DIAL);
                  police.setData(Uri.parse("tel: 100"));
                 context.startActivity(police);
                 break;

                case 1:
                    Intent call_support= new Intent(Intent.ACTION_DIAL);
                    call_support.setData(Uri.parse("tel: 1091"));
                    context.startActivity(call_support);
                    break;
                case 2:
                    Intent ambulence= new Intent(Intent.ACTION_DIAL);
                    ambulence.setData(Uri.parse("tel: 102"));
                    context.startActivity(ambulence);
                    break;
                case 3:
                    Intent hospital= new Intent(Intent.ACTION_DIAL);
                    hospital.setData(Uri.parse("tel: 108"));
                    context.startActivity(hospital);
                    break;
                case 4:
                    Intent road_Acc= new Intent(Intent.ACTION_DIAL);
                    road_Acc.setData(Uri.parse("tel: 1073"));
                    context.startActivity(road_Acc);
                    break;
                case 5:
                    Intent domestic_abuse= new Intent(Intent.ACTION_DIAL);
                    domestic_abuse.setData(Uri.parse("tel: 181"));
                    context.startActivity(domestic_abuse);
                    break;

                case 6:
                    Intent senior_abuse= new Intent(Intent.ACTION_DIAL);
                    senior_abuse.setData(Uri.parse("tel: 14567"));
                    context.startActivity(senior_abuse);
                    break;
                case 7:
                    Intent fire= new Intent(Intent.ACTION_DIAL);
                    fire.setData(Uri.parse("tel: 101"));
                    context.startActivity(fire);
                    break;
                case 8:
                    Intent gas_leak= new Intent(Intent.ACTION_DIAL);
                    gas_leak.setData(Uri.parse("tel: 1906"));
                    context.startActivity(gas_leak);
                    break;

                    case 9:
                    Intent mental_hospital= new Intent(Intent.ACTION_DIAL);
                    mental_hospital.setData(Uri.parse("tel: 1800599019"));
                    context.startActivity(mental_hospital);
                    break;
                case 10:
                    Intent cyber_crime= new Intent(Intent.ACTION_DIAL);
                    cyber_crime.setData(Uri.parse("tel: 155620"));
                    context.startActivity(cyber_crime);
                    break;
                case 11:
                    Intent missing_women= new Intent(Intent.ACTION_DIAL);
                    missing_women.setData(Uri.parse("tel: 1094"));
                    context.startActivity(missing_women);
                    break;
                case 12:
                    Intent train_acc= new Intent(Intent.ACTION_DIAL);
                    train_acc.setData(Uri.parse("tel: 1072"));
                    context.startActivity(train_acc);
                    break;
                case 13:
                    Intent disaster_management= new Intent(Intent.ACTION_DIAL);
                    disaster_management.setData(Uri.parse("tel: 108"));
                    context.startActivity(disaster_management);
                    break;




            }

        }
    }
}
