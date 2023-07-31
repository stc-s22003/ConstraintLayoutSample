package com.example.constraintlayoutsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    public EditText etName, etMail, etComment, etmailtitle;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etMail = findViewById(R.id.etMail);
        etComment = findViewById(R.id.etComment);
        etmailtitle = findViewById(R.id.etmailtitle);

        Button btSend = findViewById(R.id.btSend);
        Button btConfirm = findViewById(R.id.btConfirm);
        Button btClear2 = findViewById(R.id.btClear2);

        btSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String mail = etMail.getText().toString();
                String mailtitle = etmailtitle.getText().toString();
                String comment = etComment.getText().toString();

                String text =  name + "," + mail +","+ mailtitle + "," + comment;
                Snackbar.make(v, text, Snackbar.LENGTH_SHORT).show();
            }
        });

        btConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String mail = etMail.getText().toString();
                String comment = etComment.getText().toString();
                String mailtitle = etmailtitle.getText().toString();

                String text =  name + "," + mail +"," + mailtitle +"," + comment;

                Dialog.showConfirmationDialog(MainActivity.this, text);
            };
        });

        btClear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etName.setText("");
                etMail.setText("");
                etComment.setText("");
                etmailtitle.setText("");
            }
        });
    }
}