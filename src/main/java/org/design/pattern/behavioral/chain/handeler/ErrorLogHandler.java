package org.design.pattern.behavioral.chain.handeler;

import org.design.pattern.behavioral.chain.LogContext;
import org.design.pattern.behavioral.chain.enums.LogLevelEnum;
import org.design.pattern.behavioral.chain.handeler.AbstractLogHandler;

public class ErrorLogHandler extends AbstractLogHandler {

    public ErrorLogHandler(LogLevelEnum level) {
        this.logLevelEnum = level;
    }

    @Override
    public void printLog(String content) {
        System.out.println("[ERROR]" + ":" + content);
    }
}
