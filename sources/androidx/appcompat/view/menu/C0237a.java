package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0258j;
import androidx.appcompat.view.menu.C0260k;
import com.onedelhi.secure.hl3;
import java.util.ArrayList;

@hl3({hl3.C2354a.f13188c})
/* renamed from: androidx.appcompat.view.menu.a */
public abstract class C0237a implements C0258j {

    /* renamed from: a */
    public Context f1030a;

    /* renamed from: a */
    public LayoutInflater f1031a;

    /* renamed from: a */
    public C0248e f1032a;

    /* renamed from: a */
    public C0258j.C0259a f1033a;

    /* renamed from: a */
    public C0260k f1034a;

    /* renamed from: b */
    public Context f1035b;

    /* renamed from: b */
    public LayoutInflater f1036b;

    /* renamed from: n */
    public int f1037n;

    /* renamed from: o */
    public int f1038o;

    /* renamed from: p */
    public int f1039p;

    public C0237a(Context context, int i, int i2) {
        this.f1030a = context;
        this.f1031a = LayoutInflater.from(context);
        this.f1037n = i;
        this.f1038o = i2;
    }

    /* renamed from: b */
    public void mo1212b(C0248e eVar, boolean z) {
        C0258j.C0259a aVar = this.f1033a;
        if (aVar != null) {
            aVar.mo1072b(eVar, z);
        }
    }

    /* renamed from: c */
    public void mo1213c(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1034a).addView(view, i);
    }

    /* renamed from: d */
    public void mo1214d(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f1034a;
        if (viewGroup != null) {
            C0248e eVar = this.f1032a;
            int i = 0;
            if (eVar != null) {
                eVar.mo1368u();
                ArrayList<C0253h> H = this.f1032a.mo1291H();
                int size = H.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0253h hVar = H.get(i3);
                    if (mo1229t(i2, hVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0253h itemData = childAt instanceof C0260k.C0261a ? ((C0260k.C0261a) childAt).getItemData() : null;
                        View r = mo1227r(hVar, childAt, viewGroup);
                        if (hVar != itemData) {
                            r.setPressed(false);
                            r.jumpDrawablesToCurrentState();
                        }
                        if (r != childAt) {
                            mo1213c(r, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo1225p(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo1215e() {
        return false;
    }

    /* renamed from: f */
    public C0260k mo1216f(ViewGroup viewGroup) {
        if (this.f1034a == null) {
            C0260k kVar = (C0260k) this.f1031a.inflate(this.f1037n, viewGroup, false);
            this.f1034a = kVar;
            kVar.mo1198g(this.f1032a);
            mo1214d(true);
        }
        return this.f1034a;
    }

    /* renamed from: g */
    public void mo1217g(Context context, C0248e eVar) {
        this.f1035b = context;
        this.f1036b = LayoutInflater.from(context);
        this.f1032a = eVar;
    }

    public int getId() {
        return this.f1039p;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1219h(androidx.appcompat.view.menu.C0265m r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.j$a r0 = r1.f1033a
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.e r2 = r1.f1032a
        L_0x0009:
            boolean r2 = r0.mo1073c(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0237a.mo1219h(androidx.appcompat.view.menu.m):boolean");
    }

    /* renamed from: j */
    public void mo1220j(C0258j.C0259a aVar) {
        this.f1033a = aVar;
    }

    /* renamed from: k */
    public boolean mo1221k(C0248e eVar, C0253h hVar) {
        return false;
    }

    /* renamed from: l */
    public abstract void mo1222l(C0253h hVar, C0260k.C0261a aVar);

    /* renamed from: m */
    public boolean mo1223m(C0248e eVar, C0253h hVar) {
        return false;
    }

    /* renamed from: o */
    public C0260k.C0261a mo1224o(ViewGroup viewGroup) {
        return (C0260k.C0261a) this.f1031a.inflate(this.f1038o, viewGroup, false);
    }

    /* renamed from: p */
    public boolean mo1225p(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: q */
    public C0258j.C0259a mo1226q() {
        return this.f1033a;
    }

    /* renamed from: r */
    public View mo1227r(C0253h hVar, View view, ViewGroup viewGroup) {
        C0260k.C0261a o = view instanceof C0260k.C0261a ? (C0260k.C0261a) view : mo1224o(viewGroup);
        mo1222l(hVar, o);
        return (View) o;
    }

    /* renamed from: s */
    public void mo1228s(int i) {
        this.f1039p = i;
    }

    /* renamed from: t */
    public boolean mo1229t(int i, C0253h hVar) {
        return true;
    }
}
