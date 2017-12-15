package com.andreao.salestaxes.helper.bean;

import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;

public class BeanMapperHelper {

	private static final Mapper MAPPER =  DozerBeanMapperSingletonWrapper.getInstance();
	
	private BeanMapperHelper() {
		super();
	}
	
	public static <T> T map(Object o, Class<T> clazz) {
		return MAPPER.map(o, clazz);
	}
	
}
