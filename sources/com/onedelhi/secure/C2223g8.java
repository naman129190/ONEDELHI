package com.onedelhi.secure;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.C0191d;
import com.onedelhi.secure.C3563t2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.qy1;
import com.onedelhi.secure.za3;

/* renamed from: com.onedelhi.secure.g8 */
public class C2223g8 extends k30 implements C1862c8 {

    /* renamed from: a */
    public C0191d f12472a;

    /* renamed from: a */
    public final qy1.C3350a f12473a;

    public C2223g8(@mr2 Context context) {
        this(context, 0);
    }

    public C2223g8(@mr2 Context context, int i) {
        super(context, m15590g(context, i));
        this.f12473a = new C5215f8(this);
        C0191d e = mo16387e();
        e.mo980R(m15590g(context, i));
        e.mo998z((Bundle) null);
    }

    public C2223g8(@mr2 Context context, boolean z, @ts2 DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.f12473a = new C5215f8(this);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    /* renamed from: g */
    public static int m15590g(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(za3.C4057b.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @ts2
    /* renamed from: G */
    public C3563t2 mo837G(C3563t2.C3564a aVar) {
        return null;
    }

    /* renamed from: L */
    public void mo840L(C3563t2 t2Var) {
    }

    public void addContentView(@mr2 View view, ViewGroup.LayoutParams layoutParams) {
        mo16387e().mo983d(view, layoutParams);
    }

    public void dismiss() {
        super.dismiss();
        mo16387e().mo967A();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return qy1.m26229e(this.f12473a, getWindow().getDecorView(), this, keyEvent);
    }

    @mr2
    /* renamed from: e */
    public C0191d mo16387e() {
        if (this.f12472a == null) {
            this.f12472a = C0191d.m1373j(this, this);
        }
        return this.f12472a;
    }

    /* renamed from: f */
    public ActionBar mo16388f() {
        return mo16387e().mo992s();
    }

    @ts2
    public <T extends View> T findViewById(@mo1 int i) {
        return mo16387e().mo988n(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo16390h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: i */
    public boolean mo16391i(int i) {
        return mo16387e().mo973I(i);
    }

    @hl3({hl3.C2354a.f13188c})
    public void invalidateOptionsMenu() {
        mo16387e().mo995v();
    }

    public void onCreate(Bundle bundle) {
        mo16387e().mo994u();
        super.onCreate(bundle);
        mo16387e().mo998z(bundle);
    }

    public void onStop() {
        super.onStop();
        mo16387e().mo972F();
    }

    public void setContentView(@s12 int i) {
        mo16387e().mo974K(i);
    }

    public void setContentView(@mr2 View view) {
        mo16387e().mo975L(view);
    }

    public void setContentView(@mr2 View view, ViewGroup.LayoutParams layoutParams) {
        mo16387e().mo976M(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo16387e().mo981S(getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo16387e().mo981S(charSequence);
    }

    /* renamed from: y */
    public void mo878y(C3563t2 t2Var) {
    }
}
