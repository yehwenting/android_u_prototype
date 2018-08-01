package myandroidhello.com.tsmc_android.DetailParent;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import myandroidhello.com.tsmc_android.Model.PageView;
import myandroidhello.com.tsmc_android.Model.Record;
import myandroidhello.com.tsmc_android.R;

/**
 * Created by Yehwenting on 2018/8/1.
 */

public class DetailRecordFragment extends PageView{

    private RecyclerView recyclerView;
    private List<Record> records;

    public DetailRecordFragment(Context context) {
        super(context);
        View view = LayoutInflater.from(context).inflate(R.layout.fragment_record, null);
        addView(view);
        records =new ArrayList<>();
        Record record=new Record("00203V03","機械一課","廠商-XXX","2018/05/22 02:44","2018/05/22 02:44","rrr");
        for (int i =0;i<20;i++){
            records.add(record);
        }

        recyclerView=findViewById(R.id.record_rv1);
        recyclerView.setNestedScrollingEnabled(false);
        RecordAdapter recordAdapter=new RecordAdapter(records);
        //要記得有layoutmanager
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));
        recyclerView.setAdapter(recordAdapter);
    }
}
