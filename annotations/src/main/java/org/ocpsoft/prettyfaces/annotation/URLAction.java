package org.ocpsoft.prettyfaces.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface URLAction
{

   Phase before() default Phase.NONE;

   Phase after() default Phase.NONE;

   boolean onPostback() default true;

}
