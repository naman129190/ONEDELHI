package com.onedelhi.secure;

import com.onedelhi.secure.e56;
import com.onedelhi.secure.y46;

public class y46<MessageType extends e56<MessageType, BuilderType>, BuilderType extends y46<MessageType, BuilderType>> extends e06<MessageType, BuilderType> {

    /* renamed from: a */
    public final e56 f22878a;

    /* renamed from: b */
    public e56 f22879b;

    /* renamed from: b */
    public boolean f22880b = false;

    public y46(MessageType messagetype) {
        this.f22878a = messagetype;
        this.f22879b = (e56) messagetype.mo15053i(4, (Object) null, (Object) null);
    }

    /* renamed from: i */
    public static final void m31940i(e56 e56, e56 e562) {
        db6.m13046a().mo14594b(e56.getClass()).mo20299g(e56, e562);
    }

    /* renamed from: a */
    public final /* synthetic */ i96 mo15049a() {
        return this.f22878a;
    }

    /* renamed from: d */
    public final /* synthetic */ e06 mo14970d(i06 i06) {
        mo27198f((e56) i06);
        return this;
    }

    /* renamed from: e */
    public final y46 clone() {
        y46 y46 = (y46) this.f22878a.mo15053i(5, (Object) null, (Object) null);
        y46.mo27198f(mo15901l3());
        return y46;
    }

    /* renamed from: f */
    public final y46 mo27198f(e56 e56) {
        if (this.f22880b) {
            mo27200h();
            this.f22880b = false;
        }
        m31940i(this.f22879b, e56);
        return this;
    }

    /* renamed from: g */
    public MessageType mo15901l3() {
        if (this.f22880b) {
            return this.f22879b;
        }
        e56 e56 = this.f22879b;
        db6.m13046a().mo14594b(e56.getClass()).mo20295c(e56);
        this.f22880b = true;
        return this.f22879b;
    }

    /* renamed from: h */
    public void mo27200h() {
        e56 e56 = (e56) this.f22879b.mo15053i(4, (Object) null, (Object) null);
        m31940i(e56, this.f22879b);
        this.f22879b = e56;
    }
}
