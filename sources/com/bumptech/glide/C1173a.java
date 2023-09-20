package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C1175b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C1200c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.onedelhi.secure.C1792bm;
import com.onedelhi.secure.C1984dm;
import com.onedelhi.secure.C2038eb;
import com.onedelhi.secure.C2355hm;
import com.onedelhi.secure.C2646km;
import com.onedelhi.secure.C2873mq;
import com.onedelhi.secure.C2995nq;
import com.onedelhi.secure.C3082oq;
import com.onedelhi.secure.C3131pa;
import com.onedelhi.secure.C3161pq;
import com.onedelhi.secure.C3327qq;
import com.onedelhi.secure.C3431rq;
import com.onedelhi.secure.C3526sl;
import com.onedelhi.secure.C3650tq;
import com.onedelhi.secure.C3930xl;
import com.onedelhi.secure.C4006yl;
import com.onedelhi.secure.b43;
import com.onedelhi.secure.bh1;
import com.onedelhi.secure.c54;
import com.onedelhi.secure.cr1;
import com.onedelhi.secure.dc2;
import com.onedelhi.secure.dk3;
import com.onedelhi.secure.dt4;
import com.onedelhi.secure.ej3;
import com.onedelhi.secure.f44;
import com.onedelhi.secure.f83;
import com.onedelhi.secure.fg2;
import com.onedelhi.secure.fj3;
import com.onedelhi.secure.g43;
import com.onedelhi.secure.g44;
import com.onedelhi.secure.gg2;
import com.onedelhi.secure.gh1;
import com.onedelhi.secure.gk1;
import com.onedelhi.secure.hh0;
import com.onedelhi.secure.hj3;
import com.onedelhi.secure.hp1;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.i44;
import com.onedelhi.secure.ik3;
import com.onedelhi.secure.j21;
import com.onedelhi.secure.jg2;
import com.onedelhi.secure.kp4;
import com.onedelhi.secure.lf0;
import com.onedelhi.secure.lh3;
import com.onedelhi.secure.mg1;
import com.onedelhi.secure.mj1;
import com.onedelhi.secure.mj3;
import com.onedelhi.secure.mk3;
import com.onedelhi.secure.mp4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.my2;
import com.onedelhi.secure.n21;
import com.onedelhi.secure.ng1;
import com.onedelhi.secure.nm1;
import com.onedelhi.secure.nu0;
import com.onedelhi.secure.nx0;
import com.onedelhi.secure.og1;
import com.onedelhi.secure.oh4;
import com.onedelhi.secure.oo0;
import com.onedelhi.secure.op4;
import com.onedelhi.secure.oq4;
import com.onedelhi.secure.pg1;
import com.onedelhi.secure.rg2;
import com.onedelhi.secure.rk3;
import com.onedelhi.secure.s94;
import com.onedelhi.secure.tg2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.ug1;
import com.onedelhi.secure.vn4;
import com.onedelhi.secure.vo0;
import com.onedelhi.secure.wn4;
import com.onedelhi.secure.xn4;
import com.onedelhi.secure.y50;
import com.onedelhi.secure.yd0;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bumptech.glide.a */
public class C1173a implements ComponentCallbacks2 {
    @mj1("Glide.class")

    /* renamed from: a */
    public static volatile C1173a f6039a = null;

    /* renamed from: b */
    public static final String f6040b = "image_manager_disk_cache";

    /* renamed from: b */
    public static volatile boolean f6041b = false;

    /* renamed from: c */
    public static final String f6042c = "Glide";

    /* renamed from: a */
    public final C1174a f6043a;

    /* renamed from: a */
    public final C1182c f6044a;

    /* renamed from: a */
    public final hj3 f6045a;

    /* renamed from: a */
    public final C2355hm f6046a;
    @mj1("this")
    @ts2

    /* renamed from: a */
    public C2646km f6047a;

    /* renamed from: a */
    public final lh3 f6048a;

    /* renamed from: a */
    public final nu0 f6049a;

    /* renamed from: a */
    public final C3131pa f6050a;

    /* renamed from: a */
    public final rg2 f6051a;

    /* renamed from: a */
    public tg2 f6052a = tg2.NORMAL;

    /* renamed from: a */
    public final y50 f6053a;
    @mj1("managers")

    /* renamed from: a */
    public final List<fj3> f6054a = new ArrayList();

    /* renamed from: com.bumptech.glide.a$a */
    public interface C1174a {
        @mr2
        /* renamed from: a */
        mj3 mo7470a();
    }

    public C1173a(@mr2 Context context, @mr2 nu0 nu0, @mr2 rg2 rg2, @mr2 C2355hm hmVar, @mr2 C3131pa paVar, @mr2 hj3 hj3, @mr2 y50 y50, int i, @mr2 C1174a aVar, @mr2 Map<Class<?>, oh4<?, ?>> map, @mr2 List<ej3<Object>> list, C1183d dVar) {
        C3082oq oqVar;
        ik3 ik3;
        Context context2 = context;
        C2355hm hmVar2 = hmVar;
        C3131pa paVar2 = paVar;
        Class<mg1> cls = mg1.class;
        Class<String> cls2 = String.class;
        Class<Integer> cls3 = Integer.class;
        Class<byte[]> cls4 = byte[].class;
        this.f6049a = nu0;
        this.f6046a = hmVar2;
        this.f6050a = paVar2;
        this.f6051a = rg2;
        this.f6045a = hj3;
        this.f6053a = y50;
        this.f6043a = aVar;
        Resources resources = context.getResources();
        lh3 lh3 = new lh3();
        this.f6048a = lh3;
        lh3.mo19571t(new hh0());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            lh3.mo19571t(new nx0());
        }
        List<ImageHeaderParser> g = lh3.mo19558g();
        C3431rq rqVar = new C3431rq(context2, g, hmVar2, paVar2);
        ik3<ParcelFileDescriptor, Bitmap> h = dt4.m13314h(hmVar);
        oo0 oo0 = new oo0(lh3.mo19558g(), resources.getDisplayMetrics(), hmVar2, paVar2);
        if (!dVar.mo7503b(C1175b.C1178c.class) || i2 < 28) {
            C2995nq nqVar = new C2995nq(oo0);
            ik3 = new f44(oo0, paVar2);
            oqVar = nqVar;
        } else {
            ik3 = new cr1();
            oqVar = new C3082oq();
        }
        Class<byte[]> cls5 = cls4;
        mk3 mk3 = new mk3(context2);
        int i3 = i2;
        rk3.C3421c cVar = new rk3.C3421c(resources);
        rk3.C3422d dVar2 = new rk3.C3422d(resources);
        Class<String> cls6 = cls2;
        rk3.C3420b bVar = new rk3.C3420b(resources);
        rk3.C3422d dVar3 = dVar2;
        rk3.C3419a aVar2 = new rk3.C3419a(resources);
        C1984dm dmVar = new C1984dm(paVar2);
        Class<Integer> cls7 = cls3;
        C3526sl slVar = new C3526sl();
        og1 og1 = new og1();
        ContentResolver contentResolver = context.getContentResolver();
        rk3.C3420b bVar2 = bVar;
        rk3.C3421c cVar2 = cVar;
        mk3 mk32 = mk3;
        lh3.mo19552a(ByteBuffer.class, new C3161pq()).mo19552a(InputStream.class, new g44(paVar2)).mo19556e(lh3.f15365b, ByteBuffer.class, Bitmap.class, oqVar).mo19556e(lh3.f15365b, InputStream.class, Bitmap.class, ik3);
        if (ParcelFileDescriptorRewinder.m7613a()) {
            lh3.mo19556e(lh3.f15365b, ParcelFileDescriptor.class, Bitmap.class, new my2(oo0));
        }
        mk3 mk33 = mk32;
        lh3.mo19556e(lh3.f15365b, ParcelFileDescriptor.class, Bitmap.class, h).mo19556e(lh3.f15365b, AssetFileDescriptor.class, Bitmap.class, dt4.m13309c(hmVar)).mo19554c(Bitmap.class, Bitmap.class, xn4.C3932a.m31554a()).mo19556e(lh3.f15365b, Bitmap.class, Bitmap.class, new vn4()).mo19553b(Bitmap.class, dmVar).mo19556e(lh3.f15366c, ByteBuffer.class, BitmapDrawable.class, new C3930xl(resources, oqVar)).mo19556e(lh3.f15366c, InputStream.class, BitmapDrawable.class, new C3930xl(resources, ik3)).mo19556e(lh3.f15366c, ParcelFileDescriptor.class, BitmapDrawable.class, new C3930xl(resources, h)).mo19553b(BitmapDrawable.class, new C4006yl(hmVar2, dmVar)).mo19556e(lh3.f15364a, InputStream.class, ng1.class, new i44(g, rqVar, paVar2)).mo19556e(lh3.f15364a, ByteBuffer.class, ng1.class, rqVar).mo19553b(ng1.class, new pg1()).mo19554c(cls, cls, xn4.C3932a.m31554a()).mo19556e(lh3.f15365b, cls, Bitmap.class, new ug1(hmVar2)).mo19555d(Uri.class, Drawable.class, mk33).mo19555d(Uri.class, Bitmap.class, new dk3(mk33, hmVar2)).mo19572u(new C3650tq.C3651a()).mo19554c(File.class, ByteBuffer.class, new C3327qq.C3329b()).mo19554c(File.class, InputStream.class, new n21.C2919e()).mo19555d(File.class, File.class, new j21()).mo19554c(File.class, ParcelFileDescriptor.class, new n21.C2915b()).mo19554c(File.class, File.class, xn4.C3932a.m31554a()).mo19572u(new C1200c.C1201a(paVar2));
        if (ParcelFileDescriptorRewinder.m7613a()) {
            lh3.mo19572u(new ParcelFileDescriptorRewinder.C1194a());
        }
        Class cls8 = Integer.TYPE;
        rk3.C3421c cVar3 = cVar2;
        rk3.C3420b bVar3 = bVar2;
        Class<Integer> cls9 = cls7;
        rk3.C3422d dVar4 = dVar3;
        rk3.C3419a aVar3 = aVar2;
        Class<String> cls10 = cls6;
        Context context3 = context;
        lh3.mo19554c(cls8, InputStream.class, cVar3).mo19554c(cls8, ParcelFileDescriptor.class, bVar3).mo19554c(cls9, InputStream.class, cVar3).mo19554c(cls9, ParcelFileDescriptor.class, bVar3).mo19554c(cls9, Uri.class, dVar4).mo19554c(cls8, AssetFileDescriptor.class, aVar3).mo19554c(cls9, AssetFileDescriptor.class, aVar3).mo19554c(cls8, Uri.class, dVar4).mo19554c(cls10, InputStream.class, new yd0.C3989c()).mo19554c(Uri.class, InputStream.class, new yd0.C3989c()).mo19554c(cls10, InputStream.class, new c54.C1851c()).mo19554c(cls10, ParcelFileDescriptor.class, new c54.C1850b()).mo19554c(cls10, AssetFileDescriptor.class, new c54.C1849a()).mo19554c(Uri.class, InputStream.class, new C2038eb.C2041c(context.getAssets())).mo19554c(Uri.class, ParcelFileDescriptor.class, new C2038eb.C2040b(context.getAssets())).mo19554c(Uri.class, InputStream.class, new gg2.C2246a(context3)).mo19554c(Uri.class, InputStream.class, new jg2.C2515a(context3));
        int i4 = i3;
        if (i4 >= 29) {
            lh3.mo19554c(Uri.class, InputStream.class, new f83.C2133c(context3));
            lh3.mo19554c(Uri.class, ParcelFileDescriptor.class, new f83.C2132b(context3));
        }
        ContentResolver contentResolver2 = contentResolver;
        Class<byte[]> cls11 = cls5;
        C3526sl slVar2 = slVar;
        og1 og12 = og1;
        lh3.mo19554c(Uri.class, InputStream.class, new kp4.C2659d(contentResolver2)).mo19554c(Uri.class, ParcelFileDescriptor.class, new kp4.C2657b(contentResolver2)).mo19554c(Uri.class, AssetFileDescriptor.class, new kp4.C2656a(contentResolver2)).mo19554c(Uri.class, InputStream.class, new op4.C3081a()).mo19554c(URL.class, InputStream.class, new mp4.C2872a()).mo19554c(Uri.class, File.class, new fg2.C2166a(context3)).mo19554c(gh1.class, InputStream.class, new nm1.C2986a()).mo19554c(cls11, ByteBuffer.class, new C2873mq.C2874a()).mo19554c(cls11, InputStream.class, new C2873mq.C2878d()).mo19554c(Uri.class, Uri.class, xn4.C3932a.m31554a()).mo19554c(Drawable.class, Drawable.class, xn4.C3932a.m31554a()).mo19555d(Drawable.class, Drawable.class, new wn4()).mo19575x(Bitmap.class, BitmapDrawable.class, new C1792bm(resources)).mo19575x(Bitmap.class, cls11, slVar2).mo19575x(Drawable.class, cls11, new vo0(hmVar2, slVar2, og12)).mo19575x(ng1.class, cls11, og12);
        if (i4 >= 23) {
            ik3<ByteBuffer, Bitmap> d = dt4.m13310d(hmVar);
            lh3.mo19555d(ByteBuffer.class, Bitmap.class, d);
            lh3.mo19555d(ByteBuffer.class, BitmapDrawable.class, new C3930xl(resources, d));
        }
        this.f6044a = new C1182c(context, paVar, lh3, new hp1(), aVar, map, list, nu0, dVar, i);
    }

    @mr2
    /* renamed from: C */
    public static fj3 m7521C(@mr2 Activity activity) {
        return m7533p(activity).mo17301j(activity);
    }

    @mr2
    @Deprecated
    /* renamed from: D */
    public static fj3 m7522D(@mr2 Fragment fragment) {
        return m7533p(fragment.getActivity()).mo17302k(fragment);
    }

    @mr2
    /* renamed from: E */
    public static fj3 m7523E(@mr2 Context context) {
        return m7533p(context).mo17303l(context);
    }

    @mr2
    /* renamed from: F */
    public static fj3 m7524F(@mr2 View view) {
        return m7533p(view.getContext()).mo17304m(view);
    }

    @mr2
    /* renamed from: G */
    public static fj3 m7525G(@mr2 androidx.fragment.app.Fragment fragment) {
        return m7533p(fragment.getContext()).mo17305n(fragment);
    }

    @mr2
    /* renamed from: H */
    public static fj3 m7526H(@mr2 FragmentActivity fragmentActivity) {
        return m7533p(fragmentActivity).mo17306o(fragmentActivity);
    }

    @mj1("Glide.class")
    /* renamed from: a */
    public static void m7527a(@mr2 Context context, @ts2 GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f6041b) {
            f6041b = true;
            m7536s(context, generatedAppGlideModule);
            f6041b = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    @hw4
    /* renamed from: d */
    public static void m7528d() {
        gk1.m15888d().mo16692l();
    }

    @mr2
    /* renamed from: e */
    public static C1173a m7529e(@mr2 Context context) {
        if (f6039a == null) {
            GeneratedAppGlideModule f = m7530f(context.getApplicationContext());
            synchronized (C1173a.class) {
                if (f6039a == null) {
                    m7527a(context, f);
                }
            }
        }
        return f6039a;
    }

    @ts2
    /* renamed from: f */
    public static GeneratedAppGlideModule m7530f(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            m7539z(e);
        }
        return null;
    }

    @ts2
    /* renamed from: l */
    public static File m7531l(@mr2 Context context) {
        return m7532m(context, "image_manager_disk_cache");
    }

    @ts2
    /* renamed from: m */
    public static File m7532m(@mr2 Context context, @mr2 String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, str);
            if (file.isDirectory() || file.mkdirs()) {
                return file;
            }
            return null;
        }
        if (Log.isLoggable("Glide", 6)) {
            Log.e("Glide", "default disk cache dir is null");
        }
        return null;
    }

    @mr2
    /* renamed from: p */
    public static hj3 m7533p(@ts2 Context context) {
        g43.m15510e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m7529e(context).mo7462o();
    }

    @hw4
    /* renamed from: q */
    public static void m7534q(@mr2 Context context, @mr2 C1175b bVar) {
        GeneratedAppGlideModule f = m7530f(context);
        synchronized (C1173a.class) {
            if (f6039a != null) {
                m7538y();
            }
            m7537t(context, bVar, f);
        }
    }

    @hw4
    @Deprecated
    /* renamed from: r */
    public static synchronized void m7535r(C1173a aVar) {
        synchronized (C1173a.class) {
            if (f6039a != null) {
                m7538y();
            }
            f6039a = aVar;
        }
    }

    @mj1("Glide.class")
    /* renamed from: s */
    public static void m7536s(@mr2 Context context, @ts2 GeneratedAppGlideModule generatedAppGlideModule) {
        m7537t(context, new C1175b(), generatedAppGlideModule);
    }

    @mj1("Glide.class")
    /* renamed from: t */
    public static void m7537t(@mr2 Context context, @mr2 C1175b bVar, @ts2 GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<bh1> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.mo27245c()) {
            emptyList = new dc2(applicationContext).mo14616a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.mo7450d().isEmpty()) {
            Set<Class<?>> d = generatedAppGlideModule.mo7450d();
            Iterator<bh1> it = emptyList.iterator();
            while (it.hasNext()) {
                bh1 next = it.next();
                if (d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (bh1 bh1 : emptyList) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + bh1.getClass());
            }
        }
        bVar.mo7490t(generatedAppGlideModule != null ? generatedAppGlideModule.mo7451e() : null);
        for (bh1 a : emptyList) {
            a.mo22956a(applicationContext, bVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo22956a(applicationContext, bVar);
        }
        C1173a b = bVar.mo7472b(applicationContext);
        for (bh1 next2 : emptyList) {
            try {
                next2.mo19069b(applicationContext, b, b.f6048a);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + next2.getClass().getName(), e);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo19069b(applicationContext, b, b.f6048a);
        }
        applicationContext.registerComponentCallbacks(b);
        f6039a = b;
    }

    @hw4
    /* renamed from: y */
    public static void m7538y() {
        synchronized (C1173a.class) {
            if (f6039a != null) {
                f6039a.mo7459j().getApplicationContext().unregisterComponentCallbacks(f6039a);
                f6039a.f6049a.mo21484m();
            }
            f6039a = null;
        }
    }

    /* renamed from: z */
    public static void m7539z(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: A */
    public void mo7452A(int i) {
        oq4.m24014b();
        synchronized (this.f6054a) {
            for (fj3 onTrimMemory : this.f6054a) {
                onTrimMemory.onTrimMemory(i);
            }
        }
        this.f6051a.mo22371a(i);
        this.f6046a.mo17341a(i);
        this.f6050a.mo18213a(i);
    }

    /* renamed from: B */
    public void mo7453B(fj3 fj3) {
        synchronized (this.f6054a) {
            if (this.f6054a.contains(fj3)) {
                this.f6054a.remove(fj3);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    /* renamed from: b */
    public void mo7454b() {
        oq4.m24013a();
        this.f6049a.mo21477e();
    }

    /* renamed from: c */
    public void mo7455c() {
        oq4.m24014b();
        this.f6051a.mo23851b();
        this.f6046a.mo17342b();
        this.f6050a.mo18214b();
    }

    @mr2
    /* renamed from: g */
    public C3131pa mo7456g() {
        return this.f6050a;
    }

    @mr2
    /* renamed from: h */
    public C2355hm mo7457h() {
        return this.f6046a;
    }

    /* renamed from: i */
    public y50 mo7458i() {
        return this.f6053a;
    }

    @mr2
    /* renamed from: j */
    public Context mo7459j() {
        return this.f6044a.getBaseContext();
    }

    @mr2
    /* renamed from: k */
    public C1182c mo7460k() {
        return this.f6044a;
    }

    @mr2
    /* renamed from: n */
    public lh3 mo7461n() {
        return this.f6048a;
    }

    @mr2
    /* renamed from: o */
    public hj3 mo7462o() {
        return this.f6045a;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        mo7455c();
    }

    public void onTrimMemory(int i) {
        mo7452A(i);
    }

    /* renamed from: u */
    public synchronized void mo7466u(@mr2 b43.C1747a... aVarArr) {
        if (this.f6047a == null) {
            this.f6047a = new C2646km(this.f6051a, this.f6046a, (lf0) this.f6043a.mo7470a().mo25146K().mo28148c(oo0.f18036a));
        }
        this.f6047a.mo19157c(aVarArr);
    }

    /* renamed from: v */
    public void mo7467v(fj3 fj3) {
        synchronized (this.f6054a) {
            if (!this.f6054a.contains(fj3)) {
                this.f6054a.add(fj3);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    /* renamed from: w */
    public boolean mo7468w(@mr2 s94<?> s94) {
        synchronized (this.f6054a) {
            for (fj3 c0 : this.f6054a) {
                if (c0.mo15994c0(s94)) {
                    return true;
                }
            }
            return false;
        }
    }

    @mr2
    /* renamed from: x */
    public tg2 mo7469x(@mr2 tg2 tg2) {
        oq4.m24014b();
        this.f6051a.mo23854f(tg2.mo24929a());
        this.f6046a.mo17345f(tg2.mo24929a());
        tg2 tg22 = this.f6052a;
        this.f6052a = tg2;
        return tg22;
    }
}
