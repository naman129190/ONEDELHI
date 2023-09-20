package com.onedelhi.secure;

public class i51 extends f13 {

    /* renamed from: a */
    public static final C7012v5 f30078a = C7012v5.m67717e();

    /* renamed from: a */
    public final C5978l9 f30079a;

    public i51(C5978l9 l9Var) {
        this.f30079a = l9Var;
    }

    /* renamed from: c */
    public boolean mo35708c() {
        if (mo37856g()) {
            return true;
        }
        f30078a.mo46010l("ApplicationInfo is invalid");
        return false;
    }

    /* renamed from: g */
    public final boolean mo37856g() {
        C7012v5 v5Var;
        String str;
        C5978l9 l9Var = this.f30079a;
        if (l9Var == null) {
            v5Var = f30078a;
            str = "ApplicationInfo is null";
        } else if (!l9Var.mo39716Ai()) {
            v5Var = f30078a;
            str = "GoogleAppId is null";
        } else if (!this.f30079a.mo39719L5()) {
            v5Var = f30078a;
            str = "AppInstanceId is null";
        } else if (!this.f30079a.mo39718Eg()) {
            v5Var = f30078a;
            str = "ApplicationProcessState is null";
        } else if (!this.f30079a.mo39741x9()) {
            return true;
        } else {
            if (!this.f30079a.mo39721Ob().mo41519Cc()) {
                v5Var = f30078a;
                str = "AndroidAppInfo.packageName is null";
            } else if (this.f30079a.mo39721Ob().mo41528T6()) {
                return true;
            } else {
                v5Var = f30078a;
                str = "AndroidAppInfo.sdkVersion is null";
            }
        }
        v5Var.mo46010l(str);
        return false;
    }
}
