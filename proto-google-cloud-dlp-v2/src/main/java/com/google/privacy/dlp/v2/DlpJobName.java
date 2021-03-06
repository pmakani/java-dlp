/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.privacy.dlp.v2;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** AUTO-GENERATED DOCUMENTATION AND CLASS */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class DlpJobName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/dlpJobs/{dlp_job}");

  private volatile Map<String, String> fieldValuesMap;

  private final String project;
  private final String dlpJob;

  public String getProject() {
    return project;
  }

  public String getDlpJob() {
    return dlpJob;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private DlpJobName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    dlpJob = Preconditions.checkNotNull(builder.getDlpJob());
  }

  public static DlpJobName of(String project, String dlpJob) {
    return newBuilder().setProject(project).setDlpJob(dlpJob).build();
  }

  public static String format(String project, String dlpJob) {
    return newBuilder().setProject(project).setDlpJob(dlpJob).build().toString();
  }

  public static DlpJobName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            formattedString, "DlpJobName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("dlp_job"));
  }

  public static List<DlpJobName> parseList(List<String> formattedStrings) {
    List<DlpJobName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<DlpJobName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (DlpJobName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("project", project);
          fieldMapBuilder.put("dlpJob", dlpJob);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "dlp_job", dlpJob);
  }

  /** Builder for DlpJobName. */
  public static class Builder {

    private String project;
    private String dlpJob;

    public String getProject() {
      return project;
    }

    public String getDlpJob() {
      return dlpJob;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setDlpJob(String dlpJob) {
      this.dlpJob = dlpJob;
      return this;
    }

    private Builder() {}

    private Builder(DlpJobName dlpJobName) {
      project = dlpJobName.project;
      dlpJob = dlpJobName.dlpJob;
    }

    public DlpJobName build() {
      return new DlpJobName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DlpJobName) {
      DlpJobName that = (DlpJobName) o;
      return (this.project.equals(that.project)) && (this.dlpJob.equals(that.dlpJob));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= dlpJob.hashCode();
    return h;
  }
}
