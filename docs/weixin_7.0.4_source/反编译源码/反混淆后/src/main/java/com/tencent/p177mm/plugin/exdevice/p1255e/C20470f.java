package com.tencent.p177mm.plugin.exdevice.p1255e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import com.tencent.p177mm.p205bt.C1332b;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.plugin.exdevice.e.f */
public final class C20470f extends C42986i {
    public C1332b luV;
    public C1332b luW;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(19423);
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.lvj != null) {
                c6093a.mo13479iy(1, this.lvj.computeSize());
                this.lvj.writeFields(c6093a);
            }
            if (this.luV != null) {
                c6093a.mo13473c(2, this.luV);
            }
            if (this.luW != null) {
                c6093a.mo13473c(3, this.luW);
            }
            AppMethodBeat.m2505o(19423);
            return 0;
        } else if (i == 1) {
            if (this.lvj != null) {
                ix = C6087a.m9557ix(1, this.lvj.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.luV != null) {
                ix += C6091a.m9571b(2, this.luV);
            }
            if (this.luW != null) {
                ix += C6091a.m9571b(3, this.luW);
            }
            AppMethodBeat.m2505o(19423);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(19423);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C20470f c20470f = (C20470f) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        C38932d c38932d = new C38932d();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = c38932d.populateBuilderWithField(c6086a3, c38932d, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c20470f.lvj = c38932d;
                    }
                    AppMethodBeat.m2505o(19423);
                    return 0;
                case 2:
                    c20470f.luV = c6086a2.BTU.emu();
                    AppMethodBeat.m2505o(19423);
                    return 0;
                case 3:
                    c20470f.luW = c6086a2.BTU.emu();
                    AppMethodBeat.m2505o(19423);
                    return 0;
                default:
                    AppMethodBeat.m2505o(19423);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(19423);
            return -1;
        }
    }
}
