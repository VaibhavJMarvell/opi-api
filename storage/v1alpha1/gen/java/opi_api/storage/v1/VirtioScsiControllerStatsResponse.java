// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_scsi.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.VirtioScsiControllerStatsResponse}
 */
public final class VirtioScsiControllerStatsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.VirtioScsiControllerStatsResponse)
    VirtioScsiControllerStatsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VirtioScsiControllerStatsResponse.newBuilder() to construct.
  private VirtioScsiControllerStatsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VirtioScsiControllerStatsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VirtioScsiControllerStatsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VirtioScsiControllerStatsResponse(
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
          case 10: {
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (id_ != null) {
              subBuilder = id_.toBuilder();
            }
            id_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(id_);
              id_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            opi_api.storage.v1.VolumeStats.Builder subBuilder = null;
            if (stats_ != null) {
              subBuilder = stats_.toBuilder();
            }
            stats_ = input.readMessage(opi_api.storage.v1.VolumeStats.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(stats_);
              stats_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_VirtioScsiControllerStatsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_VirtioScsiControllerStatsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.VirtioScsiControllerStatsResponse.class, opi_api.storage.v1.VirtioScsiControllerStatsResponse.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private opi_api.common.v1.ObjectKey id_;
  /**
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return id_ != null;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getId() {
    return id_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : id_;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getIdOrBuilder() {
    return getId();
  }

  public static final int STATS_FIELD_NUMBER = 2;
  private opi_api.storage.v1.VolumeStats stats_;
  /**
   * <code>.opi_api.storage.v1.VolumeStats stats = 2;</code>
   * @return Whether the stats field is set.
   */
  @java.lang.Override
  public boolean hasStats() {
    return stats_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.VolumeStats stats = 2;</code>
   * @return The stats.
   */
  @java.lang.Override
  public opi_api.storage.v1.VolumeStats getStats() {
    return stats_ == null ? opi_api.storage.v1.VolumeStats.getDefaultInstance() : stats_;
  }
  /**
   * <code>.opi_api.storage.v1.VolumeStats stats = 2;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.VolumeStatsOrBuilder getStatsOrBuilder() {
    return getStats();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != null) {
      output.writeMessage(1, getId());
    }
    if (stats_ != null) {
      output.writeMessage(2, getStats());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getId());
    }
    if (stats_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStats());
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
    if (!(obj instanceof opi_api.storage.v1.VirtioScsiControllerStatsResponse)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.VirtioScsiControllerStatsResponse other = (opi_api.storage.v1.VirtioScsiControllerStatsResponse) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (hasStats() != other.hasStats()) return false;
    if (hasStats()) {
      if (!getStats()
          .equals(other.getStats())) return false;
    }
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
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
    }
    if (hasStats()) {
      hash = (37 * hash) + STATS_FIELD_NUMBER;
      hash = (53 * hash) + getStats().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.VirtioScsiControllerStatsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.VirtioScsiControllerStatsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioScsiControllerStatsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.VirtioScsiControllerStatsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioScsiControllerStatsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.VirtioScsiControllerStatsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioScsiControllerStatsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.VirtioScsiControllerStatsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioScsiControllerStatsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.VirtioScsiControllerStatsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioScsiControllerStatsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.VirtioScsiControllerStatsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(opi_api.storage.v1.VirtioScsiControllerStatsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code opi_api.storage.v1.VirtioScsiControllerStatsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.VirtioScsiControllerStatsResponse)
      opi_api.storage.v1.VirtioScsiControllerStatsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_VirtioScsiControllerStatsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_VirtioScsiControllerStatsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.VirtioScsiControllerStatsResponse.class, opi_api.storage.v1.VirtioScsiControllerStatsResponse.Builder.class);
    }

    // Construct using opi_api.storage.v1.VirtioScsiControllerStatsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (idBuilder_ == null) {
        id_ = null;
      } else {
        id_ = null;
        idBuilder_ = null;
      }
      if (statsBuilder_ == null) {
        stats_ = null;
      } else {
        stats_ = null;
        statsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_VirtioScsiControllerStatsResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.VirtioScsiControllerStatsResponse getDefaultInstanceForType() {
      return opi_api.storage.v1.VirtioScsiControllerStatsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.VirtioScsiControllerStatsResponse build() {
      opi_api.storage.v1.VirtioScsiControllerStatsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.VirtioScsiControllerStatsResponse buildPartial() {
      opi_api.storage.v1.VirtioScsiControllerStatsResponse result = new opi_api.storage.v1.VirtioScsiControllerStatsResponse(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (statsBuilder_ == null) {
        result.stats_ = stats_;
      } else {
        result.stats_ = statsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof opi_api.storage.v1.VirtioScsiControllerStatsResponse) {
        return mergeFrom((opi_api.storage.v1.VirtioScsiControllerStatsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.VirtioScsiControllerStatsResponse other) {
      if (other == opi_api.storage.v1.VirtioScsiControllerStatsResponse.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasStats()) {
        mergeStats(other.getStats());
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
      opi_api.storage.v1.VirtioScsiControllerStatsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.VirtioScsiControllerStatsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.common.v1.ObjectKey id_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> idBuilder_;
    /**
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return idBuilder_ != null || id_ != null;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     * @return The id.
     */
    public opi_api.common.v1.ObjectKey getId() {
      if (idBuilder_ == null) {
        return id_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : id_;
      } else {
        return idBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public Builder setId(opi_api.common.v1.ObjectKey value) {
      if (idBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        id_ = value;
        onChanged();
      } else {
        idBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public Builder setId(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (idBuilder_ == null) {
        id_ = builderForValue.build();
        onChanged();
      } else {
        idBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public Builder mergeId(opi_api.common.v1.ObjectKey value) {
      if (idBuilder_ == null) {
        if (id_ != null) {
          id_ =
            opi_api.common.v1.ObjectKey.newBuilder(id_).mergeFrom(value).buildPartial();
        } else {
          id_ = value;
        }
        onChanged();
      } else {
        idBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public Builder clearId() {
      if (idBuilder_ == null) {
        id_ = null;
        onChanged();
      } else {
        id_ = null;
        idBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getIdBuilder() {
      
      onChanged();
      return getIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getIdOrBuilder() {
      if (idBuilder_ != null) {
        return idBuilder_.getMessageOrBuilder();
      } else {
        return id_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : id_;
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        idBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getId(),
                getParentForChildren(),
                isClean());
        id_ = null;
      }
      return idBuilder_;
    }

    private opi_api.storage.v1.VolumeStats stats_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.VolumeStats, opi_api.storage.v1.VolumeStats.Builder, opi_api.storage.v1.VolumeStatsOrBuilder> statsBuilder_;
    /**
     * <code>.opi_api.storage.v1.VolumeStats stats = 2;</code>
     * @return Whether the stats field is set.
     */
    public boolean hasStats() {
      return statsBuilder_ != null || stats_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.VolumeStats stats = 2;</code>
     * @return The stats.
     */
    public opi_api.storage.v1.VolumeStats getStats() {
      if (statsBuilder_ == null) {
        return stats_ == null ? opi_api.storage.v1.VolumeStats.getDefaultInstance() : stats_;
      } else {
        return statsBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.storage.v1.VolumeStats stats = 2;</code>
     */
    public Builder setStats(opi_api.storage.v1.VolumeStats value) {
      if (statsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stats_ = value;
        onChanged();
      } else {
        statsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.VolumeStats stats = 2;</code>
     */
    public Builder setStats(
        opi_api.storage.v1.VolumeStats.Builder builderForValue) {
      if (statsBuilder_ == null) {
        stats_ = builderForValue.build();
        onChanged();
      } else {
        statsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.VolumeStats stats = 2;</code>
     */
    public Builder mergeStats(opi_api.storage.v1.VolumeStats value) {
      if (statsBuilder_ == null) {
        if (stats_ != null) {
          stats_ =
            opi_api.storage.v1.VolumeStats.newBuilder(stats_).mergeFrom(value).buildPartial();
        } else {
          stats_ = value;
        }
        onChanged();
      } else {
        statsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.VolumeStats stats = 2;</code>
     */
    public Builder clearStats() {
      if (statsBuilder_ == null) {
        stats_ = null;
        onChanged();
      } else {
        stats_ = null;
        statsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.VolumeStats stats = 2;</code>
     */
    public opi_api.storage.v1.VolumeStats.Builder getStatsBuilder() {
      
      onChanged();
      return getStatsFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.VolumeStats stats = 2;</code>
     */
    public opi_api.storage.v1.VolumeStatsOrBuilder getStatsOrBuilder() {
      if (statsBuilder_ != null) {
        return statsBuilder_.getMessageOrBuilder();
      } else {
        return stats_ == null ?
            opi_api.storage.v1.VolumeStats.getDefaultInstance() : stats_;
      }
    }
    /**
     * <code>.opi_api.storage.v1.VolumeStats stats = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.VolumeStats, opi_api.storage.v1.VolumeStats.Builder, opi_api.storage.v1.VolumeStatsOrBuilder> 
        getStatsFieldBuilder() {
      if (statsBuilder_ == null) {
        statsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.VolumeStats, opi_api.storage.v1.VolumeStats.Builder, opi_api.storage.v1.VolumeStatsOrBuilder>(
                getStats(),
                getParentForChildren(),
                isClean());
        stats_ = null;
      }
      return statsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.VirtioScsiControllerStatsResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioScsiControllerStatsResponse)
  private static final opi_api.storage.v1.VirtioScsiControllerStatsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.VirtioScsiControllerStatsResponse();
  }

  public static opi_api.storage.v1.VirtioScsiControllerStatsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VirtioScsiControllerStatsResponse>
      PARSER = new com.google.protobuf.AbstractParser<VirtioScsiControllerStatsResponse>() {
    @java.lang.Override
    public VirtioScsiControllerStatsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VirtioScsiControllerStatsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VirtioScsiControllerStatsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VirtioScsiControllerStatsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.VirtioScsiControllerStatsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

