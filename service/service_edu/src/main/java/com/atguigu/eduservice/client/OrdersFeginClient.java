package com.atguigu.eduservice.client;

import org.springframework.stereotype.Component;

/**
 * @author 王柳
 * @date 2020/6/22 11:44
 */
@Component
public class OrdersFeginClient implements OrdersClient {
    @Override
    public boolean isBuyCourse(String courseId, String memberId) {
        System.out.println("订单错误");
        return false;
    }
}
