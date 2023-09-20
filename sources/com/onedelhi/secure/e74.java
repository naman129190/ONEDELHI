package com.onedelhi.secure;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.delhitransport.onedelhi.activities.SettingsActivity;
import com.google.android.gms.common.C1410R;
import com.google.android.material.tabs.C4239b;
import com.google.android.material.tabs.TabLayout;

public class e74 extends Fragment {

    /* renamed from: a */
    public Context f11130a;

    /* renamed from: a */
    public ViewPager2 f11131a;

    /* renamed from: a */
    public TabLayout f11132a;

    /* renamed from: com.onedelhi.secure.e74$a */
    public class C2034a implements TabLayout.C4228f {
        public C2034a() {
        }

        /* renamed from: a */
        public void mo15067a(TabLayout.C4232i iVar) {
        }

        /* renamed from: b */
        public void mo15068b(TabLayout.C4232i iVar) {
        }

        /* renamed from: c */
        public void mo15069c(TabLayout.C4232i iVar) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m13600s(TabLayout.C4232i iVar, int i) {
        iVar.mo29085D(i == 0 ? pj0.m61166a(-116495705282375L) : getString(C1410R.string.my_complaints));
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m13601w(View view) {
        startActivity(new Intent(this.f11130a, SettingsActivity.class));
    }

    public void onActivityCreated(@ts2 Bundle bundle) {
        super.onActivityCreated(bundle);
        mo15066y(this.f11131a);
        new C4239b(this.f11132a, this.f11131a, new d74(this)).mo29112a();
        this.f11132a.mo28966c(new C2034a());
    }

    public void onAttach(@mr2 Context context) {
        super.onAttach(context);
        this.f11130a = context.getApplicationContext();
    }

    @ts2
    public View onCreateView(@mr2 LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle) {
        View inflate = layoutInflater.inflate(C1410R.layout.fragment_support, viewGroup, false);
        this.f11131a = (ViewPager2) inflate.findViewById(C1410R.C1412id.view_pager);
        this.f11132a = (TabLayout) inflate.findViewById(C1410R.C1412id.tab_layout);
        ((ImageView) inflate.findViewById(C1410R.C1412id.iv_settings)).setOnClickListener(new c74(this));
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
    }

    /* renamed from: y */
    public final void mo15066y(ViewPager2 viewPager2) {
        if (isAdded()) {
            rs3 rs3 = new rs3(getActivity());
            rs3.mo24070d0(new b74());
            rs3.mo24070d0(new b84());
            viewPager2.setAdapter(rs3);
        }
    }
}
