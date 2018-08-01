package myandroidhello.com.tsmc_android.Mainpage;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import myandroidhello.com.tsmc_android.Model.WorkOrder;
import myandroidhello.com.tsmc_android.R;

/**
 * Created by Yehwenting on 2018/7/30.
 */

public class TodayAdapter extends RecyclerView.Adapter<TodayAdapter.TodayViewHolder>{

    private List<WorkOrder> workOrders;
    Context context;


    public TodayAdapter(List<WorkOrder> workOrders){
        this.workOrders=workOrders;

    }

    @NonNull
    @Override
    public TodayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.fragment_mainpage_sibling,null);

        return new TodayViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TodayViewHolder holder, int position) {
        Log.d("test",String.valueOf(position));
        final WorkOrder workOrder=workOrders.get(position);
        holder.title.setText(workOrder.getNum());

        TodayChildAdapter competitionGroupAdapter = new TodayChildAdapter(workOrder);
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setHasFixedSize(true);
        holder.recyclerView.setAdapter(competitionGroupAdapter);
        holder.recyclerView.getParent().requestDisallowInterceptTouchEvent(true);

    }

    @Override
    public int getItemCount() {
        return workOrders.size();

    }

    public class TodayViewHolder extends RecyclerView.ViewHolder {

        TextView name,content,num,constraint,deadline;
        Button create,findBtn,changeData,recentData;
        RecyclerView recyclerView;
        TextView title;


        public TodayViewHolder(View itemView) {
            super(itemView);
            recyclerView=itemView.findViewById(R.id.cGroup_rv);
            title=itemView.findViewById(R.id.title_tv);

        }
    }
}
