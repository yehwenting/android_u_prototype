package myandroidhello.com.tsmc_android.Model;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import myandroidhello.com.tsmc_android.Mainpage.MainActivity;
import myandroidhello.com.tsmc_android.R;

public class TextDialogFragment extends DialogFragment {

    private Context context;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        context=getActivity().getApplicationContext();
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.fragment_text_dialog, null);
        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(view)
                // Add action buttons
                .setPositiveButton("呈核",
                        new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int id)
                            {
                                android.support.v7.app.AlertDialog.Builder adb = new android.support.v7.app.AlertDialog.Builder(getActivity())
                                        .setTitle("成功")
                                        .setMessage("已成功呈核！！")
                                        .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {
                                                Intent intent = new Intent(context, MainActivity.class);
                                                context.startActivity(intent);


                                            }
                                        });
                                android.support.v7.app.AlertDialog alertDialog = adb.create();
                                alertDialog.show();
                            }
                        }).setNegativeButton("取消", null);
        return builder.create();
    }

}
