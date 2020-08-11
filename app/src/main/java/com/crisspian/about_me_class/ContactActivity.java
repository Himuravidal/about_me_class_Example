package com.crisspian.about_me_class;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class ContactActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        textView = findViewById(R.id.linkeding_tv);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkedingIntent = new Intent(Intent.ACTION_VIEW);
                linkedingIntent.setData(Uri.parse("https://www.linkedin.com/in/cristianvidallopez?trk=hp-identity-name"));
                startActivity(linkedingIntent);
            }
        });



    }

    public void shareWithWhatsApp(View v, TextInputEditText tx){
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "¡Hola! te comparto mi nota obtenida hoy: " + tx.getText().toString());
        sendIntent.setType("text/plain");
        //sendIntent.setPackage("com.whatsapp");
        startActivity(sendIntent);
    }

}