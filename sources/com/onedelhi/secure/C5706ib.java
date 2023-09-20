package com.onedelhi.secure;

import android.text.TextUtils;
import easypay.appinvoke.manager.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.onedelhi.secure.ib */
public class C5706ib {
    /* renamed from: a */
    public static void m51978a(String str, Object obj) {
        if (Constants.DEV_MODE) {
            obj.getClass();
            v82.m67791a(Constants.ASSIST_LOG_CONSTANT, obj + ar4.f25981a + str);
            try {
                if (TextUtils.isEmpty(str)) {
                    throw new c92();
                }
            } catch (Exception e) {
                e.printStackTrace(new PrintWriter(new StringWriter()));
            }
        }
    }
}
