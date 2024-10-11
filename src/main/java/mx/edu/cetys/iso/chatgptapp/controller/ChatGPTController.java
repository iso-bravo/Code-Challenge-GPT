package mx.edu.cetys.iso.chatgptapp.controller;

import mx.edu.cetys.iso.chatgptapp.model.ChatInteraction;
import mx.edu.cetys.iso.chatgptapp.service.ChatGPTService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatGPTController {

    private final ChatGPTService chatGPTService;

    public ChatGPTController(ChatGPTService chatGPTService) {
        this.chatGPTService = chatGPTService;
    }

    @PostMapping("/prompt")
    public ChatInteraction sendPrompt(@RequestParam String prompt) throws Exception {
        return chatGPTService.sendPrompt(prompt);
    }
}
