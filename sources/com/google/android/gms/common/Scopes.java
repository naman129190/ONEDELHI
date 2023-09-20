package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.mr2;

public final class Scopes {
    @mr2
    public static final String APP_STATE = "https://www.googleapis.com/auth/appstate";
    @mr2
    public static final String CLOUD_SAVE = "https://www.googleapis.com/auth/datastoremobile";
    @mr2
    public static final String DRIVE_APPFOLDER = "https://www.googleapis.com/auth/drive.appdata";
    @mr2
    @KeepForSdk
    public static final String DRIVE_APPS = "https://www.googleapis.com/auth/drive.apps";
    @mr2
    public static final String DRIVE_FILE = "https://www.googleapis.com/auth/drive.file";
    @mr2
    @KeepForSdk
    public static final String DRIVE_FULL = "https://www.googleapis.com/auth/drive";
    @mr2
    public static final String EMAIL = "email";
    @mr2
    public static final String GAMES = "https://www.googleapis.com/auth/games";
    @mr2
    @KeepForSdk
    public static final String GAMES_LITE = "https://www.googleapis.com/auth/games_lite";
    @mr2
    @KeepForSdk
    public static final String LEGACY_USERINFO_EMAIL = "https://www.googleapis.com/auth/userinfo.email";
    @mr2
    @KeepForSdk
    public static final String LEGACY_USERINFO_PROFILE = "https://www.googleapis.com/auth/userinfo.profile";
    @mr2
    @KeepForSdk
    public static final String OPEN_ID = "openid";
    @mr2
    @Deprecated
    public static final String PLUS_LOGIN = "https://www.googleapis.com/auth/plus.login";
    @mr2
    public static final String PLUS_ME = "https://www.googleapis.com/auth/plus.me";
    @mr2
    public static final String PROFILE = "profile";

    private Scopes() {
    }
}
