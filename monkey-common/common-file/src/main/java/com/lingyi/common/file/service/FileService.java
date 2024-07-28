package com.lingyi.common.file.service;

import com.lingyi.common.file.vo.FileInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件接口
 * <p>
 * 已实现 MinIO
 *
 * @author Yixiaoyi03
 * @date 2022/11/19
 */
public interface FileService {

    /**
     * 上传文件
     * @param file 表单文件对象
     * @return
     */
    FileInfo uploadFile(MultipartFile file);

    /**
     * 删除文件
     *
     * @param filePath 文件路径
     * @return
     */
    boolean deleteFile(String filePath);


}
