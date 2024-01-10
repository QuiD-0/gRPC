import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: personService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CreatePersonUseCaseGrpc {

  private CreatePersonUseCaseGrpc() {}

  public static final java.lang.String SERVICE_NAME = "CreatePersonUseCase";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<PersonService.PersonProto,
      PersonService.PersonProto> getCreatePersonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createPerson",
      requestType = PersonService.PersonProto.class,
      responseType = PersonService.PersonProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<PersonService.PersonProto,
      PersonService.PersonProto> getCreatePersonMethod() {
    io.grpc.MethodDescriptor<PersonService.PersonProto, PersonService.PersonProto> getCreatePersonMethod;
    if ((getCreatePersonMethod = CreatePersonUseCaseGrpc.getCreatePersonMethod) == null) {
      synchronized (CreatePersonUseCaseGrpc.class) {
        if ((getCreatePersonMethod = CreatePersonUseCaseGrpc.getCreatePersonMethod) == null) {
          CreatePersonUseCaseGrpc.getCreatePersonMethod = getCreatePersonMethod =
              io.grpc.MethodDescriptor.<PersonService.PersonProto, PersonService.PersonProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createPerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PersonService.PersonProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PersonService.PersonProto.getDefaultInstance()))
              .setSchemaDescriptor(new CreatePersonUseCaseMethodDescriptorSupplier("createPerson"))
              .build();
        }
      }
    }
    return getCreatePersonMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CreatePersonUseCaseStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CreatePersonUseCaseStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CreatePersonUseCaseStub>() {
        @java.lang.Override
        public CreatePersonUseCaseStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CreatePersonUseCaseStub(channel, callOptions);
        }
      };
    return CreatePersonUseCaseStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CreatePersonUseCaseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CreatePersonUseCaseBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CreatePersonUseCaseBlockingStub>() {
        @java.lang.Override
        public CreatePersonUseCaseBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CreatePersonUseCaseBlockingStub(channel, callOptions);
        }
      };
    return CreatePersonUseCaseBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CreatePersonUseCaseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CreatePersonUseCaseFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CreatePersonUseCaseFutureStub>() {
        @java.lang.Override
        public CreatePersonUseCaseFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CreatePersonUseCaseFutureStub(channel, callOptions);
        }
      };
    return CreatePersonUseCaseFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createPerson(PersonService.PersonProto request,
        io.grpc.stub.StreamObserver<PersonService.PersonProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePersonMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CreatePersonUseCase.
   */
  public static abstract class CreatePersonUseCaseImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CreatePersonUseCaseGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CreatePersonUseCase.
   */
  public static final class CreatePersonUseCaseStub
      extends io.grpc.stub.AbstractAsyncStub<CreatePersonUseCaseStub> {
    private CreatePersonUseCaseStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreatePersonUseCaseStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CreatePersonUseCaseStub(channel, callOptions);
    }

    /**
     */
    public void createPerson(PersonService.PersonProto request,
        io.grpc.stub.StreamObserver<PersonService.PersonProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePersonMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CreatePersonUseCase.
   */
  public static final class CreatePersonUseCaseBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CreatePersonUseCaseBlockingStub> {
    private CreatePersonUseCaseBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreatePersonUseCaseBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CreatePersonUseCaseBlockingStub(channel, callOptions);
    }

    /**
     */
    public PersonService.PersonProto createPerson(PersonService.PersonProto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePersonMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CreatePersonUseCase.
   */
  public static final class CreatePersonUseCaseFutureStub
      extends io.grpc.stub.AbstractFutureStub<CreatePersonUseCaseFutureStub> {
    private CreatePersonUseCaseFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreatePersonUseCaseFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CreatePersonUseCaseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<PersonService.PersonProto> createPerson(
        PersonService.PersonProto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePersonMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PERSON = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PERSON:
          serviceImpl.createPerson((PersonService.PersonProto) request,
              (io.grpc.stub.StreamObserver<PersonService.PersonProto>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreatePersonMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              PersonService.PersonProto,
              PersonService.PersonProto>(
                service, METHODID_CREATE_PERSON)))
        .build();
  }

  private static abstract class CreatePersonUseCaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CreatePersonUseCaseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return PersonService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CreatePersonUseCase");
    }
  }

  private static final class CreatePersonUseCaseFileDescriptorSupplier
      extends CreatePersonUseCaseBaseDescriptorSupplier {
    CreatePersonUseCaseFileDescriptorSupplier() {}
  }

  private static final class CreatePersonUseCaseMethodDescriptorSupplier
      extends CreatePersonUseCaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CreatePersonUseCaseMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CreatePersonUseCaseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CreatePersonUseCaseFileDescriptorSupplier())
              .addMethod(getCreatePersonMethod())
              .build();
        }
      }
    }
    return result;
  }
}
