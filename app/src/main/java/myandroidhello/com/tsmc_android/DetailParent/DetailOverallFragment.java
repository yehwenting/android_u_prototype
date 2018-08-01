package myandroidhello.com.tsmc_android.DetailParent;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import myandroidhello.com.tsmc_android.Model.PageView;
import myandroidhello.com.tsmc_android.R;

/**
 * Created by Yehwenting on 2018/8/1.
 */

public class DetailOverallFragment extends PageView{

    private RecyclerView recyclerView;
//    private List<Record> records;
    private Button num,material,process;

    public DetailOverallFragment(Context context) {
        super(context);

        View view = LayoutInflater.from(context).inflate(R.layout.fragment_overall, null);
        addView(view);
//        records =new ArrayList<>();
//        Record record=new Record("00203V03","機械一課","廠商-XXX","2018/05/22 02:44","2018/05/22 02:44","rrr");
//        for (int i =0;i<20;i++){
//            records.add(record);
//        }

        num=findViewById(R.id.numBtn);
        num.setOnClickListener(onClickListener);
        process=findViewById(R.id.processBtn);
        process.setOnClickListener(onClickListener);
        material=findViewById(R.id.materialBtn);
        material.setOnClickListener(onClickListener);


//        recyclerView=findViewById(R.id.record_rv1);
//        recyclerView.setNestedScrollingEnabled(false);
//        RecordAdapter recordAdapter=new RecordAdapter(records);
//        //要記得有layoutmanager
//        recyclerView.setLayoutManager(new GridLayoutManager(context,1));
//        recyclerView.setAdapter(recordAdapter);
    }

    private OnClickListener onClickListener = new OnClickListener() {
        @Override
        public void onClick(final View v) {
            switch (v.getId()) {
                case R.id.numBtn:
                    //DO something
                    break;
                case R.id.processBtn:
                    //DO something
                    break;
                case R.id.materialBtn:
                    //DO something
                    break;
            }

        }
    };
    }

