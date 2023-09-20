package com.onedelhi.secure;

import android.view.View;
import android.view.ViewParent;
import com.onedelhi.secure.ub3;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Lcom/onedelhi/secure/dr3;", "owner", "Lcom/onedelhi/secure/un4;", "b", "(Landroid/view/View;Lcom/onedelhi/secure/dr3;)V", "a", "(Landroid/view/View;)Lcom/onedelhi/secure/dr3;", "savedstate_release"}, k = 2, mv = {1, 6, 0})
@uw1(name = "ViewTreeSavedStateRegistryOwner")
public final class mv4 {

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "view", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.mv4$a */
    public static final class C2892a extends d12 implements ec1<View, View> {

        /* renamed from: a */
        public static final C2892a f16391a = new C2892a();

        public C2892a() {
            super(1);
        }

        @ss2
        /* renamed from: a */
        public final View mo17094X(@vr2 View view) {
            jt1.m53777p(view, "view");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lcom/onedelhi/secure/dr3;", "a", "(Landroid/view/View;)Lcom/onedelhi/secure/dr3;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.mv4$b */
    public static final class C2893b extends d12 implements ec1<View, dr3> {

        /* renamed from: a */
        public static final C2893b f16392a = new C2893b();

        public C2893b() {
            super(1);
        }

        @ss2
        /* renamed from: a */
        public final dr3 mo17094X(@vr2 View view) {
            jt1.m53777p(view, "view");
            Object tag = view.getTag(ub3.C3692a.view_tree_saved_state_registry_owner);
            if (tag instanceof dr3) {
                return (dr3) tag;
            }
            return null;
        }
    }

    @uw1(name = "get")
    @ss2
    /* renamed from: a */
    public static final dr3 m22037a(@vr2 View view) {
        jt1.m53777p(view, "<this>");
        return (dr3) hu3.m50921F0(hu3.m51061p1(fu3.m48496n(view, C2892a.f16391a), C2893b.f16392a));
    }

    @uw1(name = "set")
    /* renamed from: b */
    public static final void m22038b(@vr2 View view, @ss2 dr3 dr3) {
        jt1.m53777p(view, "<this>");
        view.setTag(ub3.C3692a.view_tree_saved_state_registry_owner, dr3);
    }
}
