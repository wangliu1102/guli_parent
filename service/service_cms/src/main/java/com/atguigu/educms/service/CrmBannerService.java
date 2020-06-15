package com.atguigu.educms.service;

import com.atguigu.educms.entity.CrmBanner;
import com.atguigu.educms.entity.vo.BannerQuery;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 首页banner表 服务类
 * </p>
 *
 * @author 王柳
 * @since 2020-06-15
 */
public interface CrmBannerService extends IService<CrmBanner> {

    /**
     * banner 条件分页查询
     *
     * @param pageBanner
     * @param bannerQuery
     */
    void pageQuery(Page<CrmBanner> pageBanner, BannerQuery bannerQuery);

    //查询所有banner
    List<CrmBanner> selectAllBanner();
}
