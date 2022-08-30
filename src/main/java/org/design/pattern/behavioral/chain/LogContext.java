package org.design.pattern.behavioral.chain;

import lombok.Data;
import lombok.experimental.Accessors;
import org.design.pattern.behavioral.chain.enums.LogLevelEnum;

@Data
@Accessors(chain = true)
public class LogContext {
    /**
     * 日志级别
     */
    private LogLevelEnum level;

    /**
     * 日志内容
     */
    private String content;
}
