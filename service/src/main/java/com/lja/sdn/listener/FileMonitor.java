package com.lja.sdn.listener;

import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;

public class FileMonitor {

	private FileAlterationMonitor monitor;

	public FileMonitor(long interval) {
		monitor = new FileAlterationMonitor(interval);
	}

	/**
	 * 给文件添加监听
	 *
	 * @param path     文件路径
	 * @param listener 文件监听器
	 */
	public void monitor(String path, FileAlterationListener listener) {
		FileAlterationObserver observer = new FileAlterationObserver(new File(path));
		monitor.addObserver(observer);
		observer.addListener(listener);
	}

	public void stop() throws Exception {
		monitor.stop();
	}

	public void start() throws Exception {
		monitor.start();
	}
}