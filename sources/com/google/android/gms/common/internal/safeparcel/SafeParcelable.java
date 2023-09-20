package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;
import com.onedelhi.secure.mr2;

public interface SafeParcelable extends Parcelable {
    @mr2
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    public @interface Class {
        @mr2
        String creator();

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    public @interface Constructor {
    }

    public @interface Field {
        @mr2
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @mr2
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        @mr2
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: id */
        int mo10053id();

        @mr2
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    public @interface Indicator {
        @mr2
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    public @interface Param {
        /* renamed from: id */
        int mo10056id();
    }

    public @interface RemovedParam {
        @mr2
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @mr2
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: id */
        int mo10059id();
    }

    public @interface Reserved {
        @mr2
        int[] value();
    }

    public @interface VersionField {
        @mr2
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: id */
        int mo10062id();

        @mr2
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
