package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0248e;
import com.onedelhi.secure.af4;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.f13188c})
public final class ExpandedMenuView extends ListView implements C0248e.C0250b, C0260k, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public static final int[] f1009a = {16842964, 16843049};

    /* renamed from: a */
    public C0248e f1010a;

    /* renamed from: n */
    public int f1011n;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        af4 G = af4.m11110G(context, attributeSet, f1009a, i, 0);
        if (G.mo13026C(0)) {
            setBackgroundDrawable(G.mo13037h(0));
        }
        if (G.mo13026C(1)) {
            setDivider(G.mo13037h(1));
        }
        G.mo13029I();
    }

    /* renamed from: a */
    public boolean mo1197a(C0253h hVar) {
        return this.f1010a.mo1298O(hVar, 0);
    }

    /* renamed from: g */
    public void mo1198g(C0248e eVar) {
        this.f1010a = eVar;
    }

    public int getWindowAnimations() {
        return this.f1011n;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo1197a((C0253h) getAdapter().getItem(i));
    }
}
