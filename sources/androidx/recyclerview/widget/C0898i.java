package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.C2064ek;
import com.onedelhi.secure.h42;
import com.onedelhi.secure.js1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.i */
public class C0898i {

    /* renamed from: a */
    public static final Comparator<C0902d> f4956a = new C0899a();

    /* renamed from: androidx.recyclerview.widget.i$a */
    public class C0899a implements Comparator<C0902d> {
        /* renamed from: a */
        public int compare(C0902d dVar, C0902d dVar2) {
            return dVar.f4959a - dVar2.f4959a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$b */
    public static abstract class C0900b {
        /* renamed from: a */
        public abstract boolean mo6175a(int i, int i2);

        /* renamed from: b */
        public abstract boolean mo6176b(int i, int i2);

        @ts2
        /* renamed from: c */
        public Object mo6177c(int i, int i2) {
            return null;
        }

        /* renamed from: d */
        public abstract int mo6178d();

        /* renamed from: e */
        public abstract int mo6179e();
    }

    /* renamed from: androidx.recyclerview.widget.i$c */
    public static class C0901c {

        /* renamed from: a */
        public final int f4957a;

        /* renamed from: a */
        public final int[] f4958a;

        public C0901c(int i) {
            int[] iArr = new int[i];
            this.f4958a = iArr;
            this.f4957a = iArr.length / 2;
        }

        /* renamed from: a */
        public int[] mo6313a() {
            return this.f4958a;
        }

        /* renamed from: b */
        public void mo6314b(int i) {
            Arrays.fill(this.f4958a, i);
        }

        /* renamed from: c */
        public int mo6315c(int i) {
            return this.f4958a[i + this.f4957a];
        }

        /* renamed from: d */
        public void mo6316d(int i, int i2) {
            this.f4958a[i + this.f4957a] = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$d */
    public static class C0902d {

        /* renamed from: a */
        public final int f4959a;

        /* renamed from: b */
        public final int f4960b;

        /* renamed from: c */
        public final int f4961c;

        public C0902d(int i, int i2, int i3) {
            this.f4959a = i;
            this.f4960b = i2;
            this.f4961c = i3;
        }

        /* renamed from: a */
        public int mo6317a() {
            return this.f4959a + this.f4961c;
        }

        /* renamed from: b */
        public int mo6318b() {
            return this.f4960b + this.f4961c;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$e */
    public static class C0903e {

        /* renamed from: c */
        public static final int f4962c = -1;

        /* renamed from: d */
        public static final int f4963d = 1;

        /* renamed from: e */
        public static final int f4964e = 2;

        /* renamed from: f */
        public static final int f4965f = 4;

        /* renamed from: g */
        public static final int f4966g = 8;

        /* renamed from: h */
        public static final int f4967h = 12;

        /* renamed from: i */
        public static final int f4968i = 4;

        /* renamed from: j */
        public static final int f4969j = 15;

        /* renamed from: a */
        public final int f4970a;

        /* renamed from: a */
        public final C0900b f4971a;

        /* renamed from: a */
        public final List<C0902d> f4972a;

        /* renamed from: a */
        public final boolean f4973a;

        /* renamed from: a */
        public final int[] f4974a;

        /* renamed from: b */
        public final int f4975b;

        /* renamed from: b */
        public final int[] f4976b;

        public C0903e(C0900b bVar, List<C0902d> list, int[] iArr, int[] iArr2, boolean z) {
            this.f4972a = list;
            this.f4974a = iArr;
            this.f4976b = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f4971a = bVar;
            this.f4970a = bVar.mo6179e();
            this.f4975b = bVar.mo6178d();
            this.f4973a = z;
            mo6319a();
            mo6325g();
        }

        @ts2
        /* renamed from: i */
        public static C0905g m6304i(Collection<C0905g> collection, int i, boolean z) {
            C0905g gVar;
            Iterator<C0905g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = it.next();
                if (gVar.f4977a == i && gVar.f4978a == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                C0905g next = it.next();
                int i2 = next.f4979b;
                next.f4979b = z ? i2 - 1 : i2 + 1;
            }
            return gVar;
        }

        /* renamed from: a */
        public final void mo6319a() {
            C0902d dVar = this.f4972a.isEmpty() ? null : this.f4972a.get(0);
            if (!(dVar != null && dVar.f4959a == 0 && dVar.f4960b == 0)) {
                this.f4972a.add(0, new C0902d(0, 0, 0));
            }
            this.f4972a.add(new C0902d(this.f4970a, this.f4975b, 0));
        }

        /* renamed from: b */
        public int mo6320b(@js1(from = 0) int i) {
            if (i < 0 || i >= this.f4975b) {
                throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", new list size = " + this.f4975b);
            }
            int i2 = this.f4976b[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }

        /* renamed from: c */
        public int mo6321c(@js1(from = 0) int i) {
            if (i < 0 || i >= this.f4970a) {
                throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", old list size = " + this.f4970a);
            }
            int i2 = this.f4974a[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }

        /* renamed from: d */
        public void mo6322d(@mr2 RecyclerView.C0805h hVar) {
            mo6323e(new C0848b(hVar));
        }

        /* renamed from: e */
        public void mo6323e(@mr2 h42 h42) {
            int i;
            C2064ek ekVar = h42 instanceof C2064ek ? (C2064ek) h42 : new C2064ek(h42);
            int i2 = this.f4970a;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.f4970a;
            int i4 = this.f4975b;
            for (int size = this.f4972a.size() - 1; size >= 0; size--) {
                C0902d dVar = this.f4972a.get(size);
                int a = dVar.mo6317a();
                int b = dVar.mo6318b();
                while (true) {
                    if (i3 <= a) {
                        break;
                    }
                    i3--;
                    int i5 = this.f4974a[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        C0905g i7 = m6304i(arrayDeque, i6, false);
                        if (i7 != null) {
                            int i8 = (i2 - i7.f4979b) - 1;
                            ekVar.mo6149d(i3, i8);
                            if ((i5 & 4) != 0) {
                                ekVar.mo6146a(i8, 1, this.f4971a.mo6177c(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new C0905g(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        ekVar.mo6147b(i3, 1);
                        i2--;
                    }
                }
                while (i4 > b) {
                    i4--;
                    int i9 = this.f4976b[i4];
                    if ((i9 & 12) != 0) {
                        int i10 = i9 >> 4;
                        C0905g i11 = m6304i(arrayDeque, i10, true);
                        if (i11 == null) {
                            arrayDeque.add(new C0905g(i4, i2 - i3, false));
                        } else {
                            ekVar.mo6149d((i2 - i11.f4979b) - 1, i3);
                            if ((i9 & 4) != 0) {
                                ekVar.mo6146a(i3, 1, this.f4971a.mo6177c(i10, i4));
                            }
                        }
                    } else {
                        ekVar.mo6148c(i3, 1);
                        i2++;
                    }
                }
                int i12 = dVar.f4959a;
                int i13 = dVar.f4960b;
                for (i = 0; i < dVar.f4961c; i++) {
                    if ((this.f4974a[i12] & 15) == 2) {
                        ekVar.mo6146a(i12, 1, this.f4971a.mo6177c(i12, i13));
                    }
                    i12++;
                    i13++;
                }
                i3 = dVar.f4959a;
                i4 = dVar.f4960b;
            }
            ekVar.mo15216e();
        }

        /* renamed from: f */
        public final void mo6324f(int i) {
            int size = this.f4972a.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C0902d dVar = this.f4972a.get(i3);
                while (i2 < dVar.f4960b) {
                    if (this.f4976b[i2] != 0 || !this.f4971a.mo6176b(i, i2)) {
                        i2++;
                    } else {
                        int i4 = this.f4971a.mo6175a(i, i2) ? 8 : 4;
                        this.f4974a[i] = (i2 << 4) | i4;
                        this.f4976b[i2] = (i << 4) | i4;
                        return;
                    }
                }
                i2 = dVar.mo6318b();
            }
        }

        /* renamed from: g */
        public final void mo6325g() {
            for (C0902d next : this.f4972a) {
                for (int i = 0; i < next.f4961c; i++) {
                    int i2 = next.f4959a + i;
                    int i3 = next.f4960b + i;
                    int i4 = this.f4971a.mo6175a(i2, i3) ? 1 : 2;
                    this.f4974a[i2] = (i3 << 4) | i4;
                    this.f4976b[i3] = (i2 << 4) | i4;
                }
            }
            if (this.f4973a) {
                mo6326h();
            }
        }

        /* renamed from: h */
        public final void mo6326h() {
            int i = 0;
            for (C0902d next : this.f4972a) {
                while (i < next.f4959a) {
                    if (this.f4974a[i] == 0) {
                        mo6324f(i);
                    }
                    i++;
                }
                i = next.mo6317a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$f */
    public static abstract class C0904f<T> {
        /* renamed from: a */
        public abstract boolean mo6327a(@mr2 T t, @mr2 T t2);

        /* renamed from: b */
        public abstract boolean mo6328b(@mr2 T t, @mr2 T t2);

        @ts2
        /* renamed from: c */
        public Object mo6329c(@mr2 T t, @mr2 T t2) {
            return null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$g */
    public static class C0905g {

        /* renamed from: a */
        public int f4977a;

        /* renamed from: a */
        public boolean f4978a;

        /* renamed from: b */
        public int f4979b;

        public C0905g(int i, int i2, boolean z) {
            this.f4977a = i;
            this.f4979b = i2;
            this.f4978a = z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$h */
    public static class C0906h {

        /* renamed from: a */
        public int f4980a;

        /* renamed from: b */
        public int f4981b;

        /* renamed from: c */
        public int f4982c;

        /* renamed from: d */
        public int f4983d;

        public C0906h() {
        }

        public C0906h(int i, int i2, int i3, int i4) {
            this.f4980a = i;
            this.f4981b = i2;
            this.f4982c = i3;
            this.f4983d = i4;
        }

        /* renamed from: a */
        public int mo6330a() {
            return this.f4983d - this.f4982c;
        }

        /* renamed from: b */
        public int mo6331b() {
            return this.f4981b - this.f4980a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$i */
    public static class C0907i {

        /* renamed from: a */
        public int f4984a;

        /* renamed from: a */
        public boolean f4985a;

        /* renamed from: b */
        public int f4986b;

        /* renamed from: c */
        public int f4987c;

        /* renamed from: d */
        public int f4988d;

        /* renamed from: a */
        public int mo6332a() {
            return Math.min(this.f4987c - this.f4984a, this.f4988d - this.f4986b);
        }

        /* renamed from: b */
        public boolean mo6333b() {
            return this.f4988d - this.f4986b != this.f4987c - this.f4984a;
        }

        /* renamed from: c */
        public boolean mo6334c() {
            return this.f4988d - this.f4986b > this.f4987c - this.f4984a;
        }

        @mr2
        /* renamed from: d */
        public C0902d mo6335d() {
            if (mo6333b()) {
                return this.f4985a ? new C0902d(this.f4984a, this.f4986b, mo6332a()) : mo6334c() ? new C0902d(this.f4984a, this.f4986b + 1, mo6332a()) : new C0902d(this.f4984a + 1, this.f4986b, mo6332a());
            }
            int i = this.f4984a;
            return new C0902d(i, this.f4986b, this.f4987c - i);
        }
    }

    @ts2
    /* renamed from: a */
    public static C0907i m6287a(C0906h hVar, C0900b bVar, C0901c cVar, C0901c cVar2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z = (hVar.mo6331b() - hVar.mo6330a()) % 2 == 0;
        int b = hVar.mo6331b() - hVar.mo6330a();
        int i5 = -i;
        int i6 = i5;
        while (i6 <= i) {
            if (i6 == i5 || (i6 != i && cVar2.mo6315c(i6 + 1) < cVar2.mo6315c(i6 - 1))) {
                i3 = cVar2.mo6315c(i6 + 1);
                i2 = i3;
            } else {
                i3 = cVar2.mo6315c(i6 - 1);
                i2 = i3 - 1;
            }
            int i7 = hVar.f4983d - ((hVar.f4981b - i2) - i6);
            int i8 = (i == 0 || i2 != i3) ? i7 : i7 + 1;
            while (i2 > hVar.f4980a && i7 > hVar.f4982c && bVar.mo6176b(i2 - 1, i7 - 1)) {
                i2--;
                i7--;
            }
            cVar2.mo6316d(i6, i2);
            if (!z || (i4 = b - i6) < i5 || i4 > i || cVar.mo6315c(i4) < i2) {
                i6 += 2;
            } else {
                C0907i iVar = new C0907i();
                iVar.f4984a = i2;
                iVar.f4986b = i7;
                iVar.f4987c = i3;
                iVar.f4988d = i8;
                iVar.f4985a = true;
                return iVar;
            }
        }
        return null;
    }

    @mr2
    /* renamed from: b */
    public static C0903e m6288b(@mr2 C0900b bVar) {
        return m6289c(bVar, true);
    }

    @mr2
    /* renamed from: c */
    public static C0903e m6289c(@mr2 C0900b bVar, boolean z) {
        int e = bVar.mo6179e();
        int d = bVar.mo6178d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0906h(0, e, 0, d));
        int i = ((((e + d) + 1) / 2) * 2) + 1;
        C0901c cVar = new C0901c(i);
        C0901c cVar2 = new C0901c(i);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0906h hVar = (C0906h) arrayList2.remove(arrayList2.size() - 1);
            C0907i e2 = m6291e(hVar, bVar, cVar, cVar2);
            if (e2 != null) {
                if (e2.mo6332a() > 0) {
                    arrayList.add(e2.mo6335d());
                }
                C0906h hVar2 = arrayList3.isEmpty() ? new C0906h() : (C0906h) arrayList3.remove(arrayList3.size() - 1);
                hVar2.f4980a = hVar.f4980a;
                hVar2.f4982c = hVar.f4982c;
                hVar2.f4981b = e2.f4984a;
                hVar2.f4983d = e2.f4986b;
                arrayList2.add(hVar2);
                hVar.f4981b = hVar.f4981b;
                hVar.f4983d = hVar.f4983d;
                hVar.f4980a = e2.f4987c;
                hVar.f4982c = e2.f4988d;
                arrayList2.add(hVar);
            } else {
                arrayList3.add(hVar);
            }
        }
        Collections.sort(arrayList, f4956a);
        return new C0903e(bVar, arrayList, cVar.mo6313a(), cVar2.mo6313a(), z);
    }

    @ts2
    /* renamed from: d */
    public static C0907i m6290d(C0906h hVar, C0900b bVar, C0901c cVar, C0901c cVar2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z = true;
        if (Math.abs(hVar.mo6331b() - hVar.mo6330a()) % 2 != 1) {
            z = false;
        }
        int b = hVar.mo6331b() - hVar.mo6330a();
        int i5 = -i;
        int i6 = i5;
        while (i6 <= i) {
            if (i6 == i5 || (i6 != i && cVar.mo6315c(i6 + 1) > cVar.mo6315c(i6 - 1))) {
                i3 = cVar.mo6315c(i6 + 1);
                i2 = i3;
            } else {
                i3 = cVar.mo6315c(i6 - 1);
                i2 = i3 + 1;
            }
            int i7 = (hVar.f4982c + (i2 - hVar.f4980a)) - i6;
            int i8 = (i == 0 || i2 != i3) ? i7 : i7 - 1;
            while (i2 < hVar.f4981b && i7 < hVar.f4983d && bVar.mo6176b(i2, i7)) {
                i2++;
                i7++;
            }
            cVar.mo6316d(i6, i2);
            if (!z || (i4 = b - i6) < i5 + 1 || i4 > i - 1 || cVar2.mo6315c(i4) > i2) {
                i6 += 2;
            } else {
                C0907i iVar = new C0907i();
                iVar.f4984a = i3;
                iVar.f4986b = i8;
                iVar.f4987c = i2;
                iVar.f4988d = i7;
                iVar.f4985a = false;
                return iVar;
            }
        }
        return null;
    }

    @ts2
    /* renamed from: e */
    public static C0907i m6291e(C0906h hVar, C0900b bVar, C0901c cVar, C0901c cVar2) {
        if (hVar.mo6331b() >= 1 && hVar.mo6330a() >= 1) {
            int b = ((hVar.mo6331b() + hVar.mo6330a()) + 1) / 2;
            cVar.mo6316d(1, hVar.f4980a);
            cVar2.mo6316d(1, hVar.f4981b);
            for (int i = 0; i < b; i++) {
                C0907i d = m6290d(hVar, bVar, cVar, cVar2, i);
                if (d != null) {
                    return d;
                }
                C0907i a = m6287a(hVar, bVar, cVar, cVar2, i);
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }
}
