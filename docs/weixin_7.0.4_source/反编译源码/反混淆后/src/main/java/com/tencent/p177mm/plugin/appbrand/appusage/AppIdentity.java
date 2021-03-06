package com.tencent.p177mm.plugin.appbrand.appusage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.AppIdentity */
public final class AppIdentity implements Parcelable {
    public static final Creator<AppIdentity> CREATOR = new C267551();
    public final int har;
    public final String username;

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.AppIdentity$1 */
    static class C267551 implements Creator<AppIdentity> {
        C267551() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AppIdentity[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            AppMethodBeat.m2504i(129695);
            AppIdentity appIdentity = new AppIdentity(parcel);
            AppMethodBeat.m2505o(129695);
            return appIdentity;
        }
    }

    public AppIdentity(String str, int i) {
        this.username = str;
        this.har = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AppMethodBeat.m2504i(129696);
        parcel.writeString(this.username);
        parcel.writeInt(this.har);
        AppMethodBeat.m2505o(129696);
    }

    protected AppIdentity(Parcel parcel) {
        AppMethodBeat.m2504i(129697);
        this.username = parcel.readString();
        this.har = parcel.readInt();
        AppMethodBeat.m2505o(129697);
    }

    static {
        AppMethodBeat.m2504i(129698);
        AppMethodBeat.m2505o(129698);
    }
}
