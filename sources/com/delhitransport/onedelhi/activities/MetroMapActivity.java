package com.delhitransport.onedelhi.activities;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.C1410R;
import com.onedelhi.secure.aj2;
import com.onedelhi.secure.pj0;

public class MetroMapActivity extends AppCompatActivity {

    /* renamed from: a */
    public WebView f6593a;

    /* renamed from: a */
    public ImageView f6594a;

    /* access modifiers changed from: private */
    /* renamed from: f1 */
    public /* synthetic */ void m8090f1(View view) {
        onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1410R.layout.activity_metro_map);
        ImageView imageView = (ImageView) findViewById(C1410R.C1412id.iv_back);
        this.f6594a = imageView;
        imageView.setOnClickListener(new aj2(this));
        this.f6594a = (ImageView) findViewById(C1410R.C1412id.iv_back);
        WebView webView = (WebView) findViewById(C1410R.C1412id.webview);
        this.f6593a = webView;
        webView.getSettings().setBuiltInZoomControls(true);
        this.f6593a.getSettings().setUseWideViewPort(true);
        this.f6593a.getSettings().setLoadWithOverviewMode(true);
        this.f6593a.loadUrl(pj0.m61166a(-45946572478279L));
    }
}
