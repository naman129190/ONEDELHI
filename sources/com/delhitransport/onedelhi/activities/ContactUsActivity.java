package com.delhitransport.onedelhi.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.v60;

public class ContactUsActivity extends AppCompatActivity {
    /* access modifiers changed from: private */
    /* renamed from: f1 */
    public /* synthetic */ void m7691f1(View view) {
        onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1410R.layout.activity_contact_us);
        ((ImageView) findViewById(C1410R.C1412id.iv_back)).setOnClickListener(new v60(this));
    }
}
