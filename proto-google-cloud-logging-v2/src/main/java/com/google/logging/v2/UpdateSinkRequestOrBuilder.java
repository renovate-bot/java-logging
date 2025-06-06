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
// source: google/logging/v2/logging_config.proto

// Protobuf Java Version: 3.25.8
package com.google.logging.v2;

public interface UpdateSinkRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.UpdateSinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The full resource name of the sink to update, including the
   * parent resource and the sink identifier:
   *
   *     "projects/[PROJECT_ID]/sinks/[SINK_ID]"
   *     "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
   *     "folders/[FOLDER_ID]/sinks/[SINK_ID]"
   *
   * For example:
   *
   *   `"projects/my-project/sinks/my-sink"`
   * </pre>
   *
   * <code>
   * string sink_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The sinkName.
   */
  java.lang.String getSinkName();

  /**
   *
   *
   * <pre>
   * Required. The full resource name of the sink to update, including the
   * parent resource and the sink identifier:
   *
   *     "projects/[PROJECT_ID]/sinks/[SINK_ID]"
   *     "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
   *     "folders/[FOLDER_ID]/sinks/[SINK_ID]"
   *
   * For example:
   *
   *   `"projects/my-project/sinks/my-sink"`
   * </pre>
   *
   * <code>
   * string sink_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for sinkName.
   */
  com.google.protobuf.ByteString getSinkNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The updated sink, whose name is the same identifier that appears
   * as part of `sink_name`.
   * </pre>
   *
   * <code>.google.logging.v2.LogSink sink = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the sink field is set.
   */
  boolean hasSink();

  /**
   *
   *
   * <pre>
   * Required. The updated sink, whose name is the same identifier that appears
   * as part of `sink_name`.
   * </pre>
   *
   * <code>.google.logging.v2.LogSink sink = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The sink.
   */
  com.google.logging.v2.LogSink getSink();

  /**
   *
   *
   * <pre>
   * Required. The updated sink, whose name is the same identifier that appears
   * as part of `sink_name`.
   * </pre>
   *
   * <code>.google.logging.v2.LogSink sink = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.logging.v2.LogSinkOrBuilder getSinkOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. See [sinks.create][google.logging.v2.ConfigServiceV2.CreateSink]
   * for a description of this field. When updating a sink, the effect of this
   * field on the value of `writer_identity` in the updated sink depends on both
   * the old and new values of this field:
   *
   * +   If the old and new values of this field are both false or both true,
   *     then there is no change to the sink's `writer_identity`.
   * +   If the old value is false and the new value is true, then
   *     `writer_identity` is changed to a unique service account.
   * +   It is an error if the old value is true and the new value is
   *     set to false or defaulted to false.
   * </pre>
   *
   * <code>bool unique_writer_identity = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The uniqueWriterIdentity.
   */
  boolean getUniqueWriterIdentity();

  /**
   *
   *
   * <pre>
   * Optional. Field mask that specifies the fields in `sink` that need
   * an update. A sink field will be overwritten if, and only if, it is
   * in the update mask. `name` and output only fields cannot be updated.
   *
   * An empty `updateMask` is temporarily treated as using the following mask
   * for backwards compatibility purposes:
   *
   *   `destination,filter,includeChildren`
   *
   * At some point in the future, behavior will be removed and specifying an
   * empty `updateMask` will be an error.
   *
   * For a detailed `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMask
   *
   * For example: `updateMask=filter`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();

  /**
   *
   *
   * <pre>
   * Optional. Field mask that specifies the fields in `sink` that need
   * an update. A sink field will be overwritten if, and only if, it is
   * in the update mask. `name` and output only fields cannot be updated.
   *
   * An empty `updateMask` is temporarily treated as using the following mask
   * for backwards compatibility purposes:
   *
   *   `destination,filter,includeChildren`
   *
   * At some point in the future, behavior will be removed and specifying an
   * empty `updateMask` will be an error.
   *
   * For a detailed `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMask
   *
   * For example: `updateMask=filter`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();

  /**
   *
   *
   * <pre>
   * Optional. Field mask that specifies the fields in `sink` that need
   * an update. A sink field will be overwritten if, and only if, it is
   * in the update mask. `name` and output only fields cannot be updated.
   *
   * An empty `updateMask` is temporarily treated as using the following mask
   * for backwards compatibility purposes:
   *
   *   `destination,filter,includeChildren`
   *
   * At some point in the future, behavior will be removed and specifying an
   * empty `updateMask` will be an error.
   *
   * For a detailed `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMask
   *
   * For example: `updateMask=filter`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
