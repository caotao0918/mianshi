package jxl;

import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

/**
 * Title: ReadExcel类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class ReadExcel {
    public static void main(String[] args) throws IOException, BiffException {
        File xlsFile = new File("Java三班.xls");
        // 获得工作簿对象
        Workbook workbook = Workbook.getWorkbook(xlsFile);
        // 获得所有工作表
        Sheet[] sheets = workbook.getSheets();
        // 遍历工作表
        if (sheets != null)
        {
            for (Sheet sheet : sheets)
            {
                // 获得行数
                int rows = sheet.getRows();
                // 获得列数
                int cols = sheet.getColumns();
                // 读取数据
                for (int row = 0; row < rows; row++)
                {
                    for (int col = 0; col < cols; col++)
                    {
                        System.out.printf("%8s", sheet.getCell(col, row)
                                .getContents());
                    }
                    System.out.println();
                }
            }
        }
        workbook.close();
    }
}
