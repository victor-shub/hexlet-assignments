package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        List<String> freeDomains = List.of("gmail.com", "yandex.ru", "hotmail.com");
        List<String> emailDomains = new ArrayList<>();
        for (var email: emails) {
            var beginIndex = email.indexOf("@") + 1;
            emailDomains.add(email.substring(beginIndex));
        }
        return emailDomains.stream()
                .filter(emailDomain -> freeDomains.contains(emailDomain))
                .count();
    }
}
// END
