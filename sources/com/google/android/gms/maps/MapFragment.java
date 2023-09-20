package com.google.android.gms.maps;

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
import com.onedelhi.secure.bd5;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nd5;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wu2;

@TargetApi(11)
public class MapFragment extends Fragment {

    /* renamed from: a */
    public final nd5 f7540a = new nd5(this);

    @mr2
    /* renamed from: b */
    public static MapFragment m9090b() {
        return new MapFragment();
    }

    @mr2
    /* renamed from: c */
    public static MapFragment m9091c(@ts2 GoogleMapOptions googleMapOptions) {
        MapFragment mapFragment = new MapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        mapFragment.setArguments(bundle);
        return mapFragment;
    }

    /* renamed from: a */
    public void mo10609a(@mr2 wu2 wu2) {
        Preconditions.checkMainThread("getMapAsync must be called on the main thread.");
        Preconditions.checkNotNull(wu2, "callback must not be null.");
        this.f7540a.mo21169w(wu2);
    }

    /* renamed from: d */
    public final void mo10610d(@ts2 Bundle bundle) {
        Preconditions.checkMainThread("onEnterAmbient must be called on the main thread.");
        nd5 nd5 = this.f7540a;
        if (nd5.mo13707b() != null) {
            ((bd5) nd5.mo13707b()).mo13638l(bundle);
        }
    }

    /* renamed from: e */
    public final void mo10611e() {
        Preconditions.checkMainThread("onExitAmbient must be called on the main thread.");
        nd5 nd5 = this.f7540a;
        if (nd5.mo13707b() != null) {
            ((bd5) nd5.mo13707b()).mo13639m();
        }
    }

    public void onActivityCreated(@ts2 Bundle bundle) {
        ClassLoader classLoader = MapFragment.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(@mr2 Activity activity) {
        super.onAttach(activity);
        nd5.m22699v(this.f7540a, activity);
    }

    public void onCreate(@ts2 Bundle bundle) {
        super.onCreate(bundle);
        this.f7540a.mo13709d(bundle);
    }

    @mr2
    public View onCreateView(@mr2 LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle) {
        View e = this.f7540a.mo13710e(layoutInflater, viewGroup, bundle);
        e.setClickable(true);
        return e;
    }

    public void onDestroy() {
        this.f7540a.mo13711f();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f7540a.mo13712g();
        super.onDestroyView();
    }

    @SuppressLint({"NewApi"})
    public void onInflate(@mr2 Activity activity, @mr2 AttributeSet attributeSet, @ts2 Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            nd5.m22699v(this.f7540a, activity);
            GoogleMapOptions O2 = GoogleMapOptions.m9049O2(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", O2);
            this.f7540a.mo13713h(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.f7540a.mo13714i();
        super.onLowMemory();
    }

    public void onPause() {
        this.f7540a.mo13715j();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f7540a.mo13716k();
    }

    public void onSaveInstanceState(@mr2 Bundle bundle) {
        ClassLoader classLoader = MapFragment.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.f7540a.mo13717l(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f7540a.mo13718m();
    }

    public void onStop() {
        this.f7540a.mo13719n();
        super.onStop();
    }

    public void setArguments(@ts2 Bundle bundle) {
        super.setArguments(bundle);
    }
}
