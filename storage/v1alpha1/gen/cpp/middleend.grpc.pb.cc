// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: middleend.proto

#include "middleend.pb.h"
#include "middleend.grpc.pb.h"

#include <functional>
#include <grpcpp/impl/codegen/async_stream.h>
#include <grpcpp/impl/codegen/async_unary_call.h>
#include <grpcpp/impl/codegen/channel_interface.h>
#include <grpcpp/impl/codegen/client_unary_call.h>
#include <grpcpp/impl/codegen/client_callback.h>
#include <grpcpp/impl/codegen/message_allocator.h>
#include <grpcpp/impl/codegen/method_handler.h>
#include <grpcpp/impl/codegen/rpc_service_method.h>
#include <grpcpp/impl/codegen/server_callback.h>
#include <grpcpp/impl/codegen/server_callback_handlers.h>
#include <grpcpp/impl/codegen/server_context.h>
#include <grpcpp/impl/codegen/service_type.h>
#include <grpcpp/impl/codegen/sync_stream.h>
namespace opi_api {
namespace storage {
namespace v1 {

static const char* MiddleendService_method_names[] = {
  "/opi_api.storage.v1.MiddleendService/CreateEncryptedVolume",
  "/opi_api.storage.v1.MiddleendService/DeleteEncryptedVolume",
  "/opi_api.storage.v1.MiddleendService/UpdateEncryptedVolume",
  "/opi_api.storage.v1.MiddleendService/ListEncryptedVolumes",
  "/opi_api.storage.v1.MiddleendService/GetEncryptedVolume",
  "/opi_api.storage.v1.MiddleendService/EncryptedVolumeStats",
};

std::unique_ptr< MiddleendService::Stub> MiddleendService::NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options) {
  (void)options;
  std::unique_ptr< MiddleendService::Stub> stub(new MiddleendService::Stub(channel, options));
  return stub;
}

MiddleendService::Stub::Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options)
  : channel_(channel), rpcmethod_CreateEncryptedVolume_(MiddleendService_method_names[0], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_DeleteEncryptedVolume_(MiddleendService_method_names[1], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_UpdateEncryptedVolume_(MiddleendService_method_names[2], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_ListEncryptedVolumes_(MiddleendService_method_names[3], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_GetEncryptedVolume_(MiddleendService_method_names[4], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_EncryptedVolumeStats_(MiddleendService_method_names[5], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  {}

::grpc::Status MiddleendService::Stub::CreateEncryptedVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::CreateEncryptedVolumeRequest& request, ::opi_api::storage::v1::EncryptedVolume* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::CreateEncryptedVolumeRequest, ::opi_api::storage::v1::EncryptedVolume, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_CreateEncryptedVolume_, context, request, response);
}

void MiddleendService::Stub::async::CreateEncryptedVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::CreateEncryptedVolumeRequest* request, ::opi_api::storage::v1::EncryptedVolume* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::CreateEncryptedVolumeRequest, ::opi_api::storage::v1::EncryptedVolume, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_CreateEncryptedVolume_, context, request, response, std::move(f));
}

void MiddleendService::Stub::async::CreateEncryptedVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::CreateEncryptedVolumeRequest* request, ::opi_api::storage::v1::EncryptedVolume* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_CreateEncryptedVolume_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::EncryptedVolume>* MiddleendService::Stub::PrepareAsyncCreateEncryptedVolumeRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::CreateEncryptedVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::EncryptedVolume, ::opi_api::storage::v1::CreateEncryptedVolumeRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_CreateEncryptedVolume_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::EncryptedVolume>* MiddleendService::Stub::AsyncCreateEncryptedVolumeRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::CreateEncryptedVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncCreateEncryptedVolumeRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status MiddleendService::Stub::DeleteEncryptedVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::DeleteEncryptedVolumeRequest& request, ::google::protobuf::Empty* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::DeleteEncryptedVolumeRequest, ::google::protobuf::Empty, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_DeleteEncryptedVolume_, context, request, response);
}

void MiddleendService::Stub::async::DeleteEncryptedVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::DeleteEncryptedVolumeRequest* request, ::google::protobuf::Empty* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::DeleteEncryptedVolumeRequest, ::google::protobuf::Empty, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_DeleteEncryptedVolume_, context, request, response, std::move(f));
}

void MiddleendService::Stub::async::DeleteEncryptedVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::DeleteEncryptedVolumeRequest* request, ::google::protobuf::Empty* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_DeleteEncryptedVolume_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::google::protobuf::Empty>* MiddleendService::Stub::PrepareAsyncDeleteEncryptedVolumeRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::DeleteEncryptedVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::google::protobuf::Empty, ::opi_api::storage::v1::DeleteEncryptedVolumeRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_DeleteEncryptedVolume_, context, request);
}

::grpc::ClientAsyncResponseReader< ::google::protobuf::Empty>* MiddleendService::Stub::AsyncDeleteEncryptedVolumeRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::DeleteEncryptedVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncDeleteEncryptedVolumeRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status MiddleendService::Stub::UpdateEncryptedVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::UpdateEncryptedVolumeRequest& request, ::opi_api::storage::v1::EncryptedVolume* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::UpdateEncryptedVolumeRequest, ::opi_api::storage::v1::EncryptedVolume, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_UpdateEncryptedVolume_, context, request, response);
}

void MiddleendService::Stub::async::UpdateEncryptedVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::UpdateEncryptedVolumeRequest* request, ::opi_api::storage::v1::EncryptedVolume* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::UpdateEncryptedVolumeRequest, ::opi_api::storage::v1::EncryptedVolume, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_UpdateEncryptedVolume_, context, request, response, std::move(f));
}

void MiddleendService::Stub::async::UpdateEncryptedVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::UpdateEncryptedVolumeRequest* request, ::opi_api::storage::v1::EncryptedVolume* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_UpdateEncryptedVolume_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::EncryptedVolume>* MiddleendService::Stub::PrepareAsyncUpdateEncryptedVolumeRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::UpdateEncryptedVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::EncryptedVolume, ::opi_api::storage::v1::UpdateEncryptedVolumeRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_UpdateEncryptedVolume_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::EncryptedVolume>* MiddleendService::Stub::AsyncUpdateEncryptedVolumeRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::UpdateEncryptedVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncUpdateEncryptedVolumeRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status MiddleendService::Stub::ListEncryptedVolumes(::grpc::ClientContext* context, const ::opi_api::storage::v1::ListEncryptedVolumesRequest& request, ::opi_api::storage::v1::ListEncryptedVolumesResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::ListEncryptedVolumesRequest, ::opi_api::storage::v1::ListEncryptedVolumesResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_ListEncryptedVolumes_, context, request, response);
}

void MiddleendService::Stub::async::ListEncryptedVolumes(::grpc::ClientContext* context, const ::opi_api::storage::v1::ListEncryptedVolumesRequest* request, ::opi_api::storage::v1::ListEncryptedVolumesResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::ListEncryptedVolumesRequest, ::opi_api::storage::v1::ListEncryptedVolumesResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_ListEncryptedVolumes_, context, request, response, std::move(f));
}

void MiddleendService::Stub::async::ListEncryptedVolumes(::grpc::ClientContext* context, const ::opi_api::storage::v1::ListEncryptedVolumesRequest* request, ::opi_api::storage::v1::ListEncryptedVolumesResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_ListEncryptedVolumes_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::ListEncryptedVolumesResponse>* MiddleendService::Stub::PrepareAsyncListEncryptedVolumesRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::ListEncryptedVolumesRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::ListEncryptedVolumesResponse, ::opi_api::storage::v1::ListEncryptedVolumesRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_ListEncryptedVolumes_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::ListEncryptedVolumesResponse>* MiddleendService::Stub::AsyncListEncryptedVolumesRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::ListEncryptedVolumesRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncListEncryptedVolumesRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status MiddleendService::Stub::GetEncryptedVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::GetEncryptedVolumeRequest& request, ::opi_api::storage::v1::EncryptedVolume* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::GetEncryptedVolumeRequest, ::opi_api::storage::v1::EncryptedVolume, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_GetEncryptedVolume_, context, request, response);
}

void MiddleendService::Stub::async::GetEncryptedVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::GetEncryptedVolumeRequest* request, ::opi_api::storage::v1::EncryptedVolume* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::GetEncryptedVolumeRequest, ::opi_api::storage::v1::EncryptedVolume, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_GetEncryptedVolume_, context, request, response, std::move(f));
}

void MiddleendService::Stub::async::GetEncryptedVolume(::grpc::ClientContext* context, const ::opi_api::storage::v1::GetEncryptedVolumeRequest* request, ::opi_api::storage::v1::EncryptedVolume* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_GetEncryptedVolume_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::EncryptedVolume>* MiddleendService::Stub::PrepareAsyncGetEncryptedVolumeRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::GetEncryptedVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::EncryptedVolume, ::opi_api::storage::v1::GetEncryptedVolumeRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_GetEncryptedVolume_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::EncryptedVolume>* MiddleendService::Stub::AsyncGetEncryptedVolumeRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::GetEncryptedVolumeRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncGetEncryptedVolumeRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status MiddleendService::Stub::EncryptedVolumeStats(::grpc::ClientContext* context, const ::opi_api::storage::v1::EncryptedVolumeStatsRequest& request, ::opi_api::storage::v1::EncryptedVolumeStatsResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::EncryptedVolumeStatsRequest, ::opi_api::storage::v1::EncryptedVolumeStatsResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_EncryptedVolumeStats_, context, request, response);
}

void MiddleendService::Stub::async::EncryptedVolumeStats(::grpc::ClientContext* context, const ::opi_api::storage::v1::EncryptedVolumeStatsRequest* request, ::opi_api::storage::v1::EncryptedVolumeStatsResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::EncryptedVolumeStatsRequest, ::opi_api::storage::v1::EncryptedVolumeStatsResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_EncryptedVolumeStats_, context, request, response, std::move(f));
}

void MiddleendService::Stub::async::EncryptedVolumeStats(::grpc::ClientContext* context, const ::opi_api::storage::v1::EncryptedVolumeStatsRequest* request, ::opi_api::storage::v1::EncryptedVolumeStatsResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_EncryptedVolumeStats_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::EncryptedVolumeStatsResponse>* MiddleendService::Stub::PrepareAsyncEncryptedVolumeStatsRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::EncryptedVolumeStatsRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::EncryptedVolumeStatsResponse, ::opi_api::storage::v1::EncryptedVolumeStatsRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_EncryptedVolumeStats_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::EncryptedVolumeStatsResponse>* MiddleendService::Stub::AsyncEncryptedVolumeStatsRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::EncryptedVolumeStatsRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncEncryptedVolumeStatsRaw(context, request, cq);
  result->StartCall();
  return result;
}

MiddleendService::Service::Service() {
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      MiddleendService_method_names[0],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< MiddleendService::Service, ::opi_api::storage::v1::CreateEncryptedVolumeRequest, ::opi_api::storage::v1::EncryptedVolume, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](MiddleendService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::CreateEncryptedVolumeRequest* req,
             ::opi_api::storage::v1::EncryptedVolume* resp) {
               return service->CreateEncryptedVolume(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      MiddleendService_method_names[1],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< MiddleendService::Service, ::opi_api::storage::v1::DeleteEncryptedVolumeRequest, ::google::protobuf::Empty, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](MiddleendService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::DeleteEncryptedVolumeRequest* req,
             ::google::protobuf::Empty* resp) {
               return service->DeleteEncryptedVolume(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      MiddleendService_method_names[2],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< MiddleendService::Service, ::opi_api::storage::v1::UpdateEncryptedVolumeRequest, ::opi_api::storage::v1::EncryptedVolume, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](MiddleendService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::UpdateEncryptedVolumeRequest* req,
             ::opi_api::storage::v1::EncryptedVolume* resp) {
               return service->UpdateEncryptedVolume(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      MiddleendService_method_names[3],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< MiddleendService::Service, ::opi_api::storage::v1::ListEncryptedVolumesRequest, ::opi_api::storage::v1::ListEncryptedVolumesResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](MiddleendService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::ListEncryptedVolumesRequest* req,
             ::opi_api::storage::v1::ListEncryptedVolumesResponse* resp) {
               return service->ListEncryptedVolumes(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      MiddleendService_method_names[4],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< MiddleendService::Service, ::opi_api::storage::v1::GetEncryptedVolumeRequest, ::opi_api::storage::v1::EncryptedVolume, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](MiddleendService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::GetEncryptedVolumeRequest* req,
             ::opi_api::storage::v1::EncryptedVolume* resp) {
               return service->GetEncryptedVolume(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      MiddleendService_method_names[5],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< MiddleendService::Service, ::opi_api::storage::v1::EncryptedVolumeStatsRequest, ::opi_api::storage::v1::EncryptedVolumeStatsResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](MiddleendService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::EncryptedVolumeStatsRequest* req,
             ::opi_api::storage::v1::EncryptedVolumeStatsResponse* resp) {
               return service->EncryptedVolumeStats(ctx, req, resp);
             }, this)));
}

MiddleendService::Service::~Service() {
}

::grpc::Status MiddleendService::Service::CreateEncryptedVolume(::grpc::ServerContext* context, const ::opi_api::storage::v1::CreateEncryptedVolumeRequest* request, ::opi_api::storage::v1::EncryptedVolume* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status MiddleendService::Service::DeleteEncryptedVolume(::grpc::ServerContext* context, const ::opi_api::storage::v1::DeleteEncryptedVolumeRequest* request, ::google::protobuf::Empty* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status MiddleendService::Service::UpdateEncryptedVolume(::grpc::ServerContext* context, const ::opi_api::storage::v1::UpdateEncryptedVolumeRequest* request, ::opi_api::storage::v1::EncryptedVolume* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status MiddleendService::Service::ListEncryptedVolumes(::grpc::ServerContext* context, const ::opi_api::storage::v1::ListEncryptedVolumesRequest* request, ::opi_api::storage::v1::ListEncryptedVolumesResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status MiddleendService::Service::GetEncryptedVolume(::grpc::ServerContext* context, const ::opi_api::storage::v1::GetEncryptedVolumeRequest* request, ::opi_api::storage::v1::EncryptedVolume* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status MiddleendService::Service::EncryptedVolumeStats(::grpc::ServerContext* context, const ::opi_api::storage::v1::EncryptedVolumeStatsRequest* request, ::opi_api::storage::v1::EncryptedVolumeStatsResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}


}  // namespace opi_api
}  // namespace storage
}  // namespace v1

