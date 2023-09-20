package com.onedelhi.secure;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.ae3;
import easypay.appinvoke.utils.EasypayLoaderService;
import java.util.ArrayList;
import jmjou.C7600b;
import jmjou.C7601c;
import org.json.JSONObject;

public class f15 extends BaseAdapter {

    /* renamed from: a */
    public Activity f28142a;

    /* renamed from: a */
    public Dialog f28143a;

    /* renamed from: a */
    public z15 f28144a;

    /* renamed from: a */
    public zz4 f28145a;

    /* renamed from: a */
    public C7601c f28146a;

    public f15(Activity activity, z15 z15, C7601c cVar, Dialog dialog) {
        this.f28142a = activity;
        this.f28144a = z15;
        this.f28146a = cVar;
        this.f28143a = dialog;
        this.f28145a = (zz4) cVar.mo48873i(zz4.class);
    }

    /* renamed from: b */
    public final void mo35709b(d05 d05, View view) {
        Class cls = b05.class;
        u25 b = this.f28145a.mo48478b("SDK_UPI_APP_STARTED");
        h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "upiAppName", (String) d05.get("appName"));
        this.f28145a.mo48477a(b);
        Intent intent = new Intent();
        intent.setClassName(d05.mo34060a(), ((C7600b) d05.getObjectFactory().mo48873i(cls)).mo48862b().getString(d05.mo34060a(), (String) null));
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(this.f28144a.mo48119a()));
        ((C7600b) d05.getObjectFactory().mo48873i(cls)).mo48862b().edit().putString("f2aa8191-1945-4b84-a511-6bdae6556280", d05.mo34060a()).apply();
        this.f28143a.dismiss();
        this.f28142a.startActivityForResult(intent, EasypayLoaderService.f38723n);
    }

    public int getCount() {
        return ((ArrayList) this.f28144a.mo48122d()).size();
    }

    public Object getItem(int i) {
        return (d05) ((ArrayList) this.f28144a.mo48122d()).get(i);
    }

    public long getItemId(int i) {
        return (long) ((d05) ((ArrayList) this.f28144a.mo48122d()).get(i)).hashCode();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        d05 d05 = (d05) ((ArrayList) this.f28144a.mo48122d()).get(i);
        Drawable drawable = null;
        View inflate = LinearLayout.inflate(this.f28142a, ae3.C4546i.upi_apps_dialog_unit_item, (ViewGroup) null);
        ((TextView) inflate.findViewById(ae3.C4544g.app_name)).setText((String) d05.get("appName"));
        ImageView imageView = (ImageView) inflate.findViewById(ae3.C4544g.app_icon);
        String a = d05.mo34060a();
        try {
            this.f28146a.getClass();
            drawable = C7601c.f38776a.getPackageManager().getApplicationIcon(a);
        } catch (Exception e) {
            m05.m56771b("Utils", String.format("Exception app name not found, exception message = {%s}", new Object[]{e.getMessage()}));
        }
        imageView.setImageDrawable(drawable);
        inflate.setOnClickListener(new t05(this, d05));
        return inflate;
    }
}
