package org.apache.rocketmq.schema.registry.core.proto.dynamic;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.DescriptorProtos.MethodDescriptorProto;
import com.google.protobuf.DescriptorProtos.MethodOptions.IdempotencyLevel;
import com.google.protobuf.DescriptorProtos.ServiceDescriptorProto;

/**
 * ServiceDefinition
 */
public class ServiceDefinition {
  // --- public static ---

  public static Builder newBuilder(String serviceName) {
    return new Builder(serviceName);
  }

  // --- public ---

  public String toString() {
    return mServiceType.toString();
  }

  // --- package ---

  ServiceDescriptorProto getServiceType() {
    return mServiceType;
  }

  // --- private ---

  private ServiceDefinition(ServiceDescriptorProto serviceType) {
    mServiceType = serviceType;
  }

  private ServiceDescriptorProto mServiceType;

  /**
   * ServiceDefinition.Builder
   */
  public static class Builder {
    // --- public ---

    public void addMethod(
        String name,
        String inputType,
        String outputType,
        Boolean clientStreaming,
        Boolean serverStreaming,
        Boolean isDeprecated,
        IdempotencyLevel idempotencyLevel
    ) {
      MethodDescriptorProto.Builder methodBuilder = MethodDescriptorProto.newBuilder();
      methodBuilder.setName(name)
          .setInputType(inputType)
          .setOutputType(outputType);
      if (clientStreaming != null) {
        methodBuilder.setClientStreaming(clientStreaming);
      }
      if (serverStreaming != null) {
        methodBuilder.setServerStreaming(serverStreaming);
      }
      if (isDeprecated != null) {
        DescriptorProtos.MethodOptions.Builder optionsBuilder =
            DescriptorProtos.MethodOptions.newBuilder();
        optionsBuilder.setDeprecated(isDeprecated);
        methodBuilder.mergeOptions(optionsBuilder.build());
      }
      if (idempotencyLevel != null) {
        DescriptorProtos.MethodOptions.Builder optionsBuilder =
            DescriptorProtos.MethodOptions.newBuilder();
        optionsBuilder.setIdempotencyLevel(idempotencyLevel);
        methodBuilder.mergeOptions(optionsBuilder.build());
      }
      mServiceTypeBuilder.addMethod(methodBuilder.build());
    }

    public Builder setDeprecated(boolean isDeprecated) {
      DescriptorProtos.ServiceOptions.Builder optionsBuilder =
          DescriptorProtos.ServiceOptions.newBuilder();
      optionsBuilder.setDeprecated(isDeprecated);
      mServiceTypeBuilder.mergeOptions(optionsBuilder.build());
      return this;
    }

    public ServiceDefinition build() {
      return new ServiceDefinition(mServiceTypeBuilder.build());
    }

    // --- private ---

    private Builder(String serviceTypeName) {
      mServiceTypeBuilder = ServiceDescriptorProto.newBuilder();
      mServiceTypeBuilder.setName(serviceTypeName);
    }

    private ServiceDescriptorProto.Builder mServiceTypeBuilder;
  }
}