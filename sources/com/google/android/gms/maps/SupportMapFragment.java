package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.fj5;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nj5;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wu2;

public class SupportMapFragment extends Fragment {

    /* renamed from: a */
    public final nj5 f7553a = new nj5(this);

    @mr2
    /* renamed from: r */
    public static SupportMapFragment m9136r() {
        return new SupportMapFragment();
    }

    @mr2
    /* renamed from: s */
    public static SupportMapFragment m9137s(@ts2 GoogleMapOptions googleMapOptions) {
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        supportMapFragment.setArguments(bundle);
        return supportMapFragment;
    }

    public void onActivityCreated(@ts2 Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(@mr2 Activity activity) {
        super.onAttach(activity);
        nj5.m22911v(this.f7553a, activity);
    }

    public void onCreate(@ts2 Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onCreate(bundle);
            this.f7553a.mo13709d(bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @mr2
    public View onCreateView(@mr2 LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle) {
        View e = this.f7553a.mo13710e(layoutInflater, viewGroup, bundle);
        e.setClickable(true);
        return e;
    }

    public void onDestroy() {
        this.f7553a.mo13711f();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f7553a.mo13712g();
        super.onDestroyView();
    }

    public void onInflate(@mr2 Activity activity, @mr2 AttributeSet attributeSet, @ts2 Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            nj5.m22911v(this.f7553a, activity);
            GoogleMapOptions O2 = GoogleMapOptions.m9049O2(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", O2);
            this.f7553a.mo13713h(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.f7553a.mo13714i();
        super.onLowMemory();
    }

    public void onPause() {
        this.f7553a.mo13715j();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f7553a.mo13716k();
    }

    public void onSaveInstanceState(@mr2 Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.f7553a.mo13717l(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f7553a.mo13718m();
    }

    public void onStop() {
        this.f7553a.mo13719n();
        super.onStop();
    }

    /* renamed from: q */
    public void mo10669q(@mr2 wu2 wu2) {
        Preconditions.checkMainThread("getMapAsync must be called on the main thread.");
        Preconditions.checkNotNull(wu2, "callback must not be null.");
        this.f7553a.mo21347w(wu2);
    }

    public void setArguments(@ts2 Bundle bundle) {
        super.setArguments(bundle);
    }

    /* renamed from: w */
    public final void mo10670w(@ts2 Bundle bundle) {
        Preconditions.checkMainThread("onEnterAmbient must be called on the main thread.");
        nj5 nj5 = this.f7553a;
        if (nj5.mo13707b() != null) {
            ((fj5) nj5.mo13707b()).mo16023l(bundle);
        }
    }

    /* renamed from: y */
    public final void mo10671y() {
        Preconditions.checkMainThread("onExitAmbient must be called on the main thread.");
        nj5 nj5 = this.f7553a;
        if (nj5.mo13707b() != null) {
            ((fj5) nj5.mo13707b()).mo16024m();
        }
    }
}
