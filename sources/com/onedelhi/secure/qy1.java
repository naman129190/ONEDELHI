package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.onedelhi.secure.hl3;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class qy1 {

    /* renamed from: a */
    public static Field f19494a = null;

    /* renamed from: a */
    public static Method f19495a = null;

    /* renamed from: a */
    public static boolean f19496a = false;

    /* renamed from: b */
    public static boolean f19497b = false;

    /* renamed from: com.onedelhi.secure.qy1$a */
    public interface C3350a {
        /* renamed from: d0 */
        boolean mo3702d0(@mr2 KeyEvent keyEvent);
    }

    /* renamed from: a */
    public static boolean m26225a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f19496a) {
            try {
                f19495a = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f19496a = true;
        }
        Method method = f19495a;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, new Object[]{keyEvent});
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m26226b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m26225a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (jt4.m19031z(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    public static boolean m26227c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener f = m26230f(dialog);
        if (f != null && f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (jt4.m19031z(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: d */
    public static boolean m26228d(@mr2 View view, @mr2 KeyEvent keyEvent) {
        return jt4.m18843A(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: e */
    public static boolean m26229e(@mr2 C3350a aVar, @ts2 View view, @ts2 Window.Callback callback, @mr2 KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.mo3702d0(keyEvent) : callback instanceof Activity ? m26226b((Activity) callback, keyEvent) : callback instanceof Dialog ? m26227c((Dialog) callback, keyEvent) : (view != null && jt4.m19031z(view, keyEvent)) || aVar.mo3702d0(keyEvent);
    }

    /* renamed from: f */
    public static DialogInterface.OnKeyListener m26230f(Dialog dialog) {
        if (!f19497b) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f19494a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f19497b = true;
        }
        Field field = f19494a;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
