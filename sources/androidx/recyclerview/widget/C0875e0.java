package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.onedelhi.secure.mr2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.e0 */
public interface C0875e0 {

    /* renamed from: androidx.recyclerview.widget.e0$a */
    public static class C0876a implements C0875e0 {

        /* renamed from: a */
        public int f4873a = 0;

        /* renamed from: a */
        public SparseArray<C0937r> f4874a = new SparseArray<>();

        /* renamed from: androidx.recyclerview.widget.e0$a$a */
        public class C0877a implements C0880c {

            /* renamed from: a */
            public SparseIntArray f4875a = new SparseIntArray(1);

            /* renamed from: a */
            public final C0937r f4877a;

            /* renamed from: b */
            public SparseIntArray f4878b = new SparseIntArray(1);

            public C0877a(C0937r rVar) {
                this.f4877a = rVar;
            }

            /* renamed from: e */
            public void mo6234e() {
                C0876a.this.mo6233d(this.f4877a);
            }

            /* renamed from: f */
            public int mo6235f(int i) {
                int indexOfKey = this.f4878b.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return this.f4878b.valueAt(indexOfKey);
                }
                throw new IllegalStateException("requested global type " + i + " does not belong to the adapter:" + this.f4877a.f5184a);
            }

            /* renamed from: g */
            public int mo6236g(int i) {
                int indexOfKey = this.f4875a.indexOfKey(i);
                if (indexOfKey > -1) {
                    return this.f4875a.valueAt(indexOfKey);
                }
                int c = C0876a.this.mo6232c(this.f4877a);
                this.f4875a.put(i, c);
                this.f4878b.put(c, i);
                return c;
            }
        }

        @mr2
        /* renamed from: a */
        public C0937r mo6230a(int i) {
            C0937r rVar = this.f4874a.get(i);
            if (rVar != null) {
                return rVar;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
        }

        @mr2
        /* renamed from: b */
        public C0880c mo6231b(@mr2 C0937r rVar) {
            return new C0877a(rVar);
        }

        /* renamed from: c */
        public int mo6232c(C0937r rVar) {
            int i = this.f4873a;
            this.f4873a = i + 1;
            this.f4874a.put(i, rVar);
            return i;
        }

        /* renamed from: d */
        public void mo6233d(@mr2 C0937r rVar) {
            for (int size = this.f4874a.size() - 1; size >= 0; size--) {
                if (this.f4874a.valueAt(size) == rVar) {
                    this.f4874a.removeAt(size);
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.e0$b */
    public static class C0878b implements C0875e0 {

        /* renamed from: a */
        public SparseArray<List<C0937r>> f4879a = new SparseArray<>();

        /* renamed from: androidx.recyclerview.widget.e0$b$a */
        public class C0879a implements C0880c {

            /* renamed from: a */
            public final C0937r f4881a;

            public C0879a(C0937r rVar) {
                this.f4881a = rVar;
            }

            /* renamed from: e */
            public void mo6234e() {
                C0878b.this.mo6237c(this.f4881a);
            }

            /* renamed from: f */
            public int mo6235f(int i) {
                return i;
            }

            /* renamed from: g */
            public int mo6236g(int i) {
                List list = C0878b.this.f4879a.get(i);
                if (list == null) {
                    list = new ArrayList();
                    C0878b.this.f4879a.put(i, list);
                }
                if (!list.contains(this.f4881a)) {
                    list.add(this.f4881a);
                }
                return i;
            }
        }

        @mr2
        /* renamed from: a */
        public C0937r mo6230a(int i) {
            List list = this.f4879a.get(i);
            if (list != null && !list.isEmpty()) {
                return (C0937r) list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
        }

        @mr2
        /* renamed from: b */
        public C0880c mo6231b(@mr2 C0937r rVar) {
            return new C0879a(rVar);
        }

        /* renamed from: c */
        public void mo6237c(@mr2 C0937r rVar) {
            for (int size = this.f4879a.size() - 1; size >= 0; size--) {
                List valueAt = this.f4879a.valueAt(size);
                if (valueAt.remove(rVar) && valueAt.isEmpty()) {
                    this.f4879a.removeAt(size);
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.e0$c */
    public interface C0880c {
        /* renamed from: e */
        void mo6234e();

        /* renamed from: f */
        int mo6235f(int i);

        /* renamed from: g */
        int mo6236g(int i);
    }

    @mr2
    /* renamed from: a */
    C0937r mo6230a(int i);

    @mr2
    /* renamed from: b */
    C0880c mo6231b(@mr2 C0937r rVar);
}
