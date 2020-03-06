package com.example.configclient.model.dto;

import java.io.Serializable;

/**
 * @Author helloc
 * @Date 2020/3/2 11:16
 * @Version 1.0
 */
public class GoodsDto implements Serializable {
    private int goodsId;
    private String goodsName;
    private int count;

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
