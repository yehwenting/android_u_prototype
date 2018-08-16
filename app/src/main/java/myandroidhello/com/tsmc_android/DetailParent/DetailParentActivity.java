package myandroidhello.com.tsmc_android.DetailParent;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import myandroidhello.com.tsmc_android.Mainpage.MainActivity;
import myandroidhello.com.tsmc_android.Model.PageView;
import myandroidhello.com.tsmc_android.Model.TextDialogFragment;
import myandroidhello.com.tsmc_android.R;

public class DetailParentActivity extends AppCompatActivity {

    private android.support.design.widget.TabLayout mTabs;
    private ViewPager viewPager;
    private List<PageView> pageList;
    private ImageView back;
    private TextView submit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_parent1);
        initData();
        initView();

    }

    private void initData(){
        pageList = new ArrayList<>();
        pageList.add(new DetailHumanResourceFragment(DetailParentActivity.this));
        pageList.add(new DetailToolFragment(DetailParentActivity.this));
        pageList.add(new DetailRecordFragment(DetailParentActivity.this));
        pageList.add(new DetailOverallFragment(DetailParentActivity.this));


    }

    private void initView(){
        mTabs =findViewById(R.id.detail_tabs1);
        mTabs.addTab(mTabs.newTab().setText("人力"));
        mTabs.addTab(mTabs.newTab().setText("工具"));
        mTabs.addTab(mTabs.newTab().setText("核簽紀錄"));
        mTabs.addTab(mTabs.newTab().setText("總覽"));

        viewPager = findViewById(R.id.vp);
        viewPager.setAdapter(new SamplePagerAdapter());

        back=findViewById(R.id.back);
        submit=findViewById(R.id.submit);

        initListener();
    }

    private void initListener() {
        mTabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Log.d("test",String.valueOf(tab.getPosition()));
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabs));
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DetailParentActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder adb = new AlertDialog.Builder(DetailParentActivity.this)
                        .setTitle("錯誤訊息")
                        .setMessage("未填寫人力回報，請重新確認！！")
                        .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                showLoginDialog(view);
                            }
                        });
                AlertDialog alertDialog = adb.create();
                alertDialog.show();
            }
        });


    }
    public void showLoginDialog(View view)
    {
        TextDialogFragment dialog = new TextDialogFragment();
        dialog.show(getFragmentManager(), "loginDialog");
    }

    private class SamplePagerAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return pageList.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object o) {
            return o == view;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(pageList.get(position));
            return pageList.get(position);
        }
        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

    }


    }

