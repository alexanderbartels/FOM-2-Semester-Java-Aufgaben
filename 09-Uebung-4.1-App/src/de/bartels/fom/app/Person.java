package de.bartels.fom.app;

import java.lang.reflect.Field;

public class Person {

	private String name;

	public Person(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void printInfo() {
		System.out.println(getInfo(this.getClass(), ""));
	}
	
	private String getInfo(Class<?> objClass, String str) {
	    try {
	        StringBuffer sb = new StringBuffer();

	        Field[] fields = objClass.getDeclaredFields();
	        for(Field field : fields) {
	        	field.setAccessible(true);
	            String name = field.getName();
	            Object value = field.get(this);

	            sb.append(name + ": " + value.toString() + "\n");
	        }
	        if ( objClass.getSuperclass( ) == Object.class ) {
	        	return str + sb.toString();
	        }
	        return getInfo(objClass.getSuperclass(), str + sb.toString());
	    } catch(Exception e) {
	    	e.printStackTrace();
	    	return str;
	    }
	}
}
