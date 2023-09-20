package com.onedelhi.secure;

import android.content.res.AssetManager;
import android.util.Log;
import com.onedelhi.secure.pd0;
import java.io.IOException;

/* renamed from: com.onedelhi.secure.db */
public abstract class C1949db<T> implements pd0<T> {

    /* renamed from: c */
    public static final String f10663c = "AssetPathFetcher";

    /* renamed from: a */
    public final AssetManager f10664a;

    /* renamed from: a */
    public T f10665a;

    /* renamed from: b */
    public final String f10666b;

    public C1949db(AssetManager assetManager, String str) {
        this.f10664a = assetManager;
        this.f10666b = str;
    }

    /* renamed from: b */
    public void mo14569b() {
        T t = this.f10665a;
        if (t != null) {
            try {
                mo14573e(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public void mo14570c(@mr2 f53 f53, @mr2 pd0.C3144a<? super T> aVar) {
        try {
            T f = mo14574f(this.f10664a, this.f10666b);
            this.f10665a = f;
            aVar.mo13893f(f);
        } catch (IOException e) {
            if (Log.isLoggable(f10663c, 3)) {
                Log.d(f10663c, "Failed to load data from asset manager", e);
            }
            aVar.mo13892e(e);
        }
    }

    public void cancel() {
    }

    @mr2
    /* renamed from: d */
    public vd0 mo14572d() {
        return vd0.LOCAL;
    }

    /* renamed from: e */
    public abstract void mo14573e(T t) throws IOException;

    /* renamed from: f */
    public abstract T mo14574f(AssetManager assetManager, String str) throws IOException;
}
