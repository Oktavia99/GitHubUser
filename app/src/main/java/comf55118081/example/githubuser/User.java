package comf55118081.example.githubuser;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.recyclerview.widget.LinearLayoutManager;

public class User implements Parcelable {
    private String photo;
    private String name;
    private String type;

    public User() {

    }

    protected User(Parcel in) {
        photo = in.readString();
        name = in.readString();
        type = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public static void setLayoutManager(LinearLayoutManager linearLayoutManager) {
    }

    public static void setAdapter(UserAdapter userAdapter) {
    }

    public String getType() { return type; }
    public String getName() { return name; }
    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }
    public void setName(String name) { this.name = name; }
    public void setType(String type) { this.type = type; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(photo);
        parcel.writeString(name);
        parcel.writeString(type);
    }
}