package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C0709m;
import com.onedelhi.secure.au4;
import com.onedelhi.secure.br3;
import com.onedelhi.secure.dr3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jb0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wq3;
import com.onedelhi.secure.xq3;

/* renamed from: androidx.lifecycle.a */
public abstract class C0684a extends C0709m.C0718d implements C0709m.C0713b {

    /* renamed from: a */
    public static final String f4063a = "androidx.lifecycle.savedstate.vm.tag";

    /* renamed from: a */
    public Bundle f4064a;

    /* renamed from: a */
    public C0690e f4065a;

    /* renamed from: a */
    public br3 f4066a;

    public C0684a() {
    }

    @SuppressLint({"LambdaLast"})
    public C0684a(@mr2 dr3 dr3, @ts2 Bundle bundle) {
        this.f4066a = dr3.getSavedStateRegistry();
        this.f4065a = dr3.getLifecycle();
        this.f4064a = bundle;
    }

    @mr2
    /* renamed from: a */
    public final <T extends au4> T mo4943a(@mr2 Class<T> cls, @mr2 jb0 jb0) {
        String str = (String) jb0.mo18205a(C0709m.C0715c.f4134a);
        if (str != null) {
            return this.f4066a != null ? mo4946d(str, cls) : mo4947e(str, cls, xq3.m31623a(jb0));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @mr2
    /* renamed from: b */
    public final <T extends au4> T mo4944b(@mr2 Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        } else if (this.f4065a != null) {
            return mo4946d(canonicalName, cls);
        } else {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: c */
    public void mo4945c(@mr2 au4 au4) {
        br3 br3 = this.f4066a;
        if (br3 != null) {
            LegacySavedStateHandleController.m4724a(au4, br3, this.f4065a);
        }
    }

    @mr2
    /* renamed from: d */
    public final <T extends au4> T mo4946d(@mr2 String str, @mr2 Class<T> cls) {
        SavedStateHandleController b = LegacySavedStateHandleController.m4725b(this.f4066a, this.f4065a, str, this.f4064a);
        T e = mo4947e(str, cls, b.mo4941i());
        e.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", b);
        return e;
    }

    @mr2
    /* renamed from: e */
    public abstract <T extends au4> T mo4947e(@mr2 String str, @mr2 Class<T> cls, @mr2 wq3 wq3);
}
