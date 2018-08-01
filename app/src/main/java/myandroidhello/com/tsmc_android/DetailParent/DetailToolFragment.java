package myandroidhello.com.tsmc_android.DetailParent;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import myandroidhello.com.tsmc_android.Model.PageView;
import myandroidhello.com.tsmc_android.Model.Tool;
import myandroidhello.com.tsmc_android.R;

/**
 * Created by Yehwenting on 2018/7/31.
 */

public class DetailToolFragment extends PageView {
    private RecyclerView recyclerView;
    private List<Tool> tools;
    public DetailToolFragment(Context context) {
        super(context);

        View view = LayoutInflater.from(context).inflate(R.layout.fragment_tool, null);
//        TextView textView = (TextView) view.findViewById(R.id.text);
//        textView.setText("Page one");
        Log.d("test","DetailHumanResourceFragment");
        addView(view);
        tools=new ArrayList<>();
        Tool tool=new Tool("廠商校驗","電表-三用電錶","25813028","F15P1/2三用電錶");
        for (int i =0;i<20;i++){
            tools.add(tool);
        }

        recyclerView=findViewById(R.id.hr_rv1);
        recyclerView.setNestedScrollingEnabled(false);
        ToolAdapter toolAdapter=new ToolAdapter(tools);
        //要記得有layoutmanager
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));
        recyclerView.setAdapter(toolAdapter);
    }
}
