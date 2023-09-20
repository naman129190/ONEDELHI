package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0253h;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.za3;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@hl3({hl3.C2354a.f13188c})
public class h74 extends MenuInflater {

    /* renamed from: a */
    public static final int f12945a = 0;

    /* renamed from: a */
    public static final String f12946a = "SupportMenuInflater";

    /* renamed from: a */
    public static final Class<?>[] f12947a;

    /* renamed from: b */
    public static final String f12948b = "menu";

    /* renamed from: b */
    public static final Class<?>[] f12949b;

    /* renamed from: c */
    public static final String f12950c = "group";

    /* renamed from: d */
    public static final String f12951d = "item";

    /* renamed from: a */
    public Context f12952a;

    /* renamed from: a */
    public Object f12953a;

    /* renamed from: a */
    public final Object[] f12954a;

    /* renamed from: b */
    public final Object[] f12955b;

    /* renamed from: com.onedelhi.secure.h74$a */
    public static class C2316a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        public static final Class<?>[] f12956a = {MenuItem.class};

        /* renamed from: a */
        public Object f12957a;

        /* renamed from: a */
        public Method f12958a;

        public C2316a(Object obj, String str) {
            this.f12957a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f12958a = cls.getMethod(str, f12956a);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f12958a.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f12958a.invoke(this.f12957a, new Object[]{menuItem})).booleanValue();
                }
                this.f12958a.invoke(this.f12957a, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.h74$b */
    public class C2317b {

        /* renamed from: g */
        public static final boolean f12959g = false;

        /* renamed from: h */
        public static final boolean f12960h = true;

        /* renamed from: i */
        public static final boolean f12961i = true;

        /* renamed from: m */
        public static final int f12962m = 0;

        /* renamed from: n */
        public static final int f12963n = 0;

        /* renamed from: o */
        public static final int f12964o = 0;

        /* renamed from: p */
        public static final int f12965p = 0;

        /* renamed from: q */
        public static final int f12966q = 0;

        /* renamed from: a */
        public char f12967a;

        /* renamed from: a */
        public int f12968a;

        /* renamed from: a */
        public ColorStateList f12969a = null;

        /* renamed from: a */
        public PorterDuff.Mode f12970a = null;

        /* renamed from: a */
        public Menu f12971a;

        /* renamed from: a */
        public C3665u2 f12973a;

        /* renamed from: a */
        public CharSequence f12974a;

        /* renamed from: a */
        public String f12975a;

        /* renamed from: a */
        public boolean f12976a;

        /* renamed from: b */
        public char f12977b;

        /* renamed from: b */
        public int f12978b;

        /* renamed from: b */
        public CharSequence f12979b;

        /* renamed from: b */
        public String f12980b;

        /* renamed from: b */
        public boolean f12981b;

        /* renamed from: c */
        public int f12982c;

        /* renamed from: c */
        public CharSequence f12983c;

        /* renamed from: c */
        public String f12984c;

        /* renamed from: c */
        public boolean f12985c;

        /* renamed from: d */
        public int f12986d;

        /* renamed from: d */
        public CharSequence f12987d;

        /* renamed from: d */
        public boolean f12988d;

        /* renamed from: e */
        public int f12989e;

        /* renamed from: e */
        public boolean f12990e;

        /* renamed from: f */
        public int f12991f;

        /* renamed from: f */
        public boolean f12992f;

        /* renamed from: g */
        public int f12993g;

        /* renamed from: h */
        public int f12994h;

        /* renamed from: i */
        public int f12995i;

        /* renamed from: j */
        public int f12996j;

        /* renamed from: k */
        public int f12997k;

        /* renamed from: l */
        public int f12998l;

        public C2317b(Menu menu) {
            this.f12971a = menu;
            mo17143h();
        }

        /* renamed from: a */
        public void mo17136a() {
            this.f12985c = true;
            mo17144i(this.f12971a.add(this.f12968a, this.f12989e, this.f12991f, this.f12974a));
        }

        /* renamed from: b */
        public SubMenu mo17137b() {
            this.f12985c = true;
            SubMenu addSubMenu = this.f12971a.addSubMenu(this.f12968a, this.f12989e, this.f12991f, this.f12974a);
            mo17144i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: c */
        public final char mo17138c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: d */
        public boolean mo17139d() {
            return this.f12985c;
        }

        /* renamed from: e */
        public final <T> T mo17140e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, h74.this.f12952a.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w(h74.f12946a, "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: f */
        public void mo17141f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = h74.this.f12952a.obtainStyledAttributes(attributeSet, za3.C4068m.MenuGroup);
            this.f12968a = obtainStyledAttributes.getResourceId(za3.C4068m.MenuGroup_android_id, 0);
            this.f12978b = obtainStyledAttributes.getInt(za3.C4068m.MenuGroup_android_menuCategory, 0);
            this.f12982c = obtainStyledAttributes.getInt(za3.C4068m.MenuGroup_android_orderInCategory, 0);
            this.f12986d = obtainStyledAttributes.getInt(za3.C4068m.MenuGroup_android_checkableBehavior, 0);
            this.f12976a = obtainStyledAttributes.getBoolean(za3.C4068m.MenuGroup_android_visible, true);
            this.f12981b = obtainStyledAttributes.getBoolean(za3.C4068m.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void mo17142g(AttributeSet attributeSet) {
            af4 F = af4.m11109F(h74.this.f12952a, attributeSet, za3.C4068m.MenuItem);
            this.f12989e = F.mo13050u(za3.C4068m.MenuItem_android_id, 0);
            this.f12991f = (F.mo13044o(za3.C4068m.MenuItem_android_menuCategory, this.f12978b) & g74.f12468c) | (F.mo13044o(za3.C4068m.MenuItem_android_orderInCategory, this.f12982c) & 65535);
            this.f12974a = F.mo13053x(za3.C4068m.MenuItem_android_title);
            this.f12979b = F.mo13053x(za3.C4068m.MenuItem_android_titleCondensed);
            this.f12993g = F.mo13050u(za3.C4068m.MenuItem_android_icon, 0);
            this.f12967a = mo17138c(F.mo13052w(za3.C4068m.MenuItem_android_alphabeticShortcut));
            this.f12994h = F.mo13044o(za3.C4068m.MenuItem_alphabeticModifiers, 4096);
            this.f12977b = mo17138c(F.mo13052w(za3.C4068m.MenuItem_android_numericShortcut));
            this.f12995i = F.mo13044o(za3.C4068m.MenuItem_numericModifiers, 4096);
            int i = za3.C4068m.MenuItem_android_checkable;
            this.f12996j = F.mo13026C(i) ? F.mo13030a(i, false) : this.f12986d;
            this.f12988d = F.mo13030a(za3.C4068m.MenuItem_android_checked, false);
            this.f12990e = F.mo13030a(za3.C4068m.MenuItem_android_visible, this.f12976a);
            this.f12992f = F.mo13030a(za3.C4068m.MenuItem_android_enabled, this.f12981b);
            this.f12997k = F.mo13044o(za3.C4068m.MenuItem_showAsAction, -1);
            this.f12984c = F.mo13052w(za3.C4068m.MenuItem_android_onClick);
            this.f12998l = F.mo13050u(za3.C4068m.MenuItem_actionLayout, 0);
            this.f12975a = F.mo13052w(za3.C4068m.MenuItem_actionViewClass);
            String w = F.mo13052w(za3.C4068m.MenuItem_actionProviderClass);
            this.f12980b = w;
            boolean z = w != null;
            if (z && this.f12998l == 0 && this.f12975a == null) {
                this.f12973a = (C3665u2) mo17140e(w, h74.f12949b, h74.this.f12955b);
            } else {
                if (z) {
                    Log.w(h74.f12946a, "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f12973a = null;
            }
            this.f12983c = F.mo13053x(za3.C4068m.MenuItem_contentDescription);
            this.f12987d = F.mo13053x(za3.C4068m.MenuItem_tooltipText);
            int i2 = za3.C4068m.MenuItem_iconTintMode;
            if (F.mo13026C(i2)) {
                this.f12970a = jp0.m18734e(F.mo13044o(i2, -1), this.f12970a);
            } else {
                this.f12970a = null;
            }
            int i3 = za3.C4068m.MenuItem_iconTint;
            if (F.mo13026C(i3)) {
                this.f12969a = F.mo13033d(i3);
            } else {
                this.f12969a = null;
            }
            F.mo13029I();
            this.f12985c = false;
        }

        /* renamed from: h */
        public void mo17143h() {
            this.f12968a = 0;
            this.f12978b = 0;
            this.f12982c = 0;
            this.f12986d = 0;
            this.f12976a = true;
            this.f12981b = true;
        }

        /* renamed from: i */
        public final void mo17144i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f12988d).setVisible(this.f12990e).setEnabled(this.f12992f).setCheckable(this.f12996j >= 1).setTitleCondensed(this.f12979b).setIcon(this.f12993g);
            int i = this.f12997k;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f12984c != null) {
                if (!h74.this.f12952a.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C2316a(h74.this.mo17132b(), this.f12984c));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f12996j >= 2) {
                if (menuItem instanceof C0253h) {
                    ((C0253h) menuItem).mo1467y(true);
                } else if (menuItem instanceof gh2) {
                    ((gh2) menuItem).mo16610l(true);
                }
            }
            String str = this.f12975a;
            if (str != null) {
                menuItem.setActionView((View) mo17140e(str, h74.f12947a, h74.this.f12954a));
                z = true;
            }
            int i2 = this.f12998l;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w(h74.f12946a, "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C3665u2 u2Var = this.f12973a;
            if (u2Var != null) {
                eh2.m13769l(menuItem, u2Var);
            }
            eh2.m13773p(menuItem, this.f12983c);
            eh2.m13780w(menuItem, this.f12987d);
            eh2.m13772o(menuItem, this.f12967a, this.f12994h);
            eh2.m13776s(menuItem, this.f12977b, this.f12995i);
            PorterDuff.Mode mode = this.f12970a;
            if (mode != null) {
                eh2.m13775r(menuItem, mode);
            }
            ColorStateList colorStateList = this.f12969a;
            if (colorStateList != null) {
                eh2.m13774q(menuItem, colorStateList);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f12947a = r0
            f12949b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.h74.<clinit>():void");
    }

    public h74(Context context) {
        super(context);
        this.f12952a = context;
        Object[] objArr = {context};
        this.f12954a = objArr;
        this.f12955b = objArr;
    }

    /* renamed from: a */
    public final Object mo17131a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? mo17131a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: b */
    public Object mo17132b() {
        if (this.f12953a == null) {
            this.f12953a = mo17131a(this.f12952a);
        }
        return this.f12953a;
    }

    /* renamed from: c */
    public final void mo17133c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C2317b bVar = new C2317b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals(f12948b)) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.mo17143h();
                        } else if (name2.equals("item")) {
                            if (!bVar.mo17139d()) {
                                C3665u2 u2Var = bVar.f12973a;
                                if (u2Var == null || !u2Var.mo2533b()) {
                                    bVar.mo17136a();
                                } else {
                                    bVar.mo17137b();
                                }
                            }
                        } else if (name2.equals(f12948b)) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.mo17141f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.mo17142g(attributeSet);
                    } else if (name3.equals(f12948b)) {
                        mo17133c(xmlPullParser, attributeSet, bVar.mo17137b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(@s12 int i, Menu menu) {
        if (!(menu instanceof g74)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f12952a.getResources().getLayout(i);
            mo17133c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
