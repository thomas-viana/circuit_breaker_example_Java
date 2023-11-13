import org.springframework.cloud.circuitbreaker.resilience4j.ReactiveResilience4JCircuitBreakerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class RemoteServiceController {

    private final RemoteService remoteService;

    public RemoteServiceController(RemoteService remoteService) {
        this.remoteService = remoteService;
    }

    @GetMapping("/invokeRemoteService")
    public Mono<String> invokeRemoteService() {
        return remoteService.callRemoteService();
    }
}
