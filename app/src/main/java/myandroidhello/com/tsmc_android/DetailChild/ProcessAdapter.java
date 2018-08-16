package myandroidhello.com.tsmc_android.DetailChild;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import myandroidhello.com.tsmc_android.R;

public class ProcessAdapter extends RecyclerView.Adapter<ProcessAdapter.ProcessHolder>{
    private Context context;


    @NonNull
    @Override
    public ProcessHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.adapter_process,null);

        return new myandroidhello.com.tsmc_android.DetailChild.ProcessAdapter.ProcessHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ProcessHolder holder, int position) {
        holder.btn_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.btn_v.setBackgroundResource(R.drawable.checked_btn);
                holder.btn_v.setTextColor(Color.parseColor("#F04C32"));
                holder.btn_na.setBackgroundResource(R.drawable.unchecked_btn);
                holder.btn_na.setTextColor(Color.parseColor("#4E4E4E"));
                holder.btn_x.setBackgroundResource(R.drawable.unchecked_btn);
                holder.btn_x.setTextColor(Color.parseColor("#4E4E4E"));
            }
        });
        holder.btn_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.btn_v.setBackgroundResource(R.drawable.unchecked_btn);
                holder.btn_v.setTextColor(Color.parseColor("#4E4E4E"));
                holder.btn_na.setBackgroundResource(R.drawable.unchecked_btn);
                holder.btn_na.setTextColor(Color.parseColor("#4E4E4E"));
                holder.btn_x.setBackgroundResource(R.drawable.checked_btn);
                holder.btn_x.setTextColor(Color.parseColor("#F04C32"));

            }
        });
        holder.btn_na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.btn_v.setBackgroundResource(R.drawable.unchecked_btn);
                holder.btn_v.setTextColor(Color.parseColor("#4E4E4E"));

                holder.btn_na.setBackgroundResource(R.drawable.checked_btn);
                holder.btn_na.setTextColor(Color.parseColor("#F04C32"));

                holder.btn_x.setBackgroundResource(R.drawable.unchecked_btn);
                holder.btn_x.setTextColor(Color.parseColor("#4E4E4E"));

            }
        });

    }



    @Override
    public int getItemCount() {
        return 10;
    }

    public class ProcessHolder extends RecyclerView.ViewHolder {

        TextView gname, uname, num, time, place, remain, note;
        Button btn_v,btn_x,btn_na;
        ImageView pic, more;
        CardView cardView;

        public ProcessHolder(View itemView) {
            super(itemView);

            btn_v=itemView.findViewById(R.id.btn_v);
            btn_x=itemView.findViewById(R.id.btn_x);
            btn_na=itemView.findViewById(R.id.btn_na);
        }
    }
}
