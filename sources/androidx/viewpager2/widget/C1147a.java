package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.mr2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* renamed from: androidx.viewpager2.widget.a */
public final class C1147a extends ViewPager2.C1134j {
    @mr2

    /* renamed from: a */
    public final List<ViewPager2.C1134j> f5979a;

    public C1147a(int i) {
        this.f5979a = new ArrayList(i);
    }

    /* renamed from: a */
    public void mo7240a(int i) {
        try {
            for (ViewPager2.C1134j a : this.f5979a) {
                a.mo7240a(i);
            }
        } catch (ConcurrentModificationException e) {
            mo7331f(e);
        }
    }

    /* renamed from: b */
    public void mo7313b(int i, float f, @e83 int i2) {
        try {
            for (ViewPager2.C1134j b : this.f5979a) {
                b.mo7313b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            mo7331f(e);
        }
    }

    /* renamed from: c */
    public void mo7241c(int i) {
        try {
            for (ViewPager2.C1134j c : this.f5979a) {
                c.mo7241c(i);
            }
        } catch (ConcurrentModificationException e) {
            mo7331f(e);
        }
    }

    /* renamed from: d */
    public void mo7329d(ViewPager2.C1134j jVar) {
        this.f5979a.add(jVar);
    }

    /* renamed from: e */
    public void mo7330e(ViewPager2.C1134j jVar) {
        this.f5979a.remove(jVar);
    }

    /* renamed from: f */
    public final void mo7331f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }
}
