package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.transition.C1060e;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.wt4;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* renamed from: androidx.transition.c */
public class C1057c extends FrameLayout {
    @mr2

    /* renamed from: a */
    public ViewGroup f5662a;

    /* renamed from: b */
    public boolean f5663b = true;

    public C1057c(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f5662a = viewGroup;
        viewGroup.setTag(C1060e.C1065e.ghost_view_holder, this);
        wt4.m31099b(this.f5662a).mo24083a(this);
    }

    /* renamed from: b */
    public static C1057c m7147b(@mr2 ViewGroup viewGroup) {
        return (C1057c) viewGroup.getTag(C1060e.C1065e.ghost_view_holder);
    }

    /* renamed from: d */
    public static void m7148d(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m7148d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    /* renamed from: e */
    public static boolean m7149e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() != view2.getZ()) {
            return view.getZ() > view2.getZ();
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(wt4.m31098a(viewGroup, i));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m7150f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < min; i++) {
            View view = arrayList.get(i);
            View view2 = arrayList2.get(i);
            if (view != view2) {
                return m7149e(view, view2);
            }
        }
        return arrayList2.size() == min;
    }

    /* renamed from: a */
    public void mo7018a(C1058d dVar) {
        ArrayList arrayList = new ArrayList();
        m7148d(dVar.f5668b, arrayList);
        int c = mo7019c(arrayList);
        if (c < 0 || c >= getChildCount()) {
            addView(dVar);
        } else {
            addView(dVar, c);
        }
    }

    /* renamed from: c */
    public final int mo7019c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            m7148d(((C1058d) getChildAt(i2)).f5668b, arrayList2);
            if (m7150f(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    /* renamed from: g */
    public void mo7020g() {
        if (this.f5663b) {
            wt4.m31099b(this.f5662a).mo24084d(this);
            wt4.m31099b(this.f5662a).mo24083a(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public void onViewAdded(View view) {
        if (this.f5663b) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f5662a.setTag(C1060e.C1065e.ghost_view_holder, (Object) null);
            wt4.m31099b(this.f5662a).mo24084d(this);
            this.f5663b = false;
        }
    }
}
