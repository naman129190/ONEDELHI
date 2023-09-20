package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0006\u001a\u00020\u00052\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/ec4;", "", "Lcom/onedelhi/secure/sb4;", "element", "value", "Lcom/onedelhi/secure/un4;", "a", "Lcom/onedelhi/secure/b90;", "context", "b", "", "n", "<init>", "(Lcom/onedelhi/secure/b90;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class ec4 {

    /* renamed from: a */
    public int f27853a;
    @rw1
    @vr2

    /* renamed from: a */
    public final b90 f27854a;
    @vr2

    /* renamed from: a */
    public final sb4<Object>[] f27855a;
    @vr2

    /* renamed from: a */
    public final Object[] f27856a;

    public ec4(@vr2 b90 b90, int i) {
        this.f27854a = b90;
        this.f27856a = new Object[i];
        this.f27855a = new sb4[i];
    }

    /* renamed from: a */
    public final void mo35121a(@vr2 sb4<?> sb4, @ss2 Object obj) {
        Object[] objArr = this.f27856a;
        int i = this.f27853a;
        objArr[i] = obj;
        sb4<Object>[] sb4Arr = this.f27855a;
        this.f27853a = i + 1;
        sb4Arr[i] = sb4;
    }

    /* renamed from: b */
    public final void mo35122b(@vr2 b90 b90) {
        int length = this.f27855a.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                sb4<Object> sb4 = this.f27855a[length];
                jt1.m53774m(sb4);
                sb4.mo37900M(b90, this.f27856a[length]);
                if (i >= 0) {
                    length = i;
                } else {
                    return;
                }
            }
        }
    }
}
