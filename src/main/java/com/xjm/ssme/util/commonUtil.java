package com.xjm.ssme.util;

public abstract class commonUtil {
	
	  protected   String statment(Class<? extends StandardBean> clz)
	  {
	    StackTraceElement element = new java.lang.Throwable().getStackTrace()[1];
	    return clz.getSimpleName() + "." + element.getMethodName();
	  }

}
