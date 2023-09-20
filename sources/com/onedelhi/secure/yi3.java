package com.onedelhi.secure;

import com.onedelhi.secure.hy2;
import com.onedelhi.secure.q51;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;

public final class yi3 {

    /* renamed from: a */
    public final String f37938a;

    /* renamed from: a */
    public final Method f37939a;
    @Nullable

    /* renamed from: a */
    public final Headers f37940a;

    /* renamed from: a */
    public final HttpUrl f37941a;
    @Nullable

    /* renamed from: a */
    public final MediaType f37942a;

    /* renamed from: a */
    public final boolean f37943a;

    /* renamed from: a */
    public final hy2<?>[] f37944a;
    @Nullable

    /* renamed from: b */
    public final String f37945b;

    /* renamed from: b */
    public final boolean f37946b;

    /* renamed from: c */
    public final boolean f37947c;

    /* renamed from: d */
    public final boolean f37948d;

    /* renamed from: com.onedelhi.secure.yi3$a */
    public static final class C7364a {

        /* renamed from: a */
        public static final Pattern f37949a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: b */
        public static final Pattern f37950b = Pattern.compile(f37951c);

        /* renamed from: c */
        public static final String f37951c = "[a-zA-Z][a-zA-Z0-9_-]*";

        /* renamed from: a */
        public final am3 f37952a;
        @Nullable

        /* renamed from: a */
        public String f37953a;

        /* renamed from: a */
        public final Method f37954a;
        @Nullable

        /* renamed from: a */
        public Set<String> f37955a;
        @Nullable

        /* renamed from: a */
        public Headers f37956a;
        @Nullable

        /* renamed from: a */
        public MediaType f37957a;

        /* renamed from: a */
        public boolean f37958a;
        @Nullable

        /* renamed from: a */
        public hy2<?>[] f37959a;

        /* renamed from: a */
        public final Annotation[] f37960a;

        /* renamed from: a */
        public final Type[] f37961a;

        /* renamed from: a */
        public final Annotation[][] f37962a;
        @Nullable

        /* renamed from: b */
        public String f37963b;

        /* renamed from: b */
        public boolean f37964b;

        /* renamed from: c */
        public boolean f37965c;

        /* renamed from: d */
        public boolean f37966d;

        /* renamed from: e */
        public boolean f37967e;

        /* renamed from: f */
        public boolean f37968f;

        /* renamed from: g */
        public boolean f37969g;

        /* renamed from: h */
        public boolean f37970h;

        /* renamed from: i */
        public boolean f37971i;

        /* renamed from: j */
        public boolean f37972j;

        /* renamed from: k */
        public boolean f37973k;

        /* renamed from: l */
        public boolean f37974l;

        public C7364a(am3 am3, Method method) {
            this.f37952a = am3;
            this.f37954a = method;
            this.f37960a = method.getAnnotations();
            this.f37961a = method.getGenericParameterTypes();
            this.f37962a = method.getParameterAnnotations();
        }

        /* renamed from: a */
        public static Class<?> m71787a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        /* renamed from: h */
        public static Set<String> m71788h(String str) {
            Matcher matcher = f37949a.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: b */
        public yi3 mo47822b() {
            for (Annotation e : this.f37960a) {
                mo47825e(e);
            }
            if (this.f37953a != null) {
                if (!this.f37971i) {
                    if (this.f37973k) {
                        throw er4.m47226m(this.f37954a, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f37972j) {
                        throw er4.m47226m(this.f37954a, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f37962a.length;
                this.f37959a = new hy2[length];
                int i = length - 1;
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 >= length) {
                        break;
                    }
                    hy2<?>[] hy2Arr = this.f37959a;
                    Type type = this.f37961a[i2];
                    Annotation[] annotationArr = this.f37962a[i2];
                    if (i2 != i) {
                        z = false;
                    }
                    hy2Arr[i2] = mo47826f(i2, type, annotationArr, z);
                    i2++;
                }
                if (this.f37963b != null || this.f37970h) {
                    boolean z2 = this.f37972j;
                    if (!z2 && !this.f37973k && !this.f37971i && this.f37965c) {
                        throw er4.m47226m(this.f37954a, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    } else if (z2 && !this.f37958a) {
                        throw er4.m47226m(this.f37954a, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    } else if (!this.f37973k || this.f37964b) {
                        return new yi3(this);
                    } else {
                        throw er4.m47226m(this.f37954a, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                } else {
                    throw er4.m47226m(this.f37954a, "Missing either @%s URL or @Url parameter.", this.f37953a);
                }
            } else {
                throw er4.m47226m(this.f37954a, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }

        /* renamed from: c */
        public final Headers mo47823c(String[] strArr) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw er4.m47226m(this.f37954a, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.f37957a = MediaType.get(trim);
                    } catch (IllegalArgumentException e) {
                        throw er4.m47227n(this.f37954a, e, "Malformed content type: %s", trim);
                    }
                } else {
                    builder.add(substring, trim);
                }
            }
            return builder.build();
        }

        /* renamed from: d */
        public final void mo47824d(String str, String str2, boolean z) {
            String str3 = this.f37953a;
            if (str3 == null) {
                this.f37953a = str;
                this.f37971i = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f37949a.matcher(substring).find()) {
                            throw er4.m47226m(this.f37954a, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f37963b = str2;
                    this.f37955a = m71788h(str2);
                    return;
                }
                return;
            }
            throw er4.m47226m(this.f37954a, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: e */
        public final void mo47825e(Annotation annotation) {
            String value;
            String str;
            String value2;
            String str2;
            if (annotation instanceof wc0) {
                value = ((wc0) annotation).value();
                str = q51.C6513a.f34003w;
            } else if (annotation instanceof md1) {
                value = ((md1) annotation).value();
                str = "GET";
            } else if (annotation instanceof vj1) {
                value = ((vj1) annotation).value();
                str = q51.C6513a.f34004x;
            } else {
                if (annotation instanceof hx2) {
                    value2 = ((hx2) annotation).value();
                    str2 = q51.C6513a.f34005y;
                } else if (annotation instanceof sx2) {
                    value2 = ((sx2) annotation).value();
                    str2 = q51.C6513a.f34002v;
                } else if (annotation instanceof tx2) {
                    value2 = ((tx2) annotation).value();
                    str2 = q51.C6513a.f34001u;
                } else if (annotation instanceof dt2) {
                    value = ((dt2) annotation).value();
                    str = q51.C6513a.f34006z;
                } else if (annotation instanceof wj1) {
                    wj1 wj1 = (wj1) annotation;
                    mo47824d(wj1.method(), wj1.path(), wj1.hasBody());
                    return;
                } else if (annotation instanceof wk1) {
                    String[] value3 = ((wk1) annotation).value();
                    if (value3.length != 0) {
                        this.f37956a = mo47823c(value3);
                        return;
                    }
                    throw er4.m47226m(this.f37954a, "@Headers annotation is empty.", new Object[0]);
                } else if (annotation instanceof fm2) {
                    if (!this.f37972j) {
                        this.f37973k = true;
                        return;
                    }
                    throw er4.m47226m(this.f37954a, "Only one encoding annotation is allowed.", new Object[0]);
                } else if (!(annotation instanceof ga1)) {
                    return;
                } else {
                    if (!this.f37973k) {
                        this.f37972j = true;
                        return;
                    }
                    throw er4.m47226m(this.f37954a, "Only one encoding annotation is allowed.", new Object[0]);
                }
                mo47824d(str2, value2, true);
                return;
            }
            mo47824d(str, value, false);
        }

        @Nullable
        /* renamed from: f */
        public final hy2<?> mo47826f(int i, Type type, @Nullable Annotation[] annotationArr, boolean z) {
            hy2<?> hy2;
            if (annotationArr != null) {
                hy2 = null;
                for (Annotation g : annotationArr) {
                    hy2<?> g2 = mo47827g(i, type, annotationArr, g);
                    if (g2 != null) {
                        if (hy2 == null) {
                            hy2 = g2;
                        } else {
                            throw er4.m47228o(this.f37954a, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                hy2 = null;
            }
            if (hy2 != null) {
                return hy2;
            }
            if (z) {
                try {
                    if (er4.m47221h(type) == b80.class) {
                        this.f37974l = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw er4.m47228o(this.f37954a, i, "No Retrofit annotation found.", new Object[0]);
        }

        @Nullable
        /* renamed from: g */
        public final hy2<?> mo47827g(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            Class<String> cls = String.class;
            Class<MultipartBody.Part> cls2 = MultipartBody.Part.class;
            if (annotation instanceof lp4) {
                mo47829j(i, type);
                if (this.f37970h) {
                    throw er4.m47228o(this.f37954a, i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f37966d) {
                    throw er4.m47228o(this.f37954a, i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f37967e) {
                    throw er4.m47228o(this.f37954a, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                } else if (this.f37968f) {
                    throw er4.m47228o(this.f37954a, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f37969g) {
                    throw er4.m47228o(this.f37954a, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f37963b == null) {
                    this.f37970h = true;
                    if (type == HttpUrl.class || type == cls || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new hy2.C5628p(this.f37954a, i);
                    }
                    throw er4.m47228o(this.f37954a, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw er4.m47228o(this.f37954a, i, "@Url cannot be used with @%s URL", this.f37953a);
                }
            } else if (annotation instanceof oz2) {
                mo47829j(i, type);
                if (this.f37967e) {
                    throw er4.m47228o(this.f37954a, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f37968f) {
                    throw er4.m47228o(this.f37954a, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f37969g) {
                    throw er4.m47228o(this.f37954a, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f37970h) {
                    throw er4.m47228o(this.f37954a, i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f37963b != null) {
                    this.f37966d = true;
                    oz2 oz2 = (oz2) annotation;
                    String value = oz2.value();
                    mo47828i(i, value);
                    return new hy2.C5623k(this.f37954a, i, value, this.f37952a.mo31024o(type, annotationArr), oz2.encoded());
                } else {
                    throw er4.m47228o(this.f37954a, i, "@Path can only be used with relative url on @%s", this.f37953a);
                }
            } else if (annotation instanceof e93) {
                mo47829j(i, type);
                e93 e93 = (e93) annotation;
                String value2 = e93.value();
                boolean encoded = e93.encoded();
                Class<?> h = er4.m47221h(type);
                this.f37967e = true;
                if (Iterable.class.isAssignableFrom(h)) {
                    if (type instanceof ParameterizedType) {
                        return new hy2.C5624l(value2, this.f37952a.mo31024o(er4.m47220g(0, (ParameterizedType) type), annotationArr), encoded).mo37683c();
                    }
                    throw er4.m47228o(this.f37954a, i, h.getSimpleName() + " must include generic type (e.g., " + h.getSimpleName() + "<String>)", new Object[0]);
                } else if (!h.isArray()) {
                    return new hy2.C5624l(value2, this.f37952a.mo31024o(type, annotationArr), encoded);
                } else {
                    return new hy2.C5624l(value2, this.f37952a.mo31024o(m71787a(h.getComponentType()), annotationArr), encoded).mo37682b();
                }
            } else if (annotation instanceof da3) {
                mo47829j(i, type);
                boolean encoded2 = ((da3) annotation).encoded();
                Class<?> h2 = er4.m47221h(type);
                this.f37968f = true;
                if (Iterable.class.isAssignableFrom(h2)) {
                    if (type instanceof ParameterizedType) {
                        return new hy2.C5626n(this.f37952a.mo31024o(er4.m47220g(0, (ParameterizedType) type), annotationArr), encoded2).mo37683c();
                    }
                    throw er4.m47228o(this.f37954a, i, h2.getSimpleName() + " must include generic type (e.g., " + h2.getSimpleName() + "<String>)", new Object[0]);
                } else if (!h2.isArray()) {
                    return new hy2.C5626n(this.f37952a.mo31024o(type, annotationArr), encoded2);
                } else {
                    return new hy2.C5626n(this.f37952a.mo31024o(m71787a(h2.getComponentType()), annotationArr), encoded2).mo37682b();
                }
            } else if (annotation instanceof ca3) {
                mo47829j(i, type);
                Class<?> h3 = er4.m47221h(type);
                this.f37969g = true;
                if (Map.class.isAssignableFrom(h3)) {
                    Type i2 = er4.m47222i(type, h3, Map.class);
                    if (i2 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) i2;
                        Type g = er4.m47220g(0, parameterizedType);
                        if (cls == g) {
                            return new hy2.C5625m(this.f37954a, i, this.f37952a.mo31024o(er4.m47220g(1, parameterizedType), annotationArr), ((ca3) annotation).encoded());
                        }
                        throw er4.m47228o(this.f37954a, i, "@QueryMap keys must be of type String: " + g, new Object[0]);
                    }
                    throw er4.m47228o(this.f37954a, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw er4.m47228o(this.f37954a, i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof tk1) {
                mo47829j(i, type);
                String value3 = ((tk1) annotation).value();
                Class<?> h4 = er4.m47221h(type);
                if (Iterable.class.isAssignableFrom(h4)) {
                    if (type instanceof ParameterizedType) {
                        return new hy2.C5618f(value3, this.f37952a.mo31024o(er4.m47220g(0, (ParameterizedType) type), annotationArr)).mo37683c();
                    }
                    throw er4.m47228o(this.f37954a, i, h4.getSimpleName() + " must include generic type (e.g., " + h4.getSimpleName() + "<String>)", new Object[0]);
                } else if (!h4.isArray()) {
                    return new hy2.C5618f(value3, this.f37952a.mo31024o(type, annotationArr));
                } else {
                    return new hy2.C5618f(value3, this.f37952a.mo31024o(m71787a(h4.getComponentType()), annotationArr)).mo37682b();
                }
            } else if (annotation instanceof uk1) {
                if (type == Headers.class) {
                    return new hy2.C5620h(this.f37954a, i);
                }
                mo47829j(i, type);
                Class<?> h5 = er4.m47221h(type);
                if (Map.class.isAssignableFrom(h5)) {
                    Type i3 = er4.m47222i(type, h5, Map.class);
                    if (i3 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) i3;
                        Type g2 = er4.m47220g(0, parameterizedType2);
                        if (cls == g2) {
                            return new hy2.C5619g(this.f37954a, i, this.f37952a.mo31024o(er4.m47220g(1, parameterizedType2), annotationArr));
                        }
                        throw er4.m47228o(this.f37954a, i, "@HeaderMap keys must be of type String: " + g2, new Object[0]);
                    }
                    throw er4.m47228o(this.f37954a, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw er4.m47228o(this.f37954a, i, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof r11) {
                mo47829j(i, type);
                if (this.f37972j) {
                    r11 r11 = (r11) annotation;
                    String value4 = r11.value();
                    boolean encoded3 = r11.encoded();
                    this.f37958a = true;
                    Class<?> h6 = er4.m47221h(type);
                    if (Iterable.class.isAssignableFrom(h6)) {
                        if (type instanceof ParameterizedType) {
                            return new hy2.C5616d(value4, this.f37952a.mo31024o(er4.m47220g(0, (ParameterizedType) type), annotationArr), encoded3).mo37683c();
                        }
                        throw er4.m47228o(this.f37954a, i, h6.getSimpleName() + " must include generic type (e.g., " + h6.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!h6.isArray()) {
                        return new hy2.C5616d(value4, this.f37952a.mo31024o(type, annotationArr), encoded3);
                    } else {
                        return new hy2.C5616d(value4, this.f37952a.mo31024o(m71787a(h6.getComponentType()), annotationArr), encoded3).mo37682b();
                    }
                } else {
                    throw er4.m47228o(this.f37954a, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof x11) {
                mo47829j(i, type);
                if (this.f37972j) {
                    Class<?> h7 = er4.m47221h(type);
                    if (Map.class.isAssignableFrom(h7)) {
                        Type i4 = er4.m47222i(type, h7, Map.class);
                        if (i4 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) i4;
                            Type g3 = er4.m47220g(0, parameterizedType3);
                            if (cls == g3) {
                                q80 o = this.f37952a.mo31024o(er4.m47220g(1, parameterizedType3), annotationArr);
                                this.f37958a = true;
                                return new hy2.C5617e(this.f37954a, i, o, ((x11) annotation).encoded());
                            }
                            throw er4.m47228o(this.f37954a, i, "@FieldMap keys must be of type String: " + g3, new Object[0]);
                        }
                        throw er4.m47228o(this.f37954a, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw er4.m47228o(this.f37954a, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw er4.m47228o(this.f37954a, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof dz2) {
                mo47829j(i, type);
                if (this.f37973k) {
                    dz2 dz2 = (dz2) annotation;
                    this.f37964b = true;
                    String value5 = dz2.value();
                    Class<?> h8 = er4.m47221h(type);
                    if (!value5.isEmpty()) {
                        Headers of = Headers.m74714of("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", dz2.encoding());
                        if (Iterable.class.isAssignableFrom(h8)) {
                            if (type instanceof ParameterizedType) {
                                Type g4 = er4.m47220g(0, (ParameterizedType) type);
                                if (!cls2.isAssignableFrom(er4.m47221h(g4))) {
                                    return new hy2.C5621i(this.f37954a, i, of, this.f37952a.mo31022m(g4, annotationArr, this.f37960a)).mo37683c();
                                }
                                throw er4.m47228o(this.f37954a, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            throw er4.m47228o(this.f37954a, i, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
                        } else if (h8.isArray()) {
                            Class<?> a = m71787a(h8.getComponentType());
                            if (!cls2.isAssignableFrom(a)) {
                                return new hy2.C5621i(this.f37954a, i, of, this.f37952a.mo31022m(a, annotationArr, this.f37960a)).mo37682b();
                            }
                            throw er4.m47228o(this.f37954a, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!cls2.isAssignableFrom(h8)) {
                            return new hy2.C5621i(this.f37954a, i, of, this.f37952a.mo31022m(type, annotationArr, this.f37960a));
                        } else {
                            throw er4.m47228o(this.f37954a, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(h8)) {
                        if (!(type instanceof ParameterizedType)) {
                            throw er4.m47228o(this.f37954a, i, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
                        } else if (cls2.isAssignableFrom(er4.m47221h(er4.m47220g(0, (ParameterizedType) type)))) {
                            return hy2.C5627o.f29976a.mo37683c();
                        } else {
                            throw er4.m47228o(this.f37954a, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (h8.isArray()) {
                        if (cls2.isAssignableFrom(h8.getComponentType())) {
                            return hy2.C5627o.f29976a.mo37682b();
                        }
                        throw er4.m47228o(this.f37954a, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (cls2.isAssignableFrom(h8)) {
                        return hy2.C5627o.f29976a;
                    } else {
                        throw er4.m47228o(this.f37954a, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else {
                    throw er4.m47228o(this.f37954a, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
            } else if (annotation instanceof ez2) {
                mo47829j(i, type);
                if (this.f37973k) {
                    this.f37964b = true;
                    Class<?> h9 = er4.m47221h(type);
                    if (Map.class.isAssignableFrom(h9)) {
                        Type i5 = er4.m47222i(type, h9, Map.class);
                        if (i5 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) i5;
                            Type g5 = er4.m47220g(0, parameterizedType4);
                            if (cls == g5) {
                                Type g6 = er4.m47220g(1, parameterizedType4);
                                if (!cls2.isAssignableFrom(er4.m47221h(g6))) {
                                    return new hy2.C5622j(this.f37954a, i, this.f37952a.mo31022m(g6, annotationArr, this.f37960a), ((ez2) annotation).encoding());
                                }
                                throw er4.m47228o(this.f37954a, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw er4.m47228o(this.f37954a, i, "@PartMap keys must be of type String: " + g5, new Object[0]);
                        }
                        throw er4.m47228o(this.f37954a, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw er4.m47228o(this.f37954a, i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw er4.m47228o(this.f37954a, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof C5439gn) {
                mo47829j(i, type);
                if (this.f37972j || this.f37973k) {
                    throw er4.m47228o(this.f37954a, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f37965c) {
                    try {
                        q80 m = this.f37952a.mo31022m(type, annotationArr, this.f37960a);
                        this.f37965c = true;
                        return new hy2.C5615c(this.f37954a, i, m);
                    } catch (RuntimeException e) {
                        throw er4.m47229p(this.f37954a, e, i, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw er4.m47228o(this.f37954a, i, "Multiple @Body method annotations found.", new Object[0]);
                }
            } else if (!(annotation instanceof o94)) {
                return null;
            } else {
                mo47829j(i, type);
                Class<?> h10 = er4.m47221h(type);
                int i6 = i - 1;
                while (i6 >= 0) {
                    hy2<?> hy2 = this.f37959a[i6];
                    if (!(hy2 instanceof hy2.C5629q) || !((hy2.C5629q) hy2).f29979a.equals(h10)) {
                        i6--;
                    } else {
                        throw er4.m47228o(this.f37954a, i, "@Tag type " + h10.getName() + " is duplicate of parameter #" + (i6 + 1) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new hy2.C5629q(h10);
            }
        }

        /* renamed from: i */
        public final void mo47828i(int i, String str) {
            if (!f37950b.matcher(str).matches()) {
                throw er4.m47228o(this.f37954a, i, "@Path parameter name must match %s. Found: %s", f37949a.pattern(), str);
            } else if (!this.f37955a.contains(str)) {
                throw er4.m47228o(this.f37954a, i, "URL \"%s\" does not contain \"{%s}\".", this.f37963b, str);
            }
        }

        /* renamed from: j */
        public final void mo47829j(int i, Type type) {
            if (er4.m47223j(type)) {
                throw er4.m47228o(this.f37954a, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public yi3(C7364a aVar) {
        this.f37939a = aVar.f37954a;
        this.f37941a = aVar.f37952a.f25926a;
        this.f37938a = aVar.f37953a;
        this.f37945b = aVar.f37963b;
        this.f37940a = aVar.f37956a;
        this.f37942a = aVar.f37957a;
        this.f37943a = aVar.f37971i;
        this.f37946b = aVar.f37972j;
        this.f37947c = aVar.f37973k;
        this.f37944a = aVar.f37959a;
        this.f37948d = aVar.f37974l;
    }

    /* renamed from: b */
    public static yi3 m71785b(am3 am3, Method method) {
        return new C7364a(am3, method).mo47822b();
    }

    /* renamed from: a */
    public Request mo47821a(Object[] objArr) throws IOException {
        hy2<?>[] hy2Arr = this.f37944a;
        int length = objArr.length;
        if (length == hy2Arr.length) {
            ui3 ui3 = new ui3(this.f37938a, this.f37941a, this.f37945b, this.f37940a, this.f37942a, this.f37943a, this.f37946b, this.f37947c);
            if (this.f37948d) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                hy2Arr[i].mo37681a(ui3, objArr[i]);
            }
            return ui3.mo45616k().tag(yt1.class, new yt1(this.f37939a, arrayList)).build();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + hy2Arr.length + pl2.f33727d);
    }
}
