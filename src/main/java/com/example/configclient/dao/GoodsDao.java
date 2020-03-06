package com.example.configclient.dao;

import com.example.configclient.model.vo.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author helloc
 * @Date 2020/3/2 11:08
 * @Version 1.0
 */
public interface GoodsDao extends JpaRepository<Goods,Integer> {

    @Override
    Goods save(Goods goods);
}
