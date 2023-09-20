package com.onedelhi.secure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

public class tj4<T> {
    public final int hashCode;
    public final Class<? super T> rawType;
    public final Type type;

    public tj4() {
        Type superclassTypeParameter = getSuperclassTypeParameter(getClass());
        this.type = superclassTypeParameter;
        this.rawType = C4602b.m39224k(superclassTypeParameter);
        this.hashCode = superclassTypeParameter.hashCode();
    }

    public tj4(Type type2) {
        Type b = C4602b.m39215b((Type) C4453a.m35637b(type2));
        this.type = b;
        this.rawType = C4602b.m39224k(b);
        this.hashCode = b.hashCode();
    }

    /* renamed from: a */
    public static AssertionError m65941a(Type type2, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> name : clsArr) {
            sb.append(name.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type2.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type2.toString());
        sb.append('.');
        return new AssertionError(sb.toString());
    }

    /* renamed from: b */
    public static boolean m65942b(Type type2, GenericArrayType genericArrayType) {
        Class<?> cls;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type2 instanceof GenericArrayType) {
            cls = ((GenericArrayType) type2).getGenericComponentType();
        } else {
            boolean z = type2 instanceof Class;
            cls = type2;
            if (z) {
                Class<?> cls2 = (Class) type2;
                while (cls2.isArray()) {
                    cls2 = cls2.getComponentType();
                }
                cls = cls2;
            }
        }
        return m65943c(cls, (ParameterizedType) genericComponentType, new HashMap());
    }

    /* renamed from: c */
    public static boolean m65943c(Type type2, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type2 == null) {
            return false;
        }
        if (parameterizedType.equals(type2)) {
            return true;
        }
        Class<?> k = C4602b.m39224k(type2);
        ParameterizedType parameterizedType2 = null;
        if (type2 instanceof ParameterizedType) {
            parameterizedType2 = (ParameterizedType) type2;
        }
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable[] typeParameters = k.getTypeParameters();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                Type type3 = actualTypeArguments[i];
                TypeVariable typeVariable = typeParameters[i];
                while (type3 instanceof TypeVariable) {
                    type3 = map.get(((TypeVariable) type3).getName());
                }
                map.put(typeVariable.getName(), type3);
            }
            if (m65945e(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type c : k.getGenericInterfaces()) {
            if (m65943c(c, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return m65943c(k.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    /* renamed from: d */
    public static boolean m65944d(Type type2, Type type3, Map<String, Type> map) {
        return type3.equals(type2) || ((type2 instanceof TypeVariable) && type3.equals(map.get(((TypeVariable) type2).getName())));
    }

    /* renamed from: e */
    public static boolean m65945e(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            if (!m65944d(actualTypeArguments[i], actualTypeArguments2[i], map)) {
                return false;
            }
        }
        return true;
    }

    public static <T> tj4<T> get(Class<T> cls) {
        return new tj4<>(cls);
    }

    public static tj4<?> get(Type type2) {
        return new tj4<>(type2);
    }

    public static tj4<?> getArray(Type type2) {
        return new tj4<>(C4602b.m39214a(type2));
    }

    public static tj4<?> getParameterized(Type type2, Type... typeArr) {
        return new tj4<>(C4602b.m39228o((Type) null, type2, typeArr));
    }

    public static Type getSuperclassTypeParameter(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C4602b.m39215b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tj4) && C4602b.m39219f(this.type, ((tj4) obj).type);
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    @Deprecated
    public boolean isAssignableFrom(tj4<?> tj4) {
        return isAssignableFrom(tj4.getType());
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    @Deprecated
    public boolean isAssignableFrom(Type type2) {
        if (type2 == null) {
            return false;
        }
        if (this.type.equals(type2)) {
            return true;
        }
        Type type3 = this.type;
        if (type3 instanceof Class) {
            return this.rawType.isAssignableFrom(C4602b.m39224k(type2));
        }
        if (type3 instanceof ParameterizedType) {
            return m65943c(type2, (ParameterizedType) type3, new HashMap());
        }
        if (type3 instanceof GenericArrayType) {
            return this.rawType.isAssignableFrom(C4602b.m39224k(type2)) && m65942b(type2, (GenericArrayType) this.type);
        }
        throw m65941a(type3, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    public final String toString() {
        return C4602b.m39234u(this.type);
    }
}
