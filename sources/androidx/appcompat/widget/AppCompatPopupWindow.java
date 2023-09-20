package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import com.onedelhi.secure.C3982yb;
import com.onedelhi.secure.af4;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.q33;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.za3;

class AppCompatPopupWindow extends PopupWindow {

    /* renamed from: b */
    public static final boolean f1364b = false;

    /* renamed from: a */
    public boolean f1365a;

    public AppCompatPopupWindow(@mr2 Context context, @ts2 AttributeSet attributeSet, @C3982yb int i) {
        super(context, attributeSet, i);
        mo1834a(context, attributeSet, i, 0);
    }

    public AppCompatPopupWindow(@mr2 Context context, @ts2 AttributeSet attributeSet, @C3982yb int i, @e64 int i2) {
        super(context, attributeSet, i, i2);
        mo1834a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public final void mo1834a(Context context, AttributeSet attributeSet, int i, int i2) {
        af4 G = af4.m11110G(context, attributeSet, za3.C4068m.PopupWindow, i, i2);
        int i3 = za3.C4068m.PopupWindow_overlapAnchor;
        if (G.mo13026C(i3)) {
            mo1835b(G.mo13030a(i3, false));
        }
        setBackgroundDrawable(G.mo13037h(za3.C4068m.PopupWindow_android_popupBackground));
        G.mo13029I();
    }

    /* renamed from: b */
    public final void mo1835b(boolean z) {
        if (f1364b) {
            this.f1365a = z;
        } else {
            q33.m25273c(this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f1364b && this.f1365a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1364b && this.f1365a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1364b && this.f1365a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
