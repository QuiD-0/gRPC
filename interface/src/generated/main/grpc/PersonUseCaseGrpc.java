import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: personService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PersonUseCaseGrpc {

  private PersonUseCaseGrpc() {}

  public static final java.lang.String SERVICE_NAME = "PersonUseCase";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      PersonService.PersonProto> getGetPersonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPerson",
      requestType = com.google.protobuf.Empty.class,
      responseType = PersonService.PersonProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      PersonService.PersonProto> getGetPersonMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, PersonService.PersonProto> getGetPersonMethod;
    if ((getGetPersonMethod = PersonUseCaseGrpc.getGetPersonMethod) == null) {
      synchronized (PersonUseCaseGrpc.class) {
        if ((getGetPersonMethod = PersonUseCaseGrpc.getGetPersonMethod) == null) {
          PersonUseCaseGrpc.getGetPersonMethod = getGetPersonMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, PersonService.PersonProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PersonService.PersonProto.getDefaultInstance()))
              .setSchemaDescriptor(new PersonUseCaseMethodDescriptorSupplier("getPerson"))
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
    if ((getGetPersonByIdMethod = PersonUseCaseGrpc.getGetPersonByIdMethod) == null) {
      synchronized (PersonUseCaseGrpc.class) {
        if ((getGetPersonByIdMethod = PersonUseCaseGrpc.getGetPersonByIdMethod) == null) {
          PersonUseCaseGrpc.getGetPersonByIdMethod = getGetPersonByIdMethod =
              io.grpc.MethodDescriptor.<PersonService.PersonGetRequest, PersonService.PersonProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPersonById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PersonService.PersonGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PersonService.PersonProto.getDefaultInstance()))
              .setSchemaDescriptor(new PersonUseCaseMethodDescriptorSupplier("getPersonById"))
              .build();
        }
      }
    }
    return getGetPersonByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<PersonService.PersonCreateRequest,
      com.google.protobuf.Empty> getCreatePersonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createPerson",
      requestType = PersonService.PersonCreateRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<PersonService.PersonCreateRequest,
      com.google.protobuf.Empty> getCreatePersonMethod() {
    io.grpc.MethodDescriptor<PersonService.PersonCreateRequest, com.google.protobuf.Empty> getCreatePersonMethod;
    if ((getCreatePersonMethod = PersonUseCaseGrpc.getCreatePersonMethod) == null) {
      synchronized (PersonUseCaseGrpc.class) {
        if ((getCreatePersonMethod = PersonUseCaseGrpc.getCreatePersonMethod) == null) {
          PersonUseCaseGrpc.getCreatePersonMethod = getCreatePersonMethod =
              io.grpc.MethodDescriptor.<PersonService.PersonCreateRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createPerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PersonService.PersonCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new PersonUseCaseMethodDescriptorSupplier("createPerson"))
              .build();
        }
      }
    }
    return getCreatePersonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<PersonService.PersonDeleteRequest,
      com.google.protobuf.Empty> getDeletePersonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deletePerson",
      requestType = PersonService.PersonDeleteRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<PersonService.PersonDeleteRequest,
      com.google.protobuf.Empty> getDeletePersonMethod() {
    io.grpc.MethodDescriptor<PersonService.PersonDeleteRequest, com.google.protobuf.Empty> getDeletePersonMethod;
    if ((getDeletePersonMethod = PersonUseCaseGrpc.getDeletePersonMethod) == null) {
      synchronized (PersonUseCaseGrpc.class) {
        if ((getDeletePersonMethod = PersonUseCaseGrpc.getDeletePersonMethod) == null) {
          PersonUseCaseGrpc.getDeletePersonMethod = getDeletePersonMethod =
              io.grpc.MethodDescriptor.<PersonService.PersonDeleteRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deletePerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PersonService.PersonDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new PersonUseCaseMethodDescriptorSupplier("deletePerson"))
              .build();
        }
      }
    }
    return getDeletePersonMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonUseCaseStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PersonUseCaseStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PersonUseCaseStub>() {
        @java.lang.Override
        public PersonUseCaseStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PersonUseCaseStub(channel, callOptions);
        }
      };
    return PersonUseCaseStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonUseCaseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PersonUseCaseBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PersonUseCaseBlockingStub>() {
        @java.lang.Override
        public PersonUseCaseBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PersonUseCaseBlockingStub(channel, callOptions);
        }
      };
    return PersonUseCaseBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersonUseCaseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PersonUseCaseFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PersonUseCaseFutureStub>() {
        @java.lang.Override
        public PersonUseCaseFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PersonUseCaseFutureStub(channel, callOptions);
        }
      };
    return PersonUseCaseFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getPerson(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<PersonService.PersonProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPersonMethod(), responseObserver);
    }

    /**
     */
    default void getPersonById(PersonService.PersonGetRequest request,
        io.grpc.stub.StreamObserver<PersonService.PersonProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPersonByIdMethod(), responseObserver);
    }

    /**
     */
    default void createPerson(PersonService.PersonCreateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePersonMethod(), responseObserver);
    }

    /**
     */
    default void deletePerson(PersonService.PersonDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePersonMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PersonUseCase.
   */
  public static abstract class PersonUseCaseImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PersonUseCaseGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PersonUseCase.
   */
  public static final class PersonUseCaseStub
      extends io.grpc.stub.AbstractAsyncStub<PersonUseCaseStub> {
    private PersonUseCaseStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonUseCaseStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PersonUseCaseStub(channel, callOptions);
    }

    /**
     */
    public void getPerson(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<PersonService.PersonProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetPersonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPersonById(PersonService.PersonGetRequest request,
        io.grpc.stub.StreamObserver<PersonService.PersonProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPersonByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPerson(PersonService.PersonCreateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePersonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePerson(PersonService.PersonDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePersonMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PersonUseCase.
   */
  public static final class PersonUseCaseBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PersonUseCaseBlockingStub> {
    private PersonUseCaseBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonUseCaseBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PersonUseCaseBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<PersonService.PersonProto> getPerson(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetPersonMethod(), getCallOptions(), request);
    }

    /**
     */
    public PersonService.PersonProto getPersonById(PersonService.PersonGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPersonByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty createPerson(PersonService.PersonCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePersonMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deletePerson(PersonService.PersonDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePersonMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PersonUseCase.
   */
  public static final class PersonUseCaseFutureStub
      extends io.grpc.stub.AbstractFutureStub<PersonUseCaseFutureStub> {
    private PersonUseCaseFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonUseCaseFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PersonUseCaseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<PersonService.PersonProto> getPersonById(
        PersonService.PersonGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPersonByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createPerson(
        PersonService.PersonCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePersonMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deletePerson(
        PersonService.PersonDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePersonMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PERSON = 0;
  private static final int METHODID_GET_PERSON_BY_ID = 1;
  private static final int METHODID_CREATE_PERSON = 2;
  private static final int METHODID_DELETE_PERSON = 3;

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
          serviceImpl.getPerson((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<PersonService.PersonProto>) responseObserver);
          break;
        case METHODID_GET_PERSON_BY_ID:
          serviceImpl.getPersonById((PersonService.PersonGetRequest) request,
              (io.grpc.stub.StreamObserver<PersonService.PersonProto>) responseObserver);
          break;
        case METHODID_CREATE_PERSON:
          serviceImpl.createPerson((PersonService.PersonCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_PERSON:
          serviceImpl.deletePerson((PersonService.PersonDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              PersonService.PersonProto>(
                service, METHODID_GET_PERSON)))
        .addMethod(
          getGetPersonByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              PersonService.PersonGetRequest,
              PersonService.PersonProto>(
                service, METHODID_GET_PERSON_BY_ID)))
        .addMethod(
          getCreatePersonMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              PersonService.PersonCreateRequest,
              com.google.protobuf.Empty>(
                service, METHODID_CREATE_PERSON)))
        .addMethod(
          getDeletePersonMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              PersonService.PersonDeleteRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_PERSON)))
        .build();
  }

  private static abstract class PersonUseCaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersonUseCaseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return PersonService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PersonUseCase");
    }
  }

  private static final class PersonUseCaseFileDescriptorSupplier
      extends PersonUseCaseBaseDescriptorSupplier {
    PersonUseCaseFileDescriptorSupplier() {}
  }

  private static final class PersonUseCaseMethodDescriptorSupplier
      extends PersonUseCaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PersonUseCaseMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PersonUseCaseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersonUseCaseFileDescriptorSupplier())
              .addMethod(getGetPersonMethod())
              .addMethod(getGetPersonByIdMethod())
              .addMethod(getCreatePersonMethod())
              .addMethod(getDeletePersonMethod())
              .build();
        }
      }
    }
    return result;
  }
}
