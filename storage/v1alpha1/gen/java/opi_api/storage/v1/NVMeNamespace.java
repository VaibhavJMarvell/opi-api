// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.NVMeNamespace}
 */
public final class NVMeNamespace extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.NVMeNamespace)
    NVMeNamespaceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NVMeNamespace.newBuilder() to construct.
  private NVMeNamespace(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NVMeNamespace() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NVMeNamespace();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NVMeNamespace(
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
            opi_api.storage.v1.NVMeNamespaceSpec.Builder subBuilder = null;
            if (spec_ != null) {
              subBuilder = spec_.toBuilder();
            }
            spec_ = input.readMessage(opi_api.storage.v1.NVMeNamespaceSpec.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(spec_);
              spec_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            opi_api.storage.v1.NVMeNamespaceStatus.Builder subBuilder = null;
            if (status_ != null) {
              subBuilder = status_.toBuilder();
            }
            status_ = input.readMessage(opi_api.storage.v1.NVMeNamespaceStatus.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(status_);
              status_ = subBuilder.buildPartial();
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
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_NVMeNamespace_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_NVMeNamespace_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.NVMeNamespace.class, opi_api.storage.v1.NVMeNamespace.Builder.class);
  }

  public static final int SPEC_FIELD_NUMBER = 1;
  private opi_api.storage.v1.NVMeNamespaceSpec spec_;
  /**
   * <code>.opi_api.storage.v1.NVMeNamespaceSpec spec = 1;</code>
   * @return Whether the spec field is set.
   */
  @java.lang.Override
  public boolean hasSpec() {
    return spec_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.NVMeNamespaceSpec spec = 1;</code>
   * @return The spec.
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMeNamespaceSpec getSpec() {
    return spec_ == null ? opi_api.storage.v1.NVMeNamespaceSpec.getDefaultInstance() : spec_;
  }
  /**
   * <code>.opi_api.storage.v1.NVMeNamespaceSpec spec = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMeNamespaceSpecOrBuilder getSpecOrBuilder() {
    return getSpec();
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private opi_api.storage.v1.NVMeNamespaceStatus status_;
  /**
   * <code>.opi_api.storage.v1.NVMeNamespaceStatus status = 2;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.NVMeNamespaceStatus status = 2;</code>
   * @return The status.
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMeNamespaceStatus getStatus() {
    return status_ == null ? opi_api.storage.v1.NVMeNamespaceStatus.getDefaultInstance() : status_;
  }
  /**
   * <code>.opi_api.storage.v1.NVMeNamespaceStatus status = 2;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMeNamespaceStatusOrBuilder getStatusOrBuilder() {
    return getStatus();
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
    if (spec_ != null) {
      output.writeMessage(1, getSpec());
    }
    if (status_ != null) {
      output.writeMessage(2, getStatus());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (spec_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSpec());
    }
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStatus());
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
    if (!(obj instanceof opi_api.storage.v1.NVMeNamespace)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.NVMeNamespace other = (opi_api.storage.v1.NVMeNamespace) obj;

    if (hasSpec() != other.hasSpec()) return false;
    if (hasSpec()) {
      if (!getSpec()
          .equals(other.getSpec())) return false;
    }
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
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
    if (hasSpec()) {
      hash = (37 * hash) + SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getSpec().hashCode();
    }
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.NVMeNamespace parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NVMeNamespace parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NVMeNamespace parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NVMeNamespace parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NVMeNamespace parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NVMeNamespace parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NVMeNamespace parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NVMeNamespace parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.NVMeNamespace parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NVMeNamespace parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.NVMeNamespace parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NVMeNamespace parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.NVMeNamespace prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.NVMeNamespace}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.NVMeNamespace)
      opi_api.storage.v1.NVMeNamespaceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_NVMeNamespace_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_NVMeNamespace_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.NVMeNamespace.class, opi_api.storage.v1.NVMeNamespace.Builder.class);
    }

    // Construct using opi_api.storage.v1.NVMeNamespace.newBuilder()
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
      if (specBuilder_ == null) {
        spec_ = null;
      } else {
        spec_ = null;
        specBuilder_ = null;
      }
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_NVMeNamespace_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.NVMeNamespace getDefaultInstanceForType() {
      return opi_api.storage.v1.NVMeNamespace.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.NVMeNamespace build() {
      opi_api.storage.v1.NVMeNamespace result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.NVMeNamespace buildPartial() {
      opi_api.storage.v1.NVMeNamespace result = new opi_api.storage.v1.NVMeNamespace(this);
      if (specBuilder_ == null) {
        result.spec_ = spec_;
      } else {
        result.spec_ = specBuilder_.build();
      }
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
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
      if (other instanceof opi_api.storage.v1.NVMeNamespace) {
        return mergeFrom((opi_api.storage.v1.NVMeNamespace)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.NVMeNamespace other) {
      if (other == opi_api.storage.v1.NVMeNamespace.getDefaultInstance()) return this;
      if (other.hasSpec()) {
        mergeSpec(other.getSpec());
      }
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
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
      opi_api.storage.v1.NVMeNamespace parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.NVMeNamespace) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.storage.v1.NVMeNamespaceSpec spec_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NVMeNamespaceSpec, opi_api.storage.v1.NVMeNamespaceSpec.Builder, opi_api.storage.v1.NVMeNamespaceSpecOrBuilder> specBuilder_;
    /**
     * <code>.opi_api.storage.v1.NVMeNamespaceSpec spec = 1;</code>
     * @return Whether the spec field is set.
     */
    public boolean hasSpec() {
      return specBuilder_ != null || spec_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeNamespaceSpec spec = 1;</code>
     * @return The spec.
     */
    public opi_api.storage.v1.NVMeNamespaceSpec getSpec() {
      if (specBuilder_ == null) {
        return spec_ == null ? opi_api.storage.v1.NVMeNamespaceSpec.getDefaultInstance() : spec_;
      } else {
        return specBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.storage.v1.NVMeNamespaceSpec spec = 1;</code>
     */
    public Builder setSpec(opi_api.storage.v1.NVMeNamespaceSpec value) {
      if (specBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        spec_ = value;
        onChanged();
      } else {
        specBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeNamespaceSpec spec = 1;</code>
     */
    public Builder setSpec(
        opi_api.storage.v1.NVMeNamespaceSpec.Builder builderForValue) {
      if (specBuilder_ == null) {
        spec_ = builderForValue.build();
        onChanged();
      } else {
        specBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeNamespaceSpec spec = 1;</code>
     */
    public Builder mergeSpec(opi_api.storage.v1.NVMeNamespaceSpec value) {
      if (specBuilder_ == null) {
        if (spec_ != null) {
          spec_ =
            opi_api.storage.v1.NVMeNamespaceSpec.newBuilder(spec_).mergeFrom(value).buildPartial();
        } else {
          spec_ = value;
        }
        onChanged();
      } else {
        specBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeNamespaceSpec spec = 1;</code>
     */
    public Builder clearSpec() {
      if (specBuilder_ == null) {
        spec_ = null;
        onChanged();
      } else {
        spec_ = null;
        specBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeNamespaceSpec spec = 1;</code>
     */
    public opi_api.storage.v1.NVMeNamespaceSpec.Builder getSpecBuilder() {
      
      onChanged();
      return getSpecFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.NVMeNamespaceSpec spec = 1;</code>
     */
    public opi_api.storage.v1.NVMeNamespaceSpecOrBuilder getSpecOrBuilder() {
      if (specBuilder_ != null) {
        return specBuilder_.getMessageOrBuilder();
      } else {
        return spec_ == null ?
            opi_api.storage.v1.NVMeNamespaceSpec.getDefaultInstance() : spec_;
      }
    }
    /**
     * <code>.opi_api.storage.v1.NVMeNamespaceSpec spec = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NVMeNamespaceSpec, opi_api.storage.v1.NVMeNamespaceSpec.Builder, opi_api.storage.v1.NVMeNamespaceSpecOrBuilder> 
        getSpecFieldBuilder() {
      if (specBuilder_ == null) {
        specBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.NVMeNamespaceSpec, opi_api.storage.v1.NVMeNamespaceSpec.Builder, opi_api.storage.v1.NVMeNamespaceSpecOrBuilder>(
                getSpec(),
                getParentForChildren(),
                isClean());
        spec_ = null;
      }
      return specBuilder_;
    }

    private opi_api.storage.v1.NVMeNamespaceStatus status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NVMeNamespaceStatus, opi_api.storage.v1.NVMeNamespaceStatus.Builder, opi_api.storage.v1.NVMeNamespaceStatusOrBuilder> statusBuilder_;
    /**
     * <code>.opi_api.storage.v1.NVMeNamespaceStatus status = 2;</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeNamespaceStatus status = 2;</code>
     * @return The status.
     */
    public opi_api.storage.v1.NVMeNamespaceStatus getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? opi_api.storage.v1.NVMeNamespaceStatus.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.storage.v1.NVMeNamespaceStatus status = 2;</code>
     */
    public Builder setStatus(opi_api.storage.v1.NVMeNamespaceStatus value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeNamespaceStatus status = 2;</code>
     */
    public Builder setStatus(
        opi_api.storage.v1.NVMeNamespaceStatus.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeNamespaceStatus status = 2;</code>
     */
    public Builder mergeStatus(opi_api.storage.v1.NVMeNamespaceStatus value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ =
            opi_api.storage.v1.NVMeNamespaceStatus.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeNamespaceStatus status = 2;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeNamespaceStatus status = 2;</code>
     */
    public opi_api.storage.v1.NVMeNamespaceStatus.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.NVMeNamespaceStatus status = 2;</code>
     */
    public opi_api.storage.v1.NVMeNamespaceStatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            opi_api.storage.v1.NVMeNamespaceStatus.getDefaultInstance() : status_;
      }
    }
    /**
     * <code>.opi_api.storage.v1.NVMeNamespaceStatus status = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NVMeNamespaceStatus, opi_api.storage.v1.NVMeNamespaceStatus.Builder, opi_api.storage.v1.NVMeNamespaceStatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.NVMeNamespaceStatus, opi_api.storage.v1.NVMeNamespaceStatus.Builder, opi_api.storage.v1.NVMeNamespaceStatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.NVMeNamespace)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespace)
  private static final opi_api.storage.v1.NVMeNamespace DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.NVMeNamespace();
  }

  public static opi_api.storage.v1.NVMeNamespace getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NVMeNamespace>
      PARSER = new com.google.protobuf.AbstractParser<NVMeNamespace>() {
    @java.lang.Override
    public NVMeNamespace parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NVMeNamespace(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NVMeNamespace> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NVMeNamespace> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.NVMeNamespace getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

