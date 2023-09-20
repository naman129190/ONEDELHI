package com.onedelhi.secure;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.onedelhi.secure.hl3;

@C2065el({@C1983dl(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AdapterView.class), @C1983dl(attribute = "android:onItemLongClick", method = "setOnItemLongClickListener", type = AdapterView.class)})
@hl3({hl3.C2354a.LIBRARY})
@ut1({@tt1(attribute = "android:selectedItemPosition", type = AdapterView.class), @tt1(attribute = "android:selection", event = "android:selectedItemPositionAttrChanged", method = "getSelectedItemPosition", type = AdapterView.class)})
/* renamed from: com.onedelhi.secure.x3 */
public class C3892x3 {

    /* renamed from: com.onedelhi.secure.x3$a */
    public interface C3893a {
        void onItemSelected(AdapterView<?> adapterView, View view, int i, long j);
    }

    /* renamed from: com.onedelhi.secure.x3$b */
    public static class C3894b implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        public final st1 f22401a;

        /* renamed from: a */
        public final C3893a f22402a;

        /* renamed from: a */
        public final C3895c f22403a;

        public C3894b(C3893a aVar, C3895c cVar, st1 st1) {
            this.f22402a = aVar;
            this.f22403a = cVar;
            this.f22401a = st1;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C3893a aVar = this.f22402a;
            if (aVar != null) {
                aVar.onItemSelected(adapterView, view, i, j);
            }
            st1 st1 = this.f22401a;
            if (st1 != null) {
                st1.mo24536b();
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
            C3895c cVar = this.f22403a;
            if (cVar != null) {
                cVar.onNothingSelected(adapterView);
            }
            st1 st1 = this.f22401a;
            if (st1 != null) {
                st1.mo24536b();
            }
        }
    }

    /* renamed from: com.onedelhi.secure.x3$c */
    public interface C3895c {
        void onNothingSelected(AdapterView<?> adapterView);
    }

    @C1717al(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected", "android:selectedItemPositionAttrChanged"})
    /* renamed from: a */
    public static void m31251a(AdapterView adapterView, C3893a aVar, C3895c cVar, st1 st1) {
        if (aVar == null && cVar == null && st1 == null) {
            adapterView.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
        } else {
            adapterView.setOnItemSelectedListener(new C3894b(aVar, cVar, st1));
        }
    }

    @C1717al({"android:selectedItemPosition"})
    /* renamed from: b */
    public static void m31252b(AdapterView adapterView, int i) {
        if (adapterView.getSelectedItemPosition() != i) {
            adapterView.setSelection(i);
        }
    }

    @C1717al({"android:selectedItemPosition", "android:adapter"})
    /* renamed from: c */
    public static void m31253c(AdapterView adapterView, int i, Adapter adapter) {
        if (adapter != adapterView.getAdapter()) {
            adapterView.setAdapter(adapter);
        } else if (adapterView.getSelectedItemPosition() == i) {
            return;
        }
        adapterView.setSelection(i);
    }

    @C1717al({"android:selection"})
    /* renamed from: d */
    public static void m31254d(AdapterView adapterView, int i) {
        m31252b(adapterView, i);
    }

    @C1717al({"android:selection", "android:adapter"})
    /* renamed from: e */
    public static void m31255e(AdapterView adapterView, int i, Adapter adapter) {
        m31253c(adapterView, i, adapter);
    }
}
