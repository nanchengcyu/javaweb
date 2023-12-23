package cn.nanchengyu.tlias;

import cn.nanchengyu.tlias.mapper.DeptMapper;
import cn.nanchengyu.tlias.pojo.Dept;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.List;


//@SpringBootTest//这个注解会加载整个spring环境 ，在测试单个方法时，可以先注解掉
class TliasApplicationTests {

    @Test
    void getDept() {
//        @Autowired
//        DeptMapper deptMapper;
//        List<Dept> list = deptMapper.list();
    }

    /**
     * 测试生成JWT
     */
    @Test
    public  void testGenJwt(){
        HashMap<String, Object> claims = new HashMap<>();
        claims.put("id", 1);
        claims.put("name","nanchengyu");
        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256,"nanchengyu") //签名算法
                .setClaims(claims)  //自定义内容（载荷）
                .setExpiration(new Date(System.currentTimeMillis() +3600 * 1000)) //设置有效期
                .compact();
        System.out.println(jwt);
    }

    /**
     * 解析Jwt令牌
     */
    @Test
    public void testParseJwt(){

        JwtParser parser = Jwts.parser();


                parser.setSigningKey("nanchengyu") //签名算法
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoibmFuY2hlbmd5dSIsImlkIjoxLCJleHAiOjE3MDMyNTQ0NjV9.vJPPd-Od4guIF7x55JsAvxX4K-m536x2NTNnNemmkhE")
                .getBody();
        System.out.println(parser);

    }


}
