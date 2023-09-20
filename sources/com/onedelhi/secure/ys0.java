package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.onedelhi.secure.hl3;

@sj3(19)
public abstract class ys0 extends ReplacementSpan {

    /* renamed from: a */
    public float f23311a = 1.0f;

    /* renamed from: a */
    public final Paint.FontMetricsInt f23312a = new Paint.FontMetricsInt();
    @mr2

    /* renamed from: a */
    public final xs0 f23313a;

    /* renamed from: a */
    public short f23314a = -1;

    /* renamed from: b */
    public short f23315b = -1;

    @hl3({hl3.C2354a.LIBRARY})
    public ys0(@mr2 xs0 xs0) {
        k43.m19456m(xs0, "metadata cannot be null");
        this.f23313a = xs0;
    }

    @hl3({hl3.C2354a.TESTS})
    /* renamed from: a */
    public final int mo27675a() {
        return this.f23315b;
    }

    @hl3({hl3.C2354a.TESTS})
    /* renamed from: b */
    public final int mo27676b() {
        return mo27677c().mo27072g();
    }

    @mr2
    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: c */
    public final xs0 mo27677c() {
        return this.f23313a;
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: d */
    public final float mo27678d() {
        return this.f23311a;
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: e */
    public final int mo27679e() {
        return this.f23314a;
    }

    public int getSize(@mr2 Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, @ts2 Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f23312a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f23312a;
        this.f23311a = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f23313a.mo27071f());
        this.f23315b = (short) ((int) (((float) this.f23313a.mo27071f()) * this.f23311a));
        short k = (short) ((int) (((float) this.f23313a.mo27076k()) * this.f23311a));
        this.f23314a = k;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f23312a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return k;
    }
}
