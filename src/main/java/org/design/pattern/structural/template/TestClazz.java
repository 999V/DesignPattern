package org.design.pattern.structural.template;

import org.design.pattern.structural.template.parser.CsvParser;
import org.design.pattern.structural.template.parser.ExcelParser;

/**
 * 测试类
 *
 * @author zhengxin
 * @date 2022/05/09
 */
public class TestClazz {
    public static void main(String[] args) {
        // 解析 CSV 文件
        AbstractFileParser csvParser = new CsvParser();
        csvParser.doParse();

        // 解析 Excel 文件
        AbstractFileParser excelParser = new ExcelParser();
        excelParser.doParse();
    }
}
