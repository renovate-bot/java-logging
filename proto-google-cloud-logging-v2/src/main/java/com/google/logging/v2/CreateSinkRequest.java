/*
 * Copyright 2020 Google LLC
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

package com.google.logging.v2;

/**
 *
 *
 * <pre>
 * The parameters to `CreateSink`.
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.CreateSinkRequest}
 */
public final class CreateSinkRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.CreateSinkRequest)
    CreateSinkRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateSinkRequest.newBuilder() to construct.
  private CreateSinkRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateSinkRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateSinkRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateSinkRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.logging.v2.LogSink.Builder subBuilder = null;
              if (sink_ != null) {
                subBuilder = sink_.toBuilder();
              }
              sink_ = input.readMessage(com.google.logging.v2.LogSink.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(sink_);
                sink_ = subBuilder.buildPartial();
              }

              break;
            }
          case 24:
            {
              uniqueWriterIdentity_ = input.readBool();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.logging.v2.LoggingConfigProto
        .internal_static_google_logging_v2_CreateSinkRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LoggingConfigProto
        .internal_static_google_logging_v2_CreateSinkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.CreateSinkRequest.class,
            com.google.logging.v2.CreateSinkRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The resource in which to create the sink:
   *     "projects/[PROJECT_ID]"
   *     "organizations/[ORGANIZATION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]"
   *     "folders/[FOLDER_ID]"
   * For examples:
   *   `"projects/my-project"`
   *   `"organizations/123456789"`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource in which to create the sink:
   *     "projects/[PROJECT_ID]"
   *     "organizations/[ORGANIZATION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]"
   *     "folders/[FOLDER_ID]"
   * For examples:
   *   `"projects/my-project"`
   *   `"organizations/123456789"`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SINK_FIELD_NUMBER = 2;
  private com.google.logging.v2.LogSink sink_;
  /**
   *
   *
   * <pre>
   * Required. The new sink, whose `name` parameter is a sink identifier that
   * is not already in use.
   * </pre>
   *
   * <code>.google.logging.v2.LogSink sink = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the sink field is set.
   */
  @java.lang.Override
  public boolean hasSink() {
    return sink_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The new sink, whose `name` parameter is a sink identifier that
   * is not already in use.
   * </pre>
   *
   * <code>.google.logging.v2.LogSink sink = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The sink.
   */
  @java.lang.Override
  public com.google.logging.v2.LogSink getSink() {
    return sink_ == null ? com.google.logging.v2.LogSink.getDefaultInstance() : sink_;
  }
  /**
   *
   *
   * <pre>
   * Required. The new sink, whose `name` parameter is a sink identifier that
   * is not already in use.
   * </pre>
   *
   * <code>.google.logging.v2.LogSink sink = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.logging.v2.LogSinkOrBuilder getSinkOrBuilder() {
    return getSink();
  }

  public static final int UNIQUE_WRITER_IDENTITY_FIELD_NUMBER = 3;
  private boolean uniqueWriterIdentity_;
  /**
   *
   *
   * <pre>
   * Optional. Determines the kind of IAM identity returned as `writer_identity`
   * in the new sink. If this value is omitted or set to false, and if the
   * sink's parent is a project, then the value returned as `writer_identity` is
   * the same group or service account used by Cloud Logging before the addition
   * of writer identities to this API. The sink's destination must be in the
   * same project as the sink itself.
   * If this field is set to true, or if the sink is owned by a non-project
   * resource such as an organization, then the value of `writer_identity` will
   * be a unique service account used only for exports from the new sink. For
   * more information, see `writer_identity` in [LogSink][google.logging.v2.LogSink].
   * </pre>
   *
   * <code>bool unique_writer_identity = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The uniqueWriterIdentity.
   */
  @java.lang.Override
  public boolean getUniqueWriterIdentity() {
    return uniqueWriterIdentity_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (sink_ != null) {
      output.writeMessage(2, getSink());
    }
    if (uniqueWriterIdentity_ != false) {
      output.writeBool(3, uniqueWriterIdentity_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (sink_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSink());
    }
    if (uniqueWriterIdentity_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, uniqueWriterIdentity_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.logging.v2.CreateSinkRequest)) {
      return super.equals(obj);
    }
    com.google.logging.v2.CreateSinkRequest other = (com.google.logging.v2.CreateSinkRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasSink() != other.hasSink()) return false;
    if (hasSink()) {
      if (!getSink().equals(other.getSink())) return false;
    }
    if (getUniqueWriterIdentity() != other.getUniqueWriterIdentity()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasSink()) {
      hash = (37 * hash) + SINK_FIELD_NUMBER;
      hash = (53 * hash) + getSink().hashCode();
    }
    hash = (37 * hash) + UNIQUE_WRITER_IDENTITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getUniqueWriterIdentity());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.logging.v2.CreateSinkRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.CreateSinkRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.CreateSinkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.CreateSinkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.CreateSinkRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.CreateSinkRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.CreateSinkRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.CreateSinkRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.CreateSinkRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.CreateSinkRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.CreateSinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.CreateSinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.logging.v2.CreateSinkRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The parameters to `CreateSink`.
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.CreateSinkRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.CreateSinkRequest)
      com.google.logging.v2.CreateSinkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_CreateSinkRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_CreateSinkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.CreateSinkRequest.class,
              com.google.logging.v2.CreateSinkRequest.Builder.class);
    }

    // Construct using com.google.logging.v2.CreateSinkRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (sinkBuilder_ == null) {
        sink_ = null;
      } else {
        sink_ = null;
        sinkBuilder_ = null;
      }
      uniqueWriterIdentity_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_CreateSinkRequest_descriptor;
    }

    @java.lang.Override
    public com.google.logging.v2.CreateSinkRequest getDefaultInstanceForType() {
      return com.google.logging.v2.CreateSinkRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.logging.v2.CreateSinkRequest build() {
      com.google.logging.v2.CreateSinkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.logging.v2.CreateSinkRequest buildPartial() {
      com.google.logging.v2.CreateSinkRequest result =
          new com.google.logging.v2.CreateSinkRequest(this);
      result.parent_ = parent_;
      if (sinkBuilder_ == null) {
        result.sink_ = sink_;
      } else {
        result.sink_ = sinkBuilder_.build();
      }
      result.uniqueWriterIdentity_ = uniqueWriterIdentity_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.logging.v2.CreateSinkRequest) {
        return mergeFrom((com.google.logging.v2.CreateSinkRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.CreateSinkRequest other) {
      if (other == com.google.logging.v2.CreateSinkRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasSink()) {
        mergeSink(other.getSink());
      }
      if (other.getUniqueWriterIdentity() != false) {
        setUniqueWriterIdentity(other.getUniqueWriterIdentity());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.logging.v2.CreateSinkRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.logging.v2.CreateSinkRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource in which to create the sink:
     *     "projects/[PROJECT_ID]"
     *     "organizations/[ORGANIZATION_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]"
     *     "folders/[FOLDER_ID]"
     * For examples:
     *   `"projects/my-project"`
     *   `"organizations/123456789"`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource in which to create the sink:
     *     "projects/[PROJECT_ID]"
     *     "organizations/[ORGANIZATION_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]"
     *     "folders/[FOLDER_ID]"
     * For examples:
     *   `"projects/my-project"`
     *   `"organizations/123456789"`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource in which to create the sink:
     *     "projects/[PROJECT_ID]"
     *     "organizations/[ORGANIZATION_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]"
     *     "folders/[FOLDER_ID]"
     * For examples:
     *   `"projects/my-project"`
     *   `"organizations/123456789"`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource in which to create the sink:
     *     "projects/[PROJECT_ID]"
     *     "organizations/[ORGANIZATION_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]"
     *     "folders/[FOLDER_ID]"
     * For examples:
     *   `"projects/my-project"`
     *   `"organizations/123456789"`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource in which to create the sink:
     *     "projects/[PROJECT_ID]"
     *     "organizations/[ORGANIZATION_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]"
     *     "folders/[FOLDER_ID]"
     * For examples:
     *   `"projects/my-project"`
     *   `"organizations/123456789"`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.logging.v2.LogSink sink_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.logging.v2.LogSink,
            com.google.logging.v2.LogSink.Builder,
            com.google.logging.v2.LogSinkOrBuilder>
        sinkBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The new sink, whose `name` parameter is a sink identifier that
     * is not already in use.
     * </pre>
     *
     * <code>.google.logging.v2.LogSink sink = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the sink field is set.
     */
    public boolean hasSink() {
      return sinkBuilder_ != null || sink_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The new sink, whose `name` parameter is a sink identifier that
     * is not already in use.
     * </pre>
     *
     * <code>.google.logging.v2.LogSink sink = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The sink.
     */
    public com.google.logging.v2.LogSink getSink() {
      if (sinkBuilder_ == null) {
        return sink_ == null ? com.google.logging.v2.LogSink.getDefaultInstance() : sink_;
      } else {
        return sinkBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new sink, whose `name` parameter is a sink identifier that
     * is not already in use.
     * </pre>
     *
     * <code>.google.logging.v2.LogSink sink = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSink(com.google.logging.v2.LogSink value) {
      if (sinkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sink_ = value;
        onChanged();
      } else {
        sinkBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new sink, whose `name` parameter is a sink identifier that
     * is not already in use.
     * </pre>
     *
     * <code>.google.logging.v2.LogSink sink = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSink(com.google.logging.v2.LogSink.Builder builderForValue) {
      if (sinkBuilder_ == null) {
        sink_ = builderForValue.build();
        onChanged();
      } else {
        sinkBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new sink, whose `name` parameter is a sink identifier that
     * is not already in use.
     * </pre>
     *
     * <code>.google.logging.v2.LogSink sink = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSink(com.google.logging.v2.LogSink value) {
      if (sinkBuilder_ == null) {
        if (sink_ != null) {
          sink_ = com.google.logging.v2.LogSink.newBuilder(sink_).mergeFrom(value).buildPartial();
        } else {
          sink_ = value;
        }
        onChanged();
      } else {
        sinkBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new sink, whose `name` parameter is a sink identifier that
     * is not already in use.
     * </pre>
     *
     * <code>.google.logging.v2.LogSink sink = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSink() {
      if (sinkBuilder_ == null) {
        sink_ = null;
        onChanged();
      } else {
        sink_ = null;
        sinkBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new sink, whose `name` parameter is a sink identifier that
     * is not already in use.
     * </pre>
     *
     * <code>.google.logging.v2.LogSink sink = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.logging.v2.LogSink.Builder getSinkBuilder() {

      onChanged();
      return getSinkFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The new sink, whose `name` parameter is a sink identifier that
     * is not already in use.
     * </pre>
     *
     * <code>.google.logging.v2.LogSink sink = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.logging.v2.LogSinkOrBuilder getSinkOrBuilder() {
      if (sinkBuilder_ != null) {
        return sinkBuilder_.getMessageOrBuilder();
      } else {
        return sink_ == null ? com.google.logging.v2.LogSink.getDefaultInstance() : sink_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new sink, whose `name` parameter is a sink identifier that
     * is not already in use.
     * </pre>
     *
     * <code>.google.logging.v2.LogSink sink = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.logging.v2.LogSink,
            com.google.logging.v2.LogSink.Builder,
            com.google.logging.v2.LogSinkOrBuilder>
        getSinkFieldBuilder() {
      if (sinkBuilder_ == null) {
        sinkBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.logging.v2.LogSink,
                com.google.logging.v2.LogSink.Builder,
                com.google.logging.v2.LogSinkOrBuilder>(
                getSink(), getParentForChildren(), isClean());
        sink_ = null;
      }
      return sinkBuilder_;
    }

    private boolean uniqueWriterIdentity_;
    /**
     *
     *
     * <pre>
     * Optional. Determines the kind of IAM identity returned as `writer_identity`
     * in the new sink. If this value is omitted or set to false, and if the
     * sink's parent is a project, then the value returned as `writer_identity` is
     * the same group or service account used by Cloud Logging before the addition
     * of writer identities to this API. The sink's destination must be in the
     * same project as the sink itself.
     * If this field is set to true, or if the sink is owned by a non-project
     * resource such as an organization, then the value of `writer_identity` will
     * be a unique service account used only for exports from the new sink. For
     * more information, see `writer_identity` in [LogSink][google.logging.v2.LogSink].
     * </pre>
     *
     * <code>bool unique_writer_identity = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The uniqueWriterIdentity.
     */
    @java.lang.Override
    public boolean getUniqueWriterIdentity() {
      return uniqueWriterIdentity_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Determines the kind of IAM identity returned as `writer_identity`
     * in the new sink. If this value is omitted or set to false, and if the
     * sink's parent is a project, then the value returned as `writer_identity` is
     * the same group or service account used by Cloud Logging before the addition
     * of writer identities to this API. The sink's destination must be in the
     * same project as the sink itself.
     * If this field is set to true, or if the sink is owned by a non-project
     * resource such as an organization, then the value of `writer_identity` will
     * be a unique service account used only for exports from the new sink. For
     * more information, see `writer_identity` in [LogSink][google.logging.v2.LogSink].
     * </pre>
     *
     * <code>bool unique_writer_identity = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The uniqueWriterIdentity to set.
     * @return This builder for chaining.
     */
    public Builder setUniqueWriterIdentity(boolean value) {

      uniqueWriterIdentity_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Determines the kind of IAM identity returned as `writer_identity`
     * in the new sink. If this value is omitted or set to false, and if the
     * sink's parent is a project, then the value returned as `writer_identity` is
     * the same group or service account used by Cloud Logging before the addition
     * of writer identities to this API. The sink's destination must be in the
     * same project as the sink itself.
     * If this field is set to true, or if the sink is owned by a non-project
     * resource such as an organization, then the value of `writer_identity` will
     * be a unique service account used only for exports from the new sink. For
     * more information, see `writer_identity` in [LogSink][google.logging.v2.LogSink].
     * </pre>
     *
     * <code>bool unique_writer_identity = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUniqueWriterIdentity() {

      uniqueWriterIdentity_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.logging.v2.CreateSinkRequest)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.CreateSinkRequest)
  private static final com.google.logging.v2.CreateSinkRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.CreateSinkRequest();
  }

  public static com.google.logging.v2.CreateSinkRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSinkRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateSinkRequest>() {
        @java.lang.Override
        public CreateSinkRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateSinkRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateSinkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSinkRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.logging.v2.CreateSinkRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
