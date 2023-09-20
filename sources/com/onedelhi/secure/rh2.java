package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Message;

public final class rh2 {

    /* renamed from: a */
    public static boolean f19864a = true;

    /* renamed from: b */
    public static boolean f19865b = true;

    @sj3(22)
    /* renamed from: com.onedelhi.secure.rh2$a */
    public static class C3416a {
        @pn0
        /* renamed from: a */
        public static boolean m26757a(Message message) {
            return message.isAsynchronous();
        }

        @pn0
        /* renamed from: b */
        public static void m26758b(Message message, boolean z) {
            message.setAsynchronous(z);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static boolean m26755a(@mr2 Message message) {
        if (Build.VERSION.SDK_INT >= 22) {
            return C3416a.m26757a(message);
        }
        if (f19865b) {
            try {
                return C3416a.m26757a(message);
            } catch (NoSuchMethodError unused) {
                f19865b = false;
            }
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public static void m26756b(@mr2 Message message, boolean z) {
        if (Build.VERSION.SDK_INT >= 22) {
            C3416a.m26758b(message, z);
        } else if (f19864a) {
            try {
                C3416a.m26758b(message, z);
            } catch (NoSuchMethodError unused) {
                f19864a = false;
            }
        }
    }
}
