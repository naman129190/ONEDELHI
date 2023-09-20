package com.onedelhi.secure;

import android.content.SharedPreferences;

@Deprecated
public final class ux3 {

    @Deprecated
    /* renamed from: com.onedelhi.secure.ux3$a */
    public static final class C3749a {

        /* renamed from: a */
        public static C3749a f21535a;

        /* renamed from: a */
        public final C3750a f21536a = new C3750a();

        /* renamed from: com.onedelhi.secure.ux3$a$a */
        public static class C3750a {
            /* renamed from: a */
            public void mo25778a(@mr2 SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        @Deprecated
        /* renamed from: b */
        public static C3749a m29679b() {
            if (f21535a == null) {
                f21535a = new C3749a();
            }
            return f21535a;
        }

        @Deprecated
        /* renamed from: a */
        public void mo25777a(@mr2 SharedPreferences.Editor editor) {
            this.f21536a.mo25778a(editor);
        }
    }
}
