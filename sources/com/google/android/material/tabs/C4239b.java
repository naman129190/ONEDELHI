package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.tabs.b */
public final class C4239b {
    @ts2

    /* renamed from: a */
    public RecyclerView.C0805h<?> f24541a;
    @ts2

    /* renamed from: a */
    public RecyclerView.C0808j f24542a;
    @mr2

    /* renamed from: a */
    public final ViewPager2 f24543a;
    @ts2

    /* renamed from: a */
    public TabLayout.C4228f f24544a;
    @mr2

    /* renamed from: a */
    public final TabLayout f24545a;

    /* renamed from: a */
    public final C4241b f24546a;
    @ts2

    /* renamed from: a */
    public C4242c f24547a;

    /* renamed from: a */
    public final boolean f24548a;

    /* renamed from: b */
    public final boolean f24549b;

    /* renamed from: c */
    public boolean f24550c;

    /* renamed from: com.google.android.material.tabs.b$a */
    public class C4240a extends RecyclerView.C0808j {
        public C4240a() {
        }

        /* renamed from: a */
        public void mo5739a() {
            C4239b.this.mo29115d();
        }

        /* renamed from: b */
        public void mo5740b(int i, int i2) {
            C4239b.this.mo29115d();
        }

        /* renamed from: c */
        public void mo5741c(int i, int i2, @ts2 Object obj) {
            C4239b.this.mo29115d();
        }

        /* renamed from: d */
        public void mo5742d(int i, int i2) {
            C4239b.this.mo29115d();
        }

        /* renamed from: e */
        public void mo5743e(int i, int i2, int i3) {
            C4239b.this.mo29115d();
        }

        /* renamed from: f */
        public void mo5744f(int i, int i2) {
            C4239b.this.mo29115d();
        }
    }

    /* renamed from: com.google.android.material.tabs.b$b */
    public interface C4241b {
        /* renamed from: a */
        void mo29116a(@mr2 TabLayout.C4232i iVar, int i);
    }

    /* renamed from: com.google.android.material.tabs.b$c */
    public static class C4242c extends ViewPager2.C1134j {

        /* renamed from: a */
        public int f24552a;
        @mr2

        /* renamed from: a */
        public final WeakReference<TabLayout> f24553a;

        /* renamed from: b */
        public int f24554b;

        public C4242c(TabLayout tabLayout) {
            this.f24553a = new WeakReference<>(tabLayout);
            mo29117d();
        }

        /* renamed from: a */
        public void mo7240a(int i) {
            this.f24552a = this.f24554b;
            this.f24554b = i;
        }

        /* renamed from: b */
        public void mo7313b(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f24553a.get();
            if (tabLayout != null) {
                int i3 = this.f24554b;
                boolean z = false;
                boolean z2 = i3 != 2 || this.f24552a == 1;
                if (!(i3 == 2 && this.f24552a == 0)) {
                    z = true;
                }
                tabLayout.setScrollPosition(i, f, z2, z);
            }
        }

        /* renamed from: c */
        public void mo7241c(int i) {
            TabLayout tabLayout = (TabLayout) this.f24553a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f24554b;
                tabLayout.mo28955N(tabLayout.mo29035y(i), i2 == 0 || (i2 == 2 && this.f24552a == 0));
            }
        }

        /* renamed from: d */
        public void mo29117d() {
            this.f24554b = 0;
            this.f24552a = 0;
        }
    }

    /* renamed from: com.google.android.material.tabs.b$d */
    public static class C4243d implements TabLayout.C4228f {

        /* renamed from: a */
        public final ViewPager2 f24555a;

        /* renamed from: a */
        public final boolean f24556a;

        public C4243d(ViewPager2 viewPager2, boolean z) {
            this.f24555a = viewPager2;
            this.f24556a = z;
        }

        /* renamed from: a */
        public void mo15067a(TabLayout.C4232i iVar) {
        }

        /* renamed from: b */
        public void mo15068b(TabLayout.C4232i iVar) {
        }

        /* renamed from: c */
        public void mo15069c(@mr2 TabLayout.C4232i iVar) {
            this.f24555a.setCurrentItem(iVar.mo29093k(), this.f24556a);
        }
    }

    public C4239b(@mr2 TabLayout tabLayout, @mr2 ViewPager2 viewPager2, @mr2 C4241b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    public C4239b(@mr2 TabLayout tabLayout, @mr2 ViewPager2 viewPager2, boolean z, @mr2 C4241b bVar) {
        this(tabLayout, viewPager2, z, true, bVar);
    }

    public C4239b(@mr2 TabLayout tabLayout, @mr2 ViewPager2 viewPager2, boolean z, boolean z2, @mr2 C4241b bVar) {
        this.f24545a = tabLayout;
        this.f24543a = viewPager2;
        this.f24548a = z;
        this.f24549b = z2;
        this.f24546a = bVar;
    }

    /* renamed from: a */
    public void mo29112a() {
        if (!this.f24550c) {
            RecyclerView.C0805h<?> adapter = this.f24543a.getAdapter();
            this.f24541a = adapter;
            if (adapter != null) {
                this.f24550c = true;
                C4242c cVar = new C4242c(this.f24545a);
                this.f24547a = cVar;
                this.f24543a.mo7268n(cVar);
                C4243d dVar = new C4243d(this.f24543a, this.f24549b);
                this.f24544a = dVar;
                this.f24545a.mo28966c(dVar);
                if (this.f24548a) {
                    C4240a aVar = new C4240a();
                    this.f24542a = aVar;
                    this.f24541a.mo5703F(aVar);
                }
                mo29115d();
                this.f24545a.setScrollPosition(this.f24543a.getCurrentItem(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    /* renamed from: b */
    public void mo29113b() {
        RecyclerView.C0805h<?> hVar;
        if (this.f24548a && (hVar = this.f24541a) != null) {
            hVar.mo5706I(this.f24542a);
            this.f24542a = null;
        }
        this.f24545a.mo28950I(this.f24544a);
        this.f24543a.mo7292w(this.f24547a);
        this.f24544a = null;
        this.f24547a = null;
        this.f24541a = null;
        this.f24550c = false;
    }

    /* renamed from: c */
    public boolean mo29114c() {
        return this.f24550c;
    }

    /* renamed from: d */
    public void mo29115d() {
        int min;
        this.f24545a.mo28948G();
        RecyclerView.C0805h<?> hVar = this.f24541a;
        if (hVar != null) {
            int g = hVar.mo5711g();
            for (int i = 0; i < g; i++) {
                TabLayout.C4232i D = this.f24545a.mo28945D();
                this.f24546a.mo29116a(D, i);
                this.f24545a.mo28970g(D, false);
            }
            if (g > 0 && (min = Math.min(this.f24543a.getCurrentItem(), this.f24545a.getTabCount() - 1)) != this.f24545a.getSelectedTabPosition()) {
                TabLayout tabLayout = this.f24545a;
                tabLayout.mo28954M(tabLayout.mo29035y(min));
            }
        }
    }
}
