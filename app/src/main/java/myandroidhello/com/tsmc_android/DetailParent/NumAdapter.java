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

import myandroidhello.com.tsmc_android.R;

public class NumAdapter extends RecyclerView.Adapter<NumAdapter.NumViewHolder> {

    private Context context;

    @NonNull
    @Override
    public NumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.adapter_work_order,null);

        return new NumAdapter.NumViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NumViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class NumViewHolder extends RecyclerView.ViewHolder {

        TextView gname,uname,num,time,place,remain,note;
        Button join;
        ImageView pic,more;
        CardView cardView;

        public NumViewHolder(View itemView) {
            super(itemView);


        }
    }
}
