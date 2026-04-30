package streamCodingTest.common;
public class VisitLog {
    private final String userId, page; private final int seconds;
    public VisitLog(String userId, String page, int seconds){this.userId=userId;this.page=page;this.seconds=seconds;}
    public String getUserId(){return userId;} public String getPage(){return page;} public int getSeconds(){return seconds;}
}
