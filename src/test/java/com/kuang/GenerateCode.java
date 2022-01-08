package com.kuang;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.Arrays;

/**
 * @Author meditat0r
 * @create 2021/11/29 17:53
 */
public class GenerateCode {
    public static void main(String[] args) {
        AutoGenerator generator = new AutoGenerator();

        // 1、全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        // 设置生成路径
        // System.getProperty("user.dir")获取当前目录
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        globalConfig.setAuthor("meditat0r");
        globalConfig.setOpen(false);
        // 去service的I前缀
        globalConfig.setServiceName(("%sService"));
        globalConfig.setSwagger2(true);
        globalConfig.setFileOverride(false);
        generator.setGlobalConfig(globalConfig);

        // 2、数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://101.133.134.62:3306/mybatis_plus?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimeZone=UTC");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("txl19970409");
        generator.setDataSource(dataSourceConfig);

        // 3、包的配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.kuang");
        packageConfig.setEntity("pojo");
        packageConfig.setMapper("mapper");
        packageConfig.setService("service");
        packageConfig.setController("controller");
        generator.setPackageInfo(packageConfig);

        // 4、策略配置
        TableFill createTime = new TableFill("createTime", FieldFill.INSERT);
        TableFill updateTime = new TableFill("updateTime", FieldFill.UPDATE);
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setInclude("user")// 设置要映射的表名
                .setNaming(NamingStrategy.underline_to_camel)
                .setColumnNaming(NamingStrategy.underline_to_camel)
                .setEntityLombokModel(true)
                .setLogicDeleteFieldName("deleted")
                .setTableFillList(Arrays.asList(createTime, updateTime))
                .setVersionFieldName("version")
                .setRestControllerStyle(true)
                .setControllerMappingHyphenStyle(true);
        generator.setStrategy(strategyConfig);

        generator.execute();
    }
}
