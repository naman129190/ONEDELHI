package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import com.onedelhi.secure.ts2;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.d */
public final class C1150d extends ViewPager2.C1134j {

    /* renamed from: a */
    public final LinearLayoutManager f5982a;

    /* renamed from: a */
    public ViewPager2.C1140m f5983a;

    public C1150d(LinearLayoutManager linearLayoutManager) {
        this.f5982a = linearLayoutManager;
    }

    /* renamed from: a */
    public void mo7240a(int i) {
    }

    /* renamed from: b */
    public void mo7313b(int i, float f, int i2) {
        if (this.f5983a != null) {
            float f2 = -f;
            int i3 = 0;
            while (i3 < this.f5982a.mo5828Q()) {
                View P = this.f5982a.mo5825P(i3);
                if (P != null) {
                    this.f5983a.mo7318a(P, ((float) (this.f5982a.mo5893s0(P) - i)) + f2);
                    i3++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.f5982a.mo5828Q())}));
                }
            }
        }
    }

    /* renamed from: c */
    public void mo7241c(int i) {
    }

    /* renamed from: d */
    public ViewPager2.C1140m mo7335d() {
        return this.f5983a;
    }

    /* renamed from: e */
    public void mo7336e(@ts2 ViewPager2.C1140m mVar) {
        this.f5983a = mVar;
    }
}
