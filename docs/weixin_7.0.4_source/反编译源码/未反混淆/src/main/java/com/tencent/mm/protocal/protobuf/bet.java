package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class bet extends a {
    public String desc;
    public int id;
    public String nickname;
    public String wrK;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(10226);
        int bs;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.iz(1, this.id);
            if (this.nickname != null) {
                aVar.e(2, this.nickname);
            }
            if (this.wrK != null) {
                aVar.e(3, this.wrK);
            }
            if (this.desc != null) {
                aVar.e(4, this.desc);
            }
            AppMethodBeat.o(10226);
            return 0;
        } else if (i == 1) {
            bs = e.a.a.b.b.a.bs(1, this.id) + 0;
            if (this.nickname != null) {
                bs += e.a.a.b.b.a.f(2, this.nickname);
            }
            if (this.wrK != null) {
                bs += e.a.a.b.b.a.f(3, this.wrK);
            }
            if (this.desc != null) {
                bs += e.a.a.b.b.a.f(4, this.desc);
            }
            AppMethodBeat.o(10226);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (bs = a.getNextFieldNumber(aVar2); bs > 0; bs = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, bs)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(10226);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bet bet = (bet) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    bet.id = aVar3.BTU.vd();
                    AppMethodBeat.o(10226);
                    return 0;
                case 2:
                    bet.nickname = aVar3.BTU.readString();
                    AppMethodBeat.o(10226);
                    return 0;
                case 3:
                    bet.wrK = aVar3.BTU.readString();
                    AppMethodBeat.o(10226);
                    return 0;
                case 4:
                    bet.desc = aVar3.BTU.readString();
                    AppMethodBeat.o(10226);
                    return 0;
                default:
                    AppMethodBeat.o(10226);
                    return -1;
            }
        } else {
            AppMethodBeat.o(10226);
            return -1;
        }
    }
}
