
package com.shardingsphere.demo.hint.sharding;

import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 对比所有可用的分库分表键值，然后与传入的强制分片键进行精准匹配，从而确定目标的库表信息
 *
 * @author lzn
 */
public final class MatchHintShardingAlgorithm implements HintShardingAlgorithm<Long> {
    
    @Override
    public Collection<String> doSharding(final Collection<String> availableTargetNames, final HintShardingValue<Long> shardingValue) {
        Collection<String> result = new ArrayList<>();
        for (String each : availableTargetNames) {
            for (Long value : shardingValue.getValues()) {
                if (each.endsWith(String.valueOf(value))) {
                    result.add(each);
                }
            }
        }
        return result;
    }
}
