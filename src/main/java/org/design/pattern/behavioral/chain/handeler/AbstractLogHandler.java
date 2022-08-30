package org.design.pattern.behavioral.chain.handeler;

import lombok.extern.slf4j.Slf4j;
import org.design.pattern.behavioral.chain.LogContext;
import org.design.pattern.behavioral.chain.enums.LogLevelEnum;

/**
 * 摘要日志处理程序
 *
 * @author keanu
 * @date 2022/08/30
 */
@Slf4j
public abstract class AbstractLogHandler {
    protected LogLevelEnum logLevelEnum;

    protected Integer nextHandler;

    protected AbstractLogHandler nextLogHandler;

    public AbstractLogHandler setNextLogHandler(AbstractLogHandler nextLogHandler) {
        this.nextLogHandler = nextLogHandler;
        return this.nextLogHandler;
    }

    public void handle(LogContext logContext) {
        if (this.logLevelEnum.equals(logContext.getLevel())) {
            log.info("当前日志级别为【{}】,可以处理【{}】日志级别", this.logLevelEnum, logContext.getLevel());
            printLog(logContext.getContent());
        } else {
            if (nextLogHandler != null) {
                log.info("当前节点处理级别【{}】,无法处理【{}】级别日志,进入下一个节点处理级别【{}】", this.logLevelEnum, logContext.getLevel(), nextLogHandler.logLevelEnum);
                nextLogHandler.handle(logContext);
            } else {
                throw new RuntimeException("无法处理 " + logContext.getLevel() + " 级别的日志");
            }
        }
    }

    public abstract void printLog(String content);
}
