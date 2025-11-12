package SocialShare;

public class SocialMediaFacade {
    private final Twitter twitter;
    private final Facebook facebook;
    private final LinkedIn linkedin;

    public SocialMediaFacade(Twitter twitter, Facebook facebook, LinkedIn linkedin) {
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedin = linkedin;
    }

    public void share(String message) {
        this.twitter.setMessage(message);
        this.facebook.setMessage(message);
        this.linkedin.setMessage(message);
        this.twitter.share();
        this.facebook.share();
        this.linkedin.share();
    }
}
