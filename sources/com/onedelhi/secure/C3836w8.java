package com.onedelhi.secure;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.core.app.CoreComponentFactory;
import java.lang.reflect.InvocationTargetException;

@sj3(28)
/* renamed from: com.onedelhi.secure.w8 */
public class C3836w8 extends AppComponentFactory {
    @mr2
    /* renamed from: a */
    public Activity mo26454a(@mr2 ClassLoader classLoader, @mr2 String str, @ts2 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Activity) Class.forName(str, false, classLoader).asSubclass(Activity.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @mr2
    /* renamed from: b */
    public Application mo26455b(@mr2 ClassLoader classLoader, @mr2 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Application) Class.forName(str, false, classLoader).asSubclass(Application.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @mr2
    /* renamed from: c */
    public ContentProvider mo26456c(@mr2 ClassLoader classLoader, @mr2 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (ContentProvider) Class.forName(str, false, classLoader).asSubclass(ContentProvider.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @mr2
    /* renamed from: d */
    public BroadcastReceiver mo26457d(@mr2 ClassLoader classLoader, @mr2 String str, @ts2 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (BroadcastReceiver) Class.forName(str, false, classLoader).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @mr2
    /* renamed from: e */
    public Service mo26458e(@mr2 ClassLoader classLoader, @mr2 String str, @ts2 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Service) Class.forName(str, false, classLoader).asSubclass(Service.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @mr2
    public final Activity instantiateActivity(@mr2 ClassLoader classLoader, @mr2 String str, @ts2 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) CoreComponentFactory.m3563a(mo26454a(classLoader, str, intent));
    }

    @mr2
    public final Application instantiateApplication(@mr2 ClassLoader classLoader, @mr2 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) CoreComponentFactory.m3563a(mo26455b(classLoader, str));
    }

    @mr2
    public final ContentProvider instantiateProvider(@mr2 ClassLoader classLoader, @mr2 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) CoreComponentFactory.m3563a(mo26456c(classLoader, str));
    }

    @mr2
    public final BroadcastReceiver instantiateReceiver(@mr2 ClassLoader classLoader, @mr2 String str, @ts2 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) CoreComponentFactory.m3563a(mo26457d(classLoader, str, intent));
    }

    @mr2
    public final Service instantiateService(@mr2 ClassLoader classLoader, @mr2 String str, @ts2 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) CoreComponentFactory.m3563a(mo26458e(classLoader, str, intent));
    }
}
