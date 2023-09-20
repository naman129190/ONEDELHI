package com.onedelhi.secure;

import androidx.lifecycle.C0709m;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\"\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/nq1;", "Landroidx/lifecycle/m$b;", "Lcom/onedelhi/secure/au4;", "T", "Ljava/lang/Class;", "modelClass", "Lcom/onedelhi/secure/jb0;", "extras", "a", "(Ljava/lang/Class;Lcom/onedelhi/secure/jb0;)Lcom/onedelhi/secure/au4;", "", "Lcom/onedelhi/secure/cu4;", "initializers", "<init>", "([Lcom/onedelhi/secure/cu4;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
public final class nq1 implements C0709m.C0713b {
    @vr2

    /* renamed from: a */
    public final cu4<?>[] f17529a;

    public nq1(@vr2 cu4<?>... cu4Arr) {
        jt1.m53777p(cu4Arr, "initializers");
        this.f17529a = cu4Arr;
    }

    @vr2
    /* renamed from: a */
    public <T extends au4> T mo4943a(@vr2 Class<T> cls, @vr2 jb0 jb0) {
        jt1.m53777p(cls, "modelClass");
        jt1.m53777p(jb0, "extras");
        T t = null;
        for (cu4<?> cu4 : this.f17529a) {
            if (jt1.m53768g(cu4.mo14385a(), cls)) {
                T X = cu4.mo14386b().mo17094X(jb0);
                t = X instanceof au4 ? (au4) X : null;
            }
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }

    /* renamed from: b */
    public /* synthetic */ au4 mo4944b(Class cls) {
        return eu4.m14373a(this, cls);
    }
}
