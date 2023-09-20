package com.onedelhi.secure;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.onedelhi.secure.hl3;

/* renamed from: com.onedelhi.secure.u2 */
public abstract class C3665u2 {

    /* renamed from: a */
    public static final String f21200a = "ActionProvider(support)";

    /* renamed from: a */
    public final Context f21201a;

    /* renamed from: a */
    public C3666a f21202a;

    /* renamed from: a */
    public C3667b f21203a;

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: com.onedelhi.secure.u2$a */
    public interface C3666a {
        /* renamed from: a */
        void mo2490a(boolean z);
    }

    /* renamed from: com.onedelhi.secure.u2$b */
    public interface C3667b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public C3665u2(@mr2 Context context) {
        this.f21201a = context;
    }

    @mr2
    /* renamed from: a */
    public Context mo25367a() {
        return this.f21201a;
    }

    /* renamed from: b */
    public boolean mo2533b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo16639c() {
        return true;
    }

    @mr2
    /* renamed from: d */
    public abstract View mo2534d();

    @mr2
    /* renamed from: e */
    public View mo16640e(@mr2 MenuItem menuItem) {
        return mo2534d();
    }

    /* renamed from: f */
    public boolean mo16638f() {
        return false;
    }

    /* renamed from: g */
    public void mo2535g(@mr2 SubMenu subMenu) {
    }

    /* renamed from: h */
    public boolean mo16641h() {
        return false;
    }

    /* renamed from: i */
    public void mo16642i() {
        if (this.f21203a != null && mo16641h()) {
            this.f21203a.onActionProviderVisibilityChanged(mo16639c());
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: j */
    public void mo25368j() {
        this.f21203a = null;
        this.f21202a = null;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: k */
    public void mo25369k(@ts2 C3666a aVar) {
        this.f21202a = aVar;
    }

    /* renamed from: l */
    public void mo16643l(@ts2 C3667b bVar) {
        if (!(this.f21203a == null || bVar == null)) {
            Log.w(f21200a, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f21203a = bVar;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: m */
    public void mo25370m(boolean z) {
        C3666a aVar = this.f21202a;
        if (aVar != null) {
            aVar.mo2490a(z);
        }
    }
}
