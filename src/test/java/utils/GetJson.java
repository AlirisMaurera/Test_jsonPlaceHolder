package utils;

public class GetJson {

    public String createJson(String title, String body, int userId) {
        String json = "{\"title\":\"" + title + "\",\"body\":\"" + body + "\",\"userId\":\"" + userId + "\"}";
        return json;
    }
    public String createJsonPatch(String title) {
        String json = "{\"title\":\"" + title + "\"}";
        return json;
    }
}