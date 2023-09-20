package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import com.onedelhi.secure.C3962y2;
import com.onedelhi.secure.k43;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.ta1;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.va1;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.f */
public abstract class C0646f<E> extends ta1 {
    @ts2

    /* renamed from: a */
    public final Activity f3857a;
    @mr2

    /* renamed from: a */
    public final Context f3858a;
    @mr2

    /* renamed from: a */
    public final Handler f3859a;

    /* renamed from: a */
    public final FragmentManager f3860a;

    /* renamed from: n */
    public final int f3861n;

    public C0646f(@ts2 Activity activity, @mr2 Context context, @mr2 Handler handler, int i) {
        this.f3860a = new va1();
        this.f3857a = activity;
        this.f3858a = (Context) k43.m19456m(context, "context == null");
        this.f3859a = (Handler) k43.m19456m(handler, "handler == null");
        this.f3861n = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0646f(@mr2 Context context, @mr2 Handler handler, int i) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i);
    }

    public C0646f(@mr2 FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    @ts2
    /* renamed from: c */
    public View mo4428c(int i) {
        return null;
    }

    /* renamed from: d */
    public boolean mo4429d() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @ts2
    /* renamed from: e */
    public Activity mo4778e() {
        return this.f3857a;
    }

    /* access modifiers changed from: package-private */
    @mr2
    /* renamed from: f */
    public Context mo4779f() {
        return this.f3858a;
    }

    /* access modifiers changed from: package-private */
    @mr2
    /* renamed from: g */
    public Handler mo4780g() {
        return this.f3859a;
    }

    /* renamed from: h */
    public void mo4469h(@mr2 String str, @ts2 FileDescriptor fileDescriptor, @mr2 PrintWriter printWriter, @ts2 String[] strArr) {
    }

    @ts2
    /* renamed from: i */
    public abstract E mo4470i();

    @mr2
    /* renamed from: j */
    public LayoutInflater mo4471j() {
        return LayoutInflater.from(this.f3858a);
    }

    /* renamed from: k */
    public int mo4472k() {
        return this.f3861n;
    }

    /* renamed from: l */
    public boolean mo4473l() {
        return true;
    }

    @Deprecated
    /* renamed from: m */
    public void mo4781m(@mr2 Fragment fragment, @mr2 String[] strArr, int i) {
    }

    /* renamed from: n */
    public boolean mo4474n(@mr2 Fragment fragment) {
        return true;
    }

    /* renamed from: o */
    public boolean mo4475o(@mr2 String str) {
        return false;
    }

    /* renamed from: p */
    public void mo4782p(@mr2 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        mo4783q(fragment, intent, i, (Bundle) null);
    }

    /* renamed from: q */
    public void mo4783q(@mr2 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @ts2 Bundle bundle) {
        if (i == -1) {
            r70.m26367t(this.f3858a, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    /* renamed from: r */
    public void mo4784r(@mr2 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @ts2 Intent intent, int i2, int i3, int i4, @ts2 Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            C3962y2.m31867O(this.f3857a, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }

    /* renamed from: s */
    public void mo4476s() {
    }
}
