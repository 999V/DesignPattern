package org.design.pattern.behavioral.chain.handeler;


import org.design.pattern.behavioral.chain.LogContext;
import org.design.pattern.behavioral.chain.enums.LogLevelEnum;
import org.design.pattern.behavioral.chain.handeler.AbstractLogHandler;

public class InfoLogHandler extends AbstractLogHandler {

    public InfoLogHandler(LogLevelEnum level) {
        this.logLevelEnum = level;
    }

    @Override
    public void printLog(String content) {
        System.out.println("[INFO]" + ":" + content);
    }
}
