package com.exercise.mysys.dao;

import com.exercise.mysys.domain.Destroy;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ProjectName 食品企业订货销售系统
 * @Author 朱向阳
 * @Date 2018/7/20 16:26
 * @Description: 销毁单类的数据访问层
 */
public interface DestroyRepository extends JpaRepository<Destroy,Long>{
}
