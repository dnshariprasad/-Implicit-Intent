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

        findViewById(R.id.call_intent_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//Way-1(requires permission)
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9700715998"));
//                startActivity(callIntent);
//Way-2(requires permission)
//                Intent in = new Intent(Intent.ACTION_CALL, Uri.parse("0000000000"));
//                startActivity(in);
//Way-3
//                Intent callIntent = new Intent(Intent.ACTION_DIAL);
//                callIntent.setData(Uri.parse("tel:9700715998"));
//                startActivity(callIntent);
            }
        });

        findViewById(R.id.mail_intent_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//Way-1
//                Intent intent = new Intent(Intent.ACTION_SEND);
//                intent.setType("plain/text");
//                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"dnshariprasad@gmail.com"});
//                intent.putExtra(Intent.EXTRA_SUBJECT, "Test subject...");
//                intent.putExtra(Intent.EXTRA_TEXT, "Test message..");
//                startActivity(Intent.createChooser(intent, "Choose.."));
//Way-2
//                String uriText = "mailto:dnshariprasad@gmail.com" +
//                        "?subject=" + Uri.encode("some subject text here") +
//                        "&body=" + Uri.encode("some text here");
//
//                Uri uri = Uri.parse(uriText);
//
//                Intent sendIntent = new Intent(Intent.ACTION_SENDTO);
//                sendIntent.setData(uri);
//                startActivity(Intent.createChooser(sendIntent, "Send email"));
//Way-3
//                Intent emailIntent = new Intent(
//                        Intent.ACTION_SENDTO,
//                        Uri.fromParts("mailto", "dnshariprasad@gmail.com",
//                                null));
//                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
//                startActivity(Intent.createChooser(emailIntent, "Send email..."));
            }
        });

        findViewById(R.id.browser_intent_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//Way-1
//                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
//                startActivity(browserIntent);
//Way-2
//                String q = "abc";
//                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH );
//                intent.putExtra(SearchManager.QUERY, q);
//                startActivity(intent);
            }
        });

        findViewById(R.id.sms_intent_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//Way-1
//                Uri uri = Uri.parse("smsto:9700715998");
//                Intent it = new Intent(Intent.ACTION_SENDTO, uri);
//                it.putExtra("sms_body", "The SMS text");
//                startActivity(it);

//Way-2
//                String uriText = "smsto:9700715998" + "?sms_body" + Uri.encode("Test message..");
//                Uri uri = Uri.parse(uriText);
//
//                Intent it = new Intent(Intent.ACTION_SENDTO, uri);
//                startActivity(it);
//Way-3
//                String messageText = "Hi , Just SMSed to say hello";
//                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
//                sendIntent.setData(Uri.parse("sms:" + "9700715998"));
//                sendIntent.putExtra("sms_body", messageText);
//                startActivity(sendIntent);

//Way - 4(requires permission)
//                SmsManager smsManager = SmsManager.getDefault();
//                smsManager.sendTextMessage("9700715998", null, "Message from the API", null, null);

//Way - 4
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", 9700715998, null)));
            }
        });
        findViewById(R.id.map_intent_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction(Intent.ACTION_VIEW);
//                String geoData = String.format("geo:%s,%s", 0, 0);
//                String data = String.format("%s?z=%s", geoData, 50);
//                intent.setData(Uri.parse(data));
//                startActivity(intent);
            }
        });
    }
}