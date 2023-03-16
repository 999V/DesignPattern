package org.design.pattern.creational.factory.prizes;

import java.util.Map;

/**
 * 奖品服务
 *
 * @author zhengxin
 * @date 2023/03/16
 */
public interface PrizesService {
    /**
     * 发送奖品
     *
     * @param uId      用户id
     * @param prizesId 奖品id
     * @param extMap   扩展信息
     */
    void sendPrizes(String uId, String prizesId, Map<String, String> extMap);
}
