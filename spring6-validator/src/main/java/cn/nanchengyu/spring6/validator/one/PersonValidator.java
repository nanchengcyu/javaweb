package cn.nanchengyu.spring6.validator.one;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * ClassName: PersonValidator
 * Package: cn.nanchengyu.spring6.validator.one
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/6 12:28
 * @Version 1.0
 */
public class PersonValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        //name不能为空
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty","name isnot null");
        //age限制 0-200
        Person p = (Person)target;
        if (p.getAge() > 200 || p.getAge() < 0) {
            errors.rejectValue("age", "age.invalid","age isnot 0-200");

    }
}
}
