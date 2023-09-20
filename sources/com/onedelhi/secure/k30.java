package com.onedelhi.secure;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.C0690e;
import androidx.lifecycle.C0695g;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0003\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0005\u001a\u00020\u0004J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0015J\b\u0010\n\u001a\u00020\bH\u0015J\b\u0010\u000b\u001a\u00020\bH\u0015J\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000e\u001a\u00020\bH\u0017J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u001a\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0017\u001a\u00020\bH\u0002R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Lcom/onedelhi/secure/k30;", "Landroid/app/Dialog;", "Lcom/onedelhi/secure/a32;", "Lcom/onedelhi/secure/lu2;", "Landroidx/lifecycle/e;", "getLifecycle", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/onedelhi/secure/un4;", "onCreate", "onStart", "onStop", "Landroidx/activity/OnBackPressedDispatcher;", "C", "onBackPressed", "", "layoutResID", "setContentView", "Landroid/view/View;", "view", "Landroid/view/ViewGroup$LayoutParams;", "params", "addContentView", "c", "Landroidx/lifecycle/g;", "b", "()Landroidx/lifecycle/g;", "lifecycleRegistry", "Landroid/content/Context;", "context", "themeResId", "<init>", "(Landroid/content/Context;I)V", "activity_release"}, k = 1, mv = {1, 6, 0})
public class k30 extends Dialog implements a32, lu2 {
    @vr2

    /* renamed from: a */
    public final OnBackPressedDispatcher f14695a;
    @ss2

    /* renamed from: a */
    public C0695g f14696a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @vw1
    public k30(@vr2 Context context) {
        this(context, 0, 2, (wg0) null);
        jt1.m53777p(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @vw1
    public k30(@vr2 Context context, @e64 int i) {
        super(context, i);
        jt1.m53777p(context, "context");
        this.f14695a = new OnBackPressedDispatcher(new j30(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k30(Context context, int i, int i2, wg0 wg0) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    /* renamed from: d */
    public static final void m19409d(k30 k30) {
        jt1.m53777p(k30, "this$0");
        super.onBackPressed();
    }

    @vr2
    /* renamed from: C */
    public final OnBackPressedDispatcher mo614C() {
        return this.f14695a;
    }

    public void addContentView(@vr2 View view, @ss2 ViewGroup.LayoutParams layoutParams) {
        jt1.m53777p(view, "view");
        mo18877c();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: b */
    public final C0695g mo18876b() {
        C0695g gVar = this.f14696a;
        if (gVar != null) {
            return gVar;
        }
        C0695g gVar2 = new C0695g(this);
        this.f14696a = gVar2;
        return gVar2;
    }

    /* renamed from: c */
    public final void mo18877c() {
        Window window = getWindow();
        jt1.m53774m(window);
        kv4.m20051b(window.getDecorView(), this);
        Window window2 = getWindow();
        jt1.m53774m(window2);
        View decorView = window2.getDecorView();
        jt1.m53776o(decorView, "window!!.decorView");
        lv4.m21020b(decorView, this);
    }

    @vr2
    public final C0690e getLifecycle() {
        return mo18876b();
    }

    @C3740us
    public void onBackPressed() {
        this.f14695a.mo678e();
    }

    @C3740us
    public void onCreate(@ss2 Bundle bundle) {
        super.onCreate(bundle);
        mo18876b().mo4968j(C0690e.C0692b.ON_CREATE);
    }

    @C3740us
    public void onStart() {
        super.onStart();
        mo18876b().mo4968j(C0690e.C0692b.ON_RESUME);
    }

    @C3740us
    public void onStop() {
        mo18876b().mo4968j(C0690e.C0692b.ON_DESTROY);
        this.f14696a = null;
        super.onStop();
    }

    public void setContentView(int i) {
        mo18877c();
        super.setContentView(i);
    }

    public void setContentView(@vr2 View view) {
        jt1.m53777p(view, "view");
        mo18877c();
        super.setContentView(view);
    }

    public void setContentView(@vr2 View view, @ss2 ViewGroup.LayoutParams layoutParams) {
        jt1.m53777p(view, "view");
        mo18877c();
        super.setContentView(view, layoutParams);
    }
}
