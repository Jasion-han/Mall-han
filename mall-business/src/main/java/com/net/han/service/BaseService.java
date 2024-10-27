package com.net.han.service;

import com.net.han.exception.BusinessException;
import com.net.han.mapper.BaseMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.List;

/**
 * @author han @Date 2024/10/27 18:06
 */
@Slf4j
public abstract class BaseService<K, V> {

    protected abstract BaseMapper getBaseMapper();

    public boolean customizeExport(V v) {
        return false;
    }

//    public void export(V v, String fileName, String clazzName) {
//        if (customizeExport(v)) {if (customizeExport(v)) {
//            return;
//        }
//        doExport(v, fileName, clazzName);
//    }
//
//    private void doExport(V v, String fileName, String clazzName) {
//        RequestConditionEntity conditionEntity = (RequestConditionEntity) v;
//        BetweenTimeUtil.parseTime(conditionEntity);
//        conditionEntity.setPageSize(0);
//        List<K> dataEntities = getBaseMapper().searchByCondition(conditionEntity);
//        try{
//            ExcelUtil.exportExcel(fileName, Class.forName(clazzName), dataEntities);
//        } catch (ClassNotFoundException e) {
//            log.error("数据导出异常，没有找到:{}", clazzName);
//            throw new BusinessException(String.format("数据导出异常，没有找到:%s", clazzName));
//        } catch (IOException e) {
//            log.error("数据导出异常，IO异常:", e);
//            throw new BusinessException("数据导出异常，IO异常");
//        }
//    }
}
