package org.design.pattern.structural.template.parser;

import org.design.pattern.structural.template.AbstractFileParser;

/**
 * csv文件解析器
 *
 * @author zhengxin
 * @date 2022/05/09
 */
public class CsvParser extends AbstractFileParser {

    @Override
    public void readFile() {
        System.out.println("读取.csv 文件...");
    }

    @Override
    public void parseFile() {
        System.out.println("解析.csv 文件...");
    }

    @Override
    public void closeFile() {
        System.out.println("关闭.csv 文件...");
    }
}
