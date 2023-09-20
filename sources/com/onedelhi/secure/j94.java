package com.onedelhi.secure;

import android.widget.TabHost;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY})
public class j94 {

    /* renamed from: com.onedelhi.secure.j94$a */
    public static class C2481a implements TabHost.OnTabChangeListener {

        /* renamed from: a */
        public final /* synthetic */ TabHost.OnTabChangeListener f14043a;

        /* renamed from: a */
        public final /* synthetic */ st1 f14044a;

        public C2481a(TabHost.OnTabChangeListener onTabChangeListener, st1 st1) {
            this.f14043a = onTabChangeListener;
            this.f14044a = st1;
        }

        public void onTabChanged(String str) {
            TabHost.OnTabChangeListener onTabChangeListener = this.f14043a;
            if (onTabChangeListener != null) {
                onTabChangeListener.onTabChanged(str);
            }
            this.f14044a.mo24536b();
        }
    }

    @rt1(attribute = "android:currentTab")
    /* renamed from: a */
    public static int m18215a(TabHost tabHost) {
        return tabHost.getCurrentTab();
    }

    @rt1(attribute = "android:currentTab")
    /* renamed from: b */
    public static String m18216b(TabHost tabHost) {
        return tabHost.getCurrentTabTag();
    }

    @C1717al({"android:currentTab"})
    /* renamed from: c */
    public static void m18217c(TabHost tabHost, int i) {
        if (tabHost.getCurrentTab() != i) {
            tabHost.setCurrentTab(i);
        }
    }

    @C1717al({"android:currentTab"})
    /* renamed from: d */
    public static void m18218d(TabHost tabHost, String str) {
        String currentTabTag = tabHost.getCurrentTabTag();
        if ((currentTabTag != null && !currentTabTag.equals(str)) || (currentTabTag == null && str != null)) {
            tabHost.setCurrentTabByTag(str);
        }
    }

    @C1717al(requireAll = false, value = {"android:onTabChanged", "android:currentTabAttrChanged"})
    /* renamed from: e */
    public static void m18219e(TabHost tabHost, TabHost.OnTabChangeListener onTabChangeListener, st1 st1) {
        if (st1 == null) {
            tabHost.setOnTabChangedListener(onTabChangeListener);
        } else {
            tabHost.setOnTabChangedListener(new C2481a(onTabChangeListener, st1));
        }
    }
}
