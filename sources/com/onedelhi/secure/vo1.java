package com.onedelhi.secure;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class vo1 {

    /* renamed from: a */
    public static final Object f21901a = new Object();

    /* renamed from: a */
    public final Context f21902a;
    @ts2

    /* renamed from: a */
    public uo1 f21903a;

    /* renamed from: a */
    public String f21904a;

    /* renamed from: a */
    public final Map<String, sa2> f21905a;

    public vo1(Drawable.Callback callback, String str, uo1 uo1, Map<String, sa2> map) {
        this.f21904a = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f21904a;
            if (str2.charAt(str2.length() - 1) != '/') {
                this.f21904a += '/';
            }
        }
        if (!(callback instanceof View)) {
            p92.m24544e("LottieDrawable must be inside of a view for images to work.");
            this.f21905a = new HashMap();
            this.f21902a = null;
            return;
        }
        this.f21902a = ((View) callback).getContext();
        this.f21905a = map;
        mo26191d(uo1);
    }

    @ts2
    /* renamed from: a */
    public Bitmap mo26188a(String str) {
        String str2;
        Bitmap m;
        sa2 sa2 = this.f21905a.get(str);
        if (sa2 == null) {
            return null;
        }
        Bitmap a = sa2.mo24273a();
        if (a != null) {
            return a;
        }
        uo1 uo1 = this.f21903a;
        if (uo1 != null) {
            Bitmap a2 = uo1.mo25679a(sa2);
            if (a2 != null) {
                mo26190c(str, a2);
            }
            return a2;
        }
        String c = sa2.mo24275c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!c.startsWith("data:") || c.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.f21904a)) {
                    AssetManager assets = this.f21902a.getAssets();
                    m = yq4.m32610m(BitmapFactory.decodeStream(assets.open(this.f21904a + c), (Rect) null, options), sa2.mo24278f(), sa2.mo24276d());
                } else {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
            } catch (IOException e) {
                e = e;
                str2 = "Unable to open asset.";
                p92.m24545f(str2, e);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(c.substring(c.indexOf(44) + 1), 0);
                m = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            } catch (IllegalArgumentException e2) {
                e = e2;
                str2 = "data URL did not have correct base64 format.";
                p92.m24545f(str2, e);
                return null;
            }
        }
        return mo26190c(str, m);
    }

    /* renamed from: b */
    public boolean mo26189b(Context context) {
        return (context == null && this.f21902a == null) || this.f21902a.equals(context);
    }

    /* renamed from: c */
    public final Bitmap mo26190c(String str, @ts2 Bitmap bitmap) {
        synchronized (f21901a) {
            this.f21905a.get(str).mo24279g(bitmap);
        }
        return bitmap;
    }

    /* renamed from: d */
    public void mo26191d(@ts2 uo1 uo1) {
        this.f21903a = uo1;
    }

    @ts2
    /* renamed from: e */
    public Bitmap mo26192e(String str, @ts2 Bitmap bitmap) {
        if (bitmap == null) {
            sa2 sa2 = this.f21905a.get(str);
            Bitmap a = sa2.mo24273a();
            sa2.mo24279g((Bitmap) null);
            return a;
        }
        Bitmap a2 = this.f21905a.get(str).mo24273a();
        mo26190c(str, bitmap);
        return a2;
    }
}
