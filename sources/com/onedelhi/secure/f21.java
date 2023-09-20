package com.onedelhi.secure;

import com.onedelhi.secure.c22;
import com.onedelhi.secure.f21.C5210c;
import com.onedelhi.secure.vs1;
import com.onedelhi.secure.wx4;
import com.onedelhi.secure.yh2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class f21<T extends C5210c<T>> {

    /* renamed from: a */
    public static final int f28147a = 16;

    /* renamed from: a */
    public static final f21 f28148a = new f21(true);

    /* renamed from: a */
    public final h04<T, Object> f28149a;

    /* renamed from: a */
    public boolean f28150a;

    /* renamed from: b */
    public boolean f28151b;

    /* renamed from: com.onedelhi.secure.f21$a */
    public static /* synthetic */ class C5208a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28152a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f28153b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                com.onedelhi.secure.wx4$b[] r0 = com.onedelhi.secure.wx4.C7195b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28153b = r0
                r1 = 1
                com.onedelhi.secure.wx4$b r2 = com.onedelhi.secure.wx4.C7195b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f28153b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.wx4$b r3 = com.onedelhi.secure.wx4.C7195b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f28153b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.wx4$b r4 = com.onedelhi.secure.wx4.C7195b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f28153b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.wx4$b r5 = com.onedelhi.secure.wx4.C7195b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f28153b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.wx4$b r6 = com.onedelhi.secure.wx4.C7195b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f28153b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.wx4$b r7 = com.onedelhi.secure.wx4.C7195b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f28153b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.wx4$b r8 = com.onedelhi.secure.wx4.C7195b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f28153b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.onedelhi.secure.wx4$b r9 = com.onedelhi.secure.wx4.C7195b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f28153b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.onedelhi.secure.wx4$b r10 = com.onedelhi.secure.wx4.C7195b.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f28153b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.onedelhi.secure.wx4$b r10 = com.onedelhi.secure.wx4.C7195b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f28153b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.onedelhi.secure.wx4$b r10 = com.onedelhi.secure.wx4.C7195b.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f28153b     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.onedelhi.secure.wx4$b r10 = com.onedelhi.secure.wx4.C7195b.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f28153b     // Catch:{ NoSuchFieldError -> 0x009c }
                com.onedelhi.secure.wx4$b r10 = com.onedelhi.secure.wx4.C7195b.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f28153b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.onedelhi.secure.wx4$b r10 = com.onedelhi.secure.wx4.C7195b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f28153b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.onedelhi.secure.wx4$b r10 = com.onedelhi.secure.wx4.C7195b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f28153b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.onedelhi.secure.wx4$b r10 = com.onedelhi.secure.wx4.C7195b.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f28153b     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.onedelhi.secure.wx4$b r10 = com.onedelhi.secure.wx4.C7195b.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f28153b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.onedelhi.secure.wx4$b r10 = com.onedelhi.secure.wx4.C7195b.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                com.onedelhi.secure.wx4$c[] r9 = com.onedelhi.secure.wx4.C7200c.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f28152a = r9
                com.onedelhi.secure.wx4$c r10 = com.onedelhi.secure.wx4.C7200c.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f28152a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                com.onedelhi.secure.wx4$c r9 = com.onedelhi.secure.wx4.C7200c.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f28152a     // Catch:{ NoSuchFieldError -> 0x00fd }
                com.onedelhi.secure.wx4$c r1 = com.onedelhi.secure.wx4.C7200c.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f28152a     // Catch:{ NoSuchFieldError -> 0x0107 }
                com.onedelhi.secure.wx4$c r1 = com.onedelhi.secure.wx4.C7200c.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f28152a     // Catch:{ NoSuchFieldError -> 0x0111 }
                com.onedelhi.secure.wx4$c r1 = com.onedelhi.secure.wx4.C7200c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f28152a     // Catch:{ NoSuchFieldError -> 0x011b }
                com.onedelhi.secure.wx4$c r1 = com.onedelhi.secure.wx4.C7200c.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f28152a     // Catch:{ NoSuchFieldError -> 0x0125 }
                com.onedelhi.secure.wx4$c r1 = com.onedelhi.secure.wx4.C7200c.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f28152a     // Catch:{ NoSuchFieldError -> 0x012f }
                com.onedelhi.secure.wx4$c r1 = com.onedelhi.secure.wx4.C7200c.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f28152a     // Catch:{ NoSuchFieldError -> 0x0139 }
                com.onedelhi.secure.wx4$c r1 = com.onedelhi.secure.wx4.C7200c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.f21.C5208a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.f21$b */
    public static final class C5209b<T extends C5210c<T>> {

        /* renamed from: a */
        public h04<T, Object> f28154a;

        /* renamed from: a */
        public boolean f28155a;

        /* renamed from: b */
        public boolean f28156b;

        /* renamed from: c */
        public boolean f28157c;

        public C5209b() {
            this(h04.m50065v(16));
        }

        public /* synthetic */ C5209b(C5208a aVar) {
            this();
        }

        public C5209b(h04<T, Object> h04) {
            this.f28154a = h04;
            this.f28156b = true;
        }

        /* renamed from: e */
        public static <T extends C5210c<T>> C5209b<T> m47513e(f21<T> f21) {
            C5209b<T> bVar = new C5209b<>(f21.m47480l(f21.f28149a, true));
            bVar.f28155a = f21.f28151b;
            return bVar;
        }

        /* renamed from: p */
        public static Object m47514p(Object obj) {
            return obj instanceof yh2.C7362a ? ((yh2.C7362a) obj).mo43381ab() : obj;
        }

        /* renamed from: q */
        public static <T extends C5210c<T>> Object m47515q(T t, Object obj) {
            if (obj == null || t.mo35765k() != wx4.C7200c.MESSAGE) {
                return obj;
            }
            if (!t.mo35766m()) {
                return m47514p(obj);
            }
            if (obj instanceof List) {
                List list = (List) obj;
                for (int i = 0; i < list.size(); i++) {
                    Object obj2 = list.get(i);
                    Object p = m47514p(obj2);
                    if (p != obj2) {
                        if (list == obj) {
                            list = new ArrayList(list);
                        }
                        list.set(i, p);
                    }
                }
                return list;
            }
            throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
        }

        /* renamed from: r */
        public static <T extends C5210c<T>> void m47516r(h04<T, Object> h04) {
            for (int i = 0; i < h04.mo37058o(); i++) {
                m47517s(h04.mo37057n(i));
            }
            for (Map.Entry<T, Object> s : h04.mo37061q()) {
                m47517s(s);
            }
        }

        /* renamed from: s */
        public static <T extends C5210c<T>> void m47517s(Map.Entry<T, Object> entry) {
            entry.setValue(m47515q((C5210c) entry.getKey(), entry.getValue()));
        }

        /* renamed from: a */
        public void mo35745a(T t, Object obj) {
            List list;
            mo35748d();
            if (t.mo35766m()) {
                this.f28157c = this.f28157c || (obj instanceof yh2.C7362a);
                mo35761v(t, obj);
                Object g = mo35750g(t);
                if (g == null) {
                    list = new ArrayList();
                    this.f28154a.put(t, list);
                } else {
                    list = (List) g;
                }
                list.add(obj);
                return;
            }
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }

        /* renamed from: b */
        public f21<T> mo35746b() {
            if (this.f28154a.isEmpty()) {
                return f21.m47486s();
            }
            this.f28156b = false;
            h04<T, Object> h04 = this.f28154a;
            if (this.f28157c) {
                h04 = f21.m47480l(h04, false);
                m47516r(h04);
            }
            f21<T> f21 = new f21<>(h04, (C5208a) null);
            boolean unused = f21.f28151b = this.f28155a;
            return f21;
        }

        /* renamed from: c */
        public void mo35747c(T t) {
            mo35748d();
            this.f28154a.remove(t);
            if (this.f28154a.isEmpty()) {
                this.f28155a = false;
            }
        }

        /* renamed from: d */
        public final void mo35748d() {
            if (!this.f28156b) {
                this.f28154a = f21.m47480l(this.f28154a, true);
                this.f28156b = true;
            }
        }

        /* renamed from: f */
        public Map<T, Object> mo35749f() {
            if (!this.f28155a) {
                return this.f28154a.mo37066t() ? this.f28154a : Collections.unmodifiableMap(this.f28154a);
            }
            h04 a = f21.m47480l(this.f28154a, false);
            if (this.f28154a.mo37066t()) {
                a.mo37067u();
            } else {
                m47516r(a);
            }
            return a;
        }

        /* renamed from: g */
        public Object mo35750g(T t) {
            return m47515q(t, mo35751h(t));
        }

        /* renamed from: h */
        public Object mo35751h(T t) {
            Object obj = this.f28154a.get(t);
            return obj instanceof c22 ? ((c22) obj).mo32216p() : obj;
        }

        /* renamed from: i */
        public Object mo35752i(T t, int i) {
            if (this.f28157c) {
                mo35748d();
            }
            return m47514p(mo35753j(t, i));
        }

        /* renamed from: j */
        public Object mo35753j(T t, int i) {
            if (t.mo35766m()) {
                Object h = mo35751h(t);
                if (h != null) {
                    return ((List) h).get(i);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        /* renamed from: k */
        public int mo35754k(T t) {
            if (t.mo35766m()) {
                Object g = mo35750g(t);
                if (g == null) {
                    return 0;
                }
                return ((List) g).size();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        /* renamed from: l */
        public boolean mo35755l(T t) {
            if (!t.mo35766m()) {
                return this.f28154a.get(t) != null;
            }
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }

        /* renamed from: m */
        public boolean mo35756m() {
            for (int i = 0; i < this.f28154a.mo37058o(); i++) {
                if (!f21.m47465F(this.f28154a.mo37057n(i))) {
                    return false;
                }
            }
            for (Map.Entry<T, Object> f : this.f28154a.mo37061q()) {
                if (!f21.m47465F(f)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: n */
        public void mo35757n(f21<T> f21) {
            mo35748d();
            for (int i = 0; i < f21.f28149a.mo37058o(); i++) {
                mo35758o(f21.f28149a.mo37057n(i));
            }
            for (Map.Entry o : f21.f28149a.mo37061q()) {
                mo35758o(o);
            }
        }

        /* renamed from: o */
        public final void mo35758o(Map.Entry<T, Object> entry) {
            Object obj;
            h04<T, Object> h04;
            Object g;
            C5210c cVar = (C5210c) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof c22) {
                value = ((c22) value).mo32216p();
            }
            if (cVar.mo35766m()) {
                Object g2 = mo35750g(cVar);
                if (g2 == null) {
                    g2 = new ArrayList();
                }
                for (Object g3 : (List) value) {
                    ((List) g2).add(f21.m47482n(g3));
                }
                this.f28154a.put(cVar, g2);
                return;
            }
            if (cVar.mo35765k() != wx4.C7200c.MESSAGE || (g = mo35750g(cVar)) == null) {
                h04 = this.f28154a;
                obj = f21.m47482n(value);
            } else if (g instanceof yh2.C7362a) {
                cVar.mo35768p((yh2.C7362a) g, (yh2) value);
                return;
            } else {
                obj = cVar.mo35768p(((yh2) g).mo43349Ud(), (yh2) value).mo43381ab();
                h04 = this.f28154a;
            }
            h04.put(cVar, obj);
        }

        /* renamed from: t */
        public void mo35759t(T t, Object obj) {
            mo35748d();
            boolean z = false;
            if (!t.mo35766m()) {
                mo35761v(t, obj);
            } else if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object next : arrayList) {
                    mo35761v(t, next);
                    this.f28157c = this.f28157c || (next instanceof yh2.C7362a);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            if (obj instanceof c22) {
                this.f28155a = true;
            }
            if (this.f28157c || (obj instanceof yh2.C7362a)) {
                z = true;
            }
            this.f28157c = z;
            this.f28154a.put(t, obj);
        }

        /* renamed from: u */
        public void mo35760u(T t, int i, Object obj) {
            mo35748d();
            if (t.mo35766m()) {
                this.f28157c = this.f28157c || (obj instanceof yh2.C7362a);
                Object g = mo35750g(t);
                if (g != null) {
                    mo35761v(t, obj);
                    ((List) g).set(i, obj);
                    return;
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        /* renamed from: v */
        public final void mo35761v(T t, Object obj) {
            if (f21.m47466G(t.mo35762h(), obj)) {
                return;
            }
            if (t.mo35762h().mo46917a() != wx4.C7200c.MESSAGE || !(obj instanceof yh2.C7362a)) {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.mo35764j()), t.mo35762h().mo46917a(), obj.getClass().getName()}));
            }
        }
    }

    /* renamed from: com.onedelhi.secure.f21$c */
    public interface C5210c<T extends C5210c<T>> extends Comparable<T> {
        /* renamed from: h */
        wx4.C7195b mo35762h();

        /* renamed from: i */
        boolean mo35763i();

        /* renamed from: j */
        int mo35764j();

        /* renamed from: k */
        wx4.C7200c mo35765k();

        /* renamed from: m */
        boolean mo35766m();

        /* renamed from: n */
        vs1.C7082d<?> mo35767n();

        /* renamed from: p */
        yh2.C7362a mo35768p(yh2.C7362a aVar, yh2 yh2);
    }

    public f21() {
        this.f28149a = h04.m50065v(16);
    }

    public f21(h04<T, Object> h04) {
        this.f28149a = h04;
        mo35721I();
    }

    public /* synthetic */ f21(h04 h04, C5208a aVar) {
        this(h04);
    }

    public f21(boolean z) {
        this(h04.m50065v(0));
        mo35721I();
    }

    /* renamed from: A */
    public static int m47464A(wx4.C7195b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.mo46918b();
    }

    /* renamed from: F */
    public static <T extends C5210c<T>> boolean m47465F(Map.Entry<T, Object> entry) {
        C5210c cVar = (C5210c) entry.getKey();
        if (cVar.mo35765k() == wx4.C7200c.MESSAGE) {
            boolean m = cVar.mo35766m();
            Object value = entry.getValue();
            if (m) {
                for (yh2 N1 : (List) value) {
                    if (!N1.mo43347N1()) {
                        return false;
                    }
                }
            } else if (value instanceof yh2) {
                if (!((yh2) value).mo43347N1()) {
                    return false;
                }
            } else if (value instanceof c22) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: G */
    public static boolean m47466G(wx4.C7195b bVar, Object obj) {
        vs1.m68432d(obj);
        switch (C5208a.f28152a[bVar.mo46917a().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof C5173er) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof vs1.C7081c);
            case 9:
                return (obj instanceof yh2) || (obj instanceof c22);
            default:
                return false;
        }
    }

    /* renamed from: L */
    public static <T extends C5210c<T>> C5209b<T> m47467L() {
        return new C5209b<>((C5208a) null);
    }

    /* renamed from: M */
    public static <T extends C5210c<T>> f21<T> m47468M() {
        return new f21<>();
    }

    /* renamed from: N */
    public static Object m47469N(g00 g00, wx4.C7195b bVar, boolean z) throws IOException {
        return wx4.m69701d(g00, bVar, z ? wx4.C7201d.STRICT : wx4.C7201d.LOOSE);
    }

    /* renamed from: R */
    public static void m47470R(i00 i00, wx4.C7195b bVar, int i, Object obj) throws IOException {
        if (bVar == wx4.C7195b.GROUP) {
            i00.mo37740F1(i, (yh2) obj);
            return;
        }
        i00.mo37776g2(i, m47464A(bVar, false));
        m47471S(i00, bVar, obj);
    }

    /* renamed from: S */
    public static void m47471S(i00 i00, wx4.C7195b bVar, Object obj) throws IOException {
        switch (C5208a.f28153b[bVar.ordinal()]) {
            case 1:
                i00.mo37733A1(((Double) obj).doubleValue());
                return;
            case 2:
                i00.mo37739E1(((Float) obj).floatValue());
                return;
            case 3:
                i00.mo37745K1(((Long) obj).longValue());
                return;
            case 4:
                i00.mo37781i2(((Long) obj).longValue());
                return;
            case 5:
                i00.mo37744J1(((Integer) obj).intValue());
                return;
            case 6:
                i00.mo37738D1(((Long) obj).longValue());
                return;
            case 7:
                i00.mo37736C1(((Integer) obj).intValue());
                return;
            case 8:
                i00.mo37789t1(((Boolean) obj).booleanValue());
                return;
            case 9:
                i00.mo37742H1((yh2) obj);
                return;
            case 10:
                i00.mo37749N1((yh2) obj);
                return;
            case 11:
                if (!(obj instanceof C5173er)) {
                    i00.mo37774f2((String) obj);
                    return;
                }
                break;
            case 12:
                if (!(obj instanceof C5173er)) {
                    i00.mo37793w1((byte[]) obj);
                    return;
                }
                break;
            case 13:
                i00.mo37779h2(((Integer) obj).intValue());
                return;
            case 14:
                i00.mo37765b2(((Integer) obj).intValue());
                return;
            case 15:
                i00.mo37767c2(((Long) obj).longValue());
                return;
            case 16:
                i00.mo37769d2(((Integer) obj).intValue());
                return;
            case 17:
                i00.mo37771e2(((Long) obj).longValue());
                return;
            case 18:
                i00.mo37735B1(obj instanceof vs1.C7081c ? ((vs1.C7081c) obj).mo32392j() : ((Integer) obj).intValue());
                return;
            default:
                return;
        }
        i00.mo37796z1((C5173er) obj);
    }

    /* renamed from: T */
    public static void m47472T(C5210c<?> cVar, Object obj, i00 i00) throws IOException {
        wx4.C7195b h = cVar.mo35762h();
        int j = cVar.mo35764j();
        if (cVar.mo35766m()) {
            List<Object> list = (List) obj;
            if (cVar.mo35763i()) {
                i00.mo37776g2(j, 2);
                int i = 0;
                for (Object p : list) {
                    i += m47484p(h, p);
                }
                i00.mo37762Z1(i);
                for (Object S : list) {
                    m47471S(i00, h, S);
                }
                return;
            }
            for (Object R : list) {
                m47470R(i00, h, j, R);
            }
        } else if (obj instanceof c22) {
            m47470R(i00, h, j, ((c22) obj).mo32216p());
        } else {
            m47470R(i00, h, j, obj);
        }
    }

    /* renamed from: l */
    public static <T extends C5210c<T>> h04<T, Object> m47480l(h04<T, Object> h04, boolean z) {
        h04<T, Object> v = h04.m50065v(16);
        for (int i = 0; i < h04.mo37058o(); i++) {
            m47481m(v, h04.mo37057n(i), z);
        }
        for (Map.Entry<T, Object> m : h04.mo37061q()) {
            m47481m(v, m, z);
        }
        return v;
    }

    /* renamed from: m */
    public static <T extends C5210c<T>> void m47481m(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z) {
        C5210c cVar = (C5210c) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof c22) {
            value = ((c22) value).mo32216p();
        } else if (z && (value instanceof List)) {
            map.put(cVar, new ArrayList((List) value));
            return;
        }
        map.put(cVar, value);
    }

    /* renamed from: n */
    public static Object m47482n(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: o */
    public static int m47483o(wx4.C7195b bVar, int i, Object obj) {
        int X0 = i00.m51411X0(i);
        if (bVar == wx4.C7195b.GROUP) {
            X0 *= 2;
        }
        return X0 + m47484p(bVar, obj);
    }

    /* renamed from: p */
    public static int m47484p(wx4.C7195b bVar, Object obj) {
        switch (C5208a.f28153b[bVar.ordinal()]) {
            case 1:
                return i00.m51429j0(((Double) obj).doubleValue());
            case 2:
                return i00.m51445r0(((Float) obj).floatValue());
            case 3:
                return i00.m51453z0(((Long) obj).longValue());
            case 4:
                return i00.m51418b1(((Long) obj).longValue());
            case 5:
                return i00.m51451x0(((Integer) obj).intValue());
            case 6:
                return i00.m51441p0(((Long) obj).longValue());
            case 7:
                return i00.m51437n0(((Integer) obj).intValue());
            case 8:
                return i00.m51417b0(((Boolean) obj).booleanValue());
            case 9:
                return i00.m51448u0((yh2) obj);
            case 10:
                return obj instanceof c22 ? i00.m51390C0((c22) obj) : i00.m51395H0((yh2) obj);
            case 11:
                return obj instanceof C5173er ? i00.m51426h0((C5173er) obj) : i00.m51410W0((String) obj);
            case 12:
                return obj instanceof C5173er ? i00.m51426h0((C5173er) obj) : i00.m51421d0((byte[]) obj);
            case 13:
                return i00.m51414Z0(((Integer) obj).intValue());
            case 14:
                return i00.m51402O0(((Integer) obj).intValue());
            case 15:
                return i00.m51404Q0(((Long) obj).longValue());
            case 16:
                return i00.m51406S0(((Integer) obj).intValue());
            case 17:
                return i00.m51408U0(((Long) obj).longValue());
            case 18:
                return obj instanceof vs1.C7081c ? i00.m51433l0(((vs1.C7081c) obj).mo32392j()) : i00.m51433l0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: q */
    public static int m47485q(C5210c<?> cVar, Object obj) {
        wx4.C7195b h = cVar.mo35762h();
        int j = cVar.mo35764j();
        if (!cVar.mo35766m()) {
            return m47483o(h, j, obj);
        }
        int i = 0;
        List<Object> list = (List) obj;
        if (cVar.mo35763i()) {
            for (Object p : list) {
                i += m47484p(h, p);
            }
            return i00.m51411X0(j) + i + i00.m51399L0(i);
        }
        for (Object o : list) {
            i += m47483o(h, j, o);
        }
        return i;
    }

    /* renamed from: s */
    public static <T extends C5210c<T>> f21<T> m47486s() {
        return f28148a;
    }

    /* renamed from: B */
    public boolean mo35716B(T t) {
        if (!t.mo35766m()) {
            return this.f28149a.get(t) != null;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    /* renamed from: C */
    public boolean mo35717C() {
        return this.f28149a.isEmpty();
    }

    /* renamed from: D */
    public boolean mo35718D() {
        return this.f28150a;
    }

    /* renamed from: E */
    public boolean mo35719E() {
        for (int i = 0; i < this.f28149a.mo37058o(); i++) {
            if (!m47465F(this.f28149a.mo37057n(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> F : this.f28149a.mo37061q()) {
            if (!m47465F(F)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    public Iterator<Map.Entry<T, Object>> mo35720H() {
        return this.f28151b ? new c22.C4726c(this.f28149a.entrySet().iterator()) : this.f28149a.entrySet().iterator();
    }

    /* renamed from: I */
    public void mo35721I() {
        if (!this.f28150a) {
            this.f28149a.mo37067u();
            this.f28150a = true;
        }
    }

    /* renamed from: J */
    public void mo35722J(f21<T> f21) {
        for (int i = 0; i < f21.f28149a.mo37058o(); i++) {
            mo35723K(f21.f28149a.mo37057n(i));
        }
        for (Map.Entry<T, Object> K : f21.f28149a.mo37061q()) {
            mo35723K(K);
        }
    }

    /* renamed from: K */
    public final void mo35723K(Map.Entry<T, Object> entry) {
        Object obj;
        h04<T, Object> h04;
        Object u;
        C5210c cVar = (C5210c) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof c22) {
            value = ((c22) value).mo32216p();
        }
        if (cVar.mo35766m()) {
            Object u2 = mo35739u(cVar);
            if (u2 == null) {
                u2 = new ArrayList();
            }
            for (Object n : (List) value) {
                ((List) u2).add(m47482n(n));
            }
            this.f28149a.put(cVar, u2);
            return;
        }
        if (cVar.mo35765k() != wx4.C7200c.MESSAGE || (u = mo35739u(cVar)) == null) {
            h04 = this.f28149a;
            obj = m47482n(value);
        } else {
            obj = cVar.mo35768p(((yh2) u).mo43349Ud(), (yh2) value).mo43381ab();
            h04 = this.f28149a;
        }
        h04.put(cVar, obj);
    }

    /* renamed from: O */
    public void mo35724O(T t, Object obj) {
        if (!t.mo35766m()) {
            mo35726Q(t, obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object Q : arrayList) {
                mo35726Q(t, Q);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof c22) {
            this.f28151b = true;
        }
        this.f28149a.put(t, obj);
    }

    /* renamed from: P */
    public void mo35725P(T t, int i, Object obj) {
        if (t.mo35766m()) {
            Object u = mo35739u(t);
            if (u != null) {
                mo35726Q(t, obj);
                ((List) u).set(i, obj);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: Q */
    public final void mo35726Q(T t, Object obj) {
        if (!m47466G(t.mo35762h(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.mo35764j()), t.mo35762h().mo46917a(), obj.getClass().getName()}));
        }
    }

    /* renamed from: U */
    public void mo35727U(i00 i00) throws IOException {
        for (int i = 0; i < this.f28149a.mo37058o(); i++) {
            mo35728V(this.f28149a.mo37057n(i), i00);
        }
        for (Map.Entry<T, Object> V : this.f28149a.mo37061q()) {
            mo35728V(V, i00);
        }
    }

    /* renamed from: V */
    public final void mo35728V(Map.Entry<T, Object> entry, i00 i00) throws IOException {
        C5210c cVar = (C5210c) entry.getKey();
        if (cVar.mo35765k() != wx4.C7200c.MESSAGE || cVar.mo35766m() || cVar.mo35763i()) {
            m47472T(cVar, entry.getValue(), i00);
            return;
        }
        Object value = entry.getValue();
        if (value instanceof c22) {
            value = ((c22) value).mo32216p();
        }
        i00.mo37751P1(((C5210c) entry.getKey()).mo35764j(), (yh2) value);
    }

    /* renamed from: W */
    public void mo35729W(i00 i00) throws IOException {
        for (int i = 0; i < this.f28149a.mo37058o(); i++) {
            Map.Entry<T, Object> n = this.f28149a.mo37057n(i);
            m47472T((C5210c) n.getKey(), n.getValue(), i00);
        }
        for (Map.Entry next : this.f28149a.mo37061q()) {
            m47472T((C5210c) next.getKey(), next.getValue(), i00);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f21)) {
            return false;
        }
        return this.f28149a.equals(((f21) obj).f28149a);
    }

    /* renamed from: h */
    public void mo35732h(T t, Object obj) {
        List list;
        if (t.mo35766m()) {
            mo35726Q(t, obj);
            Object u = mo35739u(t);
            if (u == null) {
                list = new ArrayList();
                this.f28149a.put(t, list);
            } else {
                list = (List) u;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public int hashCode() {
        return this.f28149a.hashCode();
    }

    /* renamed from: i */
    public void mo35734i() {
        this.f28149a.clear();
        this.f28151b = false;
    }

    /* renamed from: j */
    public void mo35735j(T t) {
        this.f28149a.remove(t);
        if (this.f28149a.isEmpty()) {
            this.f28151b = false;
        }
    }

    /* renamed from: k */
    public f21<T> clone() {
        f21<T> M = m47468M();
        for (int i = 0; i < this.f28149a.mo37058o(); i++) {
            Map.Entry<T, Object> n = this.f28149a.mo37057n(i);
            M.mo35724O((C5210c) n.getKey(), n.getValue());
        }
        for (Map.Entry next : this.f28149a.mo37061q()) {
            M.mo35724O((C5210c) next.getKey(), next.getValue());
        }
        M.f28151b = this.f28151b;
        return M;
    }

    /* renamed from: r */
    public Iterator<Map.Entry<T, Object>> mo35737r() {
        return this.f28151b ? new c22.C4726c(this.f28149a.mo37055l().iterator()) : this.f28149a.mo37055l().iterator();
    }

    /* renamed from: t */
    public Map<T, Object> mo35738t() {
        if (!this.f28151b) {
            return this.f28149a.mo37066t() ? this.f28149a : Collections.unmodifiableMap(this.f28149a);
        }
        h04<T, Object> l = m47480l(this.f28149a, false);
        if (this.f28149a.mo37066t()) {
            l.mo37067u();
        }
        return l;
    }

    /* renamed from: u */
    public Object mo35739u(T t) {
        Object obj = this.f28149a.get(t);
        return obj instanceof c22 ? ((c22) obj).mo32216p() : obj;
    }

    /* renamed from: v */
    public int mo35740v() {
        int i = 0;
        for (int i2 = 0; i2 < this.f28149a.mo37058o(); i2++) {
            i += mo35741w(this.f28149a.mo37057n(i2));
        }
        for (Map.Entry<T, Object> w : this.f28149a.mo37061q()) {
            i += mo35741w(w);
        }
        return i;
    }

    /* renamed from: w */
    public final int mo35741w(Map.Entry<T, Object> entry) {
        C5210c cVar = (C5210c) entry.getKey();
        Object value = entry.getValue();
        if (cVar.mo35765k() != wx4.C7200c.MESSAGE || cVar.mo35766m() || cVar.mo35763i()) {
            return m47485q(cVar, value);
        }
        boolean z = value instanceof c22;
        int j = ((C5210c) entry.getKey()).mo35764j();
        return z ? i00.m51388A0(j, (c22) value) : i00.m51392E0(j, (yh2) value);
    }

    /* renamed from: x */
    public Object mo35742x(T t, int i) {
        if (t.mo35766m()) {
            Object u = mo35739u(t);
            if (u != null) {
                return ((List) u).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: y */
    public int mo35743y(T t) {
        if (t.mo35766m()) {
            Object u = mo35739u(t);
            if (u == null) {
                return 0;
            }
            return ((List) u).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: z */
    public int mo35744z() {
        int i = 0;
        for (int i2 = 0; i2 < this.f28149a.mo37058o(); i2++) {
            Map.Entry<T, Object> n = this.f28149a.mo37057n(i2);
            i += m47485q((C5210c) n.getKey(), n.getValue());
        }
        for (Map.Entry next : this.f28149a.mo37061q()) {
            i += m47485q((C5210c) next.getKey(), next.getValue());
        }
        return i;
    }
}
