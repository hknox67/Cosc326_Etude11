public class VideoManagerApp {
    public static void main(String[] args) {
        VideoClip video1 = new VideoClip("Home video");
        VideoClip video2 = new VideoClip("Pauls Birthday");
        VideoClip video3 = new VideoClip("All Blacks vs South Africa");

        VideoManager manager1 = VideoManager.getVideoClipManager();
        VideoManager manager2 = VideoManager.getVideoClipManager();


        manager1.addVideoClip(video1);
        manager1.addVideoClip(video2);
        manager1.addVideoClip(video3);
        System.out.println("Manager 1: " + manager1.getVideoClipCollection());

        manager2.addVideoClip(video1);


        System.out.println("Manager 1: " + manager1.getVideoClipCollection());
        // As you can see manager2 references the same instance as manager
        //This could be the source of bugs and/or confusion
        System.out.println("manager 2: " + manager2.getVideoClipCollection());

        manager1.removeVideoClip(video1);

        System.out.println("Manager 1: " +manager1.getVideoClipCollection());
        // As you can see it is essentially the same manager

        System.out.println("manager 2: " + manager2.getVideoClipCollection());
    }

}
