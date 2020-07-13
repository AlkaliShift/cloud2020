package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author shenghui
 * @version 1.0
 * @since 2020/7/10 14:44
 */
@Mapper
public interface PaymentDao {

    /**
     * 新增支付
     *
     * @param payment 支付对象
     * @return 新增对象的ID
     */
    public int create(Payment payment);

    /**
     * 根据ID查询
     *
     * @param id ID
     * @return 支付对象
     */
    public Payment getPaymentById(@Param("id") Long id);
}
