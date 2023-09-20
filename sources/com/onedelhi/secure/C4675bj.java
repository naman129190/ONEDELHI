package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.onedelhi.secure.bj */
public class C4675bj {

    /* renamed from: a */
    public static final float f26381a = 4.0f;

    /* renamed from: b */
    public static final float f26382b = 10.0f;

    /* renamed from: a */
    public final int f26383a = 2;

    /* renamed from: a */
    public b14 f26384a;

    /* renamed from: a */
    public ol3 f26385a;

    public C4675bj(ol3 ol3, b14 b14) {
        this.f26385a = ol3;
        this.f26384a = b14;
    }

    /* renamed from: a */
    public static void m39969a(Canvas canvas, Paint paint, sl3 sl3, sl3 sl32, int i) {
        if (sl3 != null && sl32 != null) {
            float f = (float) i;
            canvas.drawLine(sl3.mo44403c() / f, sl3.mo44404d() / f, sl32.mo44403c() / f, sl32.mo44404d() / f, paint);
        }
    }

    /* renamed from: m */
    public static List<sl3> m39970m(List<sl3> list, b14 b14) {
        ArrayList arrayList = new ArrayList(list.size());
        for (sl3 p : list) {
            arrayList.add(b14.mo31345p(p));
        }
        return arrayList;
    }

    /* renamed from: b */
    public C7363yi mo31807b() {
        return this.f26385a.mo41824b();
    }

    /* renamed from: c */
    public Bitmap mo31808c() {
        return this.f26384a.mo31333d((Rect) null, 2);
    }

    /* renamed from: d */
    public int mo31809d() {
        return 2;
    }

    /* renamed from: e */
    public Bitmap mo31810e(int i) {
        sl3 sl3;
        Bitmap c = mo31808c();
        List<sl3> l = mo31817l();
        if (l.isEmpty() || c == null) {
            return c;
        }
        Bitmap createBitmap = Bitmap.createBitmap(c.getWidth(), c.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(c, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        paint.setColor(i);
        int i2 = 1;
        if (l.size() == 2) {
            paint.setStrokeWidth(4.0f);
            sl3 = l.get(0);
        } else if (l.size() == 4 && (this.f26385a.mo41824b() == C7363yi.UPC_A || this.f26385a.mo41824b() == C7363yi.EAN_13)) {
            m39969a(canvas, paint, l.get(0), l.get(1), 2);
            sl3 = l.get(2);
            i2 = 3;
        } else {
            paint.setStrokeWidth(10.0f);
            for (sl3 next : l) {
                if (next != null) {
                    canvas.drawPoint(next.mo44403c() / 2.0f, next.mo44404d() / 2.0f, paint);
                }
            }
            return createBitmap;
        }
        m39969a(canvas, paint, sl3, l.get(i2), 2);
        return createBitmap;
    }

    /* renamed from: f */
    public byte[] mo31811f() {
        return this.f26385a.mo41826d();
    }

    /* renamed from: g */
    public ol3 mo31812g() {
        return this.f26385a;
    }

    /* renamed from: h */
    public Map<ql3, Object> mo31813h() {
        return this.f26385a.mo41827e();
    }

    /* renamed from: i */
    public sl3[] mo31814i() {
        return this.f26385a.mo41828f();
    }

    /* renamed from: j */
    public String mo31815j() {
        return this.f26385a.mo41829g();
    }

    /* renamed from: k */
    public long mo31816k() {
        return this.f26385a.mo41830h();
    }

    /* renamed from: l */
    public List<sl3> mo31817l() {
        return this.f26385a.mo41828f() == null ? Collections.emptyList() : m39970m(Arrays.asList(this.f26385a.mo41828f()), this.f26384a);
    }

    public String toString() {
        return this.f26385a.mo41829g();
    }
}
