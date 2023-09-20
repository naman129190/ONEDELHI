package com.onedelhi.secure;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00021\u0007B\u0011\b\u0001\u0012\u0006\u0010*\u001a\u00020\u001e¢\u0006\u0004\b+\u0010,B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0012¢\u0006\u0004\b+\u0010-B\u0019\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0012\u0012\u0006\u0010.\u001a\u00020&¢\u0006\u0004\b+\u0010/B\u001f\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0012\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b+\u00100J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0004J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u0003J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\bH\u0007J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\bH\u0007J\u0016\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012J\"\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0015J\u0016\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\bJ \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\bH\u0007J\b\u0010\u001d\u001a\u00020\u0012H\u0016J\u0006\u0010\u001f\u001a\u00020\u001eJ\b\u0010!\u001a\u00020 H\u0002R\u0011\u0010$\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u00062"}, d2 = {"Lcom/onedelhi/secure/eh3;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "input", "", "k", "b", "", "startIndex", "Lcom/onedelhi/secure/ce2;", "c", "Lcom/onedelhi/secure/zt3;", "e", "j", "index", "i", "l", "", "replacement", "n", "Lkotlin/Function1;", "transform", "m", "o", "limit", "", "p", "r", "toString", "Ljava/util/regex/Pattern;", "t", "", "u", "h", "()Ljava/lang/String;", "pattern", "", "Lcom/onedelhi/secure/hh3;", "g", "()Ljava/util/Set;", "options", "nativePattern", "<init>", "(Ljava/util/regex/Pattern;)V", "(Ljava/lang/String;)V", "option", "(Ljava/lang/String;Lcom/onedelhi/secure/hh3;)V", "(Ljava/lang/String;Ljava/util/Set;)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class eh3 implements Serializable {
    @vr2

    /* renamed from: a */
    public static final C5146a f27928a = new C5146a((wg0) null);
    @ss2

    /* renamed from: a */
    public Set<? extends hh3> f27929a;
    @vr2

    /* renamed from: a */
    public final Pattern f27930a;

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/eh3$a;", "", "", "literal", "Lcom/onedelhi/secure/eh3;", "e", "c", "d", "", "flags", "b", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.eh3$a */
    public static final class C5146a {
        public C5146a() {
        }

        public /* synthetic */ C5146a(wg0 wg0) {
            this();
        }

        /* renamed from: b */
        public final int mo35389b(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }

        @vr2
        /* renamed from: c */
        public final String mo35390c(@vr2 String str) {
            jt1.m53777p(str, "literal");
            String quote = Pattern.quote(str);
            jt1.m53776o(quote, "quote(literal)");
            return quote;
        }

        @vr2
        /* renamed from: d */
        public final String mo35391d(@vr2 String str) {
            jt1.m53777p(str, "literal");
            String quoteReplacement = Matcher.quoteReplacement(str);
            jt1.m53776o(quoteReplacement, "quoteReplacement(literal)");
            return quoteReplacement;
        }

        @vr2
        /* renamed from: e */
        public final eh3 mo35392e(@vr2 String str) {
            jt1.m53777p(str, "literal");
            return new eh3(str, hh3.LITERAL);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\rB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0002R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/onedelhi/secure/eh3$b;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "c", "", "pattern", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "", "flags", "I", "a", "()I", "<init>", "(Ljava/lang/String;I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.eh3$b */
    public static final class C5147b implements Serializable {
        @vr2

        /* renamed from: a */
        public static final C5148a f27931a = new C5148a((wg0) null);

        /* renamed from: b */
        public static final long f27932b = 0;
        @vr2

        /* renamed from: b */
        public final String f27933b;

        /* renamed from: n */
        public final int f27934n;

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/eh3$b$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
        /* renamed from: com.onedelhi.secure.eh3$b$a */
        public static final class C5148a {
            public C5148a() {
            }

            public /* synthetic */ C5148a(wg0 wg0) {
                this();
            }
        }

        public C5147b(@vr2 String str, int i) {
            jt1.m53777p(str, "pattern");
            this.f27933b = str;
            this.f27934n = i;
        }

        /* renamed from: a */
        public final int mo35393a() {
            return this.f27934n;
        }

        @vr2
        /* renamed from: b */
        public final String mo35394b() {
            return this.f27933b;
        }

        /* renamed from: c */
        public final Object mo35395c() {
            Pattern compile = Pattern.compile(this.f27933b, this.f27934n);
            jt1.m53776o(compile, "compile(pattern, flags)");
            return new eh3(compile);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/onedelhi/secure/ce2;", "a", "()Lcom/onedelhi/secure/ce2;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.eh3$c */
    public static final class C5149c extends d12 implements cc1<ce2> {

        /* renamed from: a */
        public final /* synthetic */ eh3 f27935a;

        /* renamed from: a */
        public final /* synthetic */ CharSequence f27936a;

        /* renamed from: n */
        public final /* synthetic */ int f27937n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5149c(eh3 eh3, CharSequence charSequence, int i) {
            super(0);
            this.f27935a = eh3;
            this.f27936a = charSequence;
            this.f27937n = i;
        }

        @ss2
        /* renamed from: a */
        public final ce2 invoke() {
            return this.f27935a.mo35373c(this.f27936a, this.f27937n);
        }
    }

    @ii2(mo38106k = 3, mo38107mv = {1, 7, 1}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.eh3$d */
    public /* synthetic */ class C5150d extends hd1 implements ec1<ce2, ce2> {

        /* renamed from: a */
        public static final C5150d f27938a = new C5150d();

        public C5150d() {
            super(1, ce2.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @ss2
        /* renamed from: G0 */
        public final ce2 mo17094X(@vr2 ce2 ce2) {
            jt1.m53777p(ce2, "p0");
            return ce2.mo32312X0();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/n71;", "", "T", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Enum;)Ljava/lang/Boolean;", "com/onedelhi/secure/gh3$a"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.eh3$e */
    public static final class C5151e extends d12 implements ec1<hh3, Boolean> {

        /* renamed from: n */
        public final /* synthetic */ int f27939n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5151e(int i) {
            super(1);
            this.f27939n = i;
        }

        @vr2
        /* renamed from: a */
        public final Boolean mo17094X(hh3 hh3) {
            n71 n71 = hh3;
            return Boolean.valueOf((this.f27939n & n71.mo37329U()) == n71.mo37328T());
        }
    }

    @cf0(mo32326c = "kotlin.text.Regex$splitToSequence$1", mo32327f = "Regex.kt", mo32328i = {1, 1, 1}, mo32329l = {276, 284, 288}, mo32330m = "invokeSuspend", mo32331n = {"$this$sequence", "matcher", "splitCount"}, mo32332s = {"L$0", "L$1", "I$0"})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, d2 = {"Lcom/onedelhi/secure/bu3;", "", "Lcom/onedelhi/secure/un4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.eh3$f */
    public static final class C5152f extends ll3 implements sc1<bu3<? super String>, b80<? super un4>, Object> {

        /* renamed from: a */
        public final /* synthetic */ eh3 f27940a;

        /* renamed from: a */
        public final /* synthetic */ CharSequence f27941a;

        /* renamed from: a */
        public Object f27942a;

        /* renamed from: b */
        public /* synthetic */ Object f27943b;

        /* renamed from: o */
        public int f27944o;

        /* renamed from: p */
        public int f27945p;

        /* renamed from: q */
        public final /* synthetic */ int f27946q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5152f(eh3 eh3, CharSequence charSequence, int i, b80<? super C5152f> b80) {
            super(2, b80);
            this.f27940a = eh3;
            this.f27941a = charSequence;
            this.f27946q = i;
        }

        @vr2
        /* renamed from: B */
        public final b80<un4> mo22644B(@ss2 Object obj, @vr2 b80<?> b80) {
            C5152f fVar = new C5152f(this.f27940a, this.f27941a, this.f27946q, b80);
            fVar.f27943b = obj;
            return fVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x009e A[RETURN] */
        @com.onedelhi.secure.ss2
        /* renamed from: D */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo22645D(@com.onedelhi.secure.vr2 java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = com.onedelhi.secure.mt1.m57558h()
                int r1 = r10.f27945p
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x0035
                if (r1 == r5) goto L_0x0030
                if (r1 == r4) goto L_0x001f
                if (r1 != r3) goto L_0x0017
                com.onedelhi.secure.pl3.m61436n(r11)
                goto L_0x009f
            L_0x0017:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x001f:
                int r1 = r10.f27944o
                java.lang.Object r2 = r10.f27942a
                java.util.regex.Matcher r2 = (java.util.regex.Matcher) r2
                java.lang.Object r6 = r10.f27943b
                com.onedelhi.secure.bu3 r6 = (com.onedelhi.secure.bu3) r6
                com.onedelhi.secure.pl3.m61436n(r11)
                r7 = r10
                r11 = r1
                r1 = r2
                goto L_0x0073
            L_0x0030:
                com.onedelhi.secure.pl3.m61436n(r11)
                goto L_0x00b1
            L_0x0035:
                com.onedelhi.secure.pl3.m61436n(r11)
                java.lang.Object r11 = r10.f27943b
                com.onedelhi.secure.bu3 r11 = (com.onedelhi.secure.bu3) r11
                com.onedelhi.secure.eh3 r1 = r10.f27940a
                java.util.regex.Pattern r1 = r1.f27930a
                java.lang.CharSequence r6 = r10.f27941a
                java.util.regex.Matcher r1 = r1.matcher(r6)
                int r6 = r10.f27946q
                if (r6 == r5) goto L_0x00a2
                boolean r6 = r1.find()
                if (r6 != 0) goto L_0x0053
                goto L_0x00a2
            L_0x0053:
                r7 = r10
                r6 = r11
                r11 = 0
            L_0x0056:
                java.lang.CharSequence r8 = r7.f27941a
                int r9 = r1.start()
                java.lang.CharSequence r2 = r8.subSequence(r2, r9)
                java.lang.String r2 = r2.toString()
                r7.f27943b = r6
                r7.f27942a = r1
                r7.f27944o = r11
                r7.f27945p = r4
                java.lang.Object r2 = r6.mo31188h(r2, r7)
                if (r2 != r0) goto L_0x0073
                return r0
            L_0x0073:
                int r2 = r1.end()
                int r11 = r11 + r5
                int r8 = r7.f27946q
                int r8 = r8 - r5
                if (r11 == r8) goto L_0x0083
                boolean r8 = r1.find()
                if (r8 != 0) goto L_0x0056
            L_0x0083:
                java.lang.CharSequence r11 = r7.f27941a
                int r1 = r11.length()
                java.lang.CharSequence r11 = r11.subSequence(r2, r1)
                java.lang.String r11 = r11.toString()
                r1 = 0
                r7.f27943b = r1
                r7.f27942a = r1
                r7.f27945p = r3
                java.lang.Object r11 = r6.mo31188h(r11, r7)
                if (r11 != r0) goto L_0x009f
                return r0
            L_0x009f:
                com.onedelhi.secure.un4 r11 = com.onedelhi.secure.un4.f36206a
                return r11
            L_0x00a2:
                java.lang.CharSequence r1 = r10.f27941a
                java.lang.String r1 = r1.toString()
                r10.f27945p = r5
                java.lang.Object r11 = r11.mo31188h(r1, r10)
                if (r11 != r0) goto L_0x00b1
                return r0
            L_0x00b1:
                com.onedelhi.secure.un4 r11 = com.onedelhi.secure.un4.f36206a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.eh3.C5152f.mo22645D(java.lang.Object):java.lang.Object");
        }

        @ss2
        /* renamed from: L */
        public final Object mo21054h0(@vr2 bu3<? super String> bu3, @ss2 b80<? super un4> b80) {
            return ((C5152f) mo22644B(bu3, b80)).mo22645D(un4.f36206a);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public eh3(@com.onedelhi.secure.vr2 java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            com.onedelhi.secure.jt1.m53777p(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            com.onedelhi.secure.jt1.m53776o(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.eh3.<init>(java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public eh3(@com.onedelhi.secure.vr2 java.lang.String r2, @com.onedelhi.secure.vr2 com.onedelhi.secure.hh3 r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            com.onedelhi.secure.jt1.m53777p(r2, r0)
            java.lang.String r0 = "option"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            com.onedelhi.secure.eh3$a r0 = f27928a
            int r3 = r3.mo37328T()
            int r3 = r0.mo35389b(r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureUnicodeCase(option.value))"
            com.onedelhi.secure.jt1.m53776o(r2, r3)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.eh3.<init>(java.lang.String, com.onedelhi.secure.hh3):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public eh3(@com.onedelhi.secure.vr2 java.lang.String r2, @com.onedelhi.secure.vr2 java.util.Set<? extends com.onedelhi.secure.hh3> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            com.onedelhi.secure.jt1.m53777p(r2, r0)
            java.lang.String r0 = "options"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            com.onedelhi.secure.eh3$a r0 = f27928a
            int r3 = com.onedelhi.secure.gh3.m49496k(r3)
            int r3 = r0.mo35389b(r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureU…odeCase(options.toInt()))"
            com.onedelhi.secure.jt1.m53776o(r2, r3)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.eh3.<init>(java.lang.String, java.util.Set):void");
    }

    @z73
    public eh3(@vr2 Pattern pattern) {
        jt1.m53777p(pattern, "nativePattern");
        this.f27930a = pattern;
    }

    /* renamed from: d */
    public static /* synthetic */ ce2 m46804d(eh3 eh3, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return eh3.mo35373c(charSequence, i);
    }

    /* renamed from: f */
    public static /* synthetic */ zt3 m46805f(eh3 eh3, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return eh3.mo35374e(charSequence, i);
    }

    /* renamed from: q */
    public static /* synthetic */ List m46806q(eh3 eh3, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return eh3.mo35384p(charSequence, i);
    }

    /* renamed from: s */
    public static /* synthetic */ zt3 m46807s(eh3 eh3, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return eh3.mo35385r(charSequence, i);
    }

    /* renamed from: b */
    public final boolean mo35372b(@vr2 CharSequence charSequence) {
        jt1.m53777p(charSequence, "input");
        return this.f27930a.matcher(charSequence).find();
    }

    @ss2
    /* renamed from: c */
    public final ce2 mo35373c(@vr2 CharSequence charSequence, int i) {
        jt1.m53777p(charSequence, "input");
        Matcher matcher = this.f27930a.matcher(charSequence);
        jt1.m53776o(matcher, "nativePattern.matcher(input)");
        return gh3.m49491f(matcher, i, charSequence);
    }

    @vr2
    /* renamed from: e */
    public final zt3<ce2> mo35374e(@vr2 CharSequence charSequence, int i) {
        jt1.m53777p(charSequence, "input");
        if (i >= 0 && i <= charSequence.length()) {
            return fu3.m48495m(new C5149c(this, charSequence, i), C5150d.f27938a);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i + ", input length: " + charSequence.length());
    }

    @vr2
    /* renamed from: g */
    public final Set<hh3> mo35375g() {
        Set<? extends hh3> set = this.f27929a;
        if (set != null) {
            return set;
        }
        int flags = this.f27930a.flags();
        EnumSet<E> allOf = EnumSet.allOf(hh3.class);
        jt1.m53776o(allOf, "");
        x00.m69805N0(allOf, new C5151e(flags));
        Set<? extends hh3> unmodifiableSet = Collections.unmodifiableSet(allOf);
        jt1.m53776o(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        this.f27929a = unmodifiableSet;
        return unmodifiableSet;
    }

    @vr2
    /* renamed from: h */
    public final String mo35376h() {
        String pattern = this.f27930a.pattern();
        jt1.m53776o(pattern, "nativePattern.pattern()");
        return pattern;
    }

    @gz3(version = "1.7")
    @tw4(markerClass = {ly0.class})
    @ss2
    /* renamed from: i */
    public final ce2 mo35377i(@vr2 CharSequence charSequence, int i) {
        jt1.m53777p(charSequence, "input");
        Matcher region = this.f27930a.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length());
        if (!region.lookingAt()) {
            return null;
        }
        jt1.m53776o(region, "this");
        return new de2(region, charSequence);
    }

    @ss2
    /* renamed from: j */
    public final ce2 mo35378j(@vr2 CharSequence charSequence) {
        jt1.m53777p(charSequence, "input");
        Matcher matcher = this.f27930a.matcher(charSequence);
        jt1.m53776o(matcher, "nativePattern.matcher(input)");
        return gh3.m49493h(matcher, charSequence);
    }

    /* renamed from: k */
    public final boolean mo35379k(@vr2 CharSequence charSequence) {
        jt1.m53777p(charSequence, "input");
        return this.f27930a.matcher(charSequence).matches();
    }

    @gz3(version = "1.7")
    @tw4(markerClass = {ly0.class})
    /* renamed from: l */
    public final boolean mo35380l(@vr2 CharSequence charSequence, int i) {
        jt1.m53777p(charSequence, "input");
        return this.f27930a.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length()).lookingAt();
    }

    @vr2
    /* renamed from: m */
    public final String mo35381m(@vr2 CharSequence charSequence, @vr2 ec1<? super ce2, ? extends CharSequence> ec1) {
        jt1.m53777p(charSequence, "input");
        jt1.m53777p(ec1, "transform");
        int i = 0;
        ce2 d = m46804d(this, charSequence, 0, 2, (Object) null);
        if (d == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i, d.mo32310V0().mo27428i().intValue());
            sb.append((CharSequence) ec1.mo17094X(d));
            i = d.mo32310V0().mo27427g().intValue() + 1;
            d = d.mo32312X0();
            if (i >= length) {
                break;
            }
        } while (d != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        String sb2 = sb.toString();
        jt1.m53776o(sb2, "sb.toString()");
        return sb2;
    }

    @vr2
    /* renamed from: n */
    public final String mo35382n(@vr2 CharSequence charSequence, @vr2 String str) {
        jt1.m53777p(charSequence, "input");
        jt1.m53777p(str, "replacement");
        String replaceAll = this.f27930a.matcher(charSequence).replaceAll(str);
        jt1.m53776o(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    @vr2
    /* renamed from: o */
    public final String mo35383o(@vr2 CharSequence charSequence, @vr2 String str) {
        jt1.m53777p(charSequence, "input");
        jt1.m53777p(str, "replacement");
        String replaceFirst = this.f27930a.matcher(charSequence).replaceFirst(str);
        jt1.m53776o(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    @vr2
    /* renamed from: p */
    public final List<String> mo35384p(@vr2 CharSequence charSequence, int i) {
        jt1.m53777p(charSequence, "input");
        u54.m66568M4(i);
        Matcher matcher = this.f27930a.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return r00.m63300l(charSequence.toString());
        }
        int i2 = 10;
        if (i > 0) {
            i2 = df3.m45219u(i, 10);
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        int i4 = i - 1;
        do {
            arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
            i3 = matcher.end();
            if ((i4 >= 0 && arrayList.size() == i4) || !matcher.find()) {
                arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
            i3 = matcher.end();
            break;
        } while (!matcher.find());
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    @vr2
    @gz3(version = "1.6")
    @tw4(markerClass = {ly0.class})
    /* renamed from: r */
    public final zt3<String> mo35385r(@vr2 CharSequence charSequence, int i) {
        jt1.m53777p(charSequence, "input");
        u54.m66568M4(i);
        return du3.m45551b(new C5152f(this, charSequence, i, (b80<? super C5152f>) null));
    }

    @vr2
    /* renamed from: t */
    public final Pattern mo35386t() {
        return this.f27930a;
    }

    @vr2
    public String toString() {
        String pattern = this.f27930a.toString();
        jt1.m53776o(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* renamed from: u */
    public final Object mo35388u() {
        String pattern = this.f27930a.pattern();
        jt1.m53776o(pattern, "nativePattern.pattern()");
        return new C5147b(pattern, this.f27930a.flags());
    }
}
