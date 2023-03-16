package org.design.pattern.creational.factory;

import org.design.pattern.creational.factory.enums.PrizesTypeEnum;
import org.design.pattern.creational.factory.prizes.PrizesService;

/**
 * 奖品工厂
 *
 * @author zhengxin
 * @date 2023/03/16
 */
public class PrizesFactory {

    /**
     * 获取奖品服务
     *
     * @param prizesType 奖品类型
     * @return {@link PrizesService}
     */
    public static PrizesService getPrizesService(String prizesType) {
        for (PrizesTypeEnum typeEnum : PrizesTypeEnum.values()) {
            if (typeEnum.getCode().equals(prizesType)) {
                return typeEnum.getPrizesService();
            }
        }
        throw new IllegalArgumentException("奖品类型错误");
    }

}
