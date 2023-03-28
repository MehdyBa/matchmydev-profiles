package co.simplon.matchmydev.profiles.fileSizeAnnotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.web.multipart.MultipartFile;

public class MaxSizeValidator
		implements ConstraintValidator<MaxSize, MultipartFile> {

	private static final Integer MB = 1024 * 1024;

	private long maxSizeInMB;

	@Override
	public void initialize(MaxSize maxSize) {
		this.maxSizeInMB = maxSize.maxSizeInMB();
	}

	@Override
	public boolean isValid(MultipartFile avatar,
			ConstraintValidatorContext constraintValidatorContext) {

		if (avatar == null) {
			return true;
		}

		return avatar.getSize() < (maxSizeInMB * MB);
	}
}
