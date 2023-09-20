package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import com.onedelhi.secure.g74;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.lt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.r70;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@hl3({hl3.C2354a.f13188c})
/* renamed from: androidx.appcompat.view.menu.e */
public class C0248e implements g74 {

    /* renamed from: a */
    public static final String f1100a = "MenuBuilder";

    /* renamed from: a */
    public static final int[] f1101a = {1, 4, 5, 3, 2, 0};

    /* renamed from: b */
    public static final String f1102b = "android:menu:presenters";

    /* renamed from: c */
    public static final String f1103c = "android:menu:actionviewstates";

    /* renamed from: d */
    public static final String f1104d = "android:menu:expandedactionview";

    /* renamed from: a */
    public final Context f1105a;

    /* renamed from: a */
    public final Resources f1106a;

    /* renamed from: a */
    public Drawable f1107a;

    /* renamed from: a */
    public ContextMenu.ContextMenuInfo f1108a;

    /* renamed from: a */
    public View f1109a;

    /* renamed from: a */
    public C0249a f1110a;

    /* renamed from: a */
    public C0253h f1111a;

    /* renamed from: a */
    public CharSequence f1112a;

    /* renamed from: a */
    public ArrayList<C0253h> f1113a;

    /* renamed from: a */
    public CopyOnWriteArrayList<WeakReference<C0258j>> f1114a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public boolean f1115a;

    /* renamed from: b */
    public ArrayList<C0253h> f1116b;

    /* renamed from: b */
    public boolean f1117b;

    /* renamed from: c */
    public ArrayList<C0253h> f1118c;

    /* renamed from: c */
    public boolean f1119c;

    /* renamed from: d */
    public ArrayList<C0253h> f1120d;

    /* renamed from: d */
    public boolean f1121d;

    /* renamed from: e */
    public ArrayList<C0253h> f1122e = new ArrayList<>();

    /* renamed from: e */
    public boolean f1123e = false;

    /* renamed from: f */
    public boolean f1124f = false;

    /* renamed from: g */
    public boolean f1125g = false;

    /* renamed from: h */
    public boolean f1126h = false;

    /* renamed from: i */
    public boolean f1127i = false;

    /* renamed from: j */
    public boolean f1128j = false;

    /* renamed from: k */
    public boolean f1129k;

    /* renamed from: l */
    public int f1130l = 0;

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: androidx.appcompat.view.menu.e$a */
    public interface C0249a {
        /* renamed from: a */
        void mo1031a(@mr2 C0248e eVar);

        /* renamed from: b */
        boolean mo1033b(@mr2 C0248e eVar, @mr2 MenuItem menuItem);
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: androidx.appcompat.view.menu.e$b */
    public interface C0250b {
        /* renamed from: a */
        boolean mo1197a(C0253h hVar);
    }

    public C0248e(Context context) {
        this.f1105a = context;
        this.f1106a = context.getResources();
        this.f1113a = new ArrayList<>();
        this.f1116b = new ArrayList<>();
        this.f1119c = true;
        this.f1118c = new ArrayList<>();
        this.f1120d = new ArrayList<>();
        this.f1121d = true;
        mo1347k0(true);
    }

    /* renamed from: E */
    public static int m1865E(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f1101a;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: q */
    public static int m1866q(ArrayList<C0253h> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo1425k() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: A */
    public CharSequence mo1285A() {
        return this.f1112a;
    }

    /* renamed from: B */
    public View mo1286B() {
        return this.f1109a;
    }

    /* renamed from: C */
    public ArrayList<C0253h> mo1287C() {
        mo1368u();
        return this.f1120d;
    }

    /* renamed from: D */
    public boolean mo1288D() {
        return this.f1126h;
    }

    /* renamed from: F */
    public Resources mo1289F() {
        return this.f1106a;
    }

    /* renamed from: G */
    public C0248e mo1290G() {
        return this;
    }

    @mr2
    /* renamed from: H */
    public ArrayList<C0253h> mo1291H() {
        if (!this.f1119c) {
            return this.f1116b;
        }
        this.f1116b.clear();
        int size = this.f1113a.size();
        for (int i = 0; i < size; i++) {
            C0253h hVar = this.f1113a.get(i);
            if (hVar.isVisible()) {
                this.f1116b.add(hVar);
            }
        }
        this.f1119c = false;
        this.f1121d = true;
        return this.f1116b;
    }

    /* renamed from: I */
    public boolean mo1292I() {
        return this.f1128j;
    }

    /* renamed from: J */
    public boolean mo1293J() {
        return this.f1115a;
    }

    /* renamed from: K */
    public boolean mo1294K() {
        return this.f1117b;
    }

    /* renamed from: L */
    public void mo1295L(C0253h hVar) {
        this.f1121d = true;
        mo1297N(true);
    }

    /* renamed from: M */
    public void mo1296M(C0253h hVar) {
        this.f1119c = true;
        mo1297N(true);
    }

    /* renamed from: N */
    public void mo1297N(boolean z) {
        if (!this.f1123e) {
            if (z) {
                this.f1119c = true;
                this.f1121d = true;
            }
            mo1344j(z);
            return;
        }
        this.f1124f = true;
        if (z) {
            this.f1125g = true;
        }
    }

    /* renamed from: O */
    public boolean mo1298O(MenuItem menuItem, int i) {
        return mo1299P(menuItem, (C0258j) null, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1299P(android.view.MenuItem r7, androidx.appcompat.view.menu.C0258j r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.h r7 = (androidx.appcompat.view.menu.C0253h) r7
            r0 = 0
            if (r7 == 0) goto L_0x006c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006c
        L_0x000c:
            boolean r1 = r7.mo1430p()
            com.onedelhi.secure.u2 r2 = r7.mo1396f()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.mo2533b()
            if (r4 == 0) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            boolean r5 = r7.mo1429o()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x006b
        L_0x002d:
            r6.mo1332f(r3)
            goto L_0x006b
        L_0x0031:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003f
            if (r4 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x006b
            goto L_0x002d
        L_0x003f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0046
            r6.mo1332f(r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0058
            androidx.appcompat.view.menu.m r9 = new androidx.appcompat.view.menu.m
            android.content.Context r0 = r6.mo1371x()
            r9.<init>(r0, r6, r7)
            r7.mo1384C(r9)
        L_0x0058:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.m r7 = (androidx.appcompat.view.menu.C0265m) r7
            if (r4 == 0) goto L_0x0063
            r2.mo2535g(r7)
        L_0x0063:
            boolean r7 = r6.mo1350m(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x006b
            goto L_0x002d
        L_0x006b:
            return r1
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0248e.mo1299P(android.view.MenuItem, androidx.appcompat.view.menu.j, int):boolean");
    }

    /* renamed from: Q */
    public void mo1300Q(int i) {
        mo1301R(i, true);
    }

    /* renamed from: R */
    public final void mo1301R(int i, boolean z) {
        if (i >= 0 && i < this.f1113a.size()) {
            this.f1113a.remove(i);
            if (z) {
                mo1297N(true);
            }
        }
    }

    /* renamed from: S */
    public void mo1302S(C0258j jVar) {
        Iterator<WeakReference<C0258j>> it = this.f1114a.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0258j jVar2 = (C0258j) next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f1114a.remove(next);
            }
        }
    }

    /* renamed from: T */
    public void mo1303T(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo1370w());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0265m) item.getSubMenu()).mo1303T(bundle);
                }
            }
            int i2 = bundle.getInt(f1104d);
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: U */
    public void mo1304U(Bundle bundle) {
        mo1346k(bundle);
    }

    /* renamed from: V */
    public void mo1305V(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(f1104d, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0265m) item.getSubMenu()).mo1305V(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1370w(), sparseArray);
        }
    }

    /* renamed from: W */
    public void mo1306W(Bundle bundle) {
        mo1348l(bundle);
    }

    /* renamed from: X */
    public void mo1307X(C0249a aVar) {
        this.f1110a = aVar;
    }

    /* renamed from: Y */
    public void mo1308Y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1108a = contextMenuInfo;
    }

    /* renamed from: Z */
    public C0248e mo1309Z(int i) {
        this.f1130l = i;
        return this;
    }

    /* renamed from: a */
    public MenuItem mo1310a(int i, int i2, int i3, CharSequence charSequence) {
        int E = m1865E(i3);
        C0253h h = mo1338h(i, i2, i3, E, charSequence, this.f1130l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1108a;
        if (contextMenuInfo != null) {
            h.mo1382A(contextMenuInfo);
        }
        ArrayList<C0253h> arrayList = this.f1113a;
        arrayList.add(m1866q(arrayList, E), h);
        mo1297N(true);
        return h;
    }

    /* renamed from: a0 */
    public void mo1311a0(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1113a.size();
        mo1351m0();
        for (int i = 0; i < size; i++) {
            C0253h hVar = this.f1113a.get(i);
            if (hVar.getGroupId() == groupId && hVar.mo1432r() && hVar.isCheckable()) {
                hVar.mo1466x(hVar == menuItem);
            }
        }
        mo1349l0();
    }

    public MenuItem add(int i) {
        return mo1310a(0, 0, 0, this.f1106a.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo1310a(i, i2, i3, this.f1106a.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo1310a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo1310a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f1105a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f1106a.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f1106a.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0253h hVar = (C0253h) mo1310a(i, i2, i3, charSequence);
        C0265m mVar = new C0265m(this.f1105a, this, hVar);
        hVar.mo1384C(mVar);
        return mVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo1321b(C0258j jVar) {
        mo1323c(jVar, this.f1105a);
    }

    /* renamed from: b0 */
    public C0248e mo1322b0(int i) {
        mo1329d0(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: c */
    public void mo1323c(C0258j jVar, Context context) {
        this.f1114a.add(new WeakReference(jVar));
        jVar.mo1217g(context, this);
        this.f1121d = true;
    }

    /* renamed from: c0 */
    public C0248e mo1324c0(Drawable drawable) {
        mo1329d0(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public void clear() {
        C0253h hVar = this.f1111a;
        if (hVar != null) {
            mo1335g(hVar);
        }
        this.f1113a.clear();
        mo1297N(true);
    }

    public void clearHeader() {
        this.f1107a = null;
        this.f1112a = null;
        this.f1109a = null;
        mo1297N(false);
    }

    public void close() {
        mo1332f(true);
    }

    /* renamed from: d */
    public void mo1328d() {
        C0249a aVar = this.f1110a;
        if (aVar != null) {
            aVar.mo1031a(this);
        }
    }

    /* renamed from: d0 */
    public final void mo1329d0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources F = mo1289F();
        if (view != null) {
            this.f1109a = view;
            this.f1112a = null;
            this.f1107a = null;
        } else {
            if (i > 0) {
                this.f1112a = F.getText(i);
            } else if (charSequence != null) {
                this.f1112a = charSequence;
            }
            if (i2 > 0) {
                this.f1107a = r70.m26356i(mo1371x(), i2);
            } else if (drawable != null) {
                this.f1107a = drawable;
            }
            this.f1109a = null;
        }
        mo1297N(false);
    }

    /* renamed from: e */
    public void mo1330e() {
        this.f1123e = true;
        clear();
        clearHeader();
        this.f1114a.clear();
        this.f1123e = false;
        this.f1124f = false;
        this.f1125g = false;
        mo1297N(true);
    }

    /* renamed from: e0 */
    public C0248e mo1331e0(int i) {
        mo1329d0(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: f */
    public final void mo1332f(boolean z) {
        if (!this.f1127i) {
            this.f1127i = true;
            Iterator<WeakReference<C0258j>> it = this.f1114a.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0258j jVar = (C0258j) next.get();
                if (jVar == null) {
                    this.f1114a.remove(next);
                } else {
                    jVar.mo1212b(this, z);
                }
            }
            this.f1127i = false;
        }
    }

    /* renamed from: f0 */
    public C0248e mo1333f0(CharSequence charSequence) {
        mo1329d0(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0253h hVar = this.f1113a.get(i2);
            if (hVar.getItemId() == i) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (findItem = hVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public boolean mo1335g(C0253h hVar) {
        boolean z = false;
        if (!this.f1114a.isEmpty() && this.f1111a == hVar) {
            mo1351m0();
            Iterator<WeakReference<C0258j>> it = this.f1114a.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0258j jVar = (C0258j) next.get();
                if (jVar == null) {
                    this.f1114a.remove(next);
                } else {
                    z = jVar.mo1221k(this, hVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo1349l0();
            if (z) {
                this.f1111a = null;
            }
        }
        return z;
    }

    /* renamed from: g0 */
    public C0248e mo1336g0(View view) {
        mo1329d0(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public MenuItem getItem(int i) {
        return this.f1113a.get(i);
    }

    /* renamed from: h */
    public final C0253h mo1338h(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0253h(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: h0 */
    public void mo1339h0(boolean z) {
        this.f1126h = z;
    }

    public boolean hasVisibleItems() {
        if (this.f1129k) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1113a.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo1341i(@mr2 C0248e eVar, @mr2 MenuItem menuItem) {
        C0249a aVar = this.f1110a;
        return aVar != null && aVar.mo1033b(eVar, menuItem);
    }

    /* renamed from: i0 */
    public void mo1342i0(boolean z) {
        this.f1129k = z;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo1360s(i, keyEvent) != null;
    }

    /* renamed from: j */
    public final void mo1344j(boolean z) {
        if (!this.f1114a.isEmpty()) {
            mo1351m0();
            Iterator<WeakReference<C0258j>> it = this.f1114a.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0258j jVar = (C0258j) next.get();
                if (jVar == null) {
                    this.f1114a.remove(next);
                } else {
                    jVar.mo1214d(z);
                }
            }
            mo1349l0();
        }
    }

    /* renamed from: j0 */
    public void mo1345j0(boolean z) {
        if (this.f1117b != z) {
            mo1347k0(z);
            mo1297N(false);
        }
    }

    /* renamed from: k */
    public final void mo1346k(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(f1102b);
        if (sparseParcelableArray != null && !this.f1114a.isEmpty()) {
            Iterator<WeakReference<C0258j>> it = this.f1114a.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0258j jVar = (C0258j) next.get();
                if (jVar == null) {
                    this.f1114a.remove(next);
                } else {
                    int id = jVar.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        jVar.mo1242n(parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: k0 */
    public final void mo1347k0(boolean z) {
        boolean z2 = true;
        if (!z || this.f1106a.getConfiguration().keyboard == 1 || !lt4.m20983g(ViewConfiguration.get(this.f1105a), this.f1105a)) {
            z2 = false;
        }
        this.f1117b = z2;
    }

    /* renamed from: l */
    public final void mo1348l(Bundle bundle) {
        Parcelable i;
        if (!this.f1114a.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<C0258j>> it = this.f1114a.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0258j jVar = (C0258j) next.get();
                if (jVar == null) {
                    this.f1114a.remove(next);
                } else {
                    int id = jVar.getId();
                    if (id > 0 && (i = jVar.mo1240i()) != null) {
                        sparseArray.put(id, i);
                    }
                }
            }
            bundle.putSparseParcelableArray(f1102b, sparseArray);
        }
    }

    /* renamed from: l0 */
    public void mo1349l0() {
        this.f1123e = false;
        if (this.f1124f) {
            this.f1124f = false;
            mo1297N(this.f1125g);
        }
    }

    /* renamed from: m */
    public final boolean mo1350m(C0265m mVar, C0258j jVar) {
        boolean z = false;
        if (this.f1114a.isEmpty()) {
            return false;
        }
        if (jVar != null) {
            z = jVar.mo1219h(mVar);
        }
        Iterator<WeakReference<C0258j>> it = this.f1114a.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0258j jVar2 = (C0258j) next.get();
            if (jVar2 == null) {
                this.f1114a.remove(next);
            } else if (!z) {
                z = jVar2.mo1219h(mVar);
            }
        }
        return z;
    }

    /* renamed from: m0 */
    public void mo1351m0() {
        if (!this.f1123e) {
            this.f1123e = true;
            this.f1124f = false;
            this.f1125g = false;
        }
    }

    /* renamed from: n */
    public boolean mo1352n(C0253h hVar) {
        boolean z = false;
        if (this.f1114a.isEmpty()) {
            return false;
        }
        mo1351m0();
        Iterator<WeakReference<C0258j>> it = this.f1114a.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0258j jVar = (C0258j) next.get();
            if (jVar == null) {
                this.f1114a.remove(next);
            } else {
                z = jVar.mo1223m(this, hVar);
                if (z) {
                    break;
                }
            }
        }
        mo1349l0();
        if (z) {
            this.f1111a = hVar;
        }
        return z;
    }

    /* renamed from: o */
    public int mo1353o(int i) {
        return mo1354p(i, 0);
    }

    /* renamed from: p */
    public int mo1354p(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f1113a.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo1298O(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0253h s = mo1360s(i, keyEvent);
        boolean O = s != null ? mo1298O(s, i2) : false;
        if ((i2 & 2) != 0) {
            mo1332f(true);
        }
        return O;
    }

    /* renamed from: r */
    public int mo1357r(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1113a.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public void removeGroup(int i) {
        int o = mo1353o(i);
        if (o >= 0) {
            int size = this.f1113a.size() - o;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f1113a.get(o).getGroupId() != i) {
                    mo1297N(true);
                } else {
                    mo1301R(o, false);
                    i2 = i3;
                }
            }
            mo1297N(true);
        }
    }

    public void removeItem(int i) {
        mo1301R(mo1357r(i), true);
    }

    /* renamed from: s */
    public C0253h mo1360s(int i, KeyEvent keyEvent) {
        ArrayList<C0253h> arrayList = this.f1122e;
        arrayList.clear();
        mo1367t(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean J = mo1293J();
        for (int i2 = 0; i2 < size; i2++) {
            C0253h hVar = arrayList.get(i2);
            char alphabeticShortcut = J ? hVar.getAlphabeticShortcut() : hVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (J && alphabeticShortcut == 8 && i == 67))) {
                return hVar;
            }
        }
        return null;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1113a.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0253h hVar = this.f1113a.get(i2);
            if (hVar.getGroupId() == i) {
                hVar.mo1467y(z2);
                hVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1128j = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1113a.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0253h hVar = this.f1113a.get(i2);
            if (hVar.getGroupId() == i) {
                hVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f1113a.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0253h hVar = this.f1113a.get(i2);
            if (hVar.getGroupId() == i && hVar.mo1385D(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo1297N(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f1115a = z;
        mo1297N(false);
    }

    public int size() {
        return this.f1113a.size();
    }

    /* renamed from: t */
    public void mo1367t(List<C0253h> list, int i, KeyEvent keyEvent) {
        boolean J = mo1293J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1113a.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0253h hVar = this.f1113a.get(i2);
                if (hVar.hasSubMenu()) {
                    ((C0248e) hVar.getSubMenu()).mo1367t(list, i, keyEvent);
                }
                char alphabeticShortcut = J ? hVar.getAlphabeticShortcut() : hVar.getNumericShortcut();
                if (((modifiers & g74.f12470e) == ((J ? hVar.getAlphabeticModifiers() : hVar.getNumericModifiers()) & g74.f12470e)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (J && alphabeticShortcut == 8 && i == 67)) && hVar.isEnabled()) {
                        list.add(hVar);
                    }
                }
            }
        }
    }

    /* renamed from: u */
    public void mo1368u() {
        ArrayList<C0253h> H = mo1291H();
        if (this.f1121d) {
            Iterator<WeakReference<C0258j>> it = this.f1114a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0258j jVar = (C0258j) next.get();
                if (jVar == null) {
                    this.f1114a.remove(next);
                } else {
                    z |= jVar.mo1215e();
                }
            }
            if (z) {
                this.f1118c.clear();
                this.f1120d.clear();
                int size = H.size();
                for (int i = 0; i < size; i++) {
                    C0253h hVar = H.get(i);
                    (hVar.mo1431q() ? this.f1118c : this.f1120d).add(hVar);
                }
            } else {
                this.f1118c.clear();
                this.f1120d.clear();
                this.f1120d.addAll(mo1291H());
            }
            this.f1121d = false;
        }
    }

    /* renamed from: v */
    public ArrayList<C0253h> mo1369v() {
        mo1368u();
        return this.f1118c;
    }

    /* renamed from: w */
    public String mo1370w() {
        return f1103c;
    }

    /* renamed from: x */
    public Context mo1371x() {
        return this.f1105a;
    }

    /* renamed from: y */
    public C0253h mo1372y() {
        return this.f1111a;
    }

    /* renamed from: z */
    public Drawable mo1373z() {
        return this.f1107a;
    }
}
