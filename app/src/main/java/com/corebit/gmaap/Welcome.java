package com.corebit.gmaap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity {

    private Button banner;
    private Button georgianmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        banner = (Button) findViewById(R.id.banner);
        georgianmap = (Button) findViewById(R.id.mapButton);

        banner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bannerWebsite();
            }
        });
        georgianmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visual();
            }
        });

    }


    private void visual() {
        Intent visual = new Intent(Welcome.this, VisualMap.class);
        startActivity(visual);
    }

    public void bannerWebsite()
    {
        Intent bannerIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://login.microsoftonline.com/da9a94b6-4681-49bc-bd7c-bab9eac0ad3c/oauth2/authorize?client_id=00000003-0000-0ff1-ce00-000000000000&response_mode=form_post&protectedtoken=true&response_type=code%20id_token&resource=00000003-0000-0ff1-ce00-000000000000&scope=openid&nonce=ACF158825488F2382B8D85D7B02B5215287F1EBD190B0717-8DFDC19C623CC6A5CDC0098B4A205014311BF71C77F283B96762AF4CBDC99B99&redirect_uri=https:%2F%2Fgeorgiancollege.sharepoint.com%2F_forms%2Fdefault.aspx&wsucxt=1&cobrandid=11bd8083-87e0-41b5-bb78-0bc43c8a8e8a&client-request-id=2054f79e-3074-9000-3558-0cdd4c9f88e0"));
        startActivity(bannerIntent);
    }
}
