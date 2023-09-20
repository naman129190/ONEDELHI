package com.onedelhi.secure;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J'\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0014*\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007¢\u0006\u0004\b\u001b\u0010\u001aJ\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007¢\u0006\u0004\b\u001c\u0010\u001a¨\u0006!"}, d2 = {"Lcom/onedelhi/secure/uj4;", "Ljava/lang/reflect/TypeVariable;", "Ljava/lang/reflect/GenericDeclaration;", "Lcom/onedelhi/secure/kj4;", "", "getName", "getGenericDeclaration", "", "Ljava/lang/reflect/Type;", "getBounds", "()[Ljava/lang/reflect/Type;", "getTypeName", "", "other", "", "equals", "", "hashCode", "toString", "", "T", "Ljava/lang/Class;", "annotationClass", "b", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "c", "()[Ljava/lang/annotation/Annotation;", "d", "a", "Lcom/onedelhi/secure/gy1;", "typeParameter", "<init>", "(Lcom/onedelhi/secure/gy1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
@ly0
public final class uj4 implements TypeVariable<GenericDeclaration>, kj4 {
    @vr2

    /* renamed from: a */
    public final gy1 f36167a;

    public uj4(@vr2 gy1 gy1) {
        jt1.m53777p(gy1, "typeParameter");
        this.f36167a = gy1;
    }

    @vr2
    /* renamed from: a */
    public final Annotation[] mo45623a() {
        return new Annotation[0];
    }

    @ss2
    /* renamed from: b */
    public final <T extends Annotation> T mo45624b(@vr2 Class<T> cls) {
        jt1.m53777p(cls, "annotationClass");
        return null;
    }

    @vr2
    /* renamed from: c */
    public final Annotation[] mo45625c() {
        return new Annotation[0];
    }

    @vr2
    /* renamed from: d */
    public final Annotation[] mo45626d() {
        return new Annotation[0];
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            return jt1.m53768g(getName(), typeVariable.getName()) && jt1.m53768g(getGenericDeclaration(), typeVariable.getGenericDeclaration());
        }
    }

    @vr2
    public Type[] getBounds() {
        List<ey1> o = this.f36167a.mo36985o();
        ArrayList arrayList = new ArrayList(t00.m65073Z(o, 10));
        for (ey1 a : o) {
            arrayList.add(sk4.m64686c(a, true));
        }
        Object[] array = arrayList.toArray(new Type[0]);
        jt1.m53775n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (Type[]) array;
    }

    @vr2
    public GenericDeclaration getGenericDeclaration() {
        throw new ur2("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f36167a));
    }

    @vr2
    public String getName() {
        return this.f36167a.getName();
    }

    @vr2
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    @vr2
    public String toString() {
        return getTypeName();
    }
}
