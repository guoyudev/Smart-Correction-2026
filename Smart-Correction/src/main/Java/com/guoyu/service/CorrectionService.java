```java
package com.guoyu.service;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;
import reactor.core.publisher.Flux;

@AiService
public interface CorrectionService {

    @SystemMessage("你是一个专业的作业批改助手。请严格按照标准答案对学生的作业进行判分，并给出详细的错因分析。")
    Flux<String> correctHomework(@UserMessage String studentAnswer, @UserMessage String standardAnswer);
}
```