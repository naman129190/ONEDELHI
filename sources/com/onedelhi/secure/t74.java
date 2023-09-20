package com.onedelhi.secure;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

public class t74 extends Fragment {

    /* renamed from: a */
    public final lk5 f20675a = new lk5(this);

    @mr2
    /* renamed from: r */
    public static t74 m28148r() {
        return new t74();
    }

    @mr2
    /* renamed from: s */
    public static t74 m28149s(@ts2 StreetViewPanoramaOptions streetViewPanoramaOptions) {
        t74 t74 = new t74();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetViewPanoramaOptions);
        t74.setArguments(bundle);
        return t74;
    }

    public void onActivityCreated(@ts2 Bundle bundle) {
        ClassLoader classLoader = t74.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(@mr2 Activity activity) {
        super.onAttach(activity);
        lk5.m20797v(this.f20675a, activity);
    }

    public void onCreate(@ts2 Bundle bundle) {
        super.onCreate(bundle);
        this.f20675a.mo13709d(bundle);
    }

    @mr2
    public View onCreateView(@mr2 LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle) {
        return this.f20675a.mo13710e(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.f20675a.mo13711f();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f20675a.mo13712g();
        super.onDestroyView();
    }

    public void onInflate(@mr2 Activity activity, @mr2 AttributeSet attributeSet, @ts2 Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            lk5.m20797v(this.f20675a, activity);
            this.f20675a.mo13713h(activity, new Bundle(), bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.f20675a.mo13714i();
        super.onLowMemory();
    }

    public void onPause() {
        this.f20675a.mo13715j();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f20675a.mo13716k();
    }

    public void onSaveInstanceState(@mr2 Bundle bundle) {
        ClassLoader classLoader = t74.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.f20675a.mo13717l(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f20675a.mo13718m();
    }

    public void onStop() {
        this.f20675a.mo13719n();
        super.onStop();
    }

    /* renamed from: q */
    public void mo24740q(@mr2 fv2 fv2) {
        Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
        Preconditions.checkNotNull(fv2, "callback must not be null.");
        this.f20675a.mo19670w(fv2);
    }

    public void setArguments(@ts2 Bundle bundle) {
        super.setArguments(bundle);
    }
}
