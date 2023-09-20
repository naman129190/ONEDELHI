package com.onedelhi.secure;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0689d;
import androidx.lifecycle.C0690e;
import androidx.lifecycle.C0695g;
import androidx.lifecycle.C0706k;
import androidx.lifecycle.C0709m;

public class jb1 implements C0689d, dr3, hu4 {

    /* renamed from: a */
    public final Fragment f14049a;

    /* renamed from: a */
    public C0695g f14050a = null;

    /* renamed from: a */
    public C0709m.C0713b f14051a;

    /* renamed from: a */
    public cr3 f14052a = null;

    /* renamed from: a */
    public final gu4 f14053a;

    public jb1(@mr2 Fragment fragment, @mr2 gu4 gu4) {
        this.f14049a = fragment;
        this.f14053a = gu4;
    }

    /* renamed from: a */
    public void mo18207a(@mr2 C0690e.C0692b bVar) {
        this.f14050a.mo4968j(bVar);
    }

    /* renamed from: b */
    public void mo18208b() {
        if (this.f14050a == null) {
            this.f14050a = new C0695g(this);
            this.f14052a = cr3.m12700a(this);
        }
    }

    /* renamed from: c */
    public boolean mo18209c() {
        return this.f14050a != null;
    }

    /* renamed from: d */
    public void mo18210d(@ts2 Bundle bundle) {
        this.f14052a.mo14342d(bundle);
    }

    /* renamed from: e */
    public void mo18211e(@mr2 Bundle bundle) {
        this.f14052a.mo14343e(bundle);
    }

    /* renamed from: f */
    public void mo18212f(@mr2 C0690e.C0693c cVar) {
        this.f14050a.mo4974q(cVar);
    }

    @mr2
    public C0709m.C0713b getDefaultViewModelProviderFactory() {
        C0709m.C0713b defaultViewModelProviderFactory = this.f14049a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f14049a.mDefaultFactory)) {
            this.f14051a = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f14051a == null) {
            Application application = null;
            Context context = this.f14049a.requireContext().getApplicationContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof Application) {
                    application = (Application) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            this.f14051a = new C0706k(application, this, this.f14049a.getArguments());
        }
        return this.f14051a;
    }

    @mr2
    public C0690e getLifecycle() {
        mo18208b();
        return this.f14050a;
    }

    @mr2
    public br3 getSavedStateRegistry() {
        mo18208b();
        return this.f14052a.mo14340b();
    }

    @mr2
    public gu4 getViewModelStore() {
        mo18208b();
        return this.f14053a;
    }

    /* renamed from: z */
    public /* synthetic */ jb0 mo668z() {
        return kk1.m19873a(this);
    }
}
