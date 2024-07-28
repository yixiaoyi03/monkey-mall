package com.lingyi.mall.ums.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lingyi.mall.ums.dto.MemberAddressDTO;
import com.lingyi.mall.ums.pojo.entity.UmsAddress;
import com.lingyi.mall.ums.pojo.form.AddressForm;

import java.util.List;

/**
 * 会员地址业务接口
 *
 * @author Yixiaoyi03
 * @date 2022/2/12
 */
public interface IUmsAddressService extends IService<UmsAddress> {

    /**
     * 新增地址
     *
     * @param addressForm
     * @return
     */
    boolean addAddress(AddressForm addressForm);

    /**
     * 修改地址
     *
     * @param addressForm
     * @return
     */
    boolean updateAddress(AddressForm addressForm);

    /**
     * 获取当前登录会员的地址列表
     *
     * @return
     */
    List<MemberAddressDTO> listCurrentMemberAddresses();
}
