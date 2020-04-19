package com.example.beatbox;

public class Sound {
    private String mAssetPath;
    private String mName;

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String fileName = components[components.length - 1];
        fileName = fileName.replace(".wav", "");
        components = fileName.split("__");
        mName = components[0] + "_" + components[components.length - 1];
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }
}
