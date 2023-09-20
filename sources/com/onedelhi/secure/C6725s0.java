package com.onedelhi.secure;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H$J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0007H\u0004J\b\u0010\r\u001a\u00020\u0003H\u0002¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/s0;", "T", "", "", "hasNext", "next", "()Ljava/lang/Object;", "Lcom/onedelhi/secure/un4;", "a", "value", "d", "(Ljava/lang/Object;)V", "b", "f", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.s0 */
public abstract class C6725s0<T> implements Iterator<T>, nx1 {
    @vr2

    /* renamed from: a */
    public b34 f34813a = b34.NotReady;
    @ss2

    /* renamed from: a */
    public T f34814a;

    @ii2(mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.s0$a */
    public /* synthetic */ class C6726a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34815a;

        static {
            int[] iArr = new int[b34.values().length];
            iArr[b34.Done.ordinal()] = 1;
            iArr[b34.Ready.ordinal()] = 2;
            f34815a = iArr;
        }
    }

    /* renamed from: a */
    public abstract void mo38786a();

    /* renamed from: b */
    public final void mo44120b() {
        this.f34813a = b34.Done;
    }

    /* renamed from: d */
    public final void mo44121d(T t) {
        this.f34814a = t;
        this.f34813a = b34.Ready;
    }

    /* renamed from: f */
    public final boolean mo44122f() {
        this.f34813a = b34.Failed;
        mo38786a();
        return this.f34813a == b34.Ready;
    }

    public boolean hasNext() {
        b34 b34 = this.f34813a;
        if (b34 != b34.Failed) {
            int i = C6726a.f34815a[b34.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return mo44122f();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public T next() {
        if (hasNext()) {
            this.f34813a = b34.NotReady;
            return this.f34814a;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
