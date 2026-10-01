package io.github.jiangbyte.voxel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * DDD 七层纯骨架启动入口（默认不连库）。
 */
@SpringBootApplication(scanBasePackages = "io.github.jiangbyte.voxel")
public class VoxelDddLiteStrcutApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoxelDddLiteStrcutApplication.class, args);
    }
}
