package com.courage.shardingsphere.jdbc.service.sharding;

import org.apache.shardingsphere.sharding.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.sharding.api.sharding.complex.ComplexKeysShardingValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * 复合分片算法 :
 * 主键id 是雪花算法 workerId = crc32(shardingKey) % 1024
 */
public class HashSlotAlgorithm implements ComplexKeysShardingAlgorithm {

    public final static Logger logger = LoggerFactory.getLogger(HashSlotAlgorithm.class);

    @Override
    public void init(Properties properties) {
        logger.info("begin to load");
    }

    @Override
    public Collection<String> doSharding(Collection collection, ComplexKeysShardingValue complexKeysShardingValue) {
        return null;
    }

}
