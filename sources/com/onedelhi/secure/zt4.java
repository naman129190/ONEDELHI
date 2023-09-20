package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import easypay.appinvoke.manager.Constants;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\u0007\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\bø\u0001\u0000\u001a5\u0010\b\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\bø\u0001\u0000\u001a5\u0010\n\u001a\u00020\t*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\bø\u0001\u0000\u001a5\u0010\u000b\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\bø\u0001\u0000\u001a5\u0010\f\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\bø\u0001\u0000\u001a5\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0003\u0010\u0010\u001a\u00020\r2\b\b\u0003\u0010\u0011\u001a\u00020\rH\b\u001a5\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u0013\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0003\u0010\u0014\u001a\u00020\r2\b\b\u0003\u0010\u0011\u001a\u00020\rH\b\u001a\u0017\u0010\u0017\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\rH\b\u001a(\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\bø\u0001\u0000\u001a(\u0010\u001d\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\bø\u0001\u0000\u001a\u0014\u0010!\u001a\u00020 *\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u001a)\u0010%\u001a\u00020\u0005*\u00020\u00002\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b#H\bø\u0001\u0000\u001a<\u0010'\u001a\u00020\u0005\"\n\b\u0000\u0010&\u0018\u0001*\u00020\"*\u00020\u00002\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b#H\bø\u0001\u0000¢\u0006\u0004\b'\u0010(\"*\u0010/\u001a\u00020)*\u00020\u00002\u0006\u0010*\u001a\u00020)8Æ\u0002@Æ\u0002X\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\"*\u00102\u001a\u00020)*\u00020\u00002\u0006\u0010*\u001a\u00020)8Æ\u0002@Æ\u0002X\u000e¢\u0006\f\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.\"*\u00105\u001a\u00020)*\u00020\u00002\u0006\u0010*\u001a\u00020)8Æ\u0002@Æ\u0002X\u000e¢\u0006\f\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.\"\u0016\u00108\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b6\u00107\"\u0016\u0010:\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b9\u00107\"\u0016\u0010<\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b;\u00107\"\u0016\u0010>\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b=\u00107\"\u0016\u0010@\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b?\u00107\"\u0016\u0010B\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\bA\u00107\"\u001b\u0010G\u001a\b\u0012\u0004\u0012\u00020D0C*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bE\u0010F\"\u001b\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00000C*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bH\u0010F\u0002\u0007\n\u0005\b20\u0001¨\u0006J"}, d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "Lcom/onedelhi/secure/iy2;", "name", "view", "Lcom/onedelhi/secure/un4;", "action", "d", "c", "Lcom/onedelhi/secure/tv2;", "e", "a", "b", "", "start", "top", "end", "bottom", "C", "left", "right", "A", "size", "w", "", "delayInMillis", "Lkotlin/Function0;", "Ljava/lang/Runnable;", "s", "t", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "f", "Landroid/view/ViewGroup$LayoutParams;", "Lcom/onedelhi/secure/wy0;", "block", "y", "T", "z", "(Landroid/view/View;Lcom/onedelhi/secure/ec1;)V", "", "value", "r", "(Landroid/view/View;)Z", "x", "(Landroid/view/View;Z)V", "isVisible", "q", "v", "isInvisible", "p", "u", "isGone", "l", "(Landroid/view/View;)I", "marginLeft", "o", "marginTop", "m", "marginRight", "j", "marginBottom", "n", "marginStart", "k", "marginEnd", "Lcom/onedelhi/secure/zt3;", "Landroid/view/ViewParent;", "i", "(Landroid/view/View;)Lcom/onedelhi/secure/zt3;", "ancestors", "h", "allViews", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class zt4 {

    @cf0(mo32326c = "androidx.core.view.ViewKt$allViews$1", mo32327f = "View.kt", mo32328i = {0}, mo32329l = {406, 408}, mo32330m = "invokeSuspend", mo32331n = {"$this$sequence"}, mo32332s = {"L$0"})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, d2 = {"Lcom/onedelhi/secure/bu3;", "Landroid/view/View;", "Lcom/onedelhi/secure/un4;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.zt4$a */
    public static final class C4132a extends ll3 implements sc1<bu3<? super View>, b80<? super un4>, Object> {

        /* renamed from: a */
        public final /* synthetic */ View f23882a;

        /* renamed from: a */
        public /* synthetic */ Object f23883a;

        /* renamed from: o */
        public int f23884o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4132a(View view, b80<? super C4132a> b80) {
            super(2, b80);
            this.f23882a = view;
        }

        @vr2
        /* renamed from: B */
        public final b80<un4> mo22644B(@ss2 Object obj, @vr2 b80<?> b80) {
            C4132a aVar = new C4132a(this.f23882a, b80);
            aVar.f23883a = obj;
            return aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.onedelhi.secure.bu3} */
        /* JADX WARNING: Multi-variable type inference failed */
        @com.onedelhi.secure.ss2
        /* renamed from: D */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo22645D(@com.onedelhi.secure.vr2 java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = com.onedelhi.secure.mt1.m57558h()
                int r1 = r4.f23884o
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                com.onedelhi.secure.pl3.m61436n(r5)
                goto L_0x004f
            L_0x0012:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x001a:
                java.lang.Object r1 = r4.f23883a
                com.onedelhi.secure.bu3 r1 = (com.onedelhi.secure.bu3) r1
                com.onedelhi.secure.pl3.m61436n(r5)
                goto L_0x0037
            L_0x0022:
                com.onedelhi.secure.pl3.m61436n(r5)
                java.lang.Object r5 = r4.f23883a
                r1 = r5
                com.onedelhi.secure.bu3 r1 = (com.onedelhi.secure.bu3) r1
                android.view.View r5 = r4.f23882a
                r4.f23883a = r1
                r4.f23884o = r3
                java.lang.Object r5 = r1.mo31188h(r5, r4)
                if (r5 != r0) goto L_0x0037
                return r0
            L_0x0037:
                android.view.View r5 = r4.f23882a
                boolean r3 = r5 instanceof android.view.ViewGroup
                if (r3 == 0) goto L_0x004f
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                com.onedelhi.secure.zt3 r5 = com.onedelhi.secure.pt4.m25021f(r5)
                r3 = 0
                r4.f23883a = r3
                r4.f23884o = r2
                java.lang.Object r5 = r1.mo32032i(r5, r4)
                if (r5 != r0) goto L_0x004f
                return r0
            L_0x004f:
                com.onedelhi.secure.un4 r5 = com.onedelhi.secure.un4.f36206a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.zt4.C4132a.mo22645D(java.lang.Object):java.lang.Object");
        }

        @ss2
        /* renamed from: L */
        public final Object mo21054h0(@vr2 bu3<? super View> bu3, @ss2 b80<? super un4> b80) {
            return ((C4132a) mo22644B(bu3, b80)).mo22645D(un4.f36206a);
        }
    }

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.zt4$b */
    public /* synthetic */ class C4133b extends hd1 implements ec1<ViewParent, ViewParent> {

        /* renamed from: a */
        public static final C4133b f23885a = new C4133b();

        public C4133b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        /* renamed from: G0 */
        public final ViewParent mo17094X(@vr2 ViewParent viewParent) {
            jt1.m53777p(viewParent, "p0");
            return viewParent.getParent();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/onedelhi/secure/zt4$c", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Lcom/onedelhi/secure/un4;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.zt4$c */
    public static final class C4134c implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ View f23886a;

        /* renamed from: a */
        public final /* synthetic */ ec1<View, un4> f23887a;

        public C4134c(View view, ec1<? super View, un4> ec1) {
            this.f23886a = view;
            this.f23887a = ec1;
        }

        public void onViewAttachedToWindow(@vr2 View view) {
            jt1.m53777p(view, "view");
            this.f23886a.removeOnAttachStateChangeListener(this);
            this.f23887a.mo17094X(view);
        }

        public void onViewDetachedFromWindow(@vr2 View view) {
            jt1.m53777p(view, "view");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/onedelhi/secure/zt4$d", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Lcom/onedelhi/secure/un4;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.zt4$d */
    public static final class C4135d implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ View f23888a;

        /* renamed from: a */
        public final /* synthetic */ ec1<View, un4> f23889a;

        public C4135d(View view, ec1<? super View, un4> ec1) {
            this.f23888a = view;
            this.f23889a = ec1;
        }

        public void onViewAttachedToWindow(@vr2 View view) {
            jt1.m53777p(view, "view");
        }

        public void onViewDetachedFromWindow(@vr2 View view) {
            jt1.m53777p(view, "view");
            this.f23888a.removeOnAttachStateChangeListener(this);
            this.f23889a.mo17094X(view);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/zt4$f", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lcom/onedelhi/secure/un4;", "onLayoutChange", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.zt4$e */
    public static final class C4136e implements View.OnLayoutChangeListener {

        /* renamed from: a */
        public final /* synthetic */ ec1 f23890a;

        public C4136e(ec1 ec1) {
            this.f23890a = ec1;
        }

        public void onLayoutChange(@vr2 View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            jt1.m53777p(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f23890a.mo17094X(view);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"com/onedelhi/secure/zt4$f", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lcom/onedelhi/secure/un4;", "onLayoutChange", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.zt4$f */
    public static final class C4137f implements View.OnLayoutChangeListener {

        /* renamed from: a */
        public final /* synthetic */ ec1<View, un4> f23891a;

        public C4137f(ec1<? super View, un4> ec1) {
            this.f23891a = ec1;
        }

        public void onLayoutChange(@vr2 View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            jt1.m53777p(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f23891a.mo17094X(view);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/onedelhi/secure/un4;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.zt4$g */
    public static final class C4138g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f23892a;

        /* renamed from: a */
        public final /* synthetic */ ec1<View, un4> f23893a;

        public C4138g(ec1<? super View, un4> ec1, View view) {
            this.f23893a = ec1;
            this.f23892a = view;
        }

        public final void run() {
            this.f23893a.mo17094X(this.f23892a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/onedelhi/secure/un4;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.zt4$h */
    public static final class C4139h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ cc1<un4> f23894a;

        public C4139h(cc1<un4> cc1) {
            this.f23894a = cc1;
        }

        public final void run() {
            this.f23894a.invoke();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/onedelhi/secure/un4;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.zt4$i */
    public static final class C4140i implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ cc1<un4> f23895a;

        public C4140i(cc1<un4> cc1) {
            this.f23895a = cc1;
        }

        public final void run() {
            this.f23895a.invoke();
        }
    }

    /* renamed from: A */
    public static final void m33407A(@vr2 View view, @e83 int i, @e83 int i2, @e83 int i3, @e83 int i4) {
        jt1.m53777p(view, "<this>");
        view.setPadding(i, i2, i3, i4);
    }

    /* renamed from: B */
    public static /* synthetic */ void m33408B(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        jt1.m53777p(view, "<this>");
        view.setPadding(i, i2, i3, i4);
    }

    @sj3(17)
    /* renamed from: C */
    public static final void m33409C(@vr2 View view, @e83 int i, @e83 int i2, @e83 int i3, @e83 int i4) {
        jt1.m53777p(view, "<this>");
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* renamed from: D */
    public static /* synthetic */ void m33410D(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingStart();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        jt1.m53777p(view, "<this>");
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static final void m33411a(@vr2 View view, @vr2 ec1<? super View, un4> ec1) {
        jt1.m53777p(view, "<this>");
        jt1.m53777p(ec1, "action");
        if (jt4.m18896O0(view)) {
            ec1.mo17094X(view);
        } else {
            view.addOnAttachStateChangeListener(new C4134c(view, ec1));
        }
    }

    /* renamed from: b */
    public static final void m33412b(@vr2 View view, @vr2 ec1<? super View, un4> ec1) {
        jt1.m53777p(view, "<this>");
        jt1.m53777p(ec1, "action");
        if (!jt4.m18896O0(view)) {
            ec1.mo17094X(view);
        } else {
            view.addOnAttachStateChangeListener(new C4135d(view, ec1));
        }
    }

    /* renamed from: c */
    public static final void m33413c(@vr2 View view, @vr2 ec1<? super View, un4> ec1) {
        jt1.m53777p(view, "<this>");
        jt1.m53777p(ec1, "action");
        if (!jt4.m18914U0(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new C4136e(ec1));
        } else {
            ec1.mo17094X(view);
        }
    }

    /* renamed from: d */
    public static final void m33414d(@vr2 View view, @vr2 ec1<? super View, un4> ec1) {
        jt1.m53777p(view, "<this>");
        jt1.m53777p(ec1, "action");
        view.addOnLayoutChangeListener(new C4137f(ec1));
    }

    @vr2
    /* renamed from: e */
    public static final tv2 m33415e(@vr2 View view, @vr2 ec1<? super View, un4> ec1) {
        jt1.m53777p(view, "<this>");
        jt1.m53777p(ec1, "action");
        tv2 a = tv2.m28961a(view, new C4138g(ec1, view));
        jt1.m53776o(a, "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
        return a;
    }

    @vr2
    /* renamed from: f */
    public static final Bitmap m33416f(@vr2 View view, @vr2 Bitmap.Config config) {
        jt1.m53777p(view, "<this>");
        jt1.m53777p(config, Constants.EASY_PAY_CONFIG_PREF_KEY);
        if (jt4.m18914U0(view)) {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
            jt1.m53776o(createBitmap, "createBitmap(width, height, config)");
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-((float) view.getScrollX()), -((float) view.getScrollY()));
            view.draw(canvas);
            return createBitmap;
        }
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }

    /* renamed from: g */
    public static /* synthetic */ Bitmap m33417g(View view, Bitmap.Config config, int i, Object obj) {
        if ((i & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return m33416f(view, config);
    }

    @vr2
    /* renamed from: h */
    public static final zt3<View> m33418h(@vr2 View view) {
        jt1.m53777p(view, "<this>");
        return du3.m45551b(new C4132a(view, (b80<? super C4132a>) null));
    }

    @vr2
    /* renamed from: i */
    public static final zt3<ViewParent> m33419i(@vr2 View view) {
        jt1.m53777p(view, "<this>");
        return fu3.m48496n(view.getParent(), C4133b.f23885a);
    }

    /* renamed from: j */
    public static final int m33420j(@vr2 View view) {
        jt1.m53777p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    /* renamed from: k */
    public static final int m33421k(@vr2 View view) {
        jt1.m53777p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ld2.m20478b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    /* renamed from: l */
    public static final int m33422l(@vr2 View view) {
        jt1.m53777p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    /* renamed from: m */
    public static final int m33423m(@vr2 View view) {
        jt1.m53777p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    /* renamed from: n */
    public static final int m33424n(@vr2 View view) {
        jt1.m53777p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ld2.m20479c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    /* renamed from: o */
    public static final int m33425o(@vr2 View view) {
        jt1.m53777p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    /* renamed from: p */
    public static final boolean m33426p(@vr2 View view) {
        jt1.m53777p(view, "<this>");
        return view.getVisibility() == 8;
    }

    /* renamed from: q */
    public static final boolean m33427q(@vr2 View view) {
        jt1.m53777p(view, "<this>");
        return view.getVisibility() == 4;
    }

    /* renamed from: r */
    public static final boolean m33428r(@vr2 View view) {
        jt1.m53777p(view, "<this>");
        return view.getVisibility() == 0;
    }

    @vr2
    /* renamed from: s */
    public static final Runnable m33429s(@vr2 View view, long j, @vr2 cc1<un4> cc1) {
        jt1.m53777p(view, "<this>");
        jt1.m53777p(cc1, "action");
        C4139h hVar = new C4139h(cc1);
        view.postDelayed(hVar, j);
        return hVar;
    }

    @sj3(16)
    @vr2
    /* renamed from: t */
    public static final Runnable m33430t(@vr2 View view, long j, @vr2 cc1<un4> cc1) {
        jt1.m53777p(view, "<this>");
        jt1.m53777p(cc1, "action");
        C4140i iVar = new C4140i(cc1);
        view.postOnAnimationDelayed(iVar, j);
        return iVar;
    }

    /* renamed from: u */
    public static final void m33431u(@vr2 View view, boolean z) {
        jt1.m53777p(view, "<this>");
        view.setVisibility(z ? 8 : 0);
    }

    /* renamed from: v */
    public static final void m33432v(@vr2 View view, boolean z) {
        jt1.m53777p(view, "<this>");
        view.setVisibility(z ? 4 : 0);
    }

    /* renamed from: w */
    public static final void m33433w(@vr2 View view, @e83 int i) {
        jt1.m53777p(view, "<this>");
        view.setPadding(i, i, i, i);
    }

    /* renamed from: x */
    public static final void m33434x(@vr2 View view, boolean z) {
        jt1.m53777p(view, "<this>");
        view.setVisibility(z ? 0 : 8);
    }

    /* renamed from: y */
    public static final void m33435y(@vr2 View view, @vr2 ec1<? super ViewGroup.LayoutParams, un4> ec1) {
        jt1.m53777p(view, "<this>");
        jt1.m53777p(ec1, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        ec1.mo17094X(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    @uw1(name = "updateLayoutParamsTyped")
    /* renamed from: z */
    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void m33436z(View view, ec1<? super T, un4> ec1) {
        jt1.m53777p(view, "<this>");
        jt1.m53777p(ec1, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        jt1.m53786y(1, mx0.f16794s2);
        ec1.mo17094X(layoutParams);
        view.setLayoutParams(layoutParams);
    }
}
