package com.chin.oa.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

import javax.sql.DataSource;
import java.sql.SQLException;

public class DruidDataSourceFactory extends UnpooledDataSourceFactory {//mybatis提供用于提供自定义数据工厂的扩展
    @Override
    public DataSource getDataSource() {
        try {
            ((DruidDataSource)this.dataSource).init();//获取数据源的时候需要额外进行一次数据初始化
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return this.dataSource;
    }
    public DruidDataSourceFactory() {
        this.dataSource = new DruidDataSource();
    }
}
