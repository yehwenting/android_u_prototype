package myandroidhello.com.tsmc_android.DetailParent;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import myandroidhello.com.tsmc_android.Model.HumanResource;
import myandroidhello.com.tsmc_android.R;

/**
 * Created by Yehwenting on 2018/7/31.
 */

public class HumanResourceAdapter extends RecyclerView.Adapter<HumanResourceAdapter.HumanResourceViewHolder> {

    private List<HumanResource> humanResources;
    Context context;

    public HumanResourceAdapter(List<HumanResource> humanResources) {
        this.humanResources = humanResources;
    }

    @NonNull
    @Override
    public HumanResourceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.adapter_human_resource,null);

        return new HumanResourceAdapter.HumanResourceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HumanResourceViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return humanResources.size();
    }

    public class HumanResourceViewHolder extends RecyclerView.ViewHolder {

        TextView gname,uname,num,time,place,remain,note;
        Button join;
        ImageView pic,more;
        CardView cardView;

        public HumanResourceViewHolder(View itemView) {
            super(itemView);


        }
    }
}
