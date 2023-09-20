package com.onedelhi.secure;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import okhttp3.HttpUrl;

/* renamed from: com.onedelhi.secure.b */
public final class C4602b {

    /* renamed from: a */
    public static final Type[] f26069a = new Type[0];

    /* renamed from: com.onedelhi.secure.b$a */
    public static final class C4603a implements GenericArrayType, Serializable {

        /* renamed from: b */
        public static final long f26070b = 0;

        /* renamed from: a */
        public final Type f26071a;

        public C4603a(Type type) {
            this.f26071a = C4602b.m39215b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C4602b.m39219f(this, (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f26071a;
        }

        public int hashCode() {
            return this.f26071a.hashCode();
        }

        public String toString() {
            return C4602b.m39234u(this.f26071a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* renamed from: com.onedelhi.secure.b$b */
    public static final class C4604b implements ParameterizedType, Serializable {

        /* renamed from: b */
        public static final long f26072b = 0;

        /* renamed from: a */
        public final Type f26073a;

        /* renamed from: a */
        public final Type[] f26074a;

        /* renamed from: b */
        public final Type f26075b;

        public C4604b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                C4453a.m35636a(z);
            }
            this.f26073a = type == null ? null : C4602b.m39215b(type);
            this.f26075b = C4602b.m39215b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f26074a = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                C4453a.m35637b(this.f26074a[i]);
                C4602b.m39216c(this.f26074a[i]);
                Type[] typeArr3 = this.f26074a;
                typeArr3[i] = C4602b.m39215b(typeArr3[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C4602b.m39219f(this, (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f26074a.clone();
        }

        public Type getOwnerType() {
            return this.f26073a;
        }

        public Type getRawType() {
            return this.f26075b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f26074a) ^ this.f26075b.hashCode()) ^ C4602b.m39226m(this.f26073a);
        }

        public String toString() {
            int length = this.f26074a.length;
            if (length == 0) {
                return C4602b.m39234u(this.f26075b);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C4602b.m39234u(this.f26075b));
            sb.append("<");
            sb.append(C4602b.m39234u(this.f26074a[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C4602b.m39234u(this.f26074a[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: com.onedelhi.secure.b$c */
    public static final class C4605c implements WildcardType, Serializable {

        /* renamed from: b */
        public static final long f26076b = 0;

        /* renamed from: a */
        public final Type f26077a;

        /* renamed from: b */
        public final Type f26078b;

        public C4605c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            boolean z = true;
            C4453a.m35636a(typeArr2.length <= 1);
            C4453a.m35636a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                C4453a.m35637b(typeArr2[0]);
                C4602b.m39216c(typeArr2[0]);
                C4453a.m35636a(typeArr[0] != cls ? false : z);
                this.f26078b = C4602b.m39215b(typeArr2[0]);
                this.f26077a = cls;
                return;
            }
            C4453a.m35637b(typeArr[0]);
            C4602b.m39216c(typeArr[0]);
            this.f26078b = null;
            this.f26077a = C4602b.m39215b(typeArr[0]);
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C4602b.m39219f(this, (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f26078b;
            if (type == null) {
                return C4602b.f26069a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f26077a};
        }

        public int hashCode() {
            Type type = this.f26078b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f26077a.hashCode() + 31);
        }

        public String toString() {
            StringBuilder sb;
            Type type;
            if (this.f26078b != null) {
                sb = new StringBuilder();
                sb.append("? super ");
                type = this.f26078b;
            } else if (this.f26077a == Object.class) {
                return "?";
            } else {
                sb = new StringBuilder();
                sb.append("? extends ");
                type = this.f26077a;
            }
            sb.append(C4602b.m39234u(type));
            return sb.toString();
        }
    }

    public C4602b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static GenericArrayType m39214a(Type type) {
        return new C4603a(type);
    }

    /* renamed from: b */
    public static Type m39215b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C4603a(m39215b(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C4604b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C4603a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C4605c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: c */
    public static void m39216c(Type type) {
        C4453a.m35636a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    /* renamed from: d */
    public static Class<?> m39217d(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: e */
    public static boolean m39218e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: f */
    public static boolean m39219f(Type type, Type type2) {
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
            return m39218e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m39219f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* renamed from: g */
    public static Type m39220g(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    /* renamed from: h */
    public static Type m39221h(Type type, Class<?> cls) {
        Type l = m39225l(type, cls, Collection.class);
        if (l instanceof WildcardType) {
            l = ((WildcardType) l).getUpperBounds()[0];
        }
        return l instanceof ParameterizedType ? ((ParameterizedType) l).getActualTypeArguments()[0] : Object.class;
    }

    /* renamed from: i */
    public static Type m39222i(Type type, Class<?> cls, Class<?> cls2) {
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
                    return m39222i(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return m39222i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: j */
    public static Type[] m39223j(Type type, Class<?> cls) {
        Class<Object> cls2 = Object.class;
        Class<String> cls3 = String.class;
        if (type == Properties.class) {
            return new Type[]{cls3, cls3};
        }
        Type l = m39225l(type, cls, Map.class);
        if (l instanceof ParameterizedType) {
            return ((ParameterizedType) l).getActualTypeArguments();
        }
        return new Type[]{cls2, cls2};
    }

    /* renamed from: k */
    public static Class<?> m39224k(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C4453a.m35636a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m39224k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m39224k(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    /* renamed from: l */
    public static Type m39225l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C4453a.m35636a(cls2.isAssignableFrom(cls));
        return m39229p(type, cls, m39222i(type, cls, cls2));
    }

    /* renamed from: m */
    public static int m39226m(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: n */
    public static int m39227n(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: o */
    public static ParameterizedType m39228o(Type type, Type type2, Type... typeArr) {
        return new C4604b(type, type2, typeArr);
    }

    /* renamed from: p */
    public static Type m39229p(Type type, Class<?> cls, Type type2) {
        return m39230q(type, cls, type2, new HashMap());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: java.lang.reflect.ParameterizedType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        if (m39218e(r1, r9) != false) goto L_0x00d7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m39230q(java.lang.reflect.Type r9, java.lang.Class<?> r10, java.lang.reflect.Type r11, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r12) {
        /*
            r0 = 0
        L_0x0001:
            boolean r1 = r11 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L_0x0027
            r1 = r11
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.Object r2 = r12.get(r1)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            if (r2 == 0) goto L_0x0017
            java.lang.Class r9 = java.lang.Void.TYPE
            if (r2 != r9) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r11 = r2
        L_0x0016:
            return r11
        L_0x0017:
            java.lang.Class r11 = java.lang.Void.TYPE
            r12.put(r1, r11)
            if (r0 != 0) goto L_0x001f
            r0 = r1
        L_0x001f:
            java.lang.reflect.Type r11 = m39231r(r9, r10, r1)
            if (r11 != r1) goto L_0x0001
            goto L_0x00d7
        L_0x0027:
            boolean r1 = r11 instanceof java.lang.Class
            if (r1 == 0) goto L_0x004c
            r1 = r11
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r2 = r1.isArray()
            if (r2 == 0) goto L_0x004c
            java.lang.Class r11 = r1.getComponentType()
            java.lang.reflect.Type r9 = m39230q(r9, r10, r11, r12)
            boolean r10 = m39218e(r11, r9)
            if (r10 == 0) goto L_0x0045
            r11 = r1
            goto L_0x00d7
        L_0x0045:
            java.lang.reflect.GenericArrayType r9 = m39214a(r9)
        L_0x0049:
            r11 = r9
            goto L_0x00d7
        L_0x004c:
            boolean r1 = r11 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L_0x0062
            java.lang.reflect.GenericArrayType r11 = (java.lang.reflect.GenericArrayType) r11
            java.lang.reflect.Type r1 = r11.getGenericComponentType()
            java.lang.reflect.Type r9 = m39230q(r9, r10, r1, r12)
            boolean r10 = m39218e(r1, r9)
            if (r10 == 0) goto L_0x0045
            goto L_0x00d7
        L_0x0062:
            boolean r1 = r11 instanceof java.lang.reflect.ParameterizedType
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x00a6
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r1 = r11.getOwnerType()
            java.lang.reflect.Type r4 = m39230q(r9, r10, r1, r12)
            boolean r1 = m39218e(r4, r1)
            r1 = r1 ^ r3
            java.lang.reflect.Type[] r5 = r11.getActualTypeArguments()
            int r6 = r5.length
        L_0x007c:
            if (r2 >= r6) goto L_0x009b
            r7 = r5[r2]
            java.lang.reflect.Type r7 = m39230q(r9, r10, r7, r12)
            r8 = r5[r2]
            boolean r8 = m39218e(r7, r8)
            if (r8 != 0) goto L_0x0098
            if (r1 != 0) goto L_0x0096
            java.lang.Object r1 = r5.clone()
            r5 = r1
            java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
            r1 = 1
        L_0x0096:
            r5[r2] = r7
        L_0x0098:
            int r2 = r2 + 1
            goto L_0x007c
        L_0x009b:
            if (r1 == 0) goto L_0x00d7
            java.lang.reflect.Type r9 = r11.getRawType()
            java.lang.reflect.ParameterizedType r9 = m39228o(r4, r9, r5)
            goto L_0x0049
        L_0x00a6:
            boolean r1 = r11 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L_0x00d7
            java.lang.reflect.WildcardType r11 = (java.lang.reflect.WildcardType) r11
            java.lang.reflect.Type[] r1 = r11.getLowerBounds()
            java.lang.reflect.Type[] r4 = r11.getUpperBounds()
            int r5 = r1.length
            if (r5 != r3) goto L_0x00c6
            r3 = r1[r2]
            java.lang.reflect.Type r9 = m39230q(r9, r10, r3, r12)
            r10 = r1[r2]
            if (r9 == r10) goto L_0x00d7
            java.lang.reflect.WildcardType r11 = m39233t(r9)
            goto L_0x00d7
        L_0x00c6:
            int r1 = r4.length
            if (r1 != r3) goto L_0x00d7
            r1 = r4[r2]
            java.lang.reflect.Type r9 = m39230q(r9, r10, r1, r12)     // Catch:{ all -> 0x00dd }
            r10 = r4[r2]
            if (r9 == r10) goto L_0x00d7
            java.lang.reflect.WildcardType r11 = m39232s(r9)
        L_0x00d7:
            if (r0 == 0) goto L_0x00dc
            r12.put(r0, r11)
        L_0x00dc:
            return r11
        L_0x00dd:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C4602b.m39230q(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    /* renamed from: r */
    public static Type m39231r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> d = m39217d(typeVariable);
        if (d == null) {
            return typeVariable;
        }
        Type i = m39222i(type, cls, d);
        if (!(i instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) i).getActualTypeArguments()[m39227n(d.getTypeParameters(), typeVariable)];
    }

    /* renamed from: s */
    public static WildcardType m39232s(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C4605c(typeArr, f26069a);
    }

    /* renamed from: t */
    public static WildcardType m39233t(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C4605c(new Type[]{Object.class}, typeArr);
    }

    /* renamed from: u */
    public static String m39234u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
