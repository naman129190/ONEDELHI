package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import com.onedelhi.secure.C6596qt;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* renamed from: com.onedelhi.secure.gt */
public final class C5448gt {

    /* renamed from: a */
    public static final float f29306a = 1.5f;

    /* renamed from: a */
    public static final int f29307a = 10;

    /* renamed from: a */
    public static final String f29308a = "CameraConfiguration";

    /* renamed from: a */
    public static final Pattern f29309a = Pattern.compile(";");

    /* renamed from: b */
    public static final float f29310b = 0.0f;

    /* renamed from: b */
    public static final int f29311b = 20;

    /* renamed from: c */
    public static final int f29312c = 400;

    @TargetApi(15)
    /* renamed from: a */
    public static List<Camera.Area> m49807a(int i) {
        int i2 = -i;
        return Collections.singletonList(new Camera.Area(new Rect(i2, i2, i, i), 1));
    }

    /* renamed from: b */
    public static String m49808b(Camera.Parameters parameters) {
        return m49809c(parameters.flatten());
    }

    /* renamed from: c */
    public static String m49809c(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(1000);
        sb.append("BOARD=");
        sb.append(Build.BOARD);
        sb.append(10);
        sb.append("BRAND=");
        sb.append(Build.BRAND);
        sb.append(10);
        sb.append("CPU_ABI=");
        sb.append(Build.CPU_ABI);
        sb.append(10);
        sb.append("DEVICE=");
        sb.append(Build.DEVICE);
        sb.append(10);
        sb.append("DISPLAY=");
        sb.append(Build.DISPLAY);
        sb.append(10);
        sb.append("FINGERPRINT=");
        sb.append(Build.FINGERPRINT);
        sb.append(10);
        sb.append("HOST=");
        sb.append(Build.HOST);
        sb.append(10);
        sb.append("ID=");
        sb.append(Build.ID);
        sb.append(10);
        sb.append("MANUFACTURER=");
        sb.append(Build.MANUFACTURER);
        sb.append(10);
        sb.append("MODEL=");
        sb.append(Build.MODEL);
        sb.append(10);
        sb.append("PRODUCT=");
        sb.append(Build.PRODUCT);
        sb.append(10);
        sb.append("TAGS=");
        sb.append(Build.TAGS);
        sb.append(10);
        sb.append("TIME=");
        sb.append(Build.TIME);
        sb.append(10);
        sb.append("TYPE=");
        sb.append(Build.TYPE);
        sb.append(10);
        sb.append("USER=");
        sb.append(Build.USER);
        sb.append(10);
        sb.append("VERSION.CODENAME=");
        sb.append(Build.VERSION.CODENAME);
        sb.append(10);
        sb.append("VERSION.INCREMENTAL=");
        sb.append(Build.VERSION.INCREMENTAL);
        sb.append(10);
        sb.append("VERSION.RELEASE=");
        sb.append(Build.VERSION.RELEASE);
        sb.append(10);
        sb.append("VERSION.SDK_INT=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append(10);
        if (charSequence != null) {
            String[] split = f29309a.split(charSequence);
            Arrays.sort(split);
            for (String append : split) {
                sb.append(append);
                sb.append(10);
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static String m49810d(String str, Collection<String> collection, String... strArr) {
        Log.i(f29308a, "Requesting " + str + " value from among: " + Arrays.toString(strArr));
        Log.i(f29308a, "Supported " + str + " values: " + collection);
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    Log.i(f29308a, "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i(f29308a, "No supported values match");
        return null;
    }

    /* renamed from: e */
    public static Integer m49811e(Camera.Parameters parameters, double d) {
        List<Integer> zoomRatios = parameters.getZoomRatios();
        Log.i(f29308a, "Zoom ratios: " + zoomRatios);
        int maxZoom = parameters.getMaxZoom();
        if (zoomRatios == null || zoomRatios.isEmpty() || zoomRatios.size() != maxZoom + 1) {
            Log.w(f29308a, "Invalid zoom ratios!");
            return null;
        }
        double d2 = d * 100.0d;
        double d3 = Double.POSITIVE_INFINITY;
        int i = 0;
        for (int i2 = 0; i2 < zoomRatios.size(); i2++) {
            double abs = Math.abs(((double) zoomRatios.get(i2).intValue()) - d2);
            if (abs < d3) {
                i = i2;
                d3 = abs;
            }
        }
        Log.i(f29308a, "Chose zoom ratio of " + (((double) zoomRatios.get(i).intValue()) / 100.0d));
        return Integer.valueOf(i);
    }

    /* renamed from: f */
    public static void m49812f(Camera.Parameters parameters) {
        if ("barcode".equals(parameters.getSceneMode())) {
            Log.i(f29308a, "Barcode scene mode already set");
            return;
        }
        String d = m49810d("scene mode", parameters.getSupportedSceneModes(), "barcode");
        if (d != null) {
            parameters.setSceneMode(d);
        }
    }

    /* renamed from: g */
    public static void m49813g(Camera.Parameters parameters, boolean z) {
        String str;
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (!(minExposureCompensation == 0 && maxExposureCompensation == 0)) {
            float f = 0.0f;
            if (exposureCompensationStep > 0.0f) {
                if (!z) {
                    f = 1.5f;
                }
                int round = Math.round(f / exposureCompensationStep);
                float f2 = exposureCompensationStep * ((float) round);
                int max = Math.max(Math.min(round, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == max) {
                    str = "Exposure compensation already set to " + max + " / " + f2;
                    Log.i(f29308a, str);
                }
                Log.i(f29308a, "Setting exposure compensation to " + max + " / " + f2);
                parameters.setExposureCompensation(max);
                return;
            }
        }
        str = "Camera does not support exposure compensation";
        Log.i(f29308a, str);
    }

    /* renamed from: h */
    public static void m49814h(Camera.Parameters parameters) {
        m49815i(parameters, 10, 20);
    }

    /* renamed from: i */
    public static void m49815i(Camera.Parameters parameters, int i, int i2) {
        String str;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        Log.i(f29308a, "Supported FPS ranges: " + m49824r(supportedPreviewFpsRange));
        if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
            int[] iArr = null;
            Iterator<int[]> it = supportedPreviewFpsRange.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int[] next = it.next();
                int i3 = next[0];
                int i4 = next[1];
                if (i3 >= i * 1000 && i4 <= i2 * 1000) {
                    iArr = next;
                    break;
                }
            }
            if (iArr == null) {
                str = "No suitable FPS range?";
            } else {
                int[] iArr2 = new int[2];
                parameters.getPreviewFpsRange(iArr2);
                if (Arrays.equals(iArr2, iArr)) {
                    str = "FPS range already set to " + Arrays.toString(iArr);
                } else {
                    Log.i(f29308a, "Setting FPS range to " + Arrays.toString(iArr));
                    parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    return;
                }
            }
            Log.i(f29308a, str);
        }
    }

    /* renamed from: j */
    public static void m49816j(Camera.Parameters parameters, C6596qt.C6597a aVar, boolean z) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String d = (z || aVar == C6596qt.C6597a.AUTO) ? m49810d("focus mode", supportedFocusModes, bf0.f26274c) : aVar == C6596qt.C6597a.CONTINUOUS ? m49810d("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", bf0.f26274c) : aVar == C6596qt.C6597a.INFINITY ? m49810d("focus mode", supportedFocusModes, "infinity") : aVar == C6596qt.C6597a.MACRO ? m49810d("focus mode", supportedFocusModes, "macro") : null;
        if (!z && d == null) {
            d = m49810d("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (d == null) {
            return;
        }
        if (d.equals(parameters.getFocusMode())) {
            Log.i(f29308a, "Focus mode already set to " + d);
            return;
        }
        parameters.setFocusMode(d);
    }

    @TargetApi(15)
    /* renamed from: k */
    public static void m49817k(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() > 0) {
            Log.i(f29308a, "Old focus areas: " + m49823q(parameters.getFocusAreas()));
            List<Camera.Area> a = m49807a(400);
            Log.i(f29308a, "Setting focus area to : " + m49823q(a));
            parameters.setFocusAreas(a);
            return;
        }
        Log.i(f29308a, "Device does not support focus areas");
    }

    /* renamed from: l */
    public static void m49818l(Camera.Parameters parameters) {
        if ("negative".equals(parameters.getColorEffect())) {
            Log.i(f29308a, "Negative effect already set");
            return;
        }
        String d = m49810d("color effect", parameters.getSupportedColorEffects(), "negative");
        if (d != null) {
            parameters.setColorEffect(d);
        }
    }

    @TargetApi(15)
    /* renamed from: m */
    public static void m49819m(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() > 0) {
            Log.i(f29308a, "Old metering areas: " + parameters.getMeteringAreas());
            List<Camera.Area> a = m49807a(400);
            Log.i(f29308a, "Setting metering area to : " + m49823q(a));
            parameters.setMeteringAreas(a);
            return;
        }
        Log.i(f29308a, "Device does not support metering areas");
    }

    /* renamed from: n */
    public static void m49820n(Camera.Parameters parameters, boolean z) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String d = z ? m49810d("flash mode", supportedFlashModes, "torch", bf0.f26276d) : m49810d("flash mode", supportedFlashModes, bf0.f26277e);
        if (d == null) {
            return;
        }
        if (d.equals(parameters.getFlashMode())) {
            Log.i(f29308a, "Flash mode already set to " + d);
            return;
        }
        Log.i(f29308a, "Setting flash mode to " + d);
        parameters.setFlashMode(d);
    }

    @TargetApi(15)
    /* renamed from: o */
    public static void m49821o(Camera.Parameters parameters) {
        String str;
        if (!parameters.isVideoStabilizationSupported()) {
            str = "This device does not support video stabilization";
        } else if (parameters.getVideoStabilization()) {
            str = "Video stabilization already enabled";
        } else {
            Log.i(f29308a, "Enabling video stabilization...");
            parameters.setVideoStabilization(true);
            return;
        }
        Log.i(f29308a, str);
    }

    /* renamed from: p */
    public static void m49822p(Camera.Parameters parameters, double d) {
        String str;
        if (parameters.isZoomSupported()) {
            Integer e = m49811e(parameters, d);
            if (e != null) {
                if (parameters.getZoom() == e.intValue()) {
                    str = "Zoom is already set to " + e;
                } else {
                    Log.i(f29308a, "Setting zoom to " + e);
                    parameters.setZoom(e.intValue());
                    return;
                }
            } else {
                return;
            }
        } else {
            str = "Zoom is not supported";
        }
        Log.i(f29308a, str);
    }

    @TargetApi(15)
    /* renamed from: q */
    public static String m49823q(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Camera.Area next : iterable) {
            sb.append(next.rect);
            sb.append(':');
            sb.append(next.weight);
            sb.append(' ');
        }
        return sb.toString();
    }

    /* renamed from: r */
    public static String m49824r(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
