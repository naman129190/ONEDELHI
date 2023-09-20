package com.onedelhi.secure;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a\f\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0000H\u0002\u001a\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002\u001a0\u0010\r\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\u000f"}, d2 = {"", "e", "", "a", "input", "", "pos", "limit", "Ljava/net/InetAddress;", "c", "", "address", "addressOffset", "b", "d", "okhttp"}, k = 2, mv = {1, 4, 0})
public final class vl1 {
    /* renamed from: a */
    public static final boolean m68217a(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (jt1.m53781t(charAt, 31) <= 0 || jt1.m53781t(charAt, 127) >= 0 || u54.m66666q3(" #%/:?@[\\]", charAt, 0, false, 6, (Object) null) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m68218b(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (jt1.m53781t(charAt, 48) < 0 || jt1.m53781t(charAt, 57) > 0) {
                    break;
                } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        if (r13 == 16) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0099, code lost:
        if (r14 != -1) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009c, code lost:
        r0 = r13 - r14;
        java.lang.System.arraycopy(r9, r14, r9, 16 - r0, r0);
        java.util.Arrays.fill(r9, r14, (16 - r13) + r14, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ae, code lost:
        return java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0084 A[LOOP:0: B:1:0x000e->B:36:0x0084, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0096 A[EDGE_INSN: B:44:0x0096->B:37:0x0096 ?: BREAK  
    EDGE_INSN: B:50:0x0096->B:37:0x0096 ?: BREAK  , RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.net.InetAddress m68219c(java.lang.String r18, int r19, int r20) {
        /*
            r6 = r18
            r7 = r20
            r8 = 16
            byte[] r9 = new byte[r8]
            r11 = -1
            r12 = r19
            r13 = 0
            r14 = -1
            r15 = -1
        L_0x000e:
            r16 = 0
            if (r12 >= r7) goto L_0x0097
            if (r13 != r8) goto L_0x0015
            return r16
        L_0x0015:
            int r5 = r12 + 2
            if (r5 > r7) goto L_0x0038
            r3 = 0
            r4 = 4
            r17 = 0
            java.lang.String r1 = "::"
            r0 = r18
            r2 = r12
            r10 = r5
            r5 = r17
            boolean r0 = com.onedelhi.secure.t54.m65464t2(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0038
            if (r14 == r11) goto L_0x002e
            return r16
        L_0x002e:
            int r13 = r13 + 2
            if (r10 != r7) goto L_0x0035
            r14 = r13
            goto L_0x0097
        L_0x0035:
            r15 = r10
            r14 = r13
            goto L_0x0067
        L_0x0038:
            if (r13 == 0) goto L_0x0066
            r3 = 0
            r4 = 4
            r5 = 0
            java.lang.String r1 = ":"
            r0 = r18
            r2 = r12
            boolean r0 = com.onedelhi.secure.t54.m65464t2(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x004b
            int r12 = r12 + 1
            goto L_0x0066
        L_0x004b:
            r3 = 0
            r4 = 4
            r5 = 0
            java.lang.String r1 = "."
            r0 = r18
            r2 = r12
            boolean r0 = com.onedelhi.secure.t54.m65464t2(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0065
            int r0 = r13 + -2
            boolean r0 = m68218b(r6, r15, r7, r9, r0)
            if (r0 != 0) goto L_0x0062
            return r16
        L_0x0062:
            int r13 = r13 + 2
            goto L_0x0097
        L_0x0065:
            return r16
        L_0x0066:
            r15 = r12
        L_0x0067:
            r12 = r15
            r0 = 0
        L_0x0069:
            if (r12 >= r7) goto L_0x007c
            char r1 = r6.charAt(r12)
            int r1 = com.onedelhi.secure.nq4.m58677O(r1)
            if (r1 != r11) goto L_0x0076
            goto L_0x007c
        L_0x0076:
            int r0 = r0 << 4
            int r0 = r0 + r1
            int r12 = r12 + 1
            goto L_0x0069
        L_0x007c:
            int r1 = r12 - r15
            if (r1 == 0) goto L_0x0096
            r2 = 4
            if (r1 <= r2) goto L_0x0084
            goto L_0x0096
        L_0x0084:
            int r1 = r13 + 1
            int r2 = r0 >>> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r9[r13] = r2
            int r13 = r1 + 1
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r9[r1] = r0
            goto L_0x000e
        L_0x0096:
            return r16
        L_0x0097:
            if (r13 == r8) goto L_0x00aa
            if (r14 != r11) goto L_0x009c
            return r16
        L_0x009c:
            int r0 = r13 - r14
            int r1 = 16 - r0
            java.lang.System.arraycopy(r9, r14, r9, r1, r0)
            int r8 = r8 - r13
            int r8 = r8 + r14
            r0 = 0
            byte r0 = (byte) r0
            java.util.Arrays.fill(r9, r14, r8, r0)
        L_0x00aa:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vl1.m68219c(java.lang.String, int, int):java.net.InetAddress");
    }

    /* renamed from: d */
    public static final String m68220d(byte[] bArr) {
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i2 = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        C6205no noVar = new C6205no();
        while (i < bArr.length) {
            if (i == i2) {
                noVar.mo41230L0(58);
                i += i4;
                if (i == 16) {
                    noVar.mo41230L0(58);
                }
            } else {
                if (i > 0) {
                    noVar.mo41230L0(58);
                }
                noVar.mo41261e1((long) ((nq4.m58691b(bArr[i], 255) << 8) | nq4.m58691b(bArr[i + 1], 255)));
                i += 2;
            }
        }
        return noVar.mo31688j();
    }

    @ss2
    /* renamed from: e */
    public static final String m68221e(@vr2 String str) {
        jt1.m53777p(str, "$this$toCanonicalHost");
        boolean z = false;
        if (u54.m66602V2(str, ar4.f25981a, false, 2, (Object) null)) {
            InetAddress c = (!t54.m65466u2(str, "[", false, 2, (Object) null) || !t54.m65408J1(str, "]", false, 2, (Object) null)) ? m68219c(str, 0, str.length()) : m68219c(str, 1, str.length() - 1);
            if (c == null) {
                return null;
            }
            byte[] address = c.getAddress();
            if (address.length == 16) {
                jt1.m53776o(address, "address");
                return m68220d(address);
            } else if (address.length == 4) {
                return c.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                jt1.m53776o(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                jt1.m53776o(locale, "Locale.US");
                if (ascii != null) {
                    String lowerCase = ascii.toLowerCase(locale);
                    jt1.m53776o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (lowerCase.length() == 0) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    if (m68217a(lowerCase)) {
                        return null;
                    }
                    return lowerCase;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }
}
