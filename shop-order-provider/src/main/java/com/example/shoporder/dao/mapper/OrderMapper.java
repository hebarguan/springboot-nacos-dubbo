package com.example.shoporder.dao.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper extends BaseMapper {

    @Insert("insert into shop_order (goodname, order_status) values (#{req}, 1)")
    int makeOrder(@Param("req") String goods);
}
