package org.design.pattern.behavioral.chain.handeler;

import org.design.pattern.behavioral.chain.LogContext;
import org.design.pattern.behavioral.chain.enums.LogLevelEnum;

public class DebugLogHandler extends AbstractLogHandler{

    public DebugLogHandler(LogLevelEnum level) {
        this.logLevelEnum = level;
    }

    @Override
    public void printLog(String content) {
        System.out.println("[DEBUG]" + ":" + content);
    }
}
