package com.google.gson.internal.bind;

import com.onedelhi.secure.C3516si;
import com.onedelhi.secure.cj4;
import com.onedelhi.secure.db0;
import com.onedelhi.secure.dj4;
import com.onedelhi.secure.ew1;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.fw1;
import com.onedelhi.secure.gv1;
import com.onedelhi.secure.gw1;
import com.onedelhi.secure.lw1;
import com.onedelhi.secure.nu3;
import com.onedelhi.secure.ov1;
import com.onedelhi.secure.qv1;
import com.onedelhi.secure.rv1;
import com.onedelhi.secure.sv1;
import com.onedelhi.secure.t12;
import com.onedelhi.secure.tj4;
import com.onedelhi.secure.vv1;
import com.onedelhi.secure.xv1;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class TypeAdapters {

    /* renamed from: A */
    public static final cj4<Locale> f25497A;

    /* renamed from: B */
    public static final cj4<ov1> f25498B;

    /* renamed from: a */
    public static final cj4<Class> f25499a;

    /* renamed from: a */
    public static final dj4 f25500a;

    /* renamed from: b */
    public static final cj4<BitSet> f25501b;

    /* renamed from: b */
    public static final dj4 f25502b;

    /* renamed from: c */
    public static final cj4<Boolean> f25503c;

    /* renamed from: c */
    public static final dj4 f25504c;

    /* renamed from: d */
    public static final cj4<Boolean> f25505d = new C4432x();

    /* renamed from: d */
    public static final dj4 f25506d;

    /* renamed from: e */
    public static final cj4<Number> f25507e;

    /* renamed from: e */
    public static final dj4 f25508e;

    /* renamed from: f */
    public static final cj4<Number> f25509f;

    /* renamed from: f */
    public static final dj4 f25510f;

    /* renamed from: g */
    public static final cj4<Number> f25511g;

    /* renamed from: g */
    public static final dj4 f25512g;

    /* renamed from: h */
    public static final cj4<AtomicInteger> f25513h;

    /* renamed from: h */
    public static final dj4 f25514h;

    /* renamed from: i */
    public static final cj4<AtomicBoolean> f25515i;

    /* renamed from: i */
    public static final dj4 f25516i;

    /* renamed from: j */
    public static final cj4<AtomicIntegerArray> f25517j;

    /* renamed from: j */
    public static final dj4 f25518j;

    /* renamed from: k */
    public static final cj4<Number> f25519k = new C4406b();

    /* renamed from: k */
    public static final dj4 f25520k;

    /* renamed from: l */
    public static final cj4<Number> f25521l = new C4408c();

    /* renamed from: l */
    public static final dj4 f25522l;

    /* renamed from: m */
    public static final cj4<Number> f25523m = new C4410d();

    /* renamed from: m */
    public static final dj4 f25524m;

    /* renamed from: n */
    public static final cj4<Character> f25525n;

    /* renamed from: n */
    public static final dj4 f25526n;

    /* renamed from: o */
    public static final cj4<String> f25527o;

    /* renamed from: o */
    public static final dj4 f25528o;

    /* renamed from: p */
    public static final cj4<BigDecimal> f25529p = new C4415g();

    /* renamed from: p */
    public static final dj4 f25530p;

    /* renamed from: q */
    public static final cj4<BigInteger> f25531q = new C4416h();

    /* renamed from: q */
    public static final dj4 f25532q;

    /* renamed from: r */
    public static final cj4<t12> f25533r = new C4417i();

    /* renamed from: r */
    public static final dj4 f25534r;

    /* renamed from: s */
    public static final cj4<StringBuilder> f25535s;

    /* renamed from: s */
    public static final dj4 f25536s;

    /* renamed from: t */
    public static final cj4<StringBuffer> f25537t;

    /* renamed from: t */
    public static final dj4 f25538t;

    /* renamed from: u */
    public static final cj4<URL> f25539u;

    /* renamed from: u */
    public static final dj4 f25540u;

    /* renamed from: v */
    public static final cj4<URI> f25541v;

    /* renamed from: v */
    public static final dj4 f25542v = new dj4() {
        /* JADX WARNING: type inference failed for: r3v0, types: [com.onedelhi.secure.tj4<T>, com.onedelhi.secure.tj4] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> com.onedelhi.secure.cj4<T> mo30126a(com.onedelhi.secure.fj1 r2, com.onedelhi.secure.tj4<T> r3) {
            /*
                r1 = this;
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                java.lang.Class r3 = r3.getRawType()
                boolean r0 = r2.isAssignableFrom(r3)
                if (r0 == 0) goto L_0x001f
                if (r3 != r2) goto L_0x000f
                goto L_0x001f
            L_0x000f:
                boolean r2 = r3.isEnum()
                if (r2 != 0) goto L_0x0019
                java.lang.Class r3 = r3.getSuperclass()
            L_0x0019:
                com.google.gson.internal.bind.TypeAdapters$d0 r2 = new com.google.gson.internal.bind.TypeAdapters$d0
                r2.<init>(r3)
                return r2
            L_0x001f:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.C439729.mo30126a(com.onedelhi.secure.fj1, com.onedelhi.secure.tj4):com.onedelhi.secure.cj4");
        }
    };

    /* renamed from: w */
    public static final cj4<InetAddress> f25543w;

    /* renamed from: x */
    public static final cj4<UUID> f25544x;

    /* renamed from: y */
    public static final cj4<Currency> f25545y;

    /* renamed from: z */
    public static final cj4<Calendar> f25546z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$a */
    public class C4404a extends cj4<AtomicIntegerArray> {
        /* renamed from: j */
        public AtomicIntegerArray mo30144e(xv1 xv1) throws IOException {
            ArrayList arrayList = new ArrayList();
            xv1.mo36929a();
            while (xv1.mo36922A()) {
                try {
                    arrayList.add(Integer.valueOf(xv1.mo36927Y()));
                } catch (NumberFormatException e) {
                    throw new ew1((Throwable) e);
                }
            }
            xv1.mo36937h();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, AtomicIntegerArray atomicIntegerArray) throws IOException {
            lw1.mo37587c();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                lw1.mo37594u0((long) atomicIntegerArray.get(i));
            }
            lw1.mo37591h();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$a0 */
    public class C4405a0 extends cj4<Number> {
        /* renamed from: j */
        public Number mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() == fw1.NULL) {
                xv1.mo36940j0();
                return null;
            }
            try {
                return Integer.valueOf(xv1.mo36927Y());
            } catch (NumberFormatException e) {
                throw new ew1((Throwable) e);
            }
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, Number number) throws IOException {
            lw1.mo37579F0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$b */
    public class C4406b extends cj4<Number> {
        /* renamed from: j */
        public Number mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() == fw1.NULL) {
                xv1.mo36940j0();
                return null;
            }
            try {
                return Long.valueOf(xv1.mo36928Z());
            } catch (NumberFormatException e) {
                throw new ew1((Throwable) e);
            }
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, Number number) throws IOException {
            lw1.mo37579F0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$b0 */
    public class C4407b0 extends cj4<AtomicInteger> {
        /* renamed from: j */
        public AtomicInteger mo30144e(xv1 xv1) throws IOException {
            try {
                return new AtomicInteger(xv1.mo36927Y());
            } catch (NumberFormatException e) {
                throw new ew1((Throwable) e);
            }
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, AtomicInteger atomicInteger) throws IOException {
            lw1.mo37594u0((long) atomicInteger.get());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$c */
    public class C4408c extends cj4<Number> {
        /* renamed from: j */
        public Number mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() != fw1.NULL) {
                return Float.valueOf((float) xv1.mo36926X());
            }
            xv1.mo36940j0();
            return null;
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, Number number) throws IOException {
            lw1.mo37579F0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$c0 */
    public class C4409c0 extends cj4<AtomicBoolean> {
        /* renamed from: j */
        public AtomicBoolean mo30144e(xv1 xv1) throws IOException {
            return new AtomicBoolean(xv1.mo36923M());
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, AtomicBoolean atomicBoolean) throws IOException {
            lw1.mo37583M0(atomicBoolean.get());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$d */
    public class C4410d extends cj4<Number> {
        /* renamed from: j */
        public Number mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() != fw1.NULL) {
                return Double.valueOf(xv1.mo36926X());
            }
            xv1.mo36940j0();
            return null;
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, Number number) throws IOException {
            lw1.mo37579F0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$d0 */
    public static final class C4411d0<T extends Enum<T>> extends cj4<T> {

        /* renamed from: a */
        public final Map<String, T> f25561a = new HashMap();

        /* renamed from: b */
        public final Map<T, String> f25562b = new HashMap();

        /* renamed from: com.google.gson.internal.bind.TypeAdapters$d0$a */
        public class C4412a implements PrivilegedAction<Field[]> {

            /* renamed from: a */
            public final /* synthetic */ Class f25564a;

            public C4412a(Class cls) {
                this.f25564a = cls;
            }

            /* renamed from: a */
            public Field[] run() {
                Field[] declaredFields = this.f25564a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public C4411d0(Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new C4412a(cls))) {
                    Enum enumR = (Enum) field.get((Object) null);
                    String name = enumR.name();
                    nu3 nu3 = (nu3) field.getAnnotation(nu3.class);
                    if (nu3 != null) {
                        name = nu3.value();
                        for (String put : nu3.alternate()) {
                            this.f25561a.put(put, enumR);
                        }
                    }
                    this.f25561a.put(name, enumR);
                    this.f25562b.put(enumR, name);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: j */
        public T mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() != fw1.NULL) {
                return (Enum) this.f25561a.get(xv1.mo36942o0());
            }
            xv1.mo36940j0();
            return null;
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, T t) throws IOException {
            lw1.mo37580G0(t == null ? null : this.f25562b.get(t));
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$e */
    public class C4413e extends cj4<Character> {
        /* renamed from: j */
        public Character mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() == fw1.NULL) {
                xv1.mo36940j0();
                return null;
            }
            String o0 = xv1.mo36942o0();
            if (o0.length() == 1) {
                return Character.valueOf(o0.charAt(0));
            }
            throw new ew1("Expecting character, got: " + o0 + "; at " + xv1.mo36943q());
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, Character ch) throws IOException {
            lw1.mo37580G0(ch == null ? null : String.valueOf(ch));
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$f */
    public class C4414f extends cj4<String> {
        /* renamed from: j */
        public String mo30144e(xv1 xv1) throws IOException {
            fw1 q0 = xv1.mo36944q0();
            if (q0 != fw1.NULL) {
                return q0 == fw1.BOOLEAN ? Boolean.toString(xv1.mo36923M()) : xv1.mo36942o0();
            }
            xv1.mo36940j0();
            return null;
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, String str) throws IOException {
            lw1.mo37580G0(str);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$g */
    public class C4415g extends cj4<BigDecimal> {
        /* renamed from: j */
        public BigDecimal mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() == fw1.NULL) {
                xv1.mo36940j0();
                return null;
            }
            String o0 = xv1.mo36942o0();
            try {
                return new BigDecimal(o0);
            } catch (NumberFormatException e) {
                throw new ew1("Failed parsing '" + o0 + "' as BigDecimal; at path " + xv1.mo36943q(), e);
            }
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, BigDecimal bigDecimal) throws IOException {
            lw1.mo37579F0(bigDecimal);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$h */
    public class C4416h extends cj4<BigInteger> {
        /* renamed from: j */
        public BigInteger mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() == fw1.NULL) {
                xv1.mo36940j0();
                return null;
            }
            String o0 = xv1.mo36942o0();
            try {
                return new BigInteger(o0);
            } catch (NumberFormatException e) {
                throw new ew1("Failed parsing '" + o0 + "' as BigInteger; at path " + xv1.mo36943q(), e);
            }
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, BigInteger bigInteger) throws IOException {
            lw1.mo37579F0(bigInteger);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$i */
    public class C4417i extends cj4<t12> {
        /* renamed from: j */
        public t12 mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() != fw1.NULL) {
                return new t12(xv1.mo36942o0());
            }
            xv1.mo36940j0();
            return null;
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, t12 t12) throws IOException {
            lw1.mo37579F0(t12);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$j */
    public class C4418j extends cj4<StringBuilder> {
        /* renamed from: j */
        public StringBuilder mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() != fw1.NULL) {
                return new StringBuilder(xv1.mo36942o0());
            }
            xv1.mo36940j0();
            return null;
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, StringBuilder sb) throws IOException {
            lw1.mo37580G0(sb == null ? null : sb.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$k */
    public class C4419k extends cj4<Class> {
        /* renamed from: j */
        public Class mo30144e(xv1 xv1) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$l */
    public class C4420l extends cj4<StringBuffer> {
        /* renamed from: j */
        public StringBuffer mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() != fw1.NULL) {
                return new StringBuffer(xv1.mo36942o0());
            }
            xv1.mo36940j0();
            return null;
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, StringBuffer stringBuffer) throws IOException {
            lw1.mo37580G0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$m */
    public class C4421m extends cj4<URL> {
        /* renamed from: j */
        public URL mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() == fw1.NULL) {
                xv1.mo36940j0();
                return null;
            }
            String o0 = xv1.mo36942o0();
            if ("null".equals(o0)) {
                return null;
            }
            return new URL(o0);
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, URL url) throws IOException {
            lw1.mo37580G0(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$n */
    public class C4422n extends cj4<URI> {
        /* renamed from: j */
        public URI mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() == fw1.NULL) {
                xv1.mo36940j0();
                return null;
            }
            try {
                String o0 = xv1.mo36942o0();
                if ("null".equals(o0)) {
                    return null;
                }
                return new URI(o0);
            } catch (URISyntaxException e) {
                throw new qv1((Throwable) e);
            }
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, URI uri) throws IOException {
            lw1.mo37580G0(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$o */
    public class C4423o extends cj4<InetAddress> {
        /* renamed from: j */
        public InetAddress mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() != fw1.NULL) {
                return InetAddress.getByName(xv1.mo36942o0());
            }
            xv1.mo36940j0();
            return null;
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, InetAddress inetAddress) throws IOException {
            lw1.mo37580G0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$p */
    public class C4424p extends cj4<UUID> {
        /* renamed from: j */
        public UUID mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() == fw1.NULL) {
                xv1.mo36940j0();
                return null;
            }
            String o0 = xv1.mo36942o0();
            try {
                return UUID.fromString(o0);
            } catch (IllegalArgumentException e) {
                throw new ew1("Failed parsing '" + o0 + "' as UUID; at path " + xv1.mo36943q(), e);
            }
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, UUID uuid) throws IOException {
            lw1.mo37580G0(uuid == null ? null : uuid.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$q */
    public class C4425q extends cj4<Currency> {
        /* renamed from: j */
        public Currency mo30144e(xv1 xv1) throws IOException {
            String o0 = xv1.mo36942o0();
            try {
                return Currency.getInstance(o0);
            } catch (IllegalArgumentException e) {
                throw new ew1("Failed parsing '" + o0 + "' as Currency; at path " + xv1.mo36943q(), e);
            }
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, Currency currency) throws IOException {
            lw1.mo37580G0(currency.getCurrencyCode());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$r */
    public class C4426r extends cj4<Calendar> {

        /* renamed from: a */
        public static final String f25565a = "year";

        /* renamed from: b */
        public static final String f25566b = "month";

        /* renamed from: c */
        public static final String f25567c = "dayOfMonth";

        /* renamed from: d */
        public static final String f25568d = "hourOfDay";

        /* renamed from: e */
        public static final String f25569e = "minute";

        /* renamed from: f */
        public static final String f25570f = "second";

        /* renamed from: j */
        public Calendar mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() == fw1.NULL) {
                xv1.mo36940j0();
                return null;
            }
            xv1.mo36930b();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (xv1.mo36944q0() != fw1.END_OBJECT) {
                String c0 = xv1.mo36932c0();
                int Y = xv1.mo36927Y();
                if (f25565a.equals(c0)) {
                    i = Y;
                } else if (f25566b.equals(c0)) {
                    i2 = Y;
                } else if (f25567c.equals(c0)) {
                    i3 = Y;
                } else if (f25568d.equals(c0)) {
                    i4 = Y;
                } else if (f25569e.equals(c0)) {
                    i5 = Y;
                } else if (f25570f.equals(c0)) {
                    i6 = Y;
                }
            }
            xv1.mo36941l();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, Calendar calendar) throws IOException {
            if (calendar == null) {
                lw1.mo37582M();
                return;
            }
            lw1.mo37589d();
            lw1.mo37581H(f25565a);
            lw1.mo37594u0((long) calendar.get(1));
            lw1.mo37581H(f25566b);
            lw1.mo37594u0((long) calendar.get(2));
            lw1.mo37581H(f25567c);
            lw1.mo37594u0((long) calendar.get(5));
            lw1.mo37581H(f25568d);
            lw1.mo37594u0((long) calendar.get(11));
            lw1.mo37581H(f25569e);
            lw1.mo37594u0((long) calendar.get(12));
            lw1.mo37581H(f25570f);
            lw1.mo37594u0((long) calendar.get(13));
            lw1.mo37592l();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$s */
    public class C4427s extends cj4<Locale> {
        /* renamed from: j */
        public Locale mo30144e(xv1 xv1) throws IOException {
            Locale locale;
            String str = null;
            if (xv1.mo36944q0() == fw1.NULL) {
                xv1.mo36940j0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(xv1.mo36942o0(), db0.f27369e);
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str == null) {
                return locale;
            }
            locale = new Locale(nextToken, nextToken2, str);
            return locale;
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, Locale locale) throws IOException {
            lw1.mo37580G0(locale == null ? null : locale.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$t */
    public class C4428t extends cj4<ov1> {
        /* renamed from: j */
        public ov1 mo30144e(xv1 xv1) throws IOException {
            if (xv1 instanceof gw1) {
                return ((gw1) xv1).mo36931b1();
            }
            switch (C4430v.f25571a[xv1.mo36944q0().ordinal()]) {
                case 1:
                    return new vv1((Number) new t12(xv1.mo36942o0()));
                case 2:
                    return new vv1(xv1.mo36942o0());
                case 3:
                    return new vv1(Boolean.valueOf(xv1.mo36923M()));
                case 4:
                    xv1.mo36940j0();
                    return rv1.f34755a;
                case 5:
                    gv1 gv1 = new gv1();
                    xv1.mo36929a();
                    while (xv1.mo36922A()) {
                        gv1.mo36892C(mo30144e(xv1));
                    }
                    xv1.mo36937h();
                    return gv1;
                case 6:
                    sv1 sv1 = new sv1();
                    xv1.mo36930b();
                    while (xv1.mo36922A()) {
                        sv1.mo44555C(xv1.mo36932c0(), mo30144e(xv1));
                    }
                    xv1.mo36941l();
                    return sv1;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, ov1 ov1) throws IOException {
            if (ov1 == null || ov1.mo42282z()) {
                lw1.mo37582M();
            } else if (ov1.mo42275B()) {
                vv1 t = ov1.mo42279t();
                if (t.mo46385G()) {
                    lw1.mo37579F0(t.mo36919v());
                } else if (t.mo46384D()) {
                    lw1.mo37583M0(t.mo36908g());
                } else {
                    lw1.mo37580G0(t.mo36921x());
                }
            } else if (ov1.mo42281y()) {
                lw1.mo37587c();
                Iterator<ov1> it = ov1.mo42276o().iterator();
                while (it.hasNext()) {
                    mo30145i(lw1, it.next());
                }
                lw1.mo37591h();
            } else if (ov1.mo42274A()) {
                lw1.mo37589d();
                for (Map.Entry next : ov1.mo42278s().mo44561L()) {
                    lw1.mo37581H((String) next.getKey());
                    mo30145i(lw1, (ov1) next.getValue());
                }
                lw1.mo37592l();
            } else {
                throw new IllegalArgumentException("Couldn't write " + ov1.getClass());
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$u */
    public class C4429u extends cj4<BitSet> {
        /* renamed from: j */
        public BitSet mo30144e(xv1 xv1) throws IOException {
            BitSet bitSet = new BitSet();
            xv1.mo36929a();
            fw1 q0 = xv1.mo36944q0();
            int i = 0;
            while (q0 != fw1.END_ARRAY) {
                int i2 = C4430v.f25571a[q0.ordinal()];
                boolean z = true;
                if (i2 == 1 || i2 == 2) {
                    int Y = xv1.mo36927Y();
                    if (Y == 0) {
                        z = false;
                    } else if (Y != 1) {
                        throw new ew1("Invalid bitset value " + Y + ", expected 0 or 1; at path " + xv1.mo36943q());
                    }
                } else if (i2 == 3) {
                    z = xv1.mo36923M();
                } else {
                    throw new ew1("Invalid bitset value type: " + q0 + "; at path " + xv1.mo36935f0());
                }
                if (z) {
                    bitSet.set(i);
                }
                i++;
                q0 = xv1.mo36944q0();
            }
            xv1.mo36937h();
            return bitSet;
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, BitSet bitSet) throws IOException {
            lw1.mo37587c();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                lw1.mo37594u0(bitSet.get(i) ? 1 : 0);
            }
            lw1.mo37591h();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$v */
    public static /* synthetic */ class C4430v {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25571a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.onedelhi.secure.fw1[] r0 = com.onedelhi.secure.fw1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25571a = r0
                com.onedelhi.secure.fw1 r1 = com.onedelhi.secure.fw1.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25571a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.fw1 r1 = com.onedelhi.secure.fw1.STRING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25571a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.fw1 r1 = com.onedelhi.secure.fw1.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25571a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.fw1 r1 = com.onedelhi.secure.fw1.NULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25571a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.fw1 r1 = com.onedelhi.secure.fw1.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25571a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.fw1 r1 = com.onedelhi.secure.fw1.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25571a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.fw1 r1 = com.onedelhi.secure.fw1.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f25571a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.onedelhi.secure.fw1 r1 = com.onedelhi.secure.fw1.NAME     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f25571a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.onedelhi.secure.fw1 r1 = com.onedelhi.secure.fw1.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f25571a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.onedelhi.secure.fw1 r1 = com.onedelhi.secure.fw1.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.C4430v.<clinit>():void");
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$w */
    public class C4431w extends cj4<Boolean> {
        /* renamed from: j */
        public Boolean mo30144e(xv1 xv1) throws IOException {
            fw1 q0 = xv1.mo36944q0();
            if (q0 != fw1.NULL) {
                return q0 == fw1.STRING ? Boolean.valueOf(Boolean.parseBoolean(xv1.mo36942o0())) : Boolean.valueOf(xv1.mo36923M());
            }
            xv1.mo36940j0();
            return null;
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, Boolean bool) throws IOException {
            lw1.mo37578C0(bool);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$x */
    public class C4432x extends cj4<Boolean> {
        /* renamed from: j */
        public Boolean mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() != fw1.NULL) {
                return Boolean.valueOf(xv1.mo36942o0());
            }
            xv1.mo36940j0();
            return null;
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, Boolean bool) throws IOException {
            lw1.mo37580G0(bool == null ? "null" : bool.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$y */
    public class C4433y extends cj4<Number> {
        /* renamed from: j */
        public Number mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() == fw1.NULL) {
                xv1.mo36940j0();
                return null;
            }
            try {
                int Y = xv1.mo36927Y();
                if (Y <= 255 && Y >= -128) {
                    return Byte.valueOf((byte) Y);
                }
                throw new ew1("Lossy conversion from " + Y + " to byte; at path " + xv1.mo36943q());
            } catch (NumberFormatException e) {
                throw new ew1((Throwable) e);
            }
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, Number number) throws IOException {
            lw1.mo37579F0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$z */
    public class C4434z extends cj4<Number> {
        /* renamed from: j */
        public Number mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() == fw1.NULL) {
                xv1.mo36940j0();
                return null;
            }
            try {
                int Y = xv1.mo36927Y();
                if (Y <= 65535 && Y >= -32768) {
                    return Short.valueOf((short) Y);
                }
                throw new ew1("Lossy conversion from " + Y + " to short; at path " + xv1.mo36943q());
            } catch (NumberFormatException e) {
                throw new ew1((Throwable) e);
            }
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, Number number) throws IOException {
            lw1.mo37579F0(number);
        }
    }

    static {
        cj4<Class> d = new C4419k().mo32407d();
        f25499a = d;
        f25500a = m35364b(Class.class, d);
        cj4<BitSet> d2 = new C4429u().mo32407d();
        f25501b = d2;
        f25502b = m35364b(BitSet.class, d2);
        C4431w wVar = new C4431w();
        f25503c = wVar;
        f25504c = m35365c(Boolean.TYPE, Boolean.class, wVar);
        C4433y yVar = new C4433y();
        f25507e = yVar;
        f25506d = m35365c(Byte.TYPE, Byte.class, yVar);
        C4434z zVar = new C4434z();
        f25509f = zVar;
        f25508e = m35365c(Short.TYPE, Short.class, zVar);
        C4405a0 a0Var = new C4405a0();
        f25511g = a0Var;
        f25510f = m35365c(Integer.TYPE, Integer.class, a0Var);
        cj4<AtomicInteger> d3 = new C4407b0().mo32407d();
        f25513h = d3;
        f25512g = m35364b(AtomicInteger.class, d3);
        cj4<AtomicBoolean> d4 = new C4409c0().mo32407d();
        f25515i = d4;
        f25514h = m35364b(AtomicBoolean.class, d4);
        cj4<AtomicIntegerArray> d5 = new C4404a().mo32407d();
        f25517j = d5;
        f25516i = m35364b(AtomicIntegerArray.class, d5);
        C4413e eVar = new C4413e();
        f25525n = eVar;
        f25518j = m35365c(Character.TYPE, Character.class, eVar);
        C4414f fVar = new C4414f();
        f25527o = fVar;
        f25520k = m35364b(String.class, fVar);
        C4418j jVar = new C4418j();
        f25535s = jVar;
        f25522l = m35364b(StringBuilder.class, jVar);
        C4420l lVar = new C4420l();
        f25537t = lVar;
        f25524m = m35364b(StringBuffer.class, lVar);
        C4421m mVar = new C4421m();
        f25539u = mVar;
        f25526n = m35364b(URL.class, mVar);
        C4422n nVar = new C4422n();
        f25541v = nVar;
        f25528o = m35364b(URI.class, nVar);
        C4423o oVar = new C4423o();
        f25543w = oVar;
        f25530p = m35367e(InetAddress.class, oVar);
        C4424p pVar = new C4424p();
        f25544x = pVar;
        f25532q = m35364b(UUID.class, pVar);
        cj4<Currency> d6 = new C4425q().mo32407d();
        f25545y = d6;
        f25534r = m35364b(Currency.class, d6);
        C4426r rVar = new C4426r();
        f25546z = rVar;
        f25536s = m35366d(Calendar.class, GregorianCalendar.class, rVar);
        C4427s sVar = new C4427s();
        f25497A = sVar;
        f25538t = m35364b(Locale.class, sVar);
        C4428t tVar = new C4428t();
        f25498B = tVar;
        f25540u = m35367e(ov1.class, tVar);
    }

    public TypeAdapters() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static <TT> dj4 m35363a(final tj4<TT> tj4, final cj4<TT> cj4) {
        return new dj4() {
            /* renamed from: a */
            public <T> cj4<T> mo30126a(fj1 fj1, tj4<T> tj4) {
                if (tj4.equals(tj4.this)) {
                    return cj4;
                }
                return null;
            }
        };
    }

    /* renamed from: b */
    public static <TT> dj4 m35364b(final Class<TT> cls, final cj4<TT> cj4) {
        return new dj4() {
            /* renamed from: a */
            public <T> cj4<T> mo30126a(fj1 fj1, tj4<T> tj4) {
                if (tj4.getRawType() == cls) {
                    return cj4;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + cj4 + "]";
            }
        };
    }

    /* renamed from: c */
    public static <TT> dj4 m35365c(final Class<TT> cls, final Class<TT> cls2, final cj4<? super TT> cj4) {
        return new dj4() {
            /* renamed from: a */
            public <T> cj4<T> mo30126a(fj1 fj1, tj4<T> tj4) {
                Class<? super T> rawType = tj4.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return cj4;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + C3516si.f20377b + cls.getName() + ",adapter=" + cj4 + "]";
            }
        };
    }

    /* renamed from: d */
    public static <TT> dj4 m35366d(final Class<TT> cls, final Class<? extends TT> cls2, final cj4<? super TT> cj4) {
        return new dj4() {
            /* renamed from: a */
            public <T> cj4<T> mo30126a(fj1 fj1, tj4<T> tj4) {
                Class<? super T> rawType = tj4.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return cj4;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + C3516si.f20377b + cls2.getName() + ",adapter=" + cj4 + "]";
            }
        };
    }

    /* renamed from: e */
    public static <T1> dj4 m35367e(final Class<T1> cls, final cj4<T1> cj4) {
        return new dj4() {

            /* renamed from: com.google.gson.internal.bind.TypeAdapters$34$a */
            public class C4403a extends cj4<T1> {

                /* renamed from: a */
                public final /* synthetic */ Class f25560a;

                public C4403a(Class cls) {
                    this.f25560a = cls;
                }

                /* renamed from: e */
                public T1 mo30144e(xv1 xv1) throws IOException {
                    T1 e = cj4.mo30144e(xv1);
                    if (e == null || this.f25560a.isInstance(e)) {
                        return e;
                    }
                    throw new ew1("Expected a " + this.f25560a.getName() + " but was " + e.getClass().getName() + "; at path " + xv1.mo36943q());
                }

                /* renamed from: i */
                public void mo30145i(lw1 lw1, T1 t1) throws IOException {
                    cj4.mo30145i(lw1, t1);
                }
            }

            /* renamed from: a */
            public <T2> cj4<T2> mo30126a(fj1 fj1, tj4<T2> tj4) {
                Class<? super T2> rawType = tj4.getRawType();
                if (!cls.isAssignableFrom(rawType)) {
                    return null;
                }
                return new C4403a(rawType);
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + cj4 + "]";
            }
        };
    }
}
