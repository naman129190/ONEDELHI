package com.onedelhi.secure;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class l91 {

    /* renamed from: com.onedelhi.secure.l91$a */
    public interface C2703a<T> {
        /* renamed from: a */
        void mo19338a(T t, Rect rect);
    }

    /* renamed from: com.onedelhi.secure.l91$b */
    public interface C2704b<T, V> {
        /* renamed from: a */
        int mo19339a(T t);

        /* renamed from: b */
        V mo19340b(T t, int i);
    }

    /* renamed from: com.onedelhi.secure.l91$c */
    public static class C2705c<T> implements Comparator<T> {

        /* renamed from: a */
        public final Rect f15232a = new Rect();

        /* renamed from: a */
        public final C2703a<T> f15233a;

        /* renamed from: b */
        public final Rect f15234b = new Rect();

        /* renamed from: b */
        public final boolean f15235b;

        public C2705c(boolean z, C2703a<T> aVar) {
            this.f15235b = z;
            this.f15233a = aVar;
        }

        public int compare(T t, T t2) {
            Rect rect = this.f15232a;
            Rect rect2 = this.f15234b;
            this.f15233a.mo19338a(t, rect);
            this.f15233a.mo19338a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                return this.f15235b ? 1 : -1;
            }
            if (i3 > i4) {
                return this.f15235b ? -1 : 1;
            }
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                return this.f15235b ? 1 : -1;
            }
            if (i7 > i8) {
                return this.f15235b ? -1 : 1;
            }
            return 0;
        }
    }

    /* renamed from: a */
    public static boolean m20336a(int i, @mr2 Rect rect, @mr2 Rect rect2, @mr2 Rect rect3) {
        boolean b = m20337b(i, rect, rect2);
        if (m20337b(i, rect, rect3) || !b) {
            return false;
        }
        return !m20345j(i, rect, rect3) || i == 17 || i == 66 || m20346k(i, rect, rect2) < m20348m(i, rect, rect3);
    }

    /* renamed from: b */
    public static boolean m20337b(int i, @mr2 Rect rect, @mr2 Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <L, T> T m20338c(@com.onedelhi.secure.mr2 L r7, @com.onedelhi.secure.mr2 com.onedelhi.secure.l91.C2704b<L, T> r8, @com.onedelhi.secure.mr2 com.onedelhi.secure.l91.C2703a<T> r9, @com.onedelhi.secure.ts2 T r10, @com.onedelhi.secure.mr2 android.graphics.Rect r11, int r12) {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r11)
            r1 = 17
            r2 = 0
            if (r12 == r1) goto L_0x0038
            r1 = 33
            if (r12 == r1) goto L_0x002e
            r1 = 66
            if (r12 == r1) goto L_0x0026
            r1 = 130(0x82, float:1.82E-43)
            if (r12 != r1) goto L_0x001e
            int r1 = r11.height()
            int r1 = r1 + 1
            int r1 = -r1
            goto L_0x0034
        L_0x001e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r7.<init>(r8)
            throw r7
        L_0x0026:
            int r1 = r11.width()
            int r1 = r1 + 1
            int r1 = -r1
            goto L_0x003e
        L_0x002e:
            int r1 = r11.height()
            int r1 = r1 + 1
        L_0x0034:
            r0.offset(r2, r1)
            goto L_0x0041
        L_0x0038:
            int r1 = r11.width()
            int r1 = r1 + 1
        L_0x003e:
            r0.offset(r1, r2)
        L_0x0041:
            r1 = 0
            int r3 = r8.mo19339a(r7)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
        L_0x004b:
            if (r2 >= r3) goto L_0x0064
            java.lang.Object r5 = r8.mo19340b(r7, r2)
            if (r5 != r10) goto L_0x0054
            goto L_0x0061
        L_0x0054:
            r9.mo19338a(r5, r4)
            boolean r6 = m20343h(r12, r11, r4, r0)
            if (r6 == 0) goto L_0x0061
            r0.set(r4)
            r1 = r5
        L_0x0061:
            int r2 = r2 + 1
            goto L_0x004b
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.l91.m20338c(java.lang.Object, com.onedelhi.secure.l91$b, com.onedelhi.secure.l91$a, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    /* renamed from: d */
    public static <L, T> T m20339d(@mr2 L l, @mr2 C2704b<L, T> bVar, @mr2 C2703a<T> aVar, @ts2 T t, int i, boolean z, boolean z2) {
        int a = bVar.mo19339a(l);
        ArrayList arrayList = new ArrayList(a);
        for (int i2 = 0; i2 < a; i2++) {
            arrayList.add(bVar.mo19340b(l, i2));
        }
        Collections.sort(arrayList, new C2705c(z, aVar));
        if (i == 1) {
            return m20341f(t, arrayList, z2);
        }
        if (i == 2) {
            return m20340e(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* renamed from: e */
    public static <T> T m20340e(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int lastIndexOf = (t == null ? -1 : arrayList.lastIndexOf(t)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: f */
    public static <T> T m20341f(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int indexOf = (t == null ? size : arrayList.indexOf(t)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: g */
    public static int m20342g(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: h */
    public static boolean m20343h(int i, @mr2 Rect rect, @mr2 Rect rect2, @mr2 Rect rect3) {
        if (!m20344i(rect, rect2, i)) {
            return false;
        }
        if (m20344i(rect, rect3, i) && !m20336a(i, rect, rect2, rect3)) {
            return !m20336a(i, rect, rect3, rect2) && m20342g(m20346k(i, rect, rect2), m20350o(i, rect, rect2)) < m20342g(m20346k(i, rect, rect3), m20350o(i, rect, rect3));
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m20344i(@mr2 Rect rect, @mr2 Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: j */
    public static boolean m20345j(int i, @mr2 Rect rect, @mr2 Rect rect2) {
        if (i == 17) {
            return rect.left >= rect2.right;
        }
        if (i == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i == 66) {
            return rect.right <= rect2.left;
        }
        if (i == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* renamed from: k */
    public static int m20346k(int i, @mr2 Rect rect, @mr2 Rect rect2) {
        return Math.max(0, m20347l(i, rect, rect2));
    }

    /* renamed from: l */
    public static int m20347l(int i, @mr2 Rect rect, @mr2 Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: m */
    public static int m20348m(int i, @mr2 Rect rect, @mr2 Rect rect2) {
        return Math.max(1, m20349n(i, rect, rect2));
    }

    /* renamed from: n */
    public static int m20349n(int i, @mr2 Rect rect, @mr2 Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: o */
    public static int m20350o(int i, @mr2 Rect rect, @mr2 Rect rect2) {
        int height;
        int i2;
        int height2;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = rect.left + (rect.width() / 2);
            i2 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - (i2 + (height2 / 2)));
        }
        height = rect.top + (rect.height() / 2);
        i2 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - (i2 + (height2 / 2)));
    }
}
