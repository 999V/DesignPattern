package org.design.pattern.structural.template;

/**
 * 抽象数据解析器
 *
 * @author zhengxin
 * @date 2022/05/09
 */
public abstract class AbstractFileParser {
    /**
     * 读取文件
     */
    public abstract void readFile();

    /**
     * 解析文件
     */
    public abstract void parseFile();

    /**
     * 关闭文件
     */
    public abstract void closeFile();


    /**
     * 执行解析
     */
    public final void doParse(){
        readFile();
        parseFile();
        closeFile();
    }
}
