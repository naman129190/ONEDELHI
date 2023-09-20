package com.onedelhi.secure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.databinding.C0523i;
import com.onedelhi.secure.hl3;
import java.util.List;

@hl3({hl3.C2354a.LIBRARY})
public class wt2<T> extends BaseAdapter {

    /* renamed from: a */
    public final Context f22281a;

    /* renamed from: a */
    public final LayoutInflater f22282a;

    /* renamed from: a */
    public C0523i.C0524a f22283a;

    /* renamed from: a */
    public List<T> f22284a;

    /* renamed from: n */
    public final int f22285n;

    /* renamed from: o */
    public final int f22286o;

    /* renamed from: p */
    public final int f22287p;

    /* renamed from: com.onedelhi.secure.wt2$a */
    public class C3872a extends C0523i.C0524a {
        public C3872a() {
        }

        /* renamed from: b */
        public void mo3953b(C0523i iVar) {
            wt2.this.notifyDataSetChanged();
        }

        /* renamed from: f */
        public void mo3954f(C0523i iVar, int i, int i2) {
            wt2.this.notifyDataSetChanged();
        }

        /* renamed from: g */
        public void mo3955g(C0523i iVar, int i, int i2) {
            wt2.this.notifyDataSetChanged();
        }

        /* renamed from: h */
        public void mo3956h(C0523i iVar, int i, int i2, int i3) {
            wt2.this.notifyDataSetChanged();
        }

        /* renamed from: i */
        public void mo3957i(C0523i iVar, int i, int i2) {
            wt2.this.notifyDataSetChanged();
        }
    }

    public wt2(Context context, List<T> list, int i, int i2, int i3) {
        this.f22281a = context;
        this.f22286o = i;
        this.f22285n = i2;
        this.f22287p = i3;
        this.f22282a = i == 0 ? null : (LayoutInflater) context.getSystemService("layout_inflater");
        mo26678b(list);
    }

    /* renamed from: a */
    public View mo26677a(int i, int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = i == 0 ? new TextView(this.f22281a) : this.f22282a.inflate(i, viewGroup, false);
        }
        int i3 = this.f22287p;
        TextView textView = (TextView) (i3 == 0 ? view : view.findViewById(i3));
        T t = this.f22284a.get(i2);
        textView.setText(t instanceof CharSequence ? (CharSequence) t : String.valueOf(t));
        return view;
    }

    /* renamed from: b */
    public void mo26678b(List<T> list) {
        List<T> list2 = this.f22284a;
        if (list2 != list) {
            if (list2 instanceof C0523i) {
                ((C0523i) list2).mo4000Y(this.f22283a);
            }
            this.f22284a = list;
            if (list instanceof C0523i) {
                if (this.f22283a == null) {
                    this.f22283a = new C3872a();
                }
                ((C0523i) this.f22284a).mo3999N0(this.f22283a);
            }
            notifyDataSetChanged();
        }
    }

    public int getCount() {
        return this.f22284a.size();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return mo26677a(this.f22285n, i, view, viewGroup);
    }

    public Object getItem(int i) {
        return this.f22284a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return mo26677a(this.f22286o, i, view, viewGroup);
    }
}
