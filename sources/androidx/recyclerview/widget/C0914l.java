package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.cg4;
import com.onedelhi.secure.ts2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.recyclerview.widget.l */
public final class C0914l implements Runnable {

    /* renamed from: a */
    public static final ThreadLocal<C0914l> f5047a = new ThreadLocal<>();

    /* renamed from: a */
    public static Comparator<C0917c> f5048a = new C0915a();

    /* renamed from: a */
    public ArrayList<RecyclerView> f5049a = new ArrayList<>();

    /* renamed from: b */
    public long f5050b;

    /* renamed from: b */
    public ArrayList<C0917c> f5051b = new ArrayList<>();

    /* renamed from: c */
    public long f5052c;

    /* renamed from: androidx.recyclerview.widget.l$a */
    public class C0915a implements Comparator<C0917c> {
        /* renamed from: a */
        public int compare(C0917c cVar, C0917c cVar2) {
            RecyclerView recyclerView = cVar.f5058a;
            if ((recyclerView == null) != (cVar2.f5058a == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.f5059a;
            if (z != cVar2.f5059a) {
                return z ? -1 : 1;
            }
            int i = cVar2.f5057a - cVar.f5057a;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.f5060b - cVar2.f5060b;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.l$b */
    public static class C0916b implements RecyclerView.C0819p.C0822c {

        /* renamed from: a */
        public int f5053a;

        /* renamed from: a */
        public int[] f5054a;

        /* renamed from: b */
        public int f5055b;

        /* renamed from: c */
        public int f5056c;

        /* renamed from: a */
        public void mo5911a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f5056c * 2;
                int[] iArr = this.f5054a;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f5054a = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f5054a = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f5054a;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f5056c++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* renamed from: b */
        public void mo6383b() {
            int[] iArr = this.f5054a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5056c = 0;
        }

        /* renamed from: c */
        public void mo6384c(RecyclerView recyclerView, boolean z) {
            this.f5056c = 0;
            int[] iArr = this.f5054a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.C0819p pVar = recyclerView.f4480a;
            if (recyclerView.f4475a != null && pVar != null && pVar.mo5810I0()) {
                if (z) {
                    if (!recyclerView.f4488a.mo6132q()) {
                        pVar.mo5317s(recyclerView.f4475a.mo5711g(), this);
                    }
                } else if (!recyclerView.mo5362D0()) {
                    pVar.mo5314r(this.f5053a, this.f5055b, recyclerView.f4473a, this);
                }
                int i = this.f5056c;
                if (i > pVar.f4657a) {
                    pVar.f4657a = i;
                    pVar.f4674f = z;
                    recyclerView.f4484a.mo5943L();
                }
            }
        }

        /* renamed from: d */
        public boolean mo6385d(int i) {
            if (this.f5054a != null) {
                int i2 = this.f5056c * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f5054a[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: e */
        public void mo6386e(int i, int i2) {
            this.f5053a = i;
            this.f5055b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$c */
    public static class C0917c {

        /* renamed from: a */
        public int f5057a;

        /* renamed from: a */
        public RecyclerView f5058a;

        /* renamed from: a */
        public boolean f5059a;

        /* renamed from: b */
        public int f5060b;

        /* renamed from: c */
        public int f5061c;

        /* renamed from: a */
        public void mo6387a() {
            this.f5059a = false;
            this.f5057a = 0;
            this.f5060b = 0;
            this.f5058a = null;
            this.f5061c = 0;
        }
    }

    /* renamed from: e */
    public static boolean m6360e(RecyclerView recyclerView, int i) {
        int j = recyclerView.f4491a.mo6209j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.C0803f0 u0 = RecyclerView.m5265u0(recyclerView.f4491a.mo6208i(i2));
            if (u0.f4620n == i && !u0.mo5695x()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo6371a(RecyclerView recyclerView) {
        this.f5049a.add(recyclerView);
    }

    /* renamed from: b */
    public final void mo6372b() {
        C0917c cVar;
        int size = this.f5049a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f5049a.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f4492a.mo6384c(recyclerView, false);
                i += recyclerView.f4492a.f5056c;
            }
        }
        this.f5051b.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f5049a.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0916b bVar = recyclerView2.f4492a;
                int abs = Math.abs(bVar.f5053a) + Math.abs(bVar.f5055b);
                for (int i5 = 0; i5 < bVar.f5056c * 2; i5 += 2) {
                    if (i3 >= this.f5051b.size()) {
                        cVar = new C0917c();
                        this.f5051b.add(cVar);
                    } else {
                        cVar = this.f5051b.get(i3);
                    }
                    int[] iArr = bVar.f5054a;
                    int i6 = iArr[i5 + 1];
                    cVar.f5059a = i6 <= abs;
                    cVar.f5057a = abs;
                    cVar.f5060b = i6;
                    cVar.f5058a = recyclerView2;
                    cVar.f5061c = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f5051b, f5048a);
    }

    /* renamed from: c */
    public final void mo6373c(C0917c cVar, long j) {
        RecyclerView.C0803f0 i = mo6378i(cVar.f5058a, cVar.f5061c, cVar.f5059a ? Long.MAX_VALUE : j);
        if (i != null && i.f4614a != null && i.mo5694w() && !i.mo5695x()) {
            mo6377h((RecyclerView) i.f4614a.get(), j);
        }
    }

    /* renamed from: d */
    public final void mo6374d(long j) {
        int i = 0;
        while (i < this.f5051b.size()) {
            C0917c cVar = this.f5051b.get(i);
            if (cVar.f5058a != null) {
                mo6373c(cVar, j);
                cVar.mo6387a();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public void mo6375f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f5050b == 0) {
            this.f5050b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f4492a.mo6386e(i, i2);
    }

    /* renamed from: g */
    public void mo6376g(long j) {
        mo6372b();
        mo6374d(j);
    }

    /* renamed from: h */
    public final void mo6377h(@ts2 RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.f4522k && recyclerView.f4491a.mo6209j() != 0) {
                recyclerView.mo5505q1();
            }
            C0916b bVar = recyclerView.f4492a;
            bVar.mo6384c(recyclerView, true);
            if (bVar.f5056c != 0) {
                try {
                    cg4.m12477b(RecyclerView.f4454i);
                    recyclerView.f4473a.mo5616k(recyclerView.f4475a);
                    for (int i = 0; i < bVar.f5056c * 2; i += 2) {
                        mo6378i(recyclerView, bVar.f5054a[i], j);
                    }
                } finally {
                    cg4.m12479d();
                }
            }
        }
    }

    /* renamed from: i */
    public final RecyclerView.C0803f0 mo6378i(RecyclerView recyclerView, int i, long j) {
        if (m6360e(recyclerView, i)) {
            return null;
        }
        RecyclerView.C0831w wVar = recyclerView.f4484a;
        try {
            recyclerView.mo5432c1();
            RecyclerView.C0803f0 J = wVar.mo5941J(i, false, j);
            if (J != null) {
                if (!J.mo5694w() || J.mo5695x()) {
                    wVar.mo5946a(J, false);
                } else {
                    wVar.mo5934C(J.f4609a);
                }
            }
            return J;
        } finally {
            recyclerView.mo5442e1(false);
        }
    }

    /* renamed from: j */
    public void mo6379j(RecyclerView recyclerView) {
        this.f5049a.remove(recyclerView);
    }

    public void run() {
        try {
            cg4.m12477b(RecyclerView.f4453h);
            if (!this.f5049a.isEmpty()) {
                int size = this.f5049a.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f5049a.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo6376g(TimeUnit.MILLISECONDS.toNanos(j) + this.f5052c);
                    this.f5050b = 0;
                    cg4.m12479d();
                }
            }
        } finally {
            this.f5050b = 0;
            cg4.m12479d();
        }
    }
}
