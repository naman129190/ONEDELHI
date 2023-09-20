package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.onedelhi.secure.sn0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class db4 extends C2861mj {

    /* renamed from: a */
    public final cb4 f10668a;

    /* renamed from: a */
    public final ga2<String> f10669a = new ga2<>();

    /* renamed from: a */
    public final la2 f10670a;
    @ts2

    /* renamed from: a */
    public C2760lj<Integer, Integer> f10671a;

    /* renamed from: a */
    public final StringBuilder f10672a = new StringBuilder(2);

    /* renamed from: a */
    public final Map<p91, List<z60>> f10673a = new HashMap();
    @ts2

    /* renamed from: b */
    public C2760lj<Integer, Integer> f10674b;

    /* renamed from: b */
    public final qa2 f10675b;

    /* renamed from: c */
    public final Matrix f10676c = new Matrix();
    @ts2

    /* renamed from: c */
    public C2760lj<Integer, Integer> f10677c;
    @ts2

    /* renamed from: d */
    public C2760lj<Integer, Integer> f10678d;

    /* renamed from: e */
    public final RectF f10679e = new RectF();
    @ts2

    /* renamed from: e */
    public C2760lj<Float, Float> f10680e;

    /* renamed from: f */
    public final Paint f10681f = new C1960a(1);
    @ts2

    /* renamed from: f */
    public C2760lj<Float, Float> f10682f;

    /* renamed from: g */
    public final Paint f10683g = new C1961b(1);
    @ts2

    /* renamed from: g */
    public C2760lj<Float, Float> f10684g;
    @ts2

    /* renamed from: h */
    public C2760lj<Float, Float> f10685h;
    @ts2

    /* renamed from: i */
    public C2760lj<Float, Float> f10686i;
    @ts2

    /* renamed from: j */
    public C2760lj<Float, Float> f10687j;

    /* renamed from: com.onedelhi.secure.db4$a */
    public class C1960a extends Paint {
        public C1960a(int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: com.onedelhi.secure.db4$b */
    public class C1961b extends Paint {
        public C1961b(int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* renamed from: com.onedelhi.secure.db4$c */
    public static /* synthetic */ class C1962c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10690a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.onedelhi.secure.sn0$a[] r0 = com.onedelhi.secure.sn0.C3528a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10690a = r0
                com.onedelhi.secure.sn0$a r1 = com.onedelhi.secure.sn0.C3528a.LEFT_ALIGN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10690a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.sn0$a r1 = com.onedelhi.secure.sn0.C3528a.RIGHT_ALIGN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10690a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.sn0$a r1 = com.onedelhi.secure.sn0.C3528a.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.db4.C1962c.<clinit>():void");
        }
    }

    public db4(qa2 qa2, m12 m12) {
        super(qa2, m12);
        C2475j6 j6Var;
        C2475j6 j6Var2;
        C2398i6 i6Var;
        C2398i6 i6Var2;
        this.f10675b = qa2;
        this.f10670a = m12.mo20013a();
        cb4 d = m12.mo20029q().mo17597a();
        this.f10668a = d;
        d.mo19638a(this);
        mo20432j(d);
        C3566t6 r = m12.mo20030r();
        if (!(r == null || (i6Var2 = r.f20662a) == null)) {
            C2760lj<Integer, Integer> a = i6Var2.mo17597a();
            this.f10671a = a;
            a.mo19638a(this);
            mo20432j(this.f10671a);
        }
        if (!(r == null || (i6Var = r.f20664b) == null)) {
            C2760lj<Integer, Integer> a2 = i6Var.mo17597a();
            this.f10677c = a2;
            a2.mo19638a(this);
            mo20432j(this.f10677c);
        }
        if (!(r == null || (j6Var2 = r.f20663a) == null)) {
            C2760lj<Float, Float> a3 = j6Var2.mo17597a();
            this.f10680e = a3;
            a3.mo19638a(this);
            mo20432j(this.f10680e);
        }
        if (r != null && (j6Var = r.f20665b) != null) {
            C2760lj<Float, Float> a4 = j6Var.mo17597a();
            this.f10684g = a4;
            a4.mo19638a(this);
            mo20432j(this.f10684g);
        }
    }

    /* renamed from: K */
    public final void mo14577K(sn0.C3528a aVar, Canvas canvas, float f) {
        float f2;
        int i = C1962c.f10690a[aVar.ordinal()];
        if (i == 2) {
            f2 = -f;
        } else if (i == 3) {
            f2 = (-f) / 2.0f;
        } else {
            return;
        }
        canvas.translate(f2, 0.0f);
    }

    /* renamed from: L */
    public final String mo14578L(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!mo14590X(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = (long) codePointAt;
        if (this.f10669a.mo16413d(j)) {
            return this.f10669a.mo16417h(j);
        }
        this.f10672a.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.f10672a.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.f10672a.toString();
        this.f10669a.mo16423n(j, sb);
        return sb;
    }

    /* renamed from: M */
    public final void mo14579M(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    /* renamed from: N */
    public final void mo14580N(p91 p91, Matrix matrix, float f, sn0 sn0, Canvas canvas) {
        Paint paint;
        List<z60> U = mo14587U(p91);
        for (int i = 0; i < U.size(); i++) {
            Path e = U.get(i).mo17060e();
            e.computeBounds(this.f10679e, false);
            this.f10676c.set(matrix);
            this.f10676c.preTranslate(0.0f, (-sn0.f20457c) * yq4.m32602e());
            this.f10676c.preScale(f, f);
            e.transform(this.f10676c);
            if (sn0.f20453a) {
                mo14583Q(e, this.f10681f, canvas);
                paint = this.f10683g;
            } else {
                mo14583Q(e, this.f10683g, canvas);
                paint = this.f10681f;
            }
            mo14583Q(e, paint, canvas);
        }
    }

    /* renamed from: O */
    public final void mo14581O(String str, sn0 sn0, Canvas canvas) {
        Paint paint;
        if (sn0.f20453a) {
            mo14579M(str, this.f10681f, canvas);
            paint = this.f10683g;
        } else {
            mo14579M(str, this.f10683g, canvas);
            paint = this.f10681f;
        }
        mo14579M(str, paint, canvas);
    }

    /* renamed from: P */
    public final void mo14582P(String str, sn0 sn0, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String L = mo14578L(str, i);
            i += L.length();
            mo14581O(L, sn0, canvas);
            float measureText = this.f10681f.measureText(L, 0, 1);
            float f2 = ((float) sn0.f20450a) / 10.0f;
            C2760lj<Float, Float> ljVar = this.f10685h;
            if (ljVar != null || (ljVar = this.f10684g) != null) {
                f2 += ljVar.mo15565h().floatValue();
            }
            canvas.translate(measureText + (f2 * f), 0.0f);
        }
    }

    /* renamed from: Q */
    public final void mo14583Q(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: R */
    public final void mo14584R(String str, sn0 sn0, Matrix matrix, m91 m91, Canvas canvas, float f, float f2) {
        for (int i = 0; i < str.length(); i++) {
            p91 h = this.f10670a.mo19374c().mo18849h(p91.m24535e(str.charAt(i), m91.mo20186b(), m91.mo20188d()));
            if (h != null) {
                mo14580N(h, matrix, f2, sn0, canvas);
                float d = ((float) h.mo22362d()) * f2 * yq4.m32602e() * f;
                float f3 = ((float) sn0.f20450a) / 10.0f;
                C2760lj<Float, Float> ljVar = this.f10685h;
                if (!(ljVar == null && (ljVar = this.f10684g) == null)) {
                    f3 += ljVar.mo15565h().floatValue();
                }
                canvas.translate(d + (f3 * f), 0.0f);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        r0 = r8.f10686i;
     */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14585S(com.onedelhi.secure.sn0 r18, android.graphics.Matrix r19, com.onedelhi.secure.m91 r20, android.graphics.Canvas r21) {
        /*
            r17 = this;
            r8 = r17
            r9 = r18
            r10 = r21
            com.onedelhi.secure.lj<java.lang.Float, java.lang.Float> r0 = r8.f10687j
            if (r0 == 0) goto L_0x0015
        L_0x000a:
            java.lang.Object r0 = r0.mo15565h()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L_0x001c
        L_0x0015:
            com.onedelhi.secure.lj<java.lang.Float, java.lang.Float> r0 = r8.f10686i
            if (r0 == 0) goto L_0x001a
            goto L_0x000a
        L_0x001a:
            float r0 = r9.f20449a
        L_0x001c:
            r1 = 1120403456(0x42c80000, float:100.0)
            float r11 = r0 / r1
            float r12 = com.onedelhi.secure.yq4.m32604g(r19)
            java.lang.String r0 = r9.f20452a
            float r1 = r9.f20454b
            float r2 = com.onedelhi.secure.yq4.m32602e()
            float r13 = r1 * r2
            java.util.List r14 = r8.mo14589W(r0)
            int r15 = r14.size()
            r0 = 0
            r7 = 0
        L_0x0038:
            if (r7 >= r15) goto L_0x0076
            java.lang.Object r0 = r14.get(r7)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            r6 = r20
            float r0 = r8.mo14588V(r1, r6, r11, r12)
            r21.save()
            com.onedelhi.secure.sn0$a r2 = r9.f20451a
            r8.mo14577K(r2, r10, r0)
            int r0 = r15 + -1
            float r0 = (float) r0
            float r0 = r0 * r13
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r2 = (float) r7
            float r2 = r2 * r13
            float r2 = r2 - r0
            r0 = 0
            r10.translate(r0, r2)
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r12
            r16 = r7
            r7 = r11
            r0.mo14584R(r1, r2, r3, r4, r5, r6, r7)
            r21.restore()
            int r7 = r16 + 1
            goto L_0x0038
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.db4.mo14585S(com.onedelhi.secure.sn0, android.graphics.Matrix, com.onedelhi.secure.m91, android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        r9 = r7.f10686i;
     */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14586T(com.onedelhi.secure.sn0 r8, com.onedelhi.secure.m91 r9, android.graphics.Matrix r10, android.graphics.Canvas r11) {
        /*
            r7 = this;
            float r0 = com.onedelhi.secure.yq4.m32604g(r10)
            com.onedelhi.secure.qa2 r1 = r7.f10675b
            java.lang.String r2 = r9.mo20186b()
            java.lang.String r9 = r9.mo20188d()
            android.graphics.Typeface r9 = r1.mo22977K(r2, r9)
            if (r9 != 0) goto L_0x0015
            return
        L_0x0015:
            java.lang.String r1 = r8.f20452a
            com.onedelhi.secure.qa2 r2 = r7.f10675b
            com.onedelhi.secure.va4 r2 = r2.mo22976J()
            if (r2 == 0) goto L_0x0023
            java.lang.String r1 = r2.mo25914b(r1)
        L_0x0023:
            android.graphics.Paint r2 = r7.f10681f
            r2.setTypeface(r9)
            com.onedelhi.secure.lj<java.lang.Float, java.lang.Float> r9 = r7.f10687j
            if (r9 == 0) goto L_0x0037
        L_0x002c:
            java.lang.Object r9 = r9.mo15565h()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            goto L_0x003e
        L_0x0037:
            com.onedelhi.secure.lj<java.lang.Float, java.lang.Float> r9 = r7.f10686i
            if (r9 == 0) goto L_0x003c
            goto L_0x002c
        L_0x003c:
            float r9 = r8.f20449a
        L_0x003e:
            android.graphics.Paint r2 = r7.f10681f
            float r3 = com.onedelhi.secure.yq4.m32602e()
            float r9 = r9 * r3
            r2.setTextSize(r9)
            android.graphics.Paint r9 = r7.f10683g
            android.graphics.Paint r2 = r7.f10681f
            android.graphics.Typeface r2 = r2.getTypeface()
            r9.setTypeface(r2)
            android.graphics.Paint r9 = r7.f10683g
            android.graphics.Paint r2 = r7.f10681f
            float r2 = r2.getTextSize()
            r9.setTextSize(r2)
            float r9 = r8.f20454b
            float r2 = com.onedelhi.secure.yq4.m32602e()
            float r9 = r9 * r2
            java.util.List r1 = r7.mo14589W(r1)
            int r2 = r1.size()
            r3 = 0
        L_0x0070:
            if (r3 >= r2) goto L_0x009c
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            android.graphics.Paint r5 = r7.f10683g
            float r5 = r5.measureText(r4)
            com.onedelhi.secure.sn0$a r6 = r8.f20451a
            r7.mo14577K(r6, r11, r5)
            int r5 = r2 + -1
            float r5 = (float) r5
            float r5 = r5 * r9
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r6 = (float) r3
            float r6 = r6 * r9
            float r6 = r6 - r5
            r5 = 0
            r11.translate(r5, r6)
            r7.mo14582P(r4, r8, r11, r0)
            r11.setMatrix(r10)
            int r3 = r3 + 1
            goto L_0x0070
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.db4.mo14586T(com.onedelhi.secure.sn0, com.onedelhi.secure.m91, android.graphics.Matrix, android.graphics.Canvas):void");
    }

    /* renamed from: U */
    public final List<z60> mo14587U(p91 p91) {
        if (this.f10673a.containsKey(p91)) {
            return this.f10673a.get(p91);
        }
        List<bx3> a = p91.mo22359a();
        int size = a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new z60(this.f10675b, this, a.get(i)));
        }
        this.f10673a.put(p91, arrayList);
        return arrayList;
    }

    /* renamed from: V */
    public final float mo14588V(String str, m91 m91, float f, float f2) {
        float f3 = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            p91 h = this.f10670a.mo19374c().mo18849h(p91.m24535e(str.charAt(i), m91.mo20186b(), m91.mo20188d()));
            if (h != null) {
                f3 = (float) (((double) f3) + (h.mo22362d() * ((double) f) * ((double) yq4.m32602e()) * ((double) f2)));
            }
        }
        return f3;
    }

    /* renamed from: W */
    public final List<String> mo14589W(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    /* renamed from: X */
    public final boolean mo14590X(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 19;
    }

    /* renamed from: a */
    public <T> void mo12684a(T t, @ts2 hb2<T> hb2) {
        C2760lj ljVar;
        super.mo12684a(t, hb2);
        if (t == ab2.f8958a) {
            C2760lj<Integer, Integer> ljVar2 = this.f10674b;
            if (ljVar2 != null) {
                mo20427D(ljVar2);
            }
            if (hb2 == null) {
                this.f10674b = null;
                return;
            }
            es4 es4 = new es4(hb2);
            this.f10674b = es4;
            es4.mo19638a(this);
            ljVar = this.f10674b;
        } else if (t == ab2.f8962b) {
            C2760lj<Integer, Integer> ljVar3 = this.f10678d;
            if (ljVar3 != null) {
                mo20427D(ljVar3);
            }
            if (hb2 == null) {
                this.f10678d = null;
                return;
            }
            es4 es42 = new es4(hb2);
            this.f10678d = es42;
            es42.mo19638a(this);
            ljVar = this.f10678d;
        } else if (t == ab2.f8970e) {
            C2760lj<Float, Float> ljVar4 = this.f10682f;
            if (ljVar4 != null) {
                mo20427D(ljVar4);
            }
            if (hb2 == null) {
                this.f10682f = null;
                return;
            }
            es4 es43 = new es4(hb2);
            this.f10682f = es43;
            es43.mo19638a(this);
            ljVar = this.f10682f;
        } else if (t == ab2.f8971f) {
            C2760lj<Float, Float> ljVar5 = this.f10685h;
            if (ljVar5 != null) {
                mo20427D(ljVar5);
            }
            if (hb2 == null) {
                this.f10685h = null;
                return;
            }
            es4 es44 = new es4(hb2);
            this.f10685h = es44;
            es44.mo19638a(this);
            ljVar = this.f10685h;
        } else if (t == ab2.f8983r) {
            C2760lj<Float, Float> ljVar6 = this.f10687j;
            if (ljVar6 != null) {
                mo20427D(ljVar6);
            }
            if (hb2 == null) {
                this.f10687j = null;
                return;
            }
            es4 es45 = new es4(hb2);
            this.f10687j = es45;
            es45.mo19638a(this);
            ljVar = this.f10687j;
        } else {
            return;
        }
        mo20432j(ljVar);
    }

    /* renamed from: b */
    public void mo12685b(RectF rectF, Matrix matrix, boolean z) {
        super.mo12685b(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, (float) this.f10670a.mo19373b().width(), (float) this.f10670a.mo19373b().height());
    }

    /* renamed from: u */
    public void mo12686u(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.f10675b.mo22970D0()) {
            canvas.setMatrix(matrix);
        }
        sn0 sn0 = (sn0) this.f10668a.mo15565h();
        m91 m91 = this.f10670a.mo19378g().get(sn0.f20456b);
        if (m91 == null) {
            canvas.restore();
            return;
        }
        C2760lj<Integer, Integer> ljVar = this.f10674b;
        if (ljVar == null && (ljVar = this.f10671a) == null) {
            this.f10681f.setColor(sn0.f20455b);
        } else {
            this.f10681f.setColor(ljVar.mo15565h().intValue());
        }
        C2760lj<Integer, Integer> ljVar2 = this.f10678d;
        if (ljVar2 == null && (ljVar2 = this.f10677c) == null) {
            this.f10683g.setColor(sn0.f20458c);
        } else {
            this.f10683g.setColor(ljVar2.mo15565h().intValue());
        }
        int intValue = ((this.f16136a.mo23863h() == null ? 100 : this.f16136a.mo23863h().mo15565h().intValue()) * 255) / 100;
        this.f10681f.setAlpha(intValue);
        this.f10683g.setAlpha(intValue);
        C2760lj<Float, Float> ljVar3 = this.f10682f;
        if (ljVar3 == null && (ljVar3 = this.f10680e) == null) {
            this.f10683g.setStrokeWidth(sn0.f20459d * yq4.m32602e() * yq4.m32604g(matrix));
        } else {
            this.f10683g.setStrokeWidth(ljVar3.mo15565h().floatValue());
        }
        if (this.f10675b.mo22970D0()) {
            mo14585S(sn0, matrix, m91, canvas);
        } else {
            mo14586T(sn0, m91, matrix, canvas);
        }
        canvas.restore();
    }
}
