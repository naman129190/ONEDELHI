package com.onedelhi.secure;

import java.security.MessageDigest;

public final class ow2<T> {

    /* renamed from: b */
    public static final C3097b<Object> f18139b = new C3096a();

    /* renamed from: a */
    public final C3097b<T> f18140a;

    /* renamed from: a */
    public final T f18141a;

    /* renamed from: a */
    public final String f18142a;

    /* renamed from: a */
    public volatile byte[] f18143a;

    /* renamed from: com.onedelhi.secure.ow2$a */
    public class C3096a implements C3097b<Object> {
        /* renamed from: a */
        public void mo14843a(@mr2 byte[] bArr, @mr2 Object obj, @mr2 MessageDigest messageDigest) {
        }
    }

    /* renamed from: com.onedelhi.secure.ow2$b */
    public interface C3097b<T> {
        /* renamed from: a */
        void mo14843a(@mr2 byte[] bArr, @mr2 T t, @mr2 MessageDigest messageDigest);
    }

    public ow2(@mr2 String str, @ts2 T t, @mr2 C3097b<T> bVar) {
        this.f18142a = g43.m15507b(str);
        this.f18141a = t;
        this.f18140a = (C3097b) g43.m15509d(bVar);
    }

    @mr2
    /* renamed from: a */
    public static <T> ow2<T> m24131a(@mr2 String str, @mr2 C3097b<T> bVar) {
        return new ow2<>(str, (Object) null, bVar);
    }

    @mr2
    /* renamed from: b */
    public static <T> ow2<T> m24132b(@mr2 String str, @ts2 T t, @mr2 C3097b<T> bVar) {
        return new ow2<>(str, t, bVar);
    }

    @mr2
    /* renamed from: c */
    public static <T> C3097b<T> m24133c() {
        return f18139b;
    }

    @mr2
    /* renamed from: f */
    public static <T> ow2<T> m24134f(@mr2 String str) {
        return new ow2<>(str, (Object) null, m24133c());
    }

    @mr2
    /* renamed from: g */
    public static <T> ow2<T> m24135g(@mr2 String str, @mr2 T t) {
        return new ow2<>(str, t, m24133c());
    }

    @ts2
    /* renamed from: d */
    public T mo22110d() {
        return this.f18141a;
    }

    @mr2
    /* renamed from: e */
    public final byte[] mo22111e() {
        if (this.f18143a == null) {
            this.f18143a = this.f18142a.getBytes(ky1.f15108a);
        }
        return this.f18143a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ow2) {
            return this.f18142a.equals(((ow2) obj).f18142a);
        }
        return false;
    }

    /* renamed from: h */
    public void mo22113h(@mr2 T t, @mr2 MessageDigest messageDigest) {
        this.f18140a.mo14843a(mo22111e(), t, messageDigest);
    }

    public int hashCode() {
        return this.f18142a.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f18142a + '\'' + '}';
    }
}
