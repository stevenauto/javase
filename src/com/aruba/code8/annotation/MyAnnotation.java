package com.aruba.code8.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation
{
	String hello() default "shengsiyuan";

	String world();
}
