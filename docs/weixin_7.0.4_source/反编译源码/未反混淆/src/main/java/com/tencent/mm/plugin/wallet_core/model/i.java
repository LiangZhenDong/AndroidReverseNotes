package com.tencent.mm.plugin.wallet_core.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.c;

public final class i {
    public int tyd = 0;
    public String tye = "";
    public int tyf = 0;
    public String tyg = "";
    public int tyh = 0;
    public c tyi = new c();

    public i() {
        AppMethodBeat.i(46739);
        AppMethodBeat.o(46739);
    }

    public i(Bundle bundle) {
        AppMethodBeat.i(46740);
        this.tyd = bundle.getInt("key_is_gen_cert", 0);
        this.tyf = bundle.getInt("key_is_hint_crt", 0);
        this.tyh = bundle.getInt("key_is_ignore_cert", 0);
        this.tye = bundle.getString("key_crt_token", "");
        this.tyg = bundle.getString("key_crt_wording", "");
        this.tyi = new c(this.tyg);
        AppMethodBeat.o(46740);
    }

    public final boolean cPm() {
        AppMethodBeat.i(46741);
        if (this.tyf == 0 || bo.isNullOrNil(this.tyg)) {
            AppMethodBeat.o(46741);
            return false;
        }
        AppMethodBeat.o(46741);
        return true;
    }

    public final boolean cPn() {
        if (this.tyd == 1) {
            return true;
        }
        return false;
    }

    public final boolean cPo() {
        AppMethodBeat.i(46742);
        if (cPn() && this.tyh == 0) {
            AppMethodBeat.o(46742);
            return true;
        }
        AppMethodBeat.o(46742);
        return false;
    }
}
