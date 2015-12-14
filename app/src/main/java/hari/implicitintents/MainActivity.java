package hari.implicitintents;

import android.Manifest;
import android.app.SearchManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.mail_intent_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                //Set additional data
                String[] to = {"dnshariprasad@gmail.com", "dhp551@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL, to);
                intent.putExtra(Intent.EXTRA_SUBJECT, "I am Subject");
                intent.putExtra(Intent.EXTRA_TEXT, "I am Body");
                intent.setType("message/rfc822");
                Intent chooser = Intent.createChooser(intent, "Select one..");
                startActivity(chooser);
            }
        });

        findViewById(R.id.browser_intent_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("http://www.facebook.com"));
                startActivity(browserIntent);
            }
        });
        findViewById(R.id.sms_intent_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Intent.ACTION_SENDTO);
                it.setData(Uri.parse("smsto:9700715998"));
                it.putExtra("sms_body", "I am SMS text");
                startActivity(it);
            }
        });
        findViewById(R.id.map_intent_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create intent for map
                Intent intent = new Intent(Intent.ACTION_VIEW);
                //attach your geo points
                intent.setData(Uri.parse("geo:0,0"));
                //create a chooser ro show all apps that can handle this intent
                Intent chooser = Intent.createChooser(intent, "Select One..");
                //rise intent
                startActivity(chooser);
            }
        });
    }
}