// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_blk.proto

package opi_api.storage.v1;

public final class FrontendVirtioBlkProto {
  private FrontendVirtioBlkProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_VirtioBlk_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_VirtioBlk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_CreateVirtioBlkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_CreateVirtioBlkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_DeleteVirtioBlkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_DeleteVirtioBlkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_UpdateVirtioBlkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_UpdateVirtioBlkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListVirtioBlkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListVirtioBlkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListVirtioBlkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListVirtioBlkResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_GetVirtioBlkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_GetVirtioBlkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_VirtioBlkStatsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_VirtioBlkStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_VirtioBlkStatsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_VirtioBlkStatsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031frontend_virtio_blk.proto\022\022opi_api.sto" +
      "rage.v1\032\017opicommon.proto\032\020object_key.pro" +
      "to\032\033google/protobuf/empty.proto\032\034google/" +
      "api/annotations.proto\"\240\001\n\tVirtioBlk\022(\n\002i" +
      "d\030\001 \001(\0132\034.opi_api.common.v1.ObjectKey\0220\n" +
      "\007pcie_id\030\002 \001(\0132\037.opi_api.storage.v1.PciE" +
      "ndpoint\022\014\n\004bdev\030\003 \001(\t\022\022\n\nmax_io_qps\030\004 \001(" +
      "\003\022\025\n\rserial_number\030\005 \001(\t\"K\n\026CreateVirtio" +
      "BlkRequest\0221\n\ncontroller\030\001 \001(\0132\035.opi_api" +
      ".storage.v1.VirtioBlk\"M\n\026DeleteVirtioBlk" +
      "Request\0223\n\rcontroller_id\030\001 \001(\0132\034.opi_api" +
      ".common.v1.ObjectKey\"K\n\026UpdateVirtioBlkR" +
      "equest\0221\n\ncontroller\030\001 \001(\0132\035.opi_api.sto" +
      "rage.v1.VirtioBlk\"=\n\024ListVirtioBlkReques" +
      "t\022\021\n\tpage_size\030\001 \001(\005\022\022\n\npage_token\030\002 \001(\t" +
      "\"d\n\025ListVirtioBlkResponse\0222\n\013controllers" +
      "\030\001 \003(\0132\035.opi_api.storage.v1.VirtioBlk\022\027\n" +
      "\017next_page_token\030\002 \001(\t\"J\n\023GetVirtioBlkRe" +
      "quest\0223\n\rcontroller_id\030\001 \001(\0132\034.opi_api.c" +
      "ommon.v1.ObjectKey\"L\n\025VirtioBlkStatsRequ" +
      "est\0223\n\rcontroller_id\030\001 \001(\0132\034.opi_api.com" +
      "mon.v1.ObjectKey\"Q\n\026VirtioBlkStatsRespon" +
      "se\022(\n\002id\030\001 \001(\0132\034.opi_api.common.v1.Objec" +
      "tKey\022\r\n\005stats\030\002 \001(\t2\374\005\n\030FrontendVirtioBl" +
      "kService\022\177\n\017CreateVirtioBlk\022*.opi_api.st" +
      "orage.v1.CreateVirtioBlkRequest\032\035.opi_ap" +
      "i.storage.v1.VirtioBlk\"!\202\323\344\223\002\033\"\016/v1/virt" +
      "ioblks:\tvirtioblk\022y\n\017DeleteVirtioBlk\022*.o" +
      "pi_api.storage.v1.DeleteVirtioBlkRequest" +
      "\032\026.google.protobuf.Empty\"\"\202\323\344\223\002\034*\032/v1/vi" +
      "rtioblks/{virtioblk}\022\177\n\017UpdateVirtioBlk\022" +
      "*.opi_api.storage.v1.UpdateVirtioBlkRequ" +
      "est\032\035.opi_api.storage.v1.VirtioBlk\"!\202\323\344\223" +
      "\002\0332\016/v1/virtioblks:\tvirtioblk\022|\n\rListVir" +
      "tioBlk\022(.opi_api.storage.v1.ListVirtioBl" +
      "kRequest\032).opi_api.storage.v1.ListVirtio" +
      "BlkResponse\"\026\202\323\344\223\002\020\022\016/v1/virtioblks\022z\n\014G" +
      "etVirtioBlk\022\'.opi_api.storage.v1.GetVirt" +
      "ioBlkRequest\032\035.opi_api.storage.v1.Virtio" +
      "Blk\"\"\202\323\344\223\002\034\022\032/v1/virtioblks/{virtioblk}\022" +
      "i\n\016VirtioBlkStats\022).opi_api.storage.v1.V" +
      "irtioBlkStatsRequest\032*.opi_api.storage.v" +
      "1.VirtioBlkStatsResponse\"\000Be\n\022opi_api.st" +
      "orage.v1B\026FrontendVirtioBlkProtoP\001Z5gith" +
      "ub.com/opiproject/opi-api/storage/v1alph" +
      "a1/gen/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          opi_api.storage.v1.OpiCommonProto.getDescriptor(),
          opi_api.common.v1.ObjectKeyProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_opi_api_storage_v1_VirtioBlk_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_storage_v1_VirtioBlk_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_VirtioBlk_descriptor,
        new java.lang.String[] { "Id", "PcieId", "Bdev", "MaxIoQps", "SerialNumber", });
    internal_static_opi_api_storage_v1_CreateVirtioBlkRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_storage_v1_CreateVirtioBlkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_CreateVirtioBlkRequest_descriptor,
        new java.lang.String[] { "Controller", });
    internal_static_opi_api_storage_v1_DeleteVirtioBlkRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_storage_v1_DeleteVirtioBlkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_DeleteVirtioBlkRequest_descriptor,
        new java.lang.String[] { "ControllerId", });
    internal_static_opi_api_storage_v1_UpdateVirtioBlkRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_storage_v1_UpdateVirtioBlkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_UpdateVirtioBlkRequest_descriptor,
        new java.lang.String[] { "Controller", });
    internal_static_opi_api_storage_v1_ListVirtioBlkRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_storage_v1_ListVirtioBlkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListVirtioBlkRequest_descriptor,
        new java.lang.String[] { "PageSize", "PageToken", });
    internal_static_opi_api_storage_v1_ListVirtioBlkResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_storage_v1_ListVirtioBlkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListVirtioBlkResponse_descriptor,
        new java.lang.String[] { "Controllers", "NextPageToken", });
    internal_static_opi_api_storage_v1_GetVirtioBlkRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_storage_v1_GetVirtioBlkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_GetVirtioBlkRequest_descriptor,
        new java.lang.String[] { "ControllerId", });
    internal_static_opi_api_storage_v1_VirtioBlkStatsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_storage_v1_VirtioBlkStatsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_VirtioBlkStatsRequest_descriptor,
        new java.lang.String[] { "ControllerId", });
    internal_static_opi_api_storage_v1_VirtioBlkStatsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opi_api_storage_v1_VirtioBlkStatsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_VirtioBlkStatsResponse_descriptor,
        new java.lang.String[] { "Id", "Stats", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    opi_api.storage.v1.OpiCommonProto.getDescriptor();
    opi_api.common.v1.ObjectKeyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
