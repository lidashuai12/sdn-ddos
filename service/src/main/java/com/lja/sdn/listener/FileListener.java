package com.lja.sdn.listener;

import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.Date;

/**
 * @author lja
 * @since 2023-06-1
 */
public class FileListener extends FileAlterationListenerAdaptor {

    @Override
    public void onFileChange(File file) {
        String compressedPath = file.getAbsolutePath();
        System.out.println("时间：" + new Date() + "  " + "修改：" + compressedPath);
    }

}
