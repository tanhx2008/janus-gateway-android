package computician.janusclientapi;

/**
 * Created by ben.trent on 6/25/2015.
 */
public class JanusMediaConstraints {

    public class JanusVideo {
        private int maxHeight, minHeight, maxWidth, minWidth, maxFramerate, minFramerate;
        public JanusVideo()
        {
            maxFramerate = 15;
            minFramerate = 0;
            maxHeight = 240;
            minHeight = 0;
            maxWidth = 320;
            minWidth = 0;
        }
        public int getMaxHeight() {
            return maxHeight;
        }

        public void setMaxHeight(int maxHeight) {
            this.maxHeight = maxHeight;
        }

        public int getMinHeight() {
            return minHeight;
        }

        public void setMinHeight(int minHeight) {
            this.minHeight = minHeight;
        }

        public int getMaxWidth() {
            return maxWidth;
        }

        public void setMaxWidth(int maxWidth) {
            this.maxWidth = maxWidth;
        }

        public int getMinWidth() {
            return minWidth;
        }

        public void setMinWidth(int minWidth) {
            this.minWidth = minWidth;
        }

        public int getMaxFramerate() {
            return maxFramerate;
        }

        public void setMaxFramerate(int maxFramerate) {
            this.maxFramerate = maxFramerate;
        }

        public int getMinFramerate() {
            return minFramerate;
        }

        public void setMinFramerate(int minFramerate) {
            this.minFramerate = minFramerate;
        }
    }

    public enum Camera{
        front,
        back
    }

    private Boolean sendAudio = true;
    private JanusVideo video = new JanusVideo();
    private Boolean recvVideo = true;
    private Boolean recvAudio = true;
    private Camera camera = Camera.front;

    public JanusMediaConstraints() { }

    public JanusVideo getVideo() {
        return video;
    }

    public Boolean getSendVideo() {
        return video != null;
    }

    public void setVideo(JanusVideo video) {
        this.video = video;
    }

    public Boolean getSendAudio() {
        return sendAudio;
    }

    public void setSendAudio(Boolean sendAudio) {
        this.sendAudio = sendAudio;
    }

    public void setRecvVideo(Boolean recvVideo) { this.recvVideo = recvVideo;}
    public Boolean getRecvVideo() { return recvVideo;}
    public void setRecvAudio(Boolean recvAudio) { this.recvAudio = recvAudio;}
    public Boolean getRecvAudio() { return recvAudio; }
    public Camera getCamera() { return camera;}
    public void setCamera(Camera camera) { this.camera = camera;}

}
