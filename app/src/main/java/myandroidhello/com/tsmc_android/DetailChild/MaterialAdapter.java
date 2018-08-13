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
import android.widget.TextView;

import myandroidhello.com.tsmc_android.R;

public class MaterialAdapter extends RecyclerView.Adapter<MaterialAdapter.MaterialHolder>{
    private Context context;

    @NonNull
    @Override
    public MaterialHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.adapter_material,null);

        return new myandroidhello.com.tsmc_android.DetailChild.MaterialAdapter.MaterialHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MaterialHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MaterialHolder extends RecyclerView.ViewHolder {

        TextView gname, uname, num, time, place, remain, note;
        Button join;
        ImageView pic, more;
        CardView cardView;

        public MaterialHolder(View itemView) {
            super(itemView);



        }
    }
}
