import java.util.ArrayList;
import java.util.Collection;

public class VideoManager {

    private Collection<VideoClip> videoClips = new ArrayList<VideoClip>();
    private static VideoManager videoManager;

    /**Replacement for the default constructor */
    public VideoManager (){};

    /**
     * Mutator Method
     * Method to add a video to the Collection of Videos
     * @param videoClip to be added to collection
     */
    public void addVideoClip(VideoClip videoClip) {
        videoClips.add(videoClip);
    }

    /**
     * Mutator method 
     * Method to remove a video clip from the collection of Video Clips
     * @param videoClip the video to be removed
     */
    public void removeVideoClip(VideoClip videoClip) {
        videoClips.remove(videoClip);
    }


    /**
     * Accessor Method
     * Method to access/return the collection of video clips
     * @return the collecton of video clips
     */
    public String getVideoClipCollection() {
        String names = "\n";
        for (VideoClip videoClip : videoClips) {
            names += videoClip.getName() + "\n";
        }
        return names;
    }

    /**
     * Accessor Method
     * Method to access/return a vidoe clip manager
     * 
     * To ensure that there is only one instance of videoManger we only create a new VideoManager
     * If videoManager is NULL.
     * 
     * @return the video clip manager
     */
    public static VideoManager getVideoClipManager() {
        //Check to see if a video manager already exists
        if (videoManager == null) {
            videoManager = new VideoManager();
        }
        return videoManager;
    }

}
