package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\b\u001a6\u0010\n\u001a\u00020\t2\u001b\u0010\b\u001a\u0017\u0012\b\u0012\u00060\u0000j\u0002`\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a>\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u001b\u0010\b\u001a\u0017\u0012\b\u0012\u00060\u0000j\u0002`\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a1\u0010\u0010\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u000e\"\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011\u001a1\u0010\u0012\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000e\"\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\b\u001a\u001f\u0010\u0016\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0015H\b\u001a\u001f\u0010\u0017\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\b\u001a\u001f\u0010\u0018\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\b\u001a\u001d\u0010\u001a\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u000f\u001a\u00020\u0019H\b\u001a\u001d\u0010\u001c\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u000f\u001a\u00020\u001bH\b\u001a\u001d\u0010\u001e\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u000f\u001a\u00020\u001dH\b\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001f"}, d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "obj", "h0", "Lkotlin/Function1;", "Lcom/onedelhi/secure/un4;", "Lcom/onedelhi/secure/wy0;", "builderAction", "", "s0", "", "capacity", "r0", "", "value", "j0", "(Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;", "i0", "(Ljava/lang/StringBuilder;[Ljava/lang/Object;)Ljava/lang/StringBuilder;", "k0", "", "m0", "o0", "n0", "", "q0", "", "l0", "", "p0", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/text/StringsKt")
public class q54 extends p54 {
    @xq1
    @xj0(level = ak0.WARNING, message = "Use append(value: Any?) instead", replaceWith = @oi3(expression = "append(value = obj)", imports = {}))
    /* renamed from: h0 */
    public static final StringBuilder m62137h0(StringBuilder sb, Object obj) {
        jt1.m53777p(sb, "<this>");
        sb.append(obj);
        jt1.m53776o(sb, "this.append(obj)");
        return sb;
    }

    @vr2
    /* renamed from: i0 */
    public static final StringBuilder m62138i0(@vr2 StringBuilder sb, @vr2 Object... objArr) {
        jt1.m53777p(sb, "<this>");
        jt1.m53777p(objArr, "value");
        for (Object append : objArr) {
            sb.append(append);
        }
        return sb;
    }

    @vr2
    /* renamed from: j0 */
    public static final StringBuilder m62139j0(@vr2 StringBuilder sb, @vr2 String... strArr) {
        jt1.m53777p(sb, "<this>");
        jt1.m53777p(strArr, "value");
        for (String append : strArr) {
            sb.append(append);
        }
        return sb;
    }

    @gz3(version = "1.4")
    @xq1
    /* renamed from: k0 */
    public static final StringBuilder m62140k0(StringBuilder sb) {
        jt1.m53777p(sb, "<this>");
        sb.append(10);
        jt1.m53776o(sb, "append('\\n')");
        return sb;
    }

    @gz3(version = "1.4")
    @xq1
    /* renamed from: l0 */
    public static final StringBuilder m62141l0(StringBuilder sb, char c) {
        jt1.m53777p(sb, "<this>");
        sb.append(c);
        jt1.m53776o(sb, "append(value)");
        sb.append(10);
        jt1.m53776o(sb, "append('\\n')");
        return sb;
    }

    @gz3(version = "1.4")
    @xq1
    /* renamed from: m0 */
    public static final StringBuilder m62142m0(StringBuilder sb, CharSequence charSequence) {
        jt1.m53777p(sb, "<this>");
        sb.append(charSequence);
        jt1.m53776o(sb, "append(value)");
        sb.append(10);
        jt1.m53776o(sb, "append('\\n')");
        return sb;
    }

    @gz3(version = "1.4")
    @xq1
    /* renamed from: n0 */
    public static final StringBuilder m62143n0(StringBuilder sb, Object obj) {
        jt1.m53777p(sb, "<this>");
        sb.append(obj);
        jt1.m53776o(sb, "append(value)");
        sb.append(10);
        jt1.m53776o(sb, "append('\\n')");
        return sb;
    }

    @gz3(version = "1.4")
    @xq1
    /* renamed from: o0 */
    public static final StringBuilder m62144o0(StringBuilder sb, String str) {
        jt1.m53777p(sb, "<this>");
        sb.append(str);
        jt1.m53776o(sb, "append(value)");
        sb.append(10);
        jt1.m53776o(sb, "append('\\n')");
        return sb;
    }

    @gz3(version = "1.4")
    @xq1
    /* renamed from: p0 */
    public static final StringBuilder m62145p0(StringBuilder sb, boolean z) {
        jt1.m53777p(sb, "<this>");
        sb.append(z);
        jt1.m53776o(sb, "append(value)");
        sb.append(10);
        jt1.m53776o(sb, "append('\\n')");
        return sb;
    }

    @gz3(version = "1.4")
    @xq1
    /* renamed from: q0 */
    public static final StringBuilder m62146q0(StringBuilder sb, char[] cArr) {
        jt1.m53777p(sb, "<this>");
        jt1.m53777p(cArr, "value");
        sb.append(cArr);
        jt1.m53776o(sb, "append(value)");
        sb.append(10);
        jt1.m53776o(sb, "append('\\n')");
        return sb;
    }

    @gz3(version = "1.1")
    @xq1
    /* renamed from: r0 */
    public static final String m62147r0(int i, ec1<? super StringBuilder, un4> ec1) {
        jt1.m53777p(ec1, "builderAction");
        StringBuilder sb = new StringBuilder(i);
        ec1.mo17094X(sb);
        String sb2 = sb.toString();
        jt1.m53776o(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @xq1
    /* renamed from: s0 */
    public static final String m62148s0(ec1<? super StringBuilder, un4> ec1) {
        jt1.m53777p(ec1, "builderAction");
        StringBuilder sb = new StringBuilder();
        ec1.mo17094X(sb);
        String sb2 = sb.toString();
        jt1.m53776o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
