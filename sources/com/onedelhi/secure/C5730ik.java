package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import com.onedelhi.secure.yd3;
import java.io.IOException;

/* renamed from: com.onedelhi.secure.ik */
public final class C5730ik {

    /* renamed from: a */
    public static final float f30344a = 0.1f;

    /* renamed from: a */
    public static final long f30345a = 200;

    /* renamed from: a */
    public static final String f30346a = "ik";

    /* renamed from: a */
    public final Context f30347a;

    /* renamed from: a */
    public boolean f30348a = true;

    /* renamed from: b */
    public boolean f30349b = false;

    public C5730ik(Activity activity) {
        activity.setVolumeControlStream(3);
        this.f30347a = activity.getApplicationContext();
    }

    /* renamed from: e */
    public static /* synthetic */ void m52316e(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m52317f(MediaPlayer mediaPlayer, int i, int i2) {
        String str = f30346a;
        Log.w(str, "Failed to beep " + i + ", " + i2);
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }

    /* renamed from: c */
    public boolean mo38115c() {
        return this.f30348a;
    }

    /* renamed from: d */
    public boolean mo38116d() {
        return this.f30349b;
    }

    /* renamed from: g */
    public MediaPlayer mo38117g() {
        AssetFileDescriptor openRawResourceFd;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(C5437gk.f29212a);
        mediaPlayer.setOnErrorListener(C5521hk.f29661a);
        try {
            openRawResourceFd = this.f30347a.getResources().openRawResourceFd(yd3.C7339j.zxing_beep);
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer.setVolume(0.1f, 0.1f);
            mediaPlayer.prepare();
            mediaPlayer.start();
            return mediaPlayer;
        } catch (IOException e) {
            Log.w(f30346a, e);
            mediaPlayer.reset();
            mediaPlayer.release();
            return null;
        } catch (Throwable th) {
            openRawResourceFd.close();
            throw th;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: h */
    public synchronized void mo38118h() {
        Vibrator vibrator;
        if (this.f30348a) {
            mo38117g();
        }
        if (this.f30349b && (vibrator = (Vibrator) this.f30347a.getSystemService("vibrator")) != null) {
            vibrator.vibrate(200);
        }
    }

    /* renamed from: i */
    public void mo38119i(boolean z) {
        this.f30348a = z;
    }

    /* renamed from: j */
    public void mo38120j(boolean z) {
        this.f30349b = z;
    }
}
