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

public interface LogSplitOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.LogSplit)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A globally unique identifier for all log entries in a sequence of split log
   * entries. All log entries with the same |LogSplit.uid| are assumed to be
   * part of the same sequence of split log entries.
   * </pre>
   *
   * <code>string uid = 1;</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();

  /**
   *
   *
   * <pre>
   * A globally unique identifier for all log entries in a sequence of split log
   * entries. All log entries with the same |LogSplit.uid| are assumed to be
   * part of the same sequence of split log entries.
   * </pre>
   *
   * <code>string uid = 1;</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * The index of this LogEntry in the sequence of split log entries. Log
   * entries are given |index| values 0, 1, ..., n-1 for a sequence of n log
   * entries.
   * </pre>
   *
   * <code>int32 index = 2;</code>
   *
   * @return The index.
   */
  int getIndex();

  /**
   *
   *
   * <pre>
   * The total number of log entries that the original LogEntry was split into.
   * </pre>
   *
   * <code>int32 total_splits = 3;</code>
   *
   * @return The totalSplits.
   */
  int getTotalSplits();
}
