package com.onedelhi.secure;

import com.onedelhi.secure.av4;
import com.onedelhi.secure.oh4;

public abstract class oh4<CHILD extends oh4<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a */
    public kh4<? super TranscodeType> f17966a = fr2.m15245c();

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (oh4) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @mr2
    /* renamed from: b */
    public final CHILD mo21934b() {
        return mo21939f(fr2.m15245c());
    }

    /* renamed from: c */
    public final kh4<? super TranscodeType> mo21935c() {
        return this.f17966a;
    }

    /* renamed from: d */
    public final CHILD mo21937d() {
        return this;
    }

    @mr2
    /* renamed from: e */
    public final CHILD mo21938e(int i) {
        return mo21939f(new ft4(i));
    }

    @mr2
    /* renamed from: f */
    public final CHILD mo21939f(@mr2 kh4<? super TranscodeType> kh4) {
        this.f17966a = (kh4) g43.m15509d(kh4);
        return mo21937d();
    }

    @mr2
    /* renamed from: g */
    public final CHILD mo21940g(@mr2 av4.C1736a aVar) {
        return mo21939f(new tu4(aVar));
    }
}
