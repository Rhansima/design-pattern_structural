     
package com.journaldev.design.proxy;
import java.io.IOException;
public class CommandExecutorImp1 implements CommandExecutor{
    public void runCommand(String cmd) throws IOException{
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
    
}
