package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0260k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class NavigationMenuView extends RecyclerView implements C0260k {
    public NavigationMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    /* renamed from: g */
    public void mo1198g(C0248e eVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
