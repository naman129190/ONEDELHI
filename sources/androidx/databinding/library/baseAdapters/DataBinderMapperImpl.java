package androidx.databinding.library.baseAdapters;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.onedelhi.secure.dd0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends dd0 {

    /* renamed from: a */
    public static final SparseIntArray f3443a = new SparseIntArray(0);

    /* renamed from: androidx.databinding.library.baseAdapters.DataBinderMapperImpl$a */
    public static class C0529a {

        /* renamed from: a */
        public static final SparseArray<String> f3444a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f3444a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* renamed from: androidx.databinding.library.baseAdapters.DataBinderMapperImpl$b */
    public static class C0530b {

        /* renamed from: a */
        public static final HashMap<String, Integer> f3445a = new HashMap<>(0);
    }

    /* renamed from: a */
    public List<dd0> mo4023a() {
        return new ArrayList(0);
    }

    /* renamed from: b */
    public String mo3901b(int i) {
        return C0529a.f3444a.get(i);
    }

    /* renamed from: c */
    public ViewDataBinding mo3902c(DataBindingComponent dataBindingComponent, View view, int i) {
        if (f3443a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    /* renamed from: d */
    public ViewDataBinding mo3903d(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f3443a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    /* renamed from: e */
    public int mo3904e(String str) {
        Integer num;
        if (str == null || (num = C0530b.f3445a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
