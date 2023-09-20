package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.emoji2.text.C0575f;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@sj3(19)
@hl3({hl3.C2354a.LIBRARY_GROUP})
@C3568t7
public class xs0 {

    /* renamed from: a */
    public static final ThreadLocal<mi2> f22730a = new ThreadLocal<>();

    /* renamed from: c */
    public static final int f22731c = 0;

    /* renamed from: d */
    public static final int f22732d = 1;

    /* renamed from: e */
    public static final int f22733e = 2;

    /* renamed from: a */
    public final int f22734a;
    @mr2

    /* renamed from: a */
    public final C0575f f22735a;

    /* renamed from: b */
    public volatile int f22736b = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.xs0$a */
    public @interface C3948a {
    }

    public xs0(@mr2 C0575f fVar, @js1(from = 0) int i) {
        this.f22735a = fVar;
        this.f22734a = i;
    }

    /* renamed from: a */
    public void mo27066a(@mr2 Canvas canvas, float f, float f2, @mr2 Paint paint) {
        Typeface j = this.f22735a.mo4236j();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(j);
        Canvas canvas2 = canvas;
        canvas2.drawText(this.f22735a.mo4232f(), this.f22734a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* renamed from: b */
    public int mo27067b(int i) {
        return mo27073h().mo20402F(i);
    }

    /* renamed from: c */
    public int mo27068c() {
        return mo27073h().mo20405I();
    }

    /* renamed from: d */
    public short mo27069d() {
        return mo27073h().mo20408L();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: e */
    public int mo27070e() {
        return this.f22736b;
    }

    /* renamed from: f */
    public short mo27071f() {
        return mo27073h().mo20410S();
    }

    /* renamed from: g */
    public int mo27072g() {
        return mo27073h().mo20411T();
    }

    /* renamed from: h */
    public final mi2 mo27073h() {
        ThreadLocal<mi2> threadLocal = f22730a;
        mi2 mi2 = threadLocal.get();
        if (mi2 == null) {
            mi2 = new mi2();
            threadLocal.set(mi2);
        }
        this.f22735a.mo4233g().mo21283J(mi2, this.f22734a);
        return mi2;
    }

    /* renamed from: i */
    public short mo27074i() {
        return mo27073h().mo20412U();
    }

    @mr2
    /* renamed from: j */
    public Typeface mo27075j() {
        return this.f22735a.mo4236j();
    }

    /* renamed from: k */
    public short mo27076k() {
        return mo27073h().mo20413X();
    }

    /* renamed from: l */
    public boolean mo27077l() {
        return mo27073h().mo20409O();
    }

    @hl3({hl3.C2354a.TESTS})
    /* renamed from: m */
    public void mo27078m() {
        this.f22736b = 0;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: n */
    public void mo27079n(boolean z) {
        this.f22736b = z ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(mo27072g()));
        sb.append(", codepoints:");
        int c = mo27068c();
        for (int i = 0; i < c; i++) {
            sb.append(Integer.toHexString(mo27067b(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
