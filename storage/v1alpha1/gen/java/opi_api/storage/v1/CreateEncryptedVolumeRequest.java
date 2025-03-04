// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.CreateEncryptedVolumeRequest}
 */
public final class CreateEncryptedVolumeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.CreateEncryptedVolumeRequest)
    CreateEncryptedVolumeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateEncryptedVolumeRequest.newBuilder() to construct.
  private CreateEncryptedVolumeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateEncryptedVolumeRequest() {
    parent_ = "";
    encryptedVolumeId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateEncryptedVolumeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateEncryptedVolumeRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            opi_api.storage.v1.EncryptedVolume.Builder subBuilder = null;
            if (encryptedVolume_ != null) {
              subBuilder = encryptedVolume_.toBuilder();
            }
            encryptedVolume_ = input.readMessage(opi_api.storage.v1.EncryptedVolume.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(encryptedVolume_);
              encryptedVolume_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            encryptedVolumeId_ = s;
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
    return opi_api.storage.v1.MiddleendProto.internal_static_opi_api_storage_v1_CreateEncryptedVolumeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.MiddleendProto.internal_static_opi_api_storage_v1_CreateEncryptedVolumeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.CreateEncryptedVolumeRequest.class, opi_api.storage.v1.CreateEncryptedVolumeRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENCRYPTED_VOLUME_FIELD_NUMBER = 2;
  private opi_api.storage.v1.EncryptedVolume encryptedVolume_;
  /**
   * <code>.opi_api.storage.v1.EncryptedVolume encrypted_volume = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the encryptedVolume field is set.
   */
  @java.lang.Override
  public boolean hasEncryptedVolume() {
    return encryptedVolume_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.EncryptedVolume encrypted_volume = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The encryptedVolume.
   */
  @java.lang.Override
  public opi_api.storage.v1.EncryptedVolume getEncryptedVolume() {
    return encryptedVolume_ == null ? opi_api.storage.v1.EncryptedVolume.getDefaultInstance() : encryptedVolume_;
  }
  /**
   * <code>.opi_api.storage.v1.EncryptedVolume encrypted_volume = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.EncryptedVolumeOrBuilder getEncryptedVolumeOrBuilder() {
    return getEncryptedVolume();
  }

  public static final int ENCRYPTED_VOLUME_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object encryptedVolumeId_;
  /**
   * <code>string encrypted_volume_id = 3;</code>
   * @return The encryptedVolumeId.
   */
  @java.lang.Override
  public java.lang.String getEncryptedVolumeId() {
    java.lang.Object ref = encryptedVolumeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      encryptedVolumeId_ = s;
      return s;
    }
  }
  /**
   * <code>string encrypted_volume_id = 3;</code>
   * @return The bytes for encryptedVolumeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEncryptedVolumeIdBytes() {
    java.lang.Object ref = encryptedVolumeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      encryptedVolumeId_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (encryptedVolume_ != null) {
      output.writeMessage(2, getEncryptedVolume());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(encryptedVolumeId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, encryptedVolumeId_);
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
    if (encryptedVolume_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEncryptedVolume());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(encryptedVolumeId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, encryptedVolumeId_);
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
    if (!(obj instanceof opi_api.storage.v1.CreateEncryptedVolumeRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.CreateEncryptedVolumeRequest other = (opi_api.storage.v1.CreateEncryptedVolumeRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasEncryptedVolume() != other.hasEncryptedVolume()) return false;
    if (hasEncryptedVolume()) {
      if (!getEncryptedVolume()
          .equals(other.getEncryptedVolume())) return false;
    }
    if (!getEncryptedVolumeId()
        .equals(other.getEncryptedVolumeId())) return false;
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
    if (hasEncryptedVolume()) {
      hash = (37 * hash) + ENCRYPTED_VOLUME_FIELD_NUMBER;
      hash = (53 * hash) + getEncryptedVolume().hashCode();
    }
    hash = (37 * hash) + ENCRYPTED_VOLUME_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEncryptedVolumeId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.CreateEncryptedVolumeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateEncryptedVolumeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateEncryptedVolumeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateEncryptedVolumeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateEncryptedVolumeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateEncryptedVolumeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateEncryptedVolumeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateEncryptedVolumeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateEncryptedVolumeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateEncryptedVolumeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateEncryptedVolumeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateEncryptedVolumeRequest parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.CreateEncryptedVolumeRequest prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.CreateEncryptedVolumeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.CreateEncryptedVolumeRequest)
      opi_api.storage.v1.CreateEncryptedVolumeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.MiddleendProto.internal_static_opi_api_storage_v1_CreateEncryptedVolumeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.MiddleendProto.internal_static_opi_api_storage_v1_CreateEncryptedVolumeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.CreateEncryptedVolumeRequest.class, opi_api.storage.v1.CreateEncryptedVolumeRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.CreateEncryptedVolumeRequest.newBuilder()
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
      parent_ = "";

      if (encryptedVolumeBuilder_ == null) {
        encryptedVolume_ = null;
      } else {
        encryptedVolume_ = null;
        encryptedVolumeBuilder_ = null;
      }
      encryptedVolumeId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.MiddleendProto.internal_static_opi_api_storage_v1_CreateEncryptedVolumeRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateEncryptedVolumeRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.CreateEncryptedVolumeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateEncryptedVolumeRequest build() {
      opi_api.storage.v1.CreateEncryptedVolumeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateEncryptedVolumeRequest buildPartial() {
      opi_api.storage.v1.CreateEncryptedVolumeRequest result = new opi_api.storage.v1.CreateEncryptedVolumeRequest(this);
      result.parent_ = parent_;
      if (encryptedVolumeBuilder_ == null) {
        result.encryptedVolume_ = encryptedVolume_;
      } else {
        result.encryptedVolume_ = encryptedVolumeBuilder_.build();
      }
      result.encryptedVolumeId_ = encryptedVolumeId_;
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
      if (other instanceof opi_api.storage.v1.CreateEncryptedVolumeRequest) {
        return mergeFrom((opi_api.storage.v1.CreateEncryptedVolumeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.CreateEncryptedVolumeRequest other) {
      if (other == opi_api.storage.v1.CreateEncryptedVolumeRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasEncryptedVolume()) {
        mergeEncryptedVolume(other.getEncryptedVolume());
      }
      if (!other.getEncryptedVolumeId().isEmpty()) {
        encryptedVolumeId_ = other.encryptedVolumeId_;
        onChanged();
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
      opi_api.storage.v1.CreateEncryptedVolumeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.CreateEncryptedVolumeRequest) e.getUnfinishedMessage();
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
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private opi_api.storage.v1.EncryptedVolume encryptedVolume_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.EncryptedVolume, opi_api.storage.v1.EncryptedVolume.Builder, opi_api.storage.v1.EncryptedVolumeOrBuilder> encryptedVolumeBuilder_;
    /**
     * <code>.opi_api.storage.v1.EncryptedVolume encrypted_volume = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the encryptedVolume field is set.
     */
    public boolean hasEncryptedVolume() {
      return encryptedVolumeBuilder_ != null || encryptedVolume_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.EncryptedVolume encrypted_volume = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The encryptedVolume.
     */
    public opi_api.storage.v1.EncryptedVolume getEncryptedVolume() {
      if (encryptedVolumeBuilder_ == null) {
        return encryptedVolume_ == null ? opi_api.storage.v1.EncryptedVolume.getDefaultInstance() : encryptedVolume_;
      } else {
        return encryptedVolumeBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.storage.v1.EncryptedVolume encrypted_volume = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setEncryptedVolume(opi_api.storage.v1.EncryptedVolume value) {
      if (encryptedVolumeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        encryptedVolume_ = value;
        onChanged();
      } else {
        encryptedVolumeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.EncryptedVolume encrypted_volume = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setEncryptedVolume(
        opi_api.storage.v1.EncryptedVolume.Builder builderForValue) {
      if (encryptedVolumeBuilder_ == null) {
        encryptedVolume_ = builderForValue.build();
        onChanged();
      } else {
        encryptedVolumeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.EncryptedVolume encrypted_volume = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeEncryptedVolume(opi_api.storage.v1.EncryptedVolume value) {
      if (encryptedVolumeBuilder_ == null) {
        if (encryptedVolume_ != null) {
          encryptedVolume_ =
            opi_api.storage.v1.EncryptedVolume.newBuilder(encryptedVolume_).mergeFrom(value).buildPartial();
        } else {
          encryptedVolume_ = value;
        }
        onChanged();
      } else {
        encryptedVolumeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.EncryptedVolume encrypted_volume = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearEncryptedVolume() {
      if (encryptedVolumeBuilder_ == null) {
        encryptedVolume_ = null;
        onChanged();
      } else {
        encryptedVolume_ = null;
        encryptedVolumeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.EncryptedVolume encrypted_volume = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.EncryptedVolume.Builder getEncryptedVolumeBuilder() {
      
      onChanged();
      return getEncryptedVolumeFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.EncryptedVolume encrypted_volume = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.EncryptedVolumeOrBuilder getEncryptedVolumeOrBuilder() {
      if (encryptedVolumeBuilder_ != null) {
        return encryptedVolumeBuilder_.getMessageOrBuilder();
      } else {
        return encryptedVolume_ == null ?
            opi_api.storage.v1.EncryptedVolume.getDefaultInstance() : encryptedVolume_;
      }
    }
    /**
     * <code>.opi_api.storage.v1.EncryptedVolume encrypted_volume = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.EncryptedVolume, opi_api.storage.v1.EncryptedVolume.Builder, opi_api.storage.v1.EncryptedVolumeOrBuilder> 
        getEncryptedVolumeFieldBuilder() {
      if (encryptedVolumeBuilder_ == null) {
        encryptedVolumeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.EncryptedVolume, opi_api.storage.v1.EncryptedVolume.Builder, opi_api.storage.v1.EncryptedVolumeOrBuilder>(
                getEncryptedVolume(),
                getParentForChildren(),
                isClean());
        encryptedVolume_ = null;
      }
      return encryptedVolumeBuilder_;
    }

    private java.lang.Object encryptedVolumeId_ = "";
    /**
     * <code>string encrypted_volume_id = 3;</code>
     * @return The encryptedVolumeId.
     */
    public java.lang.String getEncryptedVolumeId() {
      java.lang.Object ref = encryptedVolumeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        encryptedVolumeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string encrypted_volume_id = 3;</code>
     * @return The bytes for encryptedVolumeId.
     */
    public com.google.protobuf.ByteString
        getEncryptedVolumeIdBytes() {
      java.lang.Object ref = encryptedVolumeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        encryptedVolumeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string encrypted_volume_id = 3;</code>
     * @param value The encryptedVolumeId to set.
     * @return This builder for chaining.
     */
    public Builder setEncryptedVolumeId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      encryptedVolumeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string encrypted_volume_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncryptedVolumeId() {
      
      encryptedVolumeId_ = getDefaultInstance().getEncryptedVolumeId();
      onChanged();
      return this;
    }
    /**
     * <code>string encrypted_volume_id = 3;</code>
     * @param value The bytes for encryptedVolumeId to set.
     * @return This builder for chaining.
     */
    public Builder setEncryptedVolumeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      encryptedVolumeId_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.CreateEncryptedVolumeRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateEncryptedVolumeRequest)
  private static final opi_api.storage.v1.CreateEncryptedVolumeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.CreateEncryptedVolumeRequest();
  }

  public static opi_api.storage.v1.CreateEncryptedVolumeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEncryptedVolumeRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateEncryptedVolumeRequest>() {
    @java.lang.Override
    public CreateEncryptedVolumeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateEncryptedVolumeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateEncryptedVolumeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEncryptedVolumeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.CreateEncryptedVolumeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

