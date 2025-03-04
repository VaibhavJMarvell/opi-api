// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

/**
 * Protobuf enum {@code opi_api.storage.v1.NvmeTransportType}
 */
public enum NvmeTransportType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NVME_TRANSPORT_TYPE_UNSPECIFIED = 0;</code>
   */
  NVME_TRANSPORT_TYPE_UNSPECIFIED(0),
  /**
   * <code>NVME_TRANSPORT_FC = 1;</code>
   */
  NVME_TRANSPORT_FC(1),
  /**
   * <code>NVME_TRANSPORT_PCIE = 2;</code>
   */
  NVME_TRANSPORT_PCIE(2),
  /**
   * <code>NVME_TRANSPORT_RDMA = 3;</code>
   */
  NVME_TRANSPORT_RDMA(3),
  /**
   * <code>NVME_TRANSPORT_TCP = 4;</code>
   */
  NVME_TRANSPORT_TCP(4),
  /**
   * <code>NVME_TRANSPORT_CUSTOM = 5;</code>
   */
  NVME_TRANSPORT_CUSTOM(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NVME_TRANSPORT_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int NVME_TRANSPORT_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>NVME_TRANSPORT_FC = 1;</code>
   */
  public static final int NVME_TRANSPORT_FC_VALUE = 1;
  /**
   * <code>NVME_TRANSPORT_PCIE = 2;</code>
   */
  public static final int NVME_TRANSPORT_PCIE_VALUE = 2;
  /**
   * <code>NVME_TRANSPORT_RDMA = 3;</code>
   */
  public static final int NVME_TRANSPORT_RDMA_VALUE = 3;
  /**
   * <code>NVME_TRANSPORT_TCP = 4;</code>
   */
  public static final int NVME_TRANSPORT_TCP_VALUE = 4;
  /**
   * <code>NVME_TRANSPORT_CUSTOM = 5;</code>
   */
  public static final int NVME_TRANSPORT_CUSTOM_VALUE = 5;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static NvmeTransportType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NvmeTransportType forNumber(int value) {
    switch (value) {
      case 0: return NVME_TRANSPORT_TYPE_UNSPECIFIED;
      case 1: return NVME_TRANSPORT_FC;
      case 2: return NVME_TRANSPORT_PCIE;
      case 3: return NVME_TRANSPORT_RDMA;
      case 4: return NVME_TRANSPORT_TCP;
      case 5: return NVME_TRANSPORT_CUSTOM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NvmeTransportType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      NvmeTransportType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NvmeTransportType>() {
          public NvmeTransportType findValueByNumber(int number) {
            return NvmeTransportType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return opi_api.storage.v1.BackendNvmeTcpProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final NvmeTransportType[] VALUES = values();

  public static NvmeTransportType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private NvmeTransportType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opi_api.storage.v1.NvmeTransportType)
}

