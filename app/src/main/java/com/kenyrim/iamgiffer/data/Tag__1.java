package com.kenyrim.iamgiffer.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tag__1 {

@SerializedName("id")
@Expose
private String id;

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public Tag__1 withId(String id) {
this.id = id;
return this;
}

}