package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.C0402f;
import androidx.constraintlayout.widget.C0426d;
import androidx.constraintlayout.widget.C0449f;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.onedelhi.secure.cl2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.motion.widget.g */
public class C0405g {

    /* renamed from: a */
    public final MotionLayout f2316a;

    /* renamed from: a */
    public String f2317a = "ViewTransitionController";

    /* renamed from: a */
    public ArrayList<C0402f> f2318a = new ArrayList<>();

    /* renamed from: a */
    public HashSet<View> f2319a;

    /* renamed from: b */
    public ArrayList<C0402f.C0404b> f2320b;

    /* renamed from: c */
    public ArrayList<C0402f.C0404b> f2321c = new ArrayList<>();

    /* renamed from: androidx.constraintlayout.motion.widget.g$a */
    public class C0406a implements C0449f.C0450a {

        /* renamed from: a */
        public final /* synthetic */ C0402f f2322a;

        /* renamed from: b */
        public final /* synthetic */ boolean f2324b;

        /* renamed from: n */
        public final /* synthetic */ int f2325n;

        /* renamed from: o */
        public final /* synthetic */ int f2326o;

        public C0406a(C0402f fVar, int i, boolean z, int i2) {
            this.f2322a = fVar;
            this.f2325n = i;
            this.f2324b = z;
            this.f2326o = i2;
        }

        /* renamed from: a */
        public void mo3061a(int i, int i2, int i3) {
            int h = this.f2322a.mo3027h();
            this.f2322a.mo3036r(i2);
            if (this.f2325n == i && h != i2) {
                if (this.f2324b) {
                    if (this.f2326o == i2) {
                        int childCount = C0405g.this.f2316a.getChildCount();
                        for (int i4 = 0; i4 < childCount; i4++) {
                            View childAt = C0405g.this.f2316a.getChildAt(i4);
                            if (this.f2322a.mo3031m(childAt)) {
                                int currentState = C0405g.this.f2316a.getCurrentState();
                                C0426d z0 = C0405g.this.f2316a.mo2833z0(currentState);
                                C0402f fVar = this.f2322a;
                                C0405g gVar = C0405g.this;
                                fVar.mo3022c(gVar, gVar.f2316a, currentState, z0, childAt);
                            }
                        }
                    }
                } else if (this.f2326o != i2) {
                    int childCount2 = C0405g.this.f2316a.getChildCount();
                    for (int i5 = 0; i5 < childCount2; i5++) {
                        View childAt2 = C0405g.this.f2316a.getChildAt(i5);
                        if (this.f2322a.mo3031m(childAt2)) {
                            int currentState2 = C0405g.this.f2316a.getCurrentState();
                            C0426d z02 = C0405g.this.f2316a.mo2833z0(currentState2);
                            C0402f fVar2 = this.f2322a;
                            C0405g gVar2 = C0405g.this;
                            fVar2.mo3022c(gVar2, gVar2.f2316a, currentState2, z02, childAt2);
                        }
                    }
                }
            }
        }
    }

    public C0405g(MotionLayout motionLayout) {
        this.f2316a = motionLayout;
    }

    /* renamed from: b */
    public void mo3048b(C0402f fVar) {
        boolean z;
        this.f2318a.add(fVar);
        this.f2319a = null;
        if (fVar.mo3029j() == 4) {
            z = true;
        } else if (fVar.mo3029j() == 5) {
            z = false;
        } else {
            return;
        }
        mo3055i(fVar, z);
    }

    /* renamed from: c */
    public void mo3049c(C0402f.C0404b bVar) {
        if (this.f2320b == null) {
            this.f2320b = new ArrayList<>();
        }
        this.f2320b.add(bVar);
    }

    /* renamed from: d */
    public void mo3050d() {
        ArrayList<C0402f.C0404b> arrayList = this.f2320b;
        if (arrayList != null) {
            Iterator<C0402f.C0404b> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo3043a();
            }
            this.f2320b.removeAll(this.f2321c);
            this.f2321c.clear();
            if (this.f2320b.isEmpty()) {
                this.f2320b = null;
            }
        }
    }

    /* renamed from: e */
    public boolean mo3051e(int i, cl2 cl2) {
        Iterator<C0402f> it = this.f2318a.iterator();
        while (it.hasNext()) {
            C0402f next = it.next();
            if (next.mo3024e() == i) {
                next.f2281a.mo24662a(cl2);
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo3052f(int i, boolean z) {
        Iterator<C0402f> it = this.f2318a.iterator();
        while (it.hasNext()) {
            C0402f next = it.next();
            if (next.mo3024e() == i) {
                next.mo3033o(z);
                return;
            }
        }
    }

    /* renamed from: g */
    public void mo3053g() {
        this.f2316a.invalidate();
    }

    /* renamed from: h */
    public boolean mo3054h(int i) {
        Iterator<C0402f> it = this.f2318a.iterator();
        while (it.hasNext()) {
            C0402f next = it.next();
            if (next.mo3024e() == i) {
                return next.mo3030k();
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void mo3055i(C0402f fVar, boolean z) {
        ConstraintLayout.getSharedValues().mo3555a(fVar.mo3028i(), new C0406a(fVar, fVar.mo3028i(), z, fVar.mo3026g()));
    }

    /* renamed from: j */
    public void mo3056j(int i) {
        C0402f fVar;
        Iterator<C0402f> it = this.f2318a.iterator();
        while (true) {
            if (!it.hasNext()) {
                fVar = null;
                break;
            }
            fVar = it.next();
            if (fVar.mo3024e() == i) {
                break;
            }
        }
        if (fVar != null) {
            this.f2319a = null;
            this.f2318a.remove(fVar);
        }
    }

    /* renamed from: k */
    public void mo3057k(C0402f.C0404b bVar) {
        this.f2321c.add(bVar);
    }

    /* renamed from: l */
    public void mo3058l(MotionEvent motionEvent) {
        C0402f fVar;
        int currentState = this.f2316a.getCurrentState();
        if (currentState != -1) {
            if (this.f2319a == null) {
                this.f2319a = new HashSet<>();
                Iterator<C0402f> it = this.f2318a.iterator();
                while (it.hasNext()) {
                    C0402f next = it.next();
                    int childCount = this.f2316a.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = this.f2316a.getChildAt(i);
                        if (next.mo3031m(childAt)) {
                            childAt.getId();
                            this.f2319a.add(childAt);
                        }
                    }
                }
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Rect rect = new Rect();
            int action = motionEvent.getAction();
            ArrayList<C0402f.C0404b> arrayList = this.f2320b;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<C0402f.C0404b> it2 = this.f2320b.iterator();
                while (it2.hasNext()) {
                    it2.next().mo3046d(action, x, y);
                }
            }
            if (action == 0 || action == 1) {
                C0426d z0 = this.f2316a.mo2833z0(currentState);
                Iterator<C0402f> it3 = this.f2318a.iterator();
                while (it3.hasNext()) {
                    C0402f next2 = it3.next();
                    if (next2.mo3040u(action)) {
                        Iterator<View> it4 = this.f2319a.iterator();
                        while (it4.hasNext()) {
                            View next3 = it4.next();
                            if (next2.mo3031m(next3)) {
                                next3.getHitRect(rect);
                                if (rect.contains((int) x, (int) y)) {
                                    fVar = next2;
                                    next2.mo3022c(this, this.f2316a, currentState, z0, next3);
                                } else {
                                    fVar = next2;
                                }
                                next2 = fVar;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public void mo3059m(int i, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<C0402f> it = this.f2318a.iterator();
        C0402f fVar = null;
        while (it.hasNext()) {
            C0402f next = it.next();
            if (next.mo3024e() == i) {
                for (View view : viewArr) {
                    if (next.mo3023d(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    mo3060n(next, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                fVar = next;
            }
        }
        if (fVar == null) {
            Log.e(this.f2317a, " Could not find ViewTransition");
        }
    }

    /* renamed from: n */
    public final void mo3060n(C0402f fVar, View... viewArr) {
        int currentState = this.f2316a.getCurrentState();
        if (fVar.f2287d == 2) {
            fVar.mo3022c(this, this.f2316a, currentState, (C0426d) null, viewArr);
        } else if (currentState == -1) {
            String str = this.f2317a;
            Log.w(str, "No support for ViewTransition within transition yet. Currently: " + this.f2316a.toString());
        } else {
            C0426d z0 = this.f2316a.mo2833z0(currentState);
            if (z0 != null) {
                fVar.mo3022c(this, this.f2316a, currentState, z0, viewArr);
            }
        }
    }
}
