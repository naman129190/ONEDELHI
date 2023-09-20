package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0248e;
import com.onedelhi.secure.ar4;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;

@hl3({hl3.C2354a.f13188c})
/* renamed from: androidx.appcompat.view.menu.m */
public class C0265m extends C0248e implements SubMenu {

    /* renamed from: a */
    public C0248e f1213a;

    /* renamed from: b */
    public C0253h f1214b;

    public C0265m(Context context, C0248e eVar, C0253h hVar) {
        super(context);
        this.f1213a = eVar;
        this.f1214b = hVar;
    }

    /* renamed from: G */
    public C0248e mo1290G() {
        return this.f1213a.mo1290G();
    }

    /* renamed from: I */
    public boolean mo1292I() {
        return this.f1213a.mo1292I();
    }

    /* renamed from: J */
    public boolean mo1293J() {
        return this.f1213a.mo1293J();
    }

    /* renamed from: K */
    public boolean mo1294K() {
        return this.f1213a.mo1294K();
    }

    /* renamed from: X */
    public void mo1307X(C0248e.C0249a aVar) {
        this.f1213a.mo1307X(aVar);
    }

    /* renamed from: g */
    public boolean mo1335g(C0253h hVar) {
        return this.f1213a.mo1335g(hVar);
    }

    public MenuItem getItem() {
        return this.f1214b;
    }

    /* renamed from: i */
    public boolean mo1341i(@mr2 C0248e eVar, @mr2 MenuItem menuItem) {
        return super.mo1341i(eVar, menuItem) || this.f1213a.mo1341i(eVar, menuItem);
    }

    /* renamed from: j0 */
    public void mo1345j0(boolean z) {
        this.f1213a.mo1345j0(z);
    }

    /* renamed from: n */
    public boolean mo1352n(C0253h hVar) {
        return this.f1213a.mo1352n(hVar);
    }

    /* renamed from: n0 */
    public Menu mo1494n0() {
        return this.f1213a;
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1213a.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo1322b0(i);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo1324c0(drawable);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo1331e0(i);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo1333f0(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo1336g0(view);
    }

    public SubMenu setIcon(int i) {
        this.f1214b.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1214b.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f1213a.setQwertyMode(z);
    }

    /* renamed from: w */
    public String mo1370w() {
        C0253h hVar = this.f1214b;
        int itemId = hVar != null ? hVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo1370w() + ar4.f25981a + itemId;
    }
}
