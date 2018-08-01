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

import myandroidhello.com.tsmc_android.Model.Tool;
import myandroidhello.com.tsmc_android.R;

/**
 * Created by Yehwenting on 2018/7/31.
 */

public class ToolAdapter extends RecyclerView.Adapter<ToolAdapter.ToolViewHolder> {

    private List<Tool> tools;
    private Context context;

    public ToolAdapter(List<Tool> tools) {
        this.tools = tools;
    }

    @NonNull
    @Override
    public ToolViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.adapter_tool,null);

        return new ToolAdapter.ToolViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ToolViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return tools.size();
    }

    public class ToolViewHolder extends RecyclerView.ViewHolder {

        TextView gname,uname,num,time,place,remain,note;
        Button join;
        ImageView pic,more;
        CardView cardView;

        public ToolViewHolder(View itemView) {
            super(itemView);


        }
    }
}
