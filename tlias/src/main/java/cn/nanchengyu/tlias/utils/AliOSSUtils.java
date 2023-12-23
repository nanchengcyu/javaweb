package cn.nanchengyu.tlias.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.common.auth.CredentialsProviderFactory;
import com.aliyun.oss.common.auth.EnvironmentVariableCredentialsProvider;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * ClassName: AliOSSUtils
 * Package: cn.nanchengyu.tlias.utils
 * Description:
 *
 * @Author 南城余
 * @Create 2023/12/22 17:40
 * @Version 1.0
 */
@Component
public class AliOSSUtils {
   private String endpoint = "https://oss-cn-shanghai.aliyuncs.com";
    // 从环境变量中获取访问凭证。运行本代码示例之前，请确保已设置环境变量OSS_ACCESS_KEY_ID和OSS_ACCESS_KEY_SECRET。

    private String accessKeyId = "xxxxxxxxx";
    private String accessKeySecret = "xxxxxxxx";
   private String bucketName = "xxxxxxx";
   //此处这些配置，可以通过配置文件配置 并在每个上面添加 @Value("{}")
   public String upload(MultipartFile file) throws IOException{
       // 获取上传的文件的输入流
       InputStream inputStream = file.getInputStream();

       // 避免文件覆盖
       String originalFilename = file.getOriginalFilename();
       String fileName = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."));

       //上传文件到 OSS
       OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
       ossClient.putObject(bucketName, fileName, inputStream);

       //文件访问路径
       String url = endpoint.split("//")[0] + "//" + bucketName + "." + endpoint.split("//")[1] + "/" + fileName;
       // 关闭ossClient
       ossClient.shutdown();
       return url;// 把上传到oss的路径返回


   }
}
