// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_null.proto

package opi_api.storage.v1;

public interface NullDebugOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NullDebug)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
   * @return Whether the handle field is set.
   */
  boolean hasHandle();
  /**
   * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
   * @return The handle.
   */
  opi_api.common.v1.ObjectKey getHandle();
  /**
   * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getHandleOrBuilder();

  /**
   * <code>int64 block_size = 2;</code>
   * @return The blockSize.
   */
  long getBlockSize();

  /**
   * <code>int64 blocks_count = 3;</code>
   * @return The blocksCount.
   */
  long getBlocksCount();

  /**
   * <code>.opi_api.common.v1.Uuid uuid = 4;</code>
   * @return Whether the uuid field is set.
   */
  boolean hasUuid();
  /**
   * <code>.opi_api.common.v1.Uuid uuid = 4;</code>
   * @return The uuid.
   */
  opi_api.common.v1.Uuid getUuid();
  /**
   * <code>.opi_api.common.v1.Uuid uuid = 4;</code>
   */
  opi_api.common.v1.UuidOrBuilder getUuidOrBuilder();
}
