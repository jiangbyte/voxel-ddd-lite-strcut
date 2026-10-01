# Voxel DDD Lite Struct

![JDK](https://img.shields.io/badge/JDK-21-007396?logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1-6DB33F?logo=springboot&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green)

**Voxel DDD Lite Struct** 是按 DDD skill 七层规范生成的**纯骨架**：`types / api / domain / infrastructure / case / trigger / app`，仅含 `package-info` 与可空启动入口。中间件依赖与配置默认**注释**，无运行时 `enabled` 开关。

## 目录

- [工程结构](#工程结构)
- [快速开始](#快速开始)
- [License](#license)

## 工程结构

```text
voxel-ddd-lite-strcut/
├── voxel-ddd-lite-types/
├── voxel-ddd-lite-api/
├── voxel-ddd-lite-domain/
├── voxel-ddd-lite-infrastructure/
├── voxel-ddd-lite-case/
├── voxel-ddd-lite-trigger/
└── voxel-ddd-lite-app/
```

依赖：`Trigger → API → Case → Domain ← Infrastructure`。

启用 MySQL / Redis / JWT / S3 / Milvus / Spring AI：取消父 POM、`infrastructure` 依赖与 `application.yml` 中对应注释块，并补齐实现类（可参考同工作区 `voxel-ddd-lite`）。

## 快速开始

```bash
mvn clean package -DskipTests
java -jar voxel-ddd-lite-app/target/voxel-ddd-lite-app-1.0-SNAPSHOT.jar
```

文档页：http://localhost:8080/doc.html

## License

本项目基于 MIT License 开源。
