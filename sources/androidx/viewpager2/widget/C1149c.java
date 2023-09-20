package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.k43;
import com.onedelhi.secure.mr2;

/* renamed from: androidx.viewpager2.widget.c */
public final class C1149c implements ViewPager2.C1140m {

    /* renamed from: a */
    public final int f5981a;

    public C1149c(@e83 int i) {
        k43.m19453j(i, "Margin must be non-negative");
        this.f5981a = i;
    }

    /* renamed from: a */
    public void mo7318a(@mr2 View view, float f) {
        ViewPager2 b = mo7334b(view);
        float f2 = ((float) this.f5981a) * f;
        if (b.getOrientation() == 0) {
            if (b.mo7265k()) {
                f2 = -f2;
            }
            view.setTranslationX(f2);
            return;
        }
        view.setTranslationY(f2);
    }

    /* renamed from: b */
    public final ViewPager2 mo7334b(@mr2 View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }
}
