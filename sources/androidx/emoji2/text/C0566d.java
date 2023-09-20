package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.C0552c;
import androidx.emoji2.text.C0575f;
import com.onedelhi.secure.C3568t7;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.js1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.xs0;
import com.onedelhi.secure.ys0;
import java.util.Arrays;

@sj3(19)
@hl3({hl3.C2354a.f13185a})
@C3568t7
/* renamed from: androidx.emoji2.text.d */
public final class C0566d {

    /* renamed from: a */
    public static final int f3589a = 1;

    /* renamed from: b */
    public static final int f3590b = 2;

    /* renamed from: c */
    public static final int f3591c = 3;
    @mr2

    /* renamed from: a */
    public C0552c.C0558e f3592a;
    @mr2

    /* renamed from: a */
    public final C0552c.C0565l f3593a;
    @mr2

    /* renamed from: a */
    public final C0575f f3594a;

    /* renamed from: a */
    public final boolean f3595a;
    @ts2

    /* renamed from: a */
    public final int[] f3596a;

    @sj3(19)
    /* renamed from: androidx.emoji2.text.d$a */
    public static final class C0567a {

        /* renamed from: a */
        public static final int f3597a = -1;

        /* renamed from: a */
        public static int m4176a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z = true;
                    }
                }
                return i;
            }
        }

        /* renamed from: b */
        public static int m4177b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (r7 < length) {
                        char charAt = charSequence.charAt(r7);
                        if (z) {
                            if (!Character.isLowSurrogate(charAt)) {
                                return -1;
                            }
                            i2--;
                            i = r7 + 1;
                        } else if (!Character.isSurrogate(charAt)) {
                            i2--;
                            r7++;
                        } else if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        } else {
                            r7++;
                            z = true;
                        }
                    } else if (z) {
                        return -1;
                    } else {
                        return length;
                    }
                }
                return r7;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.d$b */
    public static final class C0568b {

        /* renamed from: d */
        public static final int f3598d = 1;

        /* renamed from: e */
        public static final int f3599e = 2;

        /* renamed from: a */
        public int f3600a = 1;

        /* renamed from: a */
        public final C0575f.C0576a f3601a;

        /* renamed from: a */
        public final boolean f3602a;

        /* renamed from: a */
        public final int[] f3603a;

        /* renamed from: b */
        public int f3604b;

        /* renamed from: b */
        public C0575f.C0576a f3605b;

        /* renamed from: c */
        public int f3606c;

        /* renamed from: c */
        public C0575f.C0576a f3607c;

        public C0568b(C0575f.C0576a aVar, boolean z, int[] iArr) {
            this.f3601a = aVar;
            this.f3605b = aVar;
            this.f3602a = z;
            this.f3603a = iArr;
        }

        /* renamed from: d */
        public static boolean m4178d(int i) {
            return i == 65039;
        }

        /* renamed from: f */
        public static boolean m4179f(int i) {
            return i == 65038;
        }

        /* renamed from: a */
        public int mo4209a(int i) {
            C0575f.C0576a a = this.f3605b.mo4238a(i);
            int i2 = 3;
            if (this.f3600a == 2) {
                if (a != null) {
                    this.f3605b = a;
                    this.f3606c++;
                } else if (!m4179f(i)) {
                    if (!m4178d(i)) {
                        if (this.f3605b.mo4239b() != null && (this.f3606c != 1 || mo4214h())) {
                            this.f3607c = this.f3605b;
                            mo4213g();
                            this.f3604b = i;
                            return i2;
                        }
                    }
                }
                i2 = 2;
                this.f3604b = i;
                return i2;
            } else if (a != null) {
                this.f3600a = 2;
                this.f3605b = a;
                this.f3606c = 1;
                i2 = 2;
                this.f3604b = i;
                return i2;
            }
            i2 = mo4213g();
            this.f3604b = i;
            return i2;
        }

        /* renamed from: b */
        public xs0 mo4210b() {
            return this.f3605b.mo4239b();
        }

        /* renamed from: c */
        public xs0 mo4211c() {
            return this.f3607c.mo4239b();
        }

        /* renamed from: e */
        public boolean mo4212e() {
            return this.f3600a == 2 && this.f3605b.mo4239b() != null && (this.f3606c > 1 || mo4214h());
        }

        /* renamed from: g */
        public final int mo4213g() {
            this.f3600a = 1;
            this.f3605b = this.f3601a;
            this.f3606c = 0;
            return 1;
        }

        /* renamed from: h */
        public final boolean mo4214h() {
            if (this.f3605b.mo4239b().mo27077l() || m4178d(this.f3604b)) {
                return true;
            }
            if (this.f3602a) {
                if (this.f3603a == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f3603a, this.f3605b.mo4239b().mo27067b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public C0566d(@mr2 C0575f fVar, @mr2 C0552c.C0565l lVar, @mr2 C0552c.C0558e eVar, boolean z, @ts2 int[] iArr) {
        this.f3593a = lVar;
        this.f3594a = fVar;
        this.f3592a = eVar;
        this.f3595a = z;
        this.f3596a = iArr;
    }

    /* renamed from: b */
    public static boolean m4166b(@mr2 Editable editable, @mr2 KeyEvent keyEvent, boolean z) {
        ys0[] ys0Arr;
        if (m4170i(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m4169h(selectionStart, selectionEnd) && (ys0Arr = (ys0[]) editable.getSpans(selectionStart, selectionEnd, ys0.class)) != null && ys0Arr.length > 0) {
            int length = ys0Arr.length;
            int i = 0;
            while (i < length) {
                ys0 ys0 = ys0Arr[i];
                int spanStart = editable.getSpanStart(ys0);
                int spanEnd = editable.getSpanEnd(ys0);
                if ((!z || spanStart != selectionStart) && ((z || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m4167e(@mr2 InputConnection inputConnection, @mr2 Editable editable, @js1(from = 0) int i, @js1(from = 0) int i2, boolean z) {
        int i3;
        int i4;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m4169h(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                i4 = C0567a.m4176a(editable, selectionStart, Math.max(i, 0));
                i3 = C0567a.m4177b(editable, selectionEnd, Math.max(i2, 0));
                if (i4 == -1 || i3 == -1) {
                    return false;
                }
            } else {
                i4 = Math.max(selectionStart - i, 0);
                i3 = Math.min(selectionEnd + i2, editable.length());
            }
            ys0[] ys0Arr = (ys0[]) editable.getSpans(i4, i3, ys0.class);
            if (ys0Arr != null && ys0Arr.length > 0) {
                for (ys0 ys0 : ys0Arr) {
                    int spanStart = editable.getSpanStart(ys0);
                    int spanEnd = editable.getSpanEnd(ys0);
                    i4 = Math.min(spanStart, i4);
                    i3 = Math.max(spanEnd, i3);
                }
                int max = Math.max(i4, 0);
                int min = Math.min(i3, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max, min);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m4168f(@mr2 Editable editable, int i, @mr2 KeyEvent keyEvent) {
        if (!(i != 67 ? i != 112 ? false : m4166b(editable, keyEvent, true) : m4166b(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* renamed from: h */
    public static boolean m4169h(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* renamed from: i */
    public static boolean m4170i(@mr2 KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* renamed from: a */
    public final void mo4204a(@mr2 Spannable spannable, xs0 xs0, int i, int i2) {
        spannable.setSpan(this.f3593a.mo4203a(xs0), i, i2, 33);
    }

    /* renamed from: c */
    public int mo4205c(@mr2 CharSequence charSequence) {
        return mo4206d(charSequence, this.f3594a.mo4234h());
    }

    /* renamed from: d */
    public int mo4206d(@mr2 CharSequence charSequence, int i) {
        C0568b bVar = new C0568b(this.f3594a.mo4235i(), this.f3595a, this.f3596a);
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int codePointAt = Character.codePointAt(charSequence, i2);
            int a = bVar.mo4209a(codePointAt);
            xs0 b = bVar.mo4210b();
            if (a == 1) {
                i2 += Character.charCount(codePointAt);
                i4 = 0;
            } else if (a == 2) {
                i2 += Character.charCount(codePointAt);
            } else if (a == 3) {
                b = bVar.mo4211c();
                if (b.mo27069d() <= i) {
                    i3++;
                }
            }
            if (b != null && b.mo27069d() <= i) {
                i4++;
            }
        }
        if (i3 != 0) {
            return 2;
        }
        if (!bVar.mo4212e() || bVar.mo4210b().mo27069d() > i) {
            return i4 == 0 ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: g */
    public final boolean mo4207g(CharSequence charSequence, int i, int i2, xs0 xs0) {
        if (xs0.mo27070e() == 0) {
            xs0.mo27079n(this.f3592a.mo4164a(charSequence, i, i2, xs0.mo27074i()));
        }
        return xs0.mo27070e() == 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047 A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063 A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0125  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence mo4208j(@com.onedelhi.secure.mr2 java.lang.CharSequence r10, @com.onedelhi.secure.js1(from = 0) int r11, @com.onedelhi.secure.js1(from = 0) int r12, @com.onedelhi.secure.js1(from = 0) int r13, boolean r14) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.onedelhi.secure.g14
            if (r0 == 0) goto L_0x000a
            r1 = r10
            com.onedelhi.secure.g14 r1 = (com.onedelhi.secure.g14) r1
            r1.mo16245a()
        L_0x000a:
            r1 = 0
            if (r0 != 0) goto L_0x002b
            boolean r2 = r10 instanceof android.text.Spannable     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x0012
            goto L_0x002b
        L_0x0012:
            boolean r2 = r10 instanceof android.text.Spanned     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x0033
            r2 = r10
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch:{ all -> 0x012c }
            int r3 = r11 + -1
            int r4 = r12 + 1
            java.lang.Class<com.onedelhi.secure.ys0> r5 = com.onedelhi.secure.ys0.class
            int r2 = r2.nextSpanTransition(r3, r4, r5)     // Catch:{ all -> 0x012c }
            if (r2 > r12) goto L_0x0033
            com.onedelhi.secure.go4 r1 = new com.onedelhi.secure.go4     // Catch:{ all -> 0x012c }
            r1.<init>((java.lang.CharSequence) r10)     // Catch:{ all -> 0x012c }
            goto L_0x0033
        L_0x002b:
            com.onedelhi.secure.go4 r1 = new com.onedelhi.secure.go4     // Catch:{ all -> 0x012c }
            r2 = r10
            android.text.Spannable r2 = (android.text.Spannable) r2     // Catch:{ all -> 0x012c }
            r1.<init>((android.text.Spannable) r2)     // Catch:{ all -> 0x012c }
        L_0x0033:
            r2 = 0
            if (r1 == 0) goto L_0x0061
            java.lang.Class<com.onedelhi.secure.ys0> r3 = com.onedelhi.secure.ys0.class
            java.lang.Object[] r3 = r1.getSpans(r11, r12, r3)     // Catch:{ all -> 0x012c }
            com.onedelhi.secure.ys0[] r3 = (com.onedelhi.secure.ys0[]) r3     // Catch:{ all -> 0x012c }
            if (r3 == 0) goto L_0x0061
            int r4 = r3.length     // Catch:{ all -> 0x012c }
            if (r4 <= 0) goto L_0x0061
            int r4 = r3.length     // Catch:{ all -> 0x012c }
            r5 = 0
        L_0x0045:
            if (r5 >= r4) goto L_0x0061
            r6 = r3[r5]     // Catch:{ all -> 0x012c }
            int r7 = r1.getSpanStart(r6)     // Catch:{ all -> 0x012c }
            int r8 = r1.getSpanEnd(r6)     // Catch:{ all -> 0x012c }
            if (r7 == r12) goto L_0x0056
            r1.removeSpan(r6)     // Catch:{ all -> 0x012c }
        L_0x0056:
            int r11 = java.lang.Math.min(r7, r11)     // Catch:{ all -> 0x012c }
            int r12 = java.lang.Math.max(r8, r12)     // Catch:{ all -> 0x012c }
            int r5 = r5 + 1
            goto L_0x0045
        L_0x0061:
            if (r11 == r12) goto L_0x0123
            int r3 = r10.length()     // Catch:{ all -> 0x012c }
            if (r11 < r3) goto L_0x006b
            goto L_0x0123
        L_0x006b:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r3) goto L_0x0080
            if (r1 == 0) goto L_0x0080
            int r3 = r1.length()     // Catch:{ all -> 0x012c }
            java.lang.Class<com.onedelhi.secure.ys0> r4 = com.onedelhi.secure.ys0.class
            java.lang.Object[] r3 = r1.getSpans(r2, r3, r4)     // Catch:{ all -> 0x012c }
            com.onedelhi.secure.ys0[] r3 = (com.onedelhi.secure.ys0[]) r3     // Catch:{ all -> 0x012c }
            int r3 = r3.length     // Catch:{ all -> 0x012c }
            int r13 = r13 - r3
        L_0x0080:
            androidx.emoji2.text.d$b r3 = new androidx.emoji2.text.d$b     // Catch:{ all -> 0x012c }
            androidx.emoji2.text.f r4 = r9.f3594a     // Catch:{ all -> 0x012c }
            androidx.emoji2.text.f$a r4 = r4.mo4235i()     // Catch:{ all -> 0x012c }
            boolean r5 = r9.f3595a     // Catch:{ all -> 0x012c }
            int[] r6 = r9.f3596a     // Catch:{ all -> 0x012c }
            r3.<init>(r4, r5, r6)     // Catch:{ all -> 0x012c }
            int r4 = java.lang.Character.codePointAt(r10, r11)     // Catch:{ all -> 0x012c }
            r2 = r1
            r5 = r4
            r4 = 0
        L_0x0096:
            r1 = r11
        L_0x0097:
            if (r11 >= r12) goto L_0x00e9
            if (r4 >= r13) goto L_0x00e9
            int r6 = r3.mo4209a(r5)     // Catch:{ all -> 0x012c }
            r7 = 1
            if (r6 == r7) goto L_0x00d7
            r7 = 2
            if (r6 == r7) goto L_0x00cb
            r7 = 3
            if (r6 == r7) goto L_0x00a9
            goto L_0x0097
        L_0x00a9:
            if (r14 != 0) goto L_0x00b5
            com.onedelhi.secure.xs0 r6 = r3.mo4211c()     // Catch:{ all -> 0x012c }
            boolean r6 = r9.mo4207g(r10, r1, r11, r6)     // Catch:{ all -> 0x012c }
            if (r6 != 0) goto L_0x0096
        L_0x00b5:
            if (r2 != 0) goto L_0x00c1
            com.onedelhi.secure.go4 r2 = new com.onedelhi.secure.go4     // Catch:{ all -> 0x012c }
            android.text.SpannableString r6 = new android.text.SpannableString     // Catch:{ all -> 0x012c }
            r6.<init>(r10)     // Catch:{ all -> 0x012c }
            r2.<init>((android.text.Spannable) r6)     // Catch:{ all -> 0x012c }
        L_0x00c1:
            com.onedelhi.secure.xs0 r6 = r3.mo4211c()     // Catch:{ all -> 0x012c }
            r9.mo4204a(r2, r6, r1, r11)     // Catch:{ all -> 0x012c }
            int r4 = r4 + 1
            goto L_0x0096
        L_0x00cb:
            int r6 = java.lang.Character.charCount(r5)     // Catch:{ all -> 0x012c }
            int r11 = r11 + r6
            if (r11 >= r12) goto L_0x0097
            int r5 = java.lang.Character.codePointAt(r10, r11)     // Catch:{ all -> 0x012c }
            goto L_0x0097
        L_0x00d7:
            int r11 = java.lang.Character.codePointAt(r10, r1)     // Catch:{ all -> 0x012c }
            int r11 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x012c }
            int r1 = r1 + r11
            if (r1 >= r12) goto L_0x00e7
            int r11 = java.lang.Character.codePointAt(r10, r1)     // Catch:{ all -> 0x012c }
            r5 = r11
        L_0x00e7:
            r11 = r1
            goto L_0x0097
        L_0x00e9:
            boolean r12 = r3.mo4212e()     // Catch:{ all -> 0x012c }
            if (r12 == 0) goto L_0x010c
            if (r4 >= r13) goto L_0x010c
            if (r14 != 0) goto L_0x00fd
            com.onedelhi.secure.xs0 r12 = r3.mo4210b()     // Catch:{ all -> 0x012c }
            boolean r12 = r9.mo4207g(r10, r1, r11, r12)     // Catch:{ all -> 0x012c }
            if (r12 != 0) goto L_0x010c
        L_0x00fd:
            if (r2 != 0) goto L_0x0105
            com.onedelhi.secure.go4 r12 = new com.onedelhi.secure.go4     // Catch:{ all -> 0x012c }
            r12.<init>((java.lang.CharSequence) r10)     // Catch:{ all -> 0x012c }
            r2 = r12
        L_0x0105:
            com.onedelhi.secure.xs0 r12 = r3.mo4210b()     // Catch:{ all -> 0x012c }
            r9.mo4204a(r2, r12, r1, r11)     // Catch:{ all -> 0x012c }
        L_0x010c:
            if (r2 == 0) goto L_0x011a
            android.text.Spannable r11 = r2.mo16742b()     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x0119
            com.onedelhi.secure.g14 r10 = (com.onedelhi.secure.g14) r10
            r10.mo16251d()
        L_0x0119:
            return r11
        L_0x011a:
            if (r0 == 0) goto L_0x0122
            r11 = r10
            com.onedelhi.secure.g14 r11 = (com.onedelhi.secure.g14) r11
            r11.mo16251d()
        L_0x0122:
            return r10
        L_0x0123:
            if (r0 == 0) goto L_0x012b
            r11 = r10
            com.onedelhi.secure.g14 r11 = (com.onedelhi.secure.g14) r11
            r11.mo16251d()
        L_0x012b:
            return r10
        L_0x012c:
            r11 = move-exception
            if (r0 == 0) goto L_0x0134
            com.onedelhi.secure.g14 r10 = (com.onedelhi.secure.g14) r10
            r10.mo16251d()
        L_0x0134:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0566d.mo4208j(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
