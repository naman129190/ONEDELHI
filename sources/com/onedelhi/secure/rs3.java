package com.onedelhi.secure;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.ArrayList;
import java.util.List;

public class rs3 extends FragmentStateAdapter {

    /* renamed from: a */
    public List<Fragment> f20091a = new ArrayList();

    public rs3(@mr2 FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @mr2
    /* renamed from: L */
    public Fragment mo7219L(int i) {
        return this.f20091a.get(i);
    }

    /* renamed from: d0 */
    public void mo24070d0(Fragment fragment) {
        this.f20091a.add(fragment);
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f20091a.size();
    }
}
