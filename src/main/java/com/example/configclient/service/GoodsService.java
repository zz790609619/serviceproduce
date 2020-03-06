package com.example.configclient.service;

import com.example.configclient.model.dto.GoodsDto;
import com.example.configclient.model.vo.Goods;

/**
 * @Author helloc
 * @Date 2020/3/2 10:54
 * @Version 1.0
 */
public interface GoodsService {
    /**
     * 添加物品
     * @param goodsDto
     * @return
     */
    Goods addGoods(GoodsDto goodsDto);

}
