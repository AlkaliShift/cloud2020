package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @author shenghui
 * @version 1.0
 * @since 2020/7/10 15:36
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public int create(Payment payment) {
        return 0;
    }

    @Override
    public Payment getPaymentById(Long id) {
        return null;
    }
}
