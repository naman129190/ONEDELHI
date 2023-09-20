package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.h85;
import com.onedelhi.secure.ha4;
import com.onedelhi.secure.k85;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.w94;
import com.onedelhi.secure.wh1;
import com.onedelhi.secure.xh1;
import com.onedelhi.secure.zh1;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.signin.a */
public final class C1407a {
    @mr2
    /* renamed from: a */
    public static GoogleSignInAccount m8841a(@mr2 Context context, @mr2 xh1 xh1) {
        Preconditions.checkNotNull(context, "please provide a valid Context object");
        Preconditions.checkNotNull(xh1, "please provide valid GoogleSignInOptionsExtension");
        GoogleSignInAccount e = m8845e(context);
        if (e == null) {
            e = GoogleSignInAccount.m8787K2();
        }
        return e.mo9212X2(m8854n(xh1.mo26921b()));
    }

    @mr2
    /* renamed from: b */
    public static GoogleSignInAccount m8842b(@mr2 Context context, @mr2 Scope scope, @mr2 Scope... scopeArr) {
        Preconditions.checkNotNull(context, "please provide a valid Context object");
        Preconditions.checkNotNull(scope, "please provide at least one valid scope");
        GoogleSignInAccount e = m8845e(context);
        if (e == null) {
            e = GoogleSignInAccount.m8787K2();
        }
        e.mo9212X2(scope);
        e.mo9212X2(scopeArr);
        return e;
    }

    @mr2
    /* renamed from: c */
    public static wh1 m8843c(@mr2 Activity activity, @mr2 GoogleSignInOptions googleSignInOptions) {
        return new wh1(activity, (GoogleSignInOptions) Preconditions.checkNotNull(googleSignInOptions));
    }

    @mr2
    /* renamed from: d */
    public static wh1 m8844d(@mr2 Context context, @mr2 GoogleSignInOptions googleSignInOptions) {
        return new wh1(context, (GoogleSignInOptions) Preconditions.checkNotNull(googleSignInOptions));
    }

    @ts2
    /* renamed from: e */
    public static GoogleSignInAccount m8845e(@mr2 Context context) {
        return k85.m19555c(context).mo18956a();
    }

    @mr2
    /* renamed from: f */
    public static w94<GoogleSignInAccount> m8846f(@ts2 Intent intent) {
        zh1 d = h85.m16536d(intent);
        GoogleSignInAccount a = d.mo27987a();
        return (!d.getStatus().isSuccess() || a == null) ? ha4.m16571f(ApiExceptionUtil.fromStatus(d.getStatus())) : ha4.m16572g(a);
    }

    /* renamed from: g */
    public static boolean m8847g(@ts2 GoogleSignInAccount googleSignInAccount, @mr2 xh1 xh1) {
        Preconditions.checkNotNull(xh1, "Please provide a non-null GoogleSignInOptionsExtension");
        return m8848h(googleSignInAccount, m8854n(xh1.mo26921b()));
    }

    /* renamed from: h */
    public static boolean m8848h(@ts2 GoogleSignInAccount googleSignInAccount, @mr2 Scope... scopeArr) {
        if (googleSignInAccount == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, scopeArr);
        return googleSignInAccount.mo9205Q2().containsAll(hashSet);
    }

    /* renamed from: i */
    public static void m8849i(@mr2 Activity activity, int i, @ts2 GoogleSignInAccount googleSignInAccount, @mr2 xh1 xh1) {
        Preconditions.checkNotNull(activity, "Please provide a non-null Activity");
        Preconditions.checkNotNull(xh1, "Please provide a non-null GoogleSignInOptionsExtension");
        m8850j(activity, i, googleSignInAccount, m8854n(xh1.mo26921b()));
    }

    /* renamed from: j */
    public static void m8850j(@mr2 Activity activity, int i, @ts2 GoogleSignInAccount googleSignInAccount, @mr2 Scope... scopeArr) {
        Preconditions.checkNotNull(activity, "Please provide a non-null Activity");
        Preconditions.checkNotNull(scopeArr, "Please provide at least one scope");
        activity.startActivityForResult(m8853m(activity, googleSignInAccount, scopeArr), i);
    }

    /* renamed from: k */
    public static void m8851k(@mr2 Fragment fragment, int i, @ts2 GoogleSignInAccount googleSignInAccount, @mr2 xh1 xh1) {
        Preconditions.checkNotNull(fragment, "Please provide a non-null Fragment");
        Preconditions.checkNotNull(xh1, "Please provide a non-null GoogleSignInOptionsExtension");
        m8852l(fragment, i, googleSignInAccount, m8854n(xh1.mo26921b()));
    }

    /* renamed from: l */
    public static void m8852l(@mr2 Fragment fragment, int i, @ts2 GoogleSignInAccount googleSignInAccount, @mr2 Scope... scopeArr) {
        Preconditions.checkNotNull(fragment, "Please provide a non-null Fragment");
        Preconditions.checkNotNull(scopeArr, "Please provide at least one scope");
        fragment.startActivityForResult(m8853m(fragment.getActivity(), googleSignInAccount, scopeArr), i);
    }

    @mr2
    /* renamed from: m */
    public static Intent m8853m(@mr2 Activity activity, @ts2 GoogleSignInAccount googleSignInAccount, @mr2 Scope... scopeArr) {
        GoogleSignInOptions.C1406a aVar = new GoogleSignInOptions.C1406a();
        if (scopeArr.length > 0) {
            aVar.mo9238g(scopeArr[0], scopeArr);
        }
        if (googleSignInAccount != null && !TextUtils.isEmpty(googleSignInAccount.mo9202N2())) {
            aVar.mo9241j((String) Preconditions.checkNotNull(googleSignInAccount.mo9202N2()));
        }
        return new wh1(activity, aVar.mo9233b()).mo26534V();
    }

    @mr2
    /* renamed from: n */
    public static Scope[] m8854n(@ts2 List list) {
        return list == null ? new Scope[0] : (Scope[]) list.toArray(new Scope[list.size()]);
    }
}
