package com.lja.sdn.listener;

import com.lja.sdn.util.LinuxUtils;

/**
 * @author lja
 * @since 2023-06-1
 */
public class FileListenerTest {

    public static void main(String[] args) throws Exception {
        FileMonitor fileMonitor = new FileMonitor(1000);
        fileMonitor.monitor(LinuxUtils.localPath2, new FileListener());
        fileMonitor.start();
    }

}
