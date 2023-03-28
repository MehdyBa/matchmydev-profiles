package co.simplon.matchmydev.profiles.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.web.multipart.MultipartFile;

public class MaxSizeValidator
		implements ConstraintValidator<MaxSize, MultipartFile> {

	@Override
	public void initialize(MaxSize constraintAnnotation) {
	}

	@Override
	public boolean isValid(MultipartFile avatar,
			ConstraintValidatorContext constraintValidatorContext) {

		if (avatar == null) {
			return true;
		}

		return avatar.getSize() < (1024 * 1024);
	}
}
