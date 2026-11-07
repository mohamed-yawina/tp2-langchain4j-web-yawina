
package ma.emsi.yawina.service;

import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.google.genai.GoogleGenAiChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GeminiService {

    private ChatModel model;

    public interface Assistant {
        String chat(String message);
    }

    private synchronized ChatModel getModel() {
        if (model == null) {
            String apiKey = System.getenv("GEMINI_KEY");

            if (apiKey == null || apiKey.isBlank()) {
                throw new IllegalStateException(
                        "La variable GEMINI_KEY est absente."
                );
            }

            model = GoogleGenAiChatModel.builder()
                    .apiKey(apiKey)
                    .modelName("gemini-3.5-flash-lite")
                    .build();
        }

        return model;
    }

    public Assistant creerAssistant(ChatMemory memory) {
        return AiServices.builder(Assistant.class)
                .chatModel(getModel())
                .chatMemory(memory)
                .build();
    }

    public ChatMemory creerMemoire() {
        return MessageWindowChatMemory.withMaxMessages(20);
    }
}
