package com.onedelhi.secure;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b;\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001e\u0010\n\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0003H\nø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\u0003*\u00020\t2\u0006\u0010\f\u001a\u00020\u0003H\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\"\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u001a)\u0010\u001c\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00002\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00130\u0019H\b\u001a)\u0010\u001d\u001a\u00020\u0000*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00002\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00130\u0019H\b\u001a\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0002\u001a\u0010\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0002\u001a\u001a\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001a\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010$\u001a\"\u0010)\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u001a\u0010+\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010$\u001a\u001a\u0010,\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010$\"!\u00101\u001a\u00020\u0003*\u00020\u00008FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.\"!\u00101\u001a\u00020\u0003*\u00020\u00068FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b/\u00103\u001a\u0004\b2\u0010$\"!\u00101\u001a\u00020\u0003*\u00020\t8FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b/\u00106\u001a\u0004\b4\u00105\"!\u00109\u001a\u00020\u0003*\u00020\u00008FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b8\u00100\u001a\u0004\b7\u0010.\"!\u00109\u001a\u00020\u0003*\u00020\u00068FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b8\u00103\u001a\u0004\b:\u0010$\"!\u00109\u001a\u00020\u0003*\u00020\t8FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b8\u00106\u001a\u0004\b;\u00105\"!\u0010>\u001a\u00020\u0003*\u00020\u00008FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b=\u00100\u001a\u0004\b<\u0010.\"!\u0010>\u001a\u00020\u0003*\u00020\u00068FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b=\u00103\u001a\u0004\b?\u0010$\"!\u0010>\u001a\u00020\u0003*\u00020\t8FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b=\u00106\u001a\u0004\b@\u00105\"!\u0010C\u001a\u00020\u0003*\u00020\u00008FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bB\u00100\u001a\u0004\bA\u0010.\"!\u0010C\u001a\u00020\u0003*\u00020\u00068FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bB\u00103\u001a\u0004\bD\u0010$\"!\u0010C\u001a\u00020\u0003*\u00020\t8FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bB\u00106\u001a\u0004\bE\u00105\"!\u0010H\u001a\u00020\u0003*\u00020\u00008FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bG\u00100\u001a\u0004\bF\u0010.\"!\u0010H\u001a\u00020\u0003*\u00020\u00068FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bG\u00103\u001a\u0004\bI\u0010$\"!\u0010H\u001a\u00020\u0003*\u00020\t8FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bG\u00106\u001a\u0004\bJ\u00105\"!\u0010M\u001a\u00020\u0003*\u00020\u00008FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bL\u00100\u001a\u0004\bK\u0010.\"!\u0010M\u001a\u00020\u0003*\u00020\u00068FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bL\u00103\u001a\u0004\bN\u0010$\"!\u0010M\u001a\u00020\u0003*\u00020\t8FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bL\u00106\u001a\u0004\bO\u00105\"!\u0010R\u001a\u00020\u0003*\u00020\u00008FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bQ\u00100\u001a\u0004\bP\u0010.\"!\u0010R\u001a\u00020\u0003*\u00020\u00068FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bQ\u00103\u001a\u0004\bS\u0010$\"!\u0010R\u001a\u00020\u0003*\u00020\t8FX\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bQ\u00106\u001a\u0004\bT\u00105\u0002\u0004\n\u0002\b\u0019¨\u0006U"}, d2 = {"", "Lcom/onedelhi/secure/lq0;", "unit", "Lcom/onedelhi/secure/fq0;", "m0", "(ILcom/onedelhi/secure/lq0;)J", "", "n0", "(JLcom/onedelhi/secure/lq0;)J", "", "l0", "(DLcom/onedelhi/secure/lq0;)J", "duration", "k0", "(IJ)J", "j0", "(DJ)J", "", "value", "", "strictIso", "f0", "(Ljava/lang/String;Z)J", "g0", "startIndex", "Lkotlin/Function1;", "", "predicate", "i0", "h0", "nanos", "e0", "millis", "d0", "normalNanos", "l", "(J)J", "normalMillis", "j", "normalValue", "unitDiscriminator", "i", "(JI)J", "m", "k", "S", "(I)J", "getNanoseconds$annotations", "(I)V", "nanoseconds", "T", "(J)V", "R", "(D)J", "(D)V", "A", "getMicroseconds$annotations", "microseconds", "B", "z", "G", "getMilliseconds$annotations", "milliseconds", "H", "F", "Y", "getSeconds$annotations", "seconds", "Z", "X", "M", "getMinutes$annotations", "minutes", "N", "L", "u", "getHours$annotations", "hours", "v", "t", "o", "getDays$annotations", "days", "p", "n", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
public final class iq0 {

    /* renamed from: a */
    public static final int f30412a = 1000000;

    /* renamed from: a */
    public static final long f30413a = 4611686018426999999L;

    /* renamed from: b */
    public static final long f30414b = 4611686018427387903L;

    /* renamed from: c */
    public static final long f30415c = 4611686018426L;

    /* renamed from: A */
    public static final long m52504A(int i) {
        return m52555m0(i, lq0.MICROSECONDS);
    }

    /* renamed from: B */
    public static final long m52505B(long j) {
        return m52557n0(j, lq0.MICROSECONDS);
    }

    @my0
    @xj0(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: C */
    public static /* synthetic */ void m52506C(double d) {
    }

    @my0
    @xj0(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: D */
    public static /* synthetic */ void m52507D(int i) {
    }

    @my0
    @xj0(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: E */
    public static /* synthetic */ void m52508E(long j) {
    }

    /* renamed from: F */
    public static final long m52509F(double d) {
        return m52553l0(d, lq0.MILLISECONDS);
    }

    /* renamed from: G */
    public static final long m52510G(int i) {
        return m52555m0(i, lq0.MILLISECONDS);
    }

    /* renamed from: H */
    public static final long m52511H(long j) {
        return m52557n0(j, lq0.MILLISECONDS);
    }

    @my0
    @xj0(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: I */
    public static /* synthetic */ void m52512I(double d) {
    }

    @my0
    @xj0(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: J */
    public static /* synthetic */ void m52513J(int i) {
    }

    @my0
    @xj0(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: K */
    public static /* synthetic */ void m52514K(long j) {
    }

    /* renamed from: L */
    public static final long m52515L(double d) {
        return m52553l0(d, lq0.MINUTES);
    }

    /* renamed from: M */
    public static final long m52516M(int i) {
        return m52555m0(i, lq0.MINUTES);
    }

    /* renamed from: N */
    public static final long m52517N(long j) {
        return m52557n0(j, lq0.MINUTES);
    }

    @my0
    @xj0(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: O */
    public static /* synthetic */ void m52518O(double d) {
    }

    @my0
    @xj0(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: P */
    public static /* synthetic */ void m52519P(int i) {
    }

    @my0
    @xj0(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: Q */
    public static /* synthetic */ void m52520Q(long j) {
    }

    /* renamed from: R */
    public static final long m52521R(double d) {
        return m52553l0(d, lq0.NANOSECONDS);
    }

    /* renamed from: S */
    public static final long m52522S(int i) {
        return m52555m0(i, lq0.NANOSECONDS);
    }

    /* renamed from: T */
    public static final long m52523T(long j) {
        return m52557n0(j, lq0.NANOSECONDS);
    }

    @my0
    @xj0(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: U */
    public static /* synthetic */ void m52524U(double d) {
    }

    @my0
    @xj0(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: V */
    public static /* synthetic */ void m52525V(int i) {
    }

    @my0
    @xj0(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: W */
    public static /* synthetic */ void m52526W(long j) {
    }

    /* renamed from: X */
    public static final long m52527X(double d) {
        return m52553l0(d, lq0.SECONDS);
    }

    /* renamed from: Y */
    public static final long m52528Y(int i) {
        return m52555m0(i, lq0.SECONDS);
    }

    /* renamed from: Z */
    public static final long m52529Z(long j) {
        return m52557n0(j, lq0.SECONDS);
    }

    @my0
    @xj0(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: a0 */
    public static /* synthetic */ void m52531a0(double d) {
    }

    @my0
    @xj0(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: b0 */
    public static /* synthetic */ void m52533b0(int i) {
    }

    @my0
    @xj0(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: c0 */
    public static /* synthetic */ void m52535c0(long j) {
    }

    /* renamed from: d0 */
    public static final long m52537d0(long j) {
        return j * ((long) 1000000);
    }

    /* renamed from: e0 */
    public static final long m52539e0(long j) {
        return j / ((long) 1000000);
    }

    /* JADX WARNING: Removed duplicated region for block: B:159:0x00a6 A[EDGE_INSN: B:159:0x00a6->B:45:0x00a6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0098 A[LOOP:1: B:33:0x006c->B:43:0x0098, LOOP_END] */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m52541f0(java.lang.String r27, boolean r28) {
        /*
            r6 = r27
            int r7 = r27.length()
            if (r7 == 0) goto L_0x02de
            com.onedelhi.secure.fq0$a r8 = com.onedelhi.secure.fq0.f28620a
            long r9 = r8.mo36206W()
            r11 = 0
            char r0 = r6.charAt(r11)
            r1 = 43
            r2 = 45
            r12 = 1
            if (r0 != r1) goto L_0x001c
        L_0x001a:
            r13 = 1
            goto L_0x0020
        L_0x001c:
            if (r0 != r2) goto L_0x001f
            goto L_0x001a
        L_0x001f:
            r13 = 0
        L_0x0020:
            if (r13 <= 0) goto L_0x0024
            r14 = 1
            goto L_0x0025
        L_0x0024:
            r14 = 0
        L_0x0025:
            r0 = 2
            r15 = 0
            if (r14 == 0) goto L_0x0032
            boolean r1 = com.onedelhi.secure.u54.m66629d5(r6, r2, r11, r0, r15)
            if (r1 == 0) goto L_0x0032
            r16 = 1
            goto L_0x0034
        L_0x0032:
            r16 = 0
        L_0x0034:
            java.lang.String r5 = "No components"
            if (r7 <= r13) goto L_0x02d7
            char r1 = r6.charAt(r13)
            r2 = 80
            java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
            java.lang.String r3 = "Unexpected order of duration components"
            r17 = r5
            r5 = 57
            r0 = 48
            java.lang.String r11 = "this as java.lang.String…ing(startIndex, endIndex)"
            java.lang.String r15 = "null cannot be cast to non-null type java.lang.String"
            if (r1 != r2) goto L_0x0164
            int r13 = r13 + r12
            if (r13 == r7) goto L_0x015e
            r1 = 0
            r2 = 0
        L_0x0053:
            if (r13 >= r7) goto L_0x02ca
            char r8 = r6.charAt(r13)
            r14 = 84
            if (r8 != r14) goto L_0x006b
            if (r1 != 0) goto L_0x0065
            int r13 = r13 + 1
            if (r13 == r7) goto L_0x0065
            r1 = 1
            goto L_0x0053
        L_0x0065:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x006b:
            r8 = r13
        L_0x006c:
            int r14 = r27.length()
            if (r8 >= r14) goto L_0x00a2
            char r14 = r6.charAt(r8)
            com.onedelhi.secure.xw r12 = new com.onedelhi.secure.xw
            r12.<init>(r0, r5)
            boolean r12 = r12.mo47420s(r14)
            if (r12 != 0) goto L_0x0091
            java.lang.String r12 = "+-."
            r18 = r7
            r0 = 2
            r5 = 0
            r7 = 0
            boolean r12 = com.onedelhi.secure.u54.m66598U2(r12, r14, r7, r0, r5)
            if (r12 == 0) goto L_0x008f
            goto L_0x0095
        L_0x008f:
            r7 = 0
            goto L_0x0096
        L_0x0091:
            r18 = r7
            r0 = 2
            r5 = 0
        L_0x0095:
            r7 = 1
        L_0x0096:
            if (r7 == 0) goto L_0x00a6
            int r8 = r8 + 1
            r7 = r18
            r0 = 48
            r5 = 57
            r12 = 1
            goto L_0x006c
        L_0x00a2:
            r18 = r7
            r0 = 2
            r5 = 0
        L_0x00a6:
            com.onedelhi.secure.jt1.m53775n(r6, r15)
            java.lang.String r7 = r6.substring(r13, r8)
            com.onedelhi.secure.jt1.m53776o(r7, r11)
            int r8 = r7.length()
            if (r8 != 0) goto L_0x00b8
            r8 = 1
            goto L_0x00b9
        L_0x00b8:
            r8 = 0
        L_0x00b9:
            if (r8 != 0) goto L_0x0158
            int r8 = r7.length()
            int r13 = r13 + r8
            if (r13 < 0) goto L_0x0141
            int r8 = com.onedelhi.secure.u54.m66642i3(r27)
            if (r13 > r8) goto L_0x0141
            char r8 = r6.charAt(r13)
            int r13 = r13 + 1
            com.onedelhi.secure.lq0 r8 = com.onedelhi.secure.oq0.m59609f(r8, r1)
            if (r2 == 0) goto L_0x00e1
            int r2 = r2.compareTo(r8)
            if (r2 <= 0) goto L_0x00db
            goto L_0x00e1
        L_0x00db:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L_0x00e1:
            r21 = 46
            r22 = 0
            r23 = 0
            r24 = 6
            r25 = 0
            r20 = r7
            int r2 = com.onedelhi.secure.u54.m66666q3(r20, r21, r22, r23, r24, r25)
            com.onedelhi.secure.lq0 r12 = com.onedelhi.secure.lq0.SECONDS
            if (r8 != r12) goto L_0x0127
            if (r2 <= 0) goto L_0x0127
            com.onedelhi.secure.jt1.m53775n(r7, r15)
            r12 = 0
            java.lang.String r14 = r7.substring(r12, r2)
            com.onedelhi.secure.jt1.m53776o(r14, r11)
            r28 = r1
            long r0 = m52543g0(r14)
            long r0 = m52557n0(r0, r8)
            long r0 = com.onedelhi.secure.fq0.m48279o0(r9, r0)
            com.onedelhi.secure.jt1.m53775n(r7, r15)
            java.lang.String r2 = r7.substring(r2)
            com.onedelhi.secure.jt1.m53776o(r2, r4)
            double r9 = java.lang.Double.parseDouble(r2)
            long r9 = m52553l0(r9, r8)
            long r9 = com.onedelhi.secure.fq0.m48279o0(r0, r9)
            goto L_0x0135
        L_0x0127:
            r28 = r1
            long r0 = m52543g0(r7)
            long r0 = m52557n0(r0, r8)
            long r9 = com.onedelhi.secure.fq0.m48279o0(r9, r0)
        L_0x0135:
            r1 = r28
            r2 = r8
            r7 = r18
            r0 = 48
            r5 = 57
            r12 = 1
            goto L_0x0053
        L_0x0141:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Missing unit for value "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0158:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x015e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0164:
            r18 = r7
            r5 = 0
            if (r28 != 0) goto L_0x02d1
            r7 = 0
            int r0 = r18 - r13
            r1 = 8
            int r12 = java.lang.Math.max(r0, r1)
            r20 = 1
            java.lang.String r2 = "Infinity"
            r1 = 48
            r0 = r27
            r1 = r13
            r26 = r3
            r3 = r7
            r7 = r4
            r4 = r12
            r12 = r17
            r17 = r5
            r5 = r20
            boolean r0 = com.onedelhi.secure.t54.m65432d2(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0192
            long r9 = r8.mo36236q()
            goto L_0x02ca
        L_0x0192:
            r0 = r14 ^ 1
            if (r14 == 0) goto L_0x01b7
            char r1 = r6.charAt(r13)
            r2 = 40
            if (r1 != r2) goto L_0x01b7
            char r1 = com.onedelhi.secure.w54.m69012t7(r27)
            r2 = 41
            if (r1 != r2) goto L_0x01b7
            int r13 = r13 + 1
            int r0 = r18 + -1
            if (r13 == r0) goto L_0x01b1
            r1 = r0
            r3 = r17
            r0 = 1
            goto L_0x01bb
        L_0x01b1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r12)
            throw r0
        L_0x01b7:
            r3 = r17
            r1 = r18
        L_0x01bb:
            r2 = 0
        L_0x01bc:
            if (r13 >= r1) goto L_0x02ca
            if (r2 == 0) goto L_0x01d8
            if (r0 == 0) goto L_0x01d8
        L_0x01c2:
            int r2 = r27.length()
            if (r13 >= r2) goto L_0x01d8
            char r2 = r6.charAt(r13)
            r4 = 32
            if (r2 != r4) goto L_0x01d2
            r2 = 1
            goto L_0x01d3
        L_0x01d2:
            r2 = 0
        L_0x01d3:
            if (r2 == 0) goto L_0x01d8
            int r13 = r13 + 1
            goto L_0x01c2
        L_0x01d8:
            r2 = r13
        L_0x01d9:
            int r4 = r27.length()
            if (r2 >= r4) goto L_0x01ff
            char r4 = r6.charAt(r2)
            com.onedelhi.secure.xw r5 = new com.onedelhi.secure.xw
            r8 = 57
            r12 = 48
            r5.<init>(r12, r8)
            boolean r5 = r5.mo47420s(r4)
            if (r5 != 0) goto L_0x01f9
            r5 = 46
            if (r4 != r5) goto L_0x01f7
            goto L_0x01f9
        L_0x01f7:
            r4 = 0
            goto L_0x01fa
        L_0x01f9:
            r4 = 1
        L_0x01fa:
            if (r4 == 0) goto L_0x0203
            int r2 = r2 + 1
            goto L_0x01d9
        L_0x01ff:
            r8 = 57
            r12 = 48
        L_0x0203:
            com.onedelhi.secure.jt1.m53775n(r6, r15)
            java.lang.String r2 = r6.substring(r13, r2)
            com.onedelhi.secure.jt1.m53776o(r2, r11)
            int r4 = r2.length()
            if (r4 != 0) goto L_0x0215
            r4 = 1
            goto L_0x0216
        L_0x0215:
            r4 = 0
        L_0x0216:
            if (r4 != 0) goto L_0x02c4
            int r4 = r2.length()
            int r13 = r13 + r4
            r4 = r13
        L_0x021e:
            int r5 = r27.length()
            if (r4 >= r5) goto L_0x023e
            char r5 = r6.charAt(r4)
            com.onedelhi.secure.xw r14 = new com.onedelhi.secure.xw
            r8 = 97
            r12 = 122(0x7a, float:1.71E-43)
            r14.<init>(r8, r12)
            boolean r5 = r14.mo47420s(r5)
            if (r5 == 0) goto L_0x023e
            int r4 = r4 + 1
            r8 = 57
            r12 = 48
            goto L_0x021e
        L_0x023e:
            com.onedelhi.secure.jt1.m53775n(r6, r15)
            java.lang.String r4 = r6.substring(r13, r4)
            com.onedelhi.secure.jt1.m53776o(r4, r11)
            int r5 = r4.length()
            int r13 = r13 + r5
            com.onedelhi.secure.lq0 r4 = com.onedelhi.secure.oq0.m59610g(r4)
            if (r3 == 0) goto L_0x0262
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L_0x025a
            goto L_0x0262
        L_0x025a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = r26
            r0.<init>(r3)
            throw r0
        L_0x0262:
            r3 = r26
            r20 = 46
            r21 = 0
            r22 = 0
            r23 = 6
            r24 = 0
            r19 = r2
            int r5 = com.onedelhi.secure.u54.m66666q3(r19, r20, r21, r22, r23, r24)
            if (r5 <= 0) goto L_0x02af
            com.onedelhi.secure.jt1.m53775n(r2, r15)
            r8 = 0
            java.lang.String r12 = r2.substring(r8, r5)
            com.onedelhi.secure.jt1.m53776o(r12, r11)
            r14 = r11
            long r11 = java.lang.Long.parseLong(r12)
            long r11 = m52557n0(r11, r4)
            long r9 = com.onedelhi.secure.fq0.m48279o0(r9, r11)
            com.onedelhi.secure.jt1.m53775n(r2, r15)
            java.lang.String r2 = r2.substring(r5)
            com.onedelhi.secure.jt1.m53776o(r2, r7)
            double r11 = java.lang.Double.parseDouble(r2)
            long r11 = m52553l0(r11, r4)
            long r9 = com.onedelhi.secure.fq0.m48279o0(r9, r11)
            if (r13 < r1) goto L_0x02a7
            goto L_0x02bd
        L_0x02a7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Fractional component must be last"
            r0.<init>(r1)
            throw r0
        L_0x02af:
            r14 = r11
            r8 = 0
            long r11 = java.lang.Long.parseLong(r2)
            long r11 = m52557n0(r11, r4)
            long r9 = com.onedelhi.secure.fq0.m48279o0(r9, r11)
        L_0x02bd:
            r26 = r3
            r3 = r4
            r11 = r14
            r2 = 1
            goto L_0x01bc
        L_0x02c4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x02ca:
            if (r16 == 0) goto L_0x02d0
            long r9 = com.onedelhi.secure.fq0.m48238E0(r9)
        L_0x02d0:
            return r9
        L_0x02d1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x02d7:
            r12 = r5
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r12)
            throw r0
        L_0x02de:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The string is empty"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.iq0.m52541f0(java.lang.String, boolean):long");
    }

    /* renamed from: g0 */
    public static final long m52543g0(String str) {
        boolean z;
        int length = str.length();
        int i = (length <= 0 || !u54.m66598U2("+-", str.charAt(0), false, 2, (Object) null)) ? 0 : 1;
        if (length - i > 16) {
            is1 is1 = new is1(i, u54.m66642i3(str));
            if (!(is1 instanceof Collection) || !((Collection) is1).isEmpty()) {
                Iterator it = is1.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!new C7280xw('0', '9').mo47420s(str.charAt(((ds1) it).mo19249b()))) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
        }
        if (t54.m65466u2(str, C3516si.f20377b, false, 2, (Object) null)) {
            str = w54.m68863A6(str, 1);
        }
        return Long.parseLong(str);
    }

    /* renamed from: h0 */
    public static final int m52545h0(String str, int i, ec1<? super Character, Boolean> ec1) {
        while (i < str.length() && ec1.mo17094X(Character.valueOf(str.charAt(i))).booleanValue()) {
            i++;
        }
        return i;
    }

    /* renamed from: i */
    public static final long m52546i(long j, int i) {
        return fq0.m48286t((j << 1) + ((long) i));
    }

    /* renamed from: i0 */
    public static final String m52547i0(String str, int i, ec1<? super Character, Boolean> ec1) {
        int i2 = i;
        while (i2 < str.length() && ec1.mo17094X(Character.valueOf(str.charAt(i2))).booleanValue()) {
            i2++;
        }
        jt1.m53775n(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i, i2);
        jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: j */
    public static final long m52548j(long j) {
        return fq0.m48286t((j << 1) + 1);
    }

    @gz3(version = "1.6")
    @tw4(markerClass = {my0.class})
    @xq1
    /* renamed from: j0 */
    public static final long m52549j0(double d, long j) {
        return fq0.m48280p0(j, d);
    }

    /* renamed from: k */
    public static final long m52550k(long j) {
        return new da2(-4611686018426L, f30415c).mo34276s(j) ? m52552l(m52537d0(j)) : m52548j(df3.m45110D(j, -4611686018427387903L, 4611686018427387903L));
    }

    @gz3(version = "1.6")
    @tw4(markerClass = {my0.class})
    @xq1
    /* renamed from: k0 */
    public static final long m52551k0(int i, long j) {
        return fq0.m48282q0(j, i);
    }

    /* renamed from: l */
    public static final long m52552l(long j) {
        return fq0.m48286t(j << 1);
    }

    @gz3(version = "1.6")
    @tw4(markerClass = {my0.class})
    /* renamed from: l0 */
    public static final long m52553l0(double d, @vr2 lq0 lq0) {
        jt1.m53777p(lq0, "unit");
        double a = nq0.m58658a(d, lq0, lq0.NANOSECONDS);
        if (!Double.isNaN(a)) {
            long K0 = mf2.m57115K0(a);
            return new da2(-4611686018426999999L, f30413a).mo34276s(K0) ? m52552l(K0) : m52550k(mf2.m57115K0(nq0.m58658a(d, lq0, lq0.MILLISECONDS)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }

    /* renamed from: m */
    public static final long m52554m(long j) {
        return new da2(-4611686018426999999L, f30413a).mo34276s(j) ? m52552l(j) : m52548j(m52539e0(j));
    }

    @gz3(version = "1.6")
    @tw4(markerClass = {my0.class})
    /* renamed from: m0 */
    public static final long m52555m0(int i, @vr2 lq0 lq0) {
        jt1.m53777p(lq0, "unit");
        return lq0.compareTo(lq0.SECONDS) <= 0 ? m52552l(nq0.m58660c((long) i, lq0, lq0.NANOSECONDS)) : m52557n0((long) i, lq0);
    }

    /* renamed from: n */
    public static final long m52556n(double d) {
        return m52553l0(d, lq0.DAYS);
    }

    @gz3(version = "1.6")
    @tw4(markerClass = {my0.class})
    /* renamed from: n0 */
    public static final long m52557n0(long j, @vr2 lq0 lq0) {
        jt1.m53777p(lq0, "unit");
        lq0 lq02 = lq0.NANOSECONDS;
        long c = nq0.m58660c(f30413a, lq02, lq0);
        return new da2(-c, c).mo34276s(j) ? m52552l(nq0.m58660c(j, lq0, lq02)) : m52548j(df3.m45110D(nq0.m58659b(j, lq0, lq0.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }

    /* renamed from: o */
    public static final long m52558o(int i) {
        return m52555m0(i, lq0.DAYS);
    }

    /* renamed from: p */
    public static final long m52559p(long j) {
        return m52557n0(j, lq0.DAYS);
    }

    @my0
    @xj0(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: q */
    public static /* synthetic */ void m52560q(double d) {
    }

    @my0
    @xj0(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: r */
    public static /* synthetic */ void m52561r(int i) {
    }

    @my0
    @xj0(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: s */
    public static /* synthetic */ void m52562s(long j) {
    }

    /* renamed from: t */
    public static final long m52563t(double d) {
        return m52553l0(d, lq0.HOURS);
    }

    /* renamed from: u */
    public static final long m52564u(int i) {
        return m52555m0(i, lq0.HOURS);
    }

    /* renamed from: v */
    public static final long m52565v(long j) {
        return m52557n0(j, lq0.HOURS);
    }

    @my0
    @xj0(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: w */
    public static /* synthetic */ void m52566w(double d) {
    }

    @my0
    @xj0(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: x */
    public static /* synthetic */ void m52567x(int i) {
    }

    @my0
    @xj0(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @oi3(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @gz3(version = "1.3")
    @zj0(warningSince = "1.5")
    /* renamed from: y */
    public static /* synthetic */ void m52568y(long j) {
    }

    /* renamed from: z */
    public static final long m52569z(double d) {
        return m52553l0(d, lq0.MICROSECONDS);
    }
}
