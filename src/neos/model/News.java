package neos.model;

public class News {
    private String title;
    private String linkDetail;
    private String imgLink;
    private String date;

    public News(String title, String linkDetail, String imgLink, String date) {
        this.title = title;
        this.linkDetail = linkDetail;
        this.imgLink = imgLink;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getLinkDetail() {
        return linkDetail;
    }

    public String getImgLink() {
        return imgLink;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n" +
                "Link Detail: " + linkDetail + "\n" +
                "Image Link: " + imgLink + "\n" +
                "Date: " + date;
    }
}
