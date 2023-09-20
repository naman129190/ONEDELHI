package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

@TargetApi(11)
public class r44 extends Fragment {

    /* renamed from: a */
    public final jh5 f19607a = new jh5(this);

    @mr2
    /* renamed from: b */
    public static r44 m26311b() {
        return new r44();
    }

    @mr2
    /* renamed from: c */
    public static r44 m26312c(@ts2 StreetViewPanoramaOptions streetViewPanoramaOptions) {
        r44 r44 = new r44();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetViewPanoramaOptions);
        r44.setArguments(bundle);
        return r44;
    }

    /* renamed from: a */
    public void mo23618a(@mr2 fv2 fv2) {
        Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
        Preconditions.checkNotNull(fv2, "callback must not be null.");
        this.f19607a.mo18433w(fv2);
    }

    public void onActivityCreated(@ts2 Bundle bundle) {
        ClassLoader classLoader = r44.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(@mr2 Activity activity) {
        super.onAttach(activity);
        jh5.m18586v(this.f19607a, activity);
    }

    public void onCreate(@ts2 Bundle bundle) {
        super.onCreate(bundle);
        this.f19607a.mo13709d(bundle);
    }

    @mr2
    public View onCreateView(@mr2 LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle) {
        return this.f19607a.mo13710e(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.f19607a.mo13711f();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f19607a.mo13712g();
        super.onDestroyView();
    }

    @SuppressLint({"NewApi"})
    public void onInflate(@mr2 Activity activity, @mr2 AttributeSet attributeSet, @ts2 Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            jh5.m18586v(this.f19607a, activity);
            this.f19607a.mo13713h(activity, new Bundle(), bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.f19607a.mo13714i();
        super.onLowMemory();
    }

    public void onPause() {
        this.f19607a.mo13715j();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f19607a.mo13716k();
    }

    public void onSaveInstanceState(@mr2 Bundle bundle) {
        ClassLoader classLoader = r44.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.f19607a.mo13717l(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f19607a.mo13718m();
    }

    public void onStop() {
        this.f19607a.mo13719n();
        super.onStop();
    }

    public void setArguments(@ts2 Bundle bundle) {
        super.setArguments(bundle);
    }
}
