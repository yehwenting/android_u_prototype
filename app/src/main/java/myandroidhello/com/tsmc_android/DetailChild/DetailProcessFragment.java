package myandroidhello.com.tsmc_android.DetailChild;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import myandroidhello.com.tsmc_android.Model.PageView;
import myandroidhello.com.tsmc_android.R;

public class DetailProcessFragment extends PageView {
    private RecyclerView recyclerView;

    public DetailProcessFragment(Context context) {
        super(context);
        View view = LayoutInflater.from(context).inflate(R.layout.fragment_process, null);
        addView(view);

        recyclerView=findViewById(R.id.record_rv1);
        recyclerView.setNestedScrollingEnabled(false);
        ProcessAdapter processAdapter=new ProcessAdapter();
        //要記得有layoutmanager
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));
        recyclerView.setAdapter(processAdapter);
    }
}
