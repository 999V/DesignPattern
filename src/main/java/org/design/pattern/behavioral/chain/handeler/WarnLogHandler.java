package org.design.pattern.behavioral.chain.handeler;

import org.design.pattern.behavioral.chain.enums.LogLevelEnum;

public class WarnLogHandler extends AbstractLogHandler {

    public WarnLogHandler(LogLevelEnum level) {
        this.logLevelEnum = level;
    }

    @Override
    public void printLog(String content) {
        System.out.println("[WARN]" + ":" + content);
    }
}
