package paytm.assist.easypay.easypay.appinvoke;

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
    public static final SparseIntArray f38897a = new SparseIntArray(0);

    /* renamed from: paytm.assist.easypay.easypay.appinvoke.DataBinderMapperImpl$a */
    public static class C7646a {

        /* renamed from: a */
        public static final SparseArray<String> f38898a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f38898a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* renamed from: paytm.assist.easypay.easypay.appinvoke.DataBinderMapperImpl$b */
    public static class C7647b {

        /* renamed from: a */
        public static final HashMap<String, Integer> f38899a = new HashMap<>(0);
    }

    /* renamed from: a */
    public List<dd0> mo4023a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    /* renamed from: b */
    public String mo3901b(int i) {
        return C7646a.f38898a.get(i);
    }

    /* renamed from: c */
    public ViewDataBinding mo3902c(DataBindingComponent dataBindingComponent, View view, int i) {
        if (f38897a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    /* renamed from: d */
    public ViewDataBinding mo3903d(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f38897a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    /* renamed from: e */
    public int mo3904e(String str) {
        Integer num;
        if (str == null || (num = C7647b.f38899a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
