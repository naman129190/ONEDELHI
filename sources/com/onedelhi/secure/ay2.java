package com.onedelhi.secure;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class ay2 {

    /* renamed from: a */
    public static final int f9569a = -1;

    /* renamed from: b */
    public static final int f9570b = -2;

    /* renamed from: a */
    public final DataSetObservable f9571a = new DataSetObservable();

    /* renamed from: a */
    public DataSetObserver f9572a;

    @Deprecated
    /* renamed from: a */
    public void mo13315a(@mr2 View view, int i, @mr2 Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* renamed from: b */
    public void mo4836b(@mr2 ViewGroup viewGroup, int i, @mr2 Object obj) {
        mo13315a(viewGroup, i, obj);
    }

    @Deprecated
    /* renamed from: c */
    public void mo13316c(@mr2 View view) {
    }

    /* renamed from: d */
    public void mo4837d(@mr2 ViewGroup viewGroup) {
        mo13316c(viewGroup);
    }

    /* renamed from: e */
    public abstract int mo13317e();

    /* renamed from: f */
    public int mo13318f(@mr2 Object obj) {
        return -1;
    }

    @ts2
    /* renamed from: g */
    public CharSequence mo13319g(int i) {
        return null;
    }

    /* renamed from: h */
    public float mo13320h(int i) {
        return 1.0f;
    }

    @mr2
    @Deprecated
    /* renamed from: i */
    public Object mo13321i(@mr2 View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @mr2
    /* renamed from: j */
    public Object mo4838j(@mr2 ViewGroup viewGroup, int i) {
        return mo13321i(viewGroup, i);
    }

    /* renamed from: k */
    public abstract boolean mo4839k(@mr2 View view, @mr2 Object obj);

    /* renamed from: l */
    public void mo13322l() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f9572a;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f9571a.notifyChanged();
    }

    /* renamed from: m */
    public void mo13323m(@mr2 DataSetObserver dataSetObserver) {
        this.f9571a.registerObserver(dataSetObserver);
    }

    /* renamed from: n */
    public void mo4840n(@ts2 Parcelable parcelable, @ts2 ClassLoader classLoader) {
    }

    @ts2
    /* renamed from: o */
    public Parcelable mo4841o() {
        return null;
    }

    @Deprecated
    /* renamed from: p */
    public void mo13324p(@mr2 View view, int i, @mr2 Object obj) {
    }

    /* renamed from: q */
    public void mo4842q(@mr2 ViewGroup viewGroup, int i, @mr2 Object obj) {
        mo13324p(viewGroup, i, obj);
    }

    /* renamed from: r */
    public void mo13325r(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f9572a = dataSetObserver;
        }
    }

    @Deprecated
    /* renamed from: s */
    public void mo13326s(@mr2 View view) {
    }

    /* renamed from: t */
    public void mo4843t(@mr2 ViewGroup viewGroup) {
        mo13326s(viewGroup);
    }

    /* renamed from: u */
    public void mo13327u(@mr2 DataSetObserver dataSetObserver) {
        this.f9571a.unregisterObserver(dataSetObserver);
    }
}
