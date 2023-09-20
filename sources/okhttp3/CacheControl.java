package okhttp3;

import com.onedelhi.secure.ak0;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.oi3;
import com.onedelhi.secure.rw1;
import com.onedelhi.secure.u54;
import com.onedelhi.secure.uw1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.wg0;
import com.onedelhi.secure.xj0;
import com.onedelhi.secure.zw1;
import java.util.concurrent.TimeUnit;

@ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 !2\u00020\u0001:\u0002 !Bq\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0016J\r\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0017J\r\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0018J\r\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001aJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000e\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\r\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u000b\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0013\u0010\f\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0013\u0010\n\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0013\u0010\u000e\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0013R\u0013\u0010\r\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0013\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014¨\u0006\""}, mo38105d2 = {"Lokhttp3/CacheControl;", "", "noCache", "", "noStore", "maxAgeSeconds", "", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "headerValue", "", "(ZZIIZZZIIZZZLjava/lang/String;)V", "()Z", "()I", "-deprecated_immutable", "-deprecated_maxAgeSeconds", "-deprecated_maxStaleSeconds", "-deprecated_minFreshSeconds", "-deprecated_mustRevalidate", "-deprecated_noCache", "-deprecated_noStore", "-deprecated_noTransform", "-deprecated_onlyIfCached", "-deprecated_sMaxAgeSeconds", "toString", "Builder", "Companion", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
public final class CacheControl {
    public static final Companion Companion = new Companion((wg0) null);
    @rw1
    @vr2
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();
    @rw1
    @vr2
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0003\u001a\u00020\u0000J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\u0000J\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo38105d2 = {"Lokhttp3/CacheControl$Builder;", "", "()V", "immutable", "", "maxAgeSeconds", "", "maxStaleSeconds", "minFreshSeconds", "noCache", "noStore", "noTransform", "onlyIfCached", "build", "Lokhttp3/CacheControl;", "maxAge", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "maxStale", "minFresh", "clampToInt", "", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j) {
            if (j > ((long) Integer.MAX_VALUE)) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        @vr2
        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, (String) null, (wg0) null);
        }

        @vr2
        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        @vr2
        public final Builder maxAge(int i, @vr2 TimeUnit timeUnit) {
            jt1.m53777p(timeUnit, "timeUnit");
            if (i >= 0) {
                this.maxAgeSeconds = clampToInt(timeUnit.toSeconds((long) i));
                return this;
            }
            throw new IllegalArgumentException(("maxAge < 0: " + i).toString());
        }

        @vr2
        public final Builder maxStale(int i, @vr2 TimeUnit timeUnit) {
            jt1.m53777p(timeUnit, "timeUnit");
            if (i >= 0) {
                this.maxStaleSeconds = clampToInt(timeUnit.toSeconds((long) i));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i).toString());
        }

        @vr2
        public final Builder minFresh(int i, @vr2 TimeUnit timeUnit) {
            jt1.m53777p(timeUnit, "timeUnit");
            if (i >= 0) {
                this.minFreshSeconds = clampToInt(timeUnit.toSeconds((long) i));
                return this;
            }
            throw new IllegalArgumentException(("minFresh < 0: " + i).toString());
        }

        @vr2
        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        @vr2
        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        @vr2
        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        @vr2
        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo38105d2 = {"Lokhttp3/CacheControl$Companion;", "", "()V", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "parse", "headers", "Lokhttp3/Headers;", "indexOfElement", "", "", "characters", "startIndex", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wg0 wg0) {
            this();
        }

        private final int indexOfElement(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (u54.m66598U2(str2, str.charAt(i), false, 2, (Object) null)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        public static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.indexOfElement(str, str2, i);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00d9  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00dd  */
        @com.onedelhi.secure.zw1
        @com.onedelhi.secure.vr2
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.CacheControl parse(@com.onedelhi.secure.vr2 okhttp3.Headers r32) {
            /*
                r31 = this;
                r0 = r31
                r1 = r32
                java.lang.String r2 = "headers"
                com.onedelhi.secure.jt1.m53777p(r1, r2)
                int r2 = r32.size()
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x0023:
                if (r7 >= r2) goto L_0x0181
                java.lang.String r3 = r1.name(r7)
                java.lang.String r5 = r1.value(r7)
                java.lang.String r4 = "Cache-Control"
                boolean r4 = com.onedelhi.secure.t54.m65410K1(r3, r4, r6)
                if (r4 == 0) goto L_0x003a
                if (r9 == 0) goto L_0x0038
                goto L_0x0042
            L_0x0038:
                r9 = r5
                goto L_0x0043
            L_0x003a:
                java.lang.String r4 = "Pragma"
                boolean r3 = com.onedelhi.secure.t54.m65410K1(r3, r4, r6)
                if (r3 == 0) goto L_0x0176
            L_0x0042:
                r8 = 0
            L_0x0043:
                r3 = 0
            L_0x0044:
                int r4 = r5.length()
                if (r3 >= r4) goto L_0x0171
                java.lang.String r4 = "=,;"
                int r4 = r0.indexOfElement(r5, r4, r3)
                java.lang.String r3 = r5.substring(r3, r4)
                java.lang.String r6 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                com.onedelhi.secure.jt1.m53776o(r3, r6)
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
                java.util.Objects.requireNonNull(r3, r1)
                java.lang.CharSequence r3 = com.onedelhi.secure.u54.m66544E5(r3)
                java.lang.String r3 = r3.toString()
                r29 = r2
                int r2 = r5.length()
                if (r4 == r2) goto L_0x00cb
                char r2 = r5.charAt(r4)
                r30 = r8
                r8 = 44
                if (r2 == r8) goto L_0x00cd
                char r2 = r5.charAt(r4)
                r8 = 59
                if (r2 != r8) goto L_0x0081
                goto L_0x00cd
            L_0x0081:
                int r4 = r4 + 1
                int r2 = com.onedelhi.secure.nq4.m58669G(r5, r4)
                int r4 = r5.length()
                if (r2 >= r4) goto L_0x00b2
                char r4 = r5.charAt(r2)
                r8 = 34
                if (r4 != r8) goto L_0x00b2
                int r2 = r2 + 1
                r24 = 34
                r26 = 0
                r27 = 4
                r28 = 0
                r23 = r5
                r25 = r2
                int r1 = com.onedelhi.secure.u54.m66666q3(r23, r24, r25, r26, r27, r28)
                java.lang.String r2 = r5.substring(r2, r1)
                com.onedelhi.secure.jt1.m53776o(r2, r6)
                r4 = 1
                int r1 = r1 + r4
                r4 = r1
                goto L_0x00d0
            L_0x00b2:
                java.lang.String r4 = ",;"
                int r4 = r0.indexOfElement(r5, r4, r2)
                java.lang.String r2 = r5.substring(r2, r4)
                com.onedelhi.secure.jt1.m53776o(r2, r6)
                java.util.Objects.requireNonNull(r2, r1)
                java.lang.CharSequence r1 = com.onedelhi.secure.u54.m66544E5(r2)
                java.lang.String r2 = r1.toString()
                goto L_0x00d0
            L_0x00cb:
                r30 = r8
            L_0x00cd:
                int r4 = r4 + 1
                r2 = 0
            L_0x00d0:
                java.lang.String r1 = "no-cache"
                r6 = 1
                boolean r1 = com.onedelhi.secure.t54.m65410K1(r1, r3, r6)
                if (r1 == 0) goto L_0x00dd
                r1 = -1
                r10 = 1
                goto L_0x0168
            L_0x00dd:
                java.lang.String r1 = "no-store"
                boolean r1 = com.onedelhi.secure.t54.m65410K1(r1, r3, r6)
                if (r1 == 0) goto L_0x00e9
                r1 = -1
                r11 = 1
                goto L_0x0168
            L_0x00e9:
                java.lang.String r1 = "max-age"
                boolean r1 = com.onedelhi.secure.t54.m65410K1(r1, r3, r6)
                if (r1 == 0) goto L_0x00f8
                r1 = -1
                int r12 = com.onedelhi.secure.nq4.m58702g0(r2, r1)
                goto L_0x0168
            L_0x00f8:
                r1 = -1
                java.lang.String r8 = "s-maxage"
                boolean r8 = com.onedelhi.secure.t54.m65410K1(r8, r3, r6)
                if (r8 == 0) goto L_0x0106
                int r13 = com.onedelhi.secure.nq4.m58702g0(r2, r1)
                goto L_0x0168
            L_0x0106:
                java.lang.String r1 = "private"
                boolean r1 = com.onedelhi.secure.t54.m65410K1(r1, r3, r6)
                if (r1 == 0) goto L_0x0111
                r1 = -1
                r14 = 1
                goto L_0x0168
            L_0x0111:
                java.lang.String r1 = "public"
                boolean r1 = com.onedelhi.secure.t54.m65410K1(r1, r3, r6)
                if (r1 == 0) goto L_0x011c
                r1 = -1
                r15 = 1
                goto L_0x0168
            L_0x011c:
                java.lang.String r1 = "must-revalidate"
                boolean r1 = com.onedelhi.secure.t54.m65410K1(r1, r3, r6)
                if (r1 == 0) goto L_0x0128
                r1 = -1
                r16 = 1
                goto L_0x0168
            L_0x0128:
                java.lang.String r1 = "max-stale"
                boolean r1 = com.onedelhi.secure.t54.m65410K1(r1, r3, r6)
                if (r1 == 0) goto L_0x0139
                r1 = 2147483647(0x7fffffff, float:NaN)
                int r17 = com.onedelhi.secure.nq4.m58702g0(r2, r1)
                r1 = -1
                goto L_0x0168
            L_0x0139:
                java.lang.String r1 = "min-fresh"
                boolean r1 = com.onedelhi.secure.t54.m65410K1(r1, r3, r6)
                if (r1 == 0) goto L_0x0147
                r1 = -1
                int r18 = com.onedelhi.secure.nq4.m58702g0(r2, r1)
                goto L_0x0168
            L_0x0147:
                r1 = -1
                java.lang.String r2 = "only-if-cached"
                boolean r2 = com.onedelhi.secure.t54.m65410K1(r2, r3, r6)
                if (r2 == 0) goto L_0x0153
                r19 = 1
                goto L_0x0168
            L_0x0153:
                java.lang.String r2 = "no-transform"
                boolean r2 = com.onedelhi.secure.t54.m65410K1(r2, r3, r6)
                if (r2 == 0) goto L_0x015e
                r20 = 1
                goto L_0x0168
            L_0x015e:
                java.lang.String r2 = "immutable"
                boolean r2 = com.onedelhi.secure.t54.m65410K1(r2, r3, r6)
                if (r2 == 0) goto L_0x0168
                r21 = 1
            L_0x0168:
                r1 = r32
                r3 = r4
                r2 = r29
                r8 = r30
                goto L_0x0044
            L_0x0171:
                r29 = r2
                r30 = r8
                goto L_0x0178
            L_0x0176:
                r29 = r2
            L_0x0178:
                r1 = -1
                int r7 = r7 + 1
                r1 = r32
                r2 = r29
                goto L_0x0023
            L_0x0181:
                if (r8 != 0) goto L_0x0186
                r22 = 0
                goto L_0x0188
            L_0x0186:
                r22 = r9
            L_0x0188:
                okhttp3.CacheControl r1 = new okhttp3.CacheControl
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.Companion.parse(okhttp3.Headers):okhttp3.CacheControl");
        }
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z3;
        this.isPublic = z4;
        this.mustRevalidate = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.immutable = z8;
        this.headerValue = str;
    }

    public /* synthetic */ CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, wg0 wg0) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }

    @zw1
    @vr2
    public static final CacheControl parse(@vr2 Headers headers) {
        return Companion.parse(headers);
    }

    @uw1(name = "-deprecated_immutable")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "immutable", imports = {}))
    /* renamed from: -deprecated_immutable  reason: not valid java name */
    public final boolean m74759deprecated_immutable() {
        return this.immutable;
    }

    @uw1(name = "-deprecated_maxAgeSeconds")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "maxAgeSeconds", imports = {}))
    /* renamed from: -deprecated_maxAgeSeconds  reason: not valid java name */
    public final int m74760deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @uw1(name = "-deprecated_maxStaleSeconds")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "maxStaleSeconds", imports = {}))
    /* renamed from: -deprecated_maxStaleSeconds  reason: not valid java name */
    public final int m74761deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @uw1(name = "-deprecated_minFreshSeconds")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "minFreshSeconds", imports = {}))
    /* renamed from: -deprecated_minFreshSeconds  reason: not valid java name */
    public final int m74762deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @uw1(name = "-deprecated_mustRevalidate")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "mustRevalidate", imports = {}))
    /* renamed from: -deprecated_mustRevalidate  reason: not valid java name */
    public final boolean m74763deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    @uw1(name = "-deprecated_noCache")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "noCache", imports = {}))
    /* renamed from: -deprecated_noCache  reason: not valid java name */
    public final boolean m74764deprecated_noCache() {
        return this.noCache;
    }

    @uw1(name = "-deprecated_noStore")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "noStore", imports = {}))
    /* renamed from: -deprecated_noStore  reason: not valid java name */
    public final boolean m74765deprecated_noStore() {
        return this.noStore;
    }

    @uw1(name = "-deprecated_noTransform")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "noTransform", imports = {}))
    /* renamed from: -deprecated_noTransform  reason: not valid java name */
    public final boolean m74766deprecated_noTransform() {
        return this.noTransform;
    }

    @uw1(name = "-deprecated_onlyIfCached")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "onlyIfCached", imports = {}))
    /* renamed from: -deprecated_onlyIfCached  reason: not valid java name */
    public final boolean m74767deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    @uw1(name = "-deprecated_sMaxAgeSeconds")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "sMaxAgeSeconds", imports = {}))
    /* renamed from: -deprecated_sMaxAgeSeconds  reason: not valid java name */
    public final int m74768deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @uw1(name = "immutable")
    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    @uw1(name = "maxAgeSeconds")
    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @uw1(name = "maxStaleSeconds")
    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @uw1(name = "minFreshSeconds")
    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @uw1(name = "mustRevalidate")
    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    @uw1(name = "noCache")
    public final boolean noCache() {
        return this.noCache;
    }

    @uw1(name = "noStore")
    public final boolean noStore() {
        return this.noStore;
    }

    @uw1(name = "noTransform")
    public final boolean noTransform() {
        return this.noTransform;
    }

    @uw1(name = "onlyIfCached")
    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    @uw1(name = "sMaxAgeSeconds")
    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @vr2
    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.noCache) {
            sb.append("no-cache, ");
        }
        if (this.noStore) {
            sb.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb.append("max-age=");
            sb.append(this.maxAgeSeconds);
            sb.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb.append("s-maxage=");
            sb.append(this.sMaxAgeSeconds);
            sb.append(", ");
        }
        if (this.isPrivate) {
            sb.append("private, ");
        }
        if (this.isPublic) {
            sb.append("public, ");
        }
        if (this.mustRevalidate) {
            sb.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb.append("max-stale=");
            sb.append(this.maxStaleSeconds);
            sb.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb.append("min-fresh=");
            sb.append(this.minFreshSeconds);
            sb.append(", ");
        }
        if (this.onlyIfCached) {
            sb.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb.append("no-transform, ");
        }
        if (this.immutable) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        jt1.m53776o(sb2, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = sb2;
        return sb2;
    }
}
