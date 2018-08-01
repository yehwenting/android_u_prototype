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

import myandroidhello.com.tsmc_android.Model.Record;
import myandroidhello.com.tsmc_android.R;

/**
 * Created by Yehwenting on 2018/8/1.
 */

public class RecordAdapter extends RecyclerView.Adapter<RecordAdapter.RecordViewHolder> {

    private List<Record> records;
    private Context context;

    public RecordAdapter(List<Record> records) {
        this.records = records;
    }

    @NonNull
    @Override
    public RecordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.adapter_record,null);

        return new RecordAdapter.RecordViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecordViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return records.size();
    }

    public class RecordViewHolder extends RecyclerView.ViewHolder {

        TextView gname,uname,num,time,place,remain,note;
        Button join;
        ImageView pic,more;
        CardView cardView;

        public RecordViewHolder(View itemView) {
            super(itemView);


        }
    }
}
