import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: personService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GetPersonUseCaseGrpc {

  private GetPersonUseCaseGrpc() {}

  public static final java.lang.String SERVICE_NAME = "GetPersonUseCase";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<PersonService.PersonGetRequest,
      PersonService.PersonProto> getGetPersonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPerson",
      requestType = PersonService.PersonGetRequest.class,
      responseType = PersonService.PersonProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<PersonService.PersonGetRequest,
      PersonService.PersonProto> getGetPersonMethod() {
    io.grpc.MethodDescriptor<PersonService.PersonGetRequest, PersonService.PersonProto> getGetPersonMethod;
    if ((getGetPersonMethod = GetPersonUseCaseGrpc.getGetPersonMethod) == null) {
      synchronized (GetPersonUseCaseGrpc.class) {
        if ((getGetPersonMethod = GetPersonUseCaseGrpc.getGetPersonMethod) == null) {
          GetPersonUseCaseGrpc.getGetPersonMethod = getGetPersonMethod =
              io.grpc.MethodDescriptor.<PersonService.PersonGetRequest, PersonService.PersonProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PersonService.PersonGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PersonService.PersonProto.getDefaultInstance()))
              .setSchemaDescriptor(new GetPersonUseCaseMethodDescriptorSupplier("getPerson"))
              .build();
        }
      }
    }
    return getGetPersonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<PersonService.PersonGetRequest,
      PersonService.PersonProto> getGetPersonByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPersonById",
      requestType = PersonService.PersonGetRequest.class,
      responseType = PersonService.PersonProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<PersonService.PersonGetRequest,
      PersonService.PersonProto> getGetPersonByIdMethod() {
    io.grpc.MethodDescriptor<PersonService.PersonGetRequest, PersonService.PersonProto> getGetPersonByIdMethod;
    if ((getGetPersonByIdMethod = GetPersonUseCaseGrpc.getGetPersonByIdMethod) == null) {
      synchronized (GetPersonUseCaseGrpc.class) {
        if ((getGetPersonByIdMethod = GetPersonUseCaseGrpc.getGetPersonByIdMethod) == null) {
          GetPersonUseCaseGrpc.getGetPersonByIdMethod = getGetPersonByIdMethod =
              io.grpc.MethodDescriptor.<PersonService.PersonGetRequest, PersonService.PersonProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPersonById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PersonService.PersonGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PersonService.PersonProto.getDefaultInstance()))
              .setSchemaDescriptor(new GetPersonUseCaseMethodDescriptorSupplier("getPersonById"))
              .build();
        }
      }
    }
    return getGetPersonByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetPersonUseCaseStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetPersonUseCaseStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetPersonUseCaseStub>() {
        @java.lang.Override
        public GetPersonUseCaseStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetPersonUseCaseStub(channel, callOptions);
        }
      };
    return GetPersonUseCaseStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetPersonUseCaseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetPersonUseCaseBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetPersonUseCaseBlockingStub>() {
        @java.lang.Override
        public GetPersonUseCaseBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetPersonUseCaseBlockingStub(channel, callOptions);
        }
      };
    return GetPersonUseCaseBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetPersonUseCaseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetPersonUseCaseFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetPersonUseCaseFutureStub>() {
        @java.lang.Override
        public GetPersonUseCaseFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetPersonUseCaseFutureStub(channel, callOptions);
        }
      };
    return GetPersonUseCaseFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getPerson(PersonService.PersonGetRequest request,
        io.grpc.stub.StreamObserver<PersonService.PersonProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPersonMethod(), responseObserver);
    }

    /**
     */
    default void getPersonById(PersonService.PersonGetRequest request,
        io.grpc.stub.StreamObserver<PersonService.PersonProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPersonByIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GetPersonUseCase.
   */
  public static abstract class GetPersonUseCaseImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GetPersonUseCaseGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GetPersonUseCase.
   */
  public static final class GetPersonUseCaseStub
      extends io.grpc.stub.AbstractAsyncStub<GetPersonUseCaseStub> {
    private GetPersonUseCaseStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetPersonUseCaseStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetPersonUseCaseStub(channel, callOptions);
    }

    /**
     */
    public void getPerson(PersonService.PersonGetRequest request,
        io.grpc.stub.StreamObserver<PersonService.PersonProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPersonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPersonById(PersonService.PersonGetRequest request,
        io.grpc.stub.StreamObserver<PersonService.PersonProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPersonByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GetPersonUseCase.
   */
  public static final class GetPersonUseCaseBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GetPersonUseCaseBlockingStub> {
    private GetPersonUseCaseBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetPersonUseCaseBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetPersonUseCaseBlockingStub(channel, callOptions);
    }

    /**
     */
    public PersonService.PersonProto getPerson(PersonService.PersonGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPersonMethod(), getCallOptions(), request);
    }

    /**
     */
    public PersonService.PersonProto getPersonById(PersonService.PersonGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPersonByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GetPersonUseCase.
   */
  public static final class GetPersonUseCaseFutureStub
      extends io.grpc.stub.AbstractFutureStub<GetPersonUseCaseFutureStub> {
    private GetPersonUseCaseFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetPersonUseCaseFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetPersonUseCaseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<PersonService.PersonProto> getPerson(
        PersonService.PersonGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPersonMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<PersonService.PersonProto> getPersonById(
        PersonService.PersonGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPersonByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PERSON = 0;
  private static final int METHODID_GET_PERSON_BY_ID = 1;

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
        case METHODID_GET_PERSON:
          serviceImpl.getPerson((PersonService.PersonGetRequest) request,
              (io.grpc.stub.StreamObserver<PersonService.PersonProto>) responseObserver);
          break;
        case METHODID_GET_PERSON_BY_ID:
          serviceImpl.getPersonById((PersonService.PersonGetRequest) request,
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
          getGetPersonMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              PersonService.PersonGetRequest,
              PersonService.PersonProto>(
                service, METHODID_GET_PERSON)))
        .addMethod(
          getGetPersonByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              PersonService.PersonGetRequest,
              PersonService.PersonProto>(
                service, METHODID_GET_PERSON_BY_ID)))
        .build();
  }

  private static abstract class GetPersonUseCaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GetPersonUseCaseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return PersonService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GetPersonUseCase");
    }
  }

  private static final class GetPersonUseCaseFileDescriptorSupplier
      extends GetPersonUseCaseBaseDescriptorSupplier {
    GetPersonUseCaseFileDescriptorSupplier() {}
  }

  private static final class GetPersonUseCaseMethodDescriptorSupplier
      extends GetPersonUseCaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GetPersonUseCaseMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GetPersonUseCaseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetPersonUseCaseFileDescriptorSupplier())
              .addMethod(getGetPersonMethod())
              .addMethod(getGetPersonByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}