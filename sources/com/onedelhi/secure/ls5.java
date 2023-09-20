package com.onedelhi.secure;

import dalvik.system.PathClassLoader;

public final class ls5 extends PathClassLoader {
    public ls5(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    public final Class loadClass(String str, boolean z) throws ClassNotFoundException {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
