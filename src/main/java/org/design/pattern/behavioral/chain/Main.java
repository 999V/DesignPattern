package org.design.pattern.behavioral.chain;

import org.design.pattern.behavioral.chain.enums.LogLevelEnum;
import org.design.pattern.behavioral.chain.handeler.*;

public class Main {
    public static void main(String[] args) {
        LogContext logContext = new LogContext()
                .setLevel(LogLevelEnum.ERROR)
                .setContent("这是一条测试用的日志");

        AbstractLogHandler chainOfLogHandlers = getChainOfLogHandlers();
        chainOfLogHandlers.handle(logContext);
    }

    /**
     * 获取日志处理链
     *
     * @return {@link AbstractLogHandler}
     */
    public static AbstractLogHandler getChainOfLogHandlers() {
        AbstractLogHandler infoLogHandler = new InfoLogHandler(LogLevelEnum.INFO);
        AbstractLogHandler debugLogHandler = new DebugLogHandler(LogLevelEnum.DEBUG);
        AbstractLogHandler warnLogHandler = new WarnLogHandler(LogLevelEnum.WARN);
        AbstractLogHandler errorLogHandler = new ErrorLogHandler(LogLevelEnum.ERROR);
        infoLogHandler
                .setNextLogHandler(debugLogHandler)
                .setNextLogHandler(warnLogHandler)
                .setNextLogHandler(errorLogHandler);
        return infoLogHandler;
    }
}
