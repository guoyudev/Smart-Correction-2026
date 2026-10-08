
# 智批帮 (Smart-Correction)

面向高校/培训机构的 AI 智能作业批改系统，集成 OCR 识别、大模型判题与错因分析功能，降低教师重复劳动、提升作业反馈效率。

## 🛠️ 技术栈
- 后端：Java 17, Spring Boot 3.2, LangChain4j 0.31
- 大模型：OpenAI GPT-3.5 / DeepSeek API
- 通信协议：SSE (Server-Sent Events) 流式返回
- 部署：Docker, Docker Compose

## ✨ 核心功能
- **智能判题**：调用大模型 API 实现主观题智能判题与步骤打分。
- **防幻觉设计**：采用“标准答案参考 + 分步提示词”双重 Prompt 架构。
- **流式返回**：支持结果 SSE 流式实时返回，提升用户体验。
- **安全防护**：通过 8 条正则规则检测 Prompt 注入并实现 PII 自动脱敏。

## 🚀 快速开始
1. 配置环境变量 `OPENAI_API_KEY`。
2. 运行 `mvn spring-boot:run` 启动项目。
3. 调用接口 `POST /api/correction/stream`，传入学生答案和标准答案进行判题。
