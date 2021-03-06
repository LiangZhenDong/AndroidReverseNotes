package com.google.android.gms.common.util;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class StrictModeUtils {
    public static ThreadPolicy setDynamiteThreadPolicy() {
        AppMethodBeat.m2504i(90268);
        StrictMode.noteSlowCall("gcore.dynamite");
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(ThreadPolicy.LAX);
        AppMethodBeat.m2505o(90268);
        return threadPolicy;
    }
}
