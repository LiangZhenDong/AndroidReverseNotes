package com.tencent.mm.plugin.downloader.c.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.btd;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class m extends btd {
    public n kKG;
    public i kKH;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(35522);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(35522);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            if (this.kKG != null) {
                aVar.iy(2, this.kKG.computeSize());
                this.kKG.writeFields(aVar);
            }
            if (this.kKH != null) {
                aVar.iy(3, this.kKH.computeSize());
                this.kKH.writeFields(aVar);
            }
            AppMethodBeat.o(35522);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.kKG != null) {
                ix += e.a.a.a.ix(2, this.kKG.computeSize());
            }
            if (this.kKH != null) {
                ix += e.a.a.a.ix(3, this.kKH.computeSize());
            }
            AppMethodBeat.o(35522);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(35522);
                throw bVar;
            }
            AppMethodBeat.o(35522);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            m mVar = (m) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(aVar4, baseResponse, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        mVar.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(35522);
                    return 0;
                case 2:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        n nVar = new n();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = nVar.populateBuilderWithField(aVar4, nVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        mVar.kKG = nVar;
                    }
                    AppMethodBeat.o(35522);
                    return 0;
                case 3:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        i iVar = new i();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = iVar.populateBuilderWithField(aVar4, iVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        mVar.kKH = iVar;
                    }
                    AppMethodBeat.o(35522);
                    return 0;
                default:
                    AppMethodBeat.o(35522);
                    return -1;
            }
        } else {
            AppMethodBeat.o(35522);
            return -1;
        }
    }
}
