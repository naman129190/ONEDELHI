package com.onedelhi.secure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016¨\u0006\u0019"}, d2 = {"Lcom/onedelhi/secure/jy2;", "Ljava/lang/reflect/ParameterizedType;", "Lcom/onedelhi/secure/kj4;", "Ljava/lang/reflect/Type;", "getRawType", "getOwnerType", "", "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "", "getTypeName", "", "other", "", "equals", "", "hashCode", "toString", "Ljava/lang/Class;", "rawType", "ownerType", "", "typeArguments", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/List;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
@ly0
public final class jy2 implements ParameterizedType, kj4 {
    @vr2

    /* renamed from: a */
    public final Class<?> f31006a;
    @ss2

    /* renamed from: a */
    public final Type f31007a;
    @vr2

    /* renamed from: a */
    public final Type[] f31008a;

    @ii2(mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.jy2$a */
    public /* synthetic */ class C5855a extends hd1 implements ec1<Type, String> {

        /* renamed from: a */
        public static final C5855a f31009a = new C5855a();

        public C5855a() {
            super(1, sk4.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @vr2
        /* renamed from: G0 */
        public final String mo17094X(@vr2 Type type) {
            jt1.m53777p(type, "p0");
            return sk4.m64693j(type);
        }
    }

    public jy2(@vr2 Class<?> cls, @ss2 Type type, @vr2 List<? extends Type> list) {
        jt1.m53777p(cls, "rawType");
        jt1.m53777p(list, "typeArguments");
        this.f31006a = cls;
        this.f31007a = type;
        Object[] array = list.toArray(new Type[0]);
        jt1.m53775n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f31008a = (Type[]) array;
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return jt1.m53768g(this.f31006a, parameterizedType.getRawType()) && jt1.m53768g(this.f31007a, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }
    }

    @vr2
    public Type[] getActualTypeArguments() {
        return this.f31008a;
    }

    @ss2
    public Type getOwnerType() {
        return this.f31007a;
    }

    @vr2
    public Type getRawType() {
        return this.f31006a;
    }

    @vr2
    public String getTypeName() {
        String str;
        StringBuilder sb = new StringBuilder();
        Type type = this.f31007a;
        if (type != null) {
            sb.append(sk4.m64693j(type));
            sb.append("$");
            str = this.f31006a.getSimpleName();
        } else {
            str = sk4.m64693j(this.f31006a);
        }
        sb.append(str);
        Type[] typeArr = this.f31008a;
        if (!(typeArr.length == 0)) {
            C4478ab.m37590uh(typeArr, sb, (CharSequence) null, "<", ">", 0, (CharSequence) null, C5855a.f31009a, 50, (Object) null);
        }
        String sb2 = sb.toString();
        jt1.m53776o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public int hashCode() {
        int hashCode = this.f31006a.hashCode();
        Type type = this.f31007a;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    @vr2
    public String toString() {
        return getTypeName();
    }
}
