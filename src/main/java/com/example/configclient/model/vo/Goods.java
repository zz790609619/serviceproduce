package com.example.configclient.model.vo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author helloc
 * @Date 2020/3/2 10:57
 * @Version 1.0
 */
@Entity(name = "goods")
public class Goods implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int goodsid;

    @Column(name = "goodsname")
    private String goodsname;
    @Column(name = "count")
    private int count;

    @Override
    public String toString() {
        return "Goods{" +
                "goodsid=" + goodsid +
                ", goodsname='" + goodsname + '\'' +
                ", count=" + count +
                '}';
    }

    public int getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(int goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
