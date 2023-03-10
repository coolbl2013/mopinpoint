/*
 * Copyright 2018 NAVER Corp.
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
package com.navercorp.pinpoint.plugin.mongo;

import com.navercorp.pinpoint.bootstrap.config.ProfilerConfig;

/**
 * @author Roy Kimd
 */
public class MongoConfig {

    private final boolean enable;
    private final boolean collectJson;
    private final boolean traceBsonBindValue;

    public MongoConfig(ProfilerConfig config) {
        this.enable = config.readBoolean("profiler.mongo", false);
        this.collectJson = config.readBoolean("profiler.mongo.collectjson", false);
        this.traceBsonBindValue = config.readBoolean("profiler.mongo.tracebsonbindvalue", false);
    }

    public boolean isEnable() {
        return enable;
    }

    public boolean isCollectJson() {
        return collectJson;
    }

    public boolean istraceBsonBindValue() {
        return traceBsonBindValue;
    }

    @Override
    public String toString() {
        return "MongoConfig{" +
                "enable=" + enable +
                ", collectJson=" + collectJson +
                ", traceBsonBindValue=" + traceBsonBindValue +
                '}';
    }
}

