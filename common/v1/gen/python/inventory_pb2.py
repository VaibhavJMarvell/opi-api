# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: inventory.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x0finventory.proto\x12\x14opi_api.inventory.v1\"\xbf\x01\n\nDeviceInfo\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x02 \x01(\t\x12\n\n\x02id\x18\x03 \x01(\t\x12\x10\n\x08mfg_name\x18\x04 \x01(\t\x12\x10\n\x08mfg_date\x18\x05 \x01(\t\x12\x12\n\nhw_version\x18\x06 \x01(\t\x12\x12\n\nfw_version\x18\x07 \x01(\t\x12\x12\n\nsw_version\x18\x08 \x01(\t\x12\x11\n\tserial_no\x18\t \x01(\t\x12\x0f\n\x07part_no\x18\n \x01(\t\"\x15\n\x13InventoryGetRequest\"I\n\x14InventoryGetResponse\x12\x31\n\x07\x64\x65vinfo\x18\x01 \x01(\x0b\x32 .opi_api.inventory.v1.DeviceInfo2w\n\x0cInventorySvc\x12g\n\x0cInventoryGet\x12).opi_api.inventory.v1.InventoryGetRequest\x1a*.opi_api.inventory.v1.InventoryGetResponse\"\x00\x42\x30Z.github.com/opiproject/opi-api/common/v1/gen/gob\x06proto3')



_DEVICEINFO = DESCRIPTOR.message_types_by_name['DeviceInfo']
_INVENTORYGETREQUEST = DESCRIPTOR.message_types_by_name['InventoryGetRequest']
_INVENTORYGETRESPONSE = DESCRIPTOR.message_types_by_name['InventoryGetResponse']
DeviceInfo = _reflection.GeneratedProtocolMessageType('DeviceInfo', (_message.Message,), {
  'DESCRIPTOR' : _DEVICEINFO,
  '__module__' : 'inventory_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.inventory.v1.DeviceInfo)
  })
_sym_db.RegisterMessage(DeviceInfo)

InventoryGetRequest = _reflection.GeneratedProtocolMessageType('InventoryGetRequest', (_message.Message,), {
  'DESCRIPTOR' : _INVENTORYGETREQUEST,
  '__module__' : 'inventory_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.inventory.v1.InventoryGetRequest)
  })
_sym_db.RegisterMessage(InventoryGetRequest)

InventoryGetResponse = _reflection.GeneratedProtocolMessageType('InventoryGetResponse', (_message.Message,), {
  'DESCRIPTOR' : _INVENTORYGETRESPONSE,
  '__module__' : 'inventory_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.inventory.v1.InventoryGetResponse)
  })
_sym_db.RegisterMessage(InventoryGetResponse)

_INVENTORYSVC = DESCRIPTOR.services_by_name['InventorySvc']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'Z.github.com/opiproject/opi-api/common/v1/gen/go'
  _DEVICEINFO._serialized_start=42
  _DEVICEINFO._serialized_end=233
  _INVENTORYGETREQUEST._serialized_start=235
  _INVENTORYGETREQUEST._serialized_end=256
  _INVENTORYGETRESPONSE._serialized_start=258
  _INVENTORYGETRESPONSE._serialized_end=331
  _INVENTORYSVC._serialized_start=333
  _INVENTORYSVC._serialized_end=452
# @@protoc_insertion_point(module_scope)
