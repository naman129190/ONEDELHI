package com.onedelhi.secure;

public final class cx4 {

    /* renamed from: g */
    public static final int f27131g = 10;

    /* renamed from: h */
    public static final int f27132h = 1;

    /* renamed from: a */
    public final int f27133a;

    /* renamed from: a */
    public final C6190nl f27134a;

    /* renamed from: b */
    public final int f27135b;

    /* renamed from: c */
    public final int f27136c;

    /* renamed from: d */
    public final int f27137d;

    /* renamed from: e */
    public final int f27138e;

    /* renamed from: f */
    public final int f27139f;

    public cx4(C6190nl nlVar) throws tr2 {
        this(nlVar, 10, nlVar.mo41094l() / 2, nlVar.mo41089h() / 2);
    }

    public cx4(C6190nl nlVar, int i, int i2, int i3) throws tr2 {
        this.f27134a = nlVar;
        int h = nlVar.mo41089h();
        this.f27133a = h;
        int l = nlVar.mo41094l();
        this.f27135b = l;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.f27136c = i5;
        int i6 = i2 + i4;
        this.f27137d = i6;
        int i7 = i3 - i4;
        this.f27139f = i7;
        int i8 = i3 + i4;
        this.f27138e = i8;
        if (i7 < 0 || i5 < 0 || i8 >= h || i6 >= l) {
            throw tr2.m66179a();
        }
    }

    /* renamed from: a */
    public final sl3[] mo33993a(sl3 sl3, sl3 sl32, sl3 sl33, sl3 sl34) {
        float c = sl3.mo44403c();
        float d = sl3.mo44404d();
        float c2 = sl32.mo44403c();
        float d2 = sl32.mo44404d();
        float c3 = sl33.mo44403c();
        float d3 = sl33.mo44404d();
        float c4 = sl34.mo44403c();
        float d4 = sl34.mo44404d();
        if (c < ((float) this.f27135b) / 2.0f) {
            return new sl3[]{new sl3(c4 - 1.0f, d4 + 1.0f), new sl3(c2 + 1.0f, d2 + 1.0f), new sl3(c3 - 1.0f, d3 - 1.0f), new sl3(c + 1.0f, d - 1.0f)};
        }
        return new sl3[]{new sl3(c4 + 1.0f, d4 + 1.0f), new sl3(c2 + 1.0f, d2 - 1.0f), new sl3(c3 - 1.0f, d3 + 1.0f), new sl3(c - 1.0f, d - 1.0f)};
    }

    /* renamed from: b */
    public final boolean mo33994b(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f27134a.mo41085e(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f27134a.mo41085e(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: c */
    public sl3[] mo33995c() throws tr2 {
        int i = this.f27136c;
        int i2 = this.f27137d;
        int i3 = this.f27139f;
        int i4 = this.f27138e;
        boolean z = false;
        int i5 = 1;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (true) {
            if (!z2) {
                break;
            }
            boolean z7 = true;
            boolean z8 = false;
            while (true) {
                if ((z7 || !z3) && i2 < this.f27135b) {
                    z7 = mo33994b(i3, i4, i2, false);
                    if (z7) {
                        i2++;
                        z3 = true;
                        z8 = true;
                    } else if (!z3) {
                        i2++;
                    }
                }
            }
            if (i2 < this.f27135b) {
                boolean z9 = true;
                while (true) {
                    if ((z9 || !z4) && i4 < this.f27133a) {
                        z9 = mo33994b(i, i2, i4, true);
                        if (z9) {
                            i4++;
                            z4 = true;
                            z8 = true;
                        } else if (!z4) {
                            i4++;
                        }
                    }
                }
                if (i4 < this.f27133a) {
                    boolean z10 = true;
                    while (true) {
                        if ((z10 || !z5) && i >= 0) {
                            z10 = mo33994b(i3, i4, i, false);
                            if (z10) {
                                i--;
                                z5 = true;
                                z8 = true;
                            } else if (!z5) {
                                i--;
                            }
                        }
                    }
                    if (i >= 0) {
                        z2 = z8;
                        boolean z11 = true;
                        while (true) {
                            if ((z11 || !z6) && i3 >= 0) {
                                z11 = mo33994b(i, i2, i3, true);
                                if (z11) {
                                    i3--;
                                    z2 = true;
                                    z6 = true;
                                } else if (!z6) {
                                    i3--;
                                }
                            }
                        }
                        if (i3 < 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        z = true;
        if (!z) {
            int i6 = i2 - i;
            sl3 sl3 = null;
            sl3 sl32 = null;
            int i7 = 1;
            while (sl32 == null && i7 < i6) {
                sl32 = mo33996d((float) i, (float) (i4 - i7), (float) (i + i7), (float) i4);
                i7++;
            }
            if (sl32 != null) {
                sl3 sl33 = null;
                int i8 = 1;
                while (sl33 == null && i8 < i6) {
                    sl33 = mo33996d((float) i, (float) (i3 + i8), (float) (i + i8), (float) i3);
                    i8++;
                }
                if (sl33 != null) {
                    sl3 sl34 = null;
                    int i9 = 1;
                    while (sl34 == null && i9 < i6) {
                        sl34 = mo33996d((float) i2, (float) (i3 + i9), (float) (i2 - i9), (float) i3);
                        i9++;
                    }
                    if (sl34 != null) {
                        while (sl3 == null && i5 < i6) {
                            sl3 = mo33996d((float) i2, (float) (i4 - i5), (float) (i2 - i5), (float) i4);
                            i5++;
                        }
                        if (sl3 != null) {
                            return mo33993a(sl3, sl32, sl34, sl33);
                        }
                        throw tr2.m66179a();
                    }
                    throw tr2.m66179a();
                }
                throw tr2.m66179a();
            }
            throw tr2.m66179a();
        }
        throw tr2.m66179a();
    }

    /* renamed from: d */
    public final sl3 mo33996d(float f, float f2, float f3, float f4) {
        int c = qf2.m62733c(qf2.m62731a(f, f2, f3, f4));
        float f5 = (float) c;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < c; i++) {
            float f8 = (float) i;
            int c2 = qf2.m62733c((f8 * f6) + f);
            int c3 = qf2.m62733c((f8 * f7) + f2);
            if (this.f27134a.mo41085e(c2, c3)) {
                return new sl3((float) c2, (float) c3);
            }
        }
        return null;
    }
}
