package com.pidan.generator;

import com.pidan.model.MainTemplateConfig;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * 核心生成器
 */
public class MainGenerator {

    /**
     * 生成
     *
     * @param model 数据模型
     * @throws TemplateException
     * @throws IOException
     */
    public static void doGenerate(Object model) throws TemplateException, IOException {

        String inputRootPath = "D:\\Javadevelop\\daimashengchengqigongxiangxiangmu\\" +
                "pidan-generator\\pidan-generator-demo-projects\\acm-template-pro";
        String outputRootPath = "D:\\Javadevelop\\daimashengchengqigongxiangxiangmu\\" +
                "pidan-generator";

        String inputPath;
        String outputPath;

        inputPath = new File(inputRootPath,
                "src/com/pidan/acm/MainTemplate.java.ftl").getAbsolutePath();
        outputPath = new File(outputRootPath,
                "src/com/pidan/acm/MainTemplate.java").getAbsolutePath();
        DynamicGenerator.doGenerate(inputPath, outputPath, model);

        inputPath = new File(inputRootPath, ".gitignore").getAbsolutePath();
        outputPath = new File(outputRootPath, ".gitignore").getAbsolutePath();
        // 生成静态文件
        StaticGenerator.copyFilesByHutool(inputPath, outputPath);

        inputPath = new File(inputRootPath, "README.md").getAbsolutePath();
        outputPath = new File(outputRootPath, "README.md").getAbsolutePath();
        // 生成静态文件
        StaticGenerator.copyFilesByHutool(inputPath, outputPath);


    }

    public static void main(String[] args) throws TemplateException, IOException {
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        mainTemplateConfig.setAuthor("皮蛋");
        mainTemplateConfig.setLoop(false);
        mainTemplateConfig.setOutputText("求和结果2：");
        doGenerate(mainTemplateConfig);
    }
}
