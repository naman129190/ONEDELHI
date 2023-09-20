package com.onedelhi.secure;

import com.onedelhi.secure.ce2;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\n\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/onedelhi/secure/de2;", "Lcom/onedelhi/secure/ce2;", "X0", "Lcom/onedelhi/secure/is1;", "V0", "()Lcom/onedelhi/secure/is1;", "range", "", "T0", "()Ljava/lang/String;", "value", "Lcom/onedelhi/secure/ae2;", "groups", "Lcom/onedelhi/secure/ae2;", "Y0", "()Lcom/onedelhi/secure/ae2;", "", "W0", "()Ljava/util/List;", "groupValues", "Ljava/util/regex/MatchResult;", "b", "()Ljava/util/regex/MatchResult;", "matchResult", "Ljava/util/regex/Matcher;", "matcher", "", "input", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class de2 implements ce2 {
    @vr2

    /* renamed from: a */
    public final ae2 f27381a = new C4998b(this);
    @vr2

    /* renamed from: a */
    public final CharSequence f27382a;
    @ss2

    /* renamed from: a */
    public List<String> f27383a;
    @vr2

    /* renamed from: a */
    public final Matcher f27384a;

    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u0014\u0010\b\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"com/onedelhi/secure/de2$a", "Lcom/onedelhi/secure/t0;", "", "", "index", "g", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.de2$a */
    public static final class C4997a extends C6809t0<String> {

        /* renamed from: a */
        public final /* synthetic */ de2 f27385a;

        public C4997a(de2 de2) {
            this.f27385a = de2;
        }

        /* renamed from: b */
        public int mo34341b() {
            return this.f27385a.mo34340b().groupCount() + 1;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return mo34343f((String) obj);
        }

        /* renamed from: f */
        public /* bridge */ boolean mo34343f(String str) {
            return super.contains(str);
        }

        @vr2
        /* renamed from: g */
        public String get(int i) {
            String group = this.f27385a.mo34340b().group(i);
            return group == null ? "" : group;
        }

        /* renamed from: i */
        public /* bridge */ int mo34346i(String str) {
            return super.indexOf(str);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return mo34346i((String) obj);
        }

        /* renamed from: j */
        public /* bridge */ int mo34348j(String str) {
            return super.lastIndexOf(str);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return mo34348j((String) obj);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0011\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006H\u0002J\u0013\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\u0013\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0014\u0010\u0010\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"com/onedelhi/secure/de2$b", "Lcom/onedelhi/secure/be2;", "Lcom/onedelhi/secure/k0;", "Lcom/onedelhi/secure/zd2;", "", "isEmpty", "", "iterator", "", "index", "G1", "", "name", "K", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.de2$b */
    public static final class C4998b extends C5858k0<zd2> implements be2 {

        /* renamed from: a */
        public final /* synthetic */ de2 f27386a;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/onedelhi/secure/zd2;", "a", "(I)Lcom/onedelhi/secure/zd2;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: com.onedelhi.secure.de2$b$a */
        public static final class C4999a extends d12 implements ec1<Integer, zd2> {

            /* renamed from: a */
            public final /* synthetic */ C4998b f27387a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4999a(C4998b bVar) {
                super(1);
                this.f27387a = bVar;
            }

            /* renamed from: X */
            public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
                return mo34353a(((Number) obj).intValue());
            }

            @ss2
            /* renamed from: a */
            public final zd2 mo34353a(int i) {
                return this.f27387a.mo30890G1(i);
            }
        }

        public C4998b(de2 de2) {
            this.f27386a = de2;
        }

        @ss2
        /* renamed from: G1 */
        public zd2 mo30890G1(int i) {
            is1 d = gh3.m49495j(this.f27386a.mo34340b(), i);
            if (d.mo27428i().intValue() < 0) {
                return null;
            }
            String group = this.f27386a.mo34340b().group(i);
            jt1.m53776o(group, "matchResult.group(index)");
            return new zd2(group, d);
        }

        @ss2
        /* renamed from: K */
        public zd2 mo31557K(@vr2 String str) {
            jt1.m53777p(str, "name");
            return o23.f32878a.mo38245c(this.f27386a.mo34340b(), str);
        }

        /* renamed from: b */
        public int mo34341b() {
            return this.f27386a.mo34340b().groupCount() + 1;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj == null ? true : obj instanceof zd2)) {
                return false;
            }
            return mo34350f((zd2) obj);
        }

        /* renamed from: f */
        public /* bridge */ boolean mo34350f(zd2 zd2) {
            return super.contains(zd2);
        }

        public boolean isEmpty() {
            return false;
        }

        @vr2
        public Iterator<zd2> iterator() {
            return hu3.m51041k1(a10.m35912v1(s00.m64038G(this)), new C4999a(this)).iterator();
        }
    }

    public de2(@vr2 Matcher matcher, @vr2 CharSequence charSequence) {
        jt1.m53777p(matcher, "matcher");
        jt1.m53777p(charSequence, "input");
        this.f27384a = matcher;
        this.f27382a = charSequence;
    }

    @vr2
    /* renamed from: T0 */
    public String mo32308T0() {
        String group = mo34340b().group();
        jt1.m53776o(group, "matchResult.group()");
        return group;
    }

    @vr2
    /* renamed from: U0 */
    public ce2.C4751b mo32309U0() {
        return ce2.C4750a.m40836a(this);
    }

    @vr2
    /* renamed from: V0 */
    public is1 mo32310V0() {
        return gh3.m49494i(mo34340b());
    }

    @vr2
    /* renamed from: W0 */
    public List<String> mo32311W0() {
        if (this.f27383a == null) {
            this.f27383a = new C4997a(this);
        }
        List<String> list = this.f27383a;
        jt1.m53774m(list);
        return list;
    }

    @ss2
    /* renamed from: X0 */
    public ce2 mo32312X0() {
        int end = mo34340b().end() + (mo34340b().end() == mo34340b().start() ? 1 : 0);
        if (end > this.f27382a.length()) {
            return null;
        }
        Matcher matcher = this.f27384a.pattern().matcher(this.f27382a);
        jt1.m53776o(matcher, "matcher.pattern().matcher(input)");
        return gh3.m49491f(matcher, end, this.f27382a);
    }

    @vr2
    /* renamed from: Y0 */
    public ae2 mo32313Y0() {
        return this.f27381a;
    }

    /* renamed from: b */
    public final MatchResult mo34340b() {
        return this.f27384a;
    }
}
