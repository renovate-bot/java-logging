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

/**
 *
 *
 * <pre>
 * Result returned from `ListExclusions`.
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.ListExclusionsResponse}
 */
public final class ListExclusionsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.ListExclusionsResponse)
    ListExclusionsResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListExclusionsResponse.newBuilder() to construct.
  private ListExclusionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListExclusionsResponse() {
    exclusions_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListExclusionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.logging.v2.LoggingConfigProto
        .internal_static_google_logging_v2_ListExclusionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LoggingConfigProto
        .internal_static_google_logging_v2_ListExclusionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.ListExclusionsResponse.class,
            com.google.logging.v2.ListExclusionsResponse.Builder.class);
  }

  public static final int EXCLUSIONS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.logging.v2.LogExclusion> exclusions_;

  /**
   *
   *
   * <pre>
   * A list of exclusions.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.logging.v2.LogExclusion> getExclusionsList() {
    return exclusions_;
  }

  /**
   *
   *
   * <pre>
   * A list of exclusions.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.logging.v2.LogExclusionOrBuilder>
      getExclusionsOrBuilderList() {
    return exclusions_;
  }

  /**
   *
   *
   * <pre>
   * A list of exclusions.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
   */
  @java.lang.Override
  public int getExclusionsCount() {
    return exclusions_.size();
  }

  /**
   *
   *
   * <pre>
   * A list of exclusions.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
   */
  @java.lang.Override
  public com.google.logging.v2.LogExclusion getExclusions(int index) {
    return exclusions_.get(index);
  }

  /**
   *
   *
   * <pre>
   * A list of exclusions.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
   */
  @java.lang.Override
  public com.google.logging.v2.LogExclusionOrBuilder getExclusionsOrBuilder(int index) {
    return exclusions_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * If there might be more results than appear in this response, then
   * `nextPageToken` is included. To get the next set of results, call the same
   * method again using the value of `nextPageToken` as `pageToken`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * If there might be more results than appear in this response, then
   * `nextPageToken` is included. To get the next set of results, call the same
   * method again using the value of `nextPageToken` as `pageToken`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < exclusions_.size(); i++) {
      output.writeMessage(1, exclusions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < exclusions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, exclusions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.logging.v2.ListExclusionsResponse)) {
      return super.equals(obj);
    }
    com.google.logging.v2.ListExclusionsResponse other =
        (com.google.logging.v2.ListExclusionsResponse) obj;

    if (!getExclusionsList().equals(other.getExclusionsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getExclusionsCount() > 0) {
      hash = (37 * hash) + EXCLUSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getExclusionsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.logging.v2.ListExclusionsResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.ListExclusionsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.ListExclusionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.ListExclusionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.ListExclusionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.ListExclusionsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.ListExclusionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.ListExclusionsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.ListExclusionsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.ListExclusionsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.ListExclusionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.ListExclusionsResponse parseFrom(
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

  public static Builder newBuilder(com.google.logging.v2.ListExclusionsResponse prototype) {
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
   * Result returned from `ListExclusions`.
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.ListExclusionsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.ListExclusionsResponse)
      com.google.logging.v2.ListExclusionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_ListExclusionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_ListExclusionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.ListExclusionsResponse.class,
              com.google.logging.v2.ListExclusionsResponse.Builder.class);
    }

    // Construct using com.google.logging.v2.ListExclusionsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (exclusionsBuilder_ == null) {
        exclusions_ = java.util.Collections.emptyList();
      } else {
        exclusions_ = null;
        exclusionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_ListExclusionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.logging.v2.ListExclusionsResponse getDefaultInstanceForType() {
      return com.google.logging.v2.ListExclusionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.logging.v2.ListExclusionsResponse build() {
      com.google.logging.v2.ListExclusionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.logging.v2.ListExclusionsResponse buildPartial() {
      com.google.logging.v2.ListExclusionsResponse result =
          new com.google.logging.v2.ListExclusionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.logging.v2.ListExclusionsResponse result) {
      if (exclusionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          exclusions_ = java.util.Collections.unmodifiableList(exclusions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.exclusions_ = exclusions_;
      } else {
        result.exclusions_ = exclusionsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.logging.v2.ListExclusionsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
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
      if (other instanceof com.google.logging.v2.ListExclusionsResponse) {
        return mergeFrom((com.google.logging.v2.ListExclusionsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.ListExclusionsResponse other) {
      if (other == com.google.logging.v2.ListExclusionsResponse.getDefaultInstance()) return this;
      if (exclusionsBuilder_ == null) {
        if (!other.exclusions_.isEmpty()) {
          if (exclusions_.isEmpty()) {
            exclusions_ = other.exclusions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureExclusionsIsMutable();
            exclusions_.addAll(other.exclusions_);
          }
          onChanged();
        }
      } else {
        if (!other.exclusions_.isEmpty()) {
          if (exclusionsBuilder_.isEmpty()) {
            exclusionsBuilder_.dispose();
            exclusionsBuilder_ = null;
            exclusions_ = other.exclusions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            exclusionsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getExclusionsFieldBuilder()
                    : null;
          } else {
            exclusionsBuilder_.addAllMessages(other.exclusions_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
                com.google.logging.v2.LogExclusion m =
                    input.readMessage(
                        com.google.logging.v2.LogExclusion.parser(), extensionRegistry);
                if (exclusionsBuilder_ == null) {
                  ensureExclusionsIsMutable();
                  exclusions_.add(m);
                } else {
                  exclusionsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.logging.v2.LogExclusion> exclusions_ =
        java.util.Collections.emptyList();

    private void ensureExclusionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        exclusions_ = new java.util.ArrayList<com.google.logging.v2.LogExclusion>(exclusions_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.logging.v2.LogExclusion,
            com.google.logging.v2.LogExclusion.Builder,
            com.google.logging.v2.LogExclusionOrBuilder>
        exclusionsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of exclusions.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
     */
    public java.util.List<com.google.logging.v2.LogExclusion> getExclusionsList() {
      if (exclusionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(exclusions_);
      } else {
        return exclusionsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * A list of exclusions.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
     */
    public int getExclusionsCount() {
      if (exclusionsBuilder_ == null) {
        return exclusions_.size();
      } else {
        return exclusionsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * A list of exclusions.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
     */
    public com.google.logging.v2.LogExclusion getExclusions(int index) {
      if (exclusionsBuilder_ == null) {
        return exclusions_.get(index);
      } else {
        return exclusionsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * A list of exclusions.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
     */
    public Builder setExclusions(int index, com.google.logging.v2.LogExclusion value) {
      if (exclusionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExclusionsIsMutable();
        exclusions_.set(index, value);
        onChanged();
      } else {
        exclusionsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of exclusions.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
     */
    public Builder setExclusions(
        int index, com.google.logging.v2.LogExclusion.Builder builderForValue) {
      if (exclusionsBuilder_ == null) {
        ensureExclusionsIsMutable();
        exclusions_.set(index, builderForValue.build());
        onChanged();
      } else {
        exclusionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of exclusions.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
     */
    public Builder addExclusions(com.google.logging.v2.LogExclusion value) {
      if (exclusionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExclusionsIsMutable();
        exclusions_.add(value);
        onChanged();
      } else {
        exclusionsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of exclusions.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
     */
    public Builder addExclusions(int index, com.google.logging.v2.LogExclusion value) {
      if (exclusionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExclusionsIsMutable();
        exclusions_.add(index, value);
        onChanged();
      } else {
        exclusionsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of exclusions.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
     */
    public Builder addExclusions(com.google.logging.v2.LogExclusion.Builder builderForValue) {
      if (exclusionsBuilder_ == null) {
        ensureExclusionsIsMutable();
        exclusions_.add(builderForValue.build());
        onChanged();
      } else {
        exclusionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of exclusions.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
     */
    public Builder addExclusions(
        int index, com.google.logging.v2.LogExclusion.Builder builderForValue) {
      if (exclusionsBuilder_ == null) {
        ensureExclusionsIsMutable();
        exclusions_.add(index, builderForValue.build());
        onChanged();
      } else {
        exclusionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of exclusions.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
     */
    public Builder addAllExclusions(
        java.lang.Iterable<? extends com.google.logging.v2.LogExclusion> values) {
      if (exclusionsBuilder_ == null) {
        ensureExclusionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, exclusions_);
        onChanged();
      } else {
        exclusionsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of exclusions.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
     */
    public Builder clearExclusions() {
      if (exclusionsBuilder_ == null) {
        exclusions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        exclusionsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of exclusions.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
     */
    public Builder removeExclusions(int index) {
      if (exclusionsBuilder_ == null) {
        ensureExclusionsIsMutable();
        exclusions_.remove(index);
        onChanged();
      } else {
        exclusionsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of exclusions.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
     */
    public com.google.logging.v2.LogExclusion.Builder getExclusionsBuilder(int index) {
      return getExclusionsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * A list of exclusions.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
     */
    public com.google.logging.v2.LogExclusionOrBuilder getExclusionsOrBuilder(int index) {
      if (exclusionsBuilder_ == null) {
        return exclusions_.get(index);
      } else {
        return exclusionsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * A list of exclusions.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
     */
    public java.util.List<? extends com.google.logging.v2.LogExclusionOrBuilder>
        getExclusionsOrBuilderList() {
      if (exclusionsBuilder_ != null) {
        return exclusionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(exclusions_);
      }
    }

    /**
     *
     *
     * <pre>
     * A list of exclusions.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
     */
    public com.google.logging.v2.LogExclusion.Builder addExclusionsBuilder() {
      return getExclusionsFieldBuilder()
          .addBuilder(com.google.logging.v2.LogExclusion.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * A list of exclusions.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
     */
    public com.google.logging.v2.LogExclusion.Builder addExclusionsBuilder(int index) {
      return getExclusionsFieldBuilder()
          .addBuilder(index, com.google.logging.v2.LogExclusion.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * A list of exclusions.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
     */
    public java.util.List<com.google.logging.v2.LogExclusion.Builder> getExclusionsBuilderList() {
      return getExclusionsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.logging.v2.LogExclusion,
            com.google.logging.v2.LogExclusion.Builder,
            com.google.logging.v2.LogExclusionOrBuilder>
        getExclusionsFieldBuilder() {
      if (exclusionsBuilder_ == null) {
        exclusionsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.logging.v2.LogExclusion,
                com.google.logging.v2.LogExclusion.Builder,
                com.google.logging.v2.LogExclusionOrBuilder>(
                exclusions_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        exclusions_ = null;
      }
      return exclusionsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * If there might be more results than appear in this response, then
     * `nextPageToken` is included. To get the next set of results, call the same
     * method again using the value of `nextPageToken` as `pageToken`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * If there might be more results than appear in this response, then
     * `nextPageToken` is included. To get the next set of results, call the same
     * method again using the value of `nextPageToken` as `pageToken`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * If there might be more results than appear in this response, then
     * `nextPageToken` is included. To get the next set of results, call the same
     * method again using the value of `nextPageToken` as `pageToken`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * If there might be more results than appear in this response, then
     * `nextPageToken` is included. To get the next set of results, call the same
     * method again using the value of `nextPageToken` as `pageToken`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * If there might be more results than appear in this response, then
     * `nextPageToken` is included. To get the next set of results, call the same
     * method again using the value of `nextPageToken` as `pageToken`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.logging.v2.ListExclusionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.ListExclusionsResponse)
  private static final com.google.logging.v2.ListExclusionsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.ListExclusionsResponse();
  }

  public static com.google.logging.v2.ListExclusionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListExclusionsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListExclusionsResponse>() {
        @java.lang.Override
        public ListExclusionsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ListExclusionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListExclusionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.logging.v2.ListExclusionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
