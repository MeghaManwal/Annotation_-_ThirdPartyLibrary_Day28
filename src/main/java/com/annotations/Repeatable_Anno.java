package com.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface Words {
	String word() default "Hello";
	int value() default 0;
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
	Words[] value();
}


public class Repeatable_Anno {

	@Words(word ="First", value = 1)
	@Words(word ="Second", value = 2)
	
	public static void newMethod() {
		Repeatable_Anno obj = new Repeatable_Anno();
		
		 try { 
			 Class<?> c = obj.getClass();
			 
			 Method method = c.getMethod("newMethod");
			 Annotation anno = method.getAnnotation(MyRepeatedAnnos.class);
			   System.out.println(anno);
	        }catch (NoSuchMethodException e){
	            System.out.println(e);
	        }
	    
	}
		 
	public static void main(String[] args) {
        newMethod();
    }
	

}
