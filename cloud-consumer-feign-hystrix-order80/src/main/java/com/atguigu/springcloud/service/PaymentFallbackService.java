package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author shenghui
 * @version 1.0
 * @since 2020/8/31 14:36
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back -paymentInfo_OK, o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "-----PaymentFallbackService fall back -paymentInfo_Timeout, o(╥﹏╥)o";
    }
}
