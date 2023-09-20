package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

/* renamed from: androidx.fragment.app.g */
public class C0647g implements LayoutInflater.Factory2 {

    /* renamed from: b */
    public static final String f3862b = "FragmentManager";

    /* renamed from: a */
    public final FragmentManager f3863a;

    /* renamed from: androidx.fragment.app.g$a */
    public class C0648a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C0653j f3865a;

        public C0648a(C0653j jVar) {
            this.f3865a = jVar;
        }

        public void onViewAttachedToWindow(View view) {
            Fragment k = this.f3865a.mo4821k();
            this.f3865a.mo4823m();
            C0668n.m4684n((ViewGroup) k.mView.getParent(), C0647g.this.f3863a).mo4888j();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public C0647g(FragmentManager fragmentManager) {
        this.f3863a = fragmentManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x016a  */
    @com.onedelhi.secure.ts2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(@com.onedelhi.secure.ts2 android.view.View r9, @com.onedelhi.secure.mr2 java.lang.String r10, @com.onedelhi.secure.mr2 android.content.Context r11, @com.onedelhi.secure.mr2 android.util.AttributeSet r12) {
        /*
            r8 = this;
            java.lang.Class<androidx.fragment.app.FragmentContainerView> r0 = androidx.fragment.app.FragmentContainerView.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0014
            androidx.fragment.app.FragmentContainerView r9 = new androidx.fragment.app.FragmentContainerView
            androidx.fragment.app.FragmentManager r10 = r8.f3863a
            r9.<init>((android.content.Context) r11, (android.util.AttributeSet) r12, (androidx.fragment.app.FragmentManager) r10)
            return r9
        L_0x0014:
            java.lang.String r0 = "fragment"
            boolean r10 = r0.equals(r10)
            r0 = 0
            if (r10 != 0) goto L_0x001e
            return r0
        L_0x001e:
            java.lang.String r10 = "class"
            java.lang.String r10 = r12.getAttributeValue(r0, r10)
            int[] r1 = com.onedelhi.secure.ab3.C1689l.Fragment
            android.content.res.TypedArray r1 = r11.obtainStyledAttributes(r12, r1)
            if (r10 != 0) goto L_0x0032
            int r10 = com.onedelhi.secure.ab3.C1689l.Fragment_android_name
            java.lang.String r10 = r1.getString(r10)
        L_0x0032:
            int r2 = com.onedelhi.secure.ab3.C1689l.Fragment_android_id
            r3 = -1
            int r2 = r1.getResourceId(r2, r3)
            int r4 = com.onedelhi.secure.ab3.C1689l.Fragment_android_tag
            java.lang.String r4 = r1.getString(r4)
            r1.recycle()
            if (r10 == 0) goto L_0x01c2
            java.lang.ClassLoader r1 = r11.getClassLoader()
            boolean r1 = androidx.fragment.app.C0645e.m4540b(r1, r10)
            if (r1 != 0) goto L_0x0050
            goto L_0x01c2
        L_0x0050:
            if (r9 == 0) goto L_0x0057
            int r1 = r9.getId()
            goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            if (r1 != r3) goto L_0x007d
            if (r2 != r3) goto L_0x007d
            if (r4 == 0) goto L_0x005f
            goto L_0x007d
        L_0x005f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r12.getPositionDescription()
            r11.append(r12)
            java.lang.String r12 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x007d:
            if (r2 == r3) goto L_0x0085
            androidx.fragment.app.FragmentManager r0 = r8.f3863a
            androidx.fragment.app.Fragment r0 = r0.mo4606p0(r2)
        L_0x0085:
            if (r0 != 0) goto L_0x008f
            if (r4 == 0) goto L_0x008f
            androidx.fragment.app.FragmentManager r0 = r8.f3863a
            androidx.fragment.app.Fragment r0 = r0.mo4609q0(r4)
        L_0x008f:
            if (r0 != 0) goto L_0x0099
            if (r1 == r3) goto L_0x0099
            androidx.fragment.app.FragmentManager r0 = r8.f3863a
            androidx.fragment.app.Fragment r0 = r0.mo4606p0(r1)
        L_0x0099:
            java.lang.String r3 = "Fragment "
            java.lang.String r5 = "FragmentManager"
            r6 = 2
            r7 = 1
            if (r0 != 0) goto L_0x0102
            androidx.fragment.app.FragmentManager r0 = r8.f3863a
            androidx.fragment.app.e r0 = r0.mo4510E0()
            java.lang.ClassLoader r11 = r11.getClassLoader()
            androidx.fragment.app.Fragment r0 = r0.mo4643a(r11, r10)
            r0.mFromLayout = r7
            if (r2 == 0) goto L_0x00b5
            r11 = r2
            goto L_0x00b6
        L_0x00b5:
            r11 = r1
        L_0x00b6:
            r0.mFragmentId = r11
            r0.mContainerId = r1
            r0.mTag = r4
            r0.mInLayout = r7
            androidx.fragment.app.FragmentManager r11 = r8.f3863a
            r0.mFragmentManager = r11
            androidx.fragment.app.f r11 = r11.mo4518H0()
            r0.mHost = r11
            androidx.fragment.app.FragmentManager r11 = r8.f3863a
            androidx.fragment.app.f r11 = r11.mo4518H0()
            android.content.Context r11 = r11.mo4779f()
            android.os.Bundle r1 = r0.mSavedFragmentState
            r0.onInflate((android.content.Context) r11, (android.util.AttributeSet) r12, (android.os.Bundle) r1)
            androidx.fragment.app.FragmentManager r11 = r8.f3863a
            androidx.fragment.app.j r11 = r11.mo4591k(r0)
            boolean r12 = androidx.fragment.app.FragmentManager.m4279T0(r6)
            if (r12 == 0) goto L_0x013d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
            r12.append(r0)
            java.lang.String r1 = " has been inflated via the <fragment> tag: id=0x"
        L_0x00f0:
            r12.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r2)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            android.util.Log.v(r5, r12)
            goto L_0x013d
        L_0x0102:
            boolean r11 = r0.mInLayout
            if (r11 != 0) goto L_0x0184
            r0.mInLayout = r7
            androidx.fragment.app.FragmentManager r11 = r8.f3863a
            r0.mFragmentManager = r11
            androidx.fragment.app.f r11 = r11.mo4518H0()
            r0.mHost = r11
            androidx.fragment.app.FragmentManager r11 = r8.f3863a
            androidx.fragment.app.f r11 = r11.mo4518H0()
            android.content.Context r11 = r11.mo4779f()
            android.os.Bundle r1 = r0.mSavedFragmentState
            r0.onInflate((android.content.Context) r11, (android.util.AttributeSet) r12, (android.os.Bundle) r1)
            androidx.fragment.app.FragmentManager r11 = r8.f3863a
            androidx.fragment.app.j r11 = r11.mo4497A(r0)
            boolean r12 = androidx.fragment.app.FragmentManager.m4279T0(r6)
            if (r12 == 0) goto L_0x013d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Retained Fragment "
            r12.append(r1)
            r12.append(r0)
            java.lang.String r1 = " has been re-attached via the <fragment> tag: id=0x"
            goto L_0x00f0
        L_0x013d:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r0.mContainer = r9
            r11.mo4823m()
            r11.mo4820j()
            android.view.View r9 = r0.mView
            if (r9 == 0) goto L_0x016a
            if (r2 == 0) goto L_0x0150
            r9.setId(r2)
        L_0x0150:
            android.view.View r9 = r0.mView
            java.lang.Object r9 = r9.getTag()
            if (r9 != 0) goto L_0x015d
            android.view.View r9 = r0.mView
            r9.setTag(r4)
        L_0x015d:
            android.view.View r9 = r0.mView
            androidx.fragment.app.g$a r10 = new androidx.fragment.app.g$a
            r10.<init>(r11)
            r9.addOnAttachStateChangeListener(r10)
            android.view.View r9 = r0.mView
            return r9
        L_0x016a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            r11.append(r10)
            java.lang.String r10 = " did not create a view."
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x0184:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r12.getPositionDescription()
            r11.append(r12)
            java.lang.String r12 = ": Duplicate id 0x"
            r11.append(r12)
            java.lang.String r12 = java.lang.Integer.toHexString(r2)
            r11.append(r12)
            java.lang.String r12 = ", tag "
            r11.append(r12)
            r11.append(r4)
            java.lang.String r12 = ", or parent id 0x"
            r11.append(r12)
            java.lang.String r12 = java.lang.Integer.toHexString(r1)
            r11.append(r12)
            java.lang.String r12 = " with another fragment for "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x01c2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0647g.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @ts2
    public View onCreateView(@mr2 String str, @mr2 Context context, @mr2 AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
