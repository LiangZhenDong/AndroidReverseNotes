package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class qt extends bsr {
    public int Scene;
    public String mZr;
    public String ndF;
    public String ndT;
    public int vFH;
    public int vXK;
    public LinkedList<bts> vXL = new LinkedList();
    public String vXM;
    public String vXN;

    public qt() {
        AppMethodBeat.i(11731);
        AppMethodBeat.o(11731);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(11732);
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.iz(2, this.vFH);
            if (this.ndF != null) {
                aVar.e(3, this.ndF);
            }
            if (this.ndT != null) {
                aVar.e(4, this.ndT);
            }
            if (this.mZr != null) {
                aVar.e(5, this.mZr);
            }
            aVar.iz(6, this.vXK);
            aVar.e(7, 8, this.vXL);
            if (this.vXM != null) {
                aVar.e(8, this.vXM);
            }
            if (this.vXN != null) {
                aVar.e(9, this.vXN);
            }
            aVar.iz(10, this.Scene);
            AppMethodBeat.o(11732);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += e.a.a.b.b.a.bs(2, this.vFH);
            if (this.ndF != null) {
                ix += e.a.a.b.b.a.f(3, this.ndF);
            }
            if (this.ndT != null) {
                ix += e.a.a.b.b.a.f(4, this.ndT);
            }
            if (this.mZr != null) {
                ix += e.a.a.b.b.a.f(5, this.mZr);
            }
            ix = (ix + e.a.a.b.b.a.bs(6, this.vXK)) + e.a.a.a.c(7, 8, this.vXL);
            if (this.vXM != null) {
                ix += e.a.a.b.b.a.f(8, this.vXM);
            }
            if (this.vXN != null) {
                ix += e.a.a.b.b.a.f(9, this.vXN);
            }
            int bs = ix + e.a.a.b.b.a.bs(10, this.Scene);
            AppMethodBeat.o(11732);
            return bs;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.vXL.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(11732);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            qt qtVar = (qt) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        hl hlVar = new hl();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        qtVar.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(11732);
                    return 0;
                case 2:
                    qtVar.vFH = aVar3.BTU.vd();
                    AppMethodBeat.o(11732);
                    return 0;
                case 3:
                    qtVar.ndF = aVar3.BTU.readString();
                    AppMethodBeat.o(11732);
                    return 0;
                case 4:
                    qtVar.ndT = aVar3.BTU.readString();
                    AppMethodBeat.o(11732);
                    return 0;
                case 5:
                    qtVar.mZr = aVar3.BTU.readString();
                    AppMethodBeat.o(11732);
                    return 0;
                case 6:
                    qtVar.vXK = aVar3.BTU.vd();
                    AppMethodBeat.o(11732);
                    return 0;
                case 7:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bts bts = new bts();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bts.populateBuilderWithField(aVar4, bts, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        qtVar.vXL.add(bts);
                    }
                    AppMethodBeat.o(11732);
                    return 0;
                case 8:
                    qtVar.vXM = aVar3.BTU.readString();
                    AppMethodBeat.o(11732);
                    return 0;
                case 9:
                    qtVar.vXN = aVar3.BTU.readString();
                    AppMethodBeat.o(11732);
                    return 0;
                case 10:
                    qtVar.Scene = aVar3.BTU.vd();
                    AppMethodBeat.o(11732);
                    return 0;
                default:
                    AppMethodBeat.o(11732);
                    return -1;
            }
        } else {
            AppMethodBeat.o(11732);
            return -1;
        }
    }
}
