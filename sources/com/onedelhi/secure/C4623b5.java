package com.onedelhi.secure;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.onedelhi.secure.b5 */
public interface C4623b5 {

    @KeepForSdk
    /* renamed from: com.onedelhi.secure.b5$a */
    public interface C4624a {
        @KeepForSdk
        /* renamed from: a */
        void mo31405a();

        @KeepForSdk
        /* renamed from: b */
        void mo31406b(@mr2 Set<String> set);

        @KeepForSdk
        /* renamed from: c */
        void mo31407c();
    }

    @KeepForSdk
    /* renamed from: com.onedelhi.secure.b5$b */
    public interface C4625b {
        @KeepForSdk
        /* renamed from: a */
        void mo31408a(int i, @ts2 Bundle bundle);
    }

    @KeepForSdk
    /* renamed from: com.onedelhi.secure.b5$c */
    public static class C4626c {
        @KeepForSdk

        /* renamed from: a */
        public long f26142a;
        @KeepForSdk
        @ts2

        /* renamed from: a */
        public Bundle f26143a;
        @KeepForSdk
        @ts2

        /* renamed from: a */
        public Object f26144a;
        @mr2
        @KeepForSdk

        /* renamed from: a */
        public String f26145a;
        @KeepForSdk

        /* renamed from: a */
        public boolean f26146a;
        @KeepForSdk

        /* renamed from: b */
        public long f26147b;
        @KeepForSdk
        @ts2

        /* renamed from: b */
        public Bundle f26148b;
        @mr2
        @KeepForSdk

        /* renamed from: b */
        public String f26149b;
        @KeepForSdk

        /* renamed from: c */
        public long f26150c;
        @KeepForSdk
        @ts2

        /* renamed from: c */
        public Bundle f26151c;
        @KeepForSdk
        @ts2

        /* renamed from: c */
        public String f26152c;
        @KeepForSdk

        /* renamed from: d */
        public long f26153d;
        @KeepForSdk
        @ts2

        /* renamed from: d */
        public String f26154d;
        @KeepForSdk
        @ts2

        /* renamed from: e */
        public String f26155e;
        @KeepForSdk
        @ts2

        /* renamed from: f */
        public String f26156f;
    }

    @KeepForSdk
    /* renamed from: a */
    void mo31397a(@mr2 String str, @mr2 String str2, @ts2 Bundle bundle);

    @KeepForSdk
    @ts2
    @zh0
    /* renamed from: b */
    C4624a mo31398b(@mr2 String str, @mr2 C4625b bVar);

    @KeepForSdk
    /* renamed from: c */
    void mo31399c(@mr2 C4626c cVar);

    @KeepForSdk
    void clearConditionalUserProperty(@mr2 @qz3(max = 24, min = 1) String str, @ts2 String str2, @ts2 Bundle bundle);

    @KeepForSdk
    /* renamed from: d */
    void mo31401d(@mr2 String str, @mr2 String str2, @mr2 Object obj);

    @KeepForSdk
    @ly4
    /* renamed from: e */
    int mo31402e(@mr2 @qz3(min = 1) String str);

    @mr2
    @ly4
    @KeepForSdk
    /* renamed from: f */
    List<C4626c> mo31403f(@mr2 String str, @ts2 @qz3(max = 23, min = 1) String str2);

    @mr2
    @ly4
    @KeepForSdk
    /* renamed from: g */
    Map<String, Object> mo31404g(boolean z);
}
