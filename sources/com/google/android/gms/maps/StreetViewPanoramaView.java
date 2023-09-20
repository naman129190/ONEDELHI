package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.bi0;
import com.onedelhi.secure.fv2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pi5;
import com.onedelhi.secure.ts2;

public class StreetViewPanoramaView extends FrameLayout {

    /* renamed from: a */
    public final pi5 f7552a;

    public StreetViewPanoramaView(@mr2 Context context) {
        super((Context) Preconditions.checkNotNull(context, "context must not be null"));
        this.f7552a = new pi5(this, context, (StreetViewPanoramaOptions) null);
    }

    public StreetViewPanoramaView(@mr2 Context context, @mr2 AttributeSet attributeSet) {
        super((Context) Preconditions.checkNotNull(context, "context must not be null"), attributeSet);
        this.f7552a = new pi5(this, context, (StreetViewPanoramaOptions) null);
    }

    public StreetViewPanoramaView(@mr2 Context context, @mr2 AttributeSet attributeSet, int i) {
        super((Context) Preconditions.checkNotNull(context, "context must not be null"), attributeSet, i);
        this.f7552a = new pi5(this, context, (StreetViewPanoramaOptions) null);
    }

    public StreetViewPanoramaView(@mr2 Context context, @ts2 StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super((Context) Preconditions.checkNotNull(context, "context must not be null"));
        this.f7552a = new pi5(this, context, streetViewPanoramaOptions);
    }

    /* renamed from: a */
    public void mo10660a(@mr2 fv2 fv2) {
        Preconditions.checkNotNull(fv2, "callback must not be null");
        Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
        this.f7552a.mo22446v(fv2);
    }

    /* renamed from: b */
    public final void mo10661b(@ts2 Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f7552a.mo13709d(bundle);
            if (this.f7552a.mo13707b() == null) {
                bi0.m11884o(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: c */
    public void mo10662c() {
        this.f7552a.mo13711f();
    }

    /* renamed from: d */
    public final void mo10663d() {
        this.f7552a.mo13714i();
    }

    /* renamed from: e */
    public final void mo10664e() {
        this.f7552a.mo13715j();
    }

    /* renamed from: f */
    public void mo10665f() {
        this.f7552a.mo13716k();
    }

    /* renamed from: g */
    public final void mo10666g(@mr2 Bundle bundle) {
        this.f7552a.mo13717l(bundle);
    }

    /* renamed from: h */
    public void mo10667h() {
        this.f7552a.mo13718m();
    }

    /* renamed from: i */
    public void mo10668i() {
        this.f7552a.mo13719n();
    }
}
