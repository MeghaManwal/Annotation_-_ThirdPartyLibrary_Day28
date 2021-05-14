package com.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.annotations.Method.MethodInfo;

public class CustomAnnotations {
	
	@MethodInfo(comments = "This is Annotation Message", date = "13-May-2021")
	public void display() {
		System.out.println("Display");
	}
	
	public static void main(String[] args) {
		
        try{
            for(Method method : CustomAnnotations.class.getMethods()){
                if(method.isAnnotationPresent(MethodInfo.class)){
                    try{
                        for(Annotation anno : method.getDeclaredAnnotations()){
                            System.out.println("Annotation u=in method'" + method + "' : " + anno);
                        }
                        MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
                        if(methodAnno.revision() == 1){
                            System.out.println("Method with revision no 1 = " + method);
                        }
                    } catch ( Throwable ex){
                        ex.printStackTrace();
                    }
                }
            }
        } catch(SecurityException e){
            e.printStackTrace();
        }
    }

}
