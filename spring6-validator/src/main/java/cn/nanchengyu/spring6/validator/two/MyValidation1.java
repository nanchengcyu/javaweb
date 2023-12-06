package cn.nanchengyu.spring6.validator.two;


import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: MyValidation1
 * Package: cn.nanchengyu.spring6.validator.two
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/6 15:57
 * @Version 1.0
 */
@Service
public class MyValidation1 {
    @Autowired
    private Validator validator;
    public boolean validateByUserOne(User user){
       return  validator.validate(user).size() == 0;
    }

}
