package com.onedelhi.secure;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\n\u001a\r\u0010\n\u001a\u00020\u0006*\u00020\u0000H\b\u001a\r\u0010\u000b\u001a\u00020\u0006*\u00020\u0000H\b\u001a3\u0010\u0010\u001a\u00020\b*\u00020\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\fH\bø\u0001\u0000\u001aH\u0010\u0012\u001a\u00020\b*\u00020\u000026\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\u0011H\bø\u0001\u0000\u001a\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013*\u00020\u0000H\u0002\"\u0016\u0010\u0017\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001c"}, d2 = {"Landroid/view/Menu;", "", "index", "Landroid/view/MenuItem;", "d", "item", "", "a", "Lcom/onedelhi/secure/un4;", "j", "g", "h", "Lkotlin/Function1;", "Lcom/onedelhi/secure/iy2;", "name", "action", "b", "Lkotlin/Function2;", "c", "", "i", "f", "(Landroid/view/Menu;)I", "size", "Lcom/onedelhi/secure/zt3;", "e", "(Landroid/view/Menu;)Lcom/onedelhi/secure/zt3;", "children", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class hh2 {

    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002¨\u0006\u0005"}, d2 = {"com/onedelhi/secure/hh2$a", "Lcom/onedelhi/secure/zt3;", "Landroid/view/MenuItem;", "", "iterator", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.hh2$a */
    public static final class C2349a implements zt3<MenuItem> {

        /* renamed from: a */
        public final /* synthetic */ Menu f13108a;

        public C2349a(Menu menu) {
            this.f13108a = menu;
        }

        @vr2
        public Iterator<MenuItem> iterator() {
            return hh2.m16761i(this.f13108a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/onedelhi/secure/hh2$b", "", "Landroid/view/MenuItem;", "", "hasNext", "a", "Lcom/onedelhi/secure/un4;", "remove", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.hh2$b */
    public static final class C2350b implements Iterator<MenuItem>, qx1 {

        /* renamed from: a */
        public final /* synthetic */ Menu f13109a;

        /* renamed from: n */
        public int f13110n;

        public C2350b(Menu menu) {
            this.f13109a = menu;
        }

        @vr2
        /* renamed from: a */
        public MenuItem next() {
            Menu menu = this.f13109a;
            int i = this.f13110n;
            this.f13110n = i + 1;
            MenuItem item = menu.getItem(i);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        public boolean hasNext() {
            return this.f13110n < this.f13109a.size();
        }

        public void remove() {
            Menu menu = this.f13109a;
            int i = this.f13110n - 1;
            this.f13110n = i;
            menu.removeItem(i);
        }
    }

    /* renamed from: a */
    public static final boolean m16753a(@vr2 Menu menu, @vr2 MenuItem menuItem) {
        jt1.m53777p(menu, "<this>");
        jt1.m53777p(menuItem, "item");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            if (jt1.m53768g(menu.getItem(i), menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final void m16754b(@vr2 Menu menu, @vr2 ec1<? super MenuItem, un4> ec1) {
        jt1.m53777p(menu, "<this>");
        jt1.m53777p(ec1, "action");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            jt1.m53776o(item, "getItem(index)");
            ec1.mo17094X(item);
        }
    }

    /* renamed from: c */
    public static final void m16755c(@vr2 Menu menu, @vr2 sc1<? super Integer, ? super MenuItem, un4> sc1) {
        jt1.m53777p(menu, "<this>");
        jt1.m53777p(sc1, "action");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            Integer valueOf = Integer.valueOf(i);
            MenuItem item = menu.getItem(i);
            jt1.m53776o(item, "getItem(index)");
            sc1.mo21054h0(valueOf, item);
        }
    }

    @vr2
    /* renamed from: d */
    public static final MenuItem m16756d(@vr2 Menu menu, int i) {
        jt1.m53777p(menu, "<this>");
        MenuItem item = menu.getItem(i);
        jt1.m53776o(item, "getItem(index)");
        return item;
    }

    @vr2
    /* renamed from: e */
    public static final zt3<MenuItem> m16757e(@vr2 Menu menu) {
        jt1.m53777p(menu, "<this>");
        return new C2349a(menu);
    }

    /* renamed from: f */
    public static final int m16758f(@vr2 Menu menu) {
        jt1.m53777p(menu, "<this>");
        return menu.size();
    }

    /* renamed from: g */
    public static final boolean m16759g(@vr2 Menu menu) {
        jt1.m53777p(menu, "<this>");
        return menu.size() == 0;
    }

    /* renamed from: h */
    public static final boolean m16760h(@vr2 Menu menu) {
        jt1.m53777p(menu, "<this>");
        return menu.size() != 0;
    }

    @vr2
    /* renamed from: i */
    public static final Iterator<MenuItem> m16761i(@vr2 Menu menu) {
        jt1.m53777p(menu, "<this>");
        return new C2350b(menu);
    }

    /* renamed from: j */
    public static final void m16762j(@vr2 Menu menu, @vr2 MenuItem menuItem) {
        jt1.m53777p(menu, "<this>");
        jt1.m53777p(menuItem, "item");
        menu.removeItem(menuItem.getItemId());
    }
}
