package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0435e;
import androidx.core.widget.NestedScrollView;
import com.onedelhi.secure.hv2;
import com.onedelhi.secure.ly1;
import com.onedelhi.secure.ve0;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.motion.widget.c */
public class C0397c {

    /* renamed from: A */
    public static final int f2196A = 4;

    /* renamed from: B */
    public static final int f2197B = 0;

    /* renamed from: C */
    public static final int f2198C = 1;

    /* renamed from: a */
    public static final String f2199a = "TouchResponse";

    /* renamed from: a */
    public static final float[][] f2200a = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: b */
    public static final float[][] f2201b = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: d */
    public static final boolean f2202d = false;

    /* renamed from: k */
    public static final int f2203k = 1000;

    /* renamed from: l */
    public static final int f2204l = 0;

    /* renamed from: m */
    public static final int f2205m = 1;

    /* renamed from: n */
    public static final int f2206n = 2;

    /* renamed from: o */
    public static final int f2207o = 3;

    /* renamed from: p */
    public static final int f2208p = 4;

    /* renamed from: q */
    public static final float f2209q = 1.0E-7f;

    /* renamed from: q */
    public static final int f2210q = 5;

    /* renamed from: r */
    public static final int f2211r = 0;

    /* renamed from: s */
    public static final int f2212s = 1;

    /* renamed from: t */
    public static final int f2213t = 2;

    /* renamed from: u */
    public static final int f2214u = 3;

    /* renamed from: v */
    public static final int f2215v = 4;

    /* renamed from: w */
    public static final int f2216w = 5;

    /* renamed from: x */
    public static final int f2217x = 6;

    /* renamed from: y */
    public static final int f2218y = 1;

    /* renamed from: z */
    public static final int f2219z = 2;

    /* renamed from: a */
    public float f2220a = 0.5f;

    /* renamed from: a */
    public int f2221a = 0;

    /* renamed from: a */
    public final MotionLayout f2222a;

    /* renamed from: a */
    public boolean f2223a = false;

    /* renamed from: a */
    public float[] f2224a = new float[2];

    /* renamed from: a */
    public int[] f2225a = new int[2];

    /* renamed from: b */
    public float f2226b = 0.5f;

    /* renamed from: b */
    public int f2227b = 0;

    /* renamed from: b */
    public boolean f2228b = false;

    /* renamed from: c */
    public float f2229c = 0.5f;

    /* renamed from: c */
    public int f2230c = 0;

    /* renamed from: c */
    public boolean f2231c = true;

    /* renamed from: d */
    public float f2232d = 0.5f;

    /* renamed from: d */
    public int f2233d = -1;

    /* renamed from: e */
    public float f2234e = 0.0f;

    /* renamed from: e */
    public int f2235e = -1;

    /* renamed from: f */
    public float f2236f = 1.0f;

    /* renamed from: f */
    public int f2237f = -1;

    /* renamed from: g */
    public float f2238g;

    /* renamed from: g */
    public int f2239g = -1;

    /* renamed from: h */
    public float f2240h;

    /* renamed from: h */
    public int f2241h = 0;

    /* renamed from: i */
    public float f2242i = 4.0f;

    /* renamed from: i */
    public int f2243i = 0;

    /* renamed from: j */
    public float f2244j = 1.2f;

    /* renamed from: j */
    public int f2245j = 0;

    /* renamed from: k */
    public float f2246k = 1.0f;

    /* renamed from: l */
    public float f2247l = 10.0f;

    /* renamed from: m */
    public float f2248m = 10.0f;

    /* renamed from: n */
    public float f2249n = 1.0f;

    /* renamed from: o */
    public float f2250o = Float.NaN;

    /* renamed from: p */
    public float f2251p = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.c$a */
    public class C0398a implements View.OnTouchListener {
        public C0398a(C0397c cVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.c$b */
    public class C0399b implements NestedScrollView.C0489c {
        public C0399b(C0397c cVar) {
        }

        /* renamed from: a */
        public void mo821a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }

    public C0397c(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f2222a = motionLayout;
        mo2995c(context, Xml.asAttributeSet(xmlPullParser));
    }

    public C0397c(MotionLayout motionLayout, hv2 hv2) {
        this.f2222a = motionLayout;
        this.f2233d = hv2.mo17446q();
        int r = hv2.mo17447r();
        this.f2221a = r;
        if (r != -1) {
            float[][] fArr = f2200a;
            this.f2226b = fArr[r][0];
            this.f2220a = fArr[r][1];
        }
        int b = hv2.mo17431b();
        this.f2227b = b;
        float[][] fArr2 = f2201b;
        if (b < fArr2.length) {
            this.f2234e = fArr2[b][0];
            this.f2236f = fArr2[b][1];
        } else {
            this.f2236f = Float.NaN;
            this.f2234e = Float.NaN;
            this.f2223a = true;
        }
        this.f2242i = hv2.mo17436g();
        this.f2244j = hv2.mo17435f();
        this.f2231c = hv2.mo17437h();
        this.f2246k = hv2.mo17432c();
        this.f2247l = hv2.mo17433d();
        this.f2235e = hv2.mo17448s();
        this.f2230c = hv2.mo17439j();
        this.f2241h = hv2.mo17438i();
        this.f2237f = hv2.mo17434e();
        this.f2239g = hv2.mo17440k();
        this.f2243i = hv2.mo17441l();
        this.f2248m = hv2.mo17442m();
        this.f2249n = hv2.mo17443n();
        this.f2250o = hv2.mo17444o();
        this.f2251p = hv2.mo17445p();
        this.f2245j = hv2.mo17430a();
    }

    /* renamed from: A */
    public void mo2985A(float f, float f2) {
        this.f2238g = f;
        this.f2240h = f2;
    }

    /* renamed from: B */
    public void mo2986B(float f) {
        this.f2244j = f;
    }

    /* renamed from: C */
    public void mo2987C(float f) {
        this.f2242i = f;
    }

    /* renamed from: D */
    public void mo2988D(boolean z) {
        if (z) {
            float[][] fArr = f2201b;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f2200a;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f2201b;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f2200a;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[][] fArr5 = f2200a;
        int i = this.f2221a;
        this.f2226b = fArr5[i][0];
        this.f2220a = fArr5[i][1];
        int i2 = this.f2227b;
        float[][] fArr6 = f2201b;
        if (i2 < fArr6.length) {
            this.f2234e = fArr6[i2][0];
            this.f2236f = fArr6[i2][1];
        }
    }

    /* renamed from: E */
    public void mo2989E(float f, float f2) {
        this.f2226b = f;
        this.f2220a = f2;
    }

    /* renamed from: F */
    public void mo2990F(int i) {
        this.f2230c = i;
    }

    /* renamed from: G */
    public void mo2991G(float f, float f2) {
        this.f2238g = f;
        this.f2240h = f2;
        this.f2228b = false;
    }

    /* renamed from: H */
    public void mo2992H() {
        View view;
        int i = this.f2233d;
        if (i != -1) {
            view = this.f2222a.findViewById(i);
            if (view == null) {
                Log.e(f2199a, "cannot find TouchAnchorId @id/" + ve0.m30010i(this.f2222a.getContext(), this.f2233d));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new C0398a(this));
            nestedScrollView.setOnScrollChangeListener(new C0399b(this));
        }
    }

    /* renamed from: a */
    public float mo2993a(float f, float f2) {
        return (f * this.f2234e) + (f2 * this.f2236f);
    }

    /* renamed from: b */
    public final void mo2994b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == C0435e.C0448m.OnSwipe_touchAnchorId) {
                this.f2233d = typedArray.getResourceId(index, this.f2233d);
            } else if (index == C0435e.C0448m.OnSwipe_touchAnchorSide) {
                int i2 = typedArray.getInt(index, this.f2221a);
                this.f2221a = i2;
                float[][] fArr = f2200a;
                this.f2226b = fArr[i2][0];
                this.f2220a = fArr[i2][1];
            } else if (index == C0435e.C0448m.OnSwipe_dragDirection) {
                int i3 = typedArray.getInt(index, this.f2227b);
                this.f2227b = i3;
                float[][] fArr2 = f2201b;
                if (i3 < fArr2.length) {
                    this.f2234e = fArr2[i3][0];
                    this.f2236f = fArr2[i3][1];
                } else {
                    this.f2236f = Float.NaN;
                    this.f2234e = Float.NaN;
                    this.f2223a = true;
                }
            } else if (index == C0435e.C0448m.OnSwipe_maxVelocity) {
                this.f2242i = typedArray.getFloat(index, this.f2242i);
            } else if (index == C0435e.C0448m.OnSwipe_maxAcceleration) {
                this.f2244j = typedArray.getFloat(index, this.f2244j);
            } else if (index == C0435e.C0448m.OnSwipe_moveWhenScrollAtTop) {
                this.f2231c = typedArray.getBoolean(index, this.f2231c);
            } else if (index == C0435e.C0448m.OnSwipe_dragScale) {
                this.f2246k = typedArray.getFloat(index, this.f2246k);
            } else if (index == C0435e.C0448m.OnSwipe_dragThreshold) {
                this.f2247l = typedArray.getFloat(index, this.f2247l);
            } else if (index == C0435e.C0448m.OnSwipe_touchRegionId) {
                this.f2235e = typedArray.getResourceId(index, this.f2235e);
            } else if (index == C0435e.C0448m.OnSwipe_onTouchUp) {
                this.f2230c = typedArray.getInt(index, this.f2230c);
            } else if (index == C0435e.C0448m.OnSwipe_nestedScrollFlags) {
                this.f2241h = typedArray.getInteger(index, 0);
            } else if (index == C0435e.C0448m.OnSwipe_limitBoundsTo) {
                this.f2237f = typedArray.getResourceId(index, 0);
            } else if (index == C0435e.C0448m.OnSwipe_rotationCenterId) {
                this.f2239g = typedArray.getResourceId(index, this.f2239g);
            } else if (index == C0435e.C0448m.OnSwipe_springDamping) {
                this.f2248m = typedArray.getFloat(index, this.f2248m);
            } else if (index == C0435e.C0448m.OnSwipe_springMass) {
                this.f2249n = typedArray.getFloat(index, this.f2249n);
            } else if (index == C0435e.C0448m.OnSwipe_springStiffness) {
                this.f2250o = typedArray.getFloat(index, this.f2250o);
            } else if (index == C0435e.C0448m.OnSwipe_springStopThreshold) {
                this.f2251p = typedArray.getFloat(index, this.f2251p);
            } else if (index == C0435e.C0448m.OnSwipe_springBoundary) {
                this.f2243i = typedArray.getInt(index, this.f2243i);
            } else if (index == C0435e.C0448m.OnSwipe_autoCompleteMode) {
                this.f2245j = typedArray.getInt(index, this.f2245j);
            }
        }
    }

    /* renamed from: c */
    public final void mo2995c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0435e.C0448m.OnSwipe);
        mo2994b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public int mo2996d() {
        return this.f2233d;
    }

    /* renamed from: e */
    public int mo2997e() {
        return this.f2245j;
    }

    /* renamed from: f */
    public int mo2998f() {
        return this.f2241h;
    }

    /* renamed from: g */
    public RectF mo2999g(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f2237f;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* renamed from: h */
    public int mo3000h() {
        return this.f2237f;
    }

    /* renamed from: i */
    public float mo3001i() {
        return this.f2244j;
    }

    /* renamed from: j */
    public float mo3002j() {
        return this.f2242i;
    }

    /* renamed from: k */
    public boolean mo3003k() {
        return this.f2231c;
    }

    /* renamed from: l */
    public float mo3004l(float f, float f2) {
        this.f2222a.mo2831y0(this.f2233d, this.f2222a.getProgress(), this.f2226b, this.f2220a, this.f2224a);
        float f3 = this.f2234e;
        if (f3 != 0.0f) {
            float[] fArr = this.f2224a;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        float[] fArr2 = this.f2224a;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.f2236f) / fArr2[1];
    }

    /* renamed from: m */
    public int mo3005m() {
        return this.f2243i;
    }

    /* renamed from: n */
    public float mo3006n() {
        return this.f2248m;
    }

    /* renamed from: o */
    public float mo3007o() {
        return this.f2249n;
    }

    /* renamed from: p */
    public float mo3008p() {
        return this.f2250o;
    }

    /* renamed from: q */
    public float mo3009q() {
        return this.f2251p;
    }

    /* renamed from: r */
    public RectF mo3010r(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f2235e;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* renamed from: s */
    public int mo3011s() {
        return this.f2235e;
    }

    /* renamed from: t */
    public boolean mo3012t() {
        return this.f2228b;
    }

    public String toString() {
        if (Float.isNaN(this.f2234e)) {
            return ly1.f15667d;
        }
        return this.f2234e + " , " + this.f2236f;
    }

    /* renamed from: u */
    public void mo3014u(MotionEvent motionEvent, MotionLayout.C0387i iVar, int i, C0393b bVar) {
        int i2;
        MotionLayout.C0387i iVar2 = iVar;
        if (this.f2223a) {
            mo3015v(motionEvent, iVar, i, bVar);
            return;
        }
        iVar2.mo2875h(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f2238g = motionEvent.getRawX();
            this.f2240h = motionEvent.getRawY();
            this.f2228b = false;
        } else if (action == 1) {
            this.f2228b = false;
            iVar2.mo2874g(1000);
            float d = iVar.mo2871d();
            float f = iVar.mo2873f();
            float progress = this.f2222a.getProgress();
            int i3 = this.f2233d;
            if (i3 != -1) {
                this.f2222a.mo2831y0(i3, progress, this.f2226b, this.f2220a, this.f2224a);
            } else {
                float min = (float) Math.min(this.f2222a.getWidth(), this.f2222a.getHeight());
                float[] fArr = this.f2224a;
                fArr[1] = this.f2236f * min;
                fArr[0] = min * this.f2234e;
            }
            float f2 = this.f2234e;
            float[] fArr2 = this.f2224a;
            float f3 = fArr2[0];
            float f4 = fArr2[1];
            float f5 = f2 != 0.0f ? d / fArr2[0] : f / fArr2[1];
            float f6 = !Float.isNaN(f5) ? (f5 / 3.0f) + progress : progress;
            if (f6 != 0.0f && f6 != 1.0f && (i2 = this.f2230c) != 3) {
                float f7 = ((double) f6) < 0.5d ? 0.0f : 1.0f;
                if (i2 == 6) {
                    if (progress + f5 < 0.0f) {
                        f5 = Math.abs(f5);
                    }
                    f7 = 1.0f;
                }
                if (this.f2230c == 7) {
                    if (progress + f5 > 1.0f) {
                        f5 = -Math.abs(f5);
                    }
                    f7 = 0.0f;
                }
                this.f2222a.mo2754X0(this.f2230c, f7, f5);
                if (0.0f < progress && 1.0f > progress) {
                    return;
                }
            } else if (0.0f < f6 && 1.0f > f6) {
                return;
            }
            this.f2222a.setState(MotionLayout.C0391m.FINISHED);
        } else if (action == 2) {
            float rawY = motionEvent.getRawY() - this.f2240h;
            float rawX = motionEvent.getRawX() - this.f2238g;
            if (Math.abs((this.f2234e * rawX) + (this.f2236f * rawY)) > this.f2247l || this.f2228b) {
                float progress2 = this.f2222a.getProgress();
                if (!this.f2228b) {
                    this.f2228b = true;
                    this.f2222a.setProgress(progress2);
                }
                int i4 = this.f2233d;
                if (i4 != -1) {
                    this.f2222a.mo2831y0(i4, progress2, this.f2226b, this.f2220a, this.f2224a);
                } else {
                    float min2 = (float) Math.min(this.f2222a.getWidth(), this.f2222a.getHeight());
                    float[] fArr3 = this.f2224a;
                    fArr3[1] = this.f2236f * min2;
                    fArr3[0] = min2 * this.f2234e;
                }
                float f8 = this.f2234e;
                float[] fArr4 = this.f2224a;
                if (((double) Math.abs(((f8 * fArr4[0]) + (this.f2236f * fArr4[1])) * this.f2246k)) < 0.01d) {
                    float[] fArr5 = this.f2224a;
                    fArr5[0] = 0.01f;
                    fArr5[1] = 0.01f;
                }
                float max = Math.max(Math.min(progress2 + (this.f2234e != 0.0f ? rawX / this.f2224a[0] : rawY / this.f2224a[1]), 1.0f), 0.0f);
                if (this.f2230c == 6) {
                    max = Math.max(max, 0.01f);
                }
                if (this.f2230c == 7) {
                    max = Math.min(max, 0.99f);
                }
                float progress3 = this.f2222a.getProgress();
                if (max != progress3) {
                    int i5 = (progress3 > 0.0f ? 1 : (progress3 == 0.0f ? 0 : -1));
                    if (i5 == 0 || progress3 == 1.0f) {
                        this.f2222a.mo2803r0(i5 == 0);
                    }
                    this.f2222a.setProgress(max);
                    iVar2.mo2874g(1000);
                    this.f2222a.f1993a = this.f2234e != 0.0f ? iVar.mo2871d() / this.f2224a[0] : iVar.mo2873f() / this.f2224a[1];
                } else {
                    this.f2222a.f1993a = 0.0f;
                }
                this.f2238g = motionEvent.getRawX();
                this.f2240h = motionEvent.getRawY();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0316  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3015v(android.view.MotionEvent r24, androidx.constraintlayout.motion.widget.MotionLayout.C0387i r25, int r26, androidx.constraintlayout.motion.widget.C0393b r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r2 = r24
            r1.mo2875h(r2)
            int r3 = r24.getAction()
            r4 = 0
            if (r3 == 0) goto L_0x0329
            r5 = 1135869952(0x43b40000, float:360.0)
            r6 = -1
            r9 = 1073741824(0x40000000, float:2.0)
            r10 = 1
            if (r3 == r10) goto L_0x01c4
            r11 = 2
            if (r3 == r11) goto L_0x001d
            goto L_0x0337
        L_0x001d:
            r24.getRawY()
            r24.getRawX()
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f2222a
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r3 = r3 / r9
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f2222a
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 / r9
            int r12 = r0.f2239g
            if (r12 == r6) goto L_0x006c
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f2222a
            android.view.View r3 = r3.findViewById(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f2222a
            int[] r12 = r0.f2225a
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.f2225a
            r11 = r11[r4]
            float r11 = (float) r11
            int r12 = r3.getLeft()
            int r13 = r3.getRight()
            int r12 = r12 + r13
            float r12 = (float) r12
            float r12 = r12 / r9
            float r11 = r11 + r12
            int[] r12 = r0.f2225a
            r12 = r12[r10]
            float r12 = (float) r12
            int r13 = r3.getTop()
            int r3 = r3.getBottom()
            int r13 = r13 + r3
            float r3 = (float) r13
            float r3 = r3 / r9
            float r3 = r3 + r12
            r22 = r11
            r11 = r3
            r3 = r22
            goto L_0x00b3
        L_0x006c:
            int r12 = r0.f2233d
            if (r12 == r6) goto L_0x00b3
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r0.f2222a
            com.onedelhi.secure.cl2 r12 = r13.mo2733C0(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r0.f2222a
            int r12 = r12.mo14235k()
            android.view.View r12 = r13.findViewById(r12)
            if (r12 != 0) goto L_0x008a
            java.lang.String r9 = "TouchResponse"
            java.lang.String r12 = "could not find view to animate to"
            android.util.Log.e(r9, r12)
            goto L_0x00b3
        L_0x008a:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f2222a
            int[] r11 = r0.f2225a
            r3.getLocationOnScreen(r11)
            int[] r3 = r0.f2225a
            r3 = r3[r4]
            float r3 = (float) r3
            int r11 = r12.getLeft()
            int r13 = r12.getRight()
            int r11 = r11 + r13
            float r11 = (float) r11
            float r11 = r11 / r9
            float r3 = r3 + r11
            int[] r11 = r0.f2225a
            r11 = r11[r10]
            float r11 = (float) r11
            int r13 = r12.getTop()
            int r12 = r12.getBottom()
            int r13 = r13 + r12
            float r12 = (float) r13
            float r12 = r12 / r9
            float r11 = r11 + r12
        L_0x00b3:
            float r9 = r24.getRawX()
            float r9 = r9 - r3
            float r12 = r24.getRawY()
            float r12 = r12 - r11
            float r13 = r24.getRawY()
            float r13 = r13 - r11
            double r13 = (double) r13
            float r15 = r24.getRawX()
            float r15 = r15 - r3
            r27 = r9
            double r8 = (double) r15
            double r8 = java.lang.Math.atan2(r13, r8)
            float r13 = r0.f2240h
            float r13 = r13 - r11
            double r13 = (double) r13
            float r11 = r0.f2238g
            float r11 = r11 - r3
            double r6 = (double) r11
            double r6 = java.lang.Math.atan2(r13, r6)
            double r6 = r8 - r6
            r13 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r6 = r6 * r13
            r13 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r6 = r6 / r13
            float r6 = (float) r6
            r7 = 1134886912(0x43a50000, float:330.0)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x00f3
            float r6 = r6 - r5
            goto L_0x00fa
        L_0x00f3:
            r7 = -1012596736(0xffffffffc3a50000, float:-330.0)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x00fa
            float r6 = r6 + r5
        L_0x00fa:
            float r7 = java.lang.Math.abs(r6)
            double r13 = (double) r7
            r16 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r7 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r7 > 0) goto L_0x010c
            boolean r7 = r0.f2228b
            if (r7 == 0) goto L_0x0337
        L_0x010c:
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.f2222a
            float r7 = r7.getProgress()
            boolean r11 = r0.f2228b
            if (r11 != 0) goto L_0x011d
            r0.f2228b = r10
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f2222a
            r11.setProgress(r7)
        L_0x011d:
            int r11 = r0.f2233d
            r3 = -1
            if (r11 == r3) goto L_0x0146
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f2222a
            float r5 = r0.f2226b
            float r13 = r0.f2220a
            float[] r14 = r0.f2224a
            r16 = r3
            r17 = r11
            r18 = r7
            r19 = r5
            r20 = r13
            r21 = r14
            r16.mo2831y0(r17, r18, r19, r20, r21)
            float[] r3 = r0.f2224a
            r5 = r3[r10]
            double r13 = (double) r5
            double r13 = java.lang.Math.toDegrees(r13)
            float r5 = (float) r13
            r3[r10] = r5
            goto L_0x014a
        L_0x0146:
            float[] r3 = r0.f2224a
            r3[r10] = r5
        L_0x014a:
            float r3 = r0.f2246k
            float r6 = r6 * r3
            float[] r3 = r0.f2224a
            r3 = r3[r10]
            float r6 = r6 / r3
            float r7 = r7 + r6
            r3 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r7, r3)
            r6 = 0
            float r5 = java.lang.Math.max(r5, r6)
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.f2222a
            float r7 = r7.getProgress()
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x01b1
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0171
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0179
        L_0x0171:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f2222a
            if (r6 != 0) goto L_0x0176
            r4 = 1
        L_0x0176:
            r3.mo2803r0(r4)
        L_0x0179:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f2222a
            r3.setProgress(r5)
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.mo2874g(r3)
            float r3 = r25.mo2871d()
            float r1 = r25.mo2873f()
            double r4 = (double) r1
            double r6 = (double) r3
            double r10 = java.lang.Math.hypot(r4, r6)
            double r3 = java.lang.Math.atan2(r4, r6)
            double r3 = r3 - r8
            double r3 = java.lang.Math.sin(r3)
            double r10 = r10 * r3
            r9 = r27
            double r3 = (double) r9
            double r5 = (double) r12
            double r3 = java.lang.Math.hypot(r3, r5)
            double r10 = r10 / r3
            float r1 = (float) r10
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f2222a
            double r4 = (double) r1
            double r4 = java.lang.Math.toDegrees(r4)
            float r1 = (float) r4
            r3.f1993a = r1
            goto L_0x01b6
        L_0x01b1:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f2222a
            r3 = 0
            r1.f1993a = r3
        L_0x01b6:
            float r1 = r24.getRawX()
            r0.f2238g = r1
            float r1 = r24.getRawY()
            r0.f2240h = r1
            goto L_0x0337
        L_0x01c4:
            r0.f2228b = r4
            r6 = 16
            r1.mo2874g(r6)
            float r6 = r25.mo2871d()
            float r1 = r25.mo2873f()
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.f2222a
            float r7 = r7.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.f2222a
            int r8 = r8.getWidth()
            float r8 = (float) r8
            float r8 = r8 / r9
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f2222a
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 / r9
            int r12 = r0.f2239g
            r3 = -1
            if (r12 == r3) goto L_0x021f
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.f2222a
            android.view.View r8 = r8.findViewById(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f2222a
            int[] r12 = r0.f2225a
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.f2225a
            r4 = r11[r4]
            float r4 = (float) r4
            int r11 = r8.getLeft()
            int r12 = r8.getRight()
            int r11 = r11 + r12
            float r11 = (float) r11
            float r11 = r11 / r9
            float r4 = r4 + r11
            int[] r11 = r0.f2225a
            r11 = r11[r10]
        L_0x0210:
            float r11 = (float) r11
            int r12 = r8.getTop()
            int r8 = r8.getBottom()
            int r12 = r12 + r8
            float r8 = (float) r12
            float r8 = r8 / r9
            float r11 = r11 + r8
            r8 = r4
            goto L_0x0251
        L_0x021f:
            int r12 = r0.f2233d
            r3 = -1
            if (r12 == r3) goto L_0x0251
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.f2222a
            com.onedelhi.secure.cl2 r8 = r8.mo2733C0(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f2222a
            int r8 = r8.mo14235k()
            android.view.View r8 = r11.findViewById(r8)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.f2222a
            int[] r12 = r0.f2225a
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.f2225a
            r4 = r11[r4]
            float r4 = (float) r4
            int r11 = r8.getLeft()
            int r12 = r8.getRight()
            int r11 = r11 + r12
            float r11 = (float) r11
            float r11 = r11 / r9
            float r4 = r4 + r11
            int[] r11 = r0.f2225a
            r11 = r11[r10]
            goto L_0x0210
        L_0x0251:
            float r4 = r24.getRawX()
            float r4 = r4 - r8
            float r2 = r24.getRawY()
            float r2 = r2 - r11
            double r8 = (double) r2
            double r11 = (double) r4
            double r8 = java.lang.Math.atan2(r8, r11)
            double r8 = java.lang.Math.toDegrees(r8)
            int r11 = r0.f2233d
            r3 = -1
            if (r11 == r3) goto L_0x028e
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.f2222a
            float r5 = r0.f2226b
            float r12 = r0.f2220a
            float[] r13 = r0.f2224a
            r16 = r3
            r17 = r11
            r18 = r7
            r19 = r5
            r20 = r12
            r21 = r13
            r16.mo2831y0(r17, r18, r19, r20, r21)
            float[] r3 = r0.f2224a
            r5 = r3[r10]
            double r11 = (double) r5
            double r11 = java.lang.Math.toDegrees(r11)
            float r5 = (float) r11
            r3[r10] = r5
            goto L_0x0292
        L_0x028e:
            float[] r3 = r0.f2224a
            r3[r10] = r5
        L_0x0292:
            float r1 = r1 + r2
            double r1 = (double) r1
            float r6 = r6 + r4
            double r3 = (double) r6
            double r1 = java.lang.Math.atan2(r1, r3)
            double r1 = java.lang.Math.toDegrees(r1)
            double r1 = r1 - r8
            float r1 = (float) r1
            r2 = 1115291648(0x427a0000, float:62.5)
            float r1 = r1 * r2
            boolean r2 = java.lang.Float.isNaN(r1)
            r3 = 1077936128(0x40400000, float:3.0)
            if (r2 != 0) goto L_0x02b9
            float r2 = r1 * r3
            float r4 = r0.f2246k
            float r2 = r2 * r4
            float[] r4 = r0.f2224a
            r4 = r4[r10]
            float r2 = r2 / r4
            float r2 = r2 + r7
            goto L_0x02ba
        L_0x02b9:
            r2 = r7
        L_0x02ba:
            r4 = 0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x0316
            r4 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x0316
            int r4 = r0.f2230c
            r5 = 3
            if (r4 == r5) goto L_0x0316
            float r5 = r0.f2246k
            float r1 = r1 * r5
            float[] r5 = r0.f2224a
            r5 = r5[r10]
            float r1 = r1 / r5
            double r5 = (double) r2
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x02dc
            r2 = 0
            goto L_0x02de
        L_0x02dc:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x02de:
            r5 = 6
            if (r4 != r5) goto L_0x02ee
            float r2 = r7 + r1
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x02ec
            float r1 = java.lang.Math.abs(r1)
        L_0x02ec:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x02ee:
            int r4 = r0.f2230c
            r5 = 7
            if (r4 != r5) goto L_0x0301
            float r2 = r7 + r1
            r4 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0300
            float r1 = java.lang.Math.abs(r1)
            float r1 = -r1
        L_0x0300:
            r2 = 0
        L_0x0301:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.f2222a
            int r5 = r0.f2230c
            float r1 = r1 * r3
            r4.mo2754X0(r5, r2, r1)
            r1 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0321
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0337
            goto L_0x0321
        L_0x0316:
            r1 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0321
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0337
        L_0x0321:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f2222a
            androidx.constraintlayout.motion.widget.MotionLayout$m r2 = androidx.constraintlayout.motion.widget.MotionLayout.C0391m.FINISHED
            r1.setState(r2)
            goto L_0x0337
        L_0x0329:
            float r1 = r24.getRawX()
            r0.f2238g = r1
            float r1 = r24.getRawY()
            r0.f2240h = r1
            r0.f2228b = r4
        L_0x0337:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0397c.mo3015v(android.view.MotionEvent, androidx.constraintlayout.motion.widget.MotionLayout$i, int, androidx.constraintlayout.motion.widget.b):void");
    }

    /* renamed from: w */
    public void mo3016w(float f, float f2) {
        float progress = this.f2222a.getProgress();
        if (!this.f2228b) {
            this.f2228b = true;
            this.f2222a.setProgress(progress);
        }
        this.f2222a.mo2831y0(this.f2233d, progress, this.f2226b, this.f2220a, this.f2224a);
        float f3 = this.f2234e;
        float[] fArr = this.f2224a;
        if (((double) Math.abs((f3 * fArr[0]) + (this.f2236f * fArr[1]))) < 0.01d) {
            float[] fArr2 = this.f2224a;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f4 = this.f2234e;
        float max = Math.max(Math.min(progress + (f4 != 0.0f ? (f * f4) / this.f2224a[0] : (f2 * this.f2236f) / this.f2224a[1]), 1.0f), 0.0f);
        if (max != this.f2222a.getProgress()) {
            this.f2222a.setProgress(max);
        }
    }

    /* renamed from: x */
    public void mo3017x(float f, float f2) {
        boolean z = false;
        this.f2228b = false;
        float progress = this.f2222a.getProgress();
        this.f2222a.mo2831y0(this.f2233d, progress, this.f2226b, this.f2220a, this.f2224a);
        float f3 = this.f2234e;
        float[] fArr = this.f2224a;
        float f4 = fArr[0];
        float f5 = this.f2236f;
        float f6 = fArr[1];
        float f7 = 0.0f;
        float f8 = f3 != 0.0f ? (f * f3) / fArr[0] : (f2 * f5) / fArr[1];
        if (!Float.isNaN(f8)) {
            progress += f8 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z2 = progress != 1.0f;
            int i = this.f2230c;
            if (i != 3) {
                z = true;
            }
            if (z && z2) {
                MotionLayout motionLayout = this.f2222a;
                if (((double) progress) >= 0.5d) {
                    f7 = 1.0f;
                }
                motionLayout.mo2754X0(i, f7, f8);
            }
        }
    }

    /* renamed from: y */
    public void mo3018y(int i) {
        this.f2233d = i;
    }

    /* renamed from: z */
    public void mo3019z(int i) {
        this.f2245j = i;
    }
}
