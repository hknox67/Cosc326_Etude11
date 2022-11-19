import java.awt.Image;

public class VideoClip {
    private String videoName;
    private String videoDescription;
    private Image previewImg;
    private float fps;
    /**
     * Default Constructor
     */
    public VideoClip() {
    }
    
    public VideoClip(String videoName) {
        this.videoName = videoName;
    }

    public String getName() {
        return videoName;
    }

    public void deleteImg() {
        previewImg = null;
    }
}
