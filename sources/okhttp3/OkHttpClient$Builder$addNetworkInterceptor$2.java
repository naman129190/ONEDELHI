package okhttp3;

import com.onedelhi.secure.ec1;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.vr2;
import okhttp3.Interceptor;

@ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo38105d2 = {"<anonymous>", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "intercept"}, mo38106k = 3, mo38107mv = {1, 4, 0})
public final class OkHttpClient$Builder$addNetworkInterceptor$2 implements Interceptor {
    public final /* synthetic */ ec1 $block;

    public OkHttpClient$Builder$addNetworkInterceptor$2(ec1 ec1) {
        this.$block = ec1;
    }

    @vr2
    public final Response intercept(@vr2 Interceptor.Chain chain) {
        jt1.m53777p(chain, "chain");
        return (Response) this.$block.mo17094X(chain);
    }
}
