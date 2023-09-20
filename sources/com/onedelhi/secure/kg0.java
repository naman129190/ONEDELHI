package com.onedelhi.secure;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.view.menu.C0258j;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public interface kg0 {
    /* renamed from: c */
    boolean mo1563c();

    /* renamed from: d */
    boolean mo1565d();

    /* renamed from: e */
    boolean mo1567e();

    /* renamed from: f */
    boolean mo1568f();

    /* renamed from: g */
    boolean mo1570g();

    CharSequence getTitle();

    /* renamed from: h */
    boolean mo1577h();

    /* renamed from: i */
    boolean mo1578i();

    /* renamed from: j */
    void mo1579j();

    /* renamed from: m */
    void mo1582m(SparseArray<Parcelable> sparseArray);

    /* renamed from: o */
    void mo1584o(SparseArray<Parcelable> sparseArray);

    /* renamed from: q */
    void mo1600q(int i);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setLogo(int i);

    void setMenu(Menu menu, C0258j.C0259a aVar);

    void setMenuPrepared();

    void setUiOptions(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
