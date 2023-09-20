package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.bi0;
import com.onedelhi.secure.ke5;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.ve5;
import com.onedelhi.secure.wu2;

public class MapView extends FrameLayout {

    /* renamed from: a */
    public final ve5 f7541a;

    public MapView(@mr2 Context context) {
        super(context);
        this.f7541a = new ve5(this, context, (GoogleMapOptions) null);
        setClickable(true);
    }

    public MapView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7541a = new ve5(this, context, GoogleMapOptions.m9049O2(context, attributeSet));
        setClickable(true);
    }

    public MapView(@mr2 Context context, @mr2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7541a = new ve5(this, context, GoogleMapOptions.m9049O2(context, attributeSet));
        setClickable(true);
    }

    public MapView(@mr2 Context context, @ts2 GoogleMapOptions googleMapOptions) {
        super(context);
        this.f7541a = new ve5(this, context, googleMapOptions);
        setClickable(true);
    }

    /* renamed from: a */
    public void mo10626a(@mr2 wu2 wu2) {
        Preconditions.checkMainThread("getMapAsync() must be called on the main thread");
        Preconditions.checkNotNull(wu2, "callback must not be null.");
        this.f7541a.mo26008v(wu2);
    }

    /* renamed from: b */
    public void mo10627b(@ts2 Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f7541a.mo13709d(bundle);
            if (this.f7541a.mo13707b() == null) {
                bi0.m11884o(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: c */
    public void mo10628c() {
        this.f7541a.mo13711f();
    }

    /* renamed from: d */
    public void mo10629d(@ts2 Bundle bundle) {
        Preconditions.checkMainThread("onEnterAmbient() must be called on the main thread");
        ve5 ve5 = this.f7541a;
        if (ve5.mo13707b() != null) {
            ((ke5) ve5.mo13707b()).mo19056l(bundle);
        }
    }

    /* renamed from: e */
    public void mo10630e() {
        Preconditions.checkMainThread("onExitAmbient() must be called on the main thread");
        ve5 ve5 = this.f7541a;
        if (ve5.mo13707b() != null) {
            ((ke5) ve5.mo13707b()).mo19057m();
        }
    }

    /* renamed from: f */
    public void mo10631f() {
        this.f7541a.mo13714i();
    }

    /* renamed from: g */
    public void mo10632g() {
        this.f7541a.mo13715j();
    }

    /* renamed from: h */
    public void mo10633h() {
        this.f7541a.mo13716k();
    }

    /* renamed from: i */
    public void mo10634i(@mr2 Bundle bundle) {
        this.f7541a.mo13717l(bundle);
    }

    /* renamed from: j */
    public void mo10635j() {
        this.f7541a.mo13718m();
    }

    /* renamed from: k */
    public void mo10636k() {
        this.f7541a.mo13719n();
    }
}
