package com.onedelhi.secure;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0015B\u001b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016¨\u0006\u0016"}, d2 = {"Lcom/onedelhi/secure/jx4;", "Ljava/lang/reflect/WildcardType;", "Lcom/onedelhi/secure/kj4;", "", "Ljava/lang/reflect/Type;", "getUpperBounds", "()[Ljava/lang/reflect/Type;", "getLowerBounds", "", "getTypeName", "", "other", "", "equals", "", "hashCode", "toString", "upperBound", "lowerBound", "<init>", "(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
@ly0
public final class jx4 implements WildcardType, kj4 {
    @vr2

    /* renamed from: a */
    public static final C5854a f30997a = new C5854a((wg0) null);
    @vr2

    /* renamed from: a */
    public static final jx4 f30998a = new jx4((Type) null, (Type) null);
    @ss2

    /* renamed from: a */
    public final Type f30999a;
    @ss2

    /* renamed from: b */
    public final Type f31000b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/jx4$a;", "", "Lcom/onedelhi/secure/jx4;", "STAR", "Lcom/onedelhi/secure/jx4;", "a", "()Lcom/onedelhi/secure/jx4;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.jx4$a */
    public static final class C5854a {
        public C5854a() {
        }

        public /* synthetic */ C5854a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final jx4 mo38926a() {
            return jx4.f30998a;
        }
    }

    public jx4(@ss2 Type type, @ss2 Type type2) {
        this.f30999a = type;
        this.f31000b = type2;
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
        }
    }

    @vr2
    public Type[] getLowerBounds() {
        Type type = this.f31000b;
        if (type == null) {
            return new Type[0];
        }
        return new Type[]{type};
    }

    @vr2
    public String getTypeName() {
        StringBuilder sb;
        Type type;
        if (this.f31000b != null) {
            sb = new StringBuilder();
            sb.append("? super ");
            type = this.f31000b;
        } else {
            Type type2 = this.f30999a;
            if (type2 == null || jt1.m53768g(type2, Object.class)) {
                return "?";
            }
            sb = new StringBuilder();
            sb.append("? extends ");
            type = this.f30999a;
        }
        sb.append(sk4.m64693j(type));
        return sb.toString();
    }

    @vr2
    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f30999a;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @vr2
    public String toString() {
        return getTypeName();
    }
}
