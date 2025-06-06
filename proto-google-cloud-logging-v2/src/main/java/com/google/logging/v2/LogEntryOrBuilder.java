/*
 * Copyright 2025 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/log_entry.proto

// Protobuf Java Version: 3.25.8
package com.google.logging.v2;

public interface LogEntryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.LogEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the log to which this log entry belongs:
   *
   *     "projects/[PROJECT_ID]/logs/[LOG_ID]"
   *     "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]"
   *     "folders/[FOLDER_ID]/logs/[LOG_ID]"
   *
   * A project number may be used in place of PROJECT_ID. The project number is
   * translated to its corresponding PROJECT_ID internally and the `log_name`
   * field will contain PROJECT_ID in queries and exports.
   *
   * `[LOG_ID]` must be URL-encoded within `log_name`. Example:
   * `"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
   *
   * `[LOG_ID]` must be less than 512 characters long and can only include the
   * following characters: upper and lower case alphanumeric characters,
   * forward-slash, underscore, hyphen, and period.
   *
   * For backward compatibility, if `log_name` begins with a forward-slash, such
   * as `/projects/...`, then the log entry is ingested as usual, but the
   * forward-slash is removed. Listing the log entry will not show the leading
   * slash and filtering for a log name with a leading slash will never return
   * any results.
   * </pre>
   *
   * <code>string log_name = 12 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The logName.
   */
  java.lang.String getLogName();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the log to which this log entry belongs:
   *
   *     "projects/[PROJECT_ID]/logs/[LOG_ID]"
   *     "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]"
   *     "folders/[FOLDER_ID]/logs/[LOG_ID]"
   *
   * A project number may be used in place of PROJECT_ID. The project number is
   * translated to its corresponding PROJECT_ID internally and the `log_name`
   * field will contain PROJECT_ID in queries and exports.
   *
   * `[LOG_ID]` must be URL-encoded within `log_name`. Example:
   * `"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
   *
   * `[LOG_ID]` must be less than 512 characters long and can only include the
   * following characters: upper and lower case alphanumeric characters,
   * forward-slash, underscore, hyphen, and period.
   *
   * For backward compatibility, if `log_name` begins with a forward-slash, such
   * as `/projects/...`, then the log entry is ingested as usual, but the
   * forward-slash is removed. Listing the log entry will not show the leading
   * slash and filtering for a log name with a leading slash will never return
   * any results.
   * </pre>
   *
   * <code>string log_name = 12 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for logName.
   */
  com.google.protobuf.ByteString getLogNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The monitored resource that produced this log entry.
   *
   * Example: a log entry that reports a database error would be associated with
   * the monitored resource designating the particular database that reported
   * the error.
   * </pre>
   *
   * <code>.google.api.MonitoredResource resource = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the resource field is set.
   */
  boolean hasResource();

  /**
   *
   *
   * <pre>
   * Required. The monitored resource that produced this log entry.
   *
   * Example: a log entry that reports a database error would be associated with
   * the monitored resource designating the particular database that reported
   * the error.
   * </pre>
   *
   * <code>.google.api.MonitoredResource resource = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The resource.
   */
  com.google.api.MonitoredResource getResource();

  /**
   *
   *
   * <pre>
   * Required. The monitored resource that produced this log entry.
   *
   * Example: a log entry that reports a database error would be associated with
   * the monitored resource designating the particular database that reported
   * the error.
   * </pre>
   *
   * <code>.google.api.MonitoredResource resource = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.api.MonitoredResourceOrBuilder getResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * The log entry payload, represented as a protocol buffer. Some Google
   * Cloud Platform services use this field for their log entry payloads.
   *
   * The following protocol buffer types are supported; user-defined types
   * are not supported:
   *
   *   "type.googleapis.com/google.cloud.audit.AuditLog"
   *   "type.googleapis.com/google.appengine.logging.v1.RequestLog"
   * </pre>
   *
   * <code>.google.protobuf.Any proto_payload = 2;</code>
   *
   * @return Whether the protoPayload field is set.
   */
  boolean hasProtoPayload();

  /**
   *
   *
   * <pre>
   * The log entry payload, represented as a protocol buffer. Some Google
   * Cloud Platform services use this field for their log entry payloads.
   *
   * The following protocol buffer types are supported; user-defined types
   * are not supported:
   *
   *   "type.googleapis.com/google.cloud.audit.AuditLog"
   *   "type.googleapis.com/google.appengine.logging.v1.RequestLog"
   * </pre>
   *
   * <code>.google.protobuf.Any proto_payload = 2;</code>
   *
   * @return The protoPayload.
   */
  com.google.protobuf.Any getProtoPayload();

  /**
   *
   *
   * <pre>
   * The log entry payload, represented as a protocol buffer. Some Google
   * Cloud Platform services use this field for their log entry payloads.
   *
   * The following protocol buffer types are supported; user-defined types
   * are not supported:
   *
   *   "type.googleapis.com/google.cloud.audit.AuditLog"
   *   "type.googleapis.com/google.appengine.logging.v1.RequestLog"
   * </pre>
   *
   * <code>.google.protobuf.Any proto_payload = 2;</code>
   */
  com.google.protobuf.AnyOrBuilder getProtoPayloadOrBuilder();

  /**
   *
   *
   * <pre>
   * The log entry payload, represented as a Unicode string (UTF-8).
   * </pre>
   *
   * <code>string text_payload = 3;</code>
   *
   * @return Whether the textPayload field is set.
   */
  boolean hasTextPayload();

  /**
   *
   *
   * <pre>
   * The log entry payload, represented as a Unicode string (UTF-8).
   * </pre>
   *
   * <code>string text_payload = 3;</code>
   *
   * @return The textPayload.
   */
  java.lang.String getTextPayload();

  /**
   *
   *
   * <pre>
   * The log entry payload, represented as a Unicode string (UTF-8).
   * </pre>
   *
   * <code>string text_payload = 3;</code>
   *
   * @return The bytes for textPayload.
   */
  com.google.protobuf.ByteString getTextPayloadBytes();

  /**
   *
   *
   * <pre>
   * The log entry payload, represented as a structure that is
   * expressed as a JSON object.
   * </pre>
   *
   * <code>.google.protobuf.Struct json_payload = 6;</code>
   *
   * @return Whether the jsonPayload field is set.
   */
  boolean hasJsonPayload();

  /**
   *
   *
   * <pre>
   * The log entry payload, represented as a structure that is
   * expressed as a JSON object.
   * </pre>
   *
   * <code>.google.protobuf.Struct json_payload = 6;</code>
   *
   * @return The jsonPayload.
   */
  com.google.protobuf.Struct getJsonPayload();

  /**
   *
   *
   * <pre>
   * The log entry payload, represented as a structure that is
   * expressed as a JSON object.
   * </pre>
   *
   * <code>.google.protobuf.Struct json_payload = 6;</code>
   */
  com.google.protobuf.StructOrBuilder getJsonPayloadOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The time the event described by the log entry occurred. This time
   * is used to compute the log entry's age and to enforce the logs retention
   * period. If this field is omitted in a new log entry, then Logging assigns
   * it the current time. Timestamps have nanosecond accuracy, but trailing
   * zeros in the fractional seconds might be omitted when the timestamp is
   * displayed.
   *
   * Incoming log entries must have timestamps that don't exceed the
   * [logs retention
   * period](https://cloud.google.com/logging/quotas#logs_retention_periods) in
   * the past, and that don't exceed 24 hours in the future. Log entries outside
   * those time boundaries aren't ingested by Logging.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();

  /**
   *
   *
   * <pre>
   * Optional. The time the event described by the log entry occurred. This time
   * is used to compute the log entry's age and to enforce the logs retention
   * period. If this field is omitted in a new log entry, then Logging assigns
   * it the current time. Timestamps have nanosecond accuracy, but trailing
   * zeros in the fractional seconds might be omitted when the timestamp is
   * displayed.
   *
   * Incoming log entries must have timestamps that don't exceed the
   * [logs retention
   * period](https://cloud.google.com/logging/quotas#logs_retention_periods) in
   * the past, and that don't exceed 24 hours in the future. Log entries outside
   * those time boundaries aren't ingested by Logging.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();

  /**
   *
   *
   * <pre>
   * Optional. The time the event described by the log entry occurred. This time
   * is used to compute the log entry's age and to enforce the logs retention
   * period. If this field is omitted in a new log entry, then Logging assigns
   * it the current time. Timestamps have nanosecond accuracy, but trailing
   * zeros in the fractional seconds might be omitted when the timestamp is
   * displayed.
   *
   * Incoming log entries must have timestamps that don't exceed the
   * [logs retention
   * period](https://cloud.google.com/logging/quotas#logs_retention_periods) in
   * the past, and that don't exceed 24 hours in the future. Log entries outside
   * those time boundaries aren't ingested by Logging.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time the log entry was received by Logging.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp receive_timestamp = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the receiveTimestamp field is set.
   */
  boolean hasReceiveTimestamp();

  /**
   *
   *
   * <pre>
   * Output only. The time the log entry was received by Logging.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp receive_timestamp = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The receiveTimestamp.
   */
  com.google.protobuf.Timestamp getReceiveTimestamp();

  /**
   *
   *
   * <pre>
   * Output only. The time the log entry was received by Logging.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp receive_timestamp = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getReceiveTimestampOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The severity of the log entry. The default value is
   * `LogSeverity.DEFAULT`.
   * </pre>
   *
   * <code>.google.logging.type.LogSeverity severity = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for severity.
   */
  int getSeverityValue();

  /**
   *
   *
   * <pre>
   * Optional. The severity of the log entry. The default value is
   * `LogSeverity.DEFAULT`.
   * </pre>
   *
   * <code>.google.logging.type.LogSeverity severity = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The severity.
   */
  com.google.logging.type.LogSeverity getSeverity();

  /**
   *
   *
   * <pre>
   * Optional. A unique identifier for the log entry. If you provide a value,
   * then Logging considers other log entries in the same project, with the same
   * `timestamp`, and with the same `insert_id` to be duplicates which are
   * removed in a single query result. However, there are no guarantees of
   * de-duplication in the export of logs.
   *
   * If the `insert_id` is omitted when writing a log entry, the Logging API
   * assigns its own unique identifier in this field.
   *
   * In queries, the `insert_id` is also used to order log entries that have
   * the same `log_name` and `timestamp` values.
   * </pre>
   *
   * <code>string insert_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The insertId.
   */
  java.lang.String getInsertId();

  /**
   *
   *
   * <pre>
   * Optional. A unique identifier for the log entry. If you provide a value,
   * then Logging considers other log entries in the same project, with the same
   * `timestamp`, and with the same `insert_id` to be duplicates which are
   * removed in a single query result. However, there are no guarantees of
   * de-duplication in the export of logs.
   *
   * If the `insert_id` is omitted when writing a log entry, the Logging API
   * assigns its own unique identifier in this field.
   *
   * In queries, the `insert_id` is also used to order log entries that have
   * the same `log_name` and `timestamp` values.
   * </pre>
   *
   * <code>string insert_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for insertId.
   */
  com.google.protobuf.ByteString getInsertIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. Information about the HTTP request associated with this log
   * entry, if applicable.
   * </pre>
   *
   * <code>
   * .google.logging.type.HttpRequest http_request = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the httpRequest field is set.
   */
  boolean hasHttpRequest();

  /**
   *
   *
   * <pre>
   * Optional. Information about the HTTP request associated with this log
   * entry, if applicable.
   * </pre>
   *
   * <code>
   * .google.logging.type.HttpRequest http_request = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The httpRequest.
   */
  com.google.logging.type.HttpRequest getHttpRequest();

  /**
   *
   *
   * <pre>
   * Optional. Information about the HTTP request associated with this log
   * entry, if applicable.
   * </pre>
   *
   * <code>
   * .google.logging.type.HttpRequest http_request = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.logging.type.HttpRequestOrBuilder getHttpRequestOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A map of key, value pairs that provides additional information
   * about the log entry. The labels can be user-defined or system-defined.
   *
   * User-defined labels are arbitrary key, value pairs that you can use to
   * classify logs.
   *
   * System-defined labels are defined by GCP services for platform logs.
   * They have two components - a service namespace component and the
   * attribute name. For example: `compute.googleapis.com/resource_name`.
   *
   * Cloud Logging truncates label keys that exceed 512 B and label
   * values that exceed 64 KB upon their associated log entry being
   * written. The truncation is indicated by an ellipsis at the
   * end of the character string.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Optional. A map of key, value pairs that provides additional information
   * about the log entry. The labels can be user-defined or system-defined.
   *
   * User-defined labels are arbitrary key, value pairs that you can use to
   * classify logs.
   *
   * System-defined labels are defined by GCP services for platform logs.
   * They have two components - a service namespace component and the
   * attribute name. For example: `compute.googleapis.com/resource_name`.
   *
   * Cloud Logging truncates label keys that exceed 512 B and label
   * values that exceed 64 KB upon their associated log entry being
   * written. The truncation is indicated by an ellipsis at the
   * end of the character string.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Optional. A map of key, value pairs that provides additional information
   * about the log entry. The labels can be user-defined or system-defined.
   *
   * User-defined labels are arbitrary key, value pairs that you can use to
   * classify logs.
   *
   * System-defined labels are defined by GCP services for platform logs.
   * They have two components - a service namespace component and the
   * attribute name. For example: `compute.googleapis.com/resource_name`.
   *
   * Cloud Logging truncates label keys that exceed 512 B and label
   * values that exceed 64 KB upon their associated log entry being
   * written. The truncation is indicated by an ellipsis at the
   * end of the character string.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Optional. A map of key, value pairs that provides additional information
   * about the log entry. The labels can be user-defined or system-defined.
   *
   * User-defined labels are arbitrary key, value pairs that you can use to
   * classify logs.
   *
   * System-defined labels are defined by GCP services for platform logs.
   * They have two components - a service namespace component and the
   * attribute name. For example: `compute.googleapis.com/resource_name`.
   *
   * Cloud Logging truncates label keys that exceed 512 B and label
   * values that exceed 64 KB upon their associated log entry being
   * written. The truncation is indicated by an ellipsis at the
   * end of the character string.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. A map of key, value pairs that provides additional information
   * about the log entry. The labels can be user-defined or system-defined.
   *
   * User-defined labels are arbitrary key, value pairs that you can use to
   * classify logs.
   *
   * System-defined labels are defined by GCP services for platform logs.
   * They have two components - a service namespace component and the
   * attribute name. For example: `compute.googleapis.com/resource_name`.
   *
   * Cloud Logging truncates label keys that exceed 512 B and label
   * values that exceed 64 KB upon their associated log entry being
   * written. The truncation is indicated by an ellipsis at the
   * end of the character string.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Information about an operation associated with the log entry, if
   * applicable.
   * </pre>
   *
   * <code>
   * .google.logging.v2.LogEntryOperation operation = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the operation field is set.
   */
  boolean hasOperation();

  /**
   *
   *
   * <pre>
   * Optional. Information about an operation associated with the log entry, if
   * applicable.
   * </pre>
   *
   * <code>
   * .google.logging.v2.LogEntryOperation operation = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The operation.
   */
  com.google.logging.v2.LogEntryOperation getOperation();

  /**
   *
   *
   * <pre>
   * Optional. Information about an operation associated with the log entry, if
   * applicable.
   * </pre>
   *
   * <code>
   * .google.logging.v2.LogEntryOperation operation = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.logging.v2.LogEntryOperationOrBuilder getOperationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The REST resource name of the trace being written to
   * [Cloud Trace](https://cloud.google.com/trace) in
   * association with this log entry. For example, if your trace data is stored
   * in the Cloud project "my-trace-project" and if the service that is creating
   * the log entry receives a trace header that includes the trace ID "12345",
   * then the service should use "projects/my-tracing-project/traces/12345".
   *
   * The `trace` field provides the link between logs and traces. By using
   * this field, you can navigate from a log entry to a trace.
   * </pre>
   *
   * <code>string trace = 22 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The trace.
   */
  java.lang.String getTrace();

  /**
   *
   *
   * <pre>
   * Optional. The REST resource name of the trace being written to
   * [Cloud Trace](https://cloud.google.com/trace) in
   * association with this log entry. For example, if your trace data is stored
   * in the Cloud project "my-trace-project" and if the service that is creating
   * the log entry receives a trace header that includes the trace ID "12345",
   * then the service should use "projects/my-tracing-project/traces/12345".
   *
   * The `trace` field provides the link between logs and traces. By using
   * this field, you can navigate from a log entry to a trace.
   * </pre>
   *
   * <code>string trace = 22 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for trace.
   */
  com.google.protobuf.ByteString getTraceBytes();

  /**
   *
   *
   * <pre>
   * Optional. The ID of the [Cloud Trace](https://cloud.google.com/trace) span
   * associated with the current operation in which the log is being written.
   * For example, if a span has the REST resource name of
   * "projects/some-project/traces/some-trace/spans/some-span-id", then the
   * `span_id` field is "some-span-id".
   *
   * A
   * [Span](https://cloud.google.com/trace/docs/reference/v2/rest/v2/projects.traces/batchWrite#Span)
   * represents a single operation within a trace. Whereas a trace may involve
   * multiple different microservices running on multiple different machines,
   * a span generally corresponds to a single logical operation being performed
   * in a single instance of a microservice on one specific machine. Spans
   * are the nodes within the tree that is a trace.
   *
   * Applications that are [instrumented for
   * tracing](https://cloud.google.com/trace/docs/setup) will generally assign a
   * new, unique span ID on each incoming request. It is also common to create
   * and record additional spans corresponding to internal processing elements
   * as well as issuing requests to dependencies.
   *
   * The span ID is expected to be a 16-character, hexadecimal encoding of an
   * 8-byte array and should not be zero. It should be unique within the trace
   * and should, ideally, be generated in a manner that is uniformly random.
   *
   * Example values:
   *
   *   - `000000000000004a`
   *   - `7a2190356c3fc94b`
   *   - `0000f00300090021`
   *   - `d39223e101960076`
   * </pre>
   *
   * <code>string span_id = 27 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The spanId.
   */
  java.lang.String getSpanId();

  /**
   *
   *
   * <pre>
   * Optional. The ID of the [Cloud Trace](https://cloud.google.com/trace) span
   * associated with the current operation in which the log is being written.
   * For example, if a span has the REST resource name of
   * "projects/some-project/traces/some-trace/spans/some-span-id", then the
   * `span_id` field is "some-span-id".
   *
   * A
   * [Span](https://cloud.google.com/trace/docs/reference/v2/rest/v2/projects.traces/batchWrite#Span)
   * represents a single operation within a trace. Whereas a trace may involve
   * multiple different microservices running on multiple different machines,
   * a span generally corresponds to a single logical operation being performed
   * in a single instance of a microservice on one specific machine. Spans
   * are the nodes within the tree that is a trace.
   *
   * Applications that are [instrumented for
   * tracing](https://cloud.google.com/trace/docs/setup) will generally assign a
   * new, unique span ID on each incoming request. It is also common to create
   * and record additional spans corresponding to internal processing elements
   * as well as issuing requests to dependencies.
   *
   * The span ID is expected to be a 16-character, hexadecimal encoding of an
   * 8-byte array and should not be zero. It should be unique within the trace
   * and should, ideally, be generated in a manner that is uniformly random.
   *
   * Example values:
   *
   *   - `000000000000004a`
   *   - `7a2190356c3fc94b`
   *   - `0000f00300090021`
   *   - `d39223e101960076`
   * </pre>
   *
   * <code>string span_id = 27 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for spanId.
   */
  com.google.protobuf.ByteString getSpanIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The sampling decision of the trace associated with the log entry.
   *
   * True means that the trace resource name in the `trace` field was sampled
   * for storage in a trace backend. False means that the trace was not sampled
   * for storage when this log entry was written, or the sampling decision was
   * unknown at the time. A non-sampled `trace` value is still useful as a
   * request correlation identifier. The default is False.
   * </pre>
   *
   * <code>bool trace_sampled = 30 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The traceSampled.
   */
  boolean getTraceSampled();

  /**
   *
   *
   * <pre>
   * Optional. Source code location information associated with the log entry,
   * if any.
   * </pre>
   *
   * <code>
   * .google.logging.v2.LogEntrySourceLocation source_location = 23 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sourceLocation field is set.
   */
  boolean hasSourceLocation();

  /**
   *
   *
   * <pre>
   * Optional. Source code location information associated with the log entry,
   * if any.
   * </pre>
   *
   * <code>
   * .google.logging.v2.LogEntrySourceLocation source_location = 23 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sourceLocation.
   */
  com.google.logging.v2.LogEntrySourceLocation getSourceLocation();

  /**
   *
   *
   * <pre>
   * Optional. Source code location information associated with the log entry,
   * if any.
   * </pre>
   *
   * <code>
   * .google.logging.v2.LogEntrySourceLocation source_location = 23 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.logging.v2.LogEntrySourceLocationOrBuilder getSourceLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Information indicating this LogEntry is part of a sequence of
   * multiple log entries split from a single LogEntry.
   * </pre>
   *
   * <code>.google.logging.v2.LogSplit split = 35 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the split field is set.
   */
  boolean hasSplit();

  /**
   *
   *
   * <pre>
   * Optional. Information indicating this LogEntry is part of a sequence of
   * multiple log entries split from a single LogEntry.
   * </pre>
   *
   * <code>.google.logging.v2.LogSplit split = 35 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The split.
   */
  com.google.logging.v2.LogSplit getSplit();

  /**
   *
   *
   * <pre>
   * Optional. Information indicating this LogEntry is part of a sequence of
   * multiple log entries split from a single LogEntry.
   * </pre>
   *
   * <code>.google.logging.v2.LogSplit split = 35 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.logging.v2.LogSplitOrBuilder getSplitOrBuilder();

  com.google.logging.v2.LogEntry.PayloadCase getPayloadCase();
}
