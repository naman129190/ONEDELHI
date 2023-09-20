package com.onedelhi.secure;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class mh2 extends C3067oj implements Menu {

    /* renamed from: a */
    public final g74 f16096a;

    public mh2(Context context, g74 g74) {
        super(context);
        if (g74 != null) {
            this.f16096a = g74;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(int i) {
        return mo21954g(this.f16096a.add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo21954g(this.f16096a.add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo21954g(this.f16096a.add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return mo21954g(this.f16096a.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f16096a.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo21954g(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return mo21955h(this.f16096a.addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo21955h(this.f16096a.addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo21955h(this.f16096a.addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo21955h(this.f16096a.addSubMenu(charSequence));
    }

    public void clear() {
        mo21956i();
        this.f16096a.clear();
    }

    public void close() {
        this.f16096a.close();
    }

    public MenuItem findItem(int i) {
        return mo21954g(this.f16096a.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo21954g(this.f16096a.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f16096a.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f16096a.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f16096a.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f16096a.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo21957j(i);
        this.f16096a.removeGroup(i);
    }

    public void removeItem(int i) {
        mo21958k(i);
        this.f16096a.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f16096a.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f16096a.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f16096a.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f16096a.setQwertyMode(z);
    }

    public int size() {
        return this.f16096a.size();
    }
}
