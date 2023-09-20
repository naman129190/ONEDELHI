package androidx.viewpager2.widget;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.onedelhi.secure.mr2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.viewpager2.widget.b */
public final class C1148b implements ViewPager2.C1140m {

    /* renamed from: a */
    public final List<ViewPager2.C1140m> f5980a = new ArrayList();

    /* renamed from: a */
    public void mo7318a(@mr2 View view, float f) {
        for (ViewPager2.C1140m a : this.f5980a) {
            a.mo7318a(view, f);
        }
    }

    /* renamed from: b */
    public void mo7332b(@mr2 ViewPager2.C1140m mVar) {
        this.f5980a.add(mVar);
    }

    /* renamed from: c */
    public void mo7333c(@mr2 ViewPager2.C1140m mVar) {
        this.f5980a.remove(mVar);
    }
}
