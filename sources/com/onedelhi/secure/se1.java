package com.onedelhi.secure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import okhttp3.HttpUrl;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016¨\u0006\u0011"}, d2 = {"Lcom/onedelhi/secure/se1;", "Ljava/lang/reflect/GenericArrayType;", "Lcom/onedelhi/secure/kj4;", "Ljava/lang/reflect/Type;", "getGenericComponentType", "", "getTypeName", "", "other", "", "equals", "", "hashCode", "toString", "elementType", "<init>", "(Ljava/lang/reflect/Type;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
@ly0
public final class se1 implements GenericArrayType, kj4 {
    @vr2

    /* renamed from: a */
    public final Type f35008a;

    public se1(@vr2 Type type) {
        jt1.m53777p(type, "elementType");
        this.f35008a = type;
    }

    public boolean equals(@ss2 Object obj) {
        return (obj instanceof GenericArrayType) && jt1.m53768g(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @vr2
    public Type getGenericComponentType() {
        return this.f35008a;
    }

    @vr2
    public String getTypeName() {
        return sk4.m64693j(this.f35008a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    @vr2
    public String toString() {
        return getTypeName();
    }
}
