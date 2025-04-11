package ex06_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 어노테이션을 적용할 타겟
@Target(ElementType.TYPE)
// 어노테이션이 적용될 시간
@Retention(RetentionPolicy.RUNTIME)
public @interface TestInfo {
	String name(); // 추상 메서드로 선언해야한다
	int career() default 1;	// 추상메서드로 선언해야한다.
	String[] skills();
}
