package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.zac;
import com.onedelhi.secure.w22;
import java.util.LinkedList;

@KeepForSdk
public abstract class bi0<T extends w22> {
    @ts2

    /* renamed from: a */
    public Bundle f9827a;

    /* renamed from: a */
    public final su2 f9828a = new j35(this);

    /* renamed from: a */
    public w22 f9829a;

    /* renamed from: a */
    public LinkedList f9830a;

    @KeepForSdk
    /* renamed from: o */
    public static void m11884o(@mr2 FrameLayout frameLayout) {
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        Context context = frameLayout.getContext();
        int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(context);
        String zad = zac.zad(context, isGooglePlayServicesAvailable);
        String zac = zac.zac(context, isGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(zad);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = instance.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, (String) null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(zac);
            linearLayout.addView(button);
            button.setOnClickListener(new d45(context, errorResolutionIntent));
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public abstract void mo13706a(@mr2 su2<T> su2);

    @mr2
    @KeepForSdk
    /* renamed from: b */
    public T mo13707b() {
        return this.f9829a;
    }

    @KeepForSdk
    /* renamed from: c */
    public void mo13708c(@mr2 FrameLayout frameLayout) {
        m11884o(frameLayout);
    }

    @KeepForSdk
    /* renamed from: d */
    public void mo13709d(@ts2 Bundle bundle) {
        mo13721u(bundle, new t35(this, bundle));
    }

    @mr2
    @KeepForSdk
    /* renamed from: e */
    public View mo13710e(@mr2 LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        mo13721u(bundle, new y35(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.f9829a == null) {
            mo13708c(frameLayout);
        }
        return frameLayout;
    }

    @KeepForSdk
    /* renamed from: f */
    public void mo13711f() {
        w22 w22 = this.f9829a;
        if (w22 != null) {
            w22.mo13634g();
        } else {
            mo13720t(1);
        }
    }

    @KeepForSdk
    /* renamed from: g */
    public void mo13712g() {
        w22 w22 = this.f9829a;
        if (w22 != null) {
            w22.mo13641v();
        } else {
            mo13720t(2);
        }
    }

    @KeepForSdk
    /* renamed from: h */
    public void mo13713h(@mr2 Activity activity, @mr2 Bundle bundle, @ts2 Bundle bundle2) {
        mo13721u(bundle2, new o35(this, activity, bundle, bundle2));
    }

    @KeepForSdk
    /* renamed from: i */
    public void mo13714i() {
        w22 w22 = this.f9829a;
        if (w22 != null) {
            w22.onLowMemory();
        }
    }

    @KeepForSdk
    /* renamed from: j */
    public void mo13715j() {
        w22 w22 = this.f9829a;
        if (w22 != null) {
            w22.mo13632e();
        } else {
            mo13720t(5);
        }
    }

    @KeepForSdk
    /* renamed from: k */
    public void mo13716k() {
        mo13721u((Bundle) null, new o45(this));
    }

    @KeepForSdk
    /* renamed from: l */
    public void mo13717l(@mr2 Bundle bundle) {
        w22 w22 = this.f9829a;
        if (w22 != null) {
            w22.mo13636j(bundle);
            return;
        }
        Bundle bundle2 = this.f9827a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @KeepForSdk
    /* renamed from: m */
    public void mo13718m() {
        mo13721u((Bundle) null, new l45(this));
    }

    @KeepForSdk
    /* renamed from: n */
    public void mo13719n() {
        w22 w22 = this.f9829a;
        if (w22 != null) {
            w22.mo13630c();
        } else {
            mo13720t(4);
        }
    }

    /* renamed from: t */
    public final void mo13720t(int i) {
        while (!this.f9830a.isEmpty() && ((r45) this.f9830a.getLast()).zaa() >= i) {
            this.f9830a.removeLast();
        }
    }

    /* renamed from: u */
    public final void mo13721u(@ts2 Bundle bundle, r45 r45) {
        w22 w22 = this.f9829a;
        if (w22 != null) {
            r45.mo19275a(w22);
            return;
        }
        if (this.f9830a == null) {
            this.f9830a = new LinkedList();
        }
        this.f9830a.add(r45);
        if (bundle != null) {
            Bundle bundle2 = this.f9827a;
            if (bundle2 == null) {
                this.f9827a = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        mo13706a(this.f9828a);
    }
}
