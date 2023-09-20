package com.onedelhi.secure;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import easypay.appinvoke.manager.Constants;
import java.util.List;

public class xr0 {
    /* renamed from: a */
    public static String m70756a(Context context, String str, String str2, String str3) {
        p43 p43;
        try {
            String string = context.getSharedPreferences(Constants.EASYPAY_NEW_PREFERENCE_FILE, 0).getString(Constants.EASY_PAY_CONFIG_BANK_LIST_KEY, "");
            fj1 fj1 = new fj1();
            if (TextUtils.isEmpty(string) || (p43 = (p43) fj1.mo36012n(string, p43.class)) == null) {
                return "";
            }
            for (int i = 0; i < p43.mo42362a().size(); i++) {
                C5235fb fbVar = p43.mo42362a().get(i);
                if ((str + str2 + str3).equals(fbVar.toString())) {
                    return fbVar.mo35828d();
                }
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
            return "";
        }
    }

    /* renamed from: b */
    public static void m70757b(Context context, String str, String str2) {
        p43 p43;
        SharedPreferences.Editor edit;
        p43 p432;
        List<C5235fb> a;
        C5235fb a2;
        Class cls = p43.class;
        int i = 0;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.EASYPAY_NEW_PREFERENCE_FILE, 0);
            String string = sharedPreferences.getString(Constants.EASY_PAY_CONFIG_BANK_LIST_KEY, "");
            fj1 fj1 = new fj1();
            if (!TextUtils.isEmpty(str)) {
                ro2 ro2 = (ro2) fj1.mo36012n(str, ro2.class);
                if (ro2 != null && ro2.mo43965b() != null && !TextUtils.isEmpty(ro2.mo43966c()) && ro2.mo43965b().intValue() != 403) {
                    if (!ro2.mo43966c().contains("Bank name is not supported")) {
                        if (ro2.mo43964a() != null) {
                            ro2.mo43964a().mo35835j(str2);
                        }
                        if (TextUtils.isEmpty(string)) {
                            p432 = new p43();
                            a = p432.mo42362a();
                            a2 = ro2.mo43964a();
                        } else {
                            p432 = (p43) fj1.mo36012n(string, cls);
                            if (p432 != null) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= p432.mo42362a().size()) {
                                        i2 = -1;
                                        break;
                                    }
                                    if (ro2.mo43964a().equals(p432.mo42362a().get(i2))) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (i2 != -1) {
                                    p432.mo42362a().set(i2, ro2.mo43964a());
                                } else if (p432.mo42362a().size() < 5) {
                                    a = p432.mo42362a();
                                    a2 = ro2.mo43964a();
                                } else {
                                    p432.mo42362a().remove(p432.mo42362a().size() - 1);
                                    p432.mo42362a().add(0, ro2.mo43964a());
                                }
                            }
                            edit = sharedPreferences.edit();
                            edit.putString(Constants.EASY_PAY_CONFIG_BANK_LIST_KEY, new fj1().mo36024z(p432));
                            edit.putString(Constants.EASY_PAY_CONFIG_PREF_KEY, new fj1().mo36024z(ro2.mo43964a()));
                        }
                        a.add(a2);
                        edit = sharedPreferences.edit();
                        edit.putString(Constants.EASY_PAY_CONFIG_BANK_LIST_KEY, new fj1().mo36024z(p432));
                        edit.putString(Constants.EASY_PAY_CONFIG_PREF_KEY, new fj1().mo36024z(ro2.mo43964a()));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (!TextUtils.isEmpty(string) && (p43 = (p43) fj1.mo36012n(string, cls)) != null) {
                while (i < p43.mo42362a().size()) {
                    C5235fb fbVar = p43.mo42362a().get(i);
                    if (fbVar.mo35828d().equals(str2)) {
                        edit = sharedPreferences.edit();
                        edit.putString(Constants.EASY_PAY_CONFIG_PREF_KEY, new fj1().mo36024z(fbVar));
                    } else {
                        i++;
                    }
                }
                return;
            } else {
                return;
            }
            edit.apply();
        } catch (Exception e) {
            e.printStackTrace();
            C5706ib.m51978a("EXCEPTION", e);
        }
    }
}
