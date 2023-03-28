package co.simplon.matchmydev.profiles.fileSizeAnnotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MaxSizeValidator.class)
@Documented
public @interface MaxSize {

	String message() default "Max upload size exceeded. It should be less or equal to 512Mb";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	long maxSizeInMB() default 512;
}
