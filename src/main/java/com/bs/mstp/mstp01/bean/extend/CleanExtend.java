package com.bs.mstp.mstp01.bean.extend;

import com.bs.mstp.mstp01.bean.Clean;
import com.bs.mstp.mstp01.bean.Goods;

public class CleanExtend extends Clean {
    private Goods goods;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}
