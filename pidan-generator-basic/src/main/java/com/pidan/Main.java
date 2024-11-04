package com.pidan;

import com.pidan.cli.CommandExecutor;

/**
 * @author 赵永乐
 */
public class Main {

    public static void main(String[] args) {
     // args = new String[]{"generate", "-l", "-a", "-o"};
//        args = new String[]{"config"};
//        args = new String[]{"list"};
        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.doExecute(args);
    }
}
