/*
 * Copyright 2022 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.metric.web.dao.pinot;

import com.navercorp.pinpoint.metric.common.model.MetricData;
import com.navercorp.pinpoint.metric.common.model.MetricDataName;
import com.navercorp.pinpoint.metric.web.dao.SystemMetricDataTypeDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.Objects;

/**
 * @author minwoo.jung
 */
@Repository
public class PinotSystemMetricDataTypeDao implements SystemMetricDataTypeDao {


    private static final String NAMESPACE = PinotSystemMetricDataTypeDao.class.getName() + ".";

    private final SqlSessionTemplate sqlPinotSessionTemplate;

    public PinotSystemMetricDataTypeDao(SqlSessionTemplate sqlPinotSessionTemplate) {
        this.sqlPinotSessionTemplate = Objects.requireNonNull(sqlPinotSessionTemplate, "sqlPinotSessionTemplate");
    }

    @Override
    public MetricData selectMetricDataType(MetricDataName metricDataName) {
        return sqlPinotSessionTemplate.selectOne(NAMESPACE + "selectMetricDataType", metricDataName);
    }
}
