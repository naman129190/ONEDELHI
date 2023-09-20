package com.onedelhi.secure;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

public final class ap1 {

    /* renamed from: a */
    public final List<ImageHeaderParser> f9432a = new ArrayList();

    /* renamed from: a */
    public synchronized void mo13223a(@mr2 ImageHeaderParser imageHeaderParser) {
        this.f9432a.add(imageHeaderParser);
    }

    @mr2
    /* renamed from: b */
    public synchronized List<ImageHeaderParser> mo13224b() {
        return this.f9432a;
    }
}
