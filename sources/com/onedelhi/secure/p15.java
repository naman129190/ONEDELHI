package com.onedelhi.secure;

import android.content.Context;
import jmjou.C7601c;
import jmjou.C7606e;

public final class p15 implements C7606e {
    @vr2

    /* renamed from: a */
    public final w12 f33436a = i22.m51739a(new C6358a(this));
    @ss2

    /* renamed from: a */
    public C7601c f33437a;

    /* renamed from: com.onedelhi.secure.p15$a */
    public static final class C6358a extends d12 implements cc1<Context> {

        /* renamed from: a */
        public final /* synthetic */ p15 f33438a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6358a(p15 p15) {
            super(0);
            this.f33438a = p15;
        }

        public Object invoke() {
            if (this.f33438a.f33437a == null) {
                return null;
            }
            return C7601c.f38776a;
        }
    }

    public void init(@ss2 C7601c cVar, @ss2 C7601c.C7602a aVar) {
        this.f33437a = cVar;
    }

    public boolean isCachingAllowed() {
        return true;
    }
}
