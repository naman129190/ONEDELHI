package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.onedelhi.secure.jh4;

/* renamed from: com.onedelhi.secure.ul */
public abstract class C3721ul<R> implements kh4<R> {

    /* renamed from: a */
    public final kh4<Drawable> f21424a;

    /* renamed from: com.onedelhi.secure.ul$a */
    public final class C3722a implements jh4<R> {

        /* renamed from: a */
        public final jh4<Drawable> f21425a;

        public C3722a(jh4<Drawable> jh4) {
            this.f21425a = jh4;
        }

        /* renamed from: a */
        public boolean mo13290a(R r, jh4.C2520a aVar) {
            return this.f21425a.mo13290a(new BitmapDrawable(aVar.mo18432f().getResources(), C3721ul.this.mo21990b(r)), aVar);
        }
    }

    public C3721ul(kh4<Drawable> kh4) {
        this.f21424a = kh4;
    }

    /* renamed from: a */
    public jh4<R> mo16140a(vd0 vd0, boolean z) {
        return new C3722a(this.f21424a.mo16140a(vd0, z));
    }

    /* renamed from: b */
    public abstract Bitmap mo21990b(R r);
}
