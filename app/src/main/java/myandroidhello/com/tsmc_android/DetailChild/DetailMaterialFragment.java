package myandroidhello.com.tsmc_android.DetailChild;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import myandroidhello.com.tsmc_android.Model.PageView;
import myandroidhello.com.tsmc_android.R;

public class DetailMaterialFragment extends PageView {
    private RecyclerView recyclerView;
    private Button select;

    public DetailMaterialFragment(Context context) {
        super(context);

        View view = LayoutInflater.from(context).inflate(R.layout.fragment_material, null);
        addView(view);

        recyclerView=findViewById(R.id.hr_rv1);
        recyclerView.setNestedScrollingEnabled(false);
        MaterialAdapter materialAdapter=new MaterialAdapter();
        //要記得有layoutmanager
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));
        recyclerView.setAdapter(materialAdapter);
    }
}
