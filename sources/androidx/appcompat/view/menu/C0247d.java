package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.C0260k;
import com.onedelhi.secure.hl3;
import java.util.ArrayList;

@hl3({hl3.C2354a.f13188c})
/* renamed from: androidx.appcompat.view.menu.d */
public class C0247d extends BaseAdapter {

    /* renamed from: a */
    public final LayoutInflater f1094a;

    /* renamed from: a */
    public C0248e f1095a;

    /* renamed from: b */
    public boolean f1096b;

    /* renamed from: c */
    public final boolean f1097c;

    /* renamed from: n */
    public int f1098n = -1;

    /* renamed from: o */
    public final int f1099o;

    public C0247d(C0248e eVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1097c = z;
        this.f1094a = layoutInflater;
        this.f1095a = eVar;
        this.f1099o = i;
        mo1275a();
    }

    /* renamed from: a */
    public void mo1275a() {
        C0253h y = this.f1095a.mo1372y();
        if (y != null) {
            ArrayList<C0253h> C = this.f1095a.mo1287C();
            int size = C.size();
            for (int i = 0; i < size; i++) {
                if (C.get(i) == y) {
                    this.f1098n = i;
                    return;
                }
            }
        }
        this.f1098n = -1;
    }

    /* renamed from: b */
    public C0248e mo1276b() {
        return this.f1095a;
    }

    /* renamed from: c */
    public boolean mo1277c() {
        return this.f1096b;
    }

    /* renamed from: d */
    public C0253h getItem(int i) {
        ArrayList<C0253h> C = this.f1097c ? this.f1095a.mo1287C() : this.f1095a.mo1291H();
        int i2 = this.f1098n;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return C.get(i);
    }

    /* renamed from: e */
    public void mo1279e(boolean z) {
        this.f1096b = z;
    }

    public int getCount() {
        ArrayList<C0253h> C = this.f1097c ? this.f1095a.mo1287C() : this.f1095a.mo1291H();
        int i = this.f1098n;
        int size = C.size();
        return i < 0 ? size : size - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1094a.inflate(this.f1099o, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1095a.mo1292I() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        C0260k.C0261a aVar = (C0260k.C0261a) view;
        if (this.f1096b) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo1171b(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo1275a();
        super.notifyDataSetChanged();
    }
}
