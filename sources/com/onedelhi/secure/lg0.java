package com.onedelhi.secure;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0258j;
import androidx.appcompat.widget.ScrollingTabContainerView;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public interface lg0 {
    /* renamed from: A */
    CharSequence mo2543A();

    /* renamed from: B */
    boolean mo2544B();

    /* renamed from: C */
    void mo2545C(SparseArray<Parcelable> sparseArray);

    /* renamed from: D */
    vu4 mo2546D(int i, long j);

    /* renamed from: E */
    void mo2547E(CharSequence charSequence);

    /* renamed from: F */
    void mo2548F(Drawable drawable);

    /* renamed from: G */
    void mo2549G(View view);

    /* renamed from: H */
    void mo2550H(int i);

    /* renamed from: I */
    int mo2551I();

    /* renamed from: J */
    void mo2552J(int i);

    /* renamed from: K */
    int mo2553K();

    /* renamed from: L */
    void mo2554L(SparseArray<Parcelable> sparseArray);

    /* renamed from: M */
    void mo2555M(int i);

    /* renamed from: N */
    void mo2556N(C0258j.C0259a aVar, C0248e.C0249a aVar2);

    /* renamed from: O */
    void mo2557O();

    /* renamed from: P */
    void mo2558P(Drawable drawable);

    /* renamed from: Q */
    void mo2559Q(boolean z);

    /* renamed from: R */
    int mo2560R();

    /* renamed from: S */
    int mo2561S();

    /* renamed from: T */
    void mo2562T(int i);

    /* renamed from: a */
    Context mo2569a();

    /* renamed from: b */
    void mo2570b(Drawable drawable);

    /* renamed from: c */
    boolean mo2571c();

    /* renamed from: d */
    boolean mo2572d();

    /* renamed from: e */
    boolean mo2573e();

    /* renamed from: f */
    boolean mo2574f();

    /* renamed from: g */
    boolean mo2575g();

    int getHeight();

    CharSequence getTitle();

    /* renamed from: h */
    boolean mo2578h();

    /* renamed from: i */
    boolean mo2579i();

    /* renamed from: j */
    boolean mo2580j();

    /* renamed from: k */
    void mo2581k(CharSequence charSequence);

    /* renamed from: l */
    void mo2582l(int i);

    /* renamed from: m */
    void mo2583m(int i);

    /* renamed from: n */
    void mo2584n();

    /* renamed from: o */
    int mo2585o();

    /* renamed from: p */
    void mo2586p();

    /* renamed from: q */
    void mo2587q(Drawable drawable);

    /* renamed from: r */
    ViewGroup mo2588r();

    /* renamed from: s */
    void mo2589s(int i);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setLogo(int i);

    void setMenu(Menu menu, C0258j.C0259a aVar);

    void setMenuPrepared();

    void setTitle(CharSequence charSequence);

    void setVisibility(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    /* renamed from: t */
    void mo2599t(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener);

    /* renamed from: u */
    void mo2600u(boolean z);

    /* renamed from: v */
    boolean mo2601v();

    /* renamed from: w */
    View mo2602w();

    /* renamed from: x */
    void mo2603x();

    /* renamed from: y */
    void mo2604y(ScrollingTabContainerView scrollingTabContainerView);

    /* renamed from: z */
    Menu mo2605z();
}
