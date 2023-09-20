package com.onedelhi.secure;

import java.security.MessageDigest;
import java.util.Map;

public class qu0 implements ky1 {

    /* renamed from: a */
    public final int f19465a;

    /* renamed from: a */
    public final ky1 f19466a;

    /* renamed from: a */
    public final zw2 f19467a;

    /* renamed from: a */
    public final Class<?> f19468a;

    /* renamed from: a */
    public final Object f19469a;

    /* renamed from: a */
    public final Map<Class<?>, sg4<?>> f19470a;

    /* renamed from: b */
    public final int f19471b;

    /* renamed from: b */
    public final Class<?> f19472b;

    /* renamed from: c */
    public int f19473c;

    public qu0(Object obj, ky1 ky1, int i, int i2, Map<Class<?>, sg4<?>> map, Class<?> cls, Class<?> cls2, zw2 zw2) {
        this.f19469a = g43.m15509d(obj);
        this.f19466a = (ky1) g43.m15510e(ky1, "Signature must not be null");
        this.f19465a = i;
        this.f19471b = i2;
        this.f19470a = (Map) g43.m15509d(map);
        this.f19468a = (Class) g43.m15510e(cls, "Resource class must not be null");
        this.f19472b = (Class) g43.m15510e(cls2, "Transcode class must not be null");
        this.f19467a = (zw2) g43.m15509d(zw2);
    }

    /* renamed from: a */
    public void mo13311a(@mr2 MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof qu0)) {
            return false;
        }
        qu0 qu0 = (qu0) obj;
        return this.f19469a.equals(qu0.f19469a) && this.f19466a.equals(qu0.f19466a) && this.f19471b == qu0.f19471b && this.f19465a == qu0.f19465a && this.f19470a.equals(qu0.f19470a) && this.f19468a.equals(qu0.f19468a) && this.f19472b.equals(qu0.f19472b) && this.f19467a.equals(qu0.f19467a);
    }

    public int hashCode() {
        if (this.f19473c == 0) {
            int hashCode = this.f19469a.hashCode();
            this.f19473c = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f19466a.hashCode()) * 31) + this.f19465a) * 31) + this.f19471b;
            this.f19473c = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f19470a.hashCode();
            this.f19473c = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f19468a.hashCode();
            this.f19473c = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f19472b.hashCode();
            this.f19473c = hashCode5;
            this.f19473c = (hashCode5 * 31) + this.f19467a.hashCode();
        }
        return this.f19473c;
    }

    public String toString() {
        return "EngineKey{model=" + this.f19469a + ", width=" + this.f19465a + ", height=" + this.f19471b + ", resourceClass=" + this.f19468a + ", transcodeClass=" + this.f19472b + ", signature=" + this.f19466a + ", hashCode=" + this.f19473c + ", transformations=" + this.f19470a + ", options=" + this.f19467a + '}';
    }
}
