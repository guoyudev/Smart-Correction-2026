```java
package com.guoyu.controller;

import com.guoyu.service.CorrectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/correction")
public class CorrectionController {

    @Autowired
    private CorrectionService correctionService;

    @PostMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> streamCorrection(@RequestParam String studentAnswer, @RequestParam String standardAnswer) {
        return correctionService.correctHomework(studentAnswer, standardAnswer);
    }
}
```