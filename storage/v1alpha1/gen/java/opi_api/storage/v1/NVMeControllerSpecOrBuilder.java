// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface NVMeControllerSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NVMeControllerSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object's unique identifier
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * object's unique identifier
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return The id.
   */
  opi_api.common.v1.ObjectKey getId();
  /**
   * <pre>
   * object's unique identifier
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * subsystem controller id range: 0 to 65535.
   * must not be reused under the same subsystem
   * </pre>
   *
   * <code>int32 nvme_controller_id = 2;</code>
   * @return The nvmeControllerId.
   */
  int getNvmeControllerId();

  /**
   * <pre>
   * subsystem information
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey subsystem_id = 3;</code>
   * @return Whether the subsystemId field is set.
   */
  boolean hasSubsystemId();
  /**
   * <pre>
   * subsystem information
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey subsystem_id = 3;</code>
   * @return The subsystemId.
   */
  opi_api.common.v1.ObjectKey getSubsystemId();
  /**
   * <pre>
   * subsystem information
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey subsystem_id = 3;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getSubsystemIdOrBuilder();

  /**
   * <pre>
   * xPU's PCI ID for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.PciEndpoint pcie_id = 4;</code>
   * @return Whether the pcieId field is set.
   */
  boolean hasPcieId();
  /**
   * <pre>
   * xPU's PCI ID for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.PciEndpoint pcie_id = 4;</code>
   * @return The pcieId.
   */
  opi_api.storage.v1.PciEndpoint getPcieId();
  /**
   * <pre>
   * xPU's PCI ID for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.PciEndpoint pcie_id = 4;</code>
   */
  opi_api.storage.v1.PciEndpointOrBuilder getPcieIdOrBuilder();

  /**
   * <pre>
   * maximum number of host submission queues allowed.
   * If not set, the xPU will provide a default.
   * </pre>
   *
   * <code>int32 max_nsq = 5;</code>
   * @return The maxNsq.
   */
  int getMaxNsq();

  /**
   * <pre>
   * maximum number of host completion queues allowed.
   * If not set, the xPU will provide a default.
   * </pre>
   *
   * <code>int32 max_ncq = 6;</code>
   * @return The maxNcq.
   */
  int getMaxNcq();

  /**
   * <pre>
   * maximum number of submission queue entries per submission queue, as a power of 2.
   * default value as per spec is 6
   * </pre>
   *
   * <code>int32 sqes = 7;</code>
   * @return The sqes.
   */
  int getSqes();

  /**
   * <pre>
   * maximum number of completion queue entries per completion queue, as a power of 2.
   * default value as per spec is 4
   * </pre>
   *
   * <code>int32 cqes = 8;</code>
   * @return The cqes.
   */
  int getCqes();

  /**
   * <pre>
   * maximum Number of namespaces that will be provisioned under
   * the controller.
   * </pre>
   *
   * <code>int32 max_namespaces = 9;</code>
   * @return The maxNamespaces.
   */
  int getMaxNamespaces();
}
