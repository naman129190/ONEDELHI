package com.onedelhi.secure;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public abstract class hy2<T> {

    /* renamed from: com.onedelhi.secure.hy2$a */
    public class C5613a extends hy2<Iterable<T>> {
        public C5613a() {
        }

        /* renamed from: d */
        public void mo37681a(ui3 ui3, @Nullable Iterable<T> iterable) throws IOException {
            if (iterable != null) {
                for (T a : iterable) {
                    hy2.this.mo37681a(ui3, a);
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.hy2$b */
    public class C5614b extends hy2<Object> {
        public C5614b() {
        }

        /* renamed from: a */
        public void mo37681a(ui3 ui3, @Nullable Object obj) throws IOException {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    hy2.this.mo37681a(ui3, Array.get(obj, i));
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.hy2$c */
    public static final class C5615c<T> extends hy2<T> {

        /* renamed from: a */
        public final int f29937a;

        /* renamed from: a */
        public final q80<T, RequestBody> f29938a;

        /* renamed from: a */
        public final Method f29939a;

        public C5615c(Method method, int i, q80<T, RequestBody> q80) {
            this.f29939a = method;
            this.f29937a = i;
            this.f29938a = q80;
        }

        /* renamed from: a */
        public void mo37681a(ui3 ui3, @Nullable T t) {
            if (t != null) {
                try {
                    ui3.mo45617l(this.f29938a.mo33915a(t));
                } catch (IOException e) {
                    Method method = this.f29939a;
                    int i = this.f29937a;
                    throw er4.m47229p(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            } else {
                throw er4.m47228o(this.f29939a, this.f29937a, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.hy2$d */
    public static final class C5616d<T> extends hy2<T> {

        /* renamed from: a */
        public final q80<T, String> f29940a;

        /* renamed from: a */
        public final String f29941a;

        /* renamed from: a */
        public final boolean f29942a;

        public C5616d(String str, q80<T, String> q80, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f29941a = str;
            this.f29940a = q80;
            this.f29942a = z;
        }

        /* renamed from: a */
        public void mo37681a(ui3 ui3, @Nullable T t) throws IOException {
            String a;
            if (t != null && (a = this.f29940a.mo33915a(t)) != null) {
                ui3.mo45608a(this.f29941a, a, this.f29942a);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.hy2$e */
    public static final class C5617e<T> extends hy2<Map<String, T>> {

        /* renamed from: a */
        public final int f29943a;

        /* renamed from: a */
        public final q80<T, String> f29944a;

        /* renamed from: a */
        public final Method f29945a;

        /* renamed from: a */
        public final boolean f29946a;

        public C5617e(Method method, int i, q80<T, String> q80, boolean z) {
            this.f29945a = method;
            this.f29943a = i;
            this.f29944a = q80;
            this.f29946a = z;
        }

        /* renamed from: d */
        public void mo37681a(ui3 ui3, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String a = this.f29944a.mo33915a(value);
                            if (a != null) {
                                ui3.mo45608a(str, a, this.f29946a);
                            } else {
                                Method method = this.f29945a;
                                int i = this.f29943a;
                                throw er4.m47228o(method, i, "Field map value '" + value + "' converted to null by " + this.f29944a.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f29945a;
                            int i2 = this.f29943a;
                            throw er4.m47228o(method2, i2, "Field map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw er4.m47228o(this.f29945a, this.f29943a, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw er4.m47228o(this.f29945a, this.f29943a, "Field map was null.", new Object[0]);
        }
    }

    /* renamed from: com.onedelhi.secure.hy2$f */
    public static final class C5618f<T> extends hy2<T> {

        /* renamed from: a */
        public final q80<T, String> f29947a;

        /* renamed from: a */
        public final String f29948a;

        public C5618f(String str, q80<T, String> q80) {
            Objects.requireNonNull(str, "name == null");
            this.f29948a = str;
            this.f29947a = q80;
        }

        /* renamed from: a */
        public void mo37681a(ui3 ui3, @Nullable T t) throws IOException {
            String a;
            if (t != null && (a = this.f29947a.mo33915a(t)) != null) {
                ui3.mo45609b(this.f29948a, a);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.hy2$g */
    public static final class C5619g<T> extends hy2<Map<String, T>> {

        /* renamed from: a */
        public final int f29949a;

        /* renamed from: a */
        public final q80<T, String> f29950a;

        /* renamed from: a */
        public final Method f29951a;

        public C5619g(Method method, int i, q80<T, String> q80) {
            this.f29951a = method;
            this.f29949a = i;
            this.f29950a = q80;
        }

        /* renamed from: d */
        public void mo37681a(ui3 ui3, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            ui3.mo45609b(str, this.f29950a.mo33915a(value));
                        } else {
                            Method method = this.f29951a;
                            int i = this.f29949a;
                            throw er4.m47228o(method, i, "Header map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw er4.m47228o(this.f29951a, this.f29949a, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw er4.m47228o(this.f29951a, this.f29949a, "Header map was null.", new Object[0]);
        }
    }

    /* renamed from: com.onedelhi.secure.hy2$h */
    public static final class C5620h extends hy2<Headers> {

        /* renamed from: a */
        public final int f29952a;

        /* renamed from: a */
        public final Method f29953a;

        public C5620h(Method method, int i) {
            this.f29953a = method;
            this.f29952a = i;
        }

        /* renamed from: d */
        public void mo37681a(ui3 ui3, @Nullable Headers headers) {
            if (headers != null) {
                ui3.mo45610c(headers);
                return;
            }
            throw er4.m47228o(this.f29953a, this.f29952a, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* renamed from: com.onedelhi.secure.hy2$i */
    public static final class C5621i<T> extends hy2<T> {

        /* renamed from: a */
        public final int f29954a;

        /* renamed from: a */
        public final q80<T, RequestBody> f29955a;

        /* renamed from: a */
        public final Method f29956a;

        /* renamed from: a */
        public final Headers f29957a;

        public C5621i(Method method, int i, Headers headers, q80<T, RequestBody> q80) {
            this.f29956a = method;
            this.f29954a = i;
            this.f29957a = headers;
            this.f29955a = q80;
        }

        /* renamed from: a */
        public void mo37681a(ui3 ui3, @Nullable T t) {
            if (t != null) {
                try {
                    ui3.mo45611d(this.f29957a, this.f29955a.mo33915a(t));
                } catch (IOException e) {
                    Method method = this.f29956a;
                    int i = this.f29954a;
                    throw er4.m47228o(method, i, "Unable to convert " + t + " to RequestBody", e);
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.hy2$j */
    public static final class C5622j<T> extends hy2<Map<String, T>> {

        /* renamed from: a */
        public final int f29958a;

        /* renamed from: a */
        public final q80<T, RequestBody> f29959a;

        /* renamed from: a */
        public final String f29960a;

        /* renamed from: a */
        public final Method f29961a;

        public C5622j(Method method, int i, q80<T, RequestBody> q80, String str) {
            this.f29961a = method;
            this.f29958a = i;
            this.f29959a = q80;
            this.f29960a = str;
        }

        /* renamed from: d */
        public void mo37681a(ui3 ui3, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            ui3.mo45611d(Headers.m74714of("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f29960a), this.f29959a.mo33915a(value));
                        } else {
                            Method method = this.f29961a;
                            int i = this.f29958a;
                            throw er4.m47228o(method, i, "Part map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw er4.m47228o(this.f29961a, this.f29958a, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw er4.m47228o(this.f29961a, this.f29958a, "Part map was null.", new Object[0]);
        }
    }

    /* renamed from: com.onedelhi.secure.hy2$k */
    public static final class C5623k<T> extends hy2<T> {

        /* renamed from: a */
        public final int f29962a;

        /* renamed from: a */
        public final q80<T, String> f29963a;

        /* renamed from: a */
        public final String f29964a;

        /* renamed from: a */
        public final Method f29965a;

        /* renamed from: a */
        public final boolean f29966a;

        public C5623k(Method method, int i, String str, q80<T, String> q80, boolean z) {
            this.f29965a = method;
            this.f29962a = i;
            Objects.requireNonNull(str, "name == null");
            this.f29964a = str;
            this.f29963a = q80;
            this.f29966a = z;
        }

        /* renamed from: a */
        public void mo37681a(ui3 ui3, @Nullable T t) throws IOException {
            if (t != null) {
                ui3.mo45613f(this.f29964a, this.f29963a.mo33915a(t), this.f29966a);
                return;
            }
            Method method = this.f29965a;
            int i = this.f29962a;
            throw er4.m47228o(method, i, "Path parameter \"" + this.f29964a + "\" value must not be null.", new Object[0]);
        }
    }

    /* renamed from: com.onedelhi.secure.hy2$l */
    public static final class C5624l<T> extends hy2<T> {

        /* renamed from: a */
        public final q80<T, String> f29967a;

        /* renamed from: a */
        public final String f29968a;

        /* renamed from: a */
        public final boolean f29969a;

        public C5624l(String str, q80<T, String> q80, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f29968a = str;
            this.f29967a = q80;
            this.f29969a = z;
        }

        /* renamed from: a */
        public void mo37681a(ui3 ui3, @Nullable T t) throws IOException {
            String a;
            if (t != null && (a = this.f29967a.mo33915a(t)) != null) {
                ui3.mo45614g(this.f29968a, a, this.f29969a);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.hy2$m */
    public static final class C5625m<T> extends hy2<Map<String, T>> {

        /* renamed from: a */
        public final int f29970a;

        /* renamed from: a */
        public final q80<T, String> f29971a;

        /* renamed from: a */
        public final Method f29972a;

        /* renamed from: a */
        public final boolean f29973a;

        public C5625m(Method method, int i, q80<T, String> q80, boolean z) {
            this.f29972a = method;
            this.f29970a = i;
            this.f29971a = q80;
            this.f29973a = z;
        }

        /* renamed from: d */
        public void mo37681a(ui3 ui3, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String a = this.f29971a.mo33915a(value);
                            if (a != null) {
                                ui3.mo45614g(str, a, this.f29973a);
                            } else {
                                Method method = this.f29972a;
                                int i = this.f29970a;
                                throw er4.m47228o(method, i, "Query map value '" + value + "' converted to null by " + this.f29971a.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f29972a;
                            int i2 = this.f29970a;
                            throw er4.m47228o(method2, i2, "Query map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw er4.m47228o(this.f29972a, this.f29970a, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw er4.m47228o(this.f29972a, this.f29970a, "Query map was null", new Object[0]);
        }
    }

    /* renamed from: com.onedelhi.secure.hy2$n */
    public static final class C5626n<T> extends hy2<T> {

        /* renamed from: a */
        public final q80<T, String> f29974a;

        /* renamed from: a */
        public final boolean f29975a;

        public C5626n(q80<T, String> q80, boolean z) {
            this.f29974a = q80;
            this.f29975a = z;
        }

        /* renamed from: a */
        public void mo37681a(ui3 ui3, @Nullable T t) throws IOException {
            if (t != null) {
                ui3.mo45614g(this.f29974a.mo33915a(t), (String) null, this.f29975a);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.hy2$o */
    public static final class C5627o extends hy2<MultipartBody.Part> {

        /* renamed from: a */
        public static final C5627o f29976a = new C5627o();

        /* renamed from: d */
        public void mo37681a(ui3 ui3, @Nullable MultipartBody.Part part) {
            if (part != null) {
                ui3.mo45612e(part);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.hy2$p */
    public static final class C5628p extends hy2<Object> {

        /* renamed from: a */
        public final int f29977a;

        /* renamed from: a */
        public final Method f29978a;

        public C5628p(Method method, int i) {
            this.f29978a = method;
            this.f29977a = i;
        }

        /* renamed from: a */
        public void mo37681a(ui3 ui3, @Nullable Object obj) {
            if (obj != null) {
                ui3.mo45618m(obj);
                return;
            }
            throw er4.m47228o(this.f29978a, this.f29977a, "@Url parameter is null.", new Object[0]);
        }
    }

    /* renamed from: com.onedelhi.secure.hy2$q */
    public static final class C5629q<T> extends hy2<T> {

        /* renamed from: a */
        public final Class<T> f29979a;

        public C5629q(Class<T> cls) {
            this.f29979a = cls;
        }

        /* renamed from: a */
        public void mo37681a(ui3 ui3, @Nullable T t) {
            ui3.mo45615h(this.f29979a, t);
        }
    }

    /* renamed from: a */
    public abstract void mo37681a(ui3 ui3, @Nullable T t) throws IOException;

    /* renamed from: b */
    public final hy2<Object> mo37682b() {
        return new C5614b();
    }

    /* renamed from: c */
    public final hy2<Iterable<T>> mo37683c() {
        return new C5613a();
    }
}
