package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.C1553b;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pf2;
import com.onedelhi.secure.ts2;

/* renamed from: com.google.android.material.circularreveal.c */
public interface C1556c extends C1553b.C1554a {

    /* renamed from: com.google.android.material.circularreveal.c$b */
    public static class C1558b implements TypeEvaluator<C1561e> {

        /* renamed from: a */
        public static final TypeEvaluator<C1561e> f8194a = new C1558b();

        /* renamed from: a */
        public final C1561e f8195a = new C1561e();

        @mr2
        /* renamed from: a */
        public C1561e evaluate(float f, @mr2 C1561e eVar, @mr2 C1561e eVar2) {
            this.f8195a.mo11975b(pf2.m60992f(eVar.f8199a, eVar2.f8199a, f), pf2.m60992f(eVar.f8200b, eVar2.f8200b, f), pf2.m60992f(eVar.f8201c, eVar2.f8201c, f));
            return this.f8195a;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$c */
    public static class C1559c extends Property<C1556c, C1561e> {

        /* renamed from: a */
        public static final Property<C1556c, C1561e> f8196a = new C1559c("circularReveal");

        public C1559c(String str) {
            super(C1561e.class, str);
        }

        @ts2
        /* renamed from: a */
        public C1561e get(@mr2 C1556c cVar) {
            return cVar.getRevealInfo();
        }

        /* renamed from: b */
        public void set(@mr2 C1556c cVar, @ts2 C1561e eVar) {
            cVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$d */
    public static class C1560d extends Property<C1556c, Integer> {

        /* renamed from: a */
        public static final Property<C1556c, Integer> f8197a = new C1560d("circularRevealScrimColor");

        public C1560d(String str) {
            super(Integer.class, str);
        }

        @mr2
        /* renamed from: a */
        public Integer get(@mr2 C1556c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(@mr2 C1556c cVar, @mr2 Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$e */
    public static class C1561e {

        /* renamed from: d */
        public static final float f8198d = Float.MAX_VALUE;

        /* renamed from: a */
        public float f8199a;

        /* renamed from: b */
        public float f8200b;

        /* renamed from: c */
        public float f8201c;

        public C1561e() {
        }

        public C1561e(float f, float f2, float f3) {
            this.f8199a = f;
            this.f8200b = f2;
            this.f8201c = f3;
        }

        public C1561e(@mr2 C1561e eVar) {
            this(eVar.f8199a, eVar.f8200b, eVar.f8201c);
        }

        /* renamed from: a */
        public boolean mo11974a() {
            return this.f8201c == Float.MAX_VALUE;
        }

        /* renamed from: b */
        public void mo11975b(float f, float f2, float f3) {
            this.f8199a = f;
            this.f8200b = f2;
            this.f8201c = f3;
        }

        /* renamed from: c */
        public void mo11976c(@mr2 C1561e eVar) {
            mo11975b(eVar.f8199a, eVar.f8200b, eVar.f8201c);
        }
    }

    /* renamed from: c */
    void mo11933c();

    /* renamed from: d */
    void mo11934d();

    void draw(Canvas canvas);

    @ts2
    Drawable getCircularRevealOverlayDrawable();

    @d10
    int getCircularRevealScrimColor();

    @ts2
    C1561e getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(@ts2 Drawable drawable);

    void setCircularRevealScrimColor(@d10 int i);

    void setRevealInfo(@ts2 C1561e eVar);
}
