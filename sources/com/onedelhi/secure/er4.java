package com.onedelhi.secure;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.HttpUrl;
import okhttp3.ResponseBody;

public final class er4 {

    /* renamed from: a */
    public static final Type[] f28063a = new Type[0];

    /* renamed from: com.onedelhi.secure.er4$a */
    public static final class C5186a implements GenericArrayType {

        /* renamed from: a */
        public final Type f28064a;

        public C5186a(Type type) {
            this.f28064a = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && er4.m47217d(this, (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f28064a;
        }

        public int hashCode() {
            return this.f28064a.hashCode();
        }

        public String toString() {
            return er4.m47233t(this.f28064a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* renamed from: com.onedelhi.secure.er4$b */
    public static final class C5187b implements ParameterizedType {
        @Nullable

        /* renamed from: a */
        public final Type f28065a;

        /* renamed from: a */
        public final Type[] f28066a;

        /* renamed from: b */
        public final Type f28067b;

        public C5187b(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() != null ? false : true)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                er4.m47215b(type3);
            }
            this.f28065a = type;
            this.f28067b = type2;
            this.f28066a = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && er4.m47217d(this, (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f28066a.clone();
        }

        @Nullable
        public Type getOwnerType() {
            return this.f28065a;
        }

        public Type getRawType() {
            return this.f28067b;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f28066a) ^ this.f28067b.hashCode();
            Type type = this.f28065a;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f28066a;
            if (typeArr.length == 0) {
                return er4.m47233t(this.f28067b);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(er4.m47233t(this.f28067b));
            sb.append("<");
            sb.append(er4.m47233t(this.f28066a[0]));
            for (int i = 1; i < this.f28066a.length; i++) {
                sb.append(", ");
                sb.append(er4.m47233t(this.f28066a[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: com.onedelhi.secure.er4$c */
    public static final class C5188c implements WildcardType {

        /* renamed from: a */
        public final Type f28068a;
        @Nullable

        /* renamed from: b */
        public final Type f28069b;

        public C5188c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                Objects.requireNonNull(typeArr2[0]);
                er4.m47215b(typeArr2[0]);
                if (typeArr[0] == cls) {
                    this.f28069b = typeArr2[0];
                    this.f28068a = cls;
                    return;
                }
                throw new IllegalArgumentException();
            } else {
                Objects.requireNonNull(typeArr[0]);
                er4.m47215b(typeArr[0]);
                this.f28069b = null;
                this.f28068a = typeArr[0];
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && er4.m47217d(this, (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f28069b;
            if (type == null) {
                return er4.f28063a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f28068a};
        }

        public int hashCode() {
            Type type = this.f28069b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f28068a.hashCode() + 31);
        }

        public String toString() {
            StringBuilder sb;
            Type type;
            if (this.f28069b != null) {
                sb = new StringBuilder();
                sb.append("? super ");
                type = this.f28069b;
            } else if (this.f28068a == Object.class) {
                return "?";
            } else {
                sb = new StringBuilder();
                sb.append("? extends ");
                type = this.f28068a;
            }
            sb.append(er4.m47233t(type));
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static ResponseBody m47214a(ResponseBody responseBody) throws IOException {
        C6205no noVar = new C6205no();
        responseBody.source().mo31668B(noVar);
        return ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), (C6893to) noVar);
    }

    /* renamed from: b */
    public static void m47215b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    @Nullable
    /* renamed from: c */
    public static Class<?> m47216c(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m47217d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m47217d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
    }

    /* renamed from: e */
    public static Type m47218e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m47218e(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m47218e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: f */
    public static Type m47219f(int i, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    /* renamed from: g */
    public static Type m47220g(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
        }
        Type type = actualTypeArguments[i];
        return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
    }

    /* renamed from: h */
    public static Class<?> m47221h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m47221h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m47221h(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    /* renamed from: i */
    public static Type m47222i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m47230q(type, cls, m47218e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public static boolean m47223j(@Nullable Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type j : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m47223j(j)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return m47223j(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
        }
    }

    /* renamed from: k */
    public static int m47224k(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: l */
    public static boolean m47225l(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation isInstance : annotationArr) {
            if (cls.isInstance(isInstance)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static RuntimeException m47226m(Method method, String str, Object... objArr) {
        return m47227n(method, (Throwable) null, str, objArr);
    }

    /* renamed from: n */
    public static RuntimeException m47227n(Method method, @Nullable Throwable th, String str, Object... objArr) {
        String format = String.format(str, objArr);
        return new IllegalArgumentException(format + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th);
    }

    /* renamed from: o */
    public static RuntimeException m47228o(Method method, int i, String str, Object... objArr) {
        return m47226m(method, str + " (parameter #" + (i + 1) + pl2.f33727d, objArr);
    }

    /* renamed from: p */
    public static RuntimeException m47229p(Method method, Throwable th, int i, String str, Object... objArr) {
        return m47227n(method, th, str + " (parameter #" + (i + 1) + pl2.f33727d, objArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m47230q(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x000f
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.Type r0 = m47231r(r8, r9, r10)
            if (r0 != r10) goto L_0x000d
            return r0
        L_0x000d:
            r10 = r0
            goto L_0x0000
        L_0x000f:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x002d
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x002d
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m47230q(r8, r9, r10)
            if (r10 != r8) goto L_0x0027
            goto L_0x002c
        L_0x0027:
            com.onedelhi.secure.er4$a r0 = new com.onedelhi.secure.er4$a
            r0.<init>(r8)
        L_0x002c:
            return r0
        L_0x002d:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0044
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m47230q(r8, r9, r0)
            if (r0 != r8) goto L_0x003e
            goto L_0x0043
        L_0x003e:
            com.onedelhi.secure.er4$a r10 = new com.onedelhi.secure.er4$a
            r10.<init>(r8)
        L_0x0043:
            return r10
        L_0x0044:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0086
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m47230q(r8, r9, r0)
            if (r3 == r0) goto L_0x0058
            r0 = 1
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x005e:
            if (r2 >= r5) goto L_0x0079
            r6 = r4[r2]
            java.lang.reflect.Type r6 = m47230q(r8, r9, r6)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x0076
            if (r0 != 0) goto L_0x0074
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x0074:
            r4[r2] = r6
        L_0x0076:
            int r2 = r2 + 1
            goto L_0x005e
        L_0x0079:
            if (r0 == 0) goto L_0x0085
            com.onedelhi.secure.er4$b r8 = new com.onedelhi.secure.er4$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L_0x0085:
            return r10
        L_0x0086:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00ca
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00b1
            r3 = r0[r2]
            java.lang.reflect.Type r8 = m47230q(r8, r9, r3)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00ca
            com.onedelhi.secure.er4$c r9 = new com.onedelhi.secure.er4$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r2] = r0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r1]
            r0[r2] = r8
            r9.<init>(r10, r0)
            return r9
        L_0x00b1:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00ca
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m47230q(r8, r9, r0)     // Catch:{ all -> 0x00cb }
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00ca
            com.onedelhi.secure.er4$c r9 = new com.onedelhi.secure.er4$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            r10[r2] = r8
            java.lang.reflect.Type[] r8 = f28063a
            r9.<init>(r10, r8)
            return r9
        L_0x00ca:
            return r10
        L_0x00cb:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.er4.m47230q(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: r */
    public static Type m47231r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> c = m47216c(typeVariable);
        if (c == null) {
            return typeVariable;
        }
        Type e = m47218e(type, cls, c);
        if (!(e instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) e).getActualTypeArguments()[m47224k(c.getTypeParameters(), typeVariable)];
    }

    /* renamed from: s */
    public static void m47232s(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* renamed from: t */
    public static String m47233t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
