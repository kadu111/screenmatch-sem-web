package br.com.teste.screenmatch.service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import io.github.cdimascio.dotenv.Dotenv;

public class ConsultaGemini {
    private static final Dotenv dotenv = Dotenv.load();
    private static final String CHAVE = dotenv.get("AI_CHAT_API_KEY");

    public static String obterTraducao(String texto) {

        Client client = Client.builder().apiKey(CHAVE).build();;

        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.0-flash",
                        "Apenas traduza, sem me dizer nada alem disso, o seguinte trecho: " + texto,
                        null);

        return response.text();
    }
}