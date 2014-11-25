/*******************************************************
 * @author 李智涛
 * @date 2013-8-7 上午09:37:58
 * @name EntityClone.java
 * @JDK version 1.6
 * @version 0
 ******************************************************/
package org.sagacity.util.bean;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 李智涛 实体拷贝
 * 
 */
public class EntityClone {
	/**
	 * @name clone
	 * @active 将源对象中字段与目标对象相同的值拷贝到目标对象中
	 * @state
	 * @type void
	 * @time 上午09:53:12
	 * @exception/throws
	 * @see
	 * @since
	 * @param source
	 * @param target
	 */
	public static void clone(Object source, Object target) {
		if(null != target && null != source){
			Field[] f = source.getClass().getDeclaredFields();
			for(Field f1 : f){
				if(canCloneField(f1.getName(), source, target)){
					try {
						target.getClass().getMethod(
								ReflectUtil.GenerateSetMethod(f1.getName()),
								f1.getType()).invoke(
								target,
								source.getClass().getMethod(
										ReflectUtil.GenerateGetMethod(f1
												.getName()), null).invoke(
										source, null));
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (SecurityException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					} catch (NoSuchMethodException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	/**
	 * @name canCloneField
	 * @active 判断字段是否能够被拷贝, 能够拷贝条件为具有相应字段的set方法
	 * @state
	 * @type boolean
	 * @time 上午09:52:43
	 * @exception/throws
	 * @see
	 * @since
	 * @param field 字段名称
	 * @param target 目标对象
	 * @return
	 */
	public static boolean canCloneField(String field, Object source, Object target){
		boolean flag = false;
		boolean flag2 = false;
		if(null != target && null != field && null != source){
			Field[] f = target.getClass().getDeclaredFields();// 获取目标对象的所有字段名称
			Method[] sm = source.getClass().getDeclaredMethods();
			Method[] m = target.getClass().getDeclaredMethods();
			for(Field f1 : f){
				if(f1.getName().equals(field)){
					for(Method m1 : m){
						if(ReflectUtil.GenerateSetMethod(f1.getName()).equals(m1.getName())){
							flag = true;
							break;
						}
					}
					for(Method m2 : sm){
						if(ReflectUtil.GenerateGetMethod(f1.getName()).equals(m2.getName())){
							flag2 = true;
							break;
						}
					}
					return flag && flag2;
				}
			}
		}
		return false;
	}
}
