package com.onedelhi.secure;

import java.io.PrintStream;

public class c24 implements v34 {

    /* renamed from: e */
    public static final double f10084e = Double.MAX_VALUE;

    /* renamed from: a */
    public double f10085a = 0.5d;

    /* renamed from: a */
    public float f10086a;

    /* renamed from: a */
    public int f10087a = 0;

    /* renamed from: a */
    public boolean f10088a = false;

    /* renamed from: b */
    public double f10089b;

    /* renamed from: b */
    public float f10090b;

    /* renamed from: c */
    public double f10091c;

    /* renamed from: c */
    public float f10092c;

    /* renamed from: d */
    public double f10093d;

    /* renamed from: d */
    public float f10094d;

    /* renamed from: e */
    public float f10095e;

    /* renamed from: a */
    public float mo13952a() {
        return 0.0f;
    }

    /* renamed from: b */
    public float mo13953b(float f) {
        return this.f10092c;
    }

    /* renamed from: c */
    public boolean mo13954c() {
        double d = ((double) this.f10090b) - this.f10091c;
        double d2 = this.f10089b;
        double d3 = (double) this.f10092c;
        return Math.sqrt((((d3 * d3) * ((double) this.f10094d)) + ((d2 * d) * d)) / d2) <= ((double) this.f10095e);
    }

    /* renamed from: d */
    public String mo13955d(String str, float f) {
        return null;
    }

    /* renamed from: e */
    public final void mo13956e(double d) {
        double d2 = this.f10089b;
        double d3 = this.f10085a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d2 / ((double) this.f10094d)) * d) * 4.0d)) + 1.0d);
        double d4 = d / ((double) sqrt);
        int i = 0;
        while (i < sqrt) {
            float f = this.f10090b;
            double d5 = this.f10091c;
            float f2 = this.f10092c;
            double d6 = d2;
            float f3 = this.f10094d;
            double d7 = d3;
            double d8 = ((double) f2) + ((((((-d2) * (((double) f) - d5)) - (((double) f2) * d3)) / ((double) f3)) * d4) / 2.0d);
            double d9 = ((((-((((double) f) + ((d4 * d8) / 2.0d)) - d5)) * d6) - (d8 * d7)) / ((double) f3)) * d4;
            float f4 = (float) (((double) f2) + d9);
            this.f10092c = f4;
            float f5 = (float) (((double) f) + ((((double) f2) + (d9 / 2.0d)) * d4));
            this.f10090b = f5;
            int i2 = this.f10087a;
            if (i2 > 0) {
                if (f5 < 0.0f && (i2 & 1) == 1) {
                    this.f10090b = -f5;
                    this.f10092c = -f4;
                }
                float f6 = this.f10090b;
                if (f6 > 1.0f && (i2 & 2) == 2) {
                    this.f10090b = 2.0f - f6;
                    this.f10092c = -this.f10092c;
                }
            }
            i++;
            d2 = d6;
            d3 = d7;
        }
    }

    /* renamed from: f */
    public float mo13957f() {
        double d = this.f10089b;
        return ((float) (((-d) * (((double) this.f10090b) - this.f10091c)) - (this.f10085a * ((double) this.f10092c)))) / this.f10094d;
    }

    /* renamed from: g */
    public void mo13958g(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        PrintStream printStream = System.out;
        printStream.println((".(" + stackTraceElement.getFileName() + ar4.f25981a + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ") + str);
    }

    public float getInterpolation(float f) {
        mo13956e((double) (f - this.f10086a));
        this.f10086a = f;
        return this.f10090b;
    }

    /* renamed from: h */
    public void mo13960h(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.f10091c = (double) f2;
        this.f10085a = (double) f6;
        this.f10088a = false;
        this.f10090b = f;
        this.f10093d = (double) f3;
        this.f10089b = (double) f5;
        this.f10094d = f4;
        this.f10095e = f7;
        this.f10087a = i;
        this.f10086a = 0.0f;
    }
}
