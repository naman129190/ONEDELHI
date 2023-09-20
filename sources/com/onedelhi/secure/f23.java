package com.onedelhi.secure;

import android.content.res.Configuration;

public final class f23 {

    /* renamed from: a */
    public final Configuration f11815a;

    /* renamed from: a */
    public final boolean f11816a;

    public f23(boolean z) {
        this.f11816a = z;
        this.f11815a = null;
    }

    @sj3(26)
    public f23(boolean z, @mr2 Configuration configuration) {
        this.f11816a = z;
        this.f11815a = configuration;
    }

    @mr2
    @sj3(26)
    /* renamed from: a */
    public Configuration mo15733a() {
        Configuration configuration = this.f11815a;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    /* renamed from: b */
    public boolean mo15734b() {
        return this.f11816a;
    }
}
