package com.onedelhi.secure;

import java.util.List;

public enum pf0 {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(r0),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(tl3.class),
    ALLOWED_EAN_EXTENSIONS(r0);
    

    /* renamed from: a */
    public final Class<?> f33643a;

    /* access modifiers changed from: public */
    pf0(Class<?> cls) {
        this.f33643a = cls;
    }

    /* renamed from: a */
    public Class<?> mo42584a() {
        return this.f33643a;
    }
}
