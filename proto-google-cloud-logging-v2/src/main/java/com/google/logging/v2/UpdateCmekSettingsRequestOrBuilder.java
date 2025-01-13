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

// Protobuf Java Version: 3.25.5
package com.google.logging.v2;

public interface UpdateCmekSettingsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.UpdateCmekSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name for the CMEK settings to update.
   *
   *     "projects/[PROJECT_ID]/cmekSettings"
   *     "organizations/[ORGANIZATION_ID]/cmekSettings"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/cmekSettings"
   *     "folders/[FOLDER_ID]/cmekSettings"
   *
   * For example:
   *
   *   `"organizations/12345/cmekSettings"`
   *
   * Note: CMEK for the Log Router can currently only be configured for Google
   * Cloud organizations. Once configured, it applies to all projects and
   * folders in the Google Cloud organization.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name for the CMEK settings to update.
   *
   *     "projects/[PROJECT_ID]/cmekSettings"
   *     "organizations/[ORGANIZATION_ID]/cmekSettings"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/cmekSettings"
   *     "folders/[FOLDER_ID]/cmekSettings"
   *
   * For example:
   *
   *   `"organizations/12345/cmekSettings"`
   *
   * Note: CMEK for the Log Router can currently only be configured for Google
   * Cloud organizations. Once configured, it applies to all projects and
   * folders in the Google Cloud organization.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The CMEK settings to update.
   *
   * See [Enabling CMEK for Log
   * Router](https://cloud.google.com/logging/docs/routing/managed-encryption)
   * for more information.
   * </pre>
   *
   * <code>
   * .google.logging.v2.CmekSettings cmek_settings = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the cmekSettings field is set.
   */
  boolean hasCmekSettings();
  /**
   *
   *
   * <pre>
   * Required. The CMEK settings to update.
   *
   * See [Enabling CMEK for Log
   * Router](https://cloud.google.com/logging/docs/routing/managed-encryption)
   * for more information.
   * </pre>
   *
   * <code>
   * .google.logging.v2.CmekSettings cmek_settings = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The cmekSettings.
   */
  com.google.logging.v2.CmekSettings getCmekSettings();
  /**
   *
   *
   * <pre>
   * Required. The CMEK settings to update.
   *
   * See [Enabling CMEK for Log
   * Router](https://cloud.google.com/logging/docs/routing/managed-encryption)
   * for more information.
   * </pre>
   *
   * <code>
   * .google.logging.v2.CmekSettings cmek_settings = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.logging.v2.CmekSettingsOrBuilder getCmekSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Field mask identifying which fields from `cmek_settings` should
   * be updated. A field will be overwritten if and only if it is in the update
   * mask. Output only fields cannot be updated.
   *
   * See [FieldMask][google.protobuf.FieldMask] for more information.
   *
   * For example: `"updateMask=kmsKeyName"`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Field mask identifying which fields from `cmek_settings` should
   * be updated. A field will be overwritten if and only if it is in the update
   * mask. Output only fields cannot be updated.
   *
   * See [FieldMask][google.protobuf.FieldMask] for more information.
   *
   * For example: `"updateMask=kmsKeyName"`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Field mask identifying which fields from `cmek_settings` should
   * be updated. A field will be overwritten if and only if it is in the update
   * mask. Output only fields cannot be updated.
   *
   * See [FieldMask][google.protobuf.FieldMask] for more information.
   *
   * For example: `"updateMask=kmsKeyName"`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
