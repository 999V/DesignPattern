package org.design.pattern.structural.template.parser;

import org.design.pattern.structural.template.AbstractFileParser;

/**
 * excel文件解析器
 *
 * @author zhengxin
 * @date 2022/05/09
 */
public class ExcelParser extends AbstractFileParser {
    @Override
    public void readFile() {
        System.out.println("读取.xlsx 文件...");
    }

    @Override
    public void parseFile() {
        System.out.println("解析.xlsx 文件...");
    }

    @Override
    public void closeFile() {
        System.out.println("关闭.xlsx 文件...");
    }
}
