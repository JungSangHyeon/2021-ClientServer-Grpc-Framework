
public class ServerMain {

    public static void main(String[] args) {
        DataStub dataClient = new DataStub("localhost", 8081);
        new ServerSkeleton(dataClient).start(8080);
    }
}
