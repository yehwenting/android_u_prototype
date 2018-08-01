package myandroidhello.com.tsmc_android.DetailParent;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import myandroidhello.com.tsmc_android.Model.HumanResource;
import myandroidhello.com.tsmc_android.Model.PageView;
import myandroidhello.com.tsmc_android.R;

/**
 * Created by Yehwenting on 2018/7/31.
 */

public class DetailHumanResourceFragment extends PageView {
    private RecyclerView recyclerView;
    private List<HumanResource> humanResources;
    public DetailHumanResourceFragment(Context context) {
        super(context);
        View view = LayoutInflater.from(context).inflate(R.layout.fragment_human_resource, null);
//        TextView textView = (TextView) view.findViewById(R.id.text);
//        textView.setText("Page one");
        Log.d("test","DetailHumanResourceFragment");
        addView(view);
        humanResources=new ArrayList<>();
        HumanResource humanResource=new HumanResource("B9439680","廠商-xxxx","8.0","mmm");
        for (int i =0;i<20;i++){
            humanResources.add(humanResource);
        }

        recyclerView=findViewById(R.id.hr_rv1);
        recyclerView.setNestedScrollingEnabled(false);
        HumanResourceAdapter humanResourceAdapter=new HumanResourceAdapter(humanResources);
        //要記得有layoutmanager
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));
        recyclerView.setAdapter(humanResourceAdapter);
    }
}
