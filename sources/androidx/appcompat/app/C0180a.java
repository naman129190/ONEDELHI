package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.C0187b;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.onedelhi.secure.C3110p2;
import com.onedelhi.secure.e54;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.np0;
import com.onedelhi.secure.pn0;
import com.onedelhi.secure.ri1;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;

/* renamed from: androidx.appcompat.app.a */
public class C0180a implements DrawerLayout.C0535e {

    /* renamed from: a */
    public final int f776a;

    /* renamed from: a */
    public Drawable f777a;

    /* renamed from: a */
    public View.OnClickListener f778a;

    /* renamed from: a */
    public final C0182b f779a;

    /* renamed from: a */
    public final DrawerLayout f780a;

    /* renamed from: a */
    public np0 f781a;

    /* renamed from: a */
    public boolean f782a;

    /* renamed from: b */
    public final int f783b;

    /* renamed from: b */
    public boolean f784b;

    /* renamed from: c */
    public boolean f785c;

    /* renamed from: d */
    public boolean f786d;

    /* renamed from: androidx.appcompat.app.a$a */
    public class C0181a implements View.OnClickListener {
        public C0181a() {
        }

        public void onClick(View view) {
            C0180a aVar = C0180a.this;
            if (aVar.f784b) {
                aVar.mo902v();
                return;
            }
            View.OnClickListener onClickListener = aVar.f778a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.a$b */
    public interface C0182b {
        /* renamed from: a */
        Drawable mo904a();

        /* renamed from: b */
        void mo905b(Drawable drawable, @e54 int i);

        /* renamed from: c */
        void mo906c(@e54 int i);

        /* renamed from: d */
        boolean mo907d();

        /* renamed from: e */
        Context mo908e();
    }

    /* renamed from: androidx.appcompat.app.a$c */
    public interface C0183c {
        @ts2
        /* renamed from: N */
        C0182b mo842N();
    }

    /* renamed from: androidx.appcompat.app.a$d */
    public static class C0184d implements C0182b {

        /* renamed from: a */
        public final Activity f788a;

        /* renamed from: a */
        public C0187b.C0188a f789a;

        @sj3(18)
        /* renamed from: androidx.appcompat.app.a$d$a */
        public static class C0185a {
            @pn0
            /* renamed from: a */
            public static void m1301a(ActionBar actionBar, int i) {
                actionBar.setHomeActionContentDescription(i);
            }

            @pn0
            /* renamed from: b */
            public static void m1302b(ActionBar actionBar, Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }

        public C0184d(Activity activity) {
            this.f788a = activity;
        }

        /* renamed from: a */
        public Drawable mo904a() {
            TypedArray obtainStyledAttributes = mo908e().obtainStyledAttributes((AttributeSet) null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        /* renamed from: b */
        public void mo905b(Drawable drawable, int i) {
            ActionBar actionBar = this.f788a.getActionBar();
            if (actionBar != null) {
                C0185a.m1302b(actionBar, drawable);
                C0185a.m1301a(actionBar, i);
            }
        }

        /* renamed from: c */
        public void mo906c(int i) {
            ActionBar actionBar = this.f788a.getActionBar();
            if (actionBar != null) {
                C0185a.m1301a(actionBar, i);
            }
        }

        /* renamed from: d */
        public boolean mo907d() {
            ActionBar actionBar = this.f788a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        /* renamed from: e */
        public Context mo908e() {
            ActionBar actionBar = this.f788a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f788a;
        }
    }

    /* renamed from: androidx.appcompat.app.a$e */
    public static class C0186e implements C0182b {

        /* renamed from: a */
        public final Drawable f790a;

        /* renamed from: a */
        public final Toolbar f791a;

        /* renamed from: a */
        public final CharSequence f792a;

        public C0186e(Toolbar toolbar) {
            this.f791a = toolbar;
            this.f790a = toolbar.getNavigationIcon();
            this.f792a = toolbar.getNavigationContentDescription();
        }

        /* renamed from: a */
        public Drawable mo904a() {
            return this.f790a;
        }

        /* renamed from: b */
        public void mo905b(Drawable drawable, @e54 int i) {
            this.f791a.setNavigationIcon(drawable);
            mo906c(i);
        }

        /* renamed from: c */
        public void mo906c(@e54 int i) {
            if (i == 0) {
                this.f791a.setNavigationContentDescription(this.f792a);
            } else {
                this.f791a.setNavigationContentDescription(i);
            }
        }

        /* renamed from: d */
        public boolean mo907d() {
            return true;
        }

        /* renamed from: e */
        public Context mo908e() {
            return this.f791a.getContext();
        }
    }

    public C0180a(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, np0 np0, @e54 int i, @e54 int i2) {
        this.f782a = true;
        this.f784b = true;
        this.f786d = false;
        if (toolbar != null) {
            this.f779a = new C0186e(toolbar);
            toolbar.setNavigationOnClickListener(new C0181a());
        } else if (activity instanceof C0183c) {
            this.f779a = ((C0183c) activity).mo842N();
        } else {
            this.f779a = new C0184d(activity);
        }
        this.f780a = drawerLayout;
        this.f776a = i;
        this.f783b = i2;
        if (np0 == null) {
            this.f781a = new np0(this.f779a.mo908e());
        } else {
            this.f781a = np0;
        }
        this.f777a = mo886f();
    }

    public C0180a(Activity activity, DrawerLayout drawerLayout, @e54 int i, @e54 int i2) {
        this(activity, (Toolbar) null, drawerLayout, (np0) null, i, i2);
    }

    public C0180a(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, @e54 int i, @e54 int i2) {
        this(activity, toolbar, drawerLayout, (np0) null, i, i2);
    }

    /* renamed from: a */
    public void mo881a(View view, float f) {
        if (this.f782a) {
            mo899s(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            mo899s(0.0f);
        }
    }

    /* renamed from: b */
    public void mo882b(int i) {
    }

    /* renamed from: c */
    public void mo883c(View view) {
        mo899s(1.0f);
        if (this.f784b) {
            mo892l(this.f783b);
        }
    }

    /* renamed from: d */
    public void mo884d(View view) {
        mo899s(0.0f);
        if (this.f784b) {
            mo892l(this.f776a);
        }
    }

    @mr2
    /* renamed from: e */
    public np0 mo885e() {
        return this.f781a;
    }

    /* renamed from: f */
    public Drawable mo886f() {
        return this.f779a.mo904a();
    }

    /* renamed from: g */
    public View.OnClickListener mo887g() {
        return this.f778a;
    }

    /* renamed from: h */
    public boolean mo888h() {
        return this.f784b;
    }

    /* renamed from: i */
    public boolean mo889i() {
        return this.f782a;
    }

    /* renamed from: j */
    public void mo890j(Configuration configuration) {
        if (!this.f785c) {
            this.f777a = mo886f();
        }
        mo901u();
    }

    /* renamed from: k */
    public boolean mo891k(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f784b) {
            return false;
        }
        mo902v();
        return true;
    }

    /* renamed from: l */
    public void mo892l(int i) {
        this.f779a.mo906c(i);
    }

    /* renamed from: m */
    public void mo893m(Drawable drawable, int i) {
        if (!this.f786d && !this.f779a.mo907d()) {
            Log.w(C3110p2.f18291a, "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f786d = true;
        }
        this.f779a.mo905b(drawable, i);
    }

    /* renamed from: n */
    public void mo894n(@mr2 np0 np0) {
        this.f781a = np0;
        mo901u();
    }

    /* renamed from: o */
    public void mo895o(boolean z) {
        int i;
        Drawable drawable;
        if (z != this.f784b) {
            if (z) {
                drawable = this.f781a;
                i = this.f780a.mo4026D(ri1.f19869b) ? this.f783b : this.f776a;
            } else {
                drawable = this.f777a;
                i = 0;
            }
            mo893m(drawable, i);
            this.f784b = z;
        }
    }

    /* renamed from: p */
    public void mo896p(boolean z) {
        this.f782a = z;
        if (!z) {
            mo899s(0.0f);
        }
    }

    /* renamed from: q */
    public void mo897q(int i) {
        mo898r(i != 0 ? this.f780a.getResources().getDrawable(i) : null);
    }

    /* renamed from: r */
    public void mo898r(Drawable drawable) {
        if (drawable == null) {
            this.f777a = mo886f();
            this.f785c = false;
        } else {
            this.f777a = drawable;
            this.f785c = true;
        }
        if (!this.f784b) {
            mo893m(this.f777a, 0);
        }
    }

    /* renamed from: s */
    public final void mo899s(float f) {
        np0 np0;
        boolean z;
        if (f == 1.0f) {
            np0 = this.f781a;
            z = true;
        } else {
            if (f == 0.0f) {
                np0 = this.f781a;
                z = false;
            }
            this.f781a.mo21411s(f);
        }
        np0.mo21415u(z);
        this.f781a.mo21411s(f);
    }

    /* renamed from: t */
    public void mo900t(View.OnClickListener onClickListener) {
        this.f778a = onClickListener;
    }

    /* renamed from: u */
    public void mo901u() {
        mo899s(this.f780a.mo4026D(ri1.f19869b) ? 1.0f : 0.0f);
        if (this.f784b) {
            mo893m(this.f781a, this.f780a.mo4026D(ri1.f19869b) ? this.f783b : this.f776a);
        }
    }

    /* renamed from: v */
    public void mo902v() {
        int r = this.f780a.mo4088r(ri1.f19869b);
        if (this.f780a.mo4029G(ri1.f19869b) && r != 2) {
            this.f780a.mo4057e(ri1.f19869b);
        } else if (r != 1) {
            this.f780a.mo4034L(ri1.f19869b);
        }
    }
}
