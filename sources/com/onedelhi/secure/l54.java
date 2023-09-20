package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\b\u001a\u00028\u0000\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\u000b\u001a\u00028\u0000\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00028\u00002\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\n\"\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\b\u001a\u001f\u0010\u000e\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\b\u001a\u001d\u0010\u0010\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u000fH\b\u001a;\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0011\u001a\u00028\u00002\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "T", "", "value", "", "startIndex", "endIndex", "f", "(Ljava/lang/Appendable;Ljava/lang/CharSequence;II)Ljava/lang/Appendable;", "", "a", "(Ljava/lang/Appendable;[Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "c", "e", "", "d", "element", "Lkotlin/Function1;", "transform", "Lcom/onedelhi/secure/un4;", "b", "(Ljava/lang/Appendable;Ljava/lang/Object;Lcom/onedelhi/secure/ec1;)V", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/text/StringsKt")
public class l54 {
    @vr2
    /* renamed from: a */
    public static final <T extends Appendable> T m55301a(@vr2 T t, @vr2 CharSequence... charSequenceArr) {
        jt1.m53777p(t, "<this>");
        jt1.m53777p(charSequenceArr, "value");
        for (CharSequence append : charSequenceArr) {
            t.append(append);
        }
        return t;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.onedelhi.secure.ec1<? super T, ? extends java.lang.CharSequence>, com.onedelhi.secure.ec1] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m55302b(@com.onedelhi.secure.vr2 java.lang.Appendable r1, T r2, @com.onedelhi.secure.ss2 com.onedelhi.secure.ec1<? super T, ? extends java.lang.CharSequence> r3) {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r1, r0)
            if (r3 == 0) goto L_0x0011
            java.lang.Object r2 = r3.mo17094X(r2)
        L_0x000b:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
        L_0x000d:
            r1.append(r2)
            goto L_0x002d
        L_0x0011:
            if (r2 != 0) goto L_0x0015
            r3 = 1
            goto L_0x0017
        L_0x0015:
            boolean r3 = r2 instanceof java.lang.CharSequence
        L_0x0017:
            if (r3 == 0) goto L_0x001a
            goto L_0x000b
        L_0x001a:
            boolean r3 = r2 instanceof java.lang.Character
            if (r3 == 0) goto L_0x0028
            java.lang.Character r2 = (java.lang.Character) r2
            char r2 = r2.charValue()
            r1.append(r2)
            goto L_0x002d
        L_0x0028:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            goto L_0x000d
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.l54.m55302b(java.lang.Appendable, java.lang.Object, com.onedelhi.secure.ec1):void");
    }

    @gz3(version = "1.4")
    @xq1
    /* renamed from: c */
    public static final Appendable m55303c(Appendable appendable) {
        jt1.m53777p(appendable, "<this>");
        Appendable append = appendable.append(10);
        jt1.m53776o(append, "append('\\n')");
        return append;
    }

    @gz3(version = "1.4")
    @xq1
    /* renamed from: d */
    public static final Appendable m55304d(Appendable appendable, char c) {
        jt1.m53777p(appendable, "<this>");
        Appendable append = appendable.append(c);
        jt1.m53776o(append, "append(value)");
        Appendable append2 = append.append(10);
        jt1.m53776o(append2, "append('\\n')");
        return append2;
    }

    @gz3(version = "1.4")
    @xq1
    /* renamed from: e */
    public static final Appendable m55305e(Appendable appendable, CharSequence charSequence) {
        jt1.m53777p(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        jt1.m53776o(append, "append(value)");
        Appendable append2 = append.append(10);
        jt1.m53776o(append2, "append('\\n')");
        return append2;
    }

    @vr2
    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    /* renamed from: f */
    public static final <T extends Appendable> T m55306f(@vr2 T t, @vr2 CharSequence charSequence, int i, int i2) {
        jt1.m53777p(t, "<this>");
        jt1.m53777p(charSequence, "value");
        T append = t.append(charSequence, i, i2);
        jt1.m53775n(append, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return append;
    }
}
