package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Destination implements Parcelable {
    private String name;
    private String location;
    private String description;
    private int imageResId;

    public Destination(String name, String location, String description, int imageResId) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.imageResId = imageResId;
    }

    protected Destination(Parcel in) {
        name = in.readString();
        location = in.readString();
        description = in.readString();
        imageResId = in.readInt();
    }

    public static final Creator<Destination> CREATOR = new Creator<Destination>() {
        @Override
        public Destination createFromParcel(Parcel in) {
            return new Destination(in);
        }

        @Override
        public Destination[] newArray(int size) {
            return new Destination[size];
        }
    };

    // Setter dan Getter untuk setiap atribut
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    // Implementasi Parcelable
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(location);
        dest.writeString(description);
        dest.writeInt(imageResId);
    }
}
