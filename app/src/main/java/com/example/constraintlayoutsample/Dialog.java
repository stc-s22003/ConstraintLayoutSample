package com.example.constraintlayoutsample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
public class Dialog {

    public static void showConfirmationDialog(Context context, String text) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dialog_confirmation, null);
        builder.setView(view);



        builder.setTitle("送信確認");
        builder.setPositiveButton("送信", (dialog, which) -> {
            Toast.makeText(context, "送信しました。", Toast.LENGTH_SHORT).show();

        });

        builder.setNegativeButton("キャンセル", (dialog, which) -> {
            Toast.makeText(context, "キャンセルしました。", Toast.LENGTH_SHORT).show();

                   });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
