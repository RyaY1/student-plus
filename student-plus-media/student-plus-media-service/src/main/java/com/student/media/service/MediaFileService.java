package com.student.media.service;

import com.student.base.model.PageParams;
import com.student.base.model.PageResult;
import com.student.base.model.RestResponse;
import com.student.media.model.dto.QueryMediaParamsDto;
import com.student.media.model.dto.UploadFileParamsDto;
import com.student.media.model.dto.UploadFileResultDto;
import com.student.media.model.po.MediaFiles;

/**
 * @author Mr.M
 * @version 1.0
 * @description 媒资文件管理业务类
 * @date 2022/9/10 8:55
 */
public interface MediaFileService {

    /**
     * @param pageParams          分页参数
     * @param queryMediaParamsDto 查询条件
     * @return com.student.base.model.PageResult<com.student.media.model.po.MediaFiles>
     * @description 媒资文件查询方法
     * @author Mr.M
     * @date 2022/9/10 8:57
     */
    public PageResult<MediaFiles> queryMediaFiels(Long companyId, PageParams pageParams, QueryMediaParamsDto queryMediaParamsDto);

    public UploadFileResultDto uploadFile(Long companyId, UploadFileParamsDto uploadFileParamsDto, String localFilePath);

    public MediaFiles addMediaFilesToDb(Long companyId, String fileMd5, UploadFileParamsDto uploadFileParamsDto, String bucket, String objectName);


    /**
     * 检查文件是存在
     *
     * @param fileMd5
     * @return
     */
    public RestResponse<Boolean> checkFile(String fileMd5);

    /**
     * 检查分块是否存在
     *
     * @param fileMd5
     * @param chunkIndex
     * @return
     */
    public RestResponse<Boolean> checkChunk(String fileMd5, int chunkIndex);

    /**
     * 上传分块
     * @param fileMd5
     * @param chunk
     * @param localFilePath
     * @return
     */
    public RestResponse uploadChunk(String fileMd5,int chunk,String localFilePath);

    /**
     * 合并分块
     * @param companyId
     * @param fileMd5
     * @param chunkTotal
     * @param uploadFileParamsDto
     * @return
     */
    public RestResponse mergechunks(Long companyId,String fileMd5,int chunkTotal,UploadFileParamsDto uploadFileParamsDto);
}
