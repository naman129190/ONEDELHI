package androidx.lifecycle;

import android.app.Application;
import com.onedelhi.secure.C1852c6;
import com.onedelhi.secure.au4;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.cu4;
import com.onedelhi.secure.eu4;
import com.onedelhi.secure.gu4;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.hu4;
import com.onedelhi.secure.jb0;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.km2;
import com.onedelhi.secure.nq1;
import com.onedelhi.secure.rw1;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.vw1;
import com.onedelhi.secure.wg0;
import com.onedelhi.secure.zw1;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0006\n\u0019\u001aB#\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017B\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0018J(\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/m;", "", "Lcom/onedelhi/secure/au4;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Lcom/onedelhi/secure/au4;", "", "key", "b", "(Ljava/lang/String;Ljava/lang/Class;)Lcom/onedelhi/secure/au4;", "Landroidx/lifecycle/m$b;", "Landroidx/lifecycle/m$b;", "factory", "Lcom/onedelhi/secure/gu4;", "store", "Lcom/onedelhi/secure/jb0;", "defaultCreationExtras", "<init>", "(Lcom/onedelhi/secure/gu4;Landroidx/lifecycle/m$b;Lcom/onedelhi/secure/jb0;)V", "Lcom/onedelhi/secure/hu4;", "owner", "(Lcom/onedelhi/secure/hu4;)V", "(Lcom/onedelhi/secure/hu4;Landroidx/lifecycle/m$b;)V", "c", "d", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
/* renamed from: androidx.lifecycle.m */
public class C0709m {
    @vr2

    /* renamed from: a */
    public final C0713b f4121a;
    @vr2

    /* renamed from: a */
    public final gu4 f4122a;
    @vr2

    /* renamed from: a */
    public final jb0 f4123a;

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u001b\b\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\t\b\u0016¢\u0006\u0004\b\u0014\u0010\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0017J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/m$a;", "Landroidx/lifecycle/m$c;", "Lcom/onedelhi/secure/au4;", "T", "Ljava/lang/Class;", "modelClass", "Lcom/onedelhi/secure/jb0;", "extras", "a", "(Ljava/lang/Class;Lcom/onedelhi/secure/jb0;)Lcom/onedelhi/secure/au4;", "b", "(Ljava/lang/Class;)Lcom/onedelhi/secure/au4;", "Landroid/app/Application;", "app", "h", "(Ljava/lang/Class;Landroid/app/Application;)Lcom/onedelhi/secure/au4;", "Landroid/app/Application;", "application", "", "unused", "<init>", "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: androidx.lifecycle.m$a */
    public static class C0710a extends C0715c {
        @vr2

        /* renamed from: a */
        public static final C0711a f4124a = new C0711a((wg0) null);
        @ss2

        /* renamed from: a */
        public static C0710a f4125a = null;
        @vr2

        /* renamed from: a */
        public static final String f4126a = "androidx.lifecycle.ViewModelProvider.DefaultKey";
        @rw1
        @vr2

        /* renamed from: b */
        public static final jb0.C2483b<Application> f4127b = C0711a.C0712a.f4129a;
        @ss2

        /* renamed from: a */
        public final Application f4128a;

        @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0000XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/m$a$a;", "", "Lcom/onedelhi/secure/hu4;", "owner", "Landroidx/lifecycle/m$b;", "a", "(Lcom/onedelhi/secure/hu4;)Landroidx/lifecycle/m$b;", "Landroid/app/Application;", "application", "Landroidx/lifecycle/m$a;", "b", "Lcom/onedelhi/secure/jb0$b;", "APPLICATION_KEY", "Lcom/onedelhi/secure/jb0$b;", "", "DEFAULT_KEY", "Ljava/lang/String;", "sInstance", "Landroidx/lifecycle/m$a;", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
        /* renamed from: androidx.lifecycle.m$a$a */
        public static final class C0711a {

            @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/m$a$a$a;", "Lcom/onedelhi/secure/jb0$b;", "Landroid/app/Application;", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
            /* renamed from: androidx.lifecycle.m$a$a$a */
            public static final class C0712a implements jb0.C2483b<Application> {
                @vr2

                /* renamed from: a */
                public static final C0712a f4129a = new C0712a();
            }

            public C0711a() {
            }

            public /* synthetic */ C0711a(wg0 wg0) {
                this();
            }

            @vr2
            /* renamed from: a */
            public final C0713b mo5030a(@vr2 hu4 hu4) {
                jt1.m53777p(hu4, "owner");
                if (!(hu4 instanceof C0689d)) {
                    return C0715c.f4132a.mo5033a();
                }
                C0713b defaultViewModelProviderFactory = ((C0689d) hu4).getDefaultViewModelProviderFactory();
                jt1.m53776o(defaultViewModelProviderFactory, "owner.defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }

            @zw1
            @vr2
            /* renamed from: b */
            public final C0710a mo5031b(@vr2 Application application) {
                jt1.m53777p(application, "application");
                if (C0710a.f4125a == null) {
                    C0710a.f4125a = new C0710a(application);
                }
                C0710a f = C0710a.f4125a;
                jt1.m53774m(f);
                return f;
            }
        }

        public C0710a() {
            this((Application) null, 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C0710a(@vr2 Application application) {
            this(application, 0);
            jt1.m53777p(application, "application");
        }

        public C0710a(Application application, int i) {
            this.f4128a = application;
        }

        @zw1
        @vr2
        /* renamed from: i */
        public static final C0710a m4854i(@vr2 Application application) {
            return f4124a.mo5031b(application);
        }

        @vr2
        /* renamed from: a */
        public <T extends au4> T mo4943a(@vr2 Class<T> cls, @vr2 jb0 jb0) {
            jt1.m53777p(cls, "modelClass");
            jt1.m53777p(jb0, "extras");
            if (this.f4128a != null) {
                return mo4944b(cls);
            }
            Application application = (Application) jb0.mo18205a(f4127b);
            if (application != null) {
                return mo5029h(cls, application);
            }
            if (!C1852c6.class.isAssignableFrom(cls)) {
                return super.mo4944b(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        @vr2
        /* renamed from: b */
        public <T extends au4> T mo4944b(@vr2 Class<T> cls) {
            jt1.m53777p(cls, "modelClass");
            Application application = this.f4128a;
            if (application != null) {
                return mo5029h(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        /* renamed from: h */
        public final <T extends au4> T mo5029h(Class<T> cls, Application application) {
            if (!C1852c6.class.isAssignableFrom(cls)) {
                return super.mo4944b(cls);
            }
            try {
                T t = (au4) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
                jt1.m53776o(t, "{\n                try {\n…          }\n            }");
                return t;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/m$b;", "", "Lcom/onedelhi/secure/au4;", "T", "Ljava/lang/Class;", "modelClass", "b", "(Ljava/lang/Class;)Lcom/onedelhi/secure/au4;", "Lcom/onedelhi/secure/jb0;", "extras", "a", "(Ljava/lang/Class;Lcom/onedelhi/secure/jb0;)Lcom/onedelhi/secure/au4;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: androidx.lifecycle.m$b */
    public interface C0713b {
        @vr2

        /* renamed from: a */
        public static final C0714a f4130a = C0714a.f4131a;

        @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\"\u0006\u0012\u0002\b\u00030\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/lifecycle/m$b$a;", "", "", "Lcom/onedelhi/secure/cu4;", "initializers", "Landroidx/lifecycle/m$b;", "a", "([Lcom/onedelhi/secure/cu4;)Landroidx/lifecycle/m$b;", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
        /* renamed from: androidx.lifecycle.m$b$a */
        public static final class C0714a {

            /* renamed from: a */
            public static final /* synthetic */ C0714a f4131a = new C0714a();

            @zw1
            @vr2
            /* renamed from: a */
            public final C0713b mo5032a(@vr2 cu4<?>... cu4Arr) {
                jt1.m53777p(cu4Arr, "initializers");
                return new nq1((cu4[]) Arrays.copyOf(cu4Arr, cu4Arr.length));
            }
        }

        @vr2
        /* renamed from: a */
        <T extends au4> T mo4943a(@vr2 Class<T> cls, @vr2 jb0 jb0);

        @vr2
        /* renamed from: b */
        <T extends au4> T mo4944b(@vr2 Class<T> cls);
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/m$c;", "Landroidx/lifecycle/m$b;", "Lcom/onedelhi/secure/au4;", "T", "Ljava/lang/Class;", "modelClass", "b", "(Ljava/lang/Class;)Lcom/onedelhi/secure/au4;", "<init>", "()V", "a", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: androidx.lifecycle.m$c */
    public static class C0715c implements C0713b {
        @vr2

        /* renamed from: a */
        public static final C0716a f4132a = new C0716a((wg0) null);
        @ss2

        /* renamed from: a */
        public static C0715c f4133a;
        @rw1
        @vr2

        /* renamed from: a */
        public static final jb0.C2483b<String> f4134a = C0716a.C0717a.f4135a;

        @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028GX\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/m$c$a;", "", "Landroidx/lifecycle/m$c;", "a", "()Landroidx/lifecycle/m$c;", "getInstance$annotations", "()V", "instance", "Lcom/onedelhi/secure/jb0$b;", "", "VIEW_MODEL_KEY", "Lcom/onedelhi/secure/jb0$b;", "sInstance", "Landroidx/lifecycle/m$c;", "<init>", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
        /* renamed from: androidx.lifecycle.m$c$a */
        public static final class C0716a {

            @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/m$c$a$a;", "Lcom/onedelhi/secure/jb0$b;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
            /* renamed from: androidx.lifecycle.m$c$a$a */
            public static final class C0717a implements jb0.C2483b<String> {
                @vr2

                /* renamed from: a */
                public static final C0717a f4135a = new C0717a();
            }

            public C0716a() {
            }

            public /* synthetic */ C0716a(wg0 wg0) {
                this();
            }

            @zw1
            /* renamed from: b */
            public static /* synthetic */ void m4868b() {
            }

            @hl3({hl3.C2354a.f13187b})
            @vr2
            /* renamed from: a */
            public final C0715c mo5033a() {
                if (C0715c.f4133a == null) {
                    C0715c.f4133a = new C0715c();
                }
                C0715c c = C0715c.f4133a;
                jt1.m53774m(c);
                return c;
            }
        }

        @hl3({hl3.C2354a.f13187b})
        @vr2
        /* renamed from: e */
        public static final C0715c m4865e() {
            return f4132a.mo5033a();
        }

        /* renamed from: a */
        public /* synthetic */ au4 mo4943a(Class cls, jb0 jb0) {
            return eu4.m14374b(this, cls, jb0);
        }

        @vr2
        /* renamed from: b */
        public <T extends au4> T mo4944b(@vr2 Class<T> cls) {
            jt1.m53777p(cls, "modelClass");
            try {
                T newInstance = cls.newInstance();
                jt1.m53776o(newInstance, "{\n                modelC…wInstance()\n            }");
                return (au4) newInstance;
            } catch (InstantiationException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            }
        }
    }

    @hl3({hl3.C2354a.f13187b})
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Landroidx/lifecycle/m$d;", "", "Lcom/onedelhi/secure/au4;", "viewModel", "Lcom/onedelhi/secure/un4;", "c", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: androidx.lifecycle.m$d */
    public static class C0718d {
        /* renamed from: c */
        public void mo4945c(@vr2 au4 au4) {
            jt1.m53777p(au4, "viewModel");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @vw1
    public C0709m(@vr2 gu4 gu4, @vr2 C0713b bVar) {
        this(gu4, bVar, (jb0) null, 4, (wg0) null);
        jt1.m53777p(gu4, "store");
        jt1.m53777p(bVar, "factory");
    }

    @vw1
    public C0709m(@vr2 gu4 gu4, @vr2 C0713b bVar, @vr2 jb0 jb0) {
        jt1.m53777p(gu4, "store");
        jt1.m53777p(bVar, "factory");
        jt1.m53777p(jb0, "defaultCreationExtras");
        this.f4122a = gu4;
        this.f4121a = bVar;
        this.f4123a = jb0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0709m(gu4 gu4, C0713b bVar, jb0 jb0, int i, wg0 wg0) {
        this(gu4, bVar, (i & 4) != 0 ? jb0.C2482a.f14048a : jb0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0709m(@com.onedelhi.secure.vr2 com.onedelhi.secure.hu4 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            com.onedelhi.secure.gu4 r0 = r3.getViewModelStore()
            java.lang.String r1 = "owner.viewModelStore"
            com.onedelhi.secure.jt1.m53776o(r0, r1)
            androidx.lifecycle.m$a$a r1 = androidx.lifecycle.C0709m.C0710a.f4124a
            androidx.lifecycle.m$b r1 = r1.mo5030a(r3)
            com.onedelhi.secure.jb0 r3 = com.onedelhi.secure.fu4.m15309a(r3)
            r2.<init>(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0709m.<init>(com.onedelhi.secure.hu4):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0709m(@com.onedelhi.secure.vr2 com.onedelhi.secure.hu4 r3, @com.onedelhi.secure.vr2 androidx.lifecycle.C0709m.C0713b r4) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            java.lang.String r0 = "factory"
            com.onedelhi.secure.jt1.m53777p(r4, r0)
            com.onedelhi.secure.gu4 r0 = r3.getViewModelStore()
            java.lang.String r1 = "owner.viewModelStore"
            com.onedelhi.secure.jt1.m53776o(r0, r1)
            com.onedelhi.secure.jb0 r3 = com.onedelhi.secure.fu4.m15309a(r3)
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0709m.<init>(com.onedelhi.secure.hu4, androidx.lifecycle.m$b):void");
    }

    @bc2
    @vr2
    /* renamed from: a */
    public <T extends au4> T mo5027a(@vr2 Class<T> cls) {
        jt1.m53777p(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo5028b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @bc2
    @vr2
    /* renamed from: b */
    public <T extends au4> T mo5028b(@vr2 String str, @vr2 Class<T> cls) {
        T t;
        jt1.m53777p(str, "key");
        jt1.m53777p(cls, "modelClass");
        T b = this.f4122a.mo16918b(str);
        if (cls.isInstance(b)) {
            C0713b bVar = this.f4121a;
            C0718d dVar = bVar instanceof C0718d ? (C0718d) bVar : null;
            if (dVar != null) {
                jt1.m53776o(b, "viewModel");
                dVar.mo4945c(b);
            }
            Objects.requireNonNull(b, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return b;
        }
        km2 km2 = new km2(this.f4123a);
        km2.mo19162c(C0715c.f4134a, str);
        try {
            t = this.f4121a.mo4943a(cls, km2);
        } catch (AbstractMethodError unused) {
            t = this.f4121a.mo4944b(cls);
        }
        this.f4122a.mo16920d(str, t);
        return t;
    }
}
