package com.onedelhi.secure;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.onedelhi.secure.za3;

public class z70 extends ContextWrapper {

    /* renamed from: b */
    public static Configuration f23484b;

    /* renamed from: a */
    public int f23485a;

    /* renamed from: a */
    public Configuration f23486a;

    /* renamed from: a */
    public Resources.Theme f23487a;

    /* renamed from: a */
    public Resources f23488a;

    /* renamed from: a */
    public LayoutInflater f23489a;

    @sj3(17)
    /* renamed from: com.onedelhi.secure.z70$a */
    public static class C4047a {
        @pn0
        /* renamed from: a */
        public static Context m32897a(z70 z70, Configuration configuration) {
            return z70.createConfigurationContext(configuration);
        }
    }

    public z70() {
        super((Context) null);
    }

    public z70(Context context, @e64 int i) {
        super(context);
        this.f23485a = i;
    }

    public z70(Context context, Resources.Theme theme) {
        super(context);
        this.f23487a = theme;
    }

    @sj3(26)
    /* renamed from: e */
    public static boolean m32891e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f23484b == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f23484b = configuration2;
        }
        return configuration.equals(f23484b);
    }

    /* renamed from: a */
    public void mo27819a(Configuration configuration) {
        if (this.f23488a != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f23486a == null) {
            this.f23486a = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final Resources mo27821b() {
        if (this.f23488a == null) {
            Configuration configuration = this.f23486a;
            this.f23488a = (configuration == null || (Build.VERSION.SDK_INT >= 26 && m32891e(configuration))) ? super.getResources() : C4047a.m32897a(this, this.f23486a).getResources();
        }
        return this.f23488a;
    }

    /* renamed from: c */
    public int mo27822c() {
        return this.f23485a;
    }

    /* renamed from: d */
    public final void mo27823d() {
        boolean z = this.f23487a == null;
        if (z) {
            this.f23487a = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f23487a.setTo(theme);
            }
        }
        mo27824f(this.f23487a, this.f23485a, z);
    }

    /* renamed from: f */
    public void mo27824f(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return mo27821b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f23489a == null) {
            this.f23489a = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f23489a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f23487a;
        if (theme != null) {
            return theme;
        }
        if (this.f23485a == 0) {
            this.f23485a = za3.C4067l.Theme_AppCompat_Light;
        }
        mo27823d();
        return this.f23487a;
    }

    public void setTheme(int i) {
        if (this.f23485a != i) {
            this.f23485a = i;
            mo27823d();
        }
    }
}
