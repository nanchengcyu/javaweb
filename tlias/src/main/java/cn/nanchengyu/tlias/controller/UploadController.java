package cn.nanchengyu.tlias.controller;

import cn.nanchengyu.tlias.pojo.Result;
import cn.nanchengyu.tlias.utils.AliOSSUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;



/**
 * ClassName: UploadController
 * Package: cn.nanchengyu.tlias.controller
 * Description:
 *  这种上传文件大小有限制，可以在yaml中进行配置
 * @Author 南城余
 * @Create 2023/12/22 16:33
 * @Version 1.0
 */
@Slf4j
@RestController
public class UploadController {
    @Autowired
    private AliOSSUtils aliOSSUtils;

//    /**
//     * 本地存储方法
//     * @param username
//     * @param age
//     * @param image
//     * @return
//     * @throws Exception
//     */
//    @PostMapping("/upload")
//    public Result upload(String username, Integer age, MultipartFile image) throws Exception {
//        log.info("文件上传：{}，{}，{}",username,age,image);
//        //获取原始文件名
//        String originalFilename = image.getOriginalFilename();
//        //构建唯一的文件名
//        int index = originalFilename.lastIndexOf(".");
//        String extname = originalFilename.substring(index);
//       String newFileName = UUID.randomUUID().toString() + extname ;
//        //将文件存储到服务器的磁盘中
//        image.transferTo(new File("D:\\upload\\" + newFileName));
//
//        return Result.success();
//    }
    @PostMapping("/upload")
    public Result upload(MultipartFile image) throws Exception {
        String url = aliOSSUtils.upload(image);

        return Result.success(url);
    }
}
