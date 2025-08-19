package com.ruoyi.web.core.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {
    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        // 单机模式
        config.useSingleServer()
                .setAddress("redis://124.221.132.157:6379") // Redis 地址
                .setPassword("mzh@123456")                    // 密码（如有）
                .setDatabase(0);                      // 使用的数据库索引

        // 集群模式（可选）
        // config.useClusterServers().addNodeAddress("redis://192.168.1.1:6379");

        return Redisson.create(config);
    }
}
