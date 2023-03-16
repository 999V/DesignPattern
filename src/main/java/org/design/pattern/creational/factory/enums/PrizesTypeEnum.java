package org.design.pattern.creational.factory.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.design.pattern.creational.factory.prizes.CouponPrizesService;
import org.design.pattern.creational.factory.prizes.PhysicalPrizesService;
import org.design.pattern.creational.factory.prizes.PrizesService;

/**
 * 奖品类型枚举
 *
 * @author zhengxin
 * @date 2023/03/16
 */
@Getter
@AllArgsConstructor
public enum PrizesTypeEnum {
    /**
     * 优惠券
     */
    COUPON("coupon", "优惠券", new CouponPrizesService()),
    /**
     * 实物
     */
    PHYSICAL("physical", "实物", new PhysicalPrizesService());

    private final String code;
    private final String desc;
    private final PrizesService prizesService;
}
