package com.onedelhi.secure;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C1173a;
import java.security.MessageDigest;

public class rg1 implements sg4<ng1> {

    /* renamed from: a */
    public final sg4<Bitmap> f19839a;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, com.onedelhi.secure.sg4<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rg1(com.onedelhi.secure.sg4<android.graphics.Bitmap> r1) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.onedelhi.secure.g43.m15509d(r1)
            com.onedelhi.secure.sg4 r1 = (com.onedelhi.secure.sg4) r1
            r0.f19839a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.rg1.<init>(com.onedelhi.secure.sg4):void");
    }

    /* renamed from: a */
    public void mo13311a(@mr2 MessageDigest messageDigest) {
        this.f19839a.mo13311a(messageDigest);
    }

    @mr2
    /* renamed from: b */
    public ck3<ng1> mo13753b(@mr2 Context context, @mr2 ck3<ng1> ck3, int i, int i2) {
        ng1 ng1 = ck3.get();
        C2768lm lmVar = new C2768lm(ng1.mo21239h(), C1173a.m7529e(context).mo7457h());
        ck3<Bitmap> b = this.f19839a.mo13753b(context, lmVar, i, i2);
        if (!lmVar.equals(b)) {
            lmVar.mo13177a();
        }
        ng1.mo21251r(this.f19839a, b.get());
        return ck3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof rg1) {
            return this.f19839a.equals(((rg1) obj).f19839a);
        }
        return false;
    }

    public int hashCode() {
        return this.f19839a.hashCode();
    }
}
