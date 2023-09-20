package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.onedelhi.secure.C2760lj;
import java.util.List;

public class mi3 implements op0, pz2, ti1, C2760lj.C2762b, yy1 {

    /* renamed from: a */
    public final Matrix f16112a = new Matrix();

    /* renamed from: a */
    public final Path f16113a = new Path();

    /* renamed from: a */
    public final C2760lj<Float, Float> f16114a;

    /* renamed from: a */
    public final C2861mj f16115a;

    /* renamed from: a */
    public final qa2 f16116a;

    /* renamed from: a */
    public final rg4 f16117a;

    /* renamed from: a */
    public z60 f16118a;

    /* renamed from: a */
    public final String f16119a;

    /* renamed from: a */
    public final boolean f16120a;

    /* renamed from: b */
    public final C2760lj<Float, Float> f16121b;

    public mi3(qa2 qa2, C2861mj mjVar, li3 li3) {
        this.f16116a = qa2;
        this.f16115a = mjVar;
        this.f16119a = li3.mo19633c();
        this.f16120a = li3.mo19636f();
        C2760lj<Float, Float> a = li3.mo19632b().mo17597a();
        this.f16114a = a;
        mjVar.mo20432j(a);
        a.mo19638a(this);
        C2760lj<Float, Float> a2 = li3.mo19634d().mo17597a();
        this.f16121b = a2;
        mjVar.mo20432j(a2);
        a2.mo19638a(this);
        rg4 b = li3.mo19635e().mo25855b();
        this.f16117a = b;
        b.mo23856a(mjVar);
        b.mo23857b(this);
    }

    /* renamed from: a */
    public <T> void mo12684a(T t, @ts2 hb2<T> hb2) {
        C2760lj<Float, Float> ljVar;
        if (!this.f16117a.mo23858c(t, hb2)) {
            if (t == ab2.f8972g) {
                ljVar = this.f16114a;
            } else if (t == ab2.f8973h) {
                ljVar = this.f16121b;
            } else {
                return;
            }
            ljVar.mo19645m(hb2);
        }
    }

    /* renamed from: b */
    public void mo12685b(RectF rectF, Matrix matrix, boolean z) {
        this.f16118a.mo12685b(rectF, matrix, z);
    }

    /* renamed from: c */
    public void mo14992c() {
        this.f16116a.invalidateSelf();
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20419d(java.util.ListIterator<com.onedelhi.secure.y60> r9) {
        /*
            r8 = this;
            com.onedelhi.secure.z60 r0 = r8.f16118a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r9.previous()
            if (r0 == r8) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0017:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r9.previous()
            r6.add(r0)
            r9.remove()
            goto L_0x0017
        L_0x0028:
            java.util.Collections.reverse(r6)
            com.onedelhi.secure.z60 r9 = new com.onedelhi.secure.z60
            com.onedelhi.secure.qa2 r2 = r8.f16116a
            com.onedelhi.secure.mj r3 = r8.f16115a
            boolean r5 = r8.f16120a
            r7 = 0
            java.lang.String r4 = "Repeater"
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f16118a = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mi3.mo20419d(java.util.ListIterator):void");
    }

    /* renamed from: e */
    public Path mo17060e() {
        Path e = this.f16118a.mo17060e();
        this.f16113a.reset();
        float floatValue = this.f16114a.mo15565h().floatValue();
        float floatValue2 = this.f16121b.mo15565h().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f16112a.set(this.f16117a.mo23862g(((float) i) + floatValue2));
            this.f16113a.addPath(e, this.f16112a);
        }
        return this.f16113a;
    }

    /* renamed from: f */
    public void mo14993f(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.f16114a.mo15565h().floatValue();
        float floatValue2 = this.f16121b.mo15565h().floatValue();
        float floatValue3 = this.f16117a.mo23864i().mo15565h().floatValue() / 100.0f;
        float floatValue4 = this.f16117a.mo23860e().mo15565h().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f16112a.set(matrix);
            float f = (float) i2;
            this.f16112a.preConcat(this.f16117a.mo23862g(f + floatValue2));
            this.f16118a.mo14993f(canvas, this.f16112a, (int) (((float) i) * hj2.m16795j(floatValue3, floatValue4, f / floatValue)));
        }
    }

    /* renamed from: g */
    public void mo14994g(List<y60> list, List<y60> list2) {
        this.f16118a.mo14994g(list, list2);
    }

    public String getName() {
        return this.f16119a;
    }

    /* renamed from: h */
    public void mo14996h(wy1 wy1, int i, List<wy1> list, wy1 wy12) {
        hj2.m16797l(wy1, i, list, wy12, this);
    }
}
