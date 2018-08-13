package myandroidhello.com.tsmc_android.DetailChild;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
        holder.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checked_rb = (RadioButton) group.findViewById(checkedId);
                if (holder.lastCheckedRB != null) {
                    holder.lastCheckedRB.setChecked(false);
                }
                //store the clicked radiobutton
                holder.lastCheckedRB = checked_rb;
            }
        });

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ProcessHolder extends RecyclerView.ViewHolder {

        TextView gname, uname, num, time, place, remain, note;
        Button join;
        ImageView pic, more;
        CardView cardView;
        private RadioGroup radioGroup;
        private RadioButton lastCheckedRB = null;

        public ProcessHolder(View itemView) {
            super(itemView);

            radioGroup = itemView.findViewById(R.id.radioGroup);
            radioGroup.clearCheck();


        }
    }
}
