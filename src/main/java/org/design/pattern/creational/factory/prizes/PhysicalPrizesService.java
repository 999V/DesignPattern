package org.design.pattern.creational.factory.prizes;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * 实物奖品服务
 *
 * @author zhengxin
 * @date 2023/03/16
 */
@Slf4j
public class PhysicalPrizesService implements PrizesService {

    @Override
    public void sendPrizes(String uId, String prizesId, Map<String, String> extMap) {
        // todo 模拟发送实物奖品
        log.info("[模拟发送实物奖品] => uId:{}, prizesId:{}, extMap:{}", uId, prizesId, extMap);
    }

}
