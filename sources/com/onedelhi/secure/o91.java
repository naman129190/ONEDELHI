package com.onedelhi.secure;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

public class o91 {

    /* renamed from: a */
    public final AssetManager f17880a;
    @ts2

    /* renamed from: a */
    public n91 f17881a;

    /* renamed from: a */
    public final pm2<String> f17882a = new pm2<>();

    /* renamed from: a */
    public String f17883a = ".ttf";

    /* renamed from: a */
    public final Map<pm2<String>, Typeface> f17884a = new HashMap();

    /* renamed from: b */
    public final Map<String, Typeface> f17885b = new HashMap();

    public o91(Drawable.Callback callback, @ts2 n91 n91) {
        AssetManager assets;
        this.f17881a = n91;
        if (!(callback instanceof View)) {
            p92.m24544e("LottieDrawable must be inside of a view for images to work.");
            assets = null;
        } else {
            assets = ((View) callback).getContext().getAssets();
        }
        this.f17880a = assets;
    }

    /* renamed from: a */
    public final Typeface mo21836a(String str) {
        String b;
        Typeface typeface = this.f17885b.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface typeface2 = null;
        n91 n91 = this.f17881a;
        if (n91 != null) {
            typeface2 = n91.mo20996a(str);
        }
        n91 n912 = this.f17881a;
        if (!(n912 == null || typeface2 != null || (b = n912.mo20997b(str)) == null)) {
            typeface2 = Typeface.createFromAsset(this.f17880a, b);
        }
        if (typeface2 == null) {
            typeface2 = Typeface.createFromAsset(this.f17880a, "fonts/" + str + this.f17883a);
        }
        this.f17885b.put(str, typeface2);
        return typeface2;
    }

    /* renamed from: b */
    public Typeface mo21837b(String str, String str2) {
        this.f17882a.mo22505b(str, str2);
        Typeface typeface = this.f17884a.get(this.f17882a);
        if (typeface != null) {
            return typeface;
        }
        Typeface e = mo21840e(mo21836a(str), str2);
        this.f17884a.put(this.f17882a, e);
        return e;
    }

    /* renamed from: c */
    public void mo21838c(String str) {
        this.f17883a = str;
    }

    /* renamed from: d */
    public void mo21839d(@ts2 n91 n91) {
        this.f17881a = n91;
    }

    /* renamed from: e */
    public final Typeface mo21840e(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (!contains || !contains2) ? contains ? 2 : contains2 ? 1 : 0 : 3;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }
}
