
package ma.emsi.yawina.bean;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import ma.emsi.yawina.service.GeminiService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("chatBean")
@SessionScoped
public class ChatBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private GeminiService geminiService;

    private String message = "";

    private final List<String> historique = new ArrayList<>();

    private transient GeminiService.Assistant assistant;

    private GeminiService.Assistant getAssistant() {
        if (assistant == null) {
            assistant = geminiService.creerAssistant(
                    geminiService.creerMemoire()
            );
        }
        return assistant;
    }

    public void envoyer() {
        if (message == null || message.isBlank()) {
            return;
        }

        String question = message.trim();
        historique.add("Vous : " + question);
        message = "";

        try {
            String reponse = getAssistant().chat(question);
            historique.add("Gemini : " + reponse);
        } catch (Exception e) {
            historique.add("Erreur Gemini : " + e.getMessage());
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getHistorique() {
        return historique;
    }
}
