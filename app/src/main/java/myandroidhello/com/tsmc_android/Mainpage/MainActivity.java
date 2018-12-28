package myandroidhello.com.tsmc_android.Mainpage;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import myandroidhello.com.tsmc_android.Model.WorkOrder;
import myandroidhello.com.tsmc_android.Model.WorkOrderChild;
import myandroidhello.com.tsmc_android.Navigation_BaseActivity;
import myandroidhello.com.tsmc_android.R;

public class MainActivity extends Navigation_BaseActivity {

    private TextView toolBar_title,search;
//    private ImageView search;
    private android.support.design.widget.TabLayout mTabs;
    private ViewPager mViewPager;
    List<WorkOrder> workOrderList = new ArrayList<>();
    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbarSetting();
        initData();
        initView();
        initListener();
    }

    private void toolbarSetting(){
        toolBar_title=findViewById(R.id.toolbar_title);
        //toolbar
        toolbar.setTitle("");//設置ToolBar Title
        toolBar_title.setText("意外事故(異常)速報表");
        setUpToolBar();//使用父類別的setUpToolBar()，設置ToolBar
        CurrentMenuItem = 0;
        NV.getMenu().getItem(CurrentMenuItem).setChecked(true);//設置Navigation目前項目被選取狀態
    }

    private void initData(){
        //fake data
        for (int i=0;i<4;i++){
            List<WorkOrderChild> workOrderChildren=new ArrayList<>();
//            if(i%2==0){
//                WorkOrderChild workOrderChild=new WorkOrderChild("F15-ASSET100","MAXADAMO","已回報","hello");
//                workOrderChildren.add(workOrderChild);
//            }
            WorkOrder workOrder=new WorkOrder("ACC1070000003","Y_TILSMJ","待回報","detail",workOrderChildren);
            workOrderList.add(workOrder);
        }

    }
    private void initView(){
        search=findViewById(R.id.searchDetail);
        mTabs =findViewById(R.id.tabs);
        mTabs.addTab(mTabs.newTab().setText("未結案"));
        mTabs.addTab(mTabs.newTab().setText("本日結案"));
        recyclerView=findViewById(R.id.main_rv);
//        recyclerView.setNestedScrollingEnabled(false);
        TodayAdapter todayAdapter = new TodayAdapter(workOrderList);
        //要記得有layoutmanager
        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,1));
        recyclerView.setAdapter(todayAdapter);

    }
    private void initListener(){
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SearchActivity.class);
                startActivity(intent);
            }
        });

        mTabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Log.d("test",String.valueOf(tab.getPosition()));
                TodayAdapter todayAdapter = new TodayAdapter(workOrderList);
                //要記得有layoutmanager
                recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,1));
                recyclerView.setAdapter(todayAdapter);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    }

