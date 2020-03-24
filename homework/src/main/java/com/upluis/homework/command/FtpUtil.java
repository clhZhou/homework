package com.upluis.homework.command;

/**
 * @author luis
 * @date 2020/3/17
 */
public class FtpUtil {
    private IFtpCommand mCmd;

    public FtpUtil(IFtpCommand cmd) {
        this.mCmd = cmd;
    }

    public void action() {
        this.mCmd.execute();
    }
}
