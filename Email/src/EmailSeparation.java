import java.util.HashMap;
import java.util.Map;

public class EmailSeparation {
    public static void main(String[] args) {
        String[] emails = {
                "abc@gmail.com", "def@gmail.com",
                "abc@yahoo.com", "def@yahoo.com",
                "abc@outlook.com", "def@outlook.com"
        };

        // Create a HashMap to store email addresses by domain
        Map<String, StringBuilder> emailMap = new HashMap<>();

        // Initialize StringBuilder objects for each domain
        emailMap.put("gmail.com", new StringBuilder());
        emailMap.put("yahoo.com", new StringBuilder());
        emailMap.put("outlook.com", new StringBuilder());

        // Separate email addresses by domain
        for (String email : emails) {
            String domain = email.substring(email.indexOf('@') + 1);
            if (emailMap.containsKey(domain)) {
                emailMap.get(domain).append(email).append("\n");
            }
        }

        // Print email addresses by domain
        for (Map.Entry<String, StringBuilder> entry : emailMap.entrySet()) {
            String domain = entry.getKey();
            StringBuilder emailsForDomain = entry.getValue();
            System.out.println("Emails for " + domain + ":");
            System.out.println(emailsForDomain);
        }
    }
}