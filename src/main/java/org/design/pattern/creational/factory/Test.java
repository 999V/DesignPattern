package org.design.pattern.creational.factory;

import org.design.pattern.creational.factory.enums.PrizesTypeEnum;

import java.util.HashMap;

/**
 * 测试
 *
 * @author zhengxin
 * @date 2023/03/16
 */
public class Test {
    public static void main(String[] args) {
        // 发送优惠券奖品
        PrizesFactory.getPrizesService(PrizesTypeEnum.COUPON.getCode())
                .sendPrizes("9527", "9999", new HashMap<>(0));

        // 发送实物奖品
        PrizesFactory.getPrizesService(PrizesTypeEnum.PHYSICAL.getCode())
                .sendPrizes("9527", "8848", new HashMap<>(0));
    }
}
