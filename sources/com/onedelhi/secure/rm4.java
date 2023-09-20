package com.onedelhi.secure;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class rm4 {

    /* renamed from: a */
    public final URL f34690a;

    public rm4(URL url) {
        this.f34690a = url;
    }

    /* renamed from: a */
    public URLConnection mo43956a() throws IOException {
        return this.f34690a.openConnection();
    }

    public String toString() {
        return this.f34690a.toString();
    }
}
