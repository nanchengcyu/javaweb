package cn.nanchengyu.headline.test;

import cn.nanchengyu.headline.util.JwtHelper;
import org.junit.Test;

/**
 * ClassName: TestJwtHelper
 * Package: cn.nanchengyu.headline.test
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/1 19:20
 * @Version 1.0
 */
public class TestJwtHelper {
    @Test
  public void testAllMethod() throws InterruptedException{
      String token = JwtHelper.createToken(1L);
      System.out.println(token);
      Long userId = JwtHelper.getUserId(token);
      System.out.println(userId);

      System.out.println(JwtHelper.isExpiration(token));

      Thread.sleep(5000);

      System.out.println(JwtHelper.isExpiration(token));
  }
}
