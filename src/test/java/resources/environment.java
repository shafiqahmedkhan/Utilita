package resources;

public enum environment {

    HOMEPAGE("https://utilita.co.uk/"),
    HELPPAGE(HOMEPAGE + "/help"),
    CUSTREFNOPAGE(HOMEPAGE + "help/find-your-customer-reference-number");


    private String url;
    environment(String page) {
        this.url = page;
    }

    public String getUrl(){
        return url;
    }

}
