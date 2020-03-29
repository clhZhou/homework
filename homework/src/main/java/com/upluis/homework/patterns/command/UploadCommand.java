package com.upluis.homework.patterns.command;

/**
 * @author luis
 * @date 2020/3/17
 */
public class UploadCommand implements IFtpCommand{
    FtpServer ftpServer = new FtpServer();
    @Override
    public void execute() {
        ftpServer.upload();
    }
}
