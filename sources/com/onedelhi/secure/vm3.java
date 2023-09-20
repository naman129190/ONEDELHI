package com.onedelhi.secure;

import android.content.Context;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.ym3;

public class vm3 {

    /* renamed from: a */
    public static final String f21887a = "ROOM";

    /* renamed from: b */
    public static final String f21888b = "room_master_table";

    /* renamed from: c */
    public static final String f21889c = "_CursorConverter";

    @mr2
    /* renamed from: a */
    public static <T extends ym3> ym3.C4011a<T> m30227a(@mr2 Context context, @mr2 Class<T> cls, @mr2 String str) {
        if (str != null && str.trim().length() != 0) {
            return new ym3.C4011a<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    @mr2
    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: b */
    public static <T, C> T m30228b(@mr2 Class<C> cls, @mr2 String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str3 = canonicalName.replace('.', '_') + str;
        try {
            if (name.isEmpty()) {
                str2 = str3;
            } else {
                str2 = name + "." + str3;
            }
            return Class.forName(str2, true, cls.getClassLoader()).newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }

    @mr2
    /* renamed from: c */
    public static <T extends ym3> ym3.C4011a<T> m30229c(@mr2 Context context, @mr2 Class<T> cls) {
        return new ym3.C4011a<>(context, cls, (String) null);
    }
}
