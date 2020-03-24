package com.upluis.homework.command;

/**
 * @author luis
 * @date 2020/3/17
 */
public class Test {
    public static void main(String[] args) {
        IFtpCommand downloadCommand = new DownloadCommand();
        IFtpCommand uploadCommand = new UploadCommand();
        FtpUtil ftpUtil = new FtpUtil(downloadCommand);
        ftpUtil.action();
        FtpUtil ftpUtil1 = new FtpUtil(uploadCommand);
        ftpUtil1.action();

    }
}
