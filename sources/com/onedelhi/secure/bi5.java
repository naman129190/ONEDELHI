package com.onedelhi.secure;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class bi5 extends hd6 {

    /* renamed from: a */
    public long f9837a;

    /* renamed from: a */
    public AccountManager f9838a;

    /* renamed from: a */
    public Boolean f9839a;

    /* renamed from: a */
    public String f9840a;

    /* renamed from: b */
    public long f9841b;

    public bi5(za6 za6) {
        super(za6);
    }

    /* renamed from: j */
    public final boolean mo12724j() {
        Calendar instance = Calendar.getInstance();
        this.f9837a = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f9840a = lowerCase + "-" + lowerCase2;
        return false;
    }

    @ly4
    /* renamed from: o */
    public final long mo13729o() {
        mo15139h();
        return this.f9841b;
    }

    /* renamed from: p */
    public final long mo13730p() {
        mo17201k();
        return this.f9837a;
    }

    /* renamed from: q */
    public final String mo13731q() {
        mo17201k();
        return this.f9840a;
    }

    @ly4
    /* renamed from: r */
    public final void mo13732r() {
        mo15139h();
        this.f9839a = null;
        this.f9841b = 0;
    }

    @ly4
    /* renamed from: s */
    public final boolean mo13733s() {
        mo15139h();
        long currentTimeMillis = this.f11205a.mo15133a().currentTimeMillis();
        if (currentTimeMillis - this.f9841b > pr3.f18684a) {
            this.f9839a = null;
        }
        Boolean bool = this.f9839a;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (r70.m26348a(this.f11205a.mo15137f(), "android.permission.GET_ACCOUNTS") != 0) {
            this.f11205a.mo15136e().mo12733y().mo25379a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f9838a == null) {
                this.f9838a = AccountManager.get(this.f11205a.mo15137f());
            }
            try {
                Account[] result = this.f9838a.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result == null || result.length <= 0) {
                    Account[] result2 = this.f9838a.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                    if (result2 != null && result2.length > 0) {
                        this.f9839a = Boolean.TRUE;
                        this.f9841b = currentTimeMillis;
                        return true;
                    }
                } else {
                    this.f9839a = Boolean.TRUE;
                    this.f9841b = currentTimeMillis;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                this.f11205a.mo15136e().mo12728t().mo25380b("Exception checking account types", e);
            }
        }
        this.f9841b = currentTimeMillis;
        this.f9839a = Boolean.FALSE;
        return false;
    }
}
