package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u0014\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\u0007\u001a!\u0010\b\u001a\u00020\u0007*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n\u001a-\u0010\f\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u000bH\b\u001a\u001d\u0010\r\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\b\u001a%\u0010\u000e\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\b\u001a7\u0010\u0012\u001a\u00020\u0007*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H\b\u001a-\u0010\u0013\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\b\u001a-\u0010\u0015\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\b\u001a5\u0010\u0016\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\b\u001a5\u0010\u0017\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\b\u001a\u001f\u0010\u0019\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0018H\b\u001a%\u0010\u001a\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\b\u001a\u001d\u0010\u001b\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\b\u001a\u001d\u0010\u001d\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u001cH\b\u001a\u001d\u0010\u001f\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u001eH\b\u001a\u001d\u0010!\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020 H\b\u001a\u001d\u0010#\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\"H\b\u001a\u001d\u0010%\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020$H\b\u001a\u0014\u0010(\u001a\u00060&j\u0002`'*\u00060&j\u0002`'H\u0007\u001a\u001f\u0010)\u001a\u00060&j\u0002`'*\u00060&j\u0002`'2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0014H\b\u001a\u001d\u0010*\u001a\u00060&j\u0002`'*\u00060&j\u0002`'2\u0006\u0010\u0006\u001a\u00020\u0005H\b\u001a\u0014\u0010+\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\u0007\u001a\u001f\u0010,\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0018H\b\u001a\u001f\u0010-\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0014H\b\u001a\u001f\u0010.\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u000bH\b\u001a\u001f\u00100\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010/H\b\u001a%\u00101\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\b\u001a\u001d\u00102\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u000fH\b\u001a\u001d\u00103\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\b\u001a\u001d\u00105\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u000204H\b\u001a\u001d\u00106\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\b\u001a\u001d\u00107\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u001cH\b\u001a\u001d\u00108\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u001eH\b\u001a\u001d\u00109\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020 H\b\u001a\u001d\u0010:\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\"H\b\u001a\u001d\u0010;\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020$H\b¨\u0006<"}, d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Y", "", "index", "", "value", "Lcom/onedelhi/secure/un4;", "d0", "startIndex", "endIndex", "", "e0", "Z", "a0", "", "destination", "destinationOffset", "f0", "F", "", "E", "c0", "b0", "Ljava/lang/StringBuffer;", "B", "C", "z", "", "D", "", "w", "", "A", "", "y", "", "x", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "G", "I", "H", "J", "T", "Q", "S", "", "R", "U", "X", "L", "", "W", "O", "V", "K", "P", "N", "M", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/text/StringsKt")
public class p54 extends o54 {
    @gz3(version = "1.4")
    @xq1
    /* renamed from: A */
    public static final StringBuilder m60458A(StringBuilder sb, long j) {
        jt1.m53777p(sb, "<this>");
        sb.append(j);
        jt1.m53776o(sb, "append(value)");
        sb.append(10);
        jt1.m53776o(sb, "append('\\n')");
        return sb;
    }

    @gz3(version = "1.4")
    @xq1
    /* renamed from: B */
    public static final StringBuilder m60459B(StringBuilder sb, StringBuffer stringBuffer) {
        jt1.m53777p(sb, "<this>");
        sb.append(stringBuffer);
        jt1.m53776o(sb, "append(value)");
        sb.append(10);
        jt1.m53776o(sb, "append('\\n')");
        return sb;
    }

    @gz3(version = "1.4")
    @xq1
    /* renamed from: C */
    public static final StringBuilder m60460C(StringBuilder sb, StringBuilder sb2) {
        jt1.m53777p(sb, "<this>");
        sb.append(sb2);
        jt1.m53776o(sb, "append(value)");
        sb.append(10);
        jt1.m53776o(sb, "append('\\n')");
        return sb;
    }

    @gz3(version = "1.4")
    @xq1
    /* renamed from: D */
    public static final StringBuilder m60461D(StringBuilder sb, short s) {
        jt1.m53777p(sb, "<this>");
        sb.append(s);
        jt1.m53776o(sb, "append(value.toInt())");
        sb.append(10);
        jt1.m53776o(sb, "append('\\n')");
        return sb;
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: E */
    public static final StringBuilder m60462E(StringBuilder sb, CharSequence charSequence, int i, int i2) {
        jt1.m53777p(sb, "<this>");
        jt1.m53777p(charSequence, "value");
        sb.append(charSequence, i, i2);
        jt1.m53776o(sb, "this.append(value, startIndex, endIndex)");
        return sb;
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: F */
    public static final StringBuilder m60463F(StringBuilder sb, char[] cArr, int i, int i2) {
        jt1.m53777p(sb, "<this>");
        jt1.m53777p(cArr, "value");
        sb.append(cArr, i, i2 - i);
        jt1.m53776o(sb, "this.append(value, start…x, endIndex - startIndex)");
        return sb;
    }

    @vr2
    @xj0(level = ak0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @oi3(expression = "appendLine()", imports = {}))
    /* renamed from: G */
    public static final Appendable m60464G(@vr2 Appendable appendable) {
        jt1.m53777p(appendable, "<this>");
        Appendable append = appendable.append(f94.f28210a);
        jt1.m53776o(append, "append(SystemProperties.LINE_SEPARATOR)");
        return append;
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @oi3(expression = "appendLine(value)", imports = {}))
    /* renamed from: H */
    public static final Appendable m60465H(Appendable appendable, char c) {
        jt1.m53777p(appendable, "<this>");
        Appendable append = appendable.append(c);
        jt1.m53776o(append, "append(value)");
        return m60464G(append);
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @oi3(expression = "appendLine(value)", imports = {}))
    /* renamed from: I */
    public static final Appendable m60466I(Appendable appendable, CharSequence charSequence) {
        jt1.m53777p(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        jt1.m53776o(append, "append(value)");
        return m60464G(append);
    }

    @vr2
    @xj0(level = ak0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @oi3(expression = "appendLine()", imports = {}))
    /* renamed from: J */
    public static final StringBuilder m60467J(@vr2 StringBuilder sb) {
        jt1.m53777p(sb, "<this>");
        sb.append(f94.f28210a);
        jt1.m53776o(sb, "append(SystemProperties.LINE_SEPARATOR)");
        return sb;
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @oi3(expression = "appendLine(value)", imports = {}))
    /* renamed from: K */
    public static final StringBuilder m60468K(StringBuilder sb, byte b) {
        jt1.m53777p(sb, "<this>");
        sb.append(b);
        jt1.m53776o(sb, "append(value.toInt())");
        return m60467J(sb);
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @oi3(expression = "appendLine(value)", imports = {}))
    /* renamed from: L */
    public static final StringBuilder m60469L(StringBuilder sb, char c) {
        jt1.m53777p(sb, "<this>");
        sb.append(c);
        jt1.m53776o(sb, "append(value)");
        return m60467J(sb);
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @oi3(expression = "appendLine(value)", imports = {}))
    /* renamed from: M */
    public static final StringBuilder m60470M(StringBuilder sb, double d) {
        jt1.m53777p(sb, "<this>");
        sb.append(d);
        jt1.m53776o(sb, "append(value)");
        return m60467J(sb);
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @oi3(expression = "appendLine(value)", imports = {}))
    /* renamed from: N */
    public static final StringBuilder m60471N(StringBuilder sb, float f) {
        jt1.m53777p(sb, "<this>");
        sb.append(f);
        jt1.m53776o(sb, "append(value)");
        return m60467J(sb);
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @oi3(expression = "appendLine(value)", imports = {}))
    /* renamed from: O */
    public static final StringBuilder m60472O(StringBuilder sb, int i) {
        jt1.m53777p(sb, "<this>");
        sb.append(i);
        jt1.m53776o(sb, "append(value)");
        return m60467J(sb);
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @oi3(expression = "appendLine(value)", imports = {}))
    /* renamed from: P */
    public static final StringBuilder m60473P(StringBuilder sb, long j) {
        jt1.m53777p(sb, "<this>");
        sb.append(j);
        jt1.m53776o(sb, "append(value)");
        return m60467J(sb);
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @oi3(expression = "appendLine(value)", imports = {}))
    /* renamed from: Q */
    public static final StringBuilder m60474Q(StringBuilder sb, CharSequence charSequence) {
        jt1.m53777p(sb, "<this>");
        sb.append(charSequence);
        jt1.m53776o(sb, "append(value)");
        return m60467J(sb);
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @oi3(expression = "appendLine(value)", imports = {}))
    /* renamed from: R */
    public static final StringBuilder m60475R(StringBuilder sb, Object obj) {
        jt1.m53777p(sb, "<this>");
        sb.append(obj);
        jt1.m53776o(sb, "append(value)");
        return m60467J(sb);
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @oi3(expression = "appendLine(value)", imports = {}))
    /* renamed from: S */
    public static final StringBuilder m60476S(StringBuilder sb, String str) {
        jt1.m53777p(sb, "<this>");
        sb.append(str);
        jt1.m53776o(sb, "append(value)");
        return m60467J(sb);
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @oi3(expression = "appendLine(value)", imports = {}))
    /* renamed from: T */
    public static final StringBuilder m60477T(StringBuilder sb, StringBuffer stringBuffer) {
        jt1.m53777p(sb, "<this>");
        sb.append(stringBuffer);
        jt1.m53776o(sb, "append(value)");
        return m60467J(sb);
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @oi3(expression = "appendLine(value)", imports = {}))
    /* renamed from: U */
    public static final StringBuilder m60478U(StringBuilder sb, StringBuilder sb2) {
        jt1.m53777p(sb, "<this>");
        sb.append(sb2);
        jt1.m53776o(sb, "append(value)");
        return m60467J(sb);
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @oi3(expression = "appendLine(value)", imports = {}))
    /* renamed from: V */
    public static final StringBuilder m60479V(StringBuilder sb, short s) {
        jt1.m53777p(sb, "<this>");
        sb.append(s);
        jt1.m53776o(sb, "append(value.toInt())");
        return m60467J(sb);
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @oi3(expression = "appendLine(value)", imports = {}))
    /* renamed from: W */
    public static final StringBuilder m60480W(StringBuilder sb, boolean z) {
        jt1.m53777p(sb, "<this>");
        sb.append(z);
        jt1.m53776o(sb, "append(value)");
        return m60467J(sb);
    }

    @xq1
    @xj0(level = ak0.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @oi3(expression = "appendLine(value)", imports = {}))
    /* renamed from: X */
    public static final StringBuilder m60481X(StringBuilder sb, char[] cArr) {
        jt1.m53777p(sb, "<this>");
        jt1.m53777p(cArr, "value");
        sb.append(cArr);
        jt1.m53776o(sb, "append(value)");
        return m60467J(sb);
    }

    @gz3(version = "1.3")
    @vr2
    /* renamed from: Y */
    public static final StringBuilder m60482Y(@vr2 StringBuilder sb) {
        jt1.m53777p(sb, "<this>");
        sb.setLength(0);
        return sb;
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: Z */
    public static final StringBuilder m60483Z(StringBuilder sb, int i) {
        jt1.m53777p(sb, "<this>");
        StringBuilder deleteCharAt = sb.deleteCharAt(i);
        jt1.m53776o(deleteCharAt, "this.deleteCharAt(index)");
        return deleteCharAt;
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: a0 */
    public static final StringBuilder m60484a0(StringBuilder sb, int i, int i2) {
        jt1.m53777p(sb, "<this>");
        StringBuilder delete = sb.delete(i, i2);
        jt1.m53776o(delete, "this.delete(startIndex, endIndex)");
        return delete;
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: b0 */
    public static final StringBuilder m60485b0(StringBuilder sb, int i, CharSequence charSequence, int i2, int i3) {
        jt1.m53777p(sb, "<this>");
        jt1.m53777p(charSequence, "value");
        StringBuilder insert = sb.insert(i, charSequence, i2, i3);
        jt1.m53776o(insert, "this.insert(index, value, startIndex, endIndex)");
        return insert;
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: c0 */
    public static final StringBuilder m60486c0(StringBuilder sb, int i, char[] cArr, int i2, int i3) {
        jt1.m53777p(sb, "<this>");
        jt1.m53777p(cArr, "value");
        StringBuilder insert = sb.insert(i, cArr, i2, i3 - i2);
        jt1.m53776o(insert, "this.insert(index, value…x, endIndex - startIndex)");
        return insert;
    }

    @xq1
    /* renamed from: d0 */
    public static final void m60487d0(StringBuilder sb, int i, char c) {
        jt1.m53777p(sb, "<this>");
        sb.setCharAt(i, c);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: e0 */
    public static final StringBuilder m60488e0(StringBuilder sb, int i, int i2, String str) {
        jt1.m53777p(sb, "<this>");
        jt1.m53777p(str, "value");
        StringBuilder replace = sb.replace(i, i2, str);
        jt1.m53776o(replace, "this.replace(startIndex, endIndex, value)");
        return replace;
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: f0 */
    public static final void m60489f0(StringBuilder sb, char[] cArr, int i, int i2, int i3) {
        jt1.m53777p(sb, "<this>");
        jt1.m53777p(cArr, FirebaseAnalytics.C4305d.f24996z);
        sb.getChars(i2, i3, cArr, i);
    }

    /* renamed from: g0 */
    public static /* synthetic */ void m60490g0(StringBuilder sb, char[] cArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sb.length();
        }
        jt1.m53777p(sb, "<this>");
        jt1.m53777p(cArr, FirebaseAnalytics.C4305d.f24996z);
        sb.getChars(i2, i3, cArr, i);
    }

    @gz3(version = "1.4")
    @xq1
    /* renamed from: w */
    public static final StringBuilder m60491w(StringBuilder sb, byte b) {
        jt1.m53777p(sb, "<this>");
        sb.append(b);
        jt1.m53776o(sb, "append(value.toInt())");
        sb.append(10);
        jt1.m53776o(sb, "append('\\n')");
        return sb;
    }

    @gz3(version = "1.4")
    @xq1
    /* renamed from: x */
    public static final StringBuilder m60492x(StringBuilder sb, double d) {
        jt1.m53777p(sb, "<this>");
        sb.append(d);
        jt1.m53776o(sb, "append(value)");
        sb.append(10);
        jt1.m53776o(sb, "append('\\n')");
        return sb;
    }

    @gz3(version = "1.4")
    @xq1
    /* renamed from: y */
    public static final StringBuilder m60493y(StringBuilder sb, float f) {
        jt1.m53777p(sb, "<this>");
        sb.append(f);
        jt1.m53776o(sb, "append(value)");
        sb.append(10);
        jt1.m53776o(sb, "append('\\n')");
        return sb;
    }

    @gz3(version = "1.4")
    @xq1
    /* renamed from: z */
    public static final StringBuilder m60494z(StringBuilder sb, int i) {
        jt1.m53777p(sb, "<this>");
        sb.append(i);
        jt1.m53776o(sb, "append(value)");
        sb.append(10);
        jt1.m53776o(sb, "append('\\n')");
        return sb;
    }
}
