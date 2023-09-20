package kotlinx.coroutines.android;

import android.os.Looper;
import com.onedelhi.secure.bk1;
import com.onedelhi.secure.ek1;
import com.onedelhi.secure.o82;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.wg0;
import com.onedelhi.secure.xb2;
import com.onedelhi.secure.yb2;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/android/AndroidDispatcherFactory;", "Lcom/onedelhi/secure/yb2;", "", "allFactories", "Lcom/onedelhi/secure/xb2;", "createDispatcher", "", "hintOnError", "", "getLoadPriority", "()I", "loadPriority", "<init>", "()V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
public final class AndroidDispatcherFactory implements yb2 {
    @vr2
    public xb2 createDispatcher(@vr2 List<? extends yb2> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new bk1(ek1.m46921d(mainLooper, true), (String) null, 2, (wg0) null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int getLoadPriority() {
        return o82.f32908e;
    }

    @vr2
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
