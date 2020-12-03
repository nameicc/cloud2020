package com.tingyu.cloud.service.fallback;

import com.tingyu.cloud.entity.CommonResult;
import com.tingyu.cloud.service.IPaymentService;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/3 17:53
 **/
@Component
public class PaymentServiceFallback implements IPaymentService {

    @Override
    public CommonResult getPayment(long id) {
        return new CommonResult(444, "service fallback");
    }

}
