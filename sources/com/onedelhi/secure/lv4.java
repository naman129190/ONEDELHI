package com.onedelhi.secure;

import android.view.View;
import android.view.ViewParent;
import com.onedelhi.secure.na3;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Lcom/onedelhi/secure/lu2;", "onBackPressedDispatcherOwner", "Lcom/onedelhi/secure/un4;", "b", "(Landroid/view/View;Lcom/onedelhi/secure/lu2;)V", "a", "(Landroid/view/View;)Lcom/onedelhi/secure/lu2;", "activity_release"}, k = 2, mv = {1, 6, 0})
@uw1(name = "ViewTreeOnBackPressedDispatcherOwner")
public final class lv4 {

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "it", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.lv4$a */
    public static final class C2785a extends d12 implements ec1<View, View> {

        /* renamed from: a */
        public static final C2785a f15638a = new C2785a();

        public C2785a() {
            super(1);
        }

        @ss2
        /* renamed from: a */
        public final View mo17094X(@vr2 View view) {
            jt1.m53777p(view, "it");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lcom/onedelhi/secure/lu2;", "a", "(Landroid/view/View;)Lcom/onedelhi/secure/lu2;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.lv4$b */
    public static final class C2786b extends d12 implements ec1<View, lu2> {

        /* renamed from: a */
        public static final C2786b f15639a = new C2786b();

        public C2786b() {
            super(1);
        }

        @ss2
        /* renamed from: a */
        public final lu2 mo17094X(@vr2 View view) {
            jt1.m53777p(view, "it");
            Object tag = view.getTag(na3.C2948a.view_tree_on_back_pressed_dispatcher_owner);
            if (tag instanceof lu2) {
                return (lu2) tag;
            }
            return null;
        }
    }

    @uw1(name = "get")
    @ss2
    /* renamed from: a */
    public static final lu2 m21019a(@vr2 View view) {
        jt1.m53777p(view, "<this>");
        return (lu2) hu3.m50921F0(hu3.m51061p1(fu3.m48496n(view, C2785a.f15638a), C2786b.f15639a));
    }

    @uw1(name = "set")
    /* renamed from: b */
    public static final void m21020b(@vr2 View view, @vr2 lu2 lu2) {
        jt1.m53777p(view, "<this>");
        jt1.m53777p(lu2, "onBackPressedDispatcherOwner");
        view.setTag(na3.C2948a.view_tree_on_back_pressed_dispatcher_owner, lu2);
    }
}
