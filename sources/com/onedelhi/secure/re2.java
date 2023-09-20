package com.onedelhi.secure;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import com.onedelhi.secure.fd3;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

@sj3(21)
public class re2 extends SharedElementCallback {
    @ts2

    /* renamed from: a */
    public static WeakReference<View> f34598a;
    @ts2

    /* renamed from: a */
    public Rect f34599a;
    @ts2

    /* renamed from: a */
    public C6687d f34600a = new C6688e();

    /* renamed from: a */
    public boolean f34601a = true;

    /* renamed from: b */
    public boolean f34602b = true;

    /* renamed from: c */
    public boolean f34603c = false;

    /* renamed from: com.onedelhi.secure.re2$a */
    public class C6684a extends mh4 {

        /* renamed from: a */
        public final /* synthetic */ Window f34604a;

        public C6684a(Window window) {
            this.f34604a = window;
        }

        public void onTransitionEnd(Transition transition) {
            re2.m63563j(this.f34604a);
        }

        public void onTransitionStart(Transition transition) {
            re2.m63562i(this.f34604a);
        }
    }

    /* renamed from: com.onedelhi.secure.re2$b */
    public class C6685b extends mh4 {

        /* renamed from: a */
        public final /* synthetic */ Activity f34606a;

        public C6685b(Activity activity) {
            this.f34606a = activity;
        }

        public void onTransitionEnd(Transition transition) {
            View view;
            if (!(re2.f34598a == null || (view = (View) re2.f34598a.get()) == null)) {
                view.setAlpha(1.0f);
                WeakReference unused = re2.f34598a = null;
            }
            this.f34606a.finish();
            this.f34606a.overridePendingTransition(0, 0);
        }
    }

    /* renamed from: com.onedelhi.secure.re2$c */
    public class C6686c extends mh4 {

        /* renamed from: a */
        public final /* synthetic */ Window f34608a;

        public C6686c(Window window) {
            this.f34608a = window;
        }

        public void onTransitionStart(Transition transition) {
            re2.m63562i(this.f34608a);
        }
    }

    /* renamed from: com.onedelhi.secure.re2$d */
    public interface C6687d {
        @ts2
        /* renamed from: a */
        uw3 mo43887a(@mr2 View view);
    }

    /* renamed from: com.onedelhi.secure.re2$e */
    public static class C6688e implements C6687d {
        @ts2
        /* renamed from: a */
        public uw3 mo43887a(@mr2 View view) {
            if (view instanceof nx3) {
                return ((nx3) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    @ts2
    /* renamed from: f */
    public static Drawable m63561f(Window window) {
        return window.getDecorView().getBackground();
    }

    /* renamed from: i */
    public static void m63562i(Window window) {
        Drawable f = m63561f(window);
        if (f != null) {
            f.mutate().setColorFilter(C3727um.m29420a(0, C3799vm.CLEAR));
        }
    }

    /* renamed from: j */
    public static void m63563j(Window window) {
        Drawable f = m63561f(window);
        if (f != null) {
            f.mutate().clearColorFilter();
        }
    }

    /* renamed from: p */
    public static void m63564p(Window window, pe2 pe2) {
        if (pe2.getDuration() >= 0) {
            window.setTransitionBackgroundFadeDuration(pe2.getDuration());
        }
    }

    @ts2
    /* renamed from: e */
    public C6687d mo43874e() {
        return this.f34600a;
    }

    /* renamed from: g */
    public boolean mo43875g() {
        return this.f34603c;
    }

    /* renamed from: h */
    public boolean mo43876h() {
        return this.f34602b;
    }

    /* renamed from: k */
    public void mo43877k(@ts2 C6687d dVar) {
        this.f34600a = dVar;
    }

    /* renamed from: l */
    public void mo43878l(boolean z) {
        this.f34603c = z;
    }

    /* renamed from: m */
    public void mo43879m(boolean z) {
        this.f34602b = z;
    }

    /* renamed from: n */
    public final void mo43880n(Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof pe2) {
            pe2 pe2 = (pe2) sharedElementEnterTransition;
            if (!this.f34603c) {
                window.setSharedElementReenterTransition((Transition) null);
            }
            if (this.f34602b) {
                m63564p(window, pe2);
                pe2.addListener(new C6684a(window));
            }
        }
    }

    /* renamed from: o */
    public final void mo43881o(Activity activity, Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof pe2) {
            pe2 pe2 = (pe2) sharedElementReturnTransition;
            pe2.mo42530V(true);
            pe2.addListener(new C6685b(activity));
            if (this.f34602b) {
                m63564p(window, pe2);
                pe2.addListener(new C6686c(window));
            }
        }
    }

    @ts2
    public Parcelable onCaptureSharedElementSnapshot(@mr2 View view, @mr2 Matrix matrix, @mr2 RectF rectF) {
        f34598a = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @ts2
    public View onCreateSnapshotView(@mr2 Context context, @ts2 Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        uw3 a;
        View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (!(onCreateSnapshotView == null || (weakReference = f34598a) == null || this.f34600a == null || (view = (View) weakReference.get()) == null || (a = this.f34600a.mo43887a(view)) == null)) {
            onCreateSnapshotView.setTag(fd3.C2158h.mtrl_motion_snapshot_view, a);
        }
        return onCreateSnapshotView;
    }

    public void onMapSharedElements(@mr2 List<String> list, @mr2 Map<String, View> map) {
        View view;
        Activity a;
        if (!list.isEmpty() && !map.isEmpty() && (view = map.get(list.get(0))) != null && (a = a80.m36091a(view.getContext())) != null) {
            Window window = a.getWindow();
            if (this.f34601a) {
                mo43880n(window);
            } else {
                mo43881o(a, window);
            }
        }
    }

    public void onSharedElementEnd(@mr2 List<String> list, @mr2 List<View> list2, @mr2 List<View> list3) {
        if (!list2.isEmpty()) {
            int i = fd3.C2158h.mtrl_motion_snapshot_view;
            if (list2.get(0).getTag(i) instanceof View) {
                list2.get(0).setTag(i, (Object) null);
            }
        }
        if (!this.f34601a && !list2.isEmpty()) {
            this.f34599a = rh4.m63618i(list2.get(0));
        }
        this.f34601a = false;
    }

    public void onSharedElementStart(@mr2 List<String> list, @mr2 List<View> list2, @mr2 List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(fd3.C2158h.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (!this.f34601a && !list2.isEmpty() && this.f34599a != null) {
            View view = list2.get(0);
            view.measure(View.MeasureSpec.makeMeasureSpec(this.f34599a.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f34599a.height(), 1073741824));
            Rect rect = this.f34599a;
            view.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }
}
