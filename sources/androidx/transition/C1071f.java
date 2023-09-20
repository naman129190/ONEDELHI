package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C1060e;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.s12;
import com.onedelhi.secure.ts2;

/* renamed from: androidx.transition.f */
public class C1071f {

    /* renamed from: a */
    public int f5671a;

    /* renamed from: a */
    public Context f5672a;

    /* renamed from: a */
    public View f5673a;

    /* renamed from: a */
    public ViewGroup f5674a;

    /* renamed from: a */
    public Runnable f5675a;

    /* renamed from: b */
    public Runnable f5676b;

    public C1071f(@mr2 ViewGroup viewGroup) {
        this.f5671a = -1;
        this.f5674a = viewGroup;
    }

    public C1071f(ViewGroup viewGroup, int i, Context context) {
        this.f5672a = context;
        this.f5674a = viewGroup;
        this.f5671a = i;
    }

    public C1071f(@mr2 ViewGroup viewGroup, @mr2 View view) {
        this.f5671a = -1;
        this.f5674a = viewGroup;
        this.f5673a = view;
    }

    @ts2
    /* renamed from: c */
    public static C1071f m7162c(@mr2 ViewGroup viewGroup) {
        return (C1071f) viewGroup.getTag(C1060e.C1065e.transition_current_scene);
    }

    @mr2
    /* renamed from: d */
    public static C1071f m7163d(@mr2 ViewGroup viewGroup, @s12 int i, @mr2 Context context) {
        int i2 = C1060e.C1065e.transition_scene_layoutid_cache;
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(i2);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(i2, sparseArray);
        }
        C1071f fVar = (C1071f) sparseArray.get(i);
        if (fVar != null) {
            return fVar;
        }
        C1071f fVar2 = new C1071f(viewGroup, i, context);
        sparseArray.put(i, fVar2);
        return fVar2;
    }

    /* renamed from: g */
    public static void m7164g(@mr2 ViewGroup viewGroup, @ts2 C1071f fVar) {
        viewGroup.setTag(C1060e.C1065e.transition_current_scene, fVar);
    }

    /* renamed from: a */
    public void mo7031a() {
        if (this.f5671a > 0 || this.f5673a != null) {
            mo7033e().removeAllViews();
            if (this.f5671a > 0) {
                LayoutInflater.from(this.f5672a).inflate(this.f5671a, this.f5674a);
            } else {
                this.f5674a.addView(this.f5673a);
            }
        }
        Runnable runnable = this.f5675a;
        if (runnable != null) {
            runnable.run();
        }
        m7164g(this.f5674a, this);
    }

    /* renamed from: b */
    public void mo7032b() {
        Runnable runnable;
        if (m7162c(this.f5674a) == this && (runnable = this.f5676b) != null) {
            runnable.run();
        }
    }

    @mr2
    /* renamed from: e */
    public ViewGroup mo7033e() {
        return this.f5674a;
    }

    /* renamed from: f */
    public boolean mo7034f() {
        return this.f5671a > 0;
    }

    /* renamed from: h */
    public void mo7035h(@ts2 Runnable runnable) {
        this.f5675a = runnable;
    }

    /* renamed from: i */
    public void mo7036i(@ts2 Runnable runnable) {
        this.f5676b = runnable;
    }
}
