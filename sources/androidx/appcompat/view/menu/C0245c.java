package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.C0258j;
import androidx.appcompat.view.menu.C0260k;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.za3;
import java.util.ArrayList;

@hl3({hl3.C2354a.f13188c})
/* renamed from: androidx.appcompat.view.menu.c */
public class C0245c implements C0258j, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public static final String f1080b = "ListMenuPresenter";

    /* renamed from: c */
    public static final String f1081c = "android:menu:list";

    /* renamed from: a */
    public Context f1082a;

    /* renamed from: a */
    public LayoutInflater f1083a;

    /* renamed from: a */
    public ExpandedMenuView f1084a;

    /* renamed from: a */
    public C0246a f1085a;

    /* renamed from: a */
    public C0248e f1086a;

    /* renamed from: a */
    public C0258j.C0259a f1087a;

    /* renamed from: n */
    public int f1088n;

    /* renamed from: o */
    public int f1089o;

    /* renamed from: p */
    public int f1090p;

    /* renamed from: q */
    public int f1091q;

    /* renamed from: androidx.appcompat.view.menu.c$a */
    public class C0246a extends BaseAdapter {

        /* renamed from: n */
        public int f1093n = -1;

        public C0246a() {
            mo1268a();
        }

        /* renamed from: a */
        public void mo1268a() {
            C0253h y = C0245c.this.f1086a.mo1372y();
            if (y != null) {
                ArrayList<C0253h> C = C0245c.this.f1086a.mo1287C();
                int size = C.size();
                for (int i = 0; i < size; i++) {
                    if (C.get(i) == y) {
                        this.f1093n = i;
                        return;
                    }
                }
            }
            this.f1093n = -1;
        }

        /* renamed from: b */
        public C0253h getItem(int i) {
            ArrayList<C0253h> C = C0245c.this.f1086a.mo1287C();
            int i2 = i + C0245c.this.f1088n;
            int i3 = this.f1093n;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return C.get(i2);
        }

        public int getCount() {
            int size = C0245c.this.f1086a.mo1287C().size() - C0245c.this.f1088n;
            return this.f1093n < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0245c cVar = C0245c.this;
                view = cVar.f1083a.inflate(cVar.f1090p, viewGroup, false);
            }
            ((C0260k.C0261a) view).mo1171b(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo1268a();
            super.notifyDataSetChanged();
        }
    }

    public C0245c(int i, int i2) {
        this.f1090p = i;
        this.f1089o = i2;
    }

    public C0245c(Context context, int i) {
        this(i, 0);
        this.f1082a = context;
        this.f1083a = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter mo1261a() {
        if (this.f1085a == null) {
            this.f1085a = new C0246a();
        }
        return this.f1085a;
    }

    /* renamed from: b */
    public void mo1212b(C0248e eVar, boolean z) {
        C0258j.C0259a aVar = this.f1087a;
        if (aVar != null) {
            aVar.mo1072b(eVar, z);
        }
    }

    /* renamed from: c */
    public int mo1262c() {
        return this.f1088n;
    }

    /* renamed from: d */
    public void mo1214d(boolean z) {
        C0246a aVar = this.f1085a;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: e */
    public boolean mo1215e() {
        return false;
    }

    /* renamed from: f */
    public C0260k mo1216f(ViewGroup viewGroup) {
        if (this.f1084a == null) {
            this.f1084a = (ExpandedMenuView) this.f1083a.inflate(za3.C4065j.abc_expanded_menu_layout, viewGroup, false);
            if (this.f1085a == null) {
                this.f1085a = new C0246a();
            }
            this.f1084a.setAdapter(this.f1085a);
            this.f1084a.setOnItemClickListener(this);
        }
        return this.f1084a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1217g(android.content.Context r3, androidx.appcompat.view.menu.C0248e r4) {
        /*
            r2 = this;
            int r0 = r2.f1089o
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f1089o
            r0.<init>(r3, r1)
            r2.f1082a = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L_0x0011:
            r2.f1083a = r3
            goto L_0x0023
        L_0x0014:
            android.content.Context r0 = r2.f1082a
            if (r0 == 0) goto L_0x0023
            r2.f1082a = r3
            android.view.LayoutInflater r0 = r2.f1083a
            if (r0 != 0) goto L_0x0023
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L_0x0011
        L_0x0023:
            r2.f1086a = r4
            androidx.appcompat.view.menu.c$a r3 = r2.f1085a
            if (r3 == 0) goto L_0x002c
            r3.notifyDataSetChanged()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0245c.mo1217g(android.content.Context, androidx.appcompat.view.menu.e):void");
    }

    public int getId() {
        return this.f1091q;
    }

    /* renamed from: h */
    public boolean mo1219h(C0265m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new C0251f(mVar).mo1376e((IBinder) null);
        C0258j.C0259a aVar = this.f1087a;
        if (aVar == null) {
            return true;
        }
        aVar.mo1073c(mVar);
        return true;
    }

    /* renamed from: i */
    public Parcelable mo1240i() {
        if (this.f1084a == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        mo1264o(bundle);
        return bundle;
    }

    /* renamed from: j */
    public void mo1220j(C0258j.C0259a aVar) {
        this.f1087a = aVar;
    }

    /* renamed from: k */
    public boolean mo1221k(C0248e eVar, C0253h hVar) {
        return false;
    }

    /* renamed from: l */
    public void mo1263l(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f1084a.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: m */
    public boolean mo1223m(C0248e eVar, C0253h hVar) {
        return false;
    }

    /* renamed from: n */
    public void mo1242n(Parcelable parcelable) {
        mo1263l((Bundle) parcelable);
    }

    /* renamed from: o */
    public void mo1264o(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f1084a;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1086a.mo1299P(this.f1085a.getItem(i), this, 0);
    }

    /* renamed from: p */
    public void mo1266p(int i) {
        this.f1091q = i;
    }

    /* renamed from: q */
    public void mo1267q(int i) {
        this.f1088n = i;
        if (this.f1084a != null) {
            mo1214d(false);
        }
    }
}
