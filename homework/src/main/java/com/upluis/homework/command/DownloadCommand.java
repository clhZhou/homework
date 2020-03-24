package com.upluis.homework.command;

/**
 * @author luis
 * @date 2020/3/17
 */
public class DownloadCommand implements IFtpCommand {
    FtpServer ftpServer = new FtpServer();
    @Override
    public void execute() {
        ftpServer.download();
    }
}
