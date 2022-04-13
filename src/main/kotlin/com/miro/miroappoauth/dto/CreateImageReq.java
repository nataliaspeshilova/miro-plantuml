package com.miro.miroappoauth.dto;

public class CreateImageReq {

    private ImageData data;
    private PositionDto position;

    public CreateImageReq setData(ImageData data) {
        this.data = data;
        return this;
    }

    public CreateImageReq setPosition(PositionDto position) {
        this.position = position;
        return this;
    }

    public ImageData getData() {
        return data;
    }

    public PositionDto getPosition() {
        return position;
    }

    public static class ImageData {
        private final String url;

        public ImageData(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }
    }
}
