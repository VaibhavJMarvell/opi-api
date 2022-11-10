// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_null.proto

package opi_api.storage.v1;

public final class BackendNullProto {
  private BackendNullProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebug_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebug_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugCreateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugCreateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugDeleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugDeleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugUpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugGetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugGetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugStatsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NullDebugStatsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NullDebugStatsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022backend_null.proto\022\022opi_api.storage.v1" +
      "\032\033google/protobuf/empty.proto\032\020object_ke" +
      "y.proto\032\nuuid.proto\"\212\001\n\tNullDebug\022,\n\006han" +
      "dle\030\001 \001(\0132\034.opi_api.common.v1.ObjectKey\022" +
      "\022\n\nblock_size\030\002 \001(\003\022\024\n\014blocks_count\030\003 \001(" +
      "\003\022%\n\004uuid\030\004 \001(\0132\027.opi_api.common.v1.Uuid" +
      "\"G\n\026NullDebugCreateRequest\022-\n\006device\030\001 \001" +
      "(\0132\035.opi_api.storage.v1.NullDebug\"F\n\026Nul" +
      "lDebugDeleteRequest\022,\n\006handle\030\001 \001(\0132\034.op" +
      "i_api.common.v1.ObjectKey\"G\n\026NullDebugUp" +
      "dateRequest\022-\n\006device\030\001 \001(\0132\035.opi_api.st" +
      "orage.v1.NullDebug\"\026\n\024NullDebugListReque" +
      "st\"F\n\025NullDebugListResponse\022-\n\006device\030\001 " +
      "\003(\0132\035.opi_api.storage.v1.NullDebug\"C\n\023Nu" +
      "llDebugGetRequest\022,\n\006handle\030\001 \001(\0132\034.opi_" +
      "api.common.v1.ObjectKey\"E\n\025NullDebugStat" +
      "sRequest\022,\n\006handle\030\001 \001(\0132\034.opi_api.commo" +
      "n.v1.ObjectKey\"U\n\026NullDebugStatsResponse" +
      "\022,\n\006handle\030\001 \001(\0132\034.opi_api.common.v1.Obj" +
      "ectKey\022\r\n\005stats\030\002 \001(\t2\330\004\n\020NullDebugServi" +
      "ce\022^\n\017NullDebugCreate\022*.opi_api.storage." +
      "v1.NullDebugCreateRequest\032\035.opi_api.stor" +
      "age.v1.NullDebug\"\000\022W\n\017NullDebugDelete\022*." +
      "opi_api.storage.v1.NullDebugDeleteReques" +
      "t\032\026.google.protobuf.Empty\"\000\022^\n\017NullDebug" +
      "Update\022*.opi_api.storage.v1.NullDebugUpd" +
      "ateRequest\032\035.opi_api.storage.v1.NullDebu" +
      "g\"\000\022f\n\rNullDebugList\022(.opi_api.storage.v" +
      "1.NullDebugListRequest\032).opi_api.storage" +
      ".v1.NullDebugListResponse\"\000\022X\n\014NullDebug" +
      "Get\022\'.opi_api.storage.v1.NullDebugGetReq" +
      "uest\032\035.opi_api.storage.v1.NullDebug\"\000\022i\n" +
      "\016NullDebugStats\022).opi_api.storage.v1.Nul" +
      "lDebugStatsRequest\032*.opi_api.storage.v1." +
      "NullDebugStatsResponse\"\000B_\n\022opi_api.stor" +
      "age.v1B\020BackendNullProtoP\001Z5github.com/o" +
      "piproject/opi-api/storage/v1alpha1/gen/g" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          opi_api.common.v1.ObjectKeyProto.getDescriptor(),
          opi_api.common.v1.UuidProto.getDescriptor(),
        });
    internal_static_opi_api_storage_v1_NullDebug_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_storage_v1_NullDebug_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebug_descriptor,
        new java.lang.String[] { "Handle", "BlockSize", "BlocksCount", "Uuid", });
    internal_static_opi_api_storage_v1_NullDebugCreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_storage_v1_NullDebugCreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugCreateRequest_descriptor,
        new java.lang.String[] { "Device", });
    internal_static_opi_api_storage_v1_NullDebugDeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_storage_v1_NullDebugDeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugDeleteRequest_descriptor,
        new java.lang.String[] { "Handle", });
    internal_static_opi_api_storage_v1_NullDebugUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_storage_v1_NullDebugUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugUpdateRequest_descriptor,
        new java.lang.String[] { "Device", });
    internal_static_opi_api_storage_v1_NullDebugListRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_storage_v1_NullDebugListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugListRequest_descriptor,
        new java.lang.String[] { });
    internal_static_opi_api_storage_v1_NullDebugListResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_storage_v1_NullDebugListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugListResponse_descriptor,
        new java.lang.String[] { "Device", });
    internal_static_opi_api_storage_v1_NullDebugGetRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_storage_v1_NullDebugGetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugGetRequest_descriptor,
        new java.lang.String[] { "Handle", });
    internal_static_opi_api_storage_v1_NullDebugStatsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_storage_v1_NullDebugStatsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugStatsRequest_descriptor,
        new java.lang.String[] { "Handle", });
    internal_static_opi_api_storage_v1_NullDebugStatsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opi_api_storage_v1_NullDebugStatsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NullDebugStatsResponse_descriptor,
        new java.lang.String[] { "Handle", "Stats", });
    com.google.protobuf.EmptyProto.getDescriptor();
    opi_api.common.v1.ObjectKeyProto.getDescriptor();
    opi_api.common.v1.UuidProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
