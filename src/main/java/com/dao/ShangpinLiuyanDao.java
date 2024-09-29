package com.dao;

import com.entity.ShangpinLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpinLiuyanView;

/**
 * 商品留言 Dao 接口
 *
 * @author 
 */
public interface ShangpinLiuyanDao extends BaseMapper<ShangpinLiuyanEntity> {

   List<ShangpinLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
