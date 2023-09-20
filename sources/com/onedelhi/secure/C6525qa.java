package com.onedelhi.secure;

import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\u0004H\u0002R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/onedelhi/secure/qa;", "", "T", "element", "Lcom/onedelhi/secure/un4;", "a", "(Ljava/lang/Object;)V", "e", "()Ljava/lang/Object;", "b", "c", "", "d", "()Z", "isEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.qa */
public class C6525qa<T> {

    /* renamed from: a */
    public int f34038a;
    @vr2

    /* renamed from: a */
    public Object[] f34039a = new Object[16];

    /* renamed from: b */
    public int f34040b;

    /* renamed from: a */
    public final void mo43254a(@vr2 T t) {
        Object[] objArr = this.f34039a;
        int i = this.f34040b;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f34040b = length;
        if (length == this.f34038a) {
            mo43256c();
        }
    }

    /* renamed from: b */
    public final void mo43255b() {
        this.f34038a = 0;
        this.f34040b = 0;
        this.f34039a = new Object[this.f34039a.length];
    }

    /* renamed from: c */
    public final void mo43256c() {
        Object[] objArr = this.f34039a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        C7458za.m72930l1(objArr, objArr3, 0, this.f34038a, 0, 10, (Object) null);
        Object[] objArr4 = this.f34039a;
        int length2 = objArr4.length;
        int i = this.f34038a;
        C7458za.m72930l1(objArr4, objArr2, length2 - i, 0, i, 4, (Object) null);
        this.f34039a = objArr3;
        this.f34038a = 0;
        this.f34040b = length;
    }

    /* renamed from: d */
    public final boolean mo43257d() {
        return this.f34038a == this.f34040b;
    }

    @ss2
    /* renamed from: e */
    public final T mo43258e() {
        int i = this.f34038a;
        if (i == this.f34040b) {
            return null;
        }
        T[] tArr = this.f34039a;
        T t = tArr[i];
        tArr[i] = null;
        this.f34038a = (i + 1) & (tArr.length - 1);
        Objects.requireNonNull(t, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t;
    }
}
