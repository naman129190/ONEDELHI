package com.onedelhi.secure;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: com.onedelhi.secure.p2 */
public class C3110p2 implements DrawerLayout.C0535e {

    /* renamed from: a */
    public static final float f18290a = 0.33333334f;

    /* renamed from: a */
    public static final String f18291a = "ActionBarDrawerToggle";

    /* renamed from: a */
    public static final int[] f18292a = {16843531};

    /* renamed from: d */
    public static final int f18293d = 16908332;

    /* renamed from: a */
    public final int f18294a;

    /* renamed from: a */
    public final Activity f18295a;

    /* renamed from: a */
    public Drawable f18296a;

    /* renamed from: a */
    public final DrawerLayout f18297a;

    /* renamed from: a */
    public final C3111a f18298a;

    /* renamed from: a */
    public C3113c f18299a;

    /* renamed from: a */
    public C3114d f18300a;

    /* renamed from: a */
    public boolean f18301a;

    /* renamed from: b */
    public final int f18302b;

    /* renamed from: b */
    public Drawable f18303b;

    /* renamed from: b */
    public boolean f18304b;

    /* renamed from: c */
    public final int f18305c;

    @Deprecated
    /* renamed from: com.onedelhi.secure.p2$a */
    public interface C3111a {
        @ts2
        /* renamed from: a */
        Drawable mo22213a();

        /* renamed from: b */
        void mo22214b(Drawable drawable, @e54 int i);

        /* renamed from: c */
        void mo22215c(@e54 int i);
    }

    @Deprecated
    /* renamed from: com.onedelhi.secure.p2$b */
    public interface C3112b {
        @ts2
        /* renamed from: a */
        C3111a mo22216a();
    }

    /* renamed from: com.onedelhi.secure.p2$c */
    public static class C3113c {

        /* renamed from: a */
        public ImageView f18306a;

        /* renamed from: a */
        public Method f18307a;

        /* renamed from: b */
        public Method f18308b;

        public C3113c(Activity activity) {
            try {
                this.f18307a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
                this.f18308b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(C3110p2.f18293d);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                        if (childAt instanceof ImageView) {
                            this.f18306a = (ImageView) childAt;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.p2$d */
    public class C3114d extends InsetDrawable implements Drawable.Callback {

        /* renamed from: a */
        public float f18309a;

        /* renamed from: a */
        public final Rect f18310a = new Rect();

        /* renamed from: b */
        public float f18312b;

        /* renamed from: b */
        public final boolean f18313b = true;

        public C3114d(Drawable drawable) {
            super(drawable, 0);
        }

        /* renamed from: a */
        public float mo22217a() {
            return this.f18309a;
        }

        /* renamed from: b */
        public void mo22218b(float f) {
            this.f18312b = f;
            invalidateSelf();
        }

        /* renamed from: c */
        public void mo22219c(float f) {
            this.f18309a = f;
            invalidateSelf();
        }

        public void draw(@mr2 Canvas canvas) {
            copyBounds(this.f18310a);
            canvas.save();
            int i = 1;
            boolean z = jt4.m18928Z(C3110p2.this.f18295a.getWindow().getDecorView()) == 1;
            if (z) {
                i = -1;
            }
            float width = (float) this.f18310a.width();
            canvas.translate((-this.f18312b) * width * this.f18309a * ((float) i), 0.0f);
            if (z && !this.f18313b) {
                canvas.translate(width, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }
    }

    public C3110p2(Activity activity, DrawerLayout drawerLayout, @dp0 int i, @e54 int i2, @e54 int i3) {
        this(activity, drawerLayout, !m24346e(activity), i, i2, i3);
    }

    public C3110p2(Activity activity, DrawerLayout drawerLayout, boolean z, @dp0 int i, @e54 int i2, @e54 int i3) {
        this.f18301a = true;
        this.f18295a = activity;
        this.f18298a = activity instanceof C3112b ? ((C3112b) activity).mo22216a() : null;
        this.f18297a = drawerLayout;
        this.f18294a = i;
        this.f18302b = i2;
        this.f18305c = i3;
        this.f18296a = mo22203f();
        this.f18303b = r70.m26356i(activity, i);
        C3114d dVar = new C3114d(this.f18303b);
        this.f18300a = dVar;
        dVar.mo22218b(z ? 0.33333334f : 0.0f);
    }

    /* renamed from: e */
    public static boolean m24346e(Context context) {
        return context.getApplicationInfo().targetSdkVersion >= 21;
    }

    /* renamed from: a */
    public void mo881a(View view, float f) {
        float a = this.f18300a.mo22217a();
        this.f18300a.mo22219c(f > 0.5f ? Math.max(a, Math.max(0.0f, f - 0.5f) * 2.0f) : Math.min(a, f * 2.0f));
    }

    /* renamed from: b */
    public void mo882b(int i) {
    }

    /* renamed from: c */
    public void mo883c(View view) {
        this.f18300a.mo22219c(1.0f);
        if (this.f18301a) {
            mo22207j(this.f18305c);
        }
    }

    /* renamed from: d */
    public void mo884d(View view) {
        this.f18300a.mo22219c(0.0f);
        if (this.f18301a) {
            mo22207j(this.f18302b);
        }
    }

    /* renamed from: f */
    public final Drawable mo22203f() {
        C3111a aVar = this.f18298a;
        if (aVar != null) {
            return aVar.mo22213a();
        }
        ActionBar actionBar = this.f18295a.getActionBar();
        TypedArray obtainStyledAttributes = (actionBar != null ? actionBar.getThemedContext() : this.f18295a).obtainStyledAttributes((AttributeSet) null, f18292a, 16843470, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: g */
    public boolean mo22204g() {
        return this.f18301a;
    }

    /* renamed from: h */
    public void mo22205h(Configuration configuration) {
        if (!this.f18304b) {
            this.f18296a = mo22203f();
        }
        this.f18303b = r70.m26356i(this.f18295a, this.f18294a);
        mo22212o();
    }

    /* renamed from: i */
    public boolean mo22206i(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f18301a) {
            return false;
        }
        if (this.f18297a.mo4029G(ri1.f19869b)) {
            this.f18297a.mo4057e(ri1.f19869b);
            return true;
        }
        this.f18297a.mo4034L(ri1.f19869b);
        return true;
    }

    /* renamed from: j */
    public final void mo22207j(int i) {
        C3111a aVar = this.f18298a;
        if (aVar != null) {
            aVar.mo22215c(i);
            return;
        }
        ActionBar actionBar = this.f18295a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i);
        }
    }

    /* renamed from: k */
    public final void mo22208k(Drawable drawable, int i) {
        C3111a aVar = this.f18298a;
        if (aVar != null) {
            aVar.mo22214b(drawable, i);
            return;
        }
        ActionBar actionBar = this.f18295a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i);
        }
    }

    /* renamed from: l */
    public void mo22209l(boolean z) {
        int i;
        Drawable drawable;
        if (z != this.f18301a) {
            if (z) {
                drawable = this.f18300a;
                i = this.f18297a.mo4026D(ri1.f19869b) ? this.f18305c : this.f18302b;
            } else {
                drawable = this.f18296a;
                i = 0;
            }
            mo22208k(drawable, i);
            this.f18301a = z;
        }
    }

    /* renamed from: m */
    public void mo22210m(int i) {
        mo22211n(i != 0 ? r70.m26356i(this.f18295a, i) : null);
    }

    /* renamed from: n */
    public void mo22211n(Drawable drawable) {
        if (drawable == null) {
            this.f18296a = mo22203f();
            this.f18304b = false;
        } else {
            this.f18296a = drawable;
            this.f18304b = true;
        }
        if (!this.f18301a) {
            mo22208k(this.f18296a, 0);
        }
    }

    /* renamed from: o */
    public void mo22212o() {
        float f;
        C3114d dVar;
        if (this.f18297a.mo4026D(ri1.f19869b)) {
            dVar = this.f18300a;
            f = 1.0f;
        } else {
            dVar = this.f18300a;
            f = 0.0f;
        }
        dVar.mo22219c(f);
        if (this.f18301a) {
            mo22208k(this.f18300a, this.f18297a.mo4026D(ri1.f19869b) ? this.f18305c : this.f18302b);
        }
    }
}
