package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.ArrayList;

@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: a */
    public Context f3763a;

    /* renamed from: a */
    public FrameLayout f3764a;

    /* renamed from: a */
    public TabHost.OnTabChangeListener f3765a;

    /* renamed from: a */
    public FragmentManager f3766a;

    /* renamed from: a */
    public C0619c f3767a;

    /* renamed from: a */
    public final ArrayList<C0619c> f3768a = new ArrayList<>();

    /* renamed from: b */
    public boolean f3769b;

    /* renamed from: n */
    public int f3770n;

    /* renamed from: androidx.fragment.app.FragmentTabHost$a */
    public static class C0616a implements TabHost.TabContentFactory {

        /* renamed from: a */
        public final Context f3771a;

        public C0616a(Context context) {
            this.f3771a = context;
        }

        public View createTabContent(String str) {
            View view = new View(this.f3771a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$b */
    public static class C0617b extends View.BaseSavedState {
        public static final Parcelable.Creator<C0617b> CREATOR = new C0618a();

        /* renamed from: b */
        public String f3772b;

        /* renamed from: androidx.fragment.app.FragmentTabHost$b$a */
        public class C0618a implements Parcelable.Creator<C0617b> {
            /* renamed from: a */
            public C0617b createFromParcel(Parcel parcel) {
                return new C0617b(parcel);
            }

            /* renamed from: b */
            public C0617b[] newArray(int i) {
                return new C0617b[i];
            }
        }

        public C0617b(Parcel parcel) {
            super(parcel);
            this.f3772b = parcel.readString();
        }

        public C0617b(Parcelable parcelable) {
            super(parcelable);
        }

        @mr2
        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f3772b + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f3772b);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$c */
    public static final class C0619c {
        @ts2

        /* renamed from: a */
        public final Bundle f3773a;

        /* renamed from: a */
        public Fragment f3774a;
        @mr2

        /* renamed from: a */
        public final Class<?> f3775a;
        @mr2

        /* renamed from: a */
        public final String f3776a;

        public C0619c(@mr2 String str, @mr2 Class<?> cls, @ts2 Bundle bundle) {
            this.f3776a = str;
            this.f3775a = cls;
            this.f3773a = bundle;
        }
    }

    @Deprecated
    public FragmentTabHost(@mr2 Context context) {
        super(context, (AttributeSet) null);
        mo4691f(context, (AttributeSet) null);
    }

    @Deprecated
    public FragmentTabHost(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        super(context, attributeSet);
        mo4691f(context, attributeSet);
    }

    @Deprecated
    /* renamed from: a */
    public void mo4686a(@mr2 TabHost.TabSpec tabSpec, @mr2 Class<?> cls, @ts2 Bundle bundle) {
        tabSpec.setContent(new C0616a(this.f3763a));
        String tag = tabSpec.getTag();
        C0619c cVar = new C0619c(tag, cls, bundle);
        if (this.f3769b) {
            Fragment q0 = this.f3766a.mo4609q0(tag);
            cVar.f3774a = q0;
            if (q0 != null && !q0.isDetached()) {
                C0657l r = this.f3766a.mo4611r();
                r.mo4731v(cVar.f3774a);
                r.mo4726q();
            }
        }
        this.f3768a.add(cVar);
        addTab(tabSpec);
    }

    @ts2
    /* renamed from: b */
    public final C0657l mo4687b(@ts2 String str, @ts2 C0657l lVar) {
        Fragment fragment;
        C0619c e = mo4690e(str);
        if (this.f3767a != e) {
            if (lVar == null) {
                lVar = this.f3766a.mo4611r();
            }
            C0619c cVar = this.f3767a;
            if (!(cVar == null || (fragment = cVar.f3774a) == null)) {
                lVar.mo4731v(fragment);
            }
            if (e != null) {
                Fragment fragment2 = e.f3774a;
                if (fragment2 == null) {
                    Fragment a = this.f3766a.mo4510E0().mo4643a(this.f3763a.getClassLoader(), e.f3775a.getName());
                    e.f3774a = a;
                    a.setArguments(e.f3773a);
                    lVar.mo4861g(this.f3770n, e.f3774a, e.f3776a);
                } else {
                    lVar.mo4870p(fragment2);
                }
            }
            this.f3767a = e;
        }
        return lVar;
    }

    /* renamed from: c */
    public final void mo4688c() {
        if (this.f3764a == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f3770n);
            this.f3764a = frameLayout;
            if (frameLayout == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.f3770n);
            }
        }
    }

    /* renamed from: d */
    public final void mo4689d(Context context) {
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f3764a = frameLayout2;
            frameLayout2.setId(this.f3770n);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @ts2
    /* renamed from: e */
    public final C0619c mo4690e(String str) {
        int size = this.f3768a.size();
        for (int i = 0; i < size; i++) {
            C0619c cVar = this.f3768a.get(i);
            if (cVar.f3776a.equals(str)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void mo4691f(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f3770n = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f3768a.size();
        C0657l lVar = null;
        for (int i = 0; i < size; i++) {
            C0619c cVar = this.f3768a.get(i);
            Fragment q0 = this.f3766a.mo4609q0(cVar.f3776a);
            cVar.f3774a = q0;
            if (q0 != null && !q0.isDetached()) {
                if (cVar.f3776a.equals(currentTabTag)) {
                    this.f3767a = cVar;
                } else {
                    if (lVar == null) {
                        lVar = this.f3766a.mo4611r();
                    }
                    lVar.mo4731v(cVar.f3774a);
                }
            }
        }
        this.f3769b = true;
        C0657l b = mo4687b(currentTabTag, lVar);
        if (b != null) {
            b.mo4726q();
            this.f3766a.mo4595l0();
        }
    }

    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3769b = false;
    }

    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof C0617b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0617b bVar = (C0617b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCurrentTabByTag(bVar.f3772b);
    }

    @mr2
    @Deprecated
    public Parcelable onSaveInstanceState() {
        C0617b bVar = new C0617b(super.onSaveInstanceState());
        bVar.f3772b = getCurrentTabTag();
        return bVar;
    }

    @Deprecated
    public void onTabChanged(@ts2 String str) {
        C0657l b;
        if (this.f3769b && (b = mo4687b(str, (C0657l) null)) != null) {
            b.mo4726q();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f3765a;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Deprecated
    public void setOnTabChangedListener(@ts2 TabHost.OnTabChangeListener onTabChangeListener) {
        this.f3765a = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public void setup(@mr2 Context context, @mr2 FragmentManager fragmentManager) {
        mo4689d(context);
        super.setup();
        this.f3763a = context;
        this.f3766a = fragmentManager;
        mo4688c();
    }

    @Deprecated
    public void setup(@mr2 Context context, @mr2 FragmentManager fragmentManager, int i) {
        mo4689d(context);
        super.setup();
        this.f3763a = context;
        this.f3766a = fragmentManager;
        this.f3770n = i;
        mo4688c();
        this.f3764a.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }
}
