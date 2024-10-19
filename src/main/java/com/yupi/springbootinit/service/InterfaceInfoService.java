package com.yupi.springbootinit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.springbootinit.model.entity.InterfaceInfo;


/**
* @author ASUS
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-10-14 22:42:32
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
  void validInterfaceInfo(InterfaceInfo interfaceInfo,boolean add);
}
