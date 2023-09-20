package com.onedelhi.secure;

import com.onedelhi.secure.o63;
import java.lang.annotation.Annotation;

/* renamed from: com.onedelhi.secure.qb */
public final class C6526qb {

    /* renamed from: a */
    public int f34053a;

    /* renamed from: a */
    public o63.C6247a f34054a = o63.C6247a.DEFAULT;

    /* renamed from: com.onedelhi.secure.qb$a */
    public static final class C6527a implements o63 {

        /* renamed from: C0 */
        public final int f34055C0;

        /* renamed from: a */
        public final o63.C6247a f34056a;

        public C6527a(int i, o63.C6247a aVar) {
            this.f34055C0 = i;
            this.f34056a = aVar;
        }

        public Class<? extends Annotation> annotationType() {
            return o63.class;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o63)) {
                return false;
            }
            o63 o63 = (o63) obj;
            return this.f34055C0 == o63.tag() && this.f34056a.equals(o63.intEncoding());
        }

        public int hashCode() {
            return (this.f34055C0 ^ 14552422) + (this.f34056a.hashCode() ^ 2041407134);
        }

        public o63.C6247a intEncoding() {
            return this.f34056a;
        }

        public int tag() {
            return this.f34055C0;
        }

        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.f34055C0 + "intEncoding=" + this.f34056a + ')';
        }
    }

    /* renamed from: b */
    public static C6526qb m62358b() {
        return new C6526qb();
    }

    /* renamed from: a */
    public o63 mo43284a() {
        return new C6527a(this.f34053a, this.f34054a);
    }

    /* renamed from: c */
    public C6526qb mo43285c(o63.C6247a aVar) {
        this.f34054a = aVar;
        return this;
    }

    /* renamed from: d */
    public C6526qb mo43286d(int i) {
        this.f34053a = i;
        return this;
    }
}
