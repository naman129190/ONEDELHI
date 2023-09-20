package com.onedelhi.secure;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

public class cl3 {

    /* renamed from: a */
    public static Class<?> f10383a = null;

    /* renamed from: a */
    public static final String f10384a = "ResourcesFlusher";

    /* renamed from: a */
    public static Field f10385a;

    /* renamed from: a */
    public static boolean f10386a;

    /* renamed from: b */
    public static Field f10387b;

    /* renamed from: b */
    public static boolean f10388b;

    /* renamed from: c */
    public static Field f10389c;

    /* renamed from: c */
    public static boolean f10390c;

    /* renamed from: d */
    public static boolean f10391d;

    @sj3(16)
    /* renamed from: com.onedelhi.secure.cl3$a */
    public static class C1914a {
        @pn0
        /* renamed from: a */
        public static void m12606a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    /* renamed from: a */
    public static void m12601a(@mr2 Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m12604d(resources);
            } else if (i >= 23) {
                m12603c(resources);
            } else {
                m12602b(resources);
            }
        }
    }

    @sj3(21)
    /* renamed from: b */
    public static void m12602b(@mr2 Resources resources) {
        if (!f10386a) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f10385a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(f10384a, "Could not retrieve Resources#mDrawableCache field", e);
            }
            f10386a = true;
        }
        Field field = f10385a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(f10384a, "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    @sj3(23)
    /* renamed from: c */
    public static void m12603c(@mr2 Resources resources) {
        if (!f10386a) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f10385a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(f10384a, "Could not retrieve Resources#mDrawableCache field", e);
            }
            f10386a = true;
        }
        Object obj = null;
        Field field = f10385a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(f10384a, "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            m12605e(obj);
        }
    }

    @sj3(24)
    /* renamed from: d */
    public static void m12604d(@mr2 Resources resources) {
        Object obj;
        if (!f10391d) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f10389c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(f10384a, "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f10391d = true;
        }
        Field field = f10389c;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(f10384a, "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f10386a) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f10385a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e(f10384a, "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f10386a = true;
                }
                Field field2 = f10385a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e(f10384a, "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m12605e(obj2);
                }
            }
        }
    }

    @sj3(16)
    /* renamed from: e */
    public static void m12605e(@mr2 Object obj) {
        if (!f10388b) {
            try {
                f10383a = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e(f10384a, "Could not find ThemedResourceCache class", e);
            }
            f10388b = true;
        }
        Class<?> cls = f10383a;
        if (cls != null) {
            if (!f10390c) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f10387b = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e(f10384a, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f10390c = true;
            }
            Field field = f10387b;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e(f10384a, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
                if (longSparseArray != null) {
                    C1914a.m12606a(longSparseArray);
                }
            }
        }
    }
}
