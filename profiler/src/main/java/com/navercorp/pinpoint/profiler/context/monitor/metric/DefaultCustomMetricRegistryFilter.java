/*
 * Copyright 2020 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.profiler.context.monitor.metric;

import com.navercorp.pinpoint.bootstrap.plugin.monitor.metric.CustomMetric;
import com.navercorp.pinpoint.bootstrap.plugin.monitor.metric.LongCounter;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author Taejin Koo
 */
public class DefaultCustomMetricRegistryFilter implements CustomMetricRegistryFilter {

    // default
    private static final AllowedSource<LongCounter> NETTY_USED_DIRECT_MEMORY = new AllowedSource<>("custom/netty/usedDirectMemory", LongCounter.class);
    private static final AllowedSource<LongCounter> NETTY_MAX_DIRECT_MEMORY = new AllowedSource<>("custom/netty/maxDirectMemory ", LongCounter.class);

    private final AllowedSource<? extends CustomMetric>[] allowedSourceList;

    public DefaultCustomMetricRegistryFilter() {
        this(Arrays.asList(NETTY_USED_DIRECT_MEMORY, NETTY_MAX_DIRECT_MEMORY));
    }

    @SuppressWarnings("unchecked")
    public DefaultCustomMetricRegistryFilter(List<AllowedSource<? extends CustomMetric>> allowedSourceList) {
        Objects.requireNonNull(allowedSourceList, "allowedSourceList");
        this.allowedSourceList = allowedSourceList.toArray(new AllowedSource[0]);
    }

    @Override
    public boolean filter(CustomMetric value) {
        Objects.requireNonNull(value, "value");

        for (AllowedSource<? extends CustomMetric> allowedSource : allowedSourceList) {
            if (contains(allowedSource, value)) {
                return NOT_FILTERED;
            }
        }
        return FILTERED;
    }


    private boolean contains(AllowedSource<? extends CustomMetric> allowedSource, CustomMetric value) {
        if (!allowedSource.getMetricName().equals(value.getName())) {
            return false;
        }
        if (!allowedSource.getMetricClazz().isInstance(value)) {
            return false;
        }
        return true;
    }

    public static class AllowedSource<T extends CustomMetric> {

        private final String metricName;
        private final Class<T> metricClazz;

        public AllowedSource(String metricName, Class<T> metricClazz) {
            this.metricName = Objects.requireNonNull(metricName, "metricName");
            this.metricClazz = Objects.requireNonNull(metricClazz, "metricClazz");
        }

        public String getMetricName() {
            return metricName;
        }

        public Class<T> getMetricClazz() {
            return metricClazz;
        }

    }

}
