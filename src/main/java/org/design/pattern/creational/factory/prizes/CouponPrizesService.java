package org.design.pattern.creational.factory.prizes;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * 优惠券奖品服务
 *
 * @author zhengxin
 * @date 2023/03/16
 */
@Slf4j
public class CouponPrizesService implements PrizesService {

    @Override
    public void sendPrizes(String uId, String prizesId, Map<String, String> extMap) {
        // todo 模拟发送优惠券
        log.info("[模拟发送优惠券奖品] => uId:{}, prizesId:{}, extMap:{}", uId, prizesId, extMap);
    }

}
