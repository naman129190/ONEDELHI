package com.onedelhi.secure;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.onedelhi.secure.C3563t2;
import com.onedelhi.secure.hl3;
import java.util.ArrayList;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class y64 extends ActionMode {

    /* renamed from: a */
    public final Context f22898a;

    /* renamed from: a */
    public final C3563t2 f22899a;

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    /* renamed from: com.onedelhi.secure.y64$a */
    public static class C3977a implements C3563t2.C3564a {

        /* renamed from: a */
        public final Context f22900a;

        /* renamed from: a */
        public final ActionMode.Callback f22901a;

        /* renamed from: a */
        public final ty3<Menu, Menu> f22902a = new ty3<>();

        /* renamed from: a */
        public final ArrayList<y64> f22903a = new ArrayList<>();

        public C3977a(Context context, ActionMode.Callback callback) {
            this.f22900a = context;
            this.f22901a = callback;
        }

        /* renamed from: a */
        public boolean mo1074a(C3563t2 t2Var, Menu menu) {
            return this.f22901a.onCreateActionMode(mo27233e(t2Var), mo27234f(menu));
        }

        /* renamed from: b */
        public boolean mo1075b(C3563t2 t2Var, MenuItem menuItem) {
            return this.f22901a.onActionItemClicked(mo27233e(t2Var), new gh2(this.f22900a, (j74) menuItem));
        }

        /* renamed from: c */
        public boolean mo1076c(C3563t2 t2Var, Menu menu) {
            return this.f22901a.onPrepareActionMode(mo27233e(t2Var), mo27234f(menu));
        }

        /* renamed from: d */
        public void mo1077d(C3563t2 t2Var) {
            this.f22901a.onDestroyActionMode(mo27233e(t2Var));
        }

        /* renamed from: e */
        public ActionMode mo27233e(C3563t2 t2Var) {
            int size = this.f22903a.size();
            for (int i = 0; i < size; i++) {
                y64 y64 = this.f22903a.get(i);
                if (y64 != null && y64.f22899a == t2Var) {
                    return y64;
                }
            }
            y64 y642 = new y64(this.f22900a, t2Var);
            this.f22903a.add(y642);
            return y642;
        }

        /* renamed from: f */
        public final Menu mo27234f(Menu menu) {
            Menu menu2 = this.f22902a.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            mh2 mh2 = new mh2(this.f22900a, (g74) menu);
            this.f22902a.put(menu, mh2);
            return mh2;
        }
    }

    public y64(Context context, C3563t2 t2Var) {
        this.f22898a = context;
        this.f22899a = t2Var;
    }

    public void finish() {
        this.f22899a.mo1150c();
    }

    public View getCustomView() {
        return this.f22899a.mo1151d();
    }

    public Menu getMenu() {
        return new mh2(this.f22898a, (g74) this.f22899a.mo1152e());
    }

    public MenuInflater getMenuInflater() {
        return this.f22899a.mo1153f();
    }

    public CharSequence getSubtitle() {
        return this.f22899a.mo1154g();
    }

    public Object getTag() {
        return this.f22899a.mo24685h();
    }

    public CharSequence getTitle() {
        return this.f22899a.mo1155i();
    }

    public boolean getTitleOptionalHint() {
        return this.f22899a.mo24686j();
    }

    public void invalidate() {
        this.f22899a.mo1156k();
    }

    public boolean isTitleOptional() {
        return this.f22899a.mo1157l();
    }

    public void setCustomView(View view) {
        this.f22899a.mo1158n(view);
    }

    public void setSubtitle(int i) {
        this.f22899a.mo1159o(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f22899a.mo1160p(charSequence);
    }

    public void setTag(Object obj) {
        this.f22899a.mo24687q(obj);
    }

    public void setTitle(int i) {
        this.f22899a.mo1161r(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f22899a.mo1162s(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f22899a.mo1163t(z);
    }
}
