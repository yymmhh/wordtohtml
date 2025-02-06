package cn.wlphp;

import com.aspose.words.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

public class main {


    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");


        String docPath=args[0];
        String saveHtmlPath=args[1];
        System.out.println(Arrays.toString(args));
//        String encodedString = "UBosaC8yCwoLMAgvHn56BSxyWhMRIx0gAhoMFxwEBXV9IXNQBTYMEyo+CDYDdQF/GmMJXS0iCTMjJ1Z/";
//        String result = decode(encodedString);
//        System.out.println("Decoded String: " + result);

//        String wordPath = "/Users/wl/Downloads/副本53.15-常识判断-法律 (1).docx";
        //word转html
//        FileInputStream inputStream = new FileInputStream(new File(wordPath));
//        wordToHtml();

        Document doc = new Document(docPath);

        // 加载 Word 文档

        // 配置 HTML 保存选项
        HtmlSaveOptions options = new HtmlSaveOptions(SaveFormat.HTML);
        options.setCssStyleSheetType(CssStyleSheetType.EXTERNAL); // 不生成 CSS
        options.setExportHeadersFootersMode(ExportHeadersFootersMode.NONE); // 不导出页眉页脚
        options.setPrettyFormat(true); // 美化 HTML 代码
        options.setExportImagesAsBase64(true);  // 图片以 Base64 格式嵌入
        options.setExportListLabels(ExportListLabels.AS_INLINE_TEXT); // 保留有序列表

        // 保存为 HTML
        doc.save(saveHtmlPath, options);

        System.out.println("转换完成，HTML 文件已生成（无 CSS）！");
//        String htmlText= wordToHtml(inputStream);
//
//        System.out.println(htmlText);

    }
 }
