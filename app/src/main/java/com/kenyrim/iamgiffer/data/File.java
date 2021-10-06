package com.kenyrim.iamgiffer.data;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class File {

@SerializedName("path")
@Expose
private String path;
@SerializedName("server")
@Expose
private String server;
@SerializedName("formats")
@Expose
private List<String> formats = null;
@SerializedName("id")
@Expose
private String id;

public String getPath() {
return path;
}

public void setPath(String path) {
this.path = path;
}

public File withPath(String path) {
this.path = path;
return this;
}

public String getServer() {
return server;
}

public void setServer(String server) {
this.server = server;
}

public File withServer(String server) {
this.server = server;
return this;
}

public List<String> getFormats() {
return formats;
}

public void setFormats(List<String> formats) {
this.formats = formats;
}

public File withFormats(List<String> formats) {
this.formats = formats;
return this;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public File withId(String id) {
this.id = id;
return this;
}

}