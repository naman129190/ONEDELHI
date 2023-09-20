package com.onedelhi.secure;

import android.animation.LayoutTransition;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.onedelhi.secure.hl3;

@C2065el({@C1983dl(attribute = "android:alwaysDrawnWithCache", method = "setAlwaysDrawnWithCacheEnabled", type = ViewGroup.class), @C1983dl(attribute = "android:animationCache", method = "setAnimationCacheEnabled", type = ViewGroup.class), @C1983dl(attribute = "android:splitMotionEvents", method = "setMotionEventSplittingEnabled", type = ViewGroup.class)})
@hl3({hl3.C2354a.LIBRARY})
public class nt4 {

    /* renamed from: com.onedelhi.secure.nt4$a */
    public static class C3003a implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C3008f f17565a;

        /* renamed from: a */
        public final /* synthetic */ C3009g f17566a;

        public C3003a(C3008f fVar, C3009g gVar) {
            this.f17565a = fVar;
            this.f17566a = gVar;
        }

        public void onChildViewAdded(View view, View view2) {
            C3008f fVar = this.f17565a;
            if (fVar != null) {
                fVar.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            C3009g gVar = this.f17566a;
            if (gVar != null) {
                gVar.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.nt4$b */
    public static class C3004b implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ C3005c f17567a;

        /* renamed from: a */
        public final /* synthetic */ C3006d f17568a;

        /* renamed from: a */
        public final /* synthetic */ C3007e f17569a;

        public C3004b(C3007e eVar, C3005c cVar, C3006d dVar) {
            this.f17569a = eVar;
            this.f17567a = cVar;
            this.f17568a = dVar;
        }

        public void onAnimationEnd(Animation animation) {
            C3005c cVar = this.f17567a;
            if (cVar != null) {
                cVar.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            C3006d dVar = this.f17568a;
            if (dVar != null) {
                dVar.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            C3007e eVar = this.f17569a;
            if (eVar != null) {
                eVar.onAnimationStart(animation);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.nt4$c */
    public interface C3005c {
        void onAnimationEnd(Animation animation);
    }

    /* renamed from: com.onedelhi.secure.nt4$d */
    public interface C3006d {
        void onAnimationRepeat(Animation animation);
    }

    /* renamed from: com.onedelhi.secure.nt4$e */
    public interface C3007e {
        void onAnimationStart(Animation animation);
    }

    /* renamed from: com.onedelhi.secure.nt4$f */
    public interface C3008f {
        void onChildViewAdded(View view, View view2);
    }

    /* renamed from: com.onedelhi.secure.nt4$g */
    public interface C3009g {
        void onChildViewRemoved(View view, View view2);
    }

    @C1717al({"android:animateLayoutChanges"})
    @TargetApi(11)
    /* renamed from: a */
    public static void m23167a(ViewGroup viewGroup, boolean z) {
        viewGroup.setLayoutTransition(z ? new LayoutTransition() : null);
    }

    @C1717al(requireAll = false, value = {"android:onAnimationStart", "android:onAnimationEnd", "android:onAnimationRepeat"})
    /* renamed from: b */
    public static void m23168b(ViewGroup viewGroup, C3007e eVar, C3005c cVar, C3006d dVar) {
        if (eVar == null && cVar == null && dVar == null) {
            viewGroup.setLayoutAnimationListener((Animation.AnimationListener) null);
        } else {
            viewGroup.setLayoutAnimationListener(new C3004b(eVar, cVar, dVar));
        }
    }

    @C1717al(requireAll = false, value = {"android:onChildViewAdded", "android:onChildViewRemoved"})
    /* renamed from: c */
    public static void m23169c(ViewGroup viewGroup, C3008f fVar, C3009g gVar) {
        if (fVar == null && gVar == null) {
            viewGroup.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
        } else {
            viewGroup.setOnHierarchyChangeListener(new C3003a(fVar, gVar));
        }
    }
}
