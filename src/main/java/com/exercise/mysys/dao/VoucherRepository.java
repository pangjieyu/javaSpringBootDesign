package com.exercise.mysys.dao;

import com.exercise.mysys.domain.Voucher;

import java.util.List;

/**
 * @ProjectName 食品企业订货销售系统
 * @Author 朱向阳
 * @Date 2018/7/20 14:52
 * @Description: 凭证类的数据访问层
 */
public interface VoucherRepository {
    List<Voucher> findAll();
}
