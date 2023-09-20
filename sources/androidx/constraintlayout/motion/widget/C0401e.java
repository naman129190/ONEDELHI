package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.motion.widget.C0393b;
import androidx.constraintlayout.widget.C0426d;

/* renamed from: androidx.constraintlayout.motion.widget.e */
public class C0401e {

    /* renamed from: a */
    public static final String f2252a = "TransitionBuilder";

    /* renamed from: a */
    public static C0393b.C0395b m2999a(C0393b bVar, int i, int i2, C0426d dVar, int i3, C0426d dVar2) {
        C0393b.C0395b bVar2 = new C0393b.C0395b(i, bVar, i2, i3);
        m3000b(bVar, bVar2, dVar, dVar2);
        return bVar2;
    }

    /* renamed from: b */
    public static void m3000b(C0393b bVar, C0393b.C0395b bVar2, C0426d dVar, C0426d dVar2) {
        int I = bVar2.mo2958I();
        int B = bVar2.mo2951B();
        bVar.mo2923j0(I, dVar);
        bVar.mo2923j0(B, dVar2);
    }

    /* renamed from: c */
    public static void m3001c(MotionLayout motionLayout) {
        C0393b bVar = motionLayout.f2005a;
        if (bVar == null) {
            throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        } else if (!bVar.mo2940s0(motionLayout)) {
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        } else if (bVar.f2138a == null || bVar.mo2939s().isEmpty()) {
            throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
        }
    }
}
