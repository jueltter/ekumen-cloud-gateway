package ec.dev.samagua.ekumen_cloud_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EkumenCloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EkumenCloudGatewayApplication.class, args);
    }

}
