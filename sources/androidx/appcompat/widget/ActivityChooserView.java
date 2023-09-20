package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.C0358b;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C3665u2;
import com.onedelhi.secure.af4;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.la1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.my3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.za3;

@hl3({hl3.C2354a.f13188c})
public class ActivityChooserView extends ViewGroup implements C0358b.C0359a {

    /* renamed from: a */
    public final DataSetObserver f1298a;

    /* renamed from: a */
    public final Drawable f1299a;

    /* renamed from: a */
    public final View f1300a;

    /* renamed from: a */
    public final ViewTreeObserver.OnGlobalLayoutListener f1301a;

    /* renamed from: a */
    public final FrameLayout f1302a;

    /* renamed from: a */
    public final ImageView f1303a;

    /* renamed from: a */
    public PopupWindow.OnDismissListener f1304a;

    /* renamed from: a */
    public final C0281f f1305a;

    /* renamed from: a */
    public final C0282g f1306a;

    /* renamed from: a */
    public ListPopupWindow f1307a;

    /* renamed from: a */
    public C3665u2 f1308a;

    /* renamed from: b */
    public final FrameLayout f1309b;

    /* renamed from: b */
    public final ImageView f1310b;

    /* renamed from: b */
    public boolean f1311b;

    /* renamed from: c */
    public boolean f1312c;

    /* renamed from: n */
    public final int f1313n;

    /* renamed from: o */
    public int f1314o;

    /* renamed from: p */
    public int f1315p;

    @hl3({hl3.C2354a.f13188c})
    public static class InnerLayout extends LinearLayout {

        /* renamed from: a */
        public static final int[] f1316a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            af4 F = af4.m11109F(context, attributeSet, f1316a);
            setBackgroundDrawable(F.mo13037h(0));
            F.mo13029I();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    public class C0276a extends DataSetObserver {
        public C0276a() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f1305a.notifyDataSetChanged();
        }

        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f1305a.notifyDataSetInvalidated();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    public class C0277b implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0277b() {
        }

        public void onGlobalLayout() {
            if (!ActivityChooserView.this.mo1666b()) {
                return;
            }
            if (!ActivityChooserView.this.isShown()) {
                ActivityChooserView.this.getListPopupWindow().dismiss();
                return;
            }
            ActivityChooserView.this.getListPopupWindow().mo1237a();
            C3665u2 u2Var = ActivityChooserView.this.f1308a;
            if (u2Var != null) {
                u2Var.mo25370m(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$c */
    public class C0278c extends View.AccessibilityDelegate {
        public C0278c() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            C1638a2.m10547X1(accessibilityNodeInfo).mo12539T0(true);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$d */
    public class C0279d extends la1 {
        public C0279d(View view) {
            super(view);
        }

        /* renamed from: b */
        public my3 mo1194b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        /* renamed from: c */
        public boolean mo1195c() {
            ActivityChooserView.this.mo1667c();
            return true;
        }

        /* renamed from: d */
        public boolean mo1687d() {
            ActivityChooserView.this.mo1665a();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$e */
    public class C0280e extends DataSetObserver {
        public C0280e() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.mo1669e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$f */
    public class C0281f extends BaseAdapter {

        /* renamed from: o */
        public static final int f1322o = Integer.MAX_VALUE;

        /* renamed from: p */
        public static final int f1323p = 4;

        /* renamed from: q */
        public static final int f1324q = 0;

        /* renamed from: r */
        public static final int f1325r = 1;

        /* renamed from: s */
        public static final int f1326s = 3;

        /* renamed from: a */
        public C0358b f1328a;

        /* renamed from: b */
        public boolean f1329b;

        /* renamed from: c */
        public boolean f1330c;

        /* renamed from: d */
        public boolean f1331d;

        /* renamed from: n */
        public int f1332n = 4;

        public C0281f() {
        }

        /* renamed from: a */
        public int mo1689a() {
            return this.f1328a.mo2504f();
        }

        /* renamed from: b */
        public C0358b mo1690b() {
            return this.f1328a;
        }

        /* renamed from: c */
        public ResolveInfo mo1691c() {
            return this.f1328a.mo2506h();
        }

        /* renamed from: d */
        public int mo1692d() {
            return this.f1328a.mo2508j();
        }

        /* renamed from: e */
        public boolean mo1693e() {
            return this.f1329b;
        }

        /* renamed from: f */
        public int mo1694f() {
            int i = this.f1332n;
            this.f1332n = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, (ViewGroup) null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.f1332n = i;
            return i2;
        }

        /* renamed from: g */
        public void mo1695g(C0358b bVar) {
            C0358b b = ActivityChooserView.this.f1305a.mo1690b();
            if (b != null && ActivityChooserView.this.isShown()) {
                b.unregisterObserver(ActivityChooserView.this.f1298a);
            }
            this.f1328a = bVar;
            if (bVar != null && ActivityChooserView.this.isShown()) {
                bVar.registerObserver(ActivityChooserView.this.f1298a);
            }
            notifyDataSetChanged();
        }

        public int getCount() {
            int f = this.f1328a.mo2504f();
            if (!this.f1329b && this.f1328a.mo2506h() != null) {
                f--;
            }
            int min = Math.min(f, this.f1332n);
            return this.f1331d ? min + 1 : min;
        }

        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (!this.f1329b && this.f1328a.mo2506h() != null) {
                    i++;
                }
                return this.f1328a.mo2503e(i);
            } else if (itemViewType == 1) {
                return null;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return (!this.f1331d || i != getCount() - 1) ? 0 : 1;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (view == null || view.getId() != za3.C4062g.list_item) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(za3.C4065j.abc_activity_chooser_view_list_item, viewGroup, false);
                }
                PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(za3.C4062g.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(za3.C4062g.title)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.f1329b || i != 0 || !this.f1330c) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType != 1) {
                throw new IllegalArgumentException();
            } else if (view != null && view.getId() == 1) {
                return view;
            } else {
                View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(za3.C4065j.abc_activity_chooser_view_list_item, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(za3.C4062g.title)).setText(ActivityChooserView.this.getContext().getString(za3.C4066k.abc_activity_chooser_view_see_all));
                return inflate;
            }
        }

        public int getViewTypeCount() {
            return 3;
        }

        /* renamed from: h */
        public void mo1702h(int i) {
            if (this.f1332n != i) {
                this.f1332n = i;
                notifyDataSetChanged();
            }
        }

        /* renamed from: i */
        public void mo1703i(boolean z, boolean z2) {
            if (this.f1329b != z || this.f1330c != z2) {
                this.f1329b = z;
                this.f1330c = z2;
                notifyDataSetChanged();
            }
        }

        /* renamed from: j */
        public void mo1704j(boolean z) {
            if (this.f1331d != z) {
                this.f1331d = z;
                notifyDataSetChanged();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$g */
    public class C0282g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public C0282g() {
        }

        /* renamed from: a */
        public final void mo1705a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f1304a;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f1309b) {
                activityChooserView.mo1665a();
                Intent b = ActivityChooserView.this.f1305a.mo1690b().mo2501b(ActivityChooserView.this.f1305a.mo1690b().mo2505g(ActivityChooserView.this.f1305a.mo1691c()));
                if (b != null) {
                    b.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(b);
                }
            } else if (view == activityChooserView.f1302a) {
                activityChooserView.f1311b = false;
                activityChooserView.mo1668d(activityChooserView.f1314o);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            mo1705a();
            C3665u2 u2Var = ActivityChooserView.this.f1308a;
            if (u2Var != null) {
                u2Var.mo25370m(false);
            }
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((C0281f) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType == 0) {
                ActivityChooserView.this.mo1665a();
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (!activityChooserView.f1311b) {
                    if (!activityChooserView.f1305a.mo1693e()) {
                        i++;
                    }
                    Intent b = ActivityChooserView.this.f1305a.mo1690b().mo2501b(i);
                    if (b != null) {
                        b.addFlags(524288);
                        ActivityChooserView.this.getContext().startActivity(b);
                    }
                } else if (i > 0) {
                    activityChooserView.f1305a.mo1690b().mo2516r(i);
                }
            } else if (itemViewType == 1) {
                ActivityChooserView.this.mo1668d(Integer.MAX_VALUE);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f1309b) {
                if (activityChooserView.f1305a.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.f1311b = true;
                    activityChooserView2.mo1668d(activityChooserView2.f1314o);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public ActivityChooserView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1298a = new C0276a();
        this.f1301a = new C0277b();
        this.f1314o = 4;
        int[] iArr = za3.C4068m.ActivityChooserView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        jt4.m19033z1(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        this.f1314o = obtainStyledAttributes.getInt(za3.C4068m.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(za3.C4068m.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(za3.C4065j.abc_activity_chooser_view, this, true);
        C0282g gVar = new C0282g();
        this.f1306a = gVar;
        View findViewById = findViewById(za3.C4062g.activity_chooser_view_content);
        this.f1300a = findViewById;
        this.f1299a = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(za3.C4062g.default_activity_button);
        this.f1309b = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        int i2 = za3.C4062g.image;
        this.f1310b = (ImageView) frameLayout.findViewById(i2);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(za3.C4062g.expand_activities_button);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new C0278c());
        frameLayout2.setOnTouchListener(new C0279d(frameLayout2));
        this.f1302a = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i2);
        this.f1303a = imageView;
        imageView.setImageDrawable(drawable);
        C0281f fVar = new C0281f();
        this.f1305a = fVar;
        fVar.registerDataSetObserver(new C0280e());
        Resources resources = context.getResources();
        this.f1313n = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(za3.C4060e.abc_config_prefDialogWidth));
    }

    /* renamed from: a */
    public boolean mo1665a() {
        if (!mo1666b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f1301a);
        return true;
    }

    /* renamed from: b */
    public boolean mo1666b() {
        return getListPopupWindow().mo1238c();
    }

    /* renamed from: c */
    public boolean mo1667c() {
        if (mo1666b() || !this.f1312c) {
            return false;
        }
        this.f1311b = false;
        mo1668d(this.f1314o);
        return true;
    }

    /* renamed from: d */
    public void mo1668d(int i) {
        C0281f fVar;
        if (this.f1305a.mo1690b() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f1301a);
            boolean z = this.f1309b.getVisibility() == 0;
            int a = this.f1305a.mo1689a();
            if (i == Integer.MAX_VALUE || a <= i + (z ? 1 : 0)) {
                this.f1305a.mo1704j(false);
                fVar = this.f1305a;
            } else {
                this.f1305a.mo1704j(true);
                fVar = this.f1305a;
                i--;
            }
            fVar.mo1702h(i);
            ListPopupWindow listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.mo1238c()) {
                if (this.f1311b || !z) {
                    this.f1305a.mo1703i(true, z);
                } else {
                    this.f1305a.mo1703i(false, false);
                }
                listPopupWindow.mo2040U(Math.min(this.f1305a.mo1694f(), this.f1313n));
                listPopupWindow.mo1237a();
                C3665u2 u2Var = this.f1308a;
                if (u2Var != null) {
                    u2Var.mo25370m(true);
                }
                listPopupWindow.mo1241l().setContentDescription(getContext().getString(za3.C4066k.abc_activitychooserview_choose_application));
                listPopupWindow.mo1241l().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* renamed from: e */
    public void mo1669e() {
        Drawable drawable;
        View view;
        if (this.f1305a.getCount() > 0) {
            this.f1302a.setEnabled(true);
        } else {
            this.f1302a.setEnabled(false);
        }
        int a = this.f1305a.mo1689a();
        int d = this.f1305a.mo1692d();
        if (a == 1 || (a > 1 && d > 0)) {
            this.f1309b.setVisibility(0);
            ResolveInfo c = this.f1305a.mo1691c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f1310b.setImageDrawable(c.loadIcon(packageManager));
            if (this.f1315p != 0) {
                CharSequence loadLabel = c.loadLabel(packageManager);
                this.f1309b.setContentDescription(getContext().getString(this.f1315p, new Object[]{loadLabel}));
            }
        } else {
            this.f1309b.setVisibility(8);
        }
        if (this.f1309b.getVisibility() == 0) {
            view = this.f1300a;
            drawable = this.f1299a;
        } else {
            view = this.f1300a;
            drawable = null;
        }
        view.setBackgroundDrawable(drawable);
    }

    @hl3({hl3.C2354a.f13185a})
    public C0358b getDataModel() {
        return this.f1305a.mo1690b();
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.f1307a == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f1307a = listPopupWindow;
            listPopupWindow.mo1884e(this.f1305a);
            this.f1307a.mo2038S(this);
            this.f1307a.mo2051d0(true);
            this.f1307a.mo2053f0(this.f1306a);
            this.f1307a.mo2052e0(this.f1306a);
        }
        return this.f1307a;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0358b b = this.f1305a.mo1690b();
        if (b != null) {
            b.registerObserver(this.f1298a);
        }
        this.f1312c = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0358b b = this.f1305a.mo1690b();
        if (b != null) {
            b.unregisterObserver(this.f1298a);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1301a);
        }
        if (mo1666b()) {
            mo1665a();
        }
        this.f1312c = false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1300a.layout(0, 0, i3 - i, i4 - i2);
        if (!mo1666b()) {
            mo1665a();
        }
    }

    public void onMeasure(int i, int i2) {
        View view = this.f1300a;
        if (this.f1309b.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @hl3({hl3.C2354a.f13185a})
    public void setActivityChooserModel(C0358b bVar) {
        this.f1305a.mo1695g(bVar);
        if (mo1666b()) {
            mo1665a();
            mo1667c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f1315p = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f1303a.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f1303a.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f1314o = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f1304a = onDismissListener;
    }

    @hl3({hl3.C2354a.f13188c})
    public void setProvider(C3665u2 u2Var) {
        this.f1308a = u2Var;
    }
}
