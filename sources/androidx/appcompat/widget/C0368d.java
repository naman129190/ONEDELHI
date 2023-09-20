package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.C0358b;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C3665u2;
import com.onedelhi.secure.za3;

/* renamed from: androidx.appcompat.widget.d */
public class C0368d extends C3665u2 {

    /* renamed from: b */
    public static final int f1806b = 4;

    /* renamed from: c */
    public static final String f1807c = "share_history.xml";

    /* renamed from: a */
    public int f1808a = 4;

    /* renamed from: a */
    public C0358b.C0364f f1809a;

    /* renamed from: a */
    public C0369a f1810a;

    /* renamed from: a */
    public final C0371c f1811a = new C0371c();

    /* renamed from: b */
    public final Context f1812b;

    /* renamed from: b */
    public String f1813b = f1807c;

    /* renamed from: androidx.appcompat.widget.d$a */
    public interface C0369a {
        /* renamed from: a */
        boolean mo2541a(C0368d dVar, Intent intent);
    }

    /* renamed from: androidx.appcompat.widget.d$b */
    public class C0370b implements C0358b.C0364f {
        public C0370b() {
        }

        /* renamed from: a */
        public boolean mo2530a(C0358b bVar, Intent intent) {
            C0368d dVar = C0368d.this;
            C0369a aVar = dVar.f1810a;
            if (aVar == null) {
                return false;
            }
            aVar.mo2541a(dVar, intent);
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.d$c */
    public class C0371c implements MenuItem.OnMenuItemClickListener {
        public C0371c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C0368d dVar = C0368d.this;
            Intent b = C0358b.m2510d(dVar.f1812b, dVar.f1813b).mo2501b(menuItem.getItemId());
            if (b == null) {
                return true;
            }
            String action = b.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                C0368d.this.mo2540r(b);
            }
            C0368d.this.f1812b.startActivity(b);
            return true;
        }
    }

    public C0368d(Context context) {
        super(context);
        this.f1812b = context;
    }

    /* renamed from: b */
    public boolean mo2533b() {
        return true;
    }

    /* renamed from: d */
    public View mo2534d() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f1812b);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(C0358b.m2510d(this.f1812b, this.f1813b));
        }
        TypedValue typedValue = new TypedValue();
        this.f1812b.getTheme().resolveAttribute(za3.C4057b.actionModeShareDrawable, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(C3129p8.m24529b(this.f1812b, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(za3.C4066k.abc_shareactionprovider_share_with_application);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(za3.C4066k.abc_shareactionprovider_share_with);
        return activityChooserView;
    }

    /* renamed from: g */
    public void mo2535g(SubMenu subMenu) {
        subMenu.clear();
        C0358b d = C0358b.m2510d(this.f1812b, this.f1813b);
        PackageManager packageManager = this.f1812b.getPackageManager();
        int f = d.mo2504f();
        int min = Math.min(f, this.f1808a);
        for (int i = 0; i < min; i++) {
            ResolveInfo e = d.mo2503e(i);
            subMenu.add(0, i, i, e.loadLabel(packageManager)).setIcon(e.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1811a);
        }
        if (min < f) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f1812b.getString(za3.C4066k.abc_activity_chooser_view_see_all));
            for (int i2 = 0; i2 < f; i2++) {
                ResolveInfo e2 = d.mo2503e(i2);
                addSubMenu.add(0, i2, i2, e2.loadLabel(packageManager)).setIcon(e2.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1811a);
            }
        }
    }

    /* renamed from: n */
    public final void mo2536n() {
        if (this.f1810a != null) {
            if (this.f1809a == null) {
                this.f1809a = new C0370b();
            }
            C0358b.m2510d(this.f1812b, this.f1813b).mo2519u(this.f1809a);
        }
    }

    /* renamed from: o */
    public void mo2537o(C0369a aVar) {
        this.f1810a = aVar;
        mo2536n();
    }

    /* renamed from: p */
    public void mo2538p(String str) {
        this.f1813b = str;
        mo2536n();
    }

    /* renamed from: q */
    public void mo2539q(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                mo2540r(intent);
            }
        }
        C0358b.m2510d(this.f1812b, this.f1813b).mo2518t(intent);
    }

    /* renamed from: r */
    public void mo2540r(Intent intent) {
        intent.addFlags(134742016);
    }
}
