package com.b.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

final class l {
    float bEK;
    long bEO;
    private final float[] bEP = new float[3];
    private int bEQ;
    private long bER;
    long bES;

    l() {
        AppMethodBeat.i(55604);
        AppMethodBeat.o(55604);
    }

    /* Access modifiers changed, original: final */
    public final void a(float f, int i, long j) {
        AppMethodBeat.i(55605);
        long j2 = j - this.bER;
        if (j2 > this.bEO) {
            Arrays.fill(this.bEP, 0.0f);
            this.bEQ = 0;
            this.bER = 0;
            this.bES = 0;
            this.bEK = 0.0f;
        } else {
            this.bES = j2 + this.bES;
        }
        this.bEP[0] = this.bEP[1];
        this.bEP[1] = this.bEP[2];
        this.bEP[2] = f;
        if (this.bEP[2] != 0.0f) {
            float f2 = this.bEP[0] != 0.0f ? ((this.bEP[0] + this.bEP[1]) + this.bEP[2]) / 3.0f : this.bEP[1] != 0.0f ? (this.bEP[1] + this.bEP[2]) / 2.0f : this.bEP[2];
            this.bEK = ((((float) i) / (f2 + (this.bEP[2] * 3.0f))) * y.bIP) + ((y.bIQ * ((float) (i - this.bEQ))) / ((float) ((this.bEQ + i) + 1)));
        }
        this.bEQ = i;
        this.bER = j;
        AppMethodBeat.o(55605);
    }
}
