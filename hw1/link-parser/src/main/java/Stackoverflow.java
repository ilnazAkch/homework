import java.util.regex.*;
class Stackoverflow extends Link {
    public String parse(String url) {
        Pattern pattern = Pattern.compile("https://stackoverflow.com/questions/(\\d+)/?");
        Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            return "Id вопроса: "+ matcher.group(1);
        } else {
            return super.parse(url);
        }
    }
}