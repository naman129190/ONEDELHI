package com.onedelhi.secure;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

public final class kw1 implements lt2, gs4 {

    /* renamed from: a */
    public final JsonWriter f31475a;

    /* renamed from: a */
    public final kt2<Object> f31476a;

    /* renamed from: a */
    public kw1 f31477a = null;

    /* renamed from: a */
    public final Map<Class<?>, kt2<?>> f31478a;

    /* renamed from: a */
    public boolean f31479a = true;

    /* renamed from: b */
    public final Map<Class<?>, fs4<?>> f31480b;

    /* renamed from: b */
    public final boolean f31481b;

    public kw1(kw1 kw1) {
        this.f31475a = kw1.f31475a;
        this.f31478a = kw1.f31478a;
        this.f31480b = kw1.f31480b;
        this.f31476a = kw1.f31476a;
        this.f31481b = kw1.f31481b;
    }

    public kw1(@mr2 Writer writer, @mr2 Map<Class<?>, kt2<?>> map, @mr2 Map<Class<?>, fs4<?>> map2, kt2<Object> kt2, boolean z) {
        this.f31475a = new JsonWriter(writer);
        this.f31478a = map;
        this.f31480b = map2;
        this.f31476a = kt2;
        this.f31481b = z;
    }

    @mr2
    /* renamed from: A */
    public kw1 mo36879g(@ts2 String str) throws IOException {
        mo39564N();
        this.f31475a.value(str);
        return this;
    }

    @mr2
    /* renamed from: B */
    public kw1 mo39569i(@mr2 String str, double d) throws IOException {
        mo39564N();
        this.f31475a.name(str);
        return mo36881l(d);
    }

    @mr2
    /* renamed from: C */
    public kw1 mo39574p(@mr2 String str, int i) throws IOException {
        mo39564N();
        this.f31475a.name(str);
        return mo36877b(i);
    }

    @mr2
    /* renamed from: D */
    public kw1 mo39578u(@mr2 String str, long j) throws IOException {
        mo39564N();
        this.f31475a.name(str);
        return mo36883q(j);
    }

    @mr2
    /* renamed from: E */
    public kw1 mo39570j(@mr2 String str, @ts2 Object obj) throws IOException {
        return this.f31481b ? mo39563M(str, obj) : mo39562L(str, obj);
    }

    @mr2
    /* renamed from: F */
    public kw1 mo39573n(@mr2 String str, boolean z) throws IOException {
        mo39564N();
        this.f31475a.name(str);
        return mo36880h(z);
    }

    @mr2
    /* renamed from: G */
    public kw1 mo36880h(boolean z) throws IOException {
        mo39564N();
        this.f31475a.value(z);
        return this;
    }

    @mr2
    /* renamed from: H */
    public kw1 mo36882o(@ts2 byte[] bArr) throws IOException {
        mo39564N();
        if (bArr == null) {
            this.f31475a.nullValue();
        } else {
            this.f31475a.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* renamed from: I */
    public final boolean mo39559I(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: J */
    public void mo39560J() throws IOException {
        mo39564N();
        this.f31475a.flush();
    }

    /* renamed from: K */
    public kw1 mo39561K(kt2<Object> kt2, Object obj, boolean z) throws IOException {
        if (!z) {
            this.f31475a.beginObject();
        }
        kt2.mo17710a(obj, this);
        if (!z) {
            this.f31475a.endObject();
        }
        return this;
    }

    /* renamed from: L */
    public final kw1 mo39562L(@mr2 String str, @ts2 Object obj) throws IOException, iu0 {
        mo39564N();
        this.f31475a.name(str);
        if (obj != null) {
            return mo39583z(obj, false);
        }
        this.f31475a.nullValue();
        return this;
    }

    /* renamed from: M */
    public final kw1 mo39563M(@mr2 String str, @ts2 Object obj) throws IOException, iu0 {
        if (obj == null) {
            return this;
        }
        mo39564N();
        this.f31475a.name(str);
        return mo39583z(obj, false);
    }

    /* renamed from: N */
    public final void mo39564N() throws IOException {
        if (this.f31479a) {
            kw1 kw1 = this.f31477a;
            if (kw1 != null) {
                kw1.mo39564N();
                this.f31477a.f31479a = false;
                this.f31477a = null;
                this.f31475a.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @mr2
    /* renamed from: a */
    public lt2 mo39565a(@mr2 v11 v11, double d) throws IOException {
        return mo39569i(v11.mo45922b(), d);
    }

    @mr2
    /* renamed from: c */
    public lt2 mo39566c(@mr2 v11 v11, boolean z) throws IOException {
        return mo39573n(v11.mo45922b(), z);
    }

    @mr2
    /* renamed from: d */
    public lt2 mo39567d(@mr2 v11 v11) throws IOException {
        return mo39576s(v11.mo45922b());
    }

    @mr2
    /* renamed from: e */
    public lt2 mo39568e(@mr2 v11 v11, float f) throws IOException {
        return mo39569i(v11.mo45922b(), (double) f);
    }

    @mr2
    /* renamed from: k */
    public lt2 mo39571k(@mr2 v11 v11, int i) throws IOException {
        return mo39574p(v11.mo45922b(), i);
    }

    @mr2
    /* renamed from: m */
    public lt2 mo39572m(@ts2 Object obj) throws IOException {
        return mo39583z(obj, true);
    }

    @mr2
    /* renamed from: r */
    public lt2 mo39575r(@mr2 v11 v11, @ts2 Object obj) throws IOException {
        return mo39570j(v11.mo45922b(), obj);
    }

    @mr2
    /* renamed from: s */
    public lt2 mo39576s(@mr2 String str) throws IOException {
        mo39564N();
        this.f31477a = new kw1(this);
        this.f31475a.name(str);
        this.f31475a.beginObject();
        return this.f31477a;
    }

    @mr2
    /* renamed from: t */
    public lt2 mo39577t(@mr2 v11 v11, long j) throws IOException {
        return mo39578u(v11.mo45922b(), j);
    }

    @mr2
    /* renamed from: v */
    public kw1 mo36881l(double d) throws IOException {
        mo39564N();
        this.f31475a.value(d);
        return this;
    }

    @mr2
    /* renamed from: w */
    public kw1 mo36878f(float f) throws IOException {
        mo39564N();
        this.f31475a.value((double) f);
        return this;
    }

    @mr2
    /* renamed from: x */
    public kw1 mo36877b(int i) throws IOException {
        mo39564N();
        this.f31475a.value((long) i);
        return this;
    }

    @mr2
    /* renamed from: y */
    public kw1 mo36883q(long j) throws IOException {
        mo39564N();
        this.f31475a.value(j);
        return this;
    }

    @mr2
    /* renamed from: z */
    public kw1 mo39583z(@ts2 Object obj, boolean z) throws IOException {
        int i = 0;
        if (z && mo39559I(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new iu0(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f31475a.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f31475a.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return mo36882o((byte[]) obj);
            }
            this.f31475a.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    this.f31475a.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    mo36883q(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f31475a.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f31475a.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number z2 : (Number[]) obj) {
                    mo39583z(z2, false);
                }
            } else {
                for (Object z3 : (Object[]) obj) {
                    mo39583z(z3, false);
                }
            }
            this.f31475a.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f31475a.beginArray();
            for (Object z4 : (Collection) obj) {
                mo39583z(z4, false);
            }
            this.f31475a.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f31475a.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    mo39570j((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new iu0(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                }
            }
            this.f31475a.endObject();
            return this;
        } else {
            kt2 kt2 = this.f31478a.get(obj.getClass());
            if (kt2 != null) {
                return mo39561K(kt2, obj, z);
            }
            fs4 fs4 = this.f31480b.get(obj.getClass());
            if (fs4 != null) {
                fs4.mo17710a(obj, this);
                return this;
            } else if (!(obj instanceof Enum)) {
                return mo39561K(this.f31476a, obj, z);
            } else {
                mo36879g(((Enum) obj).name());
                return this;
            }
        }
    }
}
