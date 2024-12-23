package com.pidan.maker.cli.command;

import cn.hutool.core.io.FileUtil;
import picocli.CommandLine.Command;

import java.io.File;
import java.util.List;

/**
 * @author 赵永乐
 */
@Command(name = "list", description = "查看文件列表", mixinStandardHelpOptions = true)
public class ListCommand implements Runnable {

    public void run() {
        String projectPath = System.getProperty("user.dir");
        // 整个项目的根路径
        File parentFile = new File(projectPath).getParentFile();
        // 输入路径
        String inputPath = new File(parentFile, "pidan-generator-maker/acm-template").getAbsolutePath();
        //遍历文件列表
        List<File> files = FileUtil.loopFiles(inputPath);
        //输出文件信息
        for (File file : files) {
            System.out.println(file);
        }
    }

}