package com.onedelhi.secure;

public class dj2 implements j24 {

    /* renamed from: a */
    public final int f27473a;

    /* renamed from: a */
    public final ej2 f27474a;

    /* renamed from: a */
    public final j24[] f27475a;

    public dj2(int i, j24... j24Arr) {
        this.f27473a = i;
        this.f27475a = j24Arr;
        this.f27474a = new ej2(i);
    }

    /* renamed from: a */
    public StackTraceElement[] mo34471a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f27473a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (j24 j24 : this.f27475a) {
            if (stackTraceElementArr2.length <= this.f27473a) {
                break;
            }
            stackTraceElementArr2 = j24.mo34471a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f27473a ? this.f27474a.mo34471a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
