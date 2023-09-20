package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0844a;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.s */
public class C0940s {

    /* renamed from: a */
    public final C0941a f5190a;

    /* renamed from: androidx.recyclerview.widget.s$a */
    public interface C0941a {
        /* renamed from: a */
        C0844a.C0846b mo6116a(int i, int i2, int i3, Object obj);

        /* renamed from: b */
        void mo6117b(C0844a.C0846b bVar);
    }

    public C0940s(C0941a aVar) {
        this.f5190a = aVar;
    }

    /* renamed from: a */
    public final int mo6496a(List<C0844a.C0846b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f4785a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo6497b(List<C0844a.C0846b> list) {
        while (true) {
            int a = mo6496a(list);
            if (a != -1) {
                mo6499d(list, a, a + 1);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo6498c(List<C0844a.C0846b> list, int i, C0844a.C0846b bVar, int i2, C0844a.C0846b bVar2) {
        int i3 = bVar.f4788c;
        int i4 = bVar2.f4787b;
        int i5 = i3 < i4 ? -1 : 0;
        int i6 = bVar.f4787b;
        if (i6 < i4) {
            i5++;
        }
        if (i4 <= i6) {
            bVar.f4787b = i6 + bVar2.f4788c;
        }
        int i7 = bVar2.f4787b;
        if (i7 <= i3) {
            bVar.f4788c = i3 + bVar2.f4788c;
        }
        bVar2.f4787b = i7 + i5;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* renamed from: d */
    public final void mo6499d(List<C0844a.C0846b> list, int i, int i2) {
        C0844a.C0846b bVar = list.get(i);
        C0844a.C0846b bVar2 = list.get(i2);
        int i3 = bVar2.f4785a;
        if (i3 == 1) {
            mo6498c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            mo6500e(list, i, bVar, i2, bVar2);
        } else if (i3 == 4) {
            mo6501f(list, i, bVar, i2, bVar2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009d, code lost:
        if (r0 > r14.f4787b) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c7, code lost:
        if (r0 >= r14.f4787b) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6500e(java.util.List<androidx.recyclerview.widget.C0844a.C0846b> r10, int r11, androidx.recyclerview.widget.C0844a.C0846b r12, int r13, androidx.recyclerview.widget.C0844a.C0846b r14) {
        /*
            r9 = this;
            int r0 = r12.f4787b
            int r1 = r12.f4788c
            r2 = 0
            r3 = 1
            int r4 = r14.f4787b
            if (r0 >= r1) goto L_0x0016
            if (r4 != r0) goto L_0x0014
            int r4 = r14.f4788c
            int r0 = r1 - r0
            if (r4 != r0) goto L_0x0014
            r0 = 0
            goto L_0x0020
        L_0x0014:
            r0 = 0
            goto L_0x0023
        L_0x0016:
            int r5 = r1 + 1
            if (r4 != r5) goto L_0x0022
            int r4 = r14.f4788c
            int r0 = r0 - r1
            if (r4 != r0) goto L_0x0022
            r0 = 1
        L_0x0020:
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            int r4 = r14.f4787b
            r5 = 2
            if (r1 >= r4) goto L_0x002c
            int r4 = r4 - r3
            r14.f4787b = r4
            goto L_0x0045
        L_0x002c:
            int r6 = r14.f4788c
            int r4 = r4 + r6
            if (r1 >= r4) goto L_0x0045
            int r6 = r6 - r3
            r14.f4788c = r6
            r12.f4785a = r5
            r12.f4788c = r3
            int r11 = r14.f4788c
            if (r11 != 0) goto L_0x0044
            r10.remove(r13)
            androidx.recyclerview.widget.s$a r10 = r9.f5190a
            r10.mo6117b(r14)
        L_0x0044:
            return
        L_0x0045:
            int r1 = r12.f4787b
            int r4 = r14.f4787b
            r6 = 0
            if (r1 > r4) goto L_0x0050
            int r4 = r4 + r3
            r14.f4787b = r4
            goto L_0x0066
        L_0x0050:
            int r7 = r14.f4788c
            int r8 = r4 + r7
            if (r1 >= r8) goto L_0x0066
            int r4 = r4 + r7
            int r4 = r4 - r1
            androidx.recyclerview.widget.s$a r7 = r9.f5190a
            int r1 = r1 + r3
            androidx.recyclerview.widget.a$b r6 = r7.mo6116a(r5, r1, r4, r6)
            int r1 = r12.f4787b
            int r3 = r14.f4787b
            int r1 = r1 - r3
            r14.f4788c = r1
        L_0x0066:
            if (r2 == 0) goto L_0x0074
            r10.set(r11, r14)
            r10.remove(r13)
            androidx.recyclerview.widget.s$a r10 = r9.f5190a
            r10.mo6117b(r12)
            return
        L_0x0074:
            if (r0 == 0) goto L_0x00a0
            if (r6 == 0) goto L_0x008e
            int r0 = r12.f4787b
            int r1 = r6.f4787b
            if (r0 <= r1) goto L_0x0083
            int r1 = r6.f4788c
            int r0 = r0 - r1
            r12.f4787b = r0
        L_0x0083:
            int r0 = r12.f4788c
            int r1 = r6.f4787b
            if (r0 <= r1) goto L_0x008e
            int r1 = r6.f4788c
            int r0 = r0 - r1
            r12.f4788c = r0
        L_0x008e:
            int r0 = r12.f4787b
            int r1 = r14.f4787b
            if (r0 <= r1) goto L_0x0099
            int r1 = r14.f4788c
            int r0 = r0 - r1
            r12.f4787b = r0
        L_0x0099:
            int r0 = r12.f4788c
            int r1 = r14.f4787b
            if (r0 <= r1) goto L_0x00ce
            goto L_0x00c9
        L_0x00a0:
            if (r6 == 0) goto L_0x00b8
            int r0 = r12.f4787b
            int r1 = r6.f4787b
            if (r0 < r1) goto L_0x00ad
            int r1 = r6.f4788c
            int r0 = r0 - r1
            r12.f4787b = r0
        L_0x00ad:
            int r0 = r12.f4788c
            int r1 = r6.f4787b
            if (r0 < r1) goto L_0x00b8
            int r1 = r6.f4788c
            int r0 = r0 - r1
            r12.f4788c = r0
        L_0x00b8:
            int r0 = r12.f4787b
            int r1 = r14.f4787b
            if (r0 < r1) goto L_0x00c3
            int r1 = r14.f4788c
            int r0 = r0 - r1
            r12.f4787b = r0
        L_0x00c3:
            int r0 = r12.f4788c
            int r1 = r14.f4787b
            if (r0 < r1) goto L_0x00ce
        L_0x00c9:
            int r1 = r14.f4788c
            int r0 = r0 - r1
            r12.f4788c = r0
        L_0x00ce:
            r10.set(r11, r14)
            int r14 = r12.f4787b
            int r0 = r12.f4788c
            if (r14 == r0) goto L_0x00db
            r10.set(r13, r12)
            goto L_0x00de
        L_0x00db:
            r10.remove(r13)
        L_0x00de:
            if (r6 == 0) goto L_0x00e3
            r10.add(r11, r6)
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0940s.mo6500e(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6501f(java.util.List<androidx.recyclerview.widget.C0844a.C0846b> r9, int r10, androidx.recyclerview.widget.C0844a.C0846b r11, int r12, androidx.recyclerview.widget.C0844a.C0846b r13) {
        /*
            r8 = this;
            int r0 = r11.f4788c
            int r1 = r13.f4787b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r4
            r13.f4787b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f4788c
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r4
            r13.f4788c = r5
            androidx.recyclerview.widget.s$a r0 = r8.f5190a
            int r1 = r11.f4787b
            java.lang.Object r5 = r13.f4786a
            androidx.recyclerview.widget.a$b r0 = r0.mo6116a(r2, r1, r4, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r3
        L_0x0021:
            int r1 = r11.f4787b
            int r5 = r13.f4787b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r4
            r13.f4787b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f4788c
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.s$a r3 = r8.f5190a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f4786a
            androidx.recyclerview.widget.a$b r3 = r3.mo6116a(r2, r1, r5, r4)
            int r1 = r13.f4788c
            int r1 = r1 - r5
            r13.f4788c = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f4788c
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.s$a r11 = r8.f5190a
            r11.mo6117b(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r3 == 0) goto L_0x005e
            r9.add(r10, r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0940s.mo6501f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
