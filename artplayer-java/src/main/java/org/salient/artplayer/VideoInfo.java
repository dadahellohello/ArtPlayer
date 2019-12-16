package org.salient.artplayer;

/**
 * 视频信息封装
 */
public class VideoInfo {

    /**
     * 播放地址
     */
    String url;

    /**
     * 标题
     */
    String title;

    /**
     * 封面
     */
    String frontCover;

    /**
     * 进度
     */
    int progress;

    /**
     * 亮度
     */
    int light;

    /**
     * 音量
     */
    int volume;

    /**
     * 缩放模式
     */
    ScaleType scaleType;

    /**
     * 播放状态
     */
    PlayerState playerState;

    /**
     * 窗口状态
     */
    WindowType windowType;
}
