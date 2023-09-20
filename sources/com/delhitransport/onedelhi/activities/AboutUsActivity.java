package com.delhitransport.onedelhi.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.C4606b0;

public class AboutUsActivity extends AppCompatActivity {
    /* access modifiers changed from: private */
    /* renamed from: f1 */
    public /* synthetic */ void m7638f1(View view) {
        onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1410R.layout.activity_about_us);
        ((ImageButton) findViewById(C1410R.C1412id.ib_back)).setOnClickListener(new C4606b0(this));
    }
}
