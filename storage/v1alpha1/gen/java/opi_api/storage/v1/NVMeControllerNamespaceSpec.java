// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.NVMeControllerNamespaceSpec}
 */
public final class NVMeControllerNamespaceSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.NVMeControllerNamespaceSpec)
    NVMeControllerNamespaceSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NVMeControllerNamespaceSpec.newBuilder() to construct.
  private NVMeControllerNamespaceSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NVMeControllerNamespaceSpec() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NVMeControllerNamespaceSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NVMeControllerNamespaceSpec(
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
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (subsystemId_ != null) {
              subBuilder = subsystemId_.toBuilder();
            }
            subsystemId_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(subsystemId_);
              subsystemId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            nvmeControllerId_ = input.readInt32();
            break;
          }
          case 32: {

            hostNsid_ = input.readInt32();
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
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_NVMeControllerNamespaceSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_NVMeControllerNamespaceSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.NVMeControllerNamespaceSpec.class, opi_api.storage.v1.NVMeControllerNamespaceSpec.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private opi_api.common.v1.ObjectKey id_;
  /**
   * <pre>
   * namespace's unique key
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return id_ != null;
  }
  /**
   * <pre>
   * namespace's unique key
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getId() {
    return id_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : id_;
  }
  /**
   * <pre>
   * namespace's unique key
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getIdOrBuilder() {
    return getId();
  }

  public static final int SUBSYSTEM_ID_FIELD_NUMBER = 2;
  private opi_api.common.v1.ObjectKey subsystemId_;
  /**
   * <pre>
   * subsystem for this namespace
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey subsystem_id = 2;</code>
   * @return Whether the subsystemId field is set.
   */
  @java.lang.Override
  public boolean hasSubsystemId() {
    return subsystemId_ != null;
  }
  /**
   * <pre>
   * subsystem for this namespace
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey subsystem_id = 2;</code>
   * @return The subsystemId.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getSubsystemId() {
    return subsystemId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : subsystemId_;
  }
  /**
   * <pre>
   * subsystem for this namespace
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey subsystem_id = 2;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getSubsystemIdOrBuilder() {
    return getSubsystemId();
  }

  public static final int NVME_CONTROLLER_ID_FIELD_NUMBER = 3;
  private int nvmeControllerId_;
  /**
   * <pre>
   * subsystem controller id range: 0 to 65535.
   * must not be reused under the same subsystem
   * </pre>
   *
   * <code>int32 nvme_controller_id = 3;</code>
   * @return The nvmeControllerId.
   */
  @java.lang.Override
  public int getNvmeControllerId() {
    return nvmeControllerId_;
  }

  public static final int HOST_NSID_FIELD_NUMBER = 4;
  private int hostNsid_;
  /**
   * <pre>
   * NSID present to the host by the NVMe PCIe controller.
   * If not provided, then the controller will assign an unused NSID
   * within the max namespace range - auto assigned nsid may not work
   * for live migration
   * </pre>
   *
   * <code>int32 host_nsid = 4;</code>
   * @return The hostNsid.
   */
  @java.lang.Override
  public int getHostNsid() {
    return hostNsid_;
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
    if (subsystemId_ != null) {
      output.writeMessage(2, getSubsystemId());
    }
    if (nvmeControllerId_ != 0) {
      output.writeInt32(3, nvmeControllerId_);
    }
    if (hostNsid_ != 0) {
      output.writeInt32(4, hostNsid_);
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
    if (subsystemId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSubsystemId());
    }
    if (nvmeControllerId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, nvmeControllerId_);
    }
    if (hostNsid_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, hostNsid_);
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
    if (!(obj instanceof opi_api.storage.v1.NVMeControllerNamespaceSpec)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.NVMeControllerNamespaceSpec other = (opi_api.storage.v1.NVMeControllerNamespaceSpec) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (hasSubsystemId() != other.hasSubsystemId()) return false;
    if (hasSubsystemId()) {
      if (!getSubsystemId()
          .equals(other.getSubsystemId())) return false;
    }
    if (getNvmeControllerId()
        != other.getNvmeControllerId()) return false;
    if (getHostNsid()
        != other.getHostNsid()) return false;
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
    if (hasSubsystemId()) {
      hash = (37 * hash) + SUBSYSTEM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSubsystemId().hashCode();
    }
    hash = (37 * hash) + NVME_CONTROLLER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNvmeControllerId();
    hash = (37 * hash) + HOST_NSID_FIELD_NUMBER;
    hash = (53 * hash) + getHostNsid();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.NVMeControllerNamespaceSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NVMeControllerNamespaceSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NVMeControllerNamespaceSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NVMeControllerNamespaceSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NVMeControllerNamespaceSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NVMeControllerNamespaceSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NVMeControllerNamespaceSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NVMeControllerNamespaceSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.NVMeControllerNamespaceSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NVMeControllerNamespaceSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.NVMeControllerNamespaceSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NVMeControllerNamespaceSpec parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.NVMeControllerNamespaceSpec prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.NVMeControllerNamespaceSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.NVMeControllerNamespaceSpec)
      opi_api.storage.v1.NVMeControllerNamespaceSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_NVMeControllerNamespaceSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_NVMeControllerNamespaceSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.NVMeControllerNamespaceSpec.class, opi_api.storage.v1.NVMeControllerNamespaceSpec.Builder.class);
    }

    // Construct using opi_api.storage.v1.NVMeControllerNamespaceSpec.newBuilder()
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
      if (subsystemIdBuilder_ == null) {
        subsystemId_ = null;
      } else {
        subsystemId_ = null;
        subsystemIdBuilder_ = null;
      }
      nvmeControllerId_ = 0;

      hostNsid_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_NVMeControllerNamespaceSpec_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.NVMeControllerNamespaceSpec getDefaultInstanceForType() {
      return opi_api.storage.v1.NVMeControllerNamespaceSpec.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.NVMeControllerNamespaceSpec build() {
      opi_api.storage.v1.NVMeControllerNamespaceSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.NVMeControllerNamespaceSpec buildPartial() {
      opi_api.storage.v1.NVMeControllerNamespaceSpec result = new opi_api.storage.v1.NVMeControllerNamespaceSpec(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (subsystemIdBuilder_ == null) {
        result.subsystemId_ = subsystemId_;
      } else {
        result.subsystemId_ = subsystemIdBuilder_.build();
      }
      result.nvmeControllerId_ = nvmeControllerId_;
      result.hostNsid_ = hostNsid_;
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
      if (other instanceof opi_api.storage.v1.NVMeControllerNamespaceSpec) {
        return mergeFrom((opi_api.storage.v1.NVMeControllerNamespaceSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.NVMeControllerNamespaceSpec other) {
      if (other == opi_api.storage.v1.NVMeControllerNamespaceSpec.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasSubsystemId()) {
        mergeSubsystemId(other.getSubsystemId());
      }
      if (other.getNvmeControllerId() != 0) {
        setNvmeControllerId(other.getNvmeControllerId());
      }
      if (other.getHostNsid() != 0) {
        setHostNsid(other.getHostNsid());
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
      opi_api.storage.v1.NVMeControllerNamespaceSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.NVMeControllerNamespaceSpec) e.getUnfinishedMessage();
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
     * <pre>
     * namespace's unique key
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return idBuilder_ != null || id_ != null;
    }
    /**
     * <pre>
     * namespace's unique key
     * </pre>
     *
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
     * <pre>
     * namespace's unique key
     * </pre>
     *
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
     * <pre>
     * namespace's unique key
     * </pre>
     *
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
     * <pre>
     * namespace's unique key
     * </pre>
     *
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
     * <pre>
     * namespace's unique key
     * </pre>
     *
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
     * <pre>
     * namespace's unique key
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getIdBuilder() {
      
      onChanged();
      return getIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * namespace's unique key
     * </pre>
     *
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
     * <pre>
     * namespace's unique key
     * </pre>
     *
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

    private opi_api.common.v1.ObjectKey subsystemId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> subsystemIdBuilder_;
    /**
     * <pre>
     * subsystem for this namespace
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey subsystem_id = 2;</code>
     * @return Whether the subsystemId field is set.
     */
    public boolean hasSubsystemId() {
      return subsystemIdBuilder_ != null || subsystemId_ != null;
    }
    /**
     * <pre>
     * subsystem for this namespace
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey subsystem_id = 2;</code>
     * @return The subsystemId.
     */
    public opi_api.common.v1.ObjectKey getSubsystemId() {
      if (subsystemIdBuilder_ == null) {
        return subsystemId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : subsystemId_;
      } else {
        return subsystemIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * subsystem for this namespace
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey subsystem_id = 2;</code>
     */
    public Builder setSubsystemId(opi_api.common.v1.ObjectKey value) {
      if (subsystemIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        subsystemId_ = value;
        onChanged();
      } else {
        subsystemIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * subsystem for this namespace
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey subsystem_id = 2;</code>
     */
    public Builder setSubsystemId(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (subsystemIdBuilder_ == null) {
        subsystemId_ = builderForValue.build();
        onChanged();
      } else {
        subsystemIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * subsystem for this namespace
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey subsystem_id = 2;</code>
     */
    public Builder mergeSubsystemId(opi_api.common.v1.ObjectKey value) {
      if (subsystemIdBuilder_ == null) {
        if (subsystemId_ != null) {
          subsystemId_ =
            opi_api.common.v1.ObjectKey.newBuilder(subsystemId_).mergeFrom(value).buildPartial();
        } else {
          subsystemId_ = value;
        }
        onChanged();
      } else {
        subsystemIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * subsystem for this namespace
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey subsystem_id = 2;</code>
     */
    public Builder clearSubsystemId() {
      if (subsystemIdBuilder_ == null) {
        subsystemId_ = null;
        onChanged();
      } else {
        subsystemId_ = null;
        subsystemIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * subsystem for this namespace
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey subsystem_id = 2;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getSubsystemIdBuilder() {
      
      onChanged();
      return getSubsystemIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * subsystem for this namespace
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey subsystem_id = 2;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getSubsystemIdOrBuilder() {
      if (subsystemIdBuilder_ != null) {
        return subsystemIdBuilder_.getMessageOrBuilder();
      } else {
        return subsystemId_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : subsystemId_;
      }
    }
    /**
     * <pre>
     * subsystem for this namespace
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey subsystem_id = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getSubsystemIdFieldBuilder() {
      if (subsystemIdBuilder_ == null) {
        subsystemIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getSubsystemId(),
                getParentForChildren(),
                isClean());
        subsystemId_ = null;
      }
      return subsystemIdBuilder_;
    }

    private int nvmeControllerId_ ;
    /**
     * <pre>
     * subsystem controller id range: 0 to 65535.
     * must not be reused under the same subsystem
     * </pre>
     *
     * <code>int32 nvme_controller_id = 3;</code>
     * @return The nvmeControllerId.
     */
    @java.lang.Override
    public int getNvmeControllerId() {
      return nvmeControllerId_;
    }
    /**
     * <pre>
     * subsystem controller id range: 0 to 65535.
     * must not be reused under the same subsystem
     * </pre>
     *
     * <code>int32 nvme_controller_id = 3;</code>
     * @param value The nvmeControllerId to set.
     * @return This builder for chaining.
     */
    public Builder setNvmeControllerId(int value) {
      
      nvmeControllerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * subsystem controller id range: 0 to 65535.
     * must not be reused under the same subsystem
     * </pre>
     *
     * <code>int32 nvme_controller_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNvmeControllerId() {
      
      nvmeControllerId_ = 0;
      onChanged();
      return this;
    }

    private int hostNsid_ ;
    /**
     * <pre>
     * NSID present to the host by the NVMe PCIe controller.
     * If not provided, then the controller will assign an unused NSID
     * within the max namespace range - auto assigned nsid may not work
     * for live migration
     * </pre>
     *
     * <code>int32 host_nsid = 4;</code>
     * @return The hostNsid.
     */
    @java.lang.Override
    public int getHostNsid() {
      return hostNsid_;
    }
    /**
     * <pre>
     * NSID present to the host by the NVMe PCIe controller.
     * If not provided, then the controller will assign an unused NSID
     * within the max namespace range - auto assigned nsid may not work
     * for live migration
     * </pre>
     *
     * <code>int32 host_nsid = 4;</code>
     * @param value The hostNsid to set.
     * @return This builder for chaining.
     */
    public Builder setHostNsid(int value) {
      
      hostNsid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * NSID present to the host by the NVMe PCIe controller.
     * If not provided, then the controller will assign an unused NSID
     * within the max namespace range - auto assigned nsid may not work
     * for live migration
     * </pre>
     *
     * <code>int32 host_nsid = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHostNsid() {
      
      hostNsid_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.NVMeControllerNamespaceSpec)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerNamespaceSpec)
  private static final opi_api.storage.v1.NVMeControllerNamespaceSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.NVMeControllerNamespaceSpec();
  }

  public static opi_api.storage.v1.NVMeControllerNamespaceSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NVMeControllerNamespaceSpec>
      PARSER = new com.google.protobuf.AbstractParser<NVMeControllerNamespaceSpec>() {
    @java.lang.Override
    public NVMeControllerNamespaceSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NVMeControllerNamespaceSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NVMeControllerNamespaceSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NVMeControllerNamespaceSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.NVMeControllerNamespaceSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

