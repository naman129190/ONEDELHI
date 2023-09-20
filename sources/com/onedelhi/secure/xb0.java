package com.onedelhi.secure;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.yb0;

public abstract class xb0 extends BaseAdapter implements Filterable, yb0.C3983a {
    @Deprecated

    /* renamed from: o */
    public static final int f22512o = 1;

    /* renamed from: p */
    public static final int f22513p = 2;
    @hl3({hl3.C2354a.LIBRARY_GROUP})

    /* renamed from: a */
    public Context f22514a;
    @hl3({hl3.C2354a.LIBRARY_GROUP})

    /* renamed from: a */
    public Cursor f22515a;
    @hl3({hl3.C2354a.LIBRARY_GROUP})

    /* renamed from: a */
    public DataSetObserver f22516a;
    @hl3({hl3.C2354a.LIBRARY_GROUP})

    /* renamed from: a */
    public FilterQueryProvider f22517a;
    @hl3({hl3.C2354a.LIBRARY_GROUP})

    /* renamed from: a */
    public C3916a f22518a;
    @hl3({hl3.C2354a.LIBRARY_GROUP})

    /* renamed from: a */
    public yb0 f22519a;
    @hl3({hl3.C2354a.LIBRARY_GROUP})

    /* renamed from: b */
    public boolean f22520b;
    @hl3({hl3.C2354a.LIBRARY_GROUP})

    /* renamed from: c */
    public boolean f22521c;
    @hl3({hl3.C2354a.LIBRARY_GROUP})

    /* renamed from: n */
    public int f22522n;

    /* renamed from: com.onedelhi.secure.xb0$a */
    public class C3916a extends ContentObserver {
        public C3916a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            xb0.this.mo26875k();
        }
    }

    /* renamed from: com.onedelhi.secure.xb0$b */
    public class C3917b extends DataSetObserver {
        public C3917b() {
        }

        public void onChanged() {
            xb0 xb0 = xb0.this;
            xb0.f22520b = true;
            xb0.notifyDataSetChanged();
        }

        public void onInvalidated() {
            xb0 xb0 = xb0.this;
            xb0.f22520b = false;
            xb0.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public xb0(Context context, Cursor cursor) {
        mo26869g(context, cursor, 1);
    }

    public xb0(Context context, Cursor cursor, int i) {
        mo26869g(context, cursor, i);
    }

    public xb0(Context context, Cursor cursor, boolean z) {
        mo26869g(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public CharSequence mo24232a(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    /* renamed from: b */
    public void mo24233b(Cursor cursor) {
        Cursor m = mo26386m(cursor);
        if (m != null) {
            m.close();
        }
    }

    /* renamed from: c */
    public Cursor mo26867c() {
        return this.f22515a;
    }

    /* renamed from: d */
    public Cursor mo24234d(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f22517a;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f22515a;
    }

    /* renamed from: e */
    public abstract void mo24235e(View view, Context context, Cursor cursor);

    /* renamed from: f */
    public FilterQueryProvider mo26868f() {
        return this.f22517a;
    }

    /* renamed from: g */
    public void mo26869g(Context context, Cursor cursor, int i) {
        C3917b bVar;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f22521c = true;
        } else {
            this.f22521c = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f22515a = cursor;
        this.f22520b = z;
        this.f22514a = context;
        this.f22522n = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f22518a = new C3916a();
            bVar = new C3917b();
        } else {
            bVar = null;
            this.f22518a = null;
        }
        this.f22516a = bVar;
        if (z) {
            C3916a aVar = this.f22518a;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f22516a;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public int getCount() {
        Cursor cursor;
        if (!this.f22520b || (cursor = this.f22515a) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f22520b) {
            return null;
        }
        this.f22515a.moveToPosition(i);
        if (view == null) {
            view = mo17325i(this.f22514a, this.f22515a, viewGroup);
        }
        mo24235e(view, this.f22514a, this.f22515a);
        return view;
    }

    public Filter getFilter() {
        if (this.f22519a == null) {
            this.f22519a = new yb0(this);
        }
        return this.f22519a;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f22520b || (cursor = this.f22515a) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f22515a;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f22520b || (cursor = this.f22515a) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f22515a.getLong(this.f22522n);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f22520b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f22515a.moveToPosition(i)) {
            if (view == null) {
                view = mo17326j(this.f22514a, this.f22515a, viewGroup);
            }
            mo24235e(view, this.f22514a, this.f22515a);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    @Deprecated
    /* renamed from: h */
    public void mo26874h(Context context, Cursor cursor, boolean z) {
        mo26869g(context, cursor, z ? 1 : 2);
    }

    public boolean hasStableIds() {
        return true;
    }

    /* renamed from: i */
    public View mo17325i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo17326j(context, cursor, viewGroup);
    }

    /* renamed from: j */
    public abstract View mo17326j(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: k */
    public void mo26875k() {
        Cursor cursor;
        if (this.f22521c && (cursor = this.f22515a) != null && !cursor.isClosed()) {
            this.f22520b = this.f22515a.requery();
        }
    }

    /* renamed from: l */
    public void mo26876l(FilterQueryProvider filterQueryProvider) {
        this.f22517a = filterQueryProvider;
    }

    /* renamed from: m */
    public Cursor mo26386m(Cursor cursor) {
        Cursor cursor2 = this.f22515a;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C3916a aVar = this.f22518a;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f22516a;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f22515a = cursor;
        if (cursor != null) {
            C3916a aVar2 = this.f22518a;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f22516a;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f22522n = cursor.getColumnIndexOrThrow("_id");
            this.f22520b = true;
            notifyDataSetChanged();
        } else {
            this.f22522n = -1;
            this.f22520b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
