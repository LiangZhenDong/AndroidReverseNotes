package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.afl */
public final class afl extends bsr {
    public LinkedList<C23405ke> wmS = new LinkedList();

    public afl() {
        AppMethodBeat.m2504i(11751);
        AppMethodBeat.m2505o(11751);
    }

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(11752);
        int ix;
        byte[] bArr;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            c6093a.mo13474e(2, 8, this.wmS);
            AppMethodBeat.m2505o(11752);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            int c = ix + C6087a.m9552c(2, 8, this.wmS);
            AppMethodBeat.m2505o(11752);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wmS.clear();
            C6086a c6086a = new C6086a(bArr, unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(11752);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            afl afl = (afl) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C7267hl c7267hl = new C7267hl();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c7267hl.populateBuilderWithField(c6086a3, c7267hl, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        afl.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(11752);
                    return 0;
                case 2:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C23405ke c23405ke = new C23405ke();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c23405ke.populateBuilderWithField(c6086a3, c23405ke, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        afl.wmS.add(c23405ke);
                    }
                    AppMethodBeat.m2505o(11752);
                    return 0;
                default:
                    AppMethodBeat.m2505o(11752);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(11752);
            return -1;
        }
    }
}
