package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;

public interface tn1 extends IInterface {

    /* renamed from: com.onedelhi.secure.tn1$a */
    public static abstract class C3647a extends cl5 implements tn1 {
        public C3647a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @mr2
        /* renamed from: j8 */
        public static tn1 m28820j8(@mr2 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof tn1 ? (tn1) queryLocalInterface : new yl5(iBinder);
        }
    }
}
