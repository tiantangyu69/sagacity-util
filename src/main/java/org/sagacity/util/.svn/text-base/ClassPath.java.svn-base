/*******************************************************
 * @author LIZHITAO
 * @date 2013-8-27 上午09:38:34
 * @name ClassPath.java
 * @JDK version 1.6
 * @version 0
 ******************************************************/
package org.sagacity.util;

import java.io.File;

/**
 * @author LIZHITAO 获取classPath工具类
 * 
 */
public class ClassPath {

	public String getClassPath() {
		File f = new File(this.getClass().getResource("/").getPath());
		return f.getPath();
	}

	public static String classPath(){
		ClassPath c = new ClassPath();
		return c.getClassPath();
	}
}
