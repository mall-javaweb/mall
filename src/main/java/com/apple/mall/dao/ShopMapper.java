package com.apple.mall.dao;


import com.apple.mall.entity.Shop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopMapper {

    List<Shop> findshop(String shopName);

     Shop shop(int id);
}
