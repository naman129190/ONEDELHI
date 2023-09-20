package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mo1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ph4;
import com.onedelhi.secure.th4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.uh4;
import com.onedelhi.secure.xj4;
import com.onedelhi.secure.yg1;
import java.util.ArrayList;
import java.util.Iterator;

public class TransitionSet extends Transition {

    /* renamed from: A */
    public static final int f5611A = 0;

    /* renamed from: B */
    public static final int f5612B = 1;

    /* renamed from: w */
    public static final int f5613w = 1;

    /* renamed from: x */
    public static final int f5614x = 2;

    /* renamed from: y */
    public static final int f5615y = 4;

    /* renamed from: z */
    public static final int f5616z = 8;

    /* renamed from: f */
    public boolean f5617f = true;

    /* renamed from: g */
    public boolean f5618g = false;

    /* renamed from: q */
    public ArrayList<Transition> f5619q = new ArrayList<>();

    /* renamed from: u */
    public int f5620u;

    /* renamed from: v */
    public int f5621v = 0;

    /* renamed from: androidx.transition.TransitionSet$a */
    public class C1044a extends C1085i {

        /* renamed from: a */
        public final /* synthetic */ Transition f5622a;

        public C1044a(Transition transition) {
            this.f5622a = transition;
        }

        /* renamed from: e */
        public void mo6833e(@mr2 Transition transition) {
            this.f5622a.mo6938o0();
            transition.mo6926h0(this);
        }
    }

    /* renamed from: androidx.transition.TransitionSet$b */
    public static class C1045b extends C1085i {

        /* renamed from: a */
        public TransitionSet f5624a;

        public C1045b(TransitionSet transitionSet) {
            this.f5624a = transitionSet;
        }

        /* renamed from: a */
        public void mo6964a(@mr2 Transition transition) {
            TransitionSet transitionSet = this.f5624a;
            if (!transitionSet.f5618g) {
                transitionSet.mo6957y0();
                this.f5624a.f5618g = true;
            }
        }

        /* renamed from: e */
        public void mo6833e(@mr2 Transition transition) {
            TransitionSet transitionSet = this.f5624a;
            int i = transitionSet.f5620u - 1;
            transitionSet.f5620u = i;
            if (i == 0) {
                transitionSet.f5618g = false;
                transitionSet.mo6944s();
            }
            transition.mo6926h0(this);
        }
    }

    public TransitionSet() {
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1072g.f5685i);
        mo6983S0(xj4.m31494k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    @mr2
    /* renamed from: A */
    public Transition mo6890A(@mr2 Class<?> cls, boolean z) {
        for (int i = 0; i < this.f5619q.size(); i++) {
            this.f5619q.get(i).mo6890A(cls, z);
        }
        return super.mo6890A(cls, z);
    }

    @mr2
    /* renamed from: A0 */
    public TransitionSet mo6912a(@mr2 Transition.C1043h hVar) {
        return (TransitionSet) super.mo6912a(hVar);
    }

    @mr2
    /* renamed from: B */
    public Transition mo6891B(@mr2 String str, boolean z) {
        for (int i = 0; i < this.f5619q.size(); i++) {
            this.f5619q.get(i).mo6891B(str, z);
        }
        return super.mo6891B(str, z);
    }

    @mr2
    /* renamed from: B0 */
    public TransitionSet mo6914b(@mo1 int i) {
        for (int i2 = 0; i2 < this.f5619q.size(); i2++) {
            this.f5619q.get(i2).mo6914b(i);
        }
        return (TransitionSet) super.mo6914b(i);
    }

    @mr2
    /* renamed from: C0 */
    public TransitionSet mo6916c(@mr2 View view) {
        for (int i = 0; i < this.f5619q.size(); i++) {
            this.f5619q.get(i).mo6916c(view);
        }
        return (TransitionSet) super.mo6916c(view);
    }

    @mr2
    /* renamed from: D0 */
    public TransitionSet mo6920d(@mr2 Class<?> cls) {
        for (int i = 0; i < this.f5619q.size(); i++) {
            this.f5619q.get(i).mo6920d(cls);
        }
        return (TransitionSet) super.mo6920d(cls);
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: E */
    public void mo6894E(ViewGroup viewGroup) {
        super.mo6894E(viewGroup);
        int size = this.f5619q.size();
        for (int i = 0; i < size; i++) {
            this.f5619q.get(i).mo6894E(viewGroup);
        }
    }

    @mr2
    /* renamed from: E0 */
    public TransitionSet mo6922e(@mr2 String str) {
        for (int i = 0; i < this.f5619q.size(); i++) {
            this.f5619q.get(i).mo6922e(str);
        }
        return (TransitionSet) super.mo6922e(str);
    }

    @mr2
    /* renamed from: F0 */
    public TransitionSet mo6970F0(@mr2 Transition transition) {
        mo6971G0(transition);
        long j = this.f5585c;
        if (j >= 0) {
            transition.mo6941q0(j);
        }
        if ((this.f5621v & 1) != 0) {
            transition.mo6945s0(mo6898I());
        }
        if ((this.f5621v & 2) != 0) {
            transition.mo6952v0(mo6902M());
        }
        if ((this.f5621v & 4) != 0) {
            transition.mo6950u0(mo6901L());
        }
        if ((this.f5621v & 8) != 0) {
            transition.mo6943r0(mo6897H());
        }
        return this;
    }

    /* renamed from: G0 */
    public final void mo6971G0(@mr2 Transition transition) {
        this.f5619q.add(transition);
        transition.f5574a = this;
    }

    /* renamed from: H0 */
    public int mo6972H0() {
        return this.f5617f ^ true ? 1 : 0;
    }

    @ts2
    /* renamed from: I0 */
    public Transition mo6973I0(int i) {
        if (i < 0 || i >= this.f5619q.size()) {
            return null;
        }
        return this.f5619q.get(i);
    }

    /* renamed from: J0 */
    public int mo6974J0() {
        return this.f5619q.size();
    }

    @mr2
    /* renamed from: K0 */
    public TransitionSet mo6926h0(@mr2 Transition.C1043h hVar) {
        return (TransitionSet) super.mo6926h0(hVar);
    }

    @mr2
    /* renamed from: L0 */
    public TransitionSet mo6928i0(@mo1 int i) {
        for (int i2 = 0; i2 < this.f5619q.size(); i2++) {
            this.f5619q.get(i2).mo6928i0(i);
        }
        return (TransitionSet) super.mo6928i0(i);
    }

    @mr2
    /* renamed from: M0 */
    public TransitionSet mo6929j0(@mr2 View view) {
        for (int i = 0; i < this.f5619q.size(); i++) {
            this.f5619q.get(i).mo6929j0(view);
        }
        return (TransitionSet) super.mo6929j0(view);
    }

    @mr2
    /* renamed from: N0 */
    public TransitionSet mo6931k0(@mr2 Class<?> cls) {
        for (int i = 0; i < this.f5619q.size(); i++) {
            this.f5619q.get(i).mo6931k0(cls);
        }
        return (TransitionSet) super.mo6931k0(cls);
    }

    @mr2
    /* renamed from: O0 */
    public TransitionSet mo6933l0(@mr2 String str) {
        for (int i = 0; i < this.f5619q.size(); i++) {
            this.f5619q.get(i).mo6933l0(str);
        }
        return (TransitionSet) super.mo6933l0(str);
    }

    @mr2
    /* renamed from: P0 */
    public TransitionSet mo6980P0(@mr2 Transition transition) {
        this.f5619q.remove(transition);
        transition.f5574a = null;
        return this;
    }

    @mr2
    /* renamed from: Q0 */
    public TransitionSet mo6941q0(long j) {
        ArrayList<Transition> arrayList;
        super.mo6941q0(j);
        if (this.f5585c >= 0 && (arrayList = this.f5619q) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5619q.get(i).mo6941q0(j);
            }
        }
        return this;
    }

    @mr2
    /* renamed from: R0 */
    public TransitionSet mo6945s0(@ts2 TimeInterpolator timeInterpolator) {
        this.f5621v |= 1;
        ArrayList<Transition> arrayList = this.f5619q;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5619q.get(i).mo6945s0(timeInterpolator);
            }
        }
        return (TransitionSet) super.mo6945s0(timeInterpolator);
    }

    @mr2
    /* renamed from: S0 */
    public TransitionSet mo6983S0(int i) {
        if (i == 0) {
            this.f5617f = true;
        } else if (i == 1) {
            this.f5617f = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* renamed from: T0 */
    public TransitionSet mo6954w0(ViewGroup viewGroup) {
        super.mo6954w0(viewGroup);
        int size = this.f5619q.size();
        for (int i = 0; i < size; i++) {
            this.f5619q.get(i).mo6954w0(viewGroup);
        }
        return this;
    }

    @mr2
    /* renamed from: U0 */
    public TransitionSet mo6955x0(long j) {
        return (TransitionSet) super.mo6955x0(j);
    }

    /* renamed from: V0 */
    public final void mo6986V0() {
        C1045b bVar = new C1045b(this);
        Iterator<Transition> it = this.f5619q.iterator();
        while (it.hasNext()) {
            it.next().mo6912a(bVar);
        }
        this.f5620u = this.f5619q.size();
    }

    @hl3({hl3.C2354a.f13188c})
    public void cancel() {
        super.cancel();
        int size = this.f5619q.size();
        for (int i = 0; i < size; i++) {
            this.f5619q.get(i).cancel();
        }
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: f0 */
    public void mo6924f0(View view) {
        super.mo6924f0(view);
        int size = this.f5619q.size();
        for (int i = 0; i < size; i++) {
            this.f5619q.get(i).mo6924f0(view);
        }
    }

    /* renamed from: j */
    public void mo6800j(@mr2 th4 th4) {
        if (mo6910X(th4.f20844a)) {
            Iterator<Transition> it = this.f5619q.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.mo6910X(th4.f20844a)) {
                    next.mo6800j(th4);
                    th4.f20845a.add(next);
                }
            }
        }
    }

    /* renamed from: l */
    public void mo6932l(th4 th4) {
        super.mo6932l(th4);
        int size = this.f5619q.size();
        for (int i = 0; i < size; i++) {
            this.f5619q.get(i).mo6932l(th4);
        }
    }

    /* renamed from: m */
    public void mo6801m(@mr2 th4 th4) {
        if (mo6910X(th4.f20844a)) {
            Iterator<Transition> it = this.f5619q.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.mo6910X(th4.f20844a)) {
                    next.mo6801m(th4);
                    th4.f20845a.add(next);
                }
            }
        }
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: m0 */
    public void mo6934m0(View view) {
        super.mo6934m0(view);
        int size = this.f5619q.size();
        for (int i = 0; i < size; i++) {
            this.f5619q.get(i).mo6934m0(view);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: o0 */
    public void mo6938o0() {
        if (this.f5619q.isEmpty()) {
            mo6957y0();
            mo6944s();
            return;
        }
        mo6986V0();
        if (!this.f5617f) {
            for (int i = 1; i < this.f5619q.size(); i++) {
                this.f5619q.get(i - 1).mo6912a(new C1044a(this.f5619q.get(i)));
            }
            Transition transition = this.f5619q.get(0);
            if (transition != null) {
                transition.mo6938o0();
                return;
            }
            return;
        }
        Iterator<Transition> it = this.f5619q.iterator();
        while (it.hasNext()) {
            it.next().mo6938o0();
        }
    }

    /* renamed from: p */
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.f5619q = new ArrayList<>();
        int size = this.f5619q.size();
        for (int i = 0; i < size; i++) {
            transitionSet.mo6971G0(this.f5619q.get(i).clone());
        }
        return transitionSet;
    }

    /* renamed from: p0 */
    public void mo6940p0(boolean z) {
        super.mo6940p0(z);
        int size = this.f5619q.size();
        for (int i = 0; i < size; i++) {
            this.f5619q.get(i).mo6940p0(z);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    /* renamed from: r */
    public void mo6942r(ViewGroup viewGroup, uh4 uh4, uh4 uh42, ArrayList<th4> arrayList, ArrayList<th4> arrayList2) {
        long O = mo6903O();
        int size = this.f5619q.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.f5619q.get(i);
            if (O > 0 && (this.f5617f || i == 0)) {
                long O2 = transition.mo6903O();
                if (O2 > 0) {
                    transition.mo6955x0(O2 + O);
                } else {
                    transition.mo6955x0(O);
                }
            }
            transition.mo6942r(viewGroup, uh4, uh42, arrayList, arrayList2);
        }
    }

    /* renamed from: r0 */
    public void mo6943r0(Transition.C1041f fVar) {
        super.mo6943r0(fVar);
        this.f5621v |= 8;
        int size = this.f5619q.size();
        for (int i = 0; i < size; i++) {
            this.f5619q.get(i).mo6943r0(fVar);
        }
    }

    /* renamed from: u0 */
    public void mo6950u0(PathMotion pathMotion) {
        super.mo6950u0(pathMotion);
        this.f5621v |= 4;
        if (this.f5619q != null) {
            for (int i = 0; i < this.f5619q.size(); i++) {
                this.f5619q.get(i).mo6950u0(pathMotion);
            }
        }
    }

    /* renamed from: v0 */
    public void mo6952v0(ph4 ph4) {
        super.mo6952v0(ph4);
        this.f5621v |= 2;
        int size = this.f5619q.size();
        for (int i = 0; i < size; i++) {
            this.f5619q.get(i).mo6952v0(ph4);
        }
    }

    @mr2
    /* renamed from: y */
    public Transition mo6956y(int i, boolean z) {
        for (int i2 = 0; i2 < this.f5619q.size(); i2++) {
            this.f5619q.get(i2).mo6956y(i, z);
        }
        return super.mo6956y(i, z);
    }

    @mr2
    /* renamed from: z */
    public Transition mo6958z(@mr2 View view, boolean z) {
        for (int i = 0; i < this.f5619q.size(); i++) {
            this.f5619q.get(i).mo6958z(view, z);
        }
        return super.mo6958z(view, z);
    }

    /* renamed from: z0 */
    public String mo6959z0(String str) {
        String z0 = super.mo6959z0(str);
        for (int i = 0; i < this.f5619q.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(z0);
            sb.append("\n");
            sb.append(this.f5619q.get(i).mo6959z0(str + yg1.C3999a.f23084c));
            z0 = sb.toString();
        }
        return z0;
    }
}
