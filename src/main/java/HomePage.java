public class HomePage {
    static String url = "http://pluralsight.com";
    static String title = "Pluralsight | The tech workforce development company";

    public void goTo(){
        Browser.goTo(url);
    }

    public boolean isAt(){
        return Browser.title().equals(title);
      }

}
